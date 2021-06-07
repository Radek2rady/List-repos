-- TODO Application --

create database TODOApplication;

use todoapplication;

create table todo (
TaskID int not null auto_increment primary key,
NameTaks varchar(50)
);

create table Doing (
TaskID int(10)
);

create table Review (
TaskID int(10)
);

create table Done (
TaskID int(10)
);

insert into todo(NameTaks) value ('Print usage');
insert into todo(NameTaks) value ('List tasks');
insert into todo(NameTaks) value ('Empty list');
insert into todo(NameTaks) value ('Add new task');