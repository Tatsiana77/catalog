create table author
(
    id   integer not null auto_increment,
    name varchar(255),
    primary key (id)
);

create table book
(
    id   integer not null auto_increment,
    name varchar(255),
    author_id integer,
    primary key (id),
    Foreign key(author_id) references author(id)

);

