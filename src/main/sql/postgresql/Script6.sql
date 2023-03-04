--27.GROUP BY clause:sonuçları bir veya birden fazla fielda göre gruplamak için kullanılır.

CREATE TABLE manav
(
isim varchar(50),
urun_adi varchar(50),
urun_miktar int
);

INSERT INTO manav VALUES( 'Ali', 'Elma', 5);
INSERT INTO manav VALUES( 'Ayse', 'Armut', 3);
INSERT INTO manav VALUES( 'Veli', 'Elma', 2);  
INSERT INTO manav VALUES( 'Hasan', 'Uzum', 4);  
INSERT INTO manav VALUES( 'Ali', 'Armut', 2);  
INSERT INTO manav VALUES( 'Ayse', 'Elma', 3);  
INSERT INTO manav VALUES( 'Veli', 'Uzum', 5);  
INSERT INTO manav VALUES( 'Ali', 'Armut', 2);  
INSERT INTO manav VALUES( 'Veli', 'Elma', 3);  
INSERT INTO manav VALUES( 'Ayse', 'Uzum', 2);

select * from manav

--Her bir ismi ve her bir isim için alınan toplam ürün miktarını görüntüleyiniz.

SELECT isim,Sum(urun_miktar) toplam
FROM manav
GROUP BY isim;


--Her bir ismi ve her bir isim için alınan toplam ürün miktarını
--alınan toplam ürün miktarına göre azalan görüntüleyiniz.
--1.yol
SELECT isim,Sum(urun_miktar) toplam_urun_miktari
FROM manav
GROUP BY isim
ORDER BY SUM(urun_miktar) DESC;

--2.yol
SELECT isim,Sum(urun_miktar) toplam_urun_miktari
FROM manav
GROUP BY isim
ORDER BY toplam_urun_miktari DESC;


--Her bir ismin aldığı her bir ürünün toplam miktarını görüntüleyiniz.
SELECT isim,urun_adi,Sum(urun_miktar) toplam
FROM manav
GROUP BY isim, urun_adi
ORDER BY isim;

--GROUP BY dan sonra birden fazla sütun ismi kullanılabilir.

--!!!--SELECT komutundan sonra GROUP BY ifadesinde kullanılan sütun ismi yada aggregate fonk. olabilir.
SELECT isim, urun_adi --Hata verir
FROM manav
GROUP BY isim
ORDER BY isim;


--ürün ismine göre her bir ürünü alan toplam kisi sayisini gösteriniz
select urun_adi,sum(urun_miktar)
from manav
GROUP BY urun_adi
ORDER BY urun_adi;

SELECT urun_adi, count(distinct isim) 
FROM manav
GROUP BY urun_adi;

--Isme gore alinan toplam urun mikarı ve ürün çeşit miktarını bulun
select isim, sum(urun_miktar) toplam, Count(distinct urun_adi) urun_cesidi --Ali 9 ürün almis 2 farkli cesit
from manav
GROUP BY isim;


--Alinan ürün miktarina gore musteri sayisi
select urun_miktar, count(Distinct isim)	 
from manav			 
group by urun_miktar;

--Alinan ürün miktarina gore musteri sayisinı görüntüleyiniz.
--musteri sayisina göre artan sıralayınız.
select urun_miktar, count(Distinct isim) musteri_sayisi	 
from manav			 
group by urun_miktar
order by  musteri_sayisi;	 


--28.HAVING clause : Group By komutundan sonra kosul eklemek icin kullanilir

CREATE TABLE personel3  (
id int,
isim varchar(50),  
sehir varchar(50), 
maas int,  
sirket varchar(20)
);
INSERT INTO personel3 VALUES(123456789, 'Ali Yilmaz', 'Istanbul', 5500, 'Honda'); 
INSERT INTO personel3 VALUES(234567890, 'Veli Sahin', 'Istanbul', 4500, 'Toyota'); 
INSERT INTO personel3 VALUES(345678901, 'Mehmet Ozturk', 'Ankara', 3500, 'Honda');
INSERT INTO personel3 VALUES(456789012, 'Mehmet Ozturk', 'Izmir', 6000, 'Ford'); 
INSERT INTO personel3 VALUES(567890123, 'Mehmet Ozturk', 'Ankara', 7000, 'Tofas');
INSERT INTO personel3 VALUES(456789012, 'Veli Sahin', 'Ankara', 4500, 'Ford');  
INSERT INTO personel3 VALUES(123456710, 'Hatice Sahin', 'Bursa', 4500, 'Honda');

select * from personel3
-- Her sirketin MIN maaslarini eger 4000’den buyukse goster
SELECT sirket,min(maas) min_maas
from personel3
GROUP by sirket
HAVING min(maas)>4000;


--Her bir ismin aldigi toplam gelir 10000 liradan fazla ise ismi ve toplam maasi gosteren sorgu yaziniz
SELECT isim, sum(maas) toplam_maas
from personel3
GROUP by isim
HAVING sum(maas)>10000;

--Eger bir sehirde calisan personel sayisi 1’den coksa sehir ismini ve personel sayisini veren sorgu yaziniz
SELECT sehir,count(id) calisan_sayisi
from personel3
GROUP by sehir
HAVING count(id)>1;

--Eger bir sehirde alinan MAX maas 5000’den dusukse sehir ismini ve MAX maasi veren sorgu yaziniz
SELECT sehir,max(maas) max_maas
from personel3
GROUP by sehir
HAVING max(maas)>5000;


--UNION:iki farklı sorgunun sonuclarını birleştirir,tekrarlı sonuçları bir kere gösterir
--UNION ALL: UNION ile aynı işlemi yapar ancak tekrarlı olanları da gösterir
CREATE TABLE developers(
id SERIAL PRIMARY KEY,
name varchar(50),
email varchar(50) UNIQUE,
salary real,
prog_lang varchar(20),
city varchar(50),
age int	
);

INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('Akın Toprak','toprak@mail.com',4000,'Java','Ankara',28);
INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('Ebubekir','ebubekir@mail.com',5000,'JavaScript','Istanbul',35);
INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('Bilal Güney ','guney@mail.com',5000,'Java','Izmır',38);
INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('Gülsüm','gulsum@mail.com',4000,'JavaScript','Istanbul',32);
INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('Fatih Deniz','deniz@mail.com',6000,'Java','Izmır',25);
INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('Cemil','cemil@mail.com',6000,'Html','Istanbul',28);
INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('Adam Born','adam@mail.com',5500,'Css','Ankara',28);
INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('Zişan','zisan@mail.com',5000,'Java','Bursa',32);
INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('Mürsel Aygün','aygun@mail.com',4500,'Html','Izmır',33);
INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('Ahmet Saat','saat@mail.com',4500,'Css','Bursa',32);
INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('İrfan','irfan@mail.com',7000,'C++','Konya',38);
INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('Gülsüm','dev@mail.com',4000,'C#','Istanbul',30);
INSERT INTO developers(name,email,salary,prog_lang,city,age) VALUES('Zişan','developer@mail.com',4000,'C#','Bursa',29);
CREATE TABLE contact_info(
address_id int,
street varchar(30),
number int,	
city varchar(30),
FOREIGN KEY(address_id) REFERENCES developers(id)	
);

INSERT INTO contact_info VALUES(1,'Kaya Sok.',5,'Bursa');
INSERT INTO contact_info VALUES(2,'Kaya Sok.',3,'Ankara');
INSERT INTO contact_info VALUES(3,'Can Sok.',10,'Bursa');
INSERT INTO contact_info VALUES(4,'Gül Sok.',12,'Ankara');
INSERT INTO contact_info VALUES(5,'Can Sok.',4,'Afyon');
INSERT INTO contact_info VALUES(6,'Taş Sok.',6,'Bolu');
INSERT INTO contact_info VALUES(7,'Dev Sok.',6,'Sivas');
INSERT INTO contact_info VALUES(8,'Dev Sok.',8,'Van');


/*Yaşı 25’den büyük olan developer isimlerini ve 
yaşı 30'dan küçük developerların kullandığı prog. dillerini
tekrarsız gösteren sorguyu yaziniz*/

Select name from developers where age>25
Union
Select prog_lang from developers where age<30


/*Yaşı 25’den büyük olan developer isimlerini ve 
yaşı 30'dan küçük developerların kullandığı prog. dillerini
tekrarli gösteren sorguyu yaziniz*/
Select name from developers where age>25
Union All
Select prog_lang from developers where age<30


--!!!-- sorgularda SELECT ten sonra çağırdığımız sütun sayısı ve data type aynı olmalı 

/* Java kullananların maaşını ve prog. dilini
ve 
JavaScript kullananların yaşını ve prog. dilini
tekrarsız gösteren sorguyu yaziniz*/

SELECT salary maas_yas,prog_lang from developers where prog_lang='Java'
Union
SELECT age maas_yas,prog_lang from developers where prog_lang='JavaScript'


/* Java kullananların bulunduğu şehir ve maaşını ve 
maaşı 5000 den fazla olanların isim ve yaşını
tekrarsız gösteren sorguyu yaziniz*/
SELECT city sehir_isim,salary yas_maas from developers where prog_lang='Java'
Union
SELECT name sehir_isim,age yas_maas from developers where salary>5000
ORDER by yas_maas

--id si 8 olan developerın çalıştığı şehir ve maaşını
--iletişim adresindeki şehir ve kapı nosunu görüntüleyiniz.
Select city,salary maas_kapino from developers where id=8
Union
Select city,number maas_kapino from contact_info where address_id=8

--developers tablosundaki şehirler ve
--calisanlar3 tablosunda sehirlerin
--tümünü listeleyiniz
SELECT city from developers
Union
select sehir from calisanlar3

--30.INTERSECT komutu: Iki sorgunun ortak sonuclarini tekrarsiz getirir

--developers tablosundaki şehirler ve
--calisanlar3 tablosundaki sehirlerden 
--ortak olanlarını listeleyiniz.
SELECT city from developers
INTERSECT
select sehir from calisanlar3

--developers tablosunda Java kullananların çalıştıkları şehirler ve
--calisanlar3 tablosunda maaşı 1000 den fazla olanların sehirlerinden 
--ortak olanlarını listeleyiniz.
SELECT city from developers where prog_lang='Java'
INTERSECT
select sehir from calisanlar3 where maas>1000


--31:EXCEPT OPERATOR: bir sorgunun sonucunu listelerken başka bir sorgunun sonuçlarını haric tutmak için kullanılır

----developers tablosundaki şehirlerden
--calisanlar3 tablosunda olmayanları listeleyiniz.
SELECT city from developers
EXCEPT
select sehir from calisanlar3

----developers tablosundaki maaşı 4000 den büyük olanların idlerinden
--contact_info tablosunda olmayanları listeleyiniz.
SELECT id from developers where salary>4000
EXCEPT
Select address_id from contact_info

 --ÖDEV:mart ve nisan tablolarındaki tüm ürünlerin isimlerini tekrarsız listeleyiniz.  
 --ÖDEV:mart ve nisan tablolarındaki ortak ürünlerin isimlerini listeleyiniz.
 --ÖDEV:mart ayında satılıp nisan ayında satılmayan ürünlerin isimlerini listeleyiniz.  