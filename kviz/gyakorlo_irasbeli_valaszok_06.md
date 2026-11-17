# Gyakorló feladatlap 06 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_06.md](gyakorlo_irasbeli_kerdesek_06.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy soros rezgőkört veszteségi ellenállással, nevezze meg az elemeit, és adja meg a rezonanciafrekvencia képletét! Hogyan viselkedik a kör impedanciája rezonanciafrekvencián?

**Elvárt megoldás:** Egy zárt hurokban sorba kötjük a generátort (Ug), a veszteségi ellenállást (R), a tekercset (L) és a kondenzátort (C). Az R a valóságos kör veszteségeit képviseli (főleg a tekercsét). Rezonanciafrekvencián XL = XC, így f0 = 1 / (2π√(LC)) (Thomson-képlet). Ekkor az impedancia minimális és tiszta ohmos: Z0 = R, tehát kis (Ω nagyságrendű) ellenállás; veszteségmentes esetben (R = 0) a kör rövidzárként viselkedik.

**Mintarajz:**
```text
                  I -->    L               C
    +-------[R]-----------nnnn-------------||---------+
    |                                                 |
Ug (~)                                                |
    |                                                 |
    |                                                 |
    +-------------------------------------------------+

Jelölések: (~) generátor, [R] ellenállás, nnnn tekercs, -||- kondenzátor, I
  --> az áram iránya
```

**Magyarázat:** A rezgőkörben a kondenzátor elektromos és a tekercs mágneses energiája cserélődik; a veszteségi ellenállás miatt a szabad rezgés lecsillapodik. A soros kör impedanciája Z = R + j(ωL − 1/(ωC)): rezonancián a két reaktancia kiejti egymást, ezért csak R marad. Minél kisebb a veszteség, annál nagyobb a jósági tényező (Q0), és annál keskenyebb a rezonanciagörbe (B = f0 / Q0). Forrás: jegyzet/06_Aramkorok.md, 6.1.1.–6.1.4. (6.1-6. ábra).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Helyes soros kapcsolás: generátor, R, L, C egyetlen hurokban | 14 |
| Az elemek megnevezése és jelölése (Ug, R, L, C) | 6 |
| Rezonanciafeltétel (XL = XC) és a Thomson-képlet | 6 |
| Az impedancia rezonancián: minimum, Z0 = R, ideálisan rövidzár | 6 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Párhuzamos kapcsolású rezgőkört rajzol (L és C egymás mellett), pedig a feladat soros kört kér.
- A veszteségi ellenállás kimarad a rajzról.
- „Rezonancián az impedancia maximális” – ez a párhuzamos körre igaz, a soros körre nem.

## 2. feladat (32 pont)

**Feladat:** Ábrázolja egy 1 kHz-es, szimmetrikus négyszögjel időfüggvényét, majd vázolja fel a jel spektrumát (amplitúdó a frekvencia függvényében)! Magyarázza meg, miért tartalmaz a négyszögjel felharmonikusokat!

**Elvárt megoldás:** Az időfüggvényen (u–t, ms) a jel két szélsőértéket vesz fel, +U és −U között ugrik, köztes értéket nem; a periódusidő T = 1/f = 1 ms. A spektrumon (amplitúdó–f, kHz) vonalak láthatók: az alapharmonikus 1 kHz-nél a legnagyobb, a felharmonikusok az alapfrekvencia egész számú többszörösein (3, 5, ... kHz) jelennek meg, az amplitúdójuk a rendszámmal csökken. A jelhez tehát az 1 kHz-nél jóval magasabb frekvenciájú komponensek is tartoznak.

**Mintarajz:**
```text
u [V]
      ^
+U    |###########         ###########         ###########
      |          #         #         #         #         #
      |          #         #         #         #         #
      |          #         #         #         #         #
    0 -----------#---------#---------#---------#---------#----------->
      |          #     1   #         #     2   #         #     3
      |          #         #         #         #         #  t [ms]
      |          #         #         #         #         #
-U    |          ###########         ###########         ##########
      |
       <------------------->
        T = 1 ms  ->  f0 = 1/T = 1 kHz

Amplitúdó
      ^
      |             alap (f0) + felharmonikusok (3f0, 5f0, ...)
      |     #       az amplitúdó a felharmonikus rendjével csökken
      |     #
      |     #
      |     #
      |     #
      |     #
      |     #           #
      |     #           #           #
      |     #           #           #           #           #
      ------------------------------------------------------------->
            1           3           5           7           9
                                                          f [kHz]
```

**Magyarázat:** Minden nem szinuszos, periodikus jel szinuszos jelek összegeként írható fel; a négyszögjel gyors szintváltásai miatt kifejezetten sok felharmonikust tartalmaz. A felharmonikusok a névleges (alap-)frekvenciánál magasabb frekvenciájú összetevők. A szimmetrikus négyszögjelben a páros harmonikusok hiányoznak, és az amplitúdók a rendszámmal csökkennek; ezt a jegyzet nem tárgyalja, a mintarajz ennek megfelelően szemléltető, a pontozásban csak a felharmonikusok megjelenése és a csökkenő tendencia számít. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.3.3.; sajat/radioelmelet.md, „Nem-szinuszos jelek”.

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| Időfüggvény tengelyei: u (2 p), t [ms] (2 p), ±U és T jelölése (2 p) | 6 |
| Négyszögjel alakja: két szint (3 p), éles váltások, szimmetria (3 p), legalább két periódus (2 p) | 8 |
| A spektrum tengelyei: amplitúdó, f [kHz] | 4 |
| Spektrumvonalak: alapharmonikus 1 kHz-nél (3 p), felharmonikusok a többszörösökön (3 p), csökkenő amplitúdó (2 p) | 8 |
| Magyarázat: felharmonikus fogalma (3 p), miért sok a négyszögjelben (3 p) | 6 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A spektrumban nem az alapfrekvencia többszörösein, hanem tetszőleges helyeken rajzolják a vonalakat.
- A négyszögjel élei ferdék/lekerekítettek, vagy a két szint nem szimmetrikus a nulla körül.
- A felharmonikus fogalmát összekeverik a hullámhosszal vagy a modulációs oldalsávval.

## 3. feladat (32 pont)

**Feladat:** Rajzoljon le egy négyelemes Yagi antennát, és nevezze meg az elemeket! Jelölje a főirányt, és írja le, hogyan viszonyul egymáshoz az elemek hossza!

**Elvárt megoldás:** A Yagi antenna elemei egy közös tartórúdon (gerincen, boomon) ülnek. Középen a táplált elem a sugárzó (félhullámú dipólus), mögötte, a főiránnyal ellentétes oldalon egyetlen reflektor, előtte, a főirányban két direktor található. A reflektor a sugárzónál néhány százalékkal hosszabb, a direktorok rövidebbek. A reflektor és a direktorok parazita elemek: sugárzáscsatolással működnek, nincs közvetlen tápláló vezetékük. A főirány a direktorok felé mutat.

**Mintarajz:**
```text
      reflektor        sugárzó       1. direktor 2. direktor
    (leghosszabb)   (tápelem, X)     (rövidebb)  (rövidebb)

          |
          |               |
          |               |               |           |
          |               |               |           |
  --------+---------------X---------------+-----------+--------> főirány
          |               |               |           |
          |               |               |           |
          |               |
          |

  A vízszintes vonal a gerinc (boom); X = a sugárzó táppontja,
  itt csatlakozik a tápvonal. A főirány a direktorok felé mutat.
```

**Magyarázat:** A félhullámú dipólus irányhatását növelhetjük, ha előtte néhány százalékkal rövidebb elemet (direktort), mögötte pár százalékkal hosszabb elemet (reflektort) helyezünk el. A sugárzáscsatolt, parazita elemekkel kiegészített dipólust nevezzük Yagi antennának. Az elemszám és a gerinchossz növelésével nő a nyereség és csökken a nyílásszög. Az elemek mérete és távolsága szigorúan meghatározott, mert ezektől függ a nyereség, a talpponti impedancia, az előre-hátra viszony és a sávszélesség. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.4.1. fejezet (9.4-3. ábra).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Az elemek helyes sorrendje a gerincen: reflektor, sugárzó, két direktor | 12 |
| Az elemhosszak viszonya (reflektor > sugárzó > direktorok) | 6 |
| Megnevezések (reflektor, sugárzó, direktor, gerinc) | 4 |
| A főirány jelölése (a direktorok felé) | 5 |
| Működés: parazita elemek, a nyereség és a nyílásszög összefüggése | 5 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A főirányt a reflektor felé jelölik, vagy a direktort hosszabbra rajzolják a sugárzónál.
- Minden elemet táplálnak, vagy a tápvonalat nem a sugárzó elemhez kötik.
- Három vagy öt elemet rajzolnak négy helyett.
