create table memberDB (
	name varchar(16) not null,
	id varchar(15) not null primary key,
	pw varchar(15) not null,
	tel varchar(11) not null,
	address varchar(10) not null,
	email varchar(16) not null,
	birth date not null,
	age int,
	sex char(2)
);

select * from memberDB;