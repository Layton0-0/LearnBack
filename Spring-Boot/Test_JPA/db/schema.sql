create table book(
	ID int auto_increment primary key,
    TITLE varchar(255) not null
    );
    
insert into book(title) values('Getting Start Java');
insert into book(title) values('Getting String Spring');
insert into book(title) values('Getting String Web');

select * from book;

delete from book where title like "Getting%";
delete from book where title="getting";