# Gyakorló feladatlap 03 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_03.md](gyakorlo_irasbeli_kerdesek_03.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy földelt emitteres kisfrekvenciás erősítő fokozatot NPN tranzisztorral! Jelölje a tápfeszültséget, a bemenetet, a kimenetet és a földpontot, nevezze meg az elemeket, és magyarázza el röviden a kondenzátorok és az emitterellenállás szerepét!

**Elvárt megoldás:** Az NPN tranzisztor (T1) bázisát a +Ut tápfeszültség és a föld között kötött R1–R2 feszültségosztó állítja be (egyenáramú munkapont). A kollektor az Rc munkaellenálláson át a +Ut-ra, az emitter az Re ellenálláson át a földre csatlakozik, Re-vel párhuzamosan egy Ce kondenzátorral. A bemenő jel (Ube) a C1 csatolókondenzátoron át a bázisra jut, a kimenő jel (Uki) a kollektorról a C2 csatolókondenzátoron át vehető le. A bemenet és a kimenet közös pontja a föld.

**Mintarajz:**
```text
            *----------*--------------------o +Ut
            |          |
           [ ] R1     [ ] Rc
            |          |       C2
            |          *-------||-----------o
     C1     |        |/                     |
o----||-----*--------|   T1                 |
|           |        |\>                    |
|          [ ] R2      |                    |
|           |          *----------+         | Uki
| Ube       |          |          |         |
|           |         [ ] Re      |         |
|           |          |         ---        |
v           |          |         --- Ce     v
o-----------*----------*----------*-----*---o
                                       === föld
                                        =

Jelölések: [ ] ellenállás, -||- és --- / --- kondenzátor, |/ |\> NPN
  tranzisztor (nyíl az emitteren)
```

**Magyarázat:** A C1 és C2 csatolókondenzátorok leválasztják az egyenfeszültséget a fokozat bemenetéről és kimenetéről, így a munkapontot nem befolyásolja az előző és a következő fokozat. Az Re emitterellenállás a munkapont stabilizálására szolgál, a Ce kondenzátor pedig váltóáramon lesöntöli, így az emitter váltóáramú szempontból közvetlenül földpotenciálon van. Ha a bázis feszültsége nő, nő a kollektoráram és az Rc-n eső feszültség, a kollektor (kimenet) feszültsége pedig csökken: a fokozat feszültséget erősít, és a jelet fordítja. Forrás: jegyzet/06_Aramkorok.md, 6.4.1. (6.4.1.1., 6.4.1.2., 6.4-1. ábra); jegyzet/04_Alkatreszek.md, 4.5.10.2.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Tranzisztor helyes bekötése: emitter a földre (Re és Ce), kollektor Rc-n át a +Ut-ra | 8 |
| Bázisosztó (R1, R2) és a bázis bekötése | 6 |
| Csatolókondenzátorok: C1 a bemeneten, C2 a kimeneten | 4 |
| Jelölések, megnevezések (+Ut, Ube, Uki, föld, T1, az elemek) | 6 |
| Működés: a kondenzátorok, Re és Ce szerepe, fázisfordítás | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A Ce kimarad, vagy Re-vel sorba kerül, ezért az emitter nincs váltóáramú földpotenciálon.
- Nincs bázisosztó: a bázis közvetlenül a tápra kötött, így nincs egyenáramú munkapont-beállítás.
- A kimenet az emitterről kerül levételre, vagy hiányzik az Rc: ez már nem földelt emitteres kapcsolás.

## 2. feladat (32 pont)

**Feladat:** Rajzolja fel egy valóságos soros és egy valóságos párhuzamos rezgőkör impedanciáját a frekvencia függvényében! Jelölje a rezonanciafrekvenciát, adja meg a kiszámítására szolgáló képletet, és mondja meg, hogyan változnak a görbék, ha a jósági tényező nő!

**Elvárt megoldás:** Mindkét ábrán a vízszintes tengely a frekvencia (f), a függőleges az impedancia (Z, Ω). A soros rezgőköré f0-nál minimumot mutat (Z ≈ R, a veszteségi ellenállás, Ω nagyságrendű, rövidzárhoz közeli), mindkét irányban nő. A párhuzamosé f0-nál maximumot mutat (kΩ nagyságrendű, szakadáshoz közeli), mindkét irányban csökken. A rezonanciafrekvencia f0 = 1 / (2π√(LC)) (Thomson-képlet), ahol XL = XC. Ha a Q0 nő, a soros görbe minimuma mélyebb, a párhuzamosé maximuma magasabb lesz, és mindkét görbe keskenyebb (B = f0 / Q0).

**Mintarajz:**
```text
   SOROS rezgőkör                          PÁRHUZAMOS rezgőkör
|Z|                                     |Z|
     ^                                       ^ Zmax (kΩ nagyságrend)
     |                                       |              :
     |                                       |             *:*
     |              :                        |            **:**
     |              :                        |            * : **
     |**            :                        |           *  :  **
     | **           :             *          |          *   :   *
     |  ***         :           ***          |         **   :    **
     |    **        :         **             |        **    :     **
     |      **      :       ***              |      ***     :      ***
     |       ***    :    ***                 |    ***       :        ****
     |         ***  :  ***                   |****          :           ***
     |            **:***                     |              :
     |              :                        |              :
     |              :                        |              :
     ---------------:---------------->       ---------------:---------------->
                   f0             f                        f0             f
        Zmin = R (Ω nagyságrend)
```

**Magyarázat:** Rezonanciafrekvencián a tekercs és a kondenzátor reaktanciája egyenlő, így a kör tisztán ohmos. A soros kör ilyenkor kis impedanciájú (az ideális esetben rövidzár), a párhuzamos nagy impedanciájú (az ideális esetben szakadás); ezért a soros kör a jelet „átengedi”, a párhuzamos kiválasztja. A valóságos körökben a veszteségi ellenállás határozza meg, mennyire közelíti a görbe az ideális esetet, ezt fejezi ki a jósági tényező. A nagyobb Q0 egyszerre jelent mélyebb/magasabb szélsőértéket és kisebb sávszélességet. Forrás: jegyzet/06_Aramkorok.md, 6.1.1.–6.1.4.

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| Tengelyek és a rezonanciafrekvencia jelölése: f (2 p), Z [Ω] (2 p), f0 jelölése (2 p) | 6 |
| Soros kör görbéje: minimum f0-nál (4 p), kétoldali emelkedés (2 p), Zmin ≈ R, kis érték (2 p) | 8 |
| Párhuzamos kör görbéje: maximum f0-nál (4 p), kétoldali csökkenés (2 p), Zmax nagy érték (2 p) | 8 |
| Rezonanciafrekvencia képlete (3 p) és az XL = XC feltétel (1 p) | 4 |
| A jósági tényező hatása: szélsőérték (3 p) és sávszélesség (3 p) változása | 6 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A két görbét felcserélik: a soros körhöz maximumot, a párhuzamoshoz minimumot rajzolnak.
- Hiányzik az f0 jelölése, vagy a Thomson-képletben elmarad a 2π, illetve a gyökjel.
- A Q hatását fordítva adják meg (nagyobb Q = szélesebb görbe).

## 3. feladat (32 pont)

**Feladat:** Rajzolja le egy egyszerű CW (távíró) adó blokkvázlatát, és nevezze meg a fokozatokat! Jelölje be a rajzon, hol történik a billentyűzés, és írja le röviden a működést!

**Elvárt megoldás:** Az adó oszcillátora KF frekvencián rezeg (kvarcvezérelt), és ezt billentyűzzük. A jel a keverőbe kerül, ahol a VFO jelével keveredik, ezután szűrő, előerősítő és végerősítő következik, a kimenet az antennára megy. A billentyű az oszcillátor tápfeszültségét kapcsolja, vagyis az oszcillátor csak lenyomott billentyűnél működik. Megoldás lehet az is, hogy az oszcillátor folyamatosan működik és a kimenetét billentyűzzük; ennek hátránya, hogy a jelet soha nem lehet teljesen elnyomni.

**Mintarajz:**
```text
    +-----------+       +-------+
    | Billentyű |       |  VFO  |
    +-----------+       +-------+
         |                  |
         | billentyűzés     |
         v                  v
 +---------------+    +----------+    +----------+
 |  Oszcillátor  |--->|  Keverő  |--->|  Szűrő   |
 |  (kvarc, KF)  |    |   (X)    |    +----------+
 +---------------+    +----------+          |
        +-----------------------------------+
        |
        |
        v
 +------------+    +------------+
 | Előerősítő |--->| Végerősítő |----> Antenna
 +------------+    +------------+

Billentyű lenyomva: az oszcillátor működik, a jel az antennára jut.
Billentyű felengedve: az oszcillátor nem működik, nincs kisugárzott jel.
```

**Magyarázat:** A távíró (CW) adó a legegyszerűbb adótípus: a vivőt a billentyű ki-be kapcsolja. Elterjedt módszer a KF oszcillátor tápfeszültségének billentyűzése. Ha az oszcillátor folyamatosan jár és csak a kimenetét billentyűzzük, akkor nagy kimenő teljesítménynél is pár watt folyamatosan kisugárzódik. A keverő a VFO segítségével az üzemi frekvenciára viszi a jelet, az erősítő fokozatok pedig a kívánt kimenő teljesítményre. A végfokozat kimenetén a felharmónikusokat kimeneti szűrővel kell kiszűrni. Forrás: jegyzet/08_Adok.md, 8.2.1., 8.3.4. és 8.3.5. fejezet.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Helyes jelút: oszcillátor, keverő, szűrő, előerősítő, végerősítő, antenna | 14 |
| A VFO a keverőhöz csatlakozik, a billentyű helye jelölve | 6 |
| Fokozatok megnevezése | 6 |
| A működés leírása (billentyű lenyomva/felengedve) | 4 |
| A billentyűzés két módja és a kimenet billentyűzésének hátránya | 2 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A billentyűt a végerősítő és az antenna közé vagy a mikrofon helyére rajzolják.
- Kimarad a keverő és a VFO, vagy az oszcillátort az üzemi frekvenciára hangoltnak tekintik.
- Kimarad a szűrő, és nem említik a felharmónikusok kiszűrését.
