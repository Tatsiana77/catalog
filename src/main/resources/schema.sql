create table Author
(
    id   integer not null auto_increment,
    name varchar(255),
    PRIMARY KEY (id)
);

create table Publisher
(
    id                integer not null auto_increment,
    name              varchar(255),
    publisher_Address varchar(255),
    yearOfPub         YEAR,
    PRIMARY KEY (id)

);

create table Book
(
    id           integer not null auto_increment,
    name         varchar(255),
    author_id    integer,
    publisher_id integer,
    PRIMARY KEY (id),
    FOREIGN KEY (author_id) references Author (id),
    FOREIGN KEY (publisher_id) references Publisher (id)

);
create table Customer
(
    id               Integer not null auto_increment,
    name             varchar(255),
    surname          varchar(255),
    customer_Address varchar(255),
    customer_Phone   varchar(255),
    customer_email   varchar(255),
    PRIMARY KEY (id)
);


create table Suppliers
(
    id              Integer not null auto_increment,
    suppliers_Name  varchar(255),
    suppliers_Phone varchar(255),
    PRIMARY KEY (id)
);

create table Orders
(
    id          Integer not null auto_increment,
    customer_Id Integer,
    book_Id     Integer,
    countOrders Integer,
    dateOfOrder DATE,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_Id) references Customer (id),
    FOREIGN KEY (book_Id) references Book (id)
);

create table Incoming
(
    id           Integer not null auto_increment,
    book_Id      Integer,
    suppliers_Id Integer,
    count_Incom  Integer,
    price        DECIMAL,
    PRIMARY KEY (id),
    FOREIGN key (book_Id) references Book (id),
    FOREIGN key (suppliers_Id) references Suppliers (id)
);

