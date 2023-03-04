--------------------DAY 7 ---------------

--JOINS: Iliskili tablolarda ortak bir sütun baz alinarak bir veya daha fazla sütunu birlestirir.
CREATE TABLE sirketler  (
sirket_id int,  
sirket_isim varchar(20)
);
INSERT INTO sirketler VALUES(100, 'IBM');
INSERT INTO sirketler VALUES(101, 'GOOGLE');
INSERT INTO sirketler VALUES(102, 'MICROSOFT');
INSERT INTO sirketler VALUES(103, 'APPLE');
CREATE TABLE siparis (
siparis_id int,
sirket_id int,
siparis_tarihi date
);
INSERT INTO siparis VALUES(11, 101, '2023-02-17');  
INSERT INTO siparis VALUES(22, 102, ' 2023-02-18');  
INSERT INTO siparis VALUES(33, 103, ' 2023-01-19');  
INSERT INTO siparis VALUES(44, 104, ' 2023-01-20');  
INSERT INTO siparis VALUES(55, 105, ' 2022-12-21');

select * from sirketler
select * from siparis


--32.INNER JOIN: Baz alinan sütundaki ortak datalar üzerinden birlestirir

--iki tablodaki şirket id'si aynı olanların şirket id,şirket ismi,sipariş tarihini listeleyiniz.

Select sirketler.sirket_id, sirketler.sirket_isim, siparis.sirket_id 
from sirketler inner join siparis
on sirketler.sirket_id=siparis.sirket_id;

--33.-LEFT JOIN :soldaki tablodaki tüm kayıtları getirir,sağdaki tabloda olmayan kayıtlar için null gösterir.

Select c.sirket_id, c.sirket_isim, o.sirket_id 
from sirketler c left join siparis o
on c.sirket_id=o.sirket_id;

    --RIGHT JOIN:sağdaki tablodaki tüm kayıtları getirir,soldaki tabloda olmayan kayıtlar için null gösterir.
	
Select sirketler.sirket_id, sirketler.sirket_isim, siparis.sirket_id 
from sirketler right join siparis
on sirketler.sirket_id=siparis.sirket_id;

--Şirketler tablosundaki tüm şirket idlerini,şirket ismi,sipariş tarihini,sipariş idsini  listeleyiniz.
Select sirketler.sirket_id, sirketler.sirket_isim, siparis.siparis_id ,siparis.siparis_tarihi
from sirketler left join siparis
on sirketler.sirket_id=siparis.sirket_id;

--Siparisler tablosundaki tüm şirket idlerini,şirket ismi,sipariş tarihini,sipariş idsini  listeleyiniz.
Select sirketler.sirket_id, sirketler.sirket_isim, siparis.siparis_id ,siparis.siparis_tarihi
from sirketler right join siparis
on sirketler.sirket_id=siparis.sirket_id;


--34.FULL JOIN:her iki tablodaki tüm kayıtları getirir.	

--iki tablodaki tüm kayıtların şirket id,şirket ismi,sipariş tarihini,sipariş idsini  listeleyiniz.
Select c.sirket_id, c.sirket_isim,o.sirket_id, o.siparis_id,o.siparis_tarihi
from sirketler c full join siparis o
on c.sirket_id=o.sirket_id;

select *
from siparis o full join sirketler c
on o.sirket_id=c.sirket_id;

--35.SELF JOIN : tablonun kendi icerisindeki bir sütun üzerinde INNER JOIN yapilmasidir.

CREATE TABLE personel4  (
id int,
isim varchar(20),  
title varchar(60),  yonetici_id int
);
INSERT INTO personel4 VALUES(1, 'Ali Can', 'SDET', 2);
INSERT INTO personel4 VALUES(2, 'Veli Cem', 'QA', 3);
INSERT INTO personel4 VALUES(3, 'Ayse Gul', 'QA Lead', 4);  
INSERT INTO personel4 VALUES(4, 'Fatma Can', 'CEO', 5);

select * from personel4

SELECT p2.isim personel,p1.isim yonetici
FROM personel4 p1
INNER JOIN personel4 p2
ON p1.id=p2.yonetici_id;0

SELECT p1.isim,p2.isim FROM personel4 as p1, personel4 as p2
WHERE p1.yonetici_id = p2.id;

--developers tablosu-contact_info tablosunu
--tüm developerların isim,email ve iletişim adresindeki şehirleri görüntüleyiniz.ÖDEVV
--iletişim adresi olan tüm developerların isim,email ve iletişim adresindeki şehirleri görüntüleyiniz.ÖDEVV


--36.LIKE COND.: WHERE komutundan sonra sorgulama yaparken pattern(desen-kalıp ifadeler) kullanmamızı sağlar.

--ILIKE : LIKE ile ayni ancak case insensitive: küçük/büyük harf duyarsız 

SELECT * from developers;
SELECT * from developers where name='Gülsüm';

--% wildcard(joker) : 0 veya daha fazla karakter

--Ismi A harfi ile baslayan devlerin tüm bilgilerini yazdiran QUERY yazin
SELECT * from developers where name like 'A%';

--a harfi ile biten şehirde çalışan dev isimlerini ve şehirlerini yazdiran QUERY yazin

SELECT name,city from developers where city like '%a';
SELECT name,city from developers where city Ilike '%A';


SELECT name,salary,city from developers where name ilike 'a%t';

--Ismi içinde 'il' olan dev isimlerini ve maaşlarını yazdiran QUERY yazin
SELECT name,salary from developers where name ilike '%il%';

SELECT name,salary from developers where name ~~ '%il%';

--LIKE  yazmak yerine PostgreSQL de ~~ yazabiliriz
--ILIKE yazmak yerine PostgreSQL de ~~* yazabiliriz

--Ismi içinde i ve a olan devlerin tüm bilgilerini yazdiran QUERY yazin
SELECT * from developers where name ilike '%i%' and  name ilike '%a%';

SELECT * from developers where name ilike '%i%a%' or name ilike '%a%i%';

--underscore (_): bir karakteri temsil eder

--Isminin ikinci harfi ü olan devlerin tum bilgilerini yazdiran QUERY yazin
SELECT * from developers where name ilike '_ü%';


--Kullandığı prog. dili 4 harfli ve üçüncü harfi v olan devlerin tum bilgilerini yazdiran QUERY yazin
SELECT * from developers where prog_lang ilike '__v_';

--Kullandığı prog. dili en az 5 harfli ve ilk harfi J olan devlerin tum bilgilerini yazdiran QUERY yazin
SELECT * from developers where prog_lang ilike 'J____%';

--Isminin 2. harfi i,4. harfi a olan devlerin tum bilgilerini yazdiran QUERY yazin
SELECT * from developers where name ilike '_i_a%';

--ismi boşluk içeren devlerin tum bilgilerini yazdiran QUERY yazin:ÖDEV

--REGEXP_LIKE:(~) regular expression kullanarak karşılaştırma yapmamızı sağlar.



CREATE TABLE words
( 
  word_id int UNIQUE,
  word varchar(50) NOT NULL,
  number_of_letters int
);

INSERT INTO words VALUES (1001, 'hot', 3);
INSERT INTO words VALUES (1002, 'hat', 3);
INSERT INTO words VALUES (1003, 'Hit', 3);
INSERT INTO words VALUES (1004, 'hbt', 3);
INSERT INTO words VALUES (1008, 'hct', 3);
INSERT INTO words VALUES (1005, 'adem', 4);
INSERT INTO words VALUES (1006, 'selim', 6);
INSERT INTO words VALUES (1007, 'yusuf', 5);
INSERT INTO words VALUES (1009, 'hAt', 3);
INSERT INTO words VALUES (1010, 'yaf', 5);

SELECT * FROM words;


--[] icerisinde bulunan harflerden en az birini iceren kayitlari getirir.
-- ~* case insensitive olarak kullanmamizi saglar


--Ilk harfi h,son harfi t olup 2.harfi a veya i olan 3 harfli kelimelerin tum bilgilerini yazdiran QUERY yazin
SELECT * FROM words WHERE word ~ 'h[ai]t$';
SELECT * FROM words WHERE word ~* 'h[ai]t$';

--[-] icerisinde bulunan iki harf arasindaki tüm harflerden en az birini iceren kayitlari getirir.

--h harfinden sonra a ile k arasinda olan bir harf daha sonra t harfi olan kelimelerin  tum bilgilerini  yazdiran QUERY yazin
 SELECT * FROM words WHERE word ~* 'h[a-k]t';


-- Icinde m veya i olan kelimelerin tum bilgilerini yazdiran QUERY yazin
SELECT * FROM words WHERE word ~* '[mi]';
SELECT * FROM words WHERE word ~~* '%m%' or word ~~* '%i%';

-- ^: baslangici ifade eder

--a veya s ile baslayan kelimelerin tum bilgilerini yazdiran QUERY yazin
SELECT * FROM words WHERE word ~* '^[as]';

-- $: bitisi belirtir.

-- m veya f ile biten kelimelerin tum bilgilerini yazdiran QUERY yazin
SELECT * FROM words WHERE word ~* '[mf]$';

-- (.*): 0 veya cok karakter

--y ile başlayıp f ile biten kelimelerin tum bilgilerini yazdiran QUERY yazin
SELECT * FROM words WHERE word ~* '^y(.*)f$'; -- .* da(parantez olmadan) kullanilabilir

--.:tek karakter

--y ile başlayıp f ile biten 3 harfli kelimelerin tum bilgilerini yazdiran QUERY yazin
SELECT * FROM words WHERE word ~* '^y(.)f$';


-- NOT LIKE: verilen desen seklinde olmayanlari getirir.
-- !~ : verilen desen seklinde olmayanlari getirir.

-- ilk harfi h olmayan kelimelerin tum bilgilerini yazdiran QUERY yazin
SELECT * FROM words WHERE word !~* '^h';

SELECT * FROM words WHERE word NOT LIKE 'h%';


--[] icerisinde ^ degil anlami icerir
SELECT * FROM words WHERE word ~* '^[^h]';


--2. harfi e,i ve o olmayan kelimelerin tum bilgilerini yazdiran QUERY yazin. ÖDEVVV3:)






-37.UPPER,LOWER,INITCAP










