---
marp: true
title: Korszerű technika (kiegészítés)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Korszerű technika

## SDR és modern digitális üzemmódok — kiegészítés

---

# Miért ez a fejezet?

- a HAREC vizsga tárgykörei (és a Vevők/Adók/Digitális üzemmódok fejezetek) a klasszikus szuperheterodin és a hagyományos digitális üzemmódok (packet, RTTY, SSTV) tömbvázlatait kérik
- ez **nem vizsgaanyag** — de egy mai rádióamatőr készülék belül nagy eséllyel ezt tartalmazza
- cél: a klasszikus alapok (Vevők, Adók, Digitális üzemmódok fejezetek) és a mai gyakorlat közötti híd

---

# Mi az SDR?

- **SDR (Software Defined Radio):** a hagyományosan analóg áramkörökkel (szűrés, demoduláció) megoldott feladatokat szoftver végzi
- a jelfeldolgozás minél korábban digitális tartományba kerül: ADC → DSP/FPGA → szoftver
- ugyanaz a hardver AM/FM/SSB/CW/digitális módra is átállítható — csak szoftverváltással

---

# SDR felépítése

- **RF előfokozat:** szűrés, esetleg erősítés az antenna felől
- **ADC (analóg-digitális átalakító):** a nagyfrekvenciás (vagy KF-re kevert) jelet digitalizálja
- **DSP/FPGA:** a digitalizált jelen végzi a szűrést, keverést, demodulációt
- **szoftver (PC vagy beépített):** kezelőfelület, demodulátorok, dekóderek (pl. SDR#, GQRX, HDSDR)

---

# Direkt konverziós (zero-IF) vevő

- a bejövő RF jelet közvetlenül alapsávra keverik (nincs hagyományos KF-fokozat)
- **I/Q mintavételezés:** két, egymáshoz 90°-kal eltolt keverő ág (in-phase/quadrature) — ez különbözteti meg a kívánt és a tükörfrekvenciás oldalsávot szoftveresen
- sok mai SDR (és olcsó vevődongle) ezt az elvet használja

---

# Hibrid szuperhet + DSP rádiók

- a legtöbb mai gyári adóvevő (pl. ICOM, Yaesu, Kenwood középkategóriás rigek) **analóg RF előfokozatot és keverőt** tart meg — ez adja a nagy dinamikatartományt, blokkolás elleni védelmet
- a KF-erősítés, szűrés és demoduláció DSP-ben történik a hagyományos LC/kristályszűrők helyett
- így a klasszikus vevő tömbvázlat (lásd Vevők fejezet) ma is érvényes — csak a KF-erősítő és demodulátor fokozatok szoftveresek

---

# Az SDR előnyei

- **szoftveres szűrők:** a sávszélesség és a szűrő jelleggörbéje egy gombnyomással változtatható (nem kell más kristályszűrő)
- **waterfall/spektrum kijelzés:** a teljes sáv egyszerre látható, nem csak a hangolt frekvencia
- **zajcsökkentő és jegyzeteket algoritmusok:** DSP-alapú zajgátlás, noise blanking, automatikus lekapcsolható jegyzet (notch) szűrők
- egy hardver, sok üzemmód — csak szoftverfrissítés kell

---

# Az SDR korlátai

- a régi "vevőzaj/blokkolás" probléma nem szűnik meg, csak átalakul: az **ADC dinamikatartománya** és felbontása lesz az új szűk keresztmetszet
- **aliasing** elkerülése miatt ugyanúgy szükséges az anti-aliasing szűrés mintavételezés előtt (lásd Rádióelmélet — Nyquist-frekvencia)
- nagy számítási igény, késleltetés (latency) a feldolgozásban

---

# Népszerű SDR eszközök

- **csak vevő (receive-only):** olcsó USB dongle-ok (pl. RTL-SDR), szélessávú letapogatásra, monitorozásra
- **adó-vevő SDR:** pl. FlexRadio 6000-es sorozat, Elecraft KX3 — teljes rádióamatőr transceiver SDR maggal
- egyre több hagyományos gyári rigben is DSP/SDR mag dolgozik a KF-lánc egy részén

---

# Modern digitális üzemmódok — mi változott?

- a régi RTTY/packet külön hardveres modemet (TNC) igényelt
- a mai digitális módok (FT8, FT4, WSPR, PSK31) egy sima **SSB adóvevő + számítógép (hangkártya/USB interfész) + szoftver** kombinációval működnek
- a moduláció/demoduláció teljesen szoftveresen történik (pl. WSJT-X, fldigi)

---

# FT8 és FT4

- a **WSJT-X** szoftvercsomag része (K1JT, Joe Taylor és munkatársai fejlesztették)
- **FT8:** 8-FSK moduláció, erős hibajavító kódolással (LDPC), kb. **50 Hz** sávszélesség
- 15 másodperces (FT8) vagy 7,5 másodperces (FT4, versenyekhez gyorsított) időszinkronizált ciklusokban működik — pontos idő (NTP/GPS) szükséges
- rendkívül gyenge jelnél is dekódolható (kb. **-20...-24 dB** jel/zaj viszonynál is)

---

# FT8 — gyakorlat

- az összeköttetés **automatizált**, minimális tartalommal: hívójelek, jelentés (SNR), grid locator
- ma az egyik legaktívabb üzemmód a rövidhullámú sávokon — gyakran több FT8 QSO fut egyszerre egy keskeny sávrészben
- a klasszikus "szabad" QSO (beszélgetés) helyett strukturált, szoftver-vezérelt csere

---

# WSPR

- **Weak Signal Propagation Reporter** — szintén K1JT fejlesztése
- nagyon keskeny sávszélesség (~6 Hz), 2 perces ciklusokban egyirányú "beacon" jellegű adás
- tartalma: hívójel, grid locator, teljesítmény — jellemzően kis (mW-os, QRP) teljesítménnyel
- a vételi adatok automatikusan feltöltődnek egy online adatbázisba (wsprnet.org) — terjedési viszonyok térképezésére

---

# PSK31

- Peter Martinez (G3PLX) fejlesztette, valós idejű "billentyű-billentyű" (keyboard-to-keyboard) digitális beszélgetésre
- **fázisbillentyűzés, 31,25 baud**, rendkívül keskeny sáv (~31 Hz)
- **varicode:** változó hosszúságú karakterkód, önszinkronizáló — nem igényel külön hibajavítást, mert a kezelő "kiolvassa" a hibás részt

---

# Összehasonlítás

| Mód | Sávszélesség | Cél | Jelleg |
|---|---|---|---|
| RTTY | ~250 Hz | szöveges QSO | valós idejű, hibára érzékeny |
| PSK31 | ~31 Hz | szöveges QSO | valós idejű, önszinkronizáló |
| FT8/FT4 | ~50 Hz | gyors, gyengejelű QSO | automatizált, FEC-es |
| WSPR | ~6 Hz | terjedésmérés | egyirányú beacon |

---

# Összefoglalás

- SDR: a demoduláció szoftverbe kerül, de a fizikai alapok (Nyquist, I/Q, ADC dinamikatartomány) ugyanazok, amiket a Rádióelmélet fejezetben tanultunk
- a mai gyári rigek túlnyomó része hibrid: analóg RF-előfokozat + DSP-s KF/demoduláció
- a modern digitális módok (FT8/FT4/WSPR/PSK31) szoftveres modemet használnak dedikált hardver (TNC) helyett
- ez kiegészíti, nem helyettesíti a Vevők, Adók és Digitális üzemmódok fejezetek vizsgaanyagát
