# Build
FROM maven:3.8.6-amazoncorretto-17 AS lebontroc-build
ENV LEBONTROC_HOME /opt/lebontroc
WORKDIR $LEBONTROC_HOME
COPY pom.xml .
COPY src ./src
RUN mvn package -DskipTests

# Run
FROM amazoncorretto:19
ENV LEBONTROC_HOME /opt/lebontroc
WORKDIR $LEBONTROC_HOME
COPY --from=lebontroc-build $LEBONTROC_HOME/target/*.jar $LEBONTROC_HOME/lebontroc.jar

ENTRYPOINT java -jar lebontroc.jar