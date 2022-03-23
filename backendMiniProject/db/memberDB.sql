create table memberDB (
	name varchar(16) not null,
	id varchar(15) not null primary key,
	pw varchar(15) not null,
	tel varchar(11) not null,
	address varchar(10) not null,
	email varchar(16) not null,
	birth date not null,
	age int,
	sex varchar(2)
);

insert into memberDB(name, id, pw, tel, address, email, birth, age, sex) values("yoon", "yesyes", "1121", "00000000000", "Seoul", "abc@abc.com", "2020-02-20", "22", "w");

select * from memberDB;

drop table memberDB;