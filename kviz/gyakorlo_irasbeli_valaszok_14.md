# Gyakorló feladatlap 14 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_14.md](gyakorlo_irasbeli_kerdesek_14.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzolja le egy 12 V-os, integrált stabilizátort (7812) használó hálózati tápegység blokkvázlatát a hálózati bemenettől a kimenetig, és adja meg az egyes blokkok feladatát!

**Elvárt megoldás:** A sorrend: 230 V~ hálózat, hálózati transzformátor, egyenirányító (Graetz-híd), simító (puffer-) kondenzátor, 7812-es integrált stabilizátor, kimenet (Uki = +12 V). A transzformátor a hálózati feszültséget a szükséges értékre csökkenti és galvanikusan leválaszt a hálózatról. Az egyenirányító a váltakozó feszültséget lüktető egyenfeszültséggé alakítja, a kondenzátor ezt simítja, a stabilizátor pedig állandó 12 V-ot állít elő. A 7812 háromlábú: bemenet, kimenet és a földre kötött közös láb.

**Mintarajz:**
```text
230 V~ hálózat
    +-----------------+    +---------------+    +-------------+    +---------------+
    |    Hálózati     |    | Egyenirányító |    |   Simító-   |    |     7812      |
--->| transzformátor  |--->| (Graetz-híd)  |--->| kondenzátor |--->| stabilizátor  |--->
    | pl. 230V -> 15V |    |               |    |             |    | (be-közös-ki) |
    +-----------------+    +---------------+    +-------------+    +---------------+
                                                                             Uki = +12 V

Jelölések: a nyilak a jel/energia útját mutatják; a 7812 lábai: be, közös
  (föld), ki
```

**Magyarázat:** A fix kimeneti feszültségű integrált stabilizátor előnye a kevés külső alkatrész, a jó stabilizálási paraméterek és a beépített védelem. A forrás példájában 15 V-os szekunder feszültségből készül a 12 V, a bemeneten 2500 µF-os simítókondenzátor, a kimeneten 0,1 µF-os kondenzátor van, a tápegység terhelhetősége legfeljebb 1 A. A hálózati oldali biztosító a hálózatot védi a tápegység hibájától. Forrás: jegyzet/06_Aramkorok.md, 6.3.1., 6.3.2.3. (6.3-13. ábra) és 6.3.3.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| A blokkok helyes sorrendje (transzformátor, egyenirányító, simítás, stabilizátor) | 14 |
| Jelek és nyilak: hálózati bemenet, Uki = +12 V, közös/föld | 6 |
| Az egyes blokkok feladatának megadása | 8 |
| Az integrált stabilizátor jellemzése (három láb, kevés külső alkatrész, védelmek) | 4 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A stabilizátor az egyenirányító vagy a simítókondenzátor elé kerül.
- A simítás kimarad, vagy az egyenirányító a transzformátor elé kerül.
- A 7812 három lábát nem nevezi meg (bemenet, kimenet, közös), vagy a közös lába nem a földre kötött.

## 2. feladat (32 pont)

**Feladat:** Egy 2 m-es sávra készült háromelemes Yagi-antenna E-síkbeli nyílásszöge 70°, hátrasugárzási csillapítása 14 dB. Rajzolja fel az iránykarakterisztikáját polárkoordináta-rendszerben (relatív térerősség)! Jelölje az elemeket (reflektor, sugárzó, direktor), a főirányt, a nyílásszöget és az előre-hátra viszonyt, majd adja meg az antennanyereség fogalmát!

**Elvárt megoldás:** A polárdiagramon a főnyaláb a direktor felé mutat (főirány), a −3 dB-es pontok közötti nyílásszög 70°. Hátrafelé csak kis lebeny van: a hátrasugárzás 14 dB-lel kisebb, ez 10^(−14/20) ≈ 0,2 relatív térerősséget jelent. Az előre-hátra viszony a főirányban és a hátirányban sugárzott teljesítmény viszonya (itt 14 dB). Az elemek a gerinc mentén: legmögötte a hosszabb reflektor, középen a sugárzó (dipólus), elöl a rövidebb direktor. Az antennanyereség a vizsgált antenna teljesítménysűrűségének és a referenciaantennáénak a hányadosa: G = S1 / SREF, dB-ben 10 · lg(S1 / SREF); referencia az izotróp sugárzó (dBi) vagy a félhullámú dipólus (dBd).

**Mintarajz:**
```text

                                            O = -3 dB pontok, köztük 70°
                                            (nyílásszög)






                           ********O*****
hátsó lebeny             ***            ***
(kicsi)                **                 **
                  ******                   **      0° = főirány
                  *   +-------------------------->
                  ******                   **
                       **                 **
                         ***            ***
                           ********O*****





    180°-nál a relatív térerősség 0,2 (-14 dB): előre-hátra viszony = 14 dB
    sugár = relatív térerősség (főirányban 1)


    R    S    D       R: reflektor (hosszabb), S: sugárzó,
    |    |    |       D: direktor (rövidebb)
    -----------> főirány
```

**Magyarázat:** A Yagi-antenna a félhullámú dipólus irányhatását parazita elemekkel növeli: a direktor rövidebb, a reflektor hosszabb a sugárzónál. A nyereség az irányítottság mértéke: adott adóteljesítménynél csak úgy kapunk nagyobb teljesítménysűrűséget egy irányban, ha a többi irányban kevesebbet sugárzunk. Az elemszám és a gerinchossz növelésével a nyereség nő, a nyílásszög csökken. A mintarajz szemléltető, a főnyaláb és a hátsó lebeny közötti átmenet alakját a jegyzet nem adja meg. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.4.1. (a 3 elemes Yagi adatai), 9.1.5.–9.1.6.

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| Az elemek és a főirány jelölése: reflektor, sugárzó, direktor, helyes sorrend | 6 |
| Főnyaláb: a főirányban a legnagyobb (4 p), a −3 dB-es pontok és a 70° nyílásszög jelölése (4 p) | 8 |
| Hátirány: kis hátsó lebeny (4 p), az előre-hátra viszony 14 dB / 0,2 relatív érték jelölése (4 p) | 8 |
| Polárdiagram felépítése: relatív térerősség, a főirány 1-re normálva | 4 |
| Az antennanyereség fogalma: definíció (3 p), referenciák dBi és dBd (3 p) | 6 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Az előre-hátra viszonyt a főirány nyereségével keverik, vagy a hátsó lebeny nagyobb a rajzon, mint a főnyaláb fele.
- A reflektor és a direktor helyét felcserélik (a rövidebb elem kerül a sugárzó mögé).
- A nyílásszöget a teljes nyaláb szélességének veszik, nem a −3 dB-es pontok közötti szögnek.

## 3. feladat (32 pont)

**Feladat:** Rajzolja le egy analóg feszültségmérő felépítését (alapműszer és előtét-ellenállás), valamint azt, hogyan kell a feszültségmérőt a mérendő áramkörbe kötni! Magyarázza el, miért van szükség az előtét-ellenállásra!

**Elvárt megoldás:** Az analóg feszültségmérő egy nagyon érzékeny alapműszerből és vele sorba kötött előtét-ellenállásból áll. A feszültségmérőt a mérendő két pont közé, az elemmel párhuzamosan kell bekötni. Az előtét-ellenállás az alapműszer elé kerül, így a mérendő feszültség az előtét-ellenálláson és az alapműszeren oszlik meg (feszültségosztó). A méréshatárt az előtét-ellenállás értéke határozza meg. A feszültségmérő belső ellenállása legyen minél nagyobb, hogy a mérendő áramkört minél kevésbé terhelje.

**Mintarajz:**
```text
  Alapműszer + előtét-ellenállás (feszültségmérő):

          Re (előtét)             alapműszer (Rm, érzékeny)
   A o----[=========]-------------------( mA )--------------o B
     |                                                      |
     |<------------ Um (a mérendő feszültség) ------------->|

  Bekötés az áramkörbe (a mérendő pontok közé, PÁRHUZAMOSAN):

            R1
      +----[===]----+----------+
      |             |          |
    ( Ube )       [ R2 ]     ( V )   <- a voltmérő R2-vel párhuzamos
      |             |          |
      +-------------+----------+
```

**Magyarázat:** Az alapműszer nagyon érzékeny, ezért a mérendő feszültségnek csak egy kis részét viheti az alapműszerre: a feszültségmérő lényegében feszültségosztó, melynek alsó tagja az alapműszer. Példa: ha az alapműszer teljes kitérése Im = 1 mA és Rm = 100 Ω, akkor 10 V-os méréshatárhoz Re = 10 V / 1 mA - 100 Ω = 9,9 kΩ kell (Ohm-törvénnyel számolva). A feszültség két pont között értelmezhető, ezért a műszert párhuzamosan kötjük; az ideális feszültségmérő szakadásként viselkedik, belső ellenállása végtelen. Forrás: jegyzet/11_Meresek.md, 11.3.2.1. és 11.4.1.1. fejezet (11.4-1., 11.4-2. ábra).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| A feszültségmérő felépítése: alapműszer és vele sorosan kötött előtét-ellenállás | 10 |
| A bekötés helyes ábrázolása (a mérendő pontok közé, párhuzamosan) | 8 |
| Megnevezések, jelölések (előtét-ellenállás, alapműszer, mérendő feszültség) | 4 |
| Az előtét-ellenállás szerepe (érzékeny alapműszer, feszültségosztó, méréshatár) | 6 |
| A belső ellenállás nagy értékének fontossága | 4 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A feszültségmérőt sorosan kötik a mérendő áramkörbe (az áramkör megszakításával).
- Az előtét-ellenállást az alapműszerrel párhuzamosan kötik (ez söntellenállás, árammérőnél).
- A feszültségmérő belső ellenállását kicsinek tekintik.
