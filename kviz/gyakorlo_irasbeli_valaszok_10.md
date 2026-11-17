# Gyakorló feladatlap 10 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_10.md](gyakorlo_irasbeli_kerdesek_10.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy LC elemekből álló felüláteresztő szűrőt! Jelölje a bemenetet, a kimenetet és a közös (földelt) vezetéket, nevezze meg az elemeket, és hasonlítsa össze az aluláteresztő szűrővel!

**Elvárt megoldás:** A bemenet felső kivezetése és a kimenet felső kivezetése között, a soros ágban egy kondenzátor (C1) van. A kimeneti csomópont és a közös vezeték között, a párhuzamos ágban egy tekercs (L1) található. Az alsó vezeték a bemenet és a kimenet közös pontja (föld); a bemenő feszültség Ube, a kimenő Uki. A felépítés az aluláteresztő szűrő fordítottja: ott a soros ágban tekercs, a párhuzamosban kondenzátor van.

**Mintarajz:**
```text
                 C1
o----------------||-------------------*------------------o
|                                     |                  |
|                                     |                  |
| Ube                                 (                  | Uki
|                                     (  L1              |
|                                     (                  |
v                                     |                  v
o---------------------*---------------*------------------o
                     === föld
                      =

Jelölések: -||- kondenzátor, ( ( ( tekercs (függőlegesen), * összekötött
  csomópont, o kivezetés, === föld
```

**Magyarázat:** Nagy frekvencián a soros kondenzátor kis ellenállású, a párhuzamos tekercs pedig nagy ellenállású, így a jel eljut a kimenetre. Kis frekvencián a kondenzátor nagy ellenállású, a tekercs kis ellenállású, ezért a jel a tekercsen át a közös vezetékre jut, és csillapodik. A határfrekvencia felett van kis csillapítású jelátvitel, alatta nagy a csillapítás; az egyenáramot a soros kondenzátor nem engedi át. Forrás: jegyzet/06_Aramkorok.md, 6.2.4. (6.2-5., 6.2-6. ábra).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Soros ágban kondenzátor (C1) | 8 |
| Párhuzamos ágban tekercs (L1) a közös vezetékre | 8 |
| Bemenet, kimenet, közös vezeték és elemek megnevezése (Ube, Uki, föld, C1, L1) | 6 |
| Működés: mit enged át, mit csillapít, miért | 6 |
| Összehasonlítás az aluláteresztő szűrővel | 4 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Az L és a C felcserélése: tekercs a soros, kondenzátor a párhuzamos ágban, ami aluláteresztő szűrő.
- A határfrekvencia „alatti” és „feletti” tartomány felcserélése.
- A közös vezeték hiánya, vagy a tekercs nem a közös vezetékre kötött.

## 2. feladat (32 pont)

**Feladat:** Egy 10 kΩ-os ellenálláson keresztül egy 100 µF-os, kisütött kondenzátort 10 V-os feszültségforrásra kapcsolunk, majd 5 s elteltével a forrás helyére rövidzárat kapcsolunk. Ábrázolja a kondenzátor feszültségét az idő függvényében! Számítsa ki és jelölje az időállandót, és értelmezze az ábrát!

**Elvárt megoldás:** A vízszintes tengely az idő (t, s), a függőleges a kondenzátorfeszültség (UC, V). Töltéskor UC nullából indul, exponenciálisan nő a 10 V-os forrásfeszültség felé: kezdetben meredek, majd egyre laposabb, és a forrásfeszültséghez simul. Kisüléskor (t = 5 s-tól) a feltöltött értékről exponenciálisan csökken nulla felé: kezdetben meredek, aztán egyre laposabb. Az időállandó τ = R · C = 10 kΩ · 100 µF = 1 s; a töltés végén t = τ-nál a feszültség kb. a forrásfeszültség 63%-a, a kisülés kezdetétől τ múlva kb. 37%-a az induló értéknek.

**Mintarajz:**
```text
UC [V]
                    TÖLTÉS                KISÜLÉS
         ^
  Ug=10  |...................**********............................
         |             *******        *
         |          ****              :*
         |        ***                 :*
         |       **                   :**
         |      **                    : *
   6,3   |     *O                     :  *
         |    **                      :  **
         |   **   t = tau: kb. 63% Ug :   **   1 tau kisülés után: kb. 3
   3,7   |   *                        :    *
         |  *                         :     O*
         |  *                         :      **
         | *                          :       ***
         | *                          :         ****
         |**                          :            *******
         -*----------------------------------------------**********-->
         0      1    2     3    4     5     6    7     8    9     10
                                                              t [s]

            (tau = R·C = 10 kΩ · 100 µF = 1 s; a kapcsolás t = 5 s-nál)
```

**Magyarázat:** A kezdetben kisütött kondenzátor rövidzárként viselkedik, ezért az áram nagy, majd a kondenzátor feltöltődésével egyre kisebb lesz; feltöltött állapotban a kondenzátor egyenáramon szakadás. Kisüléskor az ellenállás süti ki a kondenzátort, és az áram fordított irányú. Az időállandó (τ = R · C) azt adja meg, milyen gyorsan zajlanak a folyamatok: nagyobb R vagy C esetén lassabban. A 63% és 37% az exponenciális függvény ismert értéke; a jegyzet az időállandót és a görbék jellegét tárgyalja. Forrás: jegyzet/04_Alkatreszek.md, 4.2.4.1.; alapdiak/04_aramkorok.md (τ = R · C).

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| Tengelyek: UC [V] (2 p), t [s] (2 p), a 10 V jelölése (2 p) | 6 |
| Töltési görbe: nullából indul (2 p), exponenciális, kezdetben meredek (3 p), a forrásfeszültséghez simul (3 p) | 8 |
| Kisülési görbe: a feltöltött értékről indul (2 p), exponenciális csökkenés (3 p), nulla felé tart (3 p) | 8 |
| Időállandó: képlet (2 p), értéke 1 s (2 p), jelölése a görbén (2 p) | 6 |
| Értelmezés: kezdeti rövidzár, az áram csökkenése, a kisülési áram iránya | 4 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A görbét lineáris szakaszokkal (egyenesekkel) rajzolják exponenciális helyett.
- Az időállandót rosszul számolják (a kΩ és µF átváltása elmarad: 1000 s vagy 0,001 s).
- A kisülés nem a feltöltött értékről indul, hanem a 0-ról vagy a töltési görbe folytatásaként felfelé.

## 3. feladat (32 pont)

**Feladat:** Mit értünk antennanyereségen? Írásbeli válasz! Szemléltesse rajzzal az izotróp sugárzót és egy irányított antenna sugárzási diagramját, és adja meg a nyereség kétféle vonatkoztatási alapját!

**Elvárt megoldás:** Az antennanyereség az antenna irányítottságának mértéke: megmutatja, hogy az antenna az adott irányban hányszor akkora teljesítménysűrűséget hoz létre, mint a referencia antenna ugyanazon adóteljesítmény mellett: G = S1 / S_REF, decibelben G = 10 * lg(S1 / S_REF). Referencia lehet az izotróp sugárzó (dBi) vagy a félhullámú dipólus (dBd). A félhullámú dipólus nyeresége az izotróp sugárzóhoz képest 2,14 dB. A rajzon az izotróp sugárzó gömb- (kör)szimmetrikus, az irányított antenna diagramján a főlebeny a főirányban nagy, a többi irányban kisebbek az oldal- és hátsó lebenyek.

**Mintarajz:**
```text
      Izotróp sugárzó                Irányított antenna (pl. Yagi)
                                                főirány
        _.-""""-._                                 ^
      .'          '.                            .-' '-.
     /              \                          /   |   \
    |       *        |                        /    |    \
     \              /                        |     |     |
      '._        _.'                          \    |    /
         ''-..-''                          .-. '.  |  .' .-.
                                          (   )  '-*-'  (   )
  minden irányban egyenlő                  '-'    / \    '-'
     (referencia: dBi)                           (___)  <- hátsó lebeny

* = az antenna;  nagy lebeny = főlebeny,  két kis lebeny = oldallebeny
nyílásszög: a főlebeny két -3 dB-es (fél teljesítményű) iránya közti szög
```

**Magyarázat:** Változatlan adóteljesítmény mellett az antenna által egy adott irányban kisugárzott teljesítmény csak úgy növelhető, ha a többi irányba kisebb teljesítményt sugároz. Ezért a nyereség nem többletteljesítményt jelent, hanem az irányítottságot. Az irányított antenna iránykarakterisztikája megadja a térerősség relatív értékeit a főirányra vonatkoztatva. A gyakorlatban többnyire a félhullámú dipólusra vonatkoztatott (dBd) nyereséget használják, mert az összehasonlító mérés könnyen megvalósítható. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1.5. és 9.1.6. fejezet.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| A fogalom helyes meghatározása (az irányítottság mértéke, azonos adóteljesítménynél, G = S1 / S_REF) | 8 |
| Rajz: izotróp sugárzó és irányított antenna sugárzási diagramja főlebennyel | 8 |
| A két vonatkoztatási alap (dBi, dBd) és a dipólus 2,14 dB-es nyeresége | 6 |
| Magyarázat: miért nő a nyereség (más irányokba kevesebb teljesítmény), főlebeny, nyílásszög | 6 |
| Megnevezések a rajzon (főirány, főlebeny, oldal- és hátsó lebeny) | 4 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A nyereséget az adóteljesítmény növekedésének (aktív erősítésnek) tekintik.
- A dBi és a dBd jelentését vagy a 2,14 dB-t felcserélik, esetleg a referenciát nem adják meg.
- A rajzon nincs főirány, vagy az irányított antenna diagramja is kör alakú.
