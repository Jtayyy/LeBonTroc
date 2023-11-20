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
    type TEXT not null
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

create table favorites
(
    id SERIAL PRIMARY KEY,
    user_id int not null,
    post_id int not null
)