# Gyakorló feladatlap 01 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_01.md](gyakorlo_irasbeli_kerdesek_01.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy LC elemekből álló aluláteresztő szűrőt! Jelölje be a bemenetet, a kimenetet és a közös (földelt) vezetéket, nevezze meg az elemeket, és röviden magyarázza el, mely frekvenciákat engedi át a szűrő!

**Elvárt megoldás:** A bemenet felső kivezetése és a kimenet felső kivezetése között, a soros ágban egy tekercs (L1) található. A kimeneti csomópont és a közös vezeték között, a párhuzamos ágban egy kondenzátor (C1) van. Az alsó vezeték a bemenet és a kimenet közös pontja (föld). A bemenő feszültség Ube, a kimenő Uki; meredekebb szűréshez több ilyen fokozat kapcsolható egymás után.

**Mintarajz:**
```text
                 L1
o---------------nnnn------------------*------------------o
|                                     |                  |
|                                     |                  |
| Ube                                ---                 | Uki
|                                    --- C1              |
|                                     |                  |
v                                     |                  v
o---------------------*---------------*------------------o
                     === föld
                      =

Jelölések: nnnn tekercs, két vízszintes vonal (---) kondenzátor, * összekötött
  csomópont, o kivezetés, === föld
```

**Magyarázat:** A tekercs reaktanciája a frekvenciával nő (XL = 2πfL), a kondenzátoré csökken (XC = 1/(2πfC)). Kis frekvencián a tekercs alig akadályozza az áramot, a kondenzátor pedig nagy ellenállású, így a jel eljut a kimenetre. Nagy frekvencián a tekercs gátolja a jelet, a kondenzátor pedig a közös vezetékre söntöli, ezért a kimeneten a jel csillapodik. A szűrő a határfrekvencia alatt átereszt (az egyenáramot is), felette csillapít. Forrás: jegyzet/06_Aramkorok.md, 6.2.3.; a reaktanciákhoz jegyzet/04_Alkatreszek.md, 4.2.5. és 4.3.3.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Soros ágban tekercs (L1) | 8 |
| Párhuzamos ágban kondenzátor (C1) a közös vezetékre | 8 |
| Bemenet, kimenet és közös vezeték (föld) jelölése | 4 |
| Elemek megnevezése (L1, C1) | 4 |
| Működés: mit enged át, mit csillapít, és miért | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Az L és a C felcserélése (tekercs a párhuzamos, kondenzátor a soros ágban): ez már felüláteresztő szűrő.
- Hiányzik a közös (földelt) vezeték, így a kondenzátor nem kapcsolódik sehová.
- „Az egyenáramot nem engedi át” – az aluláteresztő szűrő az egyenáramot is átengedi.

## 2. feladat (32 pont)

**Feladat:** Ábrázolja egy 10 MHz középfrekvenciájú sáváteresztő szűrő átvitelét a frekvencia függvényében! Jelölje be a határfrekvenciákat, adja meg a sávszélesség értelmezését, és számítsa ki a sávszélességet, ha a rezgőkör jósági tényezője 50!

**Elvárt megoldás:** A vízszintes tengely a frekvencia (f, MHz), a függőleges az átvitel (dB, a maximumhoz viszonyítva, így a csúcs 0 dB). A görbe harang alakú: f0 = 10 MHz-nél a legnagyobb, mindkét oldalon csökken, a sávon kívül erősen csillapít. Be kell húzni a −3 dB-es szintet; ezt a görbe az alsó (fa ≈ 9,9 MHz) és a felső (fm ≈ 10,1 MHz) határfrekvenciánál metszi. A sávszélesség a két határfrekvencia különbsége: B = fm − fa = f0 / Q0 = 10 MHz / 50 = 200 kHz.

**Mintarajz:**
```text
Átvitel [dB]

       ^
  0 dB |........................***........................
       |                       **:**
-3 dB  |......................**.:.**......................
       |                     *:  :  :**
       |                   ** <-----> B = fm - fa = 200 kHz
       |                 ***  :  :  : (-3 dB-es pontok között)
       |                **    :  :  :    ***
       |             ***      :  :  :      ****
       |          ****        :  :  :         ****
       |       ****           :  :  :            *****
       |  *****               :  :  :                ******
       |***                   :  :  :
       |                      :  :  :
       |                      :  :  :
       |                      :  :  :
       |                      :  :  :
-30 dB |                      :  :  :
       -----------------------:-----:------------------------>
                             fa  f0 fm                 f [MHz]
                            9,9 10 10,1
```

**Magyarázat:** A sáváteresztő szűrő a két határfrekvencia közötti jeleket engedi át. A határfrekvenciákat a −3 dB-es pontoknál értelmezzük, ez a maximumhoz képest a teljesítmény felére csökkenését jelenti. A sávszélesség tehát a felső és az alsó határfrekvencia különbsége, és a jósági tényezővel B = f0 / Q0: minél nagyobb a Q0, annál keskenyebb a sáv. Forrás: jegyzet/06_Aramkorok.md, 6.1.4. és 6.2.1. (a −3 dB jelentése: sajat/radioelmelet.md, dB-táblázat).

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| Tengelyek: f [MHz] (3 p), átvitel [dB] (3 p), f0 és a 0 dB szint jelölése (2 p) | 8 |
| Harang alakú görbe: maximum f0-nál (4 p), csökkenés mindkét oldalon (3 p), sávon kívüli erős csillapítás (3 p) | 10 |
| A −3 dB-es szint (2 p) és az fa, fm határfrekvenciák jelölése (2 p) | 4 |
| Sávszélesség értelmezése: a két határfrekvencia különbsége (3 p), a −3 dB-es pontoknál értelmezve (3 p) | 6 |
| Számítás: B = f0 / Q0 képlet (2 p), eredmény 200 kHz (2 p) | 4 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Hiányzik a −3 dB-es szint, vagy más szintet (pl. −6 dB) használnak a határfrekvenciához.
- A sávszélességet az f0-lal vagy a teljes ábrázolt tartománnyal azonosítják, nem fm − fa-val.
- A görbe nem csökken a sávon kívül (vízszintes marad), vagy hiányzik a tengelyfelirat és a mértékegység.

## 3. feladat (32 pont)

**Feladat:** Rajzolja le egy egyszeres keverésű szuperheterodin vevő blokkvázlatát, és nevezze meg a fokozatokat! Írja le röviden, mi a keverő és a középfrekvenciás (KF) fokozat feladata!

**Elvárt megoldás:** A jel útja: antenna, sávszűrő és HF előerősítő, keverő, KF szűrő és KF erősítő, demodulátor, NF (hangfrekvenciás) erősítő, hangszóró. A keverő második bemenetére a helyi oszcillátor (VFO) jele érkezik. A vételi frekvenciát a VFO hangolásával állítjuk be, a középfrekvencia (KF) pedig fix. A rajzon jelölni kell az f_v = f_h ± f_KF összefüggést. A bemeneti sávszűrő a sávszelektivitásért, a KF szűrő és erősítő a csatornaszelektivitásért felel.

**Mintarajz:**
```text
                         +-------------------+
                         | Helyi oszcillátor |
                         |       (VFO)       |
                         +-------------------+
 Antenna                           |
    Y                              | f_h
    |                    f_v       v     f_KF
    |   +---------------+    +----------+    +-------------+    +-------------+
    +---|  Sávszűrő és  |--->|  Keverő  |--->| KF szűrő és |--->| Demodulátor |
        | HF előerősítő |    |   (X)    |    |  KF erősítő |    +-------------+
        +---------------+    +----------+    +-------------+           |
                                                                       | NF jel
                                                                       |
                                                                       |
                                                                       v
                                              +-----------+     +------------+
                                              | Hangszóró |<----| NF erősítő |
                                              +-----------+     +------------+

f_v = f_h ± f_KF  (f_v: vételi frekvencia, f_h: VFO, f_KF: KF)
```

**Magyarázat:** A szuperheterodin vevő a vett jelet a keverőben a helyi oszcillátor jelével egy állandó középfrekvenciára keveri: f_v = f_h ± f_KF. A moduláció a keverés során átkerül az új, KF vivőre. Fix frekvencián sokkal könnyebb nagy szelektivitású szűrőt (kerámia, mechanikus, kristályszűrő) építeni, ezért a KF fokozat adja a csatornaszelektivitást. A helyi oszcillátor frekvenciája két vételi frekvenciát határozna meg; a másikat tükörfrekvenciának hívjuk, amelyet a keverő előtti sávszűrő csökkent. Forrás: jegyzet/07_Vevok.md, 7.2. és 7.5.1–7.5.3. fejezet.

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Helyes fokozatok és sorrend (antenna, sávszűrő/HF előerősítő, keverő, KF szűrő+erősítő, demodulátor, NF erősítő, hangszóró; fokozatonként kb. 2 pont) | 12 |
| A VFO a keverőhöz csatlakozik, a jelút iránya helyes | 4 |
| Fokozatok megnevezése | 6 |
| A keverő és a KF fokozat feladata, f_v = f_h ± f_KF | 6 |
| Szelektivitás vagy tükörfrekvencia említése | 4 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A VFO-t a demodulátorhoz vagy az antennához kötik a keverő helyett.
- A KF szűrőt a keverő elé rajzolják, vagy a KF-et változó frekvenciájúnak tekintik.
- Kimarad a demodulátor vagy az NF erősítő.
