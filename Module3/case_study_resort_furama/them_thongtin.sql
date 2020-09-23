

INSERT INTO bo_phan VALUES (1,'Sale-Marketing'),(2,'Hành chính'),(3,'Quản lý'),(4,'Phục vụ'),(5,'Sale-Marketing'),(6,'Sale-Marketing');
INSERT INTO trinh_do VALUES (1,'Cao đẳng'),(2,'Trung cấp'),(3,'Đại học'),(4,'Sau đại học'),(5,'Cao đẳng'),(6,'Đại học');
INSERT INTO vi_tri VALUES (1,'Lễ tân'),(2,'Phục vụ'),(3,'Chuyên viên'),(4,'Giám sát'),(5,'Quản lý'),(6,'Giám đốc');
INSERT INTO nhan_vien VALUES (1,'Hồ Quang Hiếu','2000-01-01',1,1,1,'123456789','10000000','0905567678','hieu@gmail.com','Đà Nẵng'),
(2,'Hồ Quỳnh Anh','2001-02-02',2,2,2,'123456987','20000000','0988123234','anh@gmail.com','Huế'),
(3,'Mai Phương Thúy','2002-03-03',3,3,3,'987567123','30000000','0988545676','thuy@gmail.com','Quảng Trị'),
(4,'Sơn Tùng','2003-04-04',4,4,4,'999777888','90000000','0999978787','tung@gmail.com','Quảng Nam'),
(5,'Khánh','2001-02-04',2,3,4,'989477888','94000000','0799978787','khanh@gmail.com','Quảng Nam'),
(6,'Khánh Phương','2008-08-08',2,3,1,'333797999','50020000','0977155799','phuong@gmail.com','Sài Gòn'),
(7,'Bích Phương','2010-05-05',1,3,4,'333666999','90001000','0977255799','bichphuong@gmail.com','Vinh');


INSERT INTO kieu_thue VALUES (1,'năm',40000000),(2,'tháng',400000),(3,'ngày',40000),(4,'giờ',400);
INSERT INTO loai_dich_vu VALUES (1,'Villa'),
(2,'House'),
(3,'Phòng'),
(4,'Dịch vụ đi kèm');
INSERT INTO dich_vu VALUES (1,'Villa',20,5,50,5000000,1,1,'Còn dịch vụ'),
(2,'Room',60,2,80,4000000,3,3,'Còn dịch vụ'),
(3,'House',80,2,30,2000000,2,2,'Còn dịch vụ'),
(4,'House',30,5,80,7000000,1,1,'Hết dịch vụ'),
(5,'Villa',90,8,100,90000000,4,4,'Còn dịch vụ');


INSERT INTO loai_khach VALUES (1,'Diamond'),(2,'Platinium'),(3,'Gold'),(4,'Sliver'),(5,'Member');
INSERT INTO khach_hang VALUES (1,2,'Uzumaki Naruto','1997-12-12','123123123','01230123433','naruto@gmail.com','Quảng Trị'),(2,1,'Uchiha Suzuke','1997-12-12','123123123','099991239','suzuke@gmail.com','Đà Nẵng'),(3,1,'Hatake Kakashi','1997-12-12','123123123','0899123123','kakashi@gmail.com','Kaze'),(4,4,'Rock Lee','1997-12-12','123123123','078122123','lee@gmail.com','Suna'),(5,5,'Huyga Hinata','1997-12-12','123123123','067123123','hianata@gmail.com','Ikanari');
INSERT INTO hop_dong VALUES 
(1,1,1,1,'2018-10-12','2018-10-30',200000,15000000),
(2,3,2,4,'2019-10-10','2019-12-20',500000,900000),
(3,3,3,2,'2018-04-06','2018-06-15',800000,10000000),
(4,5,1,3,'2019-02-01','2019-04-15',6000000,20000000),
(5,4,5,5,'2018-07-05','2018-08-29',3000000,8000000),
(6,2,3,3,'2019-01-05','2019-03-20',1800000,5000000),
(7,3,2,1,'2019-03-10','2019-05-10',2200000,7000000),
(8,5,8,4,'2019-02-06','2019-03-15',1350000,120000000),
(9,3,6,1,'2019-10-12','2019-10-30',200000,600000),
(10,2,3,1,'2019-10-01','2019-12-30',230000,16000000),
(11,6,1,2,'2014-10-01','2014-12-30',233200,2660870),
(12,7,3,4,'2015-05-01','2015-06-10',133200,12560870);
INSERT INTO dich_vu_di_kem VALUES 
(1,'Massage',1000000,13,'Mở cửa'),
(2,'Karaoke',500000,10,'Mở cửa'),
(3,'Thức ăn',100000,15,'Còn dịch vụ'),
(4,'Nước uống',20000,7,'Còn dịch vụ'),
(5,'Thuê xe',90000,12,'Còn dịch vụ');



INSERT INTO hop_dong_chi_tiet VALUES 
(1,2,3,10),
(2,1,4,20),
(3,3,1,15),
(4,4,2,30),
(5,5,5,8),
(6,4,2,5),
(7,9,1,20);


