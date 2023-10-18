drop table users;
drop table objects;
drop table posts;

create table users
(
    id SERIAL PRIMARY KEY,
    firstname TEXT not null,
    lastname TEXT not null,
    pseudo TEXT not null,
    email TEXT not null,
    birthdate date not null,
    adresse TEXT not null,
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
    type TEXT not null
);

create table posts
(
    id SERIAL PRIMARY KEY,
    object_id int not null,
    title TEXT not null,
    publication date not null,
    description TEXT not null,
    adresse TEXT not null
);

INSERT INTO users (id, firstname, lastname, pseudo, email, birthdate, adresse, admin) VALUES (1, 'Alain', 'Chabat', 'alou', 'alou@gmail.com', '1956-02-14', '29 avenue de la République 75002 Paris', false);
INSERT INTO users (id, firstname, lastname, pseudo, email, birthdate, adresse, admin) VALUES (2, 'Bernard', 'Taris', 'beber', 'beber@gmail.com', '1965-02-14', '12 rue du vieux port 13400 Mareille', false);
INSERT INTO users (id, firstname, lastname, pseudo, email, birthdate, adresse, admin) VALUES (3, 'Pepe', 'Gouinafier', 'leP', 'leP@gmail.com', '2001-02-03', '15 rue Ampere 92120 Clamart', true);

INSERT INTO objects (id, user_id, name, image, description, condition, type) VALUES (1, 1, 'Trottinette', 'Trottinette', 'UNE TRES BELLE TROTTINETTE', 'neuf', 'Transport');
INSERT INTO objects (id, user_id, name, image, description, condition, type) VALUES (2, 1, 'Velo', 'Velo', 'Un vélo pas si beau', 'usage', 'Transport');
INSERT INTO objects (id, user_id, name, image, description, condition, type) VALUES (3, 2, 'Armoire à chaussettes', 'Armoire', 'Ma bonne vieille armoire à chaussettes', 'presque_neuf', 'Meuble');

INSERT INTO posts (id, object_id, title, publication, description, adresse) VALUES (1, 2, 'Echange vélo fonctionnel', '2023-10-09', 'Echange mon vélo acheté en 2021, par pitié prenez-le il est maudis', '29 avenue de la République 75002 Paris');