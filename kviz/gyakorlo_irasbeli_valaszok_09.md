# Gyakorló feladatlap 09 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_09.md](gyakorlo_irasbeli_kerdesek_09.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy emitterkövető (földelt kollektoros) erősítő fokozatot NPN tranzisztorral! Jelölje a tápfeszültséget, a bemenetet, a kimenetet és a földpontot, nevezze meg az elemeket, és adja meg a fokozat fontosabb tulajdonságait és egy alkalmazását!

**Elvárt megoldás:** Az NPN tranzisztor (T1) kollektora közvetlenül a +Ut tápfeszültségre csatlakozik (váltóáramú szempontból ez földpont). A bázist az R1–R2 feszültségosztó állítja be, a bemenő jel (Ube) a C1 csatolókondenzátoron át jut a bázisra. Az emitter Re ellenálláson át a földre csatlakozik, a kimenő jelet (Uki) az emitterről a C2 csatolókondenzátoron át vesszük le. Kollektorellenállás nincs.

**Mintarajz:**
```text
            *----------*--------------------o +Ut
            |          |
           [ ] R1      |
            |          |
            |          |
     C1     |        |/
o----||-----*--------|   T1
|           |        |\>
|          [ ] R2      |       C2
|           |          *-------||-----------o
| Ube       |          |                    |
|           |         [ ] Re                | Uki
|           |          |                    |
v           |          |                    v
o-----------*----------*------------*-------o
                                   === föld
                                    =

Jelölések: [ ] ellenállás, -||- kondenzátor, |/ |\> NPN tranzisztor (nyíl az
  emitteren)
```

**Magyarázat:** A kimenő feszültség követi a bázis feszültségét (a bázis-emitter nyitófeszültséggel, kb. 0,6 V-tal kisebb nála), innen a név. Feszültségerősítése nincs, csak áramerősít. Jellemzője a nagy bemeneti és a kis kimeneti impedancia, ezért illesztő- és elválasztó fokozatként használják, például az adó oszcillátora után, hogy a következő fokozat ne terhelje. Forrás: jegyzet/04_Alkatreszek.md, 4.5.10.2.; diak/03_alkatreszek.md (Tranzisztor alapkapcsolások); diak/06_adok.md (elválasztó fokozat).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Tranzisztor: kollektor a tápon, kimenet az emitterről, Re a földre | 12 |
| Bázisosztó (R1, R2) és csatolókondenzátorok (C1, C2) | 6 |
| Jelölések, megnevezések (+Ut, Ube, Uki, föld, T1, az elemek) | 6 |
| Tulajdonságok (nagy bemeneti, kis kimeneti impedancia, csak áramerősítés) és alkalmazás | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A kimenetet a kollektorról veszi le, vagy Rc-t rajzol a kollektorba: ez földelt emitteres kapcsolás.
- A kollektor nincs a tápfeszültségre kötve, vagy hiányzik az Re emitterellenállás.
- Azt állítja, hogy az emitterkövető feszültséget erősít.

## 2. feladat (32 pont)

**Feladat:** Ábrázolja egy legfeljebb 3 kHz-es hangjellel modulált AM-DSB és egy SSB (felső oldalsávos) jel spektrumát a vivőfrekvencia (fc) környezetében! Jelölje a vivőt és az oldalsávokat, és adja meg a két jel sávszélességét!

**Elvárt megoldás:** A vízszintes tengely a frekvencia (f), a függőleges az amplitúdó. AM-DSB: a vivő az fc-nél, mellette alatta az alsó oldalsáv (fc − 3 kHz … fc), fölötte a felső oldalsáv (fc … fc + 3 kHz); a sávszélesség B = 2 · fm = 6 kHz. SSB (USB): a vivő és az alsó oldalsáv hiányzik, csak a felső oldalsáv marad (fc … fc + 3 kHz); a sávszélesség B = fm = 3 kHz. Az oldalsávok alakja szemléltető.

**Mintarajz:**
```text
a) A moduláló jel (alapsáv) spektruma
      ^ amplitúdó
      |
      |
      |
      |##########
      |##########
      |##########
      |##########
      ------------------------------------------------------------->
      0       fm = 3 kHz                                      f

b) AM-DSB: alsó oldalsáv + vivő + felső oldalsáv
      ^ amplitúdó
      |                             ##
      |                             ##
      |                             ##
      |                 ########### ## ###########
      |                 ########### ## ###########
      |                 ########### ## ###########
      |                 ########### ## ###########
      ------------------------------------------------------------->
                        fc-3       fc          fc+3           f
                        <------------------------>  B = 2·fm = 6 kHz
c) SSB (USB): vivő és alsó oldalsáv elnyomva
      ^ amplitúdó
      |
      |
      |
      |                                ###########
      |                 (vivő: nincs)  ###########
      |                                ###########
      |                                ###########
      ------------------------------------------------------------->
                                   fc          fc+3           f
                                       <--------->  B = fm = 3 kHz
```

**Magyarázat:** Az AM-DSB kétszer akkora sávszélességet foglal el, mint a moduláló jel, mert a két oldalsáv ugyanazt az információt hordozza, a vivő pedig nem hordoz információt. Az SSB előállításakor a vivőt elnyomják, a másik oldalsávot pedig szűrővel eltávolítják, így a megmaradó oldalsáv a moduláló jel sávszélességét foglalja el. Az USB a felső, az LSB az alsó oldalsáv megtartását jelenti. A rajz az oldalsávok teljesítményarányát nem mutatja. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.1.1.–5.2.1.2.

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| Tengelyek (f, amplitúdó), az fc jelölése, a ±3 kHz skála | 6 |
| AM-DSB spektrum: vivő (3 p), alsó oldalsáv (3 p), felső oldalsáv (3 p) | 9 |
| SSB (USB) spektrum: csak a felső oldalsáv (4 p), a vivő hiánya (2 p), az alsó oldalsáv hiánya (2 p) | 8 |
| Sávszélességek: DSB 6 kHz (3 p), SSB 3 kHz (3 p) | 6 |
| Magyarázat: miért pazarló a DSB, mit szűrünk ki SSB-nél | 3 |
| **Összesen** | **32** |

**Gyakori hibák:**
- SSB-nél is berajzolják a vivőt, vagy mindkét oldalsávot megtartják.
- A DSB sávszélességét 3 kHz-nek adják meg (a 2 · fm szorzó elmarad).
- A felső és az alsó oldalsávot felcserélik (az USB az fc fölött van).

## 3. feladat (32 pont)

**Feladat:** Rajzolja le az állóhullám-arány (SWR) mérésének kapcsolási vázlatát! Nevezze meg a mérés elemeit, és írja le a mérés főbb lépéseit!

**Elvárt megoldás:** Az SWR-mérőt az adóvevő és az antenna közötti tápvonalba kell becsatlakoztatni: adóvevő, SWR-mérő, tápvonal (koax), antenna (vagy műterhelés). Az SWR-mérő belül csatoló-hálózattal kicsatolja a tápvonalról az előremenő (FWD) és a visszavert (REV) teljesítmény egy kis részét, ezt egyenirányítja, és műszerrel méri. A mérést kis teljesítménnyel (kb. 0,5-1 W) és vivős üzemmódban (FM, CW) végezzük. FWD állásban a potméterrel 100%-ra állítjuk a mutatót, majd REV állásban leolvassuk az SWR-t. Ha csak a tápvonal SWR-je érdekel, antenna helyett műterhelést kötünk a végére.

**Mintarajz:**
```text

 +-------------------+      +--------------------+      +-----------------+
 |      Adóvevő      |      |      SWR-mérő      | koax |     Antenna     |
 |  (vivős üzemmód,  |----->| (csatoló-hálózat)  |----->| vagy műterhelés |
 | kis teljesítmény) |      | a tápvonalba kötve |      +-----------------+
 +-------------------+      +--------------------+
                                |            |
                           FWD  |            | REV
                                |            |
                                v            v
                  +--------------------------------------+
                  |   Műszer (egyenirányított jelek):    |
                  |    FWD állásban 100%-ra állítjuk,    |
                  |   REV állásban leolvassuk az SWR-t   |
                  +--------------------------------------+

A mérés lépései:
1. FWD állás -> 2. potméterrel 100% -> 3. REV állás -> 4. SWR leolvasása
```

**Magyarázat:** Az SWR (állóhullám-arány) a tápvonalon fellépő legnagyobb és legkisebb feszültség hányadosa: SWR = Umax / Umin, értéke mindig 1 vagy annál nagyobb; illesztett lezárásnál 1. Az SWR a haladó és a visszavert teljesítménnyel is kifejezhető, SWR = 1,5 esetén a haladó teljesítmény kb. 4%-a verődik vissza. Az SWR-mérő csatolása nem módosíthatja a tápvonal impedanciáját. Forrás: jegyzet/11_Meresek.md, 11.5.1.1.–11.5.1.2. fejezet; jegyzet/09_Antennak_es_tapvonalak.md, 9.6.3. fejezet.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Helyes sorrend: adóvevő, SWR-mérő, tápvonal, antenna (vagy műterhelés) | 12 |
| Az SWR-mérő belső működése (csatoló-hálózat, egyenirányítás, FWD és REV ág, műszer) | 6 |
| Megnevezések | 4 |
| A mérés főbb lépései (kis teljesítmény, vivős üzemmód, FWD 100%, REV leolvasás) | 6 |
| Az SWR értelmezése (>= 1, illesztett eset, SWR = 1,5 esetén kb. 4% visszavert) | 4 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Az SWR-mérőt az adóba vagy az antennába kötik a tápvonal helyett, vagy párhuzamosan kötik.
- Nagy teljesítménnyel vagy SSB üzemmódban (vivő nélkül) mérnek, és a 100%-os beállítást kihagyják.
- A mérést a tápvonal SWR-jére és az antenna SWR-jére nem különböztetik meg (műterhelés, rövid tápvonal).
