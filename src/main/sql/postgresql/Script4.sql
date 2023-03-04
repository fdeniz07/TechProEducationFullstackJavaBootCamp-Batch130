--DAY 4

--Practice6 benzer soru
--Müşteriler tablosundan müşteri isminin baş harfi 'A' ile 'J' arasında olan verileri listeleyiniz.
SELECT *
FROM musteriler
WHERE musteri_isim BETWEEN 'A' AND 'K';--- J-> Jo

SELECT *
FROM musteriler
WHERE LEFT(musteri_isim,1) BETWEEN 'A' AND 'J';--- J-> Jo

--22.a-Subqueries: Where ile kullanimi
--bir SQL sorgusu içerisinde sonucundan yararlandığımız diğer sorguya
--ALT SORGU(subquery) denir.


select * from markalar;
select * from calisanlar3;

--marka id si 100 olan calisanlari listeleyiniz

--1.Yol
select marka_isim 
from markalar
where marka_id=100;

select *
from calisanlar3
where isyeri='Vakko'

--2.Yol
select *
from calisanlar3
where isyeri=(	select marka_isim 
				from markalar
				where marka_id=100);

--Interview Question: tablosunda max maasi alan calisanin fieldlarini gösteriniz
Select * 
from calisanlar3
where maas=(select max(maas) from calisanlar3);


--Interview Question:calisanlar3 tablosunda ikinci en yüksek maaşı gösteriniz.ÖDEV

--Interview Question:calisanlar3 tablosunda max veya min maaşı alan çalışanların tüm fieldlarını gösteriniz.
--1.Yol
Select * 
from calisanlar3
where maas= (select max(maas) from calisanlar3) 
				or 
	  maas=(select min(maas)from calisanlar3);

--2.Yol
Select * 
from calisanlar3
where maas in ((select max(maas) from calisanlar3), 
			  (select min(maas)from calisanlar3));
			  
-- Çalisan sayisi 15.000’den cok olan markalarin isimlerini ve bu markada calisanlarin isimlerini ve maaşlarini listeleyin.
select isim,maas,isyeri
from calisanlar3 where isyeri in (
									select marka_isim 
									from markalar 
									where calisan_sayisi>15000
							   	 );


select * from markalar;
select * from calisanlar3;

-- Ankara'da calisani olan markalarin marka id'lerini ve calisan sayilarini listeleyiniz.

select marka_id,calisan_sayisi
from markalar
where marka_isim in( 
						select isyeri 
						from calisanlar3 
						where sehir='Ankara'
					);

select marka_id,marka_isim,calisan_sayisi
from markalar
where marka_isim in( 
						select isyeri 
						from calisanlar3 
						where sehir='Ankara'
					);
					

-- marka_id'si 101’den büyük olan marka çalişanlarinin isim, maaş ve şehirlerini listeleyiniz.

select * from markalar;
select * from calisanlar3;

select isim,maas,sehir
from calisanlar3
where isyeri in(
					select marka_isim 
					from markalar 
					where marka_id>101
				);
					
					

--22.b-Subqueries: aggregate fonk.kullanimi

--Her markanin id'sini,ismini ve toplam kac sehirde bulundugunu listeleyen bir sorgu yaziniz

select * from markalar;
select * from calisanlar3;

select marka_id,marka_isim,(
								Select count(isyeri) 
								from calisanlar3 
								where isyeri=marka_isim
						   )
from markalar;
--ilişkili subquery(corralated sq)

--Distinct komutu : tekrarli datalardan sadece birini alir.
Select Count(Distinct sehir) 
from calisanlar3;

Select marka_isim,calisan_sayisi,(
									Select max(maas) 
									from calisanlar3 
									where isyeri=marka_isim
							     ) max_maas,
								 (
									Select min(maas) 
									from calisanlar3 
									where isyeri=marka_isim
							     ) min_maas
From markalar;


--23.Exists Condition
--Bir SQL sorgusunda alt sorgunun sonucunun boş olup olmadığını kontrol etmek için kullanılır.
--Eğer alt sorgu sonucu boş değilse, koşul sağlanmış sayılır ve sorgunun geri kalanı işletilir.
--Alt sorgu en az bir satır döndürürse sonucu EXISTS doğrudur.
--Alt sorgunun satır döndürmemesi durumunda, sonuç EXISTS yanlıştır.
--Exist geriye true/false döndürür


CREATE TABLE mart
(	
urun_id int,	
musteri_isim varchar(50),
urun_isim varchar(50)
);
INSERT INTO mart VALUES (10, 'Mark', 'Honda');
INSERT INTO mart VALUES (20, 'John', 'Toyota');
INSERT INTO mart VALUES (30, 'Amy', 'Ford');
INSERT INTO mart VALUES (20, 'Mark', 'Toyota');
INSERT INTO mart VALUES (10, 'Adam', 'Honda');
INSERT INTO mart VALUES (40, 'John', 'Hyundai');
INSERT INTO mart VALUES (20, 'Eddie', 'Toyota');
CREATE TABLE nisan 
(	
urun_id int ,
musteri_isim varchar(50),
urun_isim varchar(50)
);
INSERT INTO nisan VALUES (10, 'Hasan', 'Honda');
INSERT INTO nisan VALUES (10, 'Kemal', 'Honda');
INSERT INTO nisan VALUES (20, 'Ayse', 'Toyota');
INSERT INTO nisan VALUES (50, 'Yasar', 'Volvo');
INSERT INTO nisan VALUES (20, 'Mine', 'Toyota');

select * from mart;
select * from nisan;

--Mart ayında 'Toyota' satışı yapılmışsa nisan ayındaki tüm ürünlerin bilgilerini listeleyiniz

select * 
from nisan
where exists (
				select *
				from mart
				where urun_isim='Toyota'
			 );

--EXISTS False dönerse

--Mart ayında 'Volvo' satışı yapılmışsa Nisan ayındaki tüm ürünlerin bilgilerini listeleyiniz.

select * 
from nisan
where exists (
				select *
				from mart
				where urun_isim='Volvo'
			 );

--Mart ayında satılan ürünün urun_id ve musteri_isim'lerini, eğer Nisan ayında da satılmışsa, listeleyen bir sorgu yazınız. 
select urun_id,musteri_isim 
from mart m
where exists (
				select *
				from nisan n
				where n.urun_id=m.urun_id
			 );


---Her iki ayda birden satılan ürünlerin URUN_ISIM'lerini ve bu ürünleri
--NİSAN ayında satın alan MUSTERI_ISIM'lerini listeleyen bir sorgu yazınız.

select urun_isim,musteri_isim
from nisan
where exists (
				select *
				from mart
				where mart.urun_isim = nisan.urun_isim
			);


--Martta satılıp Nisanda satilmayan ürünlerin URUN_ISIM'lerini ve bu ürünleri
--MART ayında satın alan MUSTERI_ISIM'lerini listeleyen bir sorgu yazınız.

select urun_isim,musteri_isim
from mart m
where not exists (
					select *
					from nisan n
					where n.urun_isim = m.urun_isim
				);

