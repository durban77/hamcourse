# Gyakorló feladatlap 12 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_12.md](gyakorlo_irasbeli_kerdesek_12.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy egyszerű diódás AM demodulátort (detektort)! Nevezze meg az elemeit, és magyarázza el, hogyan állítja vissza a hangfrekvenciás jelet!

**Elvárt megoldás:** A bemenet felső kivezetésétől sorosan egy dióda (D) vezet tovább, az anódja a bemenet felé néz. A dióda után a jelvezetékről két ág indul a közös (alsó) vezetékre: a C1 kondenzátor és vele párhuzamosan az R ellenállás. Ezután sorosan egy C2 csatolókondenzátor következik a kimenet felé. Az alsó vezeték összeköti a bemenet és a kimenet közös pontját.

**Mintarajz:**
```text
        D                          C2
o------->|--------*---------*------||-------o
|                 |         |               |
|                 |         |               |
| Ube            ---        |               | Uki
|                --- C1    [ ] R            |
|                 |         |               |
v                 |         |               v
o-----------------*---------*---------------o

Jelölések: >| dióda (a | a katód), --- / --- és -||- kondenzátor, [ ]
  ellenállás, * csomópont, o kivezetés
```

**Magyarázat:** A dióda egyenirányítja a nagyfrekvenciás jelet, így csak az egyik félhullámok jutnak át. A C1–R tag kiszűri a nagyfrekvenciás összetevőt, és megmarad a jel burkológörbéje; az AM jelben az információ ebben van, ez a hangfrekvenciás jel. A C2 csatolókondenzátor leválasztja az egyenáramú összetevőt. Forrás: jegyzet/06_Aramkorok.md, 6.6.1. (6.6-1., 6.6-2. ábra).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Dióda sorosan a jelútban, helyes irány | 10 |
| C1 és R párhuzamosan a közös vezetékre (sönt) | 8 |
| C2 csatolókondenzátor, bemenet/kimenet/közös vezeték jelölése | 6 |
| Működés: egyenirányítás, szűrés, burkológörbe, leválasztás | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A dióda hiányzik vagy fordítva van, a C1 vagy az R pedig sorba kerül a jelútba a közös vezeték helyett.
- A csatolókondenzátor hiányzik, ezért az egyenáramú összetevő a kimeneten marad.
- Nem említi, hogy az információ az AM jel burkológörbéje.

## 2. feladat (32 pont)

**Feladat:** Szemléltesse álló hullám ábrán a feszültség amplitúdóját a tápvonal mentén illesztett és illesztetlen lezárás esetén! Jelölje Umax-ot és Umin-t, adja meg az állóhullám-arány (SWR) definícióját, számítsa ki az SWR-t, ha Umax = 4 V és Umin = 2 V, és adja meg a reflektált teljesítmény arányát!

**Elvárt megoldás:** A vízszintes tengely a lezárástól mért távolság a tápvonal mentén, a függőleges a feszültség amplitúdója (V). Illesztett lezárásnál csak haladó hullám van, az amplitúdó állandó (vízszintes egyenes, SWR = 1). Illesztetlen lezárásnál a haladó és a visszavert hullám összege állóhullámot hoz létre: az amplitúdó periodikusan váltakozik a maximum (Umax = 4 V) és a minimum (Umin = 2 V) között. SWR = Umax / Umin = 4 / 2 = 2. Ebből VF = (Umax + Umin) / 2 = 3 V, VR = (Umax − Umin) / 2 = 1 V, a reflektált teljesítmény aránya (VR / VF)² = 1/9 ≈ 11%.

**Mintarajz:**
```text
|U| [V]
            SWR = Umax/Umin = 4/2 = 2   (Ra = 100 Ω, Z0 = 50 Ω)
        ^
        |
        |
        |
Umax=4  |***.........................******.........................***
        |   ***                   ****    ***                    ****
        |     ***               ***          **                ***
VF = 3  |-------***------------**--------------**--------     **
        |         **          **                ***         **
        |          ***      **                    **      ***
        |            *** ****                      **** ***
Umin=2  |..............***............................***..............
        |
        |
        |
        |
        |
 0      ----------------------------------------------------------------->
    lezárás                         távolság a lezárástól
        max            min             max            min            max

* görbe: illesztetlen lezárás (állóhullám)   --- egyenes: illesztett eset (SWR = 1)
```

**Magyarázat:** Az állóhullámok akkor keletkeznek, ha visszavert hullám van a tápvonalon; a tápvonal egy pontján mérhető feszültség az oda- és visszahaladó hullám feszültségének vektoros összege. Az SWR a legnagyobb és a legkisebb feszültség hányadosa, mindig legalább 1: SWR = Umax / Umin = (VF + VR) / (VF − VR). A teljesítményekkel kifejezve SWR = (1 + √(Pr/Ph)) / (1 − √(Pr/Ph)), erre 2-es SWR-nél Pr/Ph = 1/9 adódik (összehasonlításul: SWR = 1,5-nél a haladó teljesítmény kb. 4%-a verődik vissza). A mintarajzon a lezárás ellenállása nagyobb a hullámellenállásnál, ezért a lezárásnál maximum van. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.3.; sajat/meresek.md, SWR.

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| Tengelyek: feszültségamplitúdó [V] (2 p), távolság a lezárástól (2 p), a lezárás helye (2 p) | 6 |
| Illesztett eset: vízszintes egyenes, SWR = 1 | 5 |
| Illesztetlen eset: periodikusan váltakozó maximumok és minimumok (4 p), Umax és Umin jelölése (4 p) | 8 |
| SWR definíciója (3 p) és kiszámítása: 2 (3 p) | 6 |
| Reflektált teljesítmény aránya: 1/9 ≈ 11% | 4 |
| Magyarázat: a reflexió és az állóhullám kapcsolata | 3 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Az SWR-t 1-nél kisebbnek adják meg (Umin / Umax), vagy a teljesítmények hányadosaként értelmezik.
- A reflektált teljesítmény arányát a feszültségarányból (1/3) olvassák ki a négyzetre emelés nélkül.
- Az illesztett esetben is állóhullámot rajzolnak, vagy a hullámok csúcsai és völgyei egyenlőtlenül szerepelnek.

## 3. feladat (32 pont)

**Feladat:** Rajzolja le vázlatosan az ionoszféra rétegeit magasság szerint, és nevezze meg őket! Írja le röviden, hogyan változnak a rétegek nappal és éjszaka, és mi köze van ennek a rövidhullámú összeköttetésekhez!

**Elvárt megoldás:** Az ionoszféra a légkör kb. 40-500 km közötti, részben ionizált rétege. Alulról felfelé: D réteg (a legalsó, legkevésbé ionizált), E réteg (100-110 km, stabil), F réteg (kb. 250 km). Nappal az F réteg F1 (kb. 200 km) és F2 (220-400 km) rétegre bomlik, éjszaka az F1 és F2 egybeolvad, az alja kb. 300 km-re emelkedik. A D réteg nappal erősen csillapítja a hullámokat, gyakorlatilag megakadályozza a középhullámú távolsági vételt. Az F réteg a rövidhullámú nagy távolságú összeköttetések szempontjából alapvető.

**Mintarajz:**
```text
 magasság (km)

  ~500   - - - - - - - - - - - - - - - - - - - -   az ionoszféra teteje

 220-400 ~~~~~~~~~~~~~~~~ F2 ~~~~~~~~~~~~~~~~~~~~
  ~200   ~~~~~~~~~~~~~~~~ F1 ~~~~~~~~~~~~~~~~~~~~   (F1+F2 = F, ~250 km)

 100-110 ======================= E =============   (stabil réteg)

 (E alatt) --------------------- D -------------   (a legalsó réteg)

   40    - - - - - - - - - - - - - - - - - - - -   az ionoszféra alja

    0    ################# Föld felszíne ##############

Éjszaka: F1 + F2 egybeolvad (F), az alja kb. 300 km-re emelkedik.
```

**Magyarázat:** Az ionoszféra szabad elektronokat tartalmaz, amelyek kölcsönhatásba lépnek a rádióhullámokkal. Növekvő frekvenciákkal egyre magasabb rétegről kapunk visszatérő hullámot, a magasság növelésével pedig kisebb a visszaverődés vesztesége. A D réteg ionkoncentrációját a fotó-ionizáció és a meteortevékenység biztosítja, az E réteg magassága független a napszaktól és az évszaktól, az F2 réteg magassága ezektől erősen függ. Az ionoszféra állapota sztochasztikusan változik. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.5.1. és 10.1.5.2. fejezet. A D réteg pontos magasságát a források nem egységesen adják meg, ezért a rajzon nincs számszerűsítve (az ionoszféra alsó széle 40 km).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| A rétegek helyes sorrendje magasság szerint (D, E, F1, F2) | 10 |
| Magasságértékek (E: 100-110 km, F: kb. 250 km; F1: kb. 200 km, F2: 220-400 km) | 6 |
| Nappal és éjszaka: az F1 és F2 éjszaka egybeolvad, alja kb. 300 km | 6 |
| Szerep: D réteg csillapít, F réteg a rövidhullámú távolsági összeköttetésé | 6 |
| Megnevezések, jelölések a rajzon | 4 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A rétegek sorrendje hibás (pl. az E réteg az F fölött), vagy a rétegeket a Föld felszínéhez rajzolják.
- A D réteget tekintik a rövidhullámú távolsági terjedés fő rétegének.
- Elfelejtik, hogy éjszaka az F1 és F2 réteg egyesül.
