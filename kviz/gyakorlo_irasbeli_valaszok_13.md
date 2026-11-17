# Gyakorló feladatlap 13 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_13.md](gyakorlo_irasbeli_kerdesek_13.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy Zener-diódával és áteresztő tranzisztorral kiegészített feszültségstabilizátort! Jelölje a bemenetet, a kimenetet és a közös vezetéket, nevezze meg az elemeket, adja meg a kimeneti feszültséget, és magyarázza el, mi az előnye az egyszerű Zener-stabilizátorral szemben!

**Elvárt megoldás:** Az NPN áteresztő tranzisztor (T1) kollektora a bemenet pozitív kivezetésére csatlakozik. A bemenet pozitív kivezetése és a tranzisztor bázisa között R előtétellenállás van, a bázis és a közös (negatív) vezeték közé a Zener-dióda (Dz) kerül záróirányban. A pozitív kimeneti kivezetés a tranzisztor emitterére, a negatív a közös vezetékre csatlakozik. A kimeneti feszültség Uki = Uz − UBE.

**Mintarajz:**
```text
o---------*-------*
|         |       |
|        [ ] R    |
|         |     |/
|         *-----|   T1
|         |     |\>
| Ube     |       |
|        --- Dz   *-------------------o
|        /_\                          |
|         |                           | Uki
|         |                           |
v         |                           v
o---------*---------------------------o

Jelölések: [ ] ellenállás, --- / /_\ Zener-dióda (a vonal a katód), |/ |\> NPN
  tranzisztor, * csomópont
```

**Magyarázat:** A Zener-dióda a bázison állandó feszültséget tart, az emitter pedig ezt követi UBE-vel kisebb értéken. A terhelőáram a tranzisztoron folyik, a bázisáram ennél nagyságrendekkel kisebb, ezért a terhelhetőséget az áteresztő tranzisztor maximális kollektorárama határolja (It max ≈ IC max), ami nagyobb lehet, mint az egyszerű Zener-stabilizátornál. A stabilitást csak a Zener-feszültség változása határozza meg; a terhelési érzékenység jobb, mint az egyszerű Zener-stabilizátornál, de még így is elég nagy, ezen lényegesen csak visszacsatolással lehet javítani. Forrás: jegyzet/06_Aramkorok.md, 6.3.2.1. (6.3-11. ábra); a kis bázisáramról jegyzet/04_Alkatreszek.md, 4.5.12.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Áteresztő tranzisztor: kollektor a bemenet +-ra, kimenet az emitterről | 8 |
| R a bemenet + és a bázis között, Zener-dióda a bázis és a közös vezeték között (záróirány) | 10 |
| Jelölések (Ube, Uki, R, Dz, T1, közös vezeték) | 6 |
| A kimeneti feszültség (Uz − UBE) és az előny magyarázata | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A kimeneti feszültséget Uz-nek adja meg (az UBE elhagyása).
- A kimenetet a kollektorról veszi, vagy a Zener-dióda nyitóirányban van bekötve.
- Hiányzik az R előtétellenállás a bemenet és a bázis között.

## 2. feladat (32 pont)

**Feladat:** Rajzolja le a szabad térben elhelyezett félhullámú dipólus iránykarakterisztikáját az E- és a H-síkban (polárkoordináta-rendszerben)! Jelölje a legnagyobb sugárzás irányát és a −3 dB-es pontok közötti szöget, és adja meg a dipólus nyereségét az izotróp sugárzóhoz képest!

**Elvárt megoldás:** E-síkban (a vezetéken átmenő síkban) a görbe nyolcas alakú: a legnagyobb sugárzás a vezetékre merőleges irányokban van, a vezeték irányában nincs sugárzás. A félteljesítményű (−3 dB-es) pontok közötti szög az E-síkban kb. 78°. H-síkban (a vezetékre merőleges síkban) a görbe kör: a félhullámú dipólus itt körsugárzó. A dipólus nyeresége az izotróp sugárzóhoz képest 2,14 dB (dBi). A rajzon jelölni kell a síkokat és a vezeték helyét.

**Mintarajz:**
```text
  E-sík (a dipólus vezetékén át)            H-sík (a vezetékre merőleges)
                 nulla





                                                      *************
                     dipólus                       ***             ***
          *O***           ***O*                  ***                 ***
      *****   ***** # *****   *****             **                     **
     **           **#**           **            *                       *
    **             *#*             **          **                       **
    *               #               *          *            x            *
    **             *#*             **          **   x = a vezeték       **
     **           **#**           **            *   (a lap síkjára merőleges)
      *****   ***** # *****   *****             **                     **
          *O***           ***O*                  ***                 ***
                                                   ***             ***
                                                      *************





O = -3 dB (félteljesítményű) pontok, köztük kb. 78°; legnagyobb sugárzás a vezetékre merőlegesen
H-síkban a vezetékre merőleges síkban a sugárzás minden irányban azonos (kör)
```

**Magyarázat:** Az iránykarakterisztika a térerősség relatív értékeit adja meg az irány függvényében, polárkoordinátákban ábrázolják. Az izotróp sugárzó minden irányban azonos intenzitású (fiktív, ideális), a gyakorlati antennák irányhatásúak. A nyereség G = 10 · lg(S1 / SREF); izotróp referenciánál a jele dBi, félhullámú dipólushoz viszonyítva dBd. A félhullámú dipólus az izotrópra vonatkoztatva 2,14 dBi, a saját magához viszonyítva 0 dBd. Függőlegesen elhelyezve a H-sík körkarakterisztikája miatt körsugárzóként használható. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1.5.–9.1.6. (a nyolcas alak és a nulla a vezeték irányában közismert, a jegyzet ábrájáról olvasható le).

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| E-síkbeli diagram: nyolcas alak (6 p), maximum a vezetékre merőlegesen (3 p), nulla a vezeték irányában (3 p) | 12 |
| H-síkbeli diagram: kör, körsugárzó | 6 |
| A −3 dB-es pontok megjelölése (3 p) és a köztük lévő kb. 78° (3 p) | 6 |
| Nyereség: 2,14 dBi (3 p), a dBi és dBd különbsége, a nyereség fogalma (2 p) | 5 |
| Jelölések: E- és H-sík, a vezeték helye, polár-rendszer | 3 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Az E- és a H-síkot felcserélik (a körkarakterisztikát az E-síkhoz rajzolják).
- A nyolcas lebenyei a vezeték irányában állnak, vagy a nullahelyek hiányoznak.
- A nyereséget 0 dB-nek adják meg a referenciaantenna megjelölése nélkül (dBi és dBd összekeverése).

## 3. feladat (32 pont)

**Feladat:** Rajzolja le egy védőföldelt (I. érintésvédelmi osztályú) fémházas készülék hálózati csatlakozásának vázlatát! Nevezze meg a vezetékeket és színjelöléseiket, és magyarázza el, mi történik testzárlat esetén!

**Elvárt megoldás:** A hálózati csatlakozás három vezetékből áll: fázisvezető (fekete), nullavezető (világoskék), védővezető (zöld-sárga). A fázisvezetőbe sorosan biztosító kerül. A védővezető a készülék fémházát köti a földeléshez (földelő, földelőhálózat), áramot normál üzemben nem vezet. Testzárlat (a fázis a fémházhoz ér) esetén nagy zárlati áram folyik a védővezetőn, a biztosító kiold, és a készülék leválik a hálózatról, így a ház nem marad veszélyes feszültség alatt.

**Mintarajz:**
```text
                                        Készülék (I. érintésvédelmi o.)
F  fázis (fekete)   +-----------+       +--------------------------------+
o-------------------| Biztosító |-------o        F  (fázisvezető)        |
                    +-----------+       |                                |
N  nulla (világoskék)                   |                                |
o---------------------------------------o        N  (nullavezető)        |
                                        |                                |
PE védővezető (zöld-sárga)              |                                |
o-----------------------------+---------o      PE (a fémházra kötve)     |
                              |         |                                |
                              |         |    ! testzárlat: F -> fémház   |
                              |         +--------------------------------+
                              |
                          =========
                        földelő / földelőhálózat

Testzárlat: F -> fémház -> PE -> föld;
a nagy zárlati áram kioldja a biztosítót.
```

**Magyarázat:** Az I. érintésvédelmi osztályú készüléken védővezető-csatlakozási lehetőség van, amelyet össze kell kötni az érintésvédelmi rendszerrel. A védővezetős rendszerek elmaradhatatlan tartozéka a biztosítórendszer, amely testzárlat esetén, nagy zárlati áramnál old ki. A védővezető akkor hatásos, ha folytonos és kifogástalan állapotú, a földelési ellenállás pedig kis értékű. A biztosítót a védendő áramkörrel sorba kapcsolják. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.3.1., 13.3.2.1., 13.4. és 13.5. fejezet.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| A három vezeték és a biztosító helyes ábrázolása (a biztosító a fázisvezetőben) | 12 |
| A vezetékek színjelölése (fekete, világoskék, zöld-sárga) | 6 |
| A védővezető a fémházra és a földelésre kötve | 6 |
| A testzárlat magyarázata (nagy zárlati áram, biztosító kiold, leválasztás) | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A színeket összekeverik (pl. a zöld-sárga a nullavezető), vagy a védővezetőt nem kötik a házra.
- A biztosítót a védővezetőbe vagy a nullavezetőbe teszik.
- A védővezetőt normál üzemi áramvezetőnek tekintik.
