insert into Author(name) values ('Федор Михайлович Достоевский');
insert into Author(name) values ('Михаил Афанасьевич  Булгаков');
insert into Author(name) values ('Николай Николаевич  Носов');
insert into Author(name) values ('Стругацкий Аркадий');
insert into Author(name) values ('Никола́й Васи́льевич  Гоголь');

insert into Publisher(name, publisher_Address,yearOfPub ) values ('ЭКСМО', '123308, г. Москва, ул. Зорге, д.1, стр.1', '2020');
insert into Publisher(name, publisher_Address,yearOfPub ) values ('РОСМЭН', '127521, г. Москва, ул. Шереметьевская, д. 47', '2019');
insert into Publisher(name, publisher_Address,yearOfPub ) values ('АЛЬФА – КНИГА', '125565, Москва, а/я 4', '2021');


insert into Book(name, author_Id, publisher_Id) values ('Вечера на хуторе близ Диканьки', 5, 3 );
insert into Book(name, author_Id, publisher_Id) values ('Идиот', 1, 1);
insert into Book(name, author_Id, publisher_Id) values ('Мастер и Маргарита', 2, 3);
insert into Book(name, author_Id, publisher_Id) values ('Незнайка на луне', 3, 2);
insert into Book(name, author_Id, publisher_Id) values ('Пикник на обочине', 4, 2);
insert into Book(name, author_Id, publisher_Id) values ('Бесы', 1, 1);
insert into Book(name, author_Id, publisher_Id) values ('Собачье сердце', 2, 3);
insert into Book(name, author_Id, publisher_Id) values ('Братья Карамазовы', 1, 3);
insert into Book(name, author_Id, publisher_Id) values ('Трудно быть богом', 4, 2);
insert into Book(name, author_Id, publisher_Id) values ('Ревизор', 5, 1);

insert into Customer(name, surname, customer_Address, customer_Phone, customer_email) values ('Алена', 'Петрова', 'Минск,ул. Казинца 34, кв 32', '80297546372','alena@gmail.com');
insert into Customer(name, surname, customer_Address, customer_Phone, customer_email) values ('Василий', 'Иванов', 'Минск,ул. Пушкина 52, кв 49', '80297654920', 'vasiliy@gmail.com');
insert into Customer(name, surname, customer_Address, customer_Phone, customer_email) values ('Алекс', 'Киров', 'Минск,ул. Сурганова 100, кв 21', '80297546398', 'alex@gmail.com');
insert into Customer(name, surname, customer_Address, customer_Phone, customer_email) values ('Сергей', 'Машеров', 'Минск,ул. Якуба Коласа 39, кв 7', '80293654312', 'sergey@gmail.com');
insert into Customer(name, surname, customer_Address, customer_Phone, customer_email) values ('Ольга', 'Купцова', 'Минск,ул. Карбышева 11, кв 5 ', '80297345278','olga@gmail.com');


insert into Suppliers(suppliers_Name, suppliers_phone) values ('Аспект-Бел', '80297456328');
insert into Suppliers(suppliers_Name, suppliers_phone) values ('ДАЛИРАмаркет', '80296243155');
insert into Suppliers(suppliers_Name, suppliers_phone) values ('Букинист', '80295777337');


insert into Orders(customer_Id, book_Id, Count, dateOfOrder ) values (1, 1, 2, '2020-12-03');
insert into Orders(customer_Id, book_Id, Count, dateOfOrder ) values (2, 2, 1, '2020-10-25');
insert into Orders(customer_Id, book_Id, Count, dateOfOrder ) values (3, 3, 5, '2020-11-14');
insert into Orders(customer_Id, book_Id, Count, dateOfOrder ) values (4, 5, 1, '2020-12-15');
insert into Orders(customer_Id, book_Id, Count, dateOfOrder ) values (5, 5, 3, '2020-10-01');


insert into Incoming(book_Id, suppliers_Id, count_Incom, price) values (1, 1, 10, 32.09);
insert into Incoming(book_Id, suppliers_Id, count_Incom, price) values (2, 1, 25, 44.07);
insert into Incoming(book_Id, suppliers_Id, count_Incom, price) values (3, 3, 30, 52.00);
insert into Incoming(book_Id, suppliers_Id, count_Incom, price) values (4, 3, 15, 55.01);
insert into Incoming(book_Id, suppliers_Id, count_Incom, price) values (5, 2, 24, 33.07);
insert into Incoming(book_Id, suppliers_Id, count_Incom, price) values (6, 2, 45, 43.09);
insert into Incoming(book_Id, suppliers_Id, count_Incom, price) values (7, 1, 33, 32.05);
insert into Incoming(book_Id, suppliers_Id, count_Incom, price) values (8, 3, 10, 65.08);
insert into Incoming(book_Id, suppliers_Id, count_Incom, price) values (9, 2, 25, 44.02);
insert into Incoming(book_Id, suppliers_Id, count_Incom, price) values (10, 2, 50, 15.00);





  
