---------DAY 5 ---------------
--24.Veriyi Update etme
--SYNTAX: Update table_name SET column

CREATE TABLE tedarikciler -- parent
(
vergi_no int PRIMARY KEY,
firma_ismi VARCHAR(50),
irtibat_ismi VARCHAR(50)
);
INSERT INTO tedarikciler VALUES (101, 'IBM', 'Kim Yon');
INSERT INTO tedarikciler VALUES (102, 'Huawei', 'Çin Li');
INSERT INTO tedarikciler VALUES (103, 'Erikson', 'Maki Tammen');
INSERT INTO tedarikciler VALUES (104, 'Apple', 'Adam Eve');

CREATE TABLE urunler -- child
(
ted_vergino int, 
urun_id int, 
urun_isim VARCHAR(50), 
musteri_isim VARCHAR(50),
CONSTRAINT fk_urunler FOREIGN KEY(ted_vergino) REFERENCES tedarikciler(vergi_no)
on delete cascade
);   
INSERT INTO urunler VALUES(101, 1001,'Laptop', 'Ayşe Can');
INSERT INTO urunler VALUES(102, 1002,'Phone', 'Fatma Aka');
INSERT INTO urunler VALUES(102, 1003,'TV', 'Ramazan Öz');
INSERT INTO urunler VALUES(102, 1004,'Laptop', 'Veli Han');
INSERT INTO urunler VALUES(103, 1005,'Phone', 'Canan Ak');
INSERT INTO urunler VALUES(104, 1006,'TV', 'Ali Bak');
INSERT INTO urunler VALUES(104, 1007,'Phone', 'Aslan Yılmaz');

--  vergi_no'su 102 olan tedarikcinin firma ismini 'Vestel' olarak güncelleyeniz.
update tedarikciler
set firma_ismi='Vestel'
where vergi_no=102;

-- vergi_no'su 101 olan tedarikçinin firma ismini 'casper' ve irtibat_ismi'ni 'Ali Veli' olarak güncelleyiniz.
update tedarikciler
set firma_ismi='Casper', irtibat_ismi='Ali Veli'
WHERE vergi_no=101;


--  urunler tablosundaki 'Phone' değerlerini 'Telefon' olarak güncelleyiniz.
update urunler
set urun_isim='Telefon'
where urun_isim='Phone';

--  urunler tablosundaki urun_id değeri 1004'ten büyük olanların urun_id'sini 1 arttırın.
update urunler
set urun_id = urun_id+1
where urun_id>1004;

-- urunler tablosundaki tüm ürünlerin urun_id değerini ted_vergino sutun değerleri ile toplayarak güncelleyiniz.
update urunler
set urun_id = urun_id+ted_vergino;

--urunler tablosundan Ali Bak'in aldigi urunun ismini, 'Ayşe Can' ın aldığı ürün ismi ile güncelleyiniz.
update urunler
set urun_isim = (SELECT urun_isim from urunler where musteri_isim='Ayşe Can')
where musteri_isim = 'Ali Bak'


--Urunler tablosunda laptop satin alan musterilerin ismini, tedarikci  tablosunda
--firma_ismi Apple'in irtibat_isim'i ile degistirin.--ÖDEV--


--urunler tablosundaki urun_id değeri 1111 olan kaydın musteri_isim bilgisinin başına 'GOLD ' ekleyiniz.
update urunler
set musteri_isim='GOLD ' || musteri_isim
where urun_id=1111;

update urunler
set musteri_isim=concat('GOLD ', musteri_isim)
where urun_id=1112;

select * from urunler;
select * from tedarikciler;

--25.Is Null Condition

CREATE TABLE insanlar
(
ssn char(9),
name varchar(50),
address varchar(50)
);
INSERT INTO insanlar VALUES(123456789, 'Ali Can', 'Istanbul');
INSERT INTO insanlar VALUES(234567890, 'Veli Cem', 'Ankara');
INSERT INTO insanlar VALUES(345678901, 'Mine Bulut', 'Izmir');
INSERT INTO insanlar (ssn, address) VALUES(456789012, 'Bursa');
INSERT INTO insanlar (ssn, address) VALUES(567890123, 'Denizli');
INSERT INTO insanlar (ssn, name) VALUES(567890123, 'Veli Han');



--insanlar tablosunda name sütunu null olanları listeleyiniz
select *
from insanlar
where name is NULL

--insanlar tablosunda name sütunu null olanların name değerini 
--'MISSING...' olarak güncelleyiniz..
update insanlar
set name='Missing...'
where name is null;

--insanlar tablosunda address sütunu null olanların adress değerini
-- 'MISSING...' olarak güncelleyiniz..ÖDEVVVV
update insanlar
set address='MISSING...'
where address is NULL;

select * from insanlar;

--26.ORDER BY komutu: Kayitlari belirli bir fielda göre ya da bir ifadeye göre defaultta artan siralar.
CREATE TABLE people
(
ssn char(9),
isim varchar(50),
soyisim varchar(50),  
adres varchar(50)
);

INSERT INTO people VALUES(123456789, 'Ali','Can', 'Istanbul');
INSERT INTO people VALUES(234567890, 'Veli','Cem', 'Ankara');  
INSERT INTO people VALUES(345678901, 'Mine','Bulut', 'Ankara');  
INSERT INTO people VALUES(256789012, 'Mahmut','Bulut', 'Istanbul'); 
INSERT INTO people VALUES (344678901, 'Mine','Yasa', 'Ankara');  
INSERT INTO people VALUES (345678901, 'Veli','Yilmaz', 'Istanbul');

--people tablosundaki kayıtları ssn e göre sıralayınız.
SELECT * 
from people
order by ssn;

--People tablosundaki ismi Mine olanlari soyisim sirali olarak listeleyin
SELECT * 
from people
where isim='Mine'
order by soyisim;

--People tablosundaki soyismi Bulut olanlari isim sirali olarak listeleyin 
--1.Yol
SELECT * 
from people
where soyisim='Bulut'
order by isim;

--2.Yol sütüun numarasi
SELECT * 
from people
where soyisim='Bulut'
order by 2; --sütun ismi yerine sütun numarasi yazilabilir. Ancak tavsiye edilmez.


SELECT * 
from people
order by ssn DESC; --DESC: azalan  ASC:artan

SELECT * 
from people
order by ssn ASC; --default oldugu icin ASC yazmaya gerek yok

--people tablosundaki tüm kayıtları isimleri Natural sirali (ASC,artan), Soyisimler ters sirali olarak listeleyin
SELECT * 
from people
order by isim ASC,soyisim DESC

--isim ve soyisim değerlerini soyisim kelime uzunluklarına göre sıralayınız
SELECT isim,soyisim
from people
order by length(soyisim)
