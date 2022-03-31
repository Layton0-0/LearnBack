create table mUser(
userId int(11) primary key,
password varchar(10),
userName varchar(10),
age int(11),
role varchar(10));

insert into mUser values(1, '111', 'hong', 24, 'admin');
insert into mUser values(2, '222', 'jung', 25, 'general');
insert into mUser values(3, '333', 'park', 26, 'general');

select * from mUser;