---
marp: true
title: Zavarás és védelem (HAREC)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Zavarás és védelem

## HAREC fokozat

---

# Zaj és zavar

- **zaj:** nemkívánatos jelenség, ami mindig is létezett (természetes) vagy az ember tevékenységéből ered (ipari)
- **zavar:** a kezelő szempontjából minden nemkívánatos jelenség, ami a hasznos jel mellett megjelenik
- zavarni csak **rádió-vevőberendezést** lehet
- természetes zaj jelölése: **QRN**; ipari eredetű zaj jelölése: **QRM**

---

# Természetes zajok

- **légköri zajok:** frontfelületek súrlódása, villámkisülések — RH-n jelentős, időjárásfüggő
- **galaktikus (kozmikus) zajok:** távoli égitestekről érkeznek — az ionoszféra 30 MHz alatt kiszűri, így elsősorban URH-n számottevő

---

# Ipari eredetű zavarok

- **szándékos zavarás:** a vevés szándékos megakadályozása (rosszindulatú vagy hadicselekmény jellegű)
- **nem szándékos zavarás:** ipari/civil berendezések vagy más adók nemkívánt melléktermékei
- **splatter (fröcsögés):** torzító végfokozat széles sávban sugárzott nemkívánt jele, zavarja a sávtársakat

---

# Interferencia típusai

- **azonos csatornás:** két adó azonos frekvencián — védekezés: polarizáció, területi elkülönítés
- **nem azonos csatornás:** szomszédos csatorna jele kerül a vevőbe
- **kombinációs (tükörfrekvenciás/oszcillátor-) interferencia:** a keverő oszcillátor vagy KF-sáv frekvenciájával egyező zavaró jel az alapsávba kerül

---

# Intermoduláció és keresztmoduláció

- **intermoduláció:** a bemeneti/KF fokozat túlvezérlése → nemkívánt keverési termékek a kimeneten
- **keresztmoduláció:** az erős zavaró adó modulációja "átüt" a kívánt jelre — a zavaró állomás a kívánt adás szüneteiben/alatta hallható
- vevő fontos jellemzője: mekkora jelszintet dolgoz fel érzékelhető intermoduláció nélkül

---

# Blokkolás

- erős zavaró jel túlvezérli a vevő AGC-jét → az erősítés lecsökken
- a hasznos jel detektálása ellehetetlenül, akár teljesen "lefullad" a vétel
- oka: nem megfelelő bemeneti szelektivitás vagy túl nagy erősítés a keverő előtt

---

# Zavarok a hasznos jelben és hangfrekvenciás körökben

- erős RF jel a TV vevőbe kerülve élvezhetetlenné teheti a képet/hangot
- hangfrekvenciás erősítők bemenetére kerülő RF jelet az erősítő részben demodulálhatja → hallható zavar a hangszóróban

---

# Adó okozta zavarok jellegzetes okai

- a kisugárzott frekvencia eltér a beállítottól
- a sávszélesség nagyobb a megengedettnél
- a kisugárzott teljesítmény nagyobb a szükségesnél
- mellékhullámú (szomszédos csatornás) sugárzás túl nagy
- a táphálózaton nem megfelelő leválasztás miatt RF jut ki
- a végfokozat illesztetlen az antennarendszerhez

---

# Vevő oldali zavarérzékenység okai

- nem megfelelő bemeneti nagyfrekvenciás szűrő
- AGC túl- vagy alulszabályoz
- rossz tükörfrekvenciás elnyomás
- illesztetlen antenna/tápvonal
- nem megfelelő árnyékolás, hibás zajzár

---

# Hogy ne okozzunk zavart

- mindig illesztett antennát és tápvonalat használjunk
- kerüljük a végén táplált félhullámú antennát (jól sugározza a felharmonikusokat is)
- az antennát ne telepítsük TV/más vevőantenna közelébe
- jó **RF földelés** — a hálózati védővezető vagy vízvezeték nem alkalmas erre

---

# További jó gyakorlat adás közben

- csak a szükséges minimális teljesítményt használjuk
- megfelelő elektromágneses árnyékolás
- szűrés és csatolásmentesítés, hogy az RF ne jusson a hálózatba/telefonvonalba
- mindig hallgassunk bele a sávba adás előtt
- ha nem megy az összeköttetés, próbáljunk más polarizációt/modulációt/frekvenciát — nem mindig a teljesítménynövelés a megoldás

---

# Hogy ne szenvedjünk zavart

- illesztett antenna és tápvonal a vevő oldalon is
- kerüljük nagyteljesítményű adók/ipari berendezések közelségét
- megfelelő árnyékolás, NF/KF szűrők
- hangfrekvenciás bemeneteken aluláteresztő szűrő
- megfelelő hálózati leválasztás

---

# Társadalmi felelősség

- sűrűn lakott, sok vevőkészülékkel rendelkező környezetben kerüljük a nagy teljesítményű (különösen CW) adást
- jó viszony a szomszédokkal: tájékoztassuk őket tevékenységünkről és annak esetleges hatásairól
- ez az önszabályozás és önképzés (amatőrök társadalmi kódexe) része

---

# Összefoglalás

- zavar: QRN (természetes) vagy QRM (ipari) eredetű lehet
- interferencia: azonos csatornás, szomszédos csatornás vagy kombinációs (tükörfrekvenciás)
- intermoduláció, keresztmoduláció, blokkolás — mind a nemlineáris túlvezérlés következményei
- védekezés: illesztés, árnyékolás, szűrés, minimális szükséges teljesítmény, jó szomszédi viszony
