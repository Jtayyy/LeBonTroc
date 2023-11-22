drop table users;
drop table objects;
drop table posts;
drop table favorite_posts;

create table users
(
    id SERIAL PRIMARY KEY,
    firstname TEXT not null,
    lastname TEXT not null,
    pseudo TEXT not null,
    password TEXT not null,
    email TEXT not null,
    birthdate date not null,
    address TEXT not null,
    admin bool not null
);

create table objects
(
    id SERIAL PRIMARY KEY,
    user_id int not null,
    name TEXT not null,
    image TEXT not null,
    description TEXT not null,
    condition TEXT not null,
    type TEXT not null,
    value int not null
);

create table posts
(
    id SERIAL PRIMARY KEY,
    object_id int not null,
    title TEXT not null,
    publication date not null,
    description TEXT not null,
    address TEXT not null
);

create table favorite_posts
(
    id SERIAL PRIMARY KEY,
    user_id int not null,
    post_id int not null
);

INSERT INTO users (id, firstname, lastname, pseudo, password, email, birthdate, address, admin) VALUES (1, 'Alain', 'Chabat', 'alou','1234','alou@gmail.com', '1956-02-14', '29 avenue de la République 75002 Paris', false);
INSERT INTO users (id, firstname, lastname, pseudo, password, email, birthdate, address, admin) VALUES (2, 'Bernard', 'Taris', 'beber','azerty', 'beber@gmail.com', '1965-02-14', '12 rue du vieux port 13400 Mareille', false);
INSERT INTO users (id, firstname, lastname, pseudo, password, email, birthdate, address, admin) VALUES (3, 'Pepe', 'Gouinafier', 'leP','a1234', 'leP@gmail.com', '2001-02-03', '15 rue Ampere 92120 Clamart', true);

INSERT INTO objects (id, user_id, name, image, description, condition, type, value) VALUES (1, 1, 'Trottinette', 'Trottinette', 'UNE TRES BELLE TROTTINETTE', 'neuf', 'Transport',100);
INSERT INTO objects (id, user_id, name, image, description, condition, type, value) VALUES (2, 1, 'Velo', 'Velo', 'Un vélo pas si beau', 'usage', 'Transport',120);
INSERT INTO objects (id, user_id, name, image, description, condition, type, value) VALUES (3, 2, 'Armoire à chaussettes', 'Armoire', 'Ma bonne vieille armoire à chaussettes', 'presque_neuf', 'Meuble',70);

INSERT INTO posts (id, object_id, title, publication, description, address) VALUES (1, 2, 'Echange vélo fonctionnel', '2023-10-09', 'Echange mon vélo acheté en 2021, par pitié prenez-le il est maudis', '29 avenue de la République 75002 Paris');

INSERT INTO favorite_posts(id, user_id, post_id) VALUES (1, 3, 1);