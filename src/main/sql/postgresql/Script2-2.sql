-------DAY'2----------
--------tekrar----------
​
INSERT INTO sirinler VALUES(1001,'Şirine',100,now());
INSERT INTO sirinler VALUES(1002,'Şirin Baba',120,'2001-Jul-12');
INSERT INTO sirinler(id,isim) VALUES(1002,'Uykucu Şirin');
​
SELECT * FROM sirinler;
​
-----------------
​
CREATE TABLE students2(
id int,
full_name varchar(50),
email varchar(50)
);
​
INSERT INTO students2 VALUES(1001,'Cemal Süreyya','sair@mail.com');
INSERT INTO students2 VALUES(1002,'Nuri Pakdil','sair@mail.com');
INSERT INTO students2 VALUES(null,'','sair@mail.com');
​
SELECT * FROM students2;
​
-------------------------------
--8.tabloya unique constraint ekleme
CREATE TABLE developers(
id SERIAL,
name varchar(50),
email varchar(50) UNIQUE,
salary real,
prog_lang varchar(20)	
);
​
​
INSERT INTO developers(name,email,salary,prog_lang) VALUES('Akın Toprak','toprak@mail.com',4000,'Java');
INSERT INTO developers(name,email,salary,prog_lang) VALUES('Ebubekir','ebubekir@mail.com',4000,'Java');
​
SELECT * FROM developers;
​
​
--9.tabloya not null constraint ekleme
​
CREATE TABLE doctors(
id int,
name varchar(50) NOT NULL,
email varchar(50) UNIQUE,
salary real
);
​
INSERT INTO doctors VALUES(1000,'Nazan Bekiroğlu','nazan@mail.com',4000);
INSERT INTO doctors(id,email,salary) VALUES(1001,'atay@mail.com',4000);--name null kabul etmez
INSERT INTO doctors VALUES(1001,'','pamuk@mail.com',4000);
​
​
SELECT * FROM doctors;
​
--10.primary key ekleme
​
CREATE TABLE students3(
student_id int PRIMARY KEY,
full_name varchar(50),
grade real,
register_date date	
);
​
--2.yöntem
CREATE TABLE students4(
student_id int,
full_name varchar(50),
grade real,
register_date date,
CONSTRAINT std_pk PRIMARY KEY(student_id) 	
);
​
--compositekey
CREATE TABLE students5(
student_id int,
full_name varchar(50),
grade real,
register_date date,
CONSTRAINT student_pk PRIMARY KEY(student_id,full_name) 	
);
​
SELECT * FROM students4;
​
--11.tabloya foreign key cons. ekleme
CREATE TABLE courses4(
course_id int,
course_name varchar(50),
student_id int,
CONSTRAINT course_fk FOREIGN KEY(student_id) REFERENCES students4(student_id)
); 
​
SELECT * FROM courses4;
​
--12.check constraint ekleme
CREATE TABLE personel(
id int,
name varchar(50) CHECK(name <> ''),--not equals
salary real,
age int	CHECK(age>0)
);
​
INSERT INTO personel VALUES(100,'Tolstoy',12000,25);
INSERT INTO personel VALUES(100,'Balzac',12000,-3);
​
SELECT * FROM personel;
​
CREATE TABLE personel2(
id int,
name varchar(50) CHECK(name <> ''),--not equals
salary real,
age int	NOT NULL CHECK(age>0)
);
​
--13:where komutu
CREATE TABLE calisanlar(
id char(5) PRIMARY KEY,
isim varchar(50) UNIQUE,
maas int NOT NULL,
ise_baslama date
);
​
CREATE TABLE adresler(
adres_id char(5),
sokak varchar(30),
cadde varchar(30),
sehir varchar(20),
FOREIGN KEY(adres_id) REFERENCES calisanlar(id)	
);
​
INSERT INTO calisanlar VALUES('10002', 'Donatello' ,12000, '2018-04-14');  
INSERT INTO calisanlar VALUES('10003', null, 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10004', 'Donatello', 5000, '2018-04-14'); --isim unique 
INSERT INTO calisanlar VALUES('10005', 'Michelangelo', 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10006', 'Leonardo', null, '2019-04-12');--maas not null
INSERT INTO calisanlar VALUES('10007', 'Raphael', '', '2018-04-14');--maas int
INSERT INTO calisanlar VALUES('', 'April', 2000, '2018-04-14');--empty null değildir
INSERT INTO calisanlar VALUES('', 'Ms.April', 2000, '2018-04-14');--PK unique
INSERT INTO calisanlar VALUES('10002', 'Splinter' ,12000, '2018-04-14');--PK unique
INSERT INTO calisanlar VALUES( null, 'Fred' ,12000, '2018-04-14');--PK not null
INSERT INTO calisanlar VALUES('10008', 'Barnie' ,10000, '2018-04-14');
INSERT INTO calisanlar VALUES('10009', 'Wilma' ,11000, '2018-04-14');
INSERT INTO calisanlar VALUES('10010', 'Betty' ,12000, '2018-04-14');
​
INSERT INTO adresler VALUES('10003','Ninja Sok', '40.Cad.','IST');
INSERT INTO adresler VALUES('10003','Kaya Sok', '50.Cad.','Ankara');
INSERT INTO adresler VALUES('10002','Taş Sok', '30.Cad.','Konya');
INSERT INTO adresler VALUES('10012','Taş Sok', '30.Cad.','Konya');--parent tableda yok
​
​
INSERT INTO adresler VALUES(NULL,'Taş Sok', '30.Cad.','Konya');
INSERT INTO adresler VALUES(NULL,'Taş Sok', '30.Cad.','Bursa');
​
​
--