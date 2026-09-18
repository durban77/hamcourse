---
marp: true
title: Villamos biztonságtechnika (HAREC)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Villamos biztonságtechnika

## HAREC fokozat

---

# Az áram hatása a szervezetre

- **érzetküszöb:** ~1 mA (50-60 Hz AC), 5-6 mA (DC) — még nem érzékelhető
- **elengedési áram:** ~15 mA (AC), 70-80 mA (DC) — a vezetéket már nem lehet elengedni
- 30-40 mA (AC) felett eszméletvesztés, légzésbénulás, szívbénulás lehetséges
- minél nagyobb az áram, annál rövidebb idő is életveszélyes (pl. 100 mA már 0,1-0,3 s alatt halálos lehet)

---

# Áramút és testellenállás

- veszélyesebb, ha az áram életfontosságú szerveken (szív, agy) halad át — legveszélyesebb: fej-bal láb közötti út
- az emberi test ellenállása a feszültséggel fordítva arányos
- a bőr csak addig véd, amíg a feszültség nem üti át a felhámot — ekkor az ellenállás pár száz Ω-ra csökken
- nagyfrekvencián (>100 kHz) az áram már nem izom-/idegingert, csak hőhatást (égést) okoz

---

# Elsősegélynyújtás

- a balesetest ki kell szabadítani az áramkörből (**műszaki mentés**)
- meg kell állapítani a következményeket (**diagnózis**)
- azonnal (4 percen belül) el kell kezdeni a szükséges elsősegélyt
- egyidejűleg mentőt/orvost kell hívni — a sérültet ekkor is orvosi felügyelet alá kell helyezni

---

# Érintésvédelem — alapfogalmak

- **földelés:** a test/vezető rész tudatos összekötése a földdel
- **érintési feszültség:** a hibafeszültségnek az a része, amit az ember testével áthidalhat
- **védővezető:** a földet és a készüléket összekötő vezető, ami az alapvető érintésvédelmet biztosítja

---

# Vezeték színjelölés

- **1-fázisú rendszer:** fázisvezető — fekete, nullavezető — világoskék, védővezető — zöld-sárga
- **3-fázisú rendszer:** R — zöld, S — sárga, T — piros; a nullázó/védővezető zöld-sárga
- a helyes bekötés életbiztonsági kérdés

---

# Érintésvédelmi osztályok

| Osztály | Jellemző |
|---|---|
| 0 | csak üzemi szigetelés, nincs védővezető |
| I | védővezető-csatlakozás van |
| II | kettős/megerősített szigetelés |
| III | törpefeszültségű táplálás |

---

# Érintésvédelem módjai

- **védővezető nélküli:** törpefeszültség, kettős szigetelés, védőelválasztás (elválasztó transzformátor)
- **védővezetős:** védőföldelés, olvadóbiztosíték/kismegszakító, áram-védőkapcsoló
- **passzív védelem:** elkerítés — nem szünteti meg a veszélyt, csak a véletlen érintést akadályozza

---

# Kettős szigetelés és védőelválasztás

- **kettős szigetelés:** a készülék testét a kezelőtől elszigeteli — az így védett készüléket **nem szabad** leföldelni
- **védőelválasztás:** biztonsági transzformátorral földeletlen feszültséggel táplált fogyasztó — a nagy szigetelési ellenállás korlátozza a hibaáramot

---

# Védőföldelés és biztosítók

- jó földelés: kis földelési ellenállás (vezető, átmeneti és szétterjedési ellenállás összege)
- a védővezető csak hiba (testzárlat) esetén vezet áramot — állapota kritikus
- **biztosítók:** túláram esetén megszakítják az áramkört — gyors (F/FF) és lassú (T/N) kioldási karakterisztika
- csere előtt mindig feszültségmentesítsünk, és csak azonos típusú/értékű biztosítót használjunk

---

# Telepes és hálózati táplálás

- **telepes táplálás:** 6-24 V tartományban áramütés veszélye csekély, de rövidzár esetén nagy áram → ív, melegedés, tűzveszély
- **hálózati tápegység:** kritikus elem a transzformátor — jó primer-szekunder szigetelés, törésmentes kábelbevezetés, primer oldali biztosító szükséges

---

# Feltöltött kondenzátor veszélye

- a feszültségforrás megszűnése után a kondenzátoron feszültség marad
- egy **feszültségmentesített** berendezés is okozhat áramütést!
- villamos utóhatás: kisütés után rövid idő múlva ismét feszültség jelenhet meg a fegyverzeteken
- veszélyes: fázisjavító kondenzátor, hosszú kábelek felhalmozott töltése, elektrosztatikus feltöltődés

---

# Nagyfeszültségű berendezések érintésvédelme

- 1000 V feletti berendezéseknél már a **megközelítés** is áramütést okozhat, nem csak az érintés
- követelmény: megfelelő szigetelés, elkerítés, burkolat

---

# Elektromágneses tér egészségügyi hatása

- erős elektromos/mágneses tér energiát adhat le a szervezetnek, melegítheti a szöveteket, zavarhatja a test elektromos jelenségeit (agyi/szív aktivitás)
- sugárzó források: rádióadók, mobiltelefon-átjátszók, egyes háztartási eszközök (hajszárító, mikrohullámú sütő)
- az emberi egészségre gyakorolt pontos hatás ("elektroszmog") kutatás tárgya

---

# Villámcsapás mechanizmusa

- zivatarkor a légrétegek közötti töltéskülönbség villámkisülésben oldódik fel
- a villám a legkisebb ellenállású utat keresi — magas épület, fa, **antenna**
- a villámáram több ezer amper is lehet

---

# Villámvédelem — antenna elhelyezés és földelés

- az antennaárbocot mindig le kell földelni
- a villámvédelmi földelést **nem szabad** összekötni az érintésvédelmi földeléssel
- a levezető kábelen a villám a lakótérbe is eljuthat, súlyos károkat okozva

---

# Zivatar közeledésekor

- a rádióösszeköttetést haladéktalanul be kell fejezni
- az antennát le kell földelni
- a levezető kábelt el kell távolítani a rádiókészüléktől

---

# Másodlagos villámvédelem és lépésfeszültség

- a közelben lecsapó villám a hálózati/telefonvezetékekben is nagy feszültséget indukálhat → célszerű a berendezést ezekről is leválasztani
- a leföldelt árboc talppontja körül a nagy áram miatt jelentős feszültség alakulhat ki, ami a földtől távolodva gyorsan csökken
- **lépésfeszültség:** két lábunk között a talajon fellépő veszélyes feszültségkülönbség villámcsapás után

---

# Összefoglalás

- az áramütés veszélye az áramerősségtől, az áramúttól és a behatási időtől függ
- érintésvédelem: védővezetős és védővezető nélküli módok, érintésvédelmi osztályok
- feszültségmentesített berendezés (kondenzátor!) is lehet veszélyes
- villámvédelem: antenna földelése, zivatar esetén leválasztás — a villámvédelmi és érintésvédelmi földelés különböző
