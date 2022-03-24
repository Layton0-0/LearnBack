create table productDB(
	pdCode int auto_increment not null primary key,
	pdName varchar(10) not null,
	pdPrice int not null,
	pdStock int not null,
	pdDetail varchar(300),
);

select * from productDB;

drop table productDB;

alter table productDB drop pdImg;
alter table productDB drop pdThumbImg;