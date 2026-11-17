# Gyakorló feladatlap 02 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_02.md](gyakorlo_irasbeli_kerdesek_02.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy olyan ellenállás-hálózatot, amelyben az R1 ellenállás sorba van kötve az egymással párhuzamosan kapcsolt R2 és R3 ellenállásokkal! Adja meg az eredő ellenállás kiszámításának képletét, és számítsa ki az értékét R1 = 47 Ω, R2 = 100 Ω, R3 = 150 Ω esetén!

**Elvárt megoldás:** Az R1 ellenállás a felső vezetékben van, a vége egy csomópontba fut. Innen az R2 és az R3 külön-külön ágban az alsó (visszatérő) vezetékre csatlakozik, vagyis egymással párhuzamosan. A hálózat két kivezetése az R1 szabad vége és az alsó vezeték. Az eredő ellenállás: Re = R1 + R2·R3 / (R2 + R3); számértékekkel R2 és R3 eredője 100·150 / 250 = 60 Ω, így Re = 47 + 60 = 107 Ω.

**Mintarajz:**
```text
o-----[R1]------*-----------+
|               |           |
|               |           |
| Re           [ ] R2      [ ] R3
|               |           |
|               |           |
v               |           |
o---------------*-----------+

Jelölések: [ ] ellenállás, * összekötött csomópont, o kivezetés; a nyíl az
  eredő (Re) mérési helye
```

**Magyarázat:** Először a párhuzamos részt helyettesítjük egyetlen ellenállással: két ellenállásnál R23 = R2·R3 / (R2 + R3), ami mindig kisebb a kisebbik ellenállásnál (itt 60 Ω < 100 Ω). Az így kapott ellenállás sorba kapcsolódik R1-gyel, ezért a két érték egyszerűen összeadódik. Bármilyen vegyes hálózat így, részenként egyszerűsíthető egyetlen eredő ellenállássá. Forrás: jegyzet/04_Alkatreszek.md, 4.1.4., 4.1.4.1. és 4.1.4.2.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Helyes kapcsolás: R1 sorosan, R2 és R3 párhuzamosan | 12 |
| Kivezetések és megnevezések (R1, R2, R3, Re) | 6 |
| Az eredő képletének felírása (soros + párhuzamos) | 6 |
| Számítás: R23 = 60 Ω, Re = 107 Ω (mértékegységgel) | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- R2 és R3 sorba kötése a rajzon (ekkor 47 + 100 + 150 = 297 Ω lenne az eredő).
- A párhuzamos eredőnél összeadás vagy a reciprok elmulasztása (pl. 1/100 + 1/150 megadása ellenállásként).
- A 60 Ω-os részeredmény nem kerül hozzáadásra R1-hez, vagy hiányzik a mértékegység.

## 2. feladat (32 pont)

**Feladat:** Ábrázolja egy LC elemekből álló aluláteresztő szűrő átvitelét a frekvencia függvényében! Jelölje a határfrekvenciát, az átviteli és a záró sávot, és adja meg, melyik ágban van tekercs, melyikben kondenzátor!

**Elvárt megoldás:** A vízszintes tengely a frekvencia (f, a határfrekvenciára normálva), a függőleges az átvitel (dB, a csúcs 0 dB). A görbe nulla frekvenciától (egyenáramtól) kezdve 0 dB körül vízszintes, a határfrekvenciánál (fc) kb. −3 dB-re esik, fölötte meredeken lefelé tart. Jelölni kell az átviteli sávot (0 … fc) és a záró sávot (fc fölött). A szűrő soros ágában tekercs, a párhuzamos ágában kondenzátor van, ezért az egyenáramot is átengedi.

**Mintarajz:**
```text
Átvitel [dB]

       ^
  0 dB |***************....................................
-3 dB  |..............****.................................
       | átviteli sáv    ***
       | (átengedett)    :  ***
       |                 :    ***
       |                 :      ***
       |                 :         ***  záró sáv
       |                 :           ***(csillapított)
       |                 :              ***
       |                 :                 ****
       |                 :                    ****
       |                 :                       *****
       |                 :                           *****
       |                 :                               **
       |                 :
       |                 :
       |                 :
       ------------------:----------------------------------->
       0 (DC)           fc                            f / fc
```

**Magyarázat:** Az aluláteresztő szűrő a sarokfrekvencia alatti jeleket átengedi, fölötte csillapít. A soros ágban lévő tekercs reaktanciája a frekvenciával nő (XL = 2πfL), a párhuzamos ágban lévő kondenzátoré csökken (XC = 1 / 2πfC), így a magas frekvenciás jel nem jut át a kimenetre. Mivel a soros ág tekercs, az egyenáram is átjut. A felüláteresztő szűrő pontosan az ellentettje: soros kondenzátor és párhuzamos tekercs, a görbéje fölfelé emelkedik. Forrás: jegyzet/06_Aramkorok.md, 6.2.3. és 6.2.4.; jegyzet/04_Alkatreszek.md, 4.2.5.

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| Tengelyek: f (3 p), átvitel [dB] (3 p), 0 dB szint és fc jelölése (2 p) | 8 |
| Görbe: vízszintes szakasz az egyenáramtól (4 p), kb. −3 dB az fc-nél (4 p), meredek csökkenés fölötte (4 p) | 12 |
| Az átviteli sáv (2 p) és a záró sáv (2 p) jelölése | 4 |
| Az ágak elemei: soros ágban tekercs (2 p), párhuzamos ágban kondenzátor (2 p) | 4 |
| Magyarázat: az egyenáram miért jut át, a reaktanciák frekvenciafüggése | 4 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Aluláteresztő helyett felüláteresztő görbét rajzolnak (fölfelé emelkedő átvitel).
- A soros és a párhuzamos ág elemeit felcserélik (soros kondenzátor, párhuzamos tekercs).
- Nem jelölik a határfrekvenciát, vagy a görbe nem a 0 Hz-nél (egyenáramnál) kezdődik.

## 3. feladat (32 pont)

**Feladat:** Rajzolja le egy szűrős módszerű SSB adó blokkvázlatát, és nevezze meg a fokozatokat! Magyarázza el, hogyan állítható be az alsó vagy a felső oldalsáv!

**Elvárt megoldás:** A mikrofon jele az NF erősítőn át az 1. keverőbe (DSB/SC modulátor) jut, ahová a kvarcoszcillátor jele is érkezik. A kvarcoszcillátor nem a névleges vivőfrekvencián rezeg, hanem kb. 1,5 kHz-cel feljebb vagy lejjebb; az USB/LSB kapcsoló ezt a frekvenciát állítja át. Az SSB (KF) szűrő a DSB/SC jelből a kívánt oldalsávot átengedi, a vivőt és a másik oldalsávot elnyomja. A 2. keverő a VFO jelével az üzemi frekvenciára transzponálja a jelet, majd szűrő, előerősítő és végerősítő következik, végül az antenna. Oldalsávváltáskor nem a szűrőt hangoljuk át, hanem a vivő (oszcillátor) frekvenciáját változtatjuk.

**Mintarajz:**
```text
                              +--------------------+
                              |  Kvarcoszcillátor  |
                              |  (USB / LSB kvarc  |
                              |    kapcsolóval)    |
                              +--------------------+
                                         |
                                         v
 +----------+    +------------+    +-----------+    +----------+
 | Mikrofon |--->| NF erősítő |--->| 1. Keverő |--->| SSB (KF) |
 +----------+    +------------+    |  (DSB/SC) |    |  szűrő   |
                                   +-----------+    +----------+
                                                          |
       +--------------------------------------------------+
       |
       |
       v
 +-----------+    +---------+    +------------+    +------------+
 | 2. Keverő |--->|  Szűrő  |--->| Előerősítő |--->| Végerősítő |----> Antenna
 +-----------+    +---------+    +------------+    +------------+
       ^
       |
       |
   +-------+
   |  VFO  |
   +-------+
```

**Magyarázat:** A szűrős SSB adó előbb DSB/SC modulációt hoz létre egy kvarcoszcillátorral és egy modulátorral, majd az SSB szűrővel kiszűri a kívánt oldalsávot. Az USB/LSB váltásnál a vivőfrekvenciát tolják el úgy, hogy a másik oldalsáv essen a szűrő átviteli tartományába. Adó-vevőben ugyanazt a (KF) szűrőt használják vételnél a szelektivitáshoz, adásnál a sávszélesség kialakításához. A végerősítő SSB-nél AB osztályú. Forrás: jegyzet/08_Adok.md, 8.2.2., 8.3.4. és 8.3.7. fejezet (a rajz az ottani SSB blokkvázlatot követi).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Helyes jelút: mikrofon, NF erősítő, modulátor, SSB szűrő, 2. keverő, szűrő, előerősítő, végerősítő, antenna | 14 |
| Az oszcillátorok bekötése (kvarc az 1., VFO a 2. keverőhöz), USB/LSB kapcsoló | 4 |
| Fokozatok megnevezése | 6 |
| Oldalsáv-választás magyarázata (a vivő tolódik el, a szűrő fix) | 6 |
| Az SSB szűrő szerepe (vivő és a másik oldalsáv kiszűrése) | 2 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Az oldalsávot a szűrő átkapcsolásával vagy áthangolásával oldják meg.
- A VFO-t az első keverőhöz kötik, így a szűrő nem fix KF-en dolgozna.
- Kimarad az SSB szűrő, vagy a modulátor helyett csak erősítőt rajzolnak.
