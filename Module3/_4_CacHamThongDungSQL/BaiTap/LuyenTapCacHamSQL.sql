drop database if exists lop;
create database lop;

use lop;

create table danhsachlop(
id int primary key auto_increment,
ten varchar(40),
tuoi int,
khoa_hoc varchar(40),
so_tien int);

insert into danhsachlop(ten,tuoi,khoa_hoc,so_tien)
 values
 ('Hoang',21,'CNTT',400000),
 ('Viet',19,'DTVT',320000),
 ('Thanh',18,'KTDN',400000),
 ('Nhan',19,'CK',450000),
 ('Huong',20,'TCNH',500000),
 ('Huong',20,'TCNH',200000);

select `ten`, sum(so_tien)  from danhsachlop where ten = 'huong';
select ten tên, sum(so_tien) tiền
 from danhsachlop group by ten;
 
 select distinct ten tên from danhsachlop;
 