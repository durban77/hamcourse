# Gyakorló feladatlap 11 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_11.md](gyakorlo_irasbeli_kerdesek_11.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy hangolható, valóságos párhuzamos rezgőkört (a veszteséget ellenállással jelölve), nevezze meg az elemeit, és írja le, hogyan viselkedik az impedanciája a rezonanciafrekvencián! Hol használják ezt a kört a vevőkészülékben?

**Elvárt megoldás:** A két kivezetés között két ág kapcsolódik párhuzamosan: az egyik ágban a tekercs (L) és vele sorosan a veszteségi ellenállás (Rv), a másikban a változtatható kondenzátor (Cv). A rezonanciafrekvencia f0 = 1 / (2π√(LC)), amely a kondenzátor állításával hangolható. Rezonancián a párhuzamos kör impedanciája maximális, tiszta ohmos és nagy (kΩ nagyságrendű), ideális esetben szakadás. A kört a vevő bemeneti hangolókörében használják.

**Mintarajz:**
```text
o---------*-------------*
|         |             |
|         (             |
|         (  L          |
| U       (            -/-
|         |            -/- Cv
|        [ ] Rv         |
|         |             |
v         |             |
o---------*-------------*

Jelölések: ( ( ( tekercs, [ ] ellenállás, -/- változtatható kondenzátor, o
  kivezetés, * csomópont
```

**Magyarázat:** A párhuzamos kör rezonancián szakadásként viselkedik, ezért a vevő bemenetén a kívánt frekvenciát tudjuk kiválasztani, a többit elnyomja. A veszteség miatt a rezonancia-ellenállás véges; a nagyságát a jósági tényező (Q0) határozza meg, a sávszélesség pedig B = f0 / Q0. Összehasonlításul: a soros kör rezonancián rövidzár, a párhuzamos szakadás. Forrás: jegyzet/06_Aramkorok.md, 6.1.2.–6.1.4. (6.1-5., 6.1-6., 6.1-7. ábra); a változtatható kondenzátorról jegyzet/04_Alkatreszek.md, 4.2.2.4.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Két párhuzamos ág a kivezetések között: L és Rv sorosan, valamint C | 14 |
| A hangolhatóság jelölése és a megnevezések (L, Rv, Cv, kivezetések) | 6 |
| A rezonanciafrekvencia képlete és a hangolás módja | 6 |
| Az impedancia rezonancián (maximum, nagy ohmos, ideálisan szakadás) és az alkalmazás | 6 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Soros LC kört rajzol, vagy a két elem nincs a két kivezetés között párhuzamosan.
- A veszteségi ellenállás kimarad, vagy értelmetlen helyre kerül.
- A maximum és a minimum felcserélése: „rezonancián az impedancia minimális” (ez a soros körre igaz).

## 2. feladat (32 pont)

**Feladat:** Ábrázolja az 50 Hz-es hálózati szinuszos feszültségből egyutas egyenirányítóval, kétutas egyenirányítóval, majd kétutas egyenirányítóval és simító (puffer-)kondenzátorral kapott kimenő feszültség időfüggvényét! Jelölje a csúcsértéket, és magyarázza meg a brumm fogalmát!

**Elvárt megoldás:** Három ábra közös időtengellyel (t, T = 20 ms). Egyutas: csak a pozitív félhullámok jelennek meg, a negatív félperiódusokban a kimenő feszültség nulla. Kétutas: mindkét félperiódus pozitív irányban megjelenik (egymás után ívek). Kétutas + kondenzátor: a kondenzátor a csúcsokig feltöltődik, a csúcsok között a terhelésen át lassan kisül, a következő ív újratölti, így fűrészfogszerű, kis hullámosságú, a csúcsérték közelében futó feszültség keletkezik. A brumm a kimeneten maradó váltakozó (lüktető) összetevő.

**Mintarajz:**
```text


a) egyutas egyenirányítás (egy dióda)
Um    ^ u   *****                       *****
      |    **   **                     **   **
      |   **     **                   **     **
      |  **       **                 **       **
      |  *         *                 *         *
      | **         **               **         **
      |**           **             **           **
      -*-------------***************-------------***************---> t
       0                           T                           2T



b) kétutas egyenirányítás (két dióda / Graetz-híd)
Um    ^ u   *****         *****         *****         *****
      |    **   **       **   **       **   **       **   **
      |   **     **     **     **     **     **     **     **
      |  **       **   **       **   **       **   **       **
      |  *         *   *         *   *         *   *         *
      | **         ** **         ** **         ** **         **
      |**           ***           ***           ***           **
      -*-------------*-------------*-------------*-------------*---> t
       0                           T                           2T



c) kétutas + simító (puffer-) kondenzátor: marad a brumm
Um    ^ u   ######        ######        ######        ######
      |######   .##########   .##########   .##########   .#####
      |   ##     ..     ##     ..     ##     ..     ##     ..
      |  ..       ..   ..       ..   ..       ..   ..       ..
      |  .         .   .         .   .         .   .         .
      | ..         .. ..         .. ..         .. ..         ..
      |..           ...           ...           ...           ..
      -.-------------.-------------.-------------.-------------.---> t
       0                           T                           2T
       # simított, . egyenirányított jel (a brumm nagyítva)
```

**Magyarázat:** Az egyutas egyenirányító csak a félhullámokat engedi át, ezért lüktető a kimenete, a hatásfoka legfeljebb 50%, és erős szűrést igényel. A kétutas kapcsolás (két dióda középleágazású transzformátorral, vagy Graetz-híd) mindkét félperiódust hasznosítja. A simító kondenzátor tárolja az energiát, amikor a diódák nem vezetnek; a nagyobb kapacitás kisebb brummot ad. Gyakorlati méretezés: a brumm csúcsértéke a névleges kimeneti feszültség kb. 5%-a. A mintarajzon a hullámosság az áttekinthetőségért nagyítva látszik. Forrás: jegyzet/06_Aramkorok.md, 6.3.1.1.–6.3.1.2.

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| Tengelyek és jelölések: u (2 p), t közös tengely, T = 20 ms (2 p), Um csúcsérték (2 p) | 6 |
| Egyutas egyenirányítás: pozitív félhullámok, nulla a negatív félperiódusban | 6 |
| Kétutas egyenirányítás: mindkét félperiódus pozitív, a csúcsok helye azonos | 6 |
| Simított feszültség: követi a csúcsokat (3 p), a csúcsok között lassan csökken (3 p), kis hullámosság (2 p) | 8 |
| Magyarázat: a brumm fogalma (3 p), a kondenzátor szerepe (3 p) | 6 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Az egyutas ábrán a negatív félhullámot is lerajzolják, vagy a negatív rész helyett nem nullát húznak.
- A simított jel teljesen egyenes vonal (brumm nélkül), vagy a kondenzátor a nulláig kisül a csúcsok között.
- A kétutas ábrán a félhullámok előjelet váltanak (nem lettek egyenirányítva).

## 3. feladat (32 pont)

**Feladat:** Rajzolja le vázlatosan a felületi hullám, a térhullám (közvetlen hullám) és az ionoszféráról visszaverődő hullám terjedését! Nevezze meg a rajz elemeit, és adja meg, melyik terjedési mód melyik frekvenciatartományra jellemző!

**Elvárt megoldás:** A rajzon az adó és a vevő antennája, a földfelszín és a felette lévő ionoszféra szerepel. (1) A felületi hullám a földfelszín mentén terjed; jellemzően a hosszú- és középhullámú tartományban fordul elő, csak függőleges polarizációval valósítható meg. (2) A térhullám (közvetlen hullám, LOS) a két antenna között közvetlenül terjed; az URH és a mikrohullámú tartományban domináns, határa a rádióhorizont. (3) Az ionoszférikus hullám a rövidhullámú tartományban az ionoszféráról visszaverődve a látóhatáron túlra jut; a visszaverődés és a becsapódás közötti, nem vehető terület a holt zóna, azon túl az ellátott terület.

**Mintarajz:**
```text
==========================*============= ionoszféra (visszaverő réteg) =====
                       /     \
                    /           \
                 /          3      \
              /                       \
           /                             \
   Adó  /  Vevő 1                           \        Vevő 2
    Y         Y                                \        Y
    | -  -  - |                                         |
    |    2    |                                         |
    |    1    |                                         |
    |~~~~~~~~~|                                         |
## Föld felszíne ###########################################################
     |       <------- holt zóna ------->       |<-- ellátott terület -->

1 = felületi hullám   2 = térhullám (közvetlen)
3 = ionoszférikus (visszaverődő) hullám
```

**Magyarázat:** A terjedési módot a frekvenciatartomány határozza meg. A felületi hullámnál a talajban vezetési áramok folynak, a hullám a földfelszín mentén halad; vízszintes antennánál a negatív tükörkép kioltja a felületi hullámot, ezért függőleges polarizáció kell. A közvetlen hullámnál a távolsággal a teljesítménysűrűség négyzetesen csökken. Az ionoszférikus terjedésnél a növekvő frekvenciákkal egyre magasabb rétegről kapunk visszatérő hullámot, az áthidalt távolság függ az antenna kisugárzási szögétől. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.1., 10.1.3., 10.1.5. és 10.1.6. fejezet.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| A rajz alapelemei: Föld, ionoszféra, adó és vevők | 8 |
| Felületi hullám helyes ábrázolása és jellemzése (földfelszín mentén, függőleges polarizáció) | 5 |
| Térhullám (közvetlen hullám) ábrázolása | 5 |
| Ionoszférikus hullám: visszaverődés, holt zóna, ellátott terület | 6 |
| A terjedési módok és frekvenciatartományok helyes párosítása (KH/HH, URH és mikro, RH) | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Az ionoszférikus hullámot URH-hoz vagy a felületi hullámot az URH tartományhoz kötik.
- A holt zónát az adótól távol, a visszaverődés után jelölik.
- A felületi hullámnál elfelejtik, hogy vízszintes polarizációval nem működik.
