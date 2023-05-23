--------------DAY'3----------------------

--13. WHERE komutu

SELECT * FROM calisanlar;
SELECT isim FROM calisanlar;
SELECT * FROM adresler;

--calisanlar tablosundan ismi 'Donatello' olanları getir.
SELECT * FROM calisanlar WHERE isim='Donatello';

--calisanlar tablosundan maaşı 5000 den büyük olanların ismini ve maaşını getir.
SELECT isim,maas FROM calisanlar WHERE maas>5000;

--adresler tablosundan sehiri 'Konya' ve adres_id si 10002 olanların tüm fieldlarını getir.
SELECT * FROM adresler WHERE sehir='Konya' AND adres_id='10002';

--adresler tablosundan sehiri 'Konya' veya 'Bursa' olanların sehir ve cadde bilgilerini getir.
SELECT sehir,cadde FROM adresler WHERE sehir='Konya' OR sehir='Bursa';

--14. DELETE komutu:tablodaki verileri siler, tabloyu silmez.

CREATE TABLE ogrenciler1
(
id int,
isim VARCHAR(50),
veli_isim VARCHAR(50),
yazili_notu int       
);
INSERT INTO ogrenciler1 VALUES(122, 'Kerem Can', 'Fatma',75);
INSERT INTO ogrenciler1 VALUES(123, 'Ali Can', 'Hasan',75);
INSERT INTO ogrenciler1 VALUES(124, 'Veli Han', 'Ayse',85);
INSERT INTO ogrenciler1 VALUES(125, 'Kemal Tan', 'Hasan',85);
INSERT INTO ogrenciler1 VALUES(126, 'Ahmet Ran', 'Ayse',95);
INSERT INTO ogrenciler1 VALUES(127, 'Mustafa Bak', 'Can',99);
INSERT INTO ogrenciler1 VALUES(128, 'Mustafa Bak', 'Ali', 99);
INSERT INTO ogrenciler1 VALUES(129, 'Mehmet Bak', 'Alihan', 89);

SELECT * FROM ogrenciler1;

--id'si 124 olan öğrenciyi siliniz.
DELETE FROM ogrenciler1 WHERE id=124;

--ismi 'Kemal Tan' olan kaydı siliniz.
DELETE FROM ogrenciler1 WHERE isim='Kemal Tan';

--ismi Ahmet Ran veya Ali Can olan kayıtları siliniz.
DELETE FROM ogrenciler1 WHERE isim='Ahmet Ran' OR isim='Ali Can';
--olmayan data 
DELETE FROM ogrenciler1 WHERE isim='Ahmet Ran' AND isim='Ali Can';

---ÖDEV:
-- ismi Mustafa Bak ve id'si 128 olan kaydı siliniz.
-- id'si 122, 125 veya 126 olanları silelim.
-- id 'si 126'dan büyük olan kayıtları silelim.

--15.a.Tablodaki tüm kayıtları silme

--students tablosundaki tüm verileri getiriniz.
SELECT * FROM students;

--students tablosundaki tüm verileri siliniz.
DELETE FROM students; 

--15.b.TRUNCATE komutu

SELECT * FROM doctors;

--doctors tablosundaki tüm verileri siliniz.
TRUNCATE TABLE doctors;--TRUNCATE TABLE komutu ile WHERE komutu kullanılamaz.

--16.parent - child ilşkisi olan tablolardan veri silme

SELECT * FROM calisanlar;--parent
SELECT * FROM adresler;--child table

--calisanlar tablosundan tüm kayıtları siliniz.
DELETE FROM calisanlar;--tablodaki id adresler tablosunda referanslı old için silmez

--calisanlar tablosundan id=10002 kaydı siliniz.
DELETE FROM calisanlar WHERE id='10002';--referans alınmış silmez

DELETE FROM adresler WHERE adres_id='10002';
DELETE FROM calisanlar WHERE id='10002';--ilişki koparıldığı için siler

DELETE FROM adresler;
DELETE FROM calisanlar;--ilişki koparıldığı için siler

--17. on delete cascade

CREATE TABLE talebeler
(
id int primary key,  
isim VARCHAR(50),
veli_isim VARCHAR(50),
yazili_notu int
);--parent

CREATE TABLE notlar( 
talebe_id int,
ders_adi varchar(30),
yazili_notu int,
CONSTRAINT notlar_fk FOREIGN KEY (talebe_id) REFERENCES talebeler(id)
on delete cascade
);--child

INSERT INTO talebeler VALUES(122, 'Kerem Can', 'Fatma',75);
INSERT INTO talebeler VALUES(123, 'Ali Can', 'Hasan',75);
INSERT INTO talebeler VALUES(124, 'Veli Han', 'Ayse',85);
INSERT INTO talebeler VALUES(125, 'Kemal Tan', 'Hasan',85);
INSERT INTO talebeler VALUES(126, 'Ahmet Ran', 'Ayse',95);
INSERT INTO talebeler VALUES(127, 'Mustafa Bak', 'Can',99);
INSERT INTO talebeler VALUES(128, 'Mustafa Bak', 'Ali', 99);
INSERT INTO talebeler VALUES(129, 'Mehmet Bak', 'Alihan', 89);

INSERT INTO notlar VALUES ('123','kimya',75);
INSERT INTO notlar VALUES ('124', 'fizik',65);
INSERT INTO notlar VALUES ('125', 'tarih',90);
INSERT INTO notlar VALUES ('126', 'Matematik',90);
INSERT INTO notlar VALUES ('127', 'Matematik',90);
INSERT INTO notlar VALUES (null, 'tarih',90);

--notlar tablosundan id'si 123 olan datayı siliniz.
DELETE FROM notlar WHERE talebe_id=123;--child

--talebeler tablosundan id si 126 olan kaydı siliniz.
DELETE FROM talebeler WHERE id=126;--parent
--parenttan kayıt sildiğimiz zaman childdan silinir

SELECT * FROM notlar;
SELECT * FROM talebeler;

--18.Tabloyu silme:tabloyu SCHEMA dan kaldırma

--sirinler tablosunu siliniz.
DROP TABLE sirinler;

--talebeler tablosunu siliniz.
DROP TABLE talebeler;--notlar tablosu ile ilişkili old. için silmez

DROP TABLE talebeler CASCADE; 

--talebeler1 tablosunu siliniz.
DROP TABLE IF EXISTS talebeler1;

--19. IN CONDITION

CREATE TABLE musteriler  (
urun_id int,  
musteri_isim varchar(50),
urun_isim varchar(50)
);
INSERT INTO musteriler VALUES (10, 'Mark', 'Orange');
INSERT INTO musteriler VALUES (10, 'Mark', 'Orange');
INSERT INTO musteriler VALUES (20, 'John', 'Apple');
INSERT INTO musteriler VALUES (30, 'Amy', 'Palm');
INSERT INTO musteriler VALUES (20, 'Mark', 'Apple');
INSERT INTO musteriler VALUES (10, 'Adem', 'Orange');
INSERT INTO musteriler VALUES (40, 'John', 'Apricot');
INSERT INTO musteriler VALUES (20, 'Eddie', 'Apple');

SELECT * FROM musteriler;
--Müşteriler tablosundan ürün ismi 'Orange', 'Apple' veya 'Apricot' olan verileri listeleyiniz.

SELECT *
FROM musteriler
WHERE urun_isim='Orange' OR urun_isim='Apple' OR urun_isim='Apricot';

--2.yol
SELECT *
FROM musteriler
WHERE urun_isim IN ('Orange','Apple','Apricot');

--Müşteriler tablosundan ürün ismi 'Orange', 'Apple' , 'Apricot'  dışındaki verileri listeleyiniz.
SELECT *
FROM musteriler
WHERE urun_isim NOT IN ('Orange','Apple','Apricot');

--20.BETWEEN .. AND .. komutu:değerler dahil

--Müşteriler tablosunda urun_id 20 ile 40 arasinda olan urunlerin tum bilgilerini listeleyiniz.
SELECT *
FROM musteriler
WHERE urun_id>=20 AND urun_id<=40;

--2.yol
SELECT *
FROM musteriler
WHERE urun_id BETWEEN 20 AND 40;

--Müşteriler tablosunda urun_id 20 den küçük veya 40 dan büyük olan urunlerin tum bilgilerini listeleyiniz

SELECT *
FROM musteriler
WHERE urun_id<20 OR urun_id>40;

--2.yol
SELECT *
FROM musteriler
WHERE urun_id NOT BETWEEN 20 AND 40;--exclusive:dahil değil

--*ALIASES*--tablo veya field isimlerine geçici isim verme
CREATE TABLE workers(
calisan_id char(9),
calisan_isim varchar(50),
calisan_dogdugu_sehir varchar(50)
);
INSERT INTO workers VALUES(123456789, 'Ali Can', 'Istanbul'); 
INSERT INTO workers VALUES(234567890, 'Veli Cem', 'Ankara');  
INSERT INTO workers VALUES(345678901, 'Mine Bulut', 'Izmir');

SELECT * FROM workers;

--workers tablosunda calisan_id,calisan_isim,calisan_dogdugu_sehir fieldlarını listeleyiniz.
SELECT calisan_id AS id, calisan_isim AS isim, calisan_dogdugu_sehir AS sehir FROM workers;

SELECT calisan_id AS id, calisan_isim ||' '||calisan_dogdugu_sehir AS isim_sehir FROM workers;

SELECT calisan_id id, calisan_isim isim, calisan_dogdugu_sehir sehir 
FROM workers;

--21. aggregate fonksiyon
CREATE TABLE calisanlar3 
(
id int, 
isim VARCHAR(50), 
sehir VARCHAR(50), 
maas int, 
isyeri VARCHAR(20)
);
INSERT INTO calisanlar3 VALUES(123456789, 'Ali Seker', 'Istanbul', 2500, 'Vakko');
INSERT INTO calisanlar3 VALUES(234567890, 'Ayse Gul', 'Istanbul', 1500, 'LCWaikiki');
INSERT INTO calisanlar3 VALUES(345678901, 'Veli Yilmaz', 'Ankara', 3000, 'Vakko');
INSERT INTO calisanlar3 VALUES(456789012, 'Veli Yilmaz', 'Izmir', 1000, 'Pierre Cardin');
INSERT INTO calisanlar3 VALUES(567890123, 'Veli Yilmaz', 'Ankara', 7000, 'Adidas');
INSERT INTO calisanlar3 VALUES(456789012, 'Ayse Gul', 'Ankara', 1500, 'Pierre Cardin');
INSERT INTO calisanlar3 VALUES(123456710, 'Fatma Yasa', 'Bursa', 2500, 'Vakko');
CREATE TABLE markalar
(
marka_id int, 
marka_isim VARCHAR(20), 
calisan_sayisi int
);
INSERT INTO markalar VALUES(100, 'Vakko', 12000);
INSERT INTO markalar VALUES(101, 'Pierre Cardin', 18000);
INSERT INTO markalar VALUES(102, 'Adidas', 10000);
INSERT INTO markalar VALUES(103, 'LCWaikiki', 21000);

SELECT * FROM calisanlar3;
--calisanlar3 tablosunda max maaşı gösteriniz.
SELECT max(maas) FROM calisanlar3;

--calisanlar3 tablosunda min maaşı gösteriniz.
SELECT min(maas) FROM calisanlar3;

--calisanlar3 tablosunda toplam maaşı gösteriniz.
SELECT sum(maas) FROM calisanlar3;

--calisanlar3 tablosunda ortalama maaşı gösteriniz.
SELECT avg(maas) FROM calisanlar3;

SELECT round(avg(maas),2) FROM calisanlar3;--girilen parametre kadar yuvarlama yapar

--calisanlar3 tablosundaki kayıt sayısını gösteriniz.
SELECT count(*) FROM calisanlar3;

--calisanlar3 tablosundaki maaşı 2500 olanların sayısını gösteriniz.
SELECT count(*) FROM calisanlar3 WHERE maas=2500;

----------------------