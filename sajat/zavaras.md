---
marp: true
title: HA5KDR rádióamatőr konzultáció
author: Urbán Dániel
paginate: true
theme: gaia
---

# Rádióamatőr vizsgára felkészítő tanfolyam

12. Fejezet: Zavarás és védelem

Mai előadó: Urbán Dániel - HA5UDS

Készült: [marp](https://marp.app/) [vscode](https://code.visualstudio.com/) [github](https://github.com/durban77/hamcourse)

---

## Zavarás és védelem

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
* Műszaki tárgykör / Mérések
* Műszaki tárgykör / ▶ Zavarás és védelem ◀
* Biztonságtechnika / Villamos biztonságtechnika
```

---

### Zavarkibocsátás és zavartűrés
    Zavarok elektronikus berendezésekben:
      * intermoduláció
      * zavarok a hasznos jelben (TV, rádió)
      * zavarok a hangfrekvenciás áramkörökben
    Zavarok oka elektronikus berendezésekben:
      * adó térerőssége
      * adó zavaró sugárzásai
    Zavarok elleni védekezés módjai, megelőzés és elhárítás:
      * szűrés
      * csatolásmentesítés
      * árnyékolás
      * teljesítmény csökkentés
      * adó- és TV-antenna eltávolítása egymástól
      * egyik végén táplált félhullámú antenna elkerülése
      * jó viszony a szomszédokkal

---

# Zaj (﹙˓ 📶 ˒﹚)

Zaj a hasznos információhoz hozzáadódó felesleges, ahhoz nem tartozó jel, amely a hasznos jel értelmezését nehezíti. 

### Ha hallani akarod, akkor jel, 
### ha nem akarod hallani, akkor zaj.

---

# QRN

### Légköri jelenségek ⛈️ 🌀 🌪️

Nézzük meg élőben: [Villámok](https://www.blitzortung.org/en/live_lightning_maps.php?map=10)

### Kozmikus jelenségek 🌌 ☀️ 🌠

Nézzük meg az előrejelzést: [Napfoltok](https://www.swpc.noaa.gov/products/solar-cycle-progression)

###### Hő- és sörétzaj

---

# QRM

### Nem szándékos zavarok ⚡ 🔋 🛞

Elektromos eszközök, bármi amiben szikra van, elektromos hálózat.

### Szándékos zavarok 📺📻 🛩 🔌 🗿

BC, horizont alatti radar, kapcsoló üzemű táp, rosszul beállított amatőr rádió adó.

---

### Zajok várható eloszlása forrásaik szerint (RH)

![zajok, vu2nsb, 2020](https://vu2nsb.com/wp-content/uploads/2019/11/5-Total-noise-.jpg)

---

### Zavarok az amatőr sávon belül - másik operátor

* QRL? Mindig kérdezzük meg, hogy szabad-e a frekvencia!
* QRP. A lehető legkisebb szükséges teljesítménnyel rádiózz!
* Figyeld meg a saját kibocsátott jeledet, ha lehet. 
* Hallgass a kapott riportokra, és adj te is helyes riportot.
![minta](https://www.onallbands.com/wp-content/uploads/2022/01/Ham-Radio-Splatter.png)

---

### interferenciás zavarok

1. zavaró adás ugyanazon a frekvencián
1. zavaró adás a szomszédos csatornán
1. túl erős jel a hasznos jeltől távolabb
1. keverés nem kívánt melléktermékei - intermoduláció
![mixer](https://www.digikey.com/en/articles/~/media/Images/Article%20Library/TechZone%20Articles/2011/October/The%20Basics%20of%20Mixers/article-2011october-the-basics-of-mixers-fig1.jpg)

---

## Intermoduláció - interferencia

Két frekvencia keveredése, újabb komponensek megjelenése.

![IM](https://docs-be.ni.com/bundle/rfmx-specan/page/GUID-D2ABE034-1CC0-4208-AEED-5180F700BD79-a5.png?_LANG=enus)

Okai lehetnek: rossz csatlakozás, erős másik állomás, nem lineáris erősítés.

---

## zavarok a RF jelben és hangfrekvenciás áramkörökben

Az adó térerőssége nem kívánt jelet gerjeszthet más áramkörökben.
A rádiófrekvenciás jel demodulálódhat és megzavarhatja az áramkört.

Tápvonal felől is érkezhet zavaró jel. 
Minél közelebb a zavaró adás, annál nagyobb a hatása.

Zajzár (S, CTCSS), AGC, RF gain, filter-ek.

---

#### 🔍 zavarforrás megtalálása 

Mikor jelentkezik? Meddig tart? Hogyan ismétlődik? Milyen frekvenciákon jelentkezik? Időjárásfüggő? 

Irányfüggő antennával, a vevő helyének változtatásával. 🦊

![legegyszerűbben](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4gibz__tH8wplOocXpilN89Wj5Pcr24GG4FADJl2sBw&s)

🔋 Próbáljuk meg a vevőnket telepről is üzemeltetni!

---

#### 🔍 népszerű zavarforrások

1. kapcsoló üzemű tápegység
1. földelés hiánya
1. szakadt kábel, rossz csatlakozó
1. hálózati áramról jövő zaj

Ha nem találjuk meg, akkor mi menjünk odébb.

Vagy védekezzünk ellene, ahogyan tudunk!

--- 

## A zavarok elleni védekezés módjai, a zavarok megelőzésére és elhárítására tett intézkedések

    Az amatőrállomás által okozott, illetve tűrt rádiózavarokra vonatkozóan az 
    Eht. 56. §-a az irányadó:

    Elektronikus berendezések, amelyek alkalmasak arra, hogy elektromágneses zavart okozzanak, 
    vagy amelyek működésére ilyen zavar hatással lehet, úgy kell üzemben tartani, 
    hogy az más, zavarérzékenység szempontjából egyébként megfelelő elektronikus berendezés 
    működésében zavart ne okozzon.

    A hírközlő berendezés működésében zavart okozó berendezés 
    üzemben tartója köteles a zavart megelőzni, a keletkezett zavart megszüntetni.

---

### 🔇 szűrés

Nem kívánt frekvenciájú jelet szűrjük ki vele. Ez lehet a saját kibocsátott jelünk is!
Nagyfrekcenciás zaj minden digitális áramkörből jöhet, és mindegyikre rossz hatással van. Használj zajszűrő ferritet!

![rossz fiú](https://content.cdntwrk.com/files/aHViPTg1NDMzJmNtZD1pdGVtZWRpdG9yaW1hZ2UmZmlsZW5hbWU9aXRlbWVkaXRvcmltYWdlXzVjZDVkMDJhOWE1ZjAuanBnJnZlcnNpb249MDAwMCZzaWc9NjIwMDgzYjRiZDg3Y2ViZDI2Njk5MjE0MzM5Mjg3ZDU%253D)

---

### 🔇 csatolásmentesítés

Nem kívánt csatoló hatás elleni intézkedések: antenna és tápvonal.
Kondenzátor DC stop, AC mehet; Tekecs DC mehet, AC stop.

![két antenna](https://www.elecbee.com/image/cache/catalog/Raspberry-Pi-and-Orange-Pi/MMDVM-HS-Dual-Hat-Duplex-Relay-Expansion-Module-Board-with-OLED-Screen-for-Raspberry-Pi-1540384-3-500x500.jpeg)

---

### 🔇 árnyékolás

Elektromágneses sugárzás benttartására, vagy kirekesztésére.

![árnyékolás](https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Electromagnetic_shielding_inside_mobile_phone.jpg/640px-Electromagnetic_shielding_inside_mobile_phone.jpg)

---

### 🔇 teljesítmény csökkentés

A teljesítmény csökkentésével a máshogyan nem megoldható zavarkeltő hatás is csökken.

### 🔇 adó és vevő antenna eltávolítása egymástól

Amennyiben megoldható, az adó antenna eltávolításával a nem kívánt vevő antennáétól szintén csökkenthető a zavarás.

---

### 🔇 egyik végén táplált félhullámú antenna elkerülése

Ez az antennatípus könnyen kisugároz más kimenő jelet is, így ha nem megfelelő tisztaságú jelet sugárzunk, azzal olyan frekvencián is adunk, amit nem is sejtettünk.
És az az antenna ami kisugárzásra jó, az vételre is remek, így vevőnkön is több jelet kapunk, mint szeretnénk.

---

### 🔇 jó viszony a szomszédokkal

Legyünk jó kapcsolatban a szomszédokkal, tájékoztassuk őket milyen tevékenységet folytatunk, annak milyen hatásai lehetnek az általuk üzemeltetett vevőberendezésekre.

Megfelelően illesztett tápvonalat és antennát használjunk, ne termeljünk kéretlen és hasznontalan sugárzást.

---

### 📻 tippek a zavarmentes rádiózáshoz

* válasszuk le berendezésünket a hálózati áramforrásról
* használjunk jó rádiófrekvenciás földelést
* szűréssel és csatolásmentesítéssel gondoskodjunk róla, hogy a  jelünk ne jusson át másik hálózatba (telefon, tv, áram)
![fo4](https://static.wikia.nocookie.net/fallout/images/d/dd/FO76_Ham_radio_render.png/revision/latest?cb=20210410021710)
---

# Befejezés

## Ajánlott irodalom
[15/2013. (IX. 25.) NMHH rendelet a rádióamatőr szolgálatról](https://net.jogtar.hu/jogszabaly?docid=a1300015.nmh)
[ha5kdr jegyzet](https://www.ha5kdr.hu/uploads/2015/10/jegyzet.pdf)
[puskás jegyzet](http://www.puskas.hu/r_tanfolyam/r_tananyag.html)
[What is Noise?, The Beacon](https://www.westmountainradio.com/pdf/Quarter-1-2022.pdf)
[Eht.](https://net.jogtar.hu/jogszabaly?docid=a0300100.tv)