---
marp: true
title: Digitális üzemmódok (HAREC)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Digitális üzemmódok

## HAREC fokozat

---

# Csomagrádió (Packet Radio) — elve

- számítógépek/terminálok közötti adatátvitel modemen és rádión keresztül
- az adatot **csomagokra** bontja: minden csomag tartalmazza a küldő/fogadó hívójelét és hibaellenőrző információt
- sérült vagy elveszett csomagok újraadásra kerülnek, a helyes sorrend biztosított
- ezt az eljárásrendet a **protokoll** (rádióamatőr gyakorlatban: **AX.25**) rögzíti

---

# AX.25 protokoll

- az OSI-modell 2. (adatkapcsolati) rétegének feladatát látja el: hibamentes átvitel, kapcsolat felépítése/lebontása
- a CCITT X.25 csomagkapcsolt szabvány rádióamatőr adaptációja
- egy csomag maximális hossza: **256 byte + fejléc**
- egy frekvencián több állomás is dolgozhat egyszerre, két állomás akár több csatornán is kapcsolatban lehet

---

# Modem és átviteli sebesség

- a digitális adatot **modem** (modulátor-demodulátor) alakítja hangfrekvenciás jellé
- **moduláció sebessége (baud)** és **adatátviteli sebesség (bit/s)** FSK modemnél megegyezik
- URH-n jellemző: 1200 baud vagy 9600 baud
- rövidhullámon: 300 baud (SSB állásban), kivéve 29 MHz (itt 1200 baud-os FM is előfordul)

---

# Pakett összeköttetések

- lehet közvetlen (egymás jeleit hallják) vagy átjátszókon (NODE, gateway) keresztül
- előnye az FM átjátszóval szemben: egyszerre több állomás is használhatja zavarás nélkül
- a NODE-ok/gateway-ek jellemzően magas pontokon üzemelnek, egymással 70 cm/23 cm sávon vagy interneten (AXIP protokoll) kapcsolódnak

---

# Pakett állomás felépítése

- **TNC (Terminal Node Controller):** a modemet és az AX.25 protokollkezelést végző speciális kis-számítógép
- felépítés: rádió → modem (analóg↔digitális) → TNC (csomagalakítás) → számítógép
- alternatíva: hangkártyás megoldás (TNC-t szoftver emulálja, pl. AGWPE)

---

# APRS — elve

- **Automatic Packet Reporting System:** GPS-szel összekapcsolt pakett rádióállomások pozíciójának térképi megjelenítése
- a pozíció mellett időjárás-adat, üzenetküldés, iránymérés is továbbítható
- a hálózat **digirepeaterei** (ALIAS hívójellel) továbbítják az adatot, kapcsolatépítés nélkül — az adat azonnal megjelenik a vevőknél

---

# APRS — gyakorlat

- Európában jellemző frekvencia: **144,800 MHz**, 1200 baud
- mozgó állomáshoz: GPS + TNC + rádió (BEACON-ként adja ki a koordinátákat)
- internetes kapuállomásokon (igate) keresztül a nem-amatőr felhasználók is elérhetik az adatokat (csak olvasásra)

---

# EchoLink

- VoIP (Voice over IP) alapú rendszer, amely rádiófrekvenciás állomásokat (szimplex és átjátszó) is összekapcsol
- útvonalak: internet-kliens ↔ internet-kliens, RF ↔ internet, RF ↔ internet ↔ RF
- fél-duplex fónia összeköttetés; a kapcsolat DTMF kóddal épül fel és bontható (pl. `#` vagy `D`)

---

# HAMNET

- nagysebességű, TCP/IP alapú, kizárólag rádióamatőr célú mikrohullámú hálózat (13 cm: 2300-2450 MHz, 6 cm: 5650-5850 MHz)
- nincs közvetlen kapcsolata a nyilvános internettel — biztonságos kísérletezési terep
- rádióamatőr IP-tartomány: **44.x.x.x** (AMPRNet), Magyarországon 44.156.x.x
- alkalmazások: packet radio, EchoLink, VoIP, ATV/IP, APRS, weboldalak, üzenetküldés

---

# RTTY — alapjai

- géptávíró rádiós változata; a morzétól eltérően **folyamatos** adás, két frekvencia közötti ugrással
- **FSK (frekvenciabillentyűzés):** az adó vált a két frekvencia között
- **AFSK:** a mikrofonbemeneten lévő hangfrekvenciás egység végzi a váltást — vételi oldalon azonos eredmény

---

# RTTY — paraméterek

- rádióamatőr shift: **170 Hz** (más területen 425 Hz, 850 Hz is előfordulhat)
- kódrendszer: **Baudot kód** (5 bit)
- sebesség: 60, 75 vagy 100 szó/perc
- adás eleje: `RYRYRY` — szimmetrikus jel a vevő kalibrálásához
- nem hibamentes protokoll — zaj/fading esetén információvesztés léphet fel

---

# SSTV (Slow Scan TV) — elve

- állóképek (fotók) átvitele, pontról pontra, sorról sorra letapogatva
- kis sávszélesség → rövidhullámon is használható
- hátránya: lassú — egy kép átvitele másodpercektől percekig tarthat
- felszerelés: számítógép + SSTV szoftver + interfész + adóvevő

---

# SSTV — gyakorlat

- az átviteli idő a kép felbontásától/színétől függ (pl. kis felbontású fekete-fehér kép ≈ 8 s, 320×240 színes ≈ 2 perc)
- jellemző SSTV frekvenciák: 3,845 / 7,171 / 14,230 / 21,340 / 28,680 / 145,500 MHz

---

# ATV (Amateur Television) — elve

- gyors letapogatású TV: mozgókép + hang átvitele, hagyományos TV-adáshoz hasonlóan
- nagy sávszélesség-igénye miatt csak **420 MHz felett** használható (ahol ez belefér a sávba)
- Európában jellemzően PAL képnorma, FM adásmód (ritkábban AM)

---

# ATV — gyakorlat

- leggyakoribb sáv: 23 cm (1265,00-1289,25 MHz), lehetőség van 70 cm-en (pl. 439,25 MHz) és magasabb sávokon (2,4 GHz, 10 GHz) is
- a 23 cm-es FM ATV vehető normál műholdvevő beltéri egységgel is
- átjátszók segítik a nagyobb távolságok áthidalását

---

# Összefoglalás

- csomagrádió (AX.25) a digitális rádióamatőr hálózatok (APRS, DX cluster) alapja
- RTTY: FSK/AFSK, Baudot kód, zajra érzékeny, de kis sávszélességű
- SSTV: állókép, kis sávszélesség, lassú; ATV: mozgókép, nagy sávszélesség, csak magas frekvencián
- HAMNET és EchoLink: IP-alapú kiterjesztések a hagyományos rádiós hálózat mellett
