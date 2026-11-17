# Gyakorló feladatlap 08 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_08.md](gyakorlo_irasbeli_kerdesek_08.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy egyenfeszültségű generátorra kapcsolt soros RC tagot! Jelölje az áram irányát, az ellenálláson (UR) és a kondenzátoron (UC) eső feszültséget, majd írja le, hogyan változik az áram és a kondenzátor feszültsége a bekapcsolás után!

**Elvárt megoldás:** Az Ug egyenfeszültségű generátor pozitív sarkától az R ellenálláson és a C kondenzátoron át a negatív sarokig zárt hurkot alkotunk, vagyis R és C sorosan kapcsolódik. Az áram (I) a generátor pozitív pólusától az ellenálláson át a kondenzátor felé folyik. Az ellenálláson UR, a kondenzátoron UC feszültség esik, és minden pillanatban Ug = UR + UC. Elektrolitkondenzátornál a + jelölésű kivezetés a pozitív oldalra kerül.

**Mintarajz:**
```text
                      I -->
    +---------[R]---------------------+
    |       + UR -                    |
    |                                 |
Ug --- +                             ---+
    -                                --- C
    |                                 |
    |                                 |  UC
    +---------------------------------+

Jelölések: --- / - telep (a hosszú vonal a +), [R] ellenállás, --- / ---
  kondenzátor, I --> az áram iránya
```

**Magyarázat:** A kisütött kondenzátor bekapcsoláskor rövidzárként viselkedik: UC ≈ 0, ezért az ellenálláson a teljes Ug esik, és az áram a legnagyobb. A kondenzátor töltődésével UC nő, UR és az áram csökken. Feltöltött állapotban UC = Ug, az áram gyakorlatilag megszűnik, mert egyenáramon a kondenzátor szakadás. Ha a feltöltött kondenzátort az ellenállással zárjuk rövidre, az ellenálláson át kisül, és az áram iránya megfordul. Forrás: jegyzet/04_Alkatreszek.md, 4.2.4.1. (4.2-2.–4.2-5. ábra).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| A zárt hurok: generátor, R és C sorosan | 12 |
| Az áram irányának, az UR és UC feszültségnek (polaritással) a jelölése | 6 |
| Az Ug = UR + UC összefüggés | 4 |
| A töltődés lefolyása: kezdeti rövidzár, UC növekedése, áram csökkenése, végállapot | 10 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A kondenzátor az ellenállással párhuzamosan szerepel, így a kapcsolás nem soros RC tag.
- Az áram iránya hiányzik vagy ellentétes a generátor polaritásával.
- A feltöltött kondenzátoron is folyamatos áramot feltételez, vagy a kezdeti rövidzár-viselkedést nem említi.

## 2. feladat (32 pont)

**Feladat:** Rajzolja le egy szinuszos jellel frekvenciamodulált (FM) vivő időfüggvényét a moduláló jel alatt! Jelölje, hogy mi marad állandó és mi változik a modulált jelben, és nevezze meg az FM két előnyét az AM-mel szemben!

**Elvárt megoldás:** Fent a szinuszos moduláló jel, alatta ugyanazon az időtengelyen az FM jel. Az FM jel amplitúdója állandó (a burkoló egyenes), a pillanatnyi frekvenciája a moduláló jel pillanatnyi értékének megfelelően ingadozik a vivő nyugalmi frekvenciája körül. A moduláló jel pozitív csúcsánál a rezgések sűrűbbek (nagyobb frekvencia), a negatív csúcsánál ritkábbak (kisebb frekvencia). Előnyök: kevésbé érzékeny a külső zajra, és a vett hangerő nem függ az adó teljesítményétől.

**Mintarajz:**
```text
Moduláló jel (hangfrekvenciás, szinuszos)
      |
 +    | ****                         *******                         ****
      |    ***                     ***     ***                     ***
      |      ***                 ***         ***                 ***
 0    ---------***-------------***-------------***-------------***------->
      |          ***          **                 ***         ***
      |            ***     ***                     ***     ***
 -    |              *******                         *******
      |

FM jel: állandó amplitúdó, a frekvencia a moduláló jel ütemében változik


 +U        |  |    |         |    |  |  |  |  |    |         |    |  |
           |  |    |         |    |  |  |  |  |    |         |    |  |
           |  |    |         |    |  |  |  |  |    |         |    |  |
           |  |    |         |    |  |  |  |  |    |         |    |  |
      -----|--|----|---------|----|--|--|--|--|----|---------|----|--|--->
           |  |    |         |    |  |  |  |  |    |         |    |  |
           |  |    |         |    |  |  |  |  |    |         |    |  |
           |  |    |         |    |  |  |  |  |    |         |    |  |t
 -U        |  |    |         |    |  |  |  |  |    |         |    |  |

        sűrű: nagy f (a moduláló jel +csúcsánál)
        ritka: kis f (a moduláló jel -csúcsánál)
```

**Magyarázat:** Az FM-ben az információt a vivő pillanatnyi frekvenciájának változása hordozza, az amplitúdó állandó. A zavarok többnyire az amplitúdót befolyásolják, ezért az FM zajtűrőbb az AM-nél. A fázismoduláció (PM) ugyanilyen elven, a fázisszög változtatásával működik, a demodulálás ugyanúgy történik. Az FM hátránya a nagyobb sávszélesség. A mintarajz csak szemléltet: a pozitív csúcshoz tartozó nagyobb frekvencia a szokásos hozzárendelés, a pontozásban a következetesség számít. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.3.–5.2.4.

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| A moduláló jel rajza: szinusz (4 p), tengelyek (2 p) | 6 |
| Az FM jel amplitúdója állandó | 8 |
| A frekvencia a moduláló jel ütemében változik: sűrűbb és ritkább szakaszok a megfelelő helyen | 8 |
| Megnevezés: állandó az amplitúdó (2 p), változik a frekvencia (2 p) | 4 |
| Két előny az AM-mel szemben (3 + 3 p) | 6 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Az amplitúdó is változik a rajzon (AM és FM keveredik), vagy a burkológörbét rajzolják be.
- A sűrűsödés nem követi a moduláló jelet (véletlenszerűen vagy végig egyenletesen ritka/sűrű).
- Az FM előnyeként a kisebb sávszélességet jelölik meg (valójában nagyobb sávszélesség kell).

## 3. feladat (32 pont)

**Feladat:** Rajzolja le a koaxiális kábel felépítését hosszmetszetben, és nevezze meg a rétegeit! Írja le röviden, mire szolgálnak az egyes rétegek, és milyen típusú (szimmetrikus vagy aszimmetrikus) a koaxiális tápvonal!

**Elvárt megoldás:** A koaxiális kábel koncentrikus felépítésű. Középen a belső vezető (ér) fut, többnyire tömör rézhuzal, néha sodrott. Ezt a dielektrikum (kis veszteségű szigetelő, pl. polietilén) veszi körül, majd a külső vezető, az árnyékoló fonat (köpeny), kívül pedig a védőburkolat. A dielektrikum lehet tömör vagy habosított (légzárványos). A kábel a földhöz képest aszimmetrikus, hullámellenállása az amatőr gyakorlatban leggyakrabban 50 Ω.

**Mintarajz:**
```text
 hosszmetszet (a kábel tengelye mentén)

 ////////////////////////////////////////   4. védőburkolat (külső köpeny)
 ########################################   3. külső vezető: árnyékoló fonat
 . . . . . . . . . . . . . . . . . . . .   2. dielektrikum (szigetelő)
 ========================================   1. belső vezető (ér)
 . . . . . . . . . . . . . . . . . . . .   2. dielektrikum (szigetelő)
 ########################################   3. külső vezető: árnyékoló fonat
 ////////////////////////////////////////   4. védőburkolat (külső köpeny)

 A rétegek koncentrikusak (a közös tengely a belső vezető).
```

**Magyarázat:** A koaxiális tápvonal a rádiótechnikában leggyakrabban használt tápvonal, napjainkban szinte kizárólagos a szerepe. Tömör dielektrikumnál az alakja és elektromos tulajdonságai stabilak, a víz kevésbé rontja, a habosított típus csillapítása kisebb, de nedvesség ellen védeni kell és a hajlítási sugara nagyobb. Az amatőr gyakorlatban 50 ohmos kábeleket használnak. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.5., 9.6.5.1. és 9.6.5.2. fejezet (9.6-4. ábra).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| A rétegek helyes sorrendje kívülről befelé / középről kifelé | 14 |
| Megnevezések (belső vezető, dielektrikum, árnyékoló fonat, köpeny) | 6 |
| Az egyes rétegek feladata | 6 |
| Koncentrikus, aszimmetrikus felépítés; tipikus hullámellenállás: 50 Ω | 3 |
| A dielektrikum típusai (tömör, habosított) | 3 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A fonatot és a dielektrikumot felcserélik, vagy a belső vezetőt kívülre rajzolják.
- A védőburkolatot kihagyják, vagy külön rétegnek tekintik az árnyékolás nélkül.
- A koaxot szimmetrikus tápvonalnak nevezik.
