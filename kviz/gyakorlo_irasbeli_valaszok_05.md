# Gyakorló feladatlap 05 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_05.md](gyakorlo_irasbeli_kerdesek_05.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy egyutas (félhullámú) egyenirányítót hálózati transzformátorral, simítókondenzátorral és terhelő ellenállással! Jelölje a dióda nyitóirányát, a kondenzátor polaritását és a kimeneti feszültséget, majd magyarázza el a működését!

**Elvárt megoldás:** A transzformátor primer tekercse a hálózatra (230 V~) kapcsolódik. A szekunder tekercs egyik vége egyetlen diódán (D1) át a pozitív kimeneti sínre vezet, a dióda anódja a transzformátor, katódja a kimenet felé néz. A szekunder másik vége közvetlenül az alsó (negatív) sínre csatlakozik. A két sín közé, párhuzamosan kerül a Cp simítókondenzátor (elektrolit, a + kivezetése a pozitív sínen) és az Rt terhelő ellenállás; a kimenő feszültség Uki.

**Mintarajz:**
```text
              D1
o---(||)------>|--------------*---------*---------o +
    (||)                      |         |         |
    (||)                     ---+       |         |
o---(||)--+                  --- Cp     |         | Uki
          |                   |        [ ] Rt     |
230 V~    |                   |         |         |
          |                   |         |         v
          +---------------------------------------o -

Jelölések: (||) transzformátor, >| dióda (a | a katód), [ ] ellenállás, --- /
  --- kondenzátor, + pozitív pólus
```

**Magyarázat:** A dióda csak a váltakozó feszültség pozitív félperiódusában vezet, a negatívban zár, így a terhelésen lüktető egyenáram folyik. A Cp kondenzátor a feszültségcsúcsok alatt feltöltődik, és amikor a dióda nem vezet, ő táplálja a terhelést, ezért simítja a feszültséget és csökkenti a brummfeszültséget. A kapcsolás hátránya a gyenge hatásfok és az erős lüktetés, ezért nagy simítást igényel. Forrás: jegyzet/06_Aramkorok.md, 6.3.1.1. (6.3-2. ábra) és 6.3.1.2.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Transzformátor és egyetlen dióda sorosan a pozitív ágban, helyes nyitóirány | 10 |
| Cp és Rt párhuzamosan a kimeneten, a kondenzátor polaritása | 8 |
| Jelölések (D1, Cp, Rt, Uki, +/−, hálózat) | 6 |
| Működés: félperiódus, simítás, hátrányok | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A dióda fordítva van bekötve (a kimenet negatív lesz), vagy nincs jelölve a nyitóirány.
- A simítókondenzátor sorosan szerepel a terheléssel, vagy az elektrolit polaritása hiányzik/fordított.
- Hiányzik a visszatérő (negatív) vezeték, így az áramkör nem zárt.

## 2. feladat (32 pont)

**Feladat:** Ábrázolja a 230 V-os, 50 Hz-es hálózati feszültség időfüggvényét két periódusra! Jelölje be és számítsa ki a csúcsértéket, a csúcs-csúcs értéket, a periódusidőt és az effektív értéket!

**Elvárt megoldás:** A vízszintes tengely az idő (t, ms), a függőleges a pillanatnyi feszültség (u, V). A görbe szinusz: nullából indul, 5 ms-nál éri el a pozitív csúcsot, 10 ms-nál metszi a tengelyt, 15 ms-nál negatív csúcs, 20 ms-nál zárul az egy periódus; ugyanez még egyszer 40 ms-ig. Um = √2 · 230 V ≈ 325 V, a csúcs-csúcs érték Ucs-cs = 2 · Um ≈ 650 V, T = 1 / f = 1 / 50 Hz = 20 ms. Az effektív érték Ueff = Um / √2 = 230 V (a mérőműszer ezt mutatja).

**Mintarajz:**
```text
          Um = 325 V (csúcsérték), Ucs-cs = 2·Um = 650 V
          Ueff = Um / √2 = 230 V,   T = 1/f = 20 ms


u [V]    ^
         |
   +325  |.....*****.......................*****...................
         |    **   **                     **   **
   +230  |...**.....**...................**.....**.................
         |  **       **                 **       **
         |  *         *                 *         *
         | **         **               **         **
         |**           **             **           **
         -*-------------*-------------*-------------*-------------*-->
         0          10  **        20 **         30  **        40 **
         |               **         **               **       t [ms]
         |                *         *                 *         *
         |                **       **                 **       **
   -230  |.................**.....**...................**.....**...
         |                  **   **                     **   **
   -325  |...................*****.......................*****.....
         |
         |

          <--------------------------->
                    T = 20 ms
```

**Magyarázat:** A hálózati feszültséget effektív értékben adják meg: ez az az egyenfeszültség-érték, amelyik ugyanannyi munkát végezne a terhelésen, mint a váltakozó feszültség. A szinuszos jel csúcsértéke az effektív érték √2-szerese, ezért a 230 V-os hálózat csúcsértéke kb. 325 V. A periódusidő a frekvencia reciproka. Az ábrán az effektív érték a csúcsérték alatt kb. 70%-nál húzódó vízszintes vonal. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.3.1. és 3.3.2.

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| Tengelyek: u [V] (2 p), t [ms] (2 p), skálabeosztás (2 p) | 6 |
| Szinuszgörbe: alak (4 p), két teljes periódus (3 p), nullátmenetek és csúcsok helyes időpontja (3 p) | 10 |
| Csúcsérték és csúcs-csúcs érték jelölése és kiszámítása (3 + 3 p) | 6 |
| Periódusidő jelölése és kiszámítása (2 + 2 p) | 4 |
| Effektív érték: jelölése (2 p), képlete és értéke (2 p), értelmezése (2 p) | 6 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A 230 V-ot csúcsértéknek veszik, vagy az effektív értéket √2-vel szorozzák/osztják fordítva.
- A csúcs-csúcs értéket Um-mel azonosítják (a tengelyen a teljes hullám elmarad).
- Az időtengelyt nem látják el mértékegységgel, vagy a periódusidőt 50 ms-nak (a frekvenciából) adják meg.

## 3. feladat (32 pont)

**Feladat:** Rajzolja le a félhullámú dipólantenna felépítését, és ábrázolja rajta a feszültség- és az árameloszlást! Nevezze meg a rajz jelöléseit, és adja meg az antenna talpponti impedanciáját!

**Elvárt megoldás:** A félhullámú dipólus két darab λ/4 hosszúságú egyenes vezetőből áll, amelyek között, középen van a táppont (a tápvonal csatlakozása); a teljes hossz λ/2. Az áram a dipólus közepén maximális, a két végén nulla. A feszültség a két végén maximális (a két szálon ellentétes előjelű), a közepén nulla. A szinuszos árameloszlású, ideális dipólus talpponti impedanciája 73,2 Ω.

**Mintarajz:**
```text
<---------- λ/2 (a dipólus teljes hossza) ---------->
|<--------- λ/4 --------->|<--------- λ/4 --------->|
o=========================X=========================o
 1. szál (λ/4)         táppont          2. szál (λ/4)

Áram (I):  nulla a végeken, maximum a közepén
                 *******************
         ********                   ********
   ******                                   ******
***-----------------------------------------------***

Feszültség (U):  maximum a végeken (ellentétes előjellel), nulla a közepén
**********
          ********
                  ******
------------------------*****------------------------
                             ******
                                   ********
                                           **********

o = a szál vége;  X = táppont (itt csatlakozik a tápvonal)
```

**Magyarázat:** A dipólusantenna tükörszimmetrikus a táppontján átmenő síkra, és nyitott rezgőkörként működik: akkor sugároz jó hatásfokkal, ha rezonanciafrekvenciája megegyezik a tápláló jel frekvenciájával. Az állóhullám miatt az áram a végeken nulla, középen maximális, a feszültség pedig fordítva. A talpponti impedancia ideális esetben 73,2 Ω, a hurokdipólusé ennek négyszerese (293 Ω). Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1. és 9.1.1. fejezet (9.1-1. ábra).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| A dipólus felépítése: két λ/4 szál, középen táppont, összesen λ/2 | 8 |
| Áram-eloszlás (maximum középen, nulla a végeken) | 6 |
| Feszültség-eloszlás (maximum a végeken, nulla középen) | 6 |
| Jelölések, megnevezések (táppont, szálak, λ/4, λ/2) | 4 |
| Talpponti impedancia: 73,2 Ω | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Az áram- és a feszültségeloszlást felcserélik (feszültségmaximum a középen).
- A dipólus teljes hossza λ/4 vagy az egyes szálak hossza λ/2.
- A 73,2 Ω helyett 50 Ω-ot vagy 293 Ω-ot (hurokdipólus) adnak meg.
