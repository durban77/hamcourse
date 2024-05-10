---
marp: true
title: HA5KDR rádióamatőr konzultáció
author: Urbán Dániel
paginate: true
theme: gaia
---

# Rádióamatőr vizsgára felkészítő tanfolyam

11. Fejezet: Mérések

Mai előadó: Urbán Dániel - HA5UDS

Készült: [marp](https://marp.app/) [vscode](https://code.visualstudio.com/) [github](https://github.com/durban77/hamcourse)

---

# Villamosság-, elektromágnesesség-, és rádióelmélet

```markdown
* Bevezető alkalom
* Általános tárgykör / Matematikai és fizikai alapok
* Műszaki tárgykör / Villamosság-, elektromágnesesség-, és rádióelmélet
* Műszaki tárgykör / Alkatrészek
* Jogi tárgykör / Jogi anyag
* Forgalmazási tárgykör / Forgalmi ismeretek
* Műszaki tárgykör / Áramkörök
* Műszaki tárgykör / Vevők
* Műszaki tárgykör / Adók
* Műszaki tárgykör / Antennák és tápvonalak
* Műszaki tárgykör / Hullámterjedés
* Műszaki tárgykör / ▶ Mérések ◀
* Műszaki tárgykör / Zavarás és védelem
* Biztonságtechnika / Villamos biztonságtechnika
```

---

# Témakörök

* Mérések végzése:			
  * egyen és váltakozó feszültség és áram mérése
  * ellenállás mérése
  * egyenáramú és rádiófrekvenciás teljesítmény mérése: átlagos teljesítmény, csúcs burkoló teljesítmény (PEP)
  * feszültség- állóhullámarány (VSWR) mérése
  * frekvenciamérés
* Mérőműszerek:			
  * rádiófrekvenciás teljesítménymérő
  * reflektométer híd, állóhullámarány-mérő (SWR-mérő)
  * műterhelés
			
---

## Mérés :straight_ruler:

* A mérés egy adott mennyiség értékének megállapítása egy referencia értékhez képest.

* Az eredményt mérőszámban fejezzük ki, egy adott mérési egységben.

* A mérés közvetlen vagy közvetett (összehasonlító).

* Számszerűsítéshez mérőeszközt használunk.

---

## Feszültség mérése $-(\mathrm{V})-$

Az elektromos feszültség mérésére alkalmas eszköz a feszültségmérő műszer, röviden voltmérő.
A voltmérő a kivezetéseihez kapcsolt két pont közötti feszültséget méri.
![voltmeter](https://www.haines.com.au/media/catalog/product/cache/bf4490911b5ba2703a20a3d6921b1096/d/c/dc_voltmeger_5v_1_.png)

---

## Áram mérése $-(\mathrm{A})-$

Az elektromos áram mérésére alkalmas eszköz a áramerősség-mérő műszer, röviden árammérő.
Az árammérő a kivezetéseihez kapcsolt ponton átfolyó áram mértékét méri.
![ammeter](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6CLfykghHusN7mAwq_c5TustkJB6JO1-TIi5GcFFMNw&s)

---

- Egyenáram (angolul Direct Current/DC): az áramkörben a töltéshordozók állandó vagy változó mennyiségben, de egyazon irányban haladnak. Jele: = vagy &#x2393;
- Váltakozó áram (angolul Alternating Current/AC): erőssége és iránya periodikusan változik. Jele: ~
![multimeter](https://m.media-amazon.com/images/I/61vm1TOopjL._AC_UF894,1000_QL80_.jpg)

---

## Váltakozó áram feszültsége és áramerőssége

![rms](https://www.dummies.com/wp-content/uploads/309557.image0.jpg)

    Váltakozó áram esetén általában az effektív értéket mérjük.
    Egyenirányítással vagy az egyenértékű hatás mérésével lehetséges.

---

## Ellenállás mérése

* Feszültség és áram méréssel mérhetünk ellenállás értékeket
* Közvetlenül összehasonlító módszerrel, vagy hídkapcsolással
* Áramkörből kivett ellenállást mérhetünk

---

### Ellenállás mérése - összehasonlítással

[Dekád ellenállás](https://nl.aliexpress.com/item/1005005549049605.html)t sorbakötünk és addig változtatjuk a dekádok értékét, amíg egyforma feszültséget nem mérünk.

![példa dekád ellenállás](https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Dek%C3%A1d-ellen%C3%A1ll%C3%A1s.jpg/750px-Dek%C3%A1d-ellen%C3%A1ll%C3%A1s.jpg)

---

### Ellenállás mérése - hítkapcsolással

A kapcsolás elve az, hogy amennyiben $R1 \over R2$ = $Rx \over R3$, akkor az ábrán $C$-vel és $B$-vel jelölt pontok feszültsége megegyezik, ezért a $V$ galvanométeren nem folyik áram. [Ekkor a híd kiegyenlített.](https://www.falstad.com/circuit/e-wheatstone.html)

![Whetstone híd](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Wheatstone_Bridge.svg/330px-Wheatstone_Bridge.svg.png)

---

## egyenáramú teljesítmény mérése

A teljesítményt úgy kapjuk meg, ha a fogyasztóra kapcsolt feszültséget megszorozzuk az átfolyó áram erősségével.
$P = U \times I$, ahol $P$ a terjesítmény wattban, $U$ a feszültség voltban, $I$ az áramerősség amperban.
[Próba mérés](https://dcaclab.com/lab)
* $12 V$ feszültségű telep,  $50 \Omega$ értékű ellenállás, kösd össze, hogy folyjon az áram!
* Mérd meg, hogy valóban $2.88W$-t mutat a teljesítmény mérő!

---

## [rádiófrekvenciás teljesítmény mérése](https://www.tek.com/en/documents/application-note/fundamentals-ac-power-measurements)
![ac teljesítmény](https://www.tek.com/-/media/marketing-docs/f/fundamentals-ac-power-measurements-en/fig-4.png?w=1075)

---

## feszültség- állóhullámarány (VSWR) mérése

TBD

---

## frekvenciamérés

TBD

---

## Jegyzetek

Gyakori mérések : 
Multiméterrel: sípolás, feszültség, ellenállás, áram
Multiméterrel: ne mérj ellenállást feszültség alatt

Az elektromágneses mérések műszerrel történnek. Ha nem azzal, akkor általában baj van.

DC->AC 20kHz Multiméter
Felette teljesítménymérő, SWR mérő, 

𝑆𝑊𝑅 = 𝑉𝑚𝑎𝑥 / 𝑉𝑚𝑖𝑛 = 𝑉𝐹+𝑉𝑅 / 𝑉𝐹−𝑉𝑅


---

# Befejezés

## Ajánlott irodalom
[15/2013. (IX. 25.) NMHH rendelet a rádióamatőr szolgálatról](https://net.jogtar.hu/jogszabaly?docid=a1300015.nmh)
[ha5kdr jegyzet](https://www.ha5kdr.hu/uploads/2015/10/jegyzet.pdf)
[puskás jegyzet](http://www.puskas.hu/r_tanfolyam/r_tananyag.html)