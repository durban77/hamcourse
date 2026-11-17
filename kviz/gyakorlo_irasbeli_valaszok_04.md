# Gyakorló feladatlap 04 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_04.md](gyakorlo_irasbeli_kerdesek_04.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy Zener-diódás feszültségstabilizátort! Jelölje a bemenetet, a kimenetet és a közös vezetéket, nevezze meg az elemeket, és adja meg a kimeneti feszültséget, valamint azt, hogyan kell a Zener-diódát bekötni!

**Elvárt megoldás:** A bemenet pozitív kivezetése és a kimenet pozitív kivezetése között soros R előtétellenállás van. A kimeneti csomópont és a közös (negatív) vezeték közé kerül a Zener-dióda (Dz) záróirányban, vagyis a katódja a pozitív oldalon van. A terhelés a kimeneti kapcsokra, tehát a Zener-diódával párhuzamosan csatlakozik. A kimeneti feszültség egyenlő a Zener-feszültséggel: Uki = Uz.

**Mintarajz:**
```text
o---------[R]-----------*-------------o
|                       |             |
|                       |             |
| Ube                  --- Dz         | Uki
|                      /_\            |
|                       |             |
v                       |             v
o-----------------------*-------------o

Jelölések: [ ] ellenállás, --- / /_\ Zener-dióda (a vonal a katód), *
  csomópont, o kivezetés
```

**Magyarázat:** A Zener-dióda tartósan a letörési tartományban dolgozik: záróirányban az áram változásakor is megtartja a feszültségét, ezért a kimeneten Uz marad, a többletfeszültség pedig az R ellenálláson esik. A terhelhetőség korlátozott: It max = Iz max − Iz min, a Zener maximális árama pedig a megengedett disszipációtól függ. A stabilitás nem túl jó, mert a Zener tulajdonságaitól (pl. hőmérsékletfüggés) függ. Forrás: jegyzet/06_Aramkorok.md, 6.3.2.1. (6.3-10. ábra); jegyzet/04_Alkatreszek.md, 4.5.4.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Soros R ellenállás a pozitív ágban | 8 |
| Zener-dióda a kimenettel párhuzamosan, záróirányban (katód a + oldalon) | 10 |
| Bemenet, kimenet, közös vezeték és elemek jelölése (R, Dz, Ube, Uki) | 6 |
| Működés: Uki = Uz, a felesleges feszültség R-en esik, korlátok | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A Zener-dióda nyitóirányban van bekötve: ekkor csak kb. 0,6 V-ra korlátoz, nem stabilizál.
- Hiányzik a soros R ellenállás, vagy a Zener-dióda sorba kerül a terheléssel.
- A kimeneti feszültség megadása Uz nélkül (pl. Uki = Ube).

## 2. feladat (32 pont)

**Feladat:** Ábrázolja egy szilícium egyenirányító dióda áram–feszültség karakterisztikáját! Jelölje a nyitó- és a záróirányt, a nyitófeszültséget és a záróirányú letörési feszültséget, és magyarázza meg, mi történik a diódával a letörési tartományban!

**Elvárt megoldás:** A vízszintes tengely a diódafeszültség (UD, V), a függőleges az áram (ID). Jobbra a nyitóirány (az anód pozitívabb a katódnál): 0,6 V alatt az áram közel nulla, kb. 0,6 V-tól meredeken, exponenciálisan nő. Balra a záróirány: nagyon kicsi (visszáram jellegű) áram folyik, amit a más léptékű tengelyen kell ábrázolni. A záróirányú letörési feszültségnél (UBR) az áram hirtelen, meredeken megnő. Egy közönséges egyenirányító dióda ebben a tartományban tönkremegy.

**Mintarajz:**
```text

                                          ID [mA]  (nyitóirány)
                                        ^
                                        |                       *
                                        |                       *
                                        |     nyitófeszültség   *
                                        |     (Si: kb. 0,6 V)  *
                                        |                      *
                                        |     ez fölött a dióda vezet
                                        |                      *
                                        |                     **
        (letörés)                       |                     *
           -UBR                         |                    **
                                        |                  ***
    ----------+-------------------------******************+*--------->
              **************************|0              0,6 V   UD [V]
              *                         |
              *  záróirányú visszáram:  |
              *  nagyon kicsi, kb. 0    |
              *                         |
              *  UBR-nél hirtelen,      |
              *  meredeken nő (lefelé)  |
              *                         | IR [záróirány, más léptékben!]
              *                         |
```

**Magyarázat:** A dióda egy pn-átmenet, ezért csak az egyik irányban vezet: nyitóirányban a szilíciumdióda kb. 0,6 V nyitófeszültség fölött, záróirányban csak a letörési feszültség elérése után. A záróirányú áram a nyitóirányúhoz képest több nagyságrenddel kisebb, ezért a tengelyét más léptékben rajzolják. A letörés egyenirányító diódánál rendellenes, tönkremenetellel járó üzem. A Zener-dióda ezzel szemben úgy van kialakítva, hogy tartósan a letörési tartományban dolgozzon és ott tartsa a feszültséget. Forrás: jegyzet/04_Alkatreszek.md, 4.5.1., 4.5.3. és 4.5.4.

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| Tengelyek: UD [V] (3 p), ID (3 p), nyitó- és záróirány jelölése (2 p) | 8 |
| Nyitóirányú ág: 0,6 V alatt közel nulla (3 p), 0,6 V után meredek növekedés (3 p), a nyitófeszültség jelölése (2 p) | 8 |
| Záróirányú ág: nagyon kicsi áram (3 p), meredek növekedés UBR-nél (3 p), UBR jelölése, eltérő léptéke (2 p) | 8 |
| Értelmezés: mikor vezet a dióda (3 p), a letörés következménye (3 p), a Zener-dióda különbsége (2 p) | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A görbe az origóból indul lineárisan (Ohm-törvény szerinti egyenes), nincs nyitófeszültség-küszöb.
- A záróirányú letörést nem jelölik, vagy azt állítják, hogy a közönséges dióda ott normálisan üzemel.
- Hiányzik a tengelyfelirat, vagy a nyitóirány és a záróirány felcserélődik.

## 3. feladat (32 pont)

**Feladat:** Rajzolja le egy FM vevő blokkvázlatát, és nevezze meg a fokozatokat! Röviden magyarázza meg, mi különbözteti meg a felépítését az AM vevőétől!

**Elvárt megoldás:** A jel útja: antenna, sávszűrő és HF előerősítő, keverő (a VFO-val), KF szűrő és KF erősítő, limiter, fázisdetektor (diszkriminátor), NF erősítő, hangszóró. A fokozatok nagy része megegyezik az AM vevőével. Az FM vevőre a limiter és a fázisdetektoros demodulátor jellemző; az AM vevőben a demodulátor egyszerű diódás. A limiter korlátozza a KF jel amplitúdóját, a fázisdetektor a frekvenciaváltozást hangfrekvenciás jellé alakítja.

**Mintarajz:**
```text
                                 +-------+
                                 |  VFO  |
                                 +-------+
 Antenna                             |
    Y                                |
    |                                v
    |     +---------------+    +----------+    +-------------+
    +-----|  Sávszűrő és  |--->|  Keverő  |--->| KF szűrő és |
          | HF előerősítő |    |   (X)    |    |  KF erősítő |
          +---------------+    +----------+    +-------------+
                                                      |
       +----------------------------------------------+
       |
       v
 +-----------+    +------------------+    +------------+    +-----------+
 |  Limiter  |--->|  Fázisdetektor   |--->| NF erősítő |--->| Hangszóró |
 +-----------+    | (diszkriminátor) |    +------------+    +-----------+
                  +------------------+
```

**Magyarázat:** Az FM vevő is szuperheterodin felépítésű: a bemeneti jelet a keverő a VFO-val a KF-re keveri, a KF fokozat adja a szelektivitást. A különbség a demodulátorban van: itt limiter és fázisdetektor (diszkriminátor) áll, míg az AM vevő demodulátora egyszerű dióda. Az FM jel információja a frekvenciaváltozásban rejlik, ezért a fázisdetektoros demodulátor az átvitt frekvenciaeltérést hangfrekvenciás jellé alakítja, a limiter pedig az amplitúdót korlátozza. Forrás: jegyzet/07_Vevok.md, 7.4.2. és 7.4.4. fejezet, valamint diak/05_vevok.md (FM vevő: limiter + diszkriminátor).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Helyes jelút és sorrend (antenna, sávszűrő/előerősítő, keverő, KF, limiter, fázisdetektor, NF erősítő, hangszóró) | 14 |
| A VFO a keverőhöz csatlakozik | 3 |
| Fokozatok megnevezése | 7 |
| A limiter és a fázisdetektor szerepe | 6 |
| A közös szuperheterodin felépítés (keverés, KF) megemlítése | 2 |
| **Összesen** | **32** |

**Gyakori hibák:**
- AM vevőt rajzolnak diódás demodulátorral, limiter nélkül.
- A limitert a keverő elé vagy a hangszóró után rajzolják.
- Elmarad a VFO, vagy a fázisdetektort és a limitert felcserélik.
