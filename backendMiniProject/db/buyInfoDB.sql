create table buyInfoDB(
	buyCode int auto_increment not null primary key,
	buyDate timestamp not null,
	
	userId varchar(15) not null,

	pdCode int not null,

	foreign key(userId) references memberDB(id),
	foreign key(pdCode) references productDB(pdCode)
);

drop table buyInfoDB;