--------------- DAY 8 ------------------

--37-String fonk.

Select * from Developers

--developers tablosundaki isimlere 'Developer' kelimesini ekleyiniz.
UPDATE developers
SET name=concat('Developer ',name);

--developers tablosunda tüm isimleri büyük harfe çevirerek görüntüleyiniz.
SELECT UPPER(name)
FROM developers;

--developers tablosunda tüm sehirleri küçük harfe çevirerek görüntüleyiniz.
SELECT LOWER(city)
FROM developers;

--words tablosunda tüm kelimelerin ilk harfini büyük harfe çevirerek görüntüleyiniz.
select INITCAP(word) from words

select * from words


--developers tablosunda isim ve isimlerin ilk 3 harfini listeleyiniz
SELECT name,SUBSTRING(name,1,3)
FROM developers;

--developers tablosunda isim ve isimlerin uzunluklarını listeleyiniz.
SELECT name, LENGTH(name) as karakter_sayisi
FROM developers;


--38.FETCH NEXT n ROW ONLY : listelemek istediğimiz kayıtlardan ilk n tane satırı getiriyor
  --LIMIT n : ilk n tane satırı getirir.
  --OFFSET n : ilk n satırı atlar sonrakileri getirir
  
 
--developers tablosundan idye göre ilk 3 kaydı getiriniz.
SELECT * 
FROM developers
ORDER BY id ASC 
LIMIT 3;

SELECT * 
FROM developers
FETCH NEXT 3 ROW ONLY;
 
SELECT * 
FROM developers
LIMIT 3;

--developers tablosundan ilk 2 kayıttan sonraki ilk 3 kaydı getiriniz.
select * 
from developers
offset 2 
limit 3;

SELECT * 
FROM developers
OFFSET 2 ROW
FETCH NEXT 3 ROW ONLY;

--developers tablosundan maaşı en düşük ilk 3 kaydı getiriniz.
SELECT *
FROM developers
ORDER BY salary ASC
LIMIT 3;

--developers tablosundan maaşı en yüksek 2 developerın tüm bilgilerini getiriniz.
SELECT *
FROM developers
ORDER BY salary DESC
LIMIT 2;

--developers tablosundan maaşı en yüksek 2. developerın tüm bilgilerini getiriniz.
SELECT *
FROM developers
ORDER BY salary DESC
OFFSET 1
LIMIT 1;


--39.ALTER TABLE:tabloyu güncellemek için kullanılır. -DDL-
--ADD COLUMN:yeni sütun ekler
--DROP COLUMN:mevcut olan sütunu kaldırır.
--RENAME COLUMN .. TO ..:mevcut sütunun ismini değiştirir.
--RENAME .. TO .. =tablonun ismini değiştirir

SELECT * from calisanlar3;

--calisanlar3 tablosuna yas int seklinde yeni sutun ekleyiniz
ALTER Table calisanlar3 
ADD COLUMN yas int;

--calisanlar3 tablosuna remote boolean seklinde yeni sutun ekleyiniz
ALTER Table calisanlar3 
ADD COLUMN remote boolean;

--calisanlar3 tablosuna prog_dili varchar seklinde yeni sutun ekleyiniz
-- default degeri 'java' olsun

ALTER Table calisanlar3 
ADD COLUMN  prog_dili varchar(20) DEFAULT 'Java';

--calisanlar3 tablosunda yas sutununu siliniz
ALTER Table calisanlar3 
DROP COLUMN yas;

--calisanlar3 tablosundaki maas sutununun ismini gelir olarak güncelleyiniz
ALTER Table calisanlar3 
RENAME COLUMN maas to gelir;

--calisanlar3 tablosunun ismini employees olarak güncelleyiniz
ALTER Table calisanlar3 
RENAME TO employees;

SELECT * from calisanlar3;
SELECT * from employees;

--employees tablosunda gelir sütunun data tipini real olarak güncelleyiniz
ALTER Table employees 
ALTER COLUMN gelir TYPE real;

--employees tablosunda isim sütunun data tipini VARCHAR(50) olarak güncelleyiniz
ALTER TABLE employees
ALTER COLUMN isim TYPE VARCHAR(50);

--emloyees tablosunda id sütunun data tipini VARCHAR(20) olarak güncelleyiniz
ALTER TABLE employees
ALTER COLUMN id TYPE VARCHAR(20);

--employees tablosunda isim sütununa NOT NULL constrainti ekleyiniz.
ALTER TABLE employees
ALTER COLUMN isim SET NOT NULL;

INSERT INTO employees(sehir) values('Bursa'); -- NOT NULL constraintinden dolayi kabul etmez
INSERT INTO employees(isim,sehir) values('Jack Sparrow','Bursa');

--employees tablosunda geliri null olana maas deger girme
Update employees
Set gelir=999999
where gelir is null;

--employees tablosunda id sütununa PRIMARY KEY constrainti ekleyiniz
Update employees
Set id=3
where isim='Ayse Gul';

delete from employees 
where isim='Ayse Gul' and sehir='Ankara';

SELECT * from employees;

Update employees
Set id='99824242'
where isim='Jack Sparrow';


Alter table employees
add primary key(id);

--ALTER TABLE table_name ADD CONSTRAINT column_name constraint;

--48.TRANSACTION-ROLLBACK

--DB de her islemimiz Transaction uzerinde gerceklestirilir.
--Azaltma ve artirma islemleri Transaction icine alinir ve bu iki islem tek bir islem gibi olur ve
--bu iki islem birden gerceklesmedigi surece yapilan tum islemler geri alinir.
--Tablo olusturulurken de tum islemler bir Transaction icerisinde gerceklestirilir.
--Transaction sonlandirilmadan Transaction icerisindeki islemlerimiz DB uzerinde kalici hale gelmez.


--1.BEGIN komutu ile transaction baslar.
--2.COMMIT komutu ile transaction sonlandirilir.
--3.ROLLBACK TO x: tüm kayitlar x noktasindaki haline döndürülür.


BEGIN;
CREATE TABLE hesaplar
(
hesap_no int UNIQUE,
isim VARCHAR(50),
bakiye real       
);
COMMIT;

select * from hesaplar;

BEGIN;
INSERT INTO hesaplar VALUES(1234,'Harry Potter',5500.3)
INSERT INTO hesaplar VALUES(5678,'Jack Sparrow',8500.3)
savepoint x; --herhangi bir problem olursa geriye dönmek istedigimiz yer
			 -- bir transaction icerisinde birden fazla savepoint olabilir

Update hesaplar SET bakiye=bakiye-1000 where hesap_no=1234;
--HATA olustu!!!!
ROLLBACK TO x; --transfer iptal edildi

Update hesaplar SET bakiye=bakiye+1000 where hesap_no=5678;

--transfer BASARILI

COMMIT;  --artik ROLLBACK kullanilmaz





