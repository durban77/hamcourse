---
marp: true
title: Rádióelmélet (HAREC)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Rádióelmélet

## Villamosság-, elektromágnesesség- és rádióelmélet — HAREC fokozat

---

# Vezetőképesség, Ohm-törvény

- vezető, félvezető, szigetelő
- áram (I) = töltésáramlás, $I = Q/t$
- feszültség (U): a szétvált töltések vonzó hatása
- Ohm-törvény: $U = I \cdot R$
- villamos teljesítmény: $P = U \cdot I$; $P = I^2 R = U^2/R$

---

# Kirchhoff-törvények

- **Csomóponti törvény:** egy csomópontban a be- és kifolyó áramok algebrai összege nulla ($\Sigma I_k = 0$)
- **Huroktörvény:** egy zárt hurok mentén a feszültségek algebrai összege nulla ($\Sigma U_k = 0$)
- alapja: töltés-, illetve energiamegmaradás

---

# Villamos energia és teljesítmény

- munka: $W = Q \cdot U = P \cdot t$
- teljesítmény: időegység alatt végzett munka
- mértékegysége: W (watt), 1 MW = 1000 kW = 10⁶ W
- villamos energia mértékegysége gyakorlatban: kWh

---

# Áramforrások

- galvánelem, akkumulátor: kémiai energia → elektromos energia
- dinamó, generátor: mechanikai energia → elektromos energia
- forrásfeszültség, belső ellenállás, kapocsfeszültség
- rövidzárási áram: $I_z = \dfrac{U_{forrás}}{R_{belső}}$
- kapacitás: amperóra (Ah)

---

# Feszültségforrások kapcsolása

- **soros kapcsolás:** feszültségek összeadódnak, azonos áram folyik mindegyikben
- **párhuzamos kapcsolás:** azonos feszültség, az áram (kapacitás) összeadódik
- párhuzamos kapcsolásnál csak azonos feszültségű, azonos állapotú cellák kapcsolhatók (kiegyenlítő áram veszélye)

---

# Villamos tér

- forrása: elektromos töltés (Q, egysége: C)
- térerősség: $E = F/Q$, egysége V/m
- statikus villamos tér: örvénymentes, potenciálos
- **árnyékolás:** vezető (fém) burok kizárja a külső villamos teret

---

# Mágneses tér

- áramvezető körül mágneses tér (indukció, jele B) alakul ki
- indukcióvonalak: koncentrikus körök a vezető körül
- **árnyékolás:** vezető felület örvényáramai gyengítik a behatoló mágneses teret (nincsenek mágneses töltések)

---

# Elektromágneses hullám

- rádióhullám: elektromágneses hullám, 30 kHz - 3000 GHz
- terjedési sebesség (vákuumban): $c \approx 3 \cdot 10^8\;\mathrm{m/s}$
- $c = f \cdot \lambda$
- **polarizáció:** az E-vektor rezgésének iránya — lineáris (vízszintes/függőleges), körkörös, elliptikus

---

# Szinuszos jelek

- pillanatérték: $u(t) = U_{cs}\sin(\omega t + \varphi)$
- amplitúdó (csúcsérték), effektív érték: $U_{eff} = U_{cs}/\sqrt{2}$
- periódusidő $T$, frekvencia $f = 1/T$
- fázis, fáziskülönbség két jel között

---

# Nem szinuszos jelek

- hangfrekvenciás jelek (20 Hz - 20 kHz), digitális négyszögjel
- felbonthatók: egyenfeszültségű komponens + alapharmonikus + felharmonikusok
- a négyszögjel gazdag felharmonikus-tartalmú

---

# Zajok

- vevő termikus zaja: az alkatrészek hőmozgásából ered
- sávzaj: a vevő hasznos sávszélességébe eső zajteljesítmény
- zajsűrűség: egységnyi sávszélességre eső zajteljesítmény
- minél szűkebb a sávszélesség, annál kisebb a felvett zaj

---

# Modulációk áttekintése

- **cél:** az információt a vivőhullám amplitúdójára, frekvenciájára vagy fázisára ültetjük
- CW, AM, FM, PM: analóg modulációk
- FSK, BPSK, QPSK, QAM: digitális modulációk
- választás szempontja: sávszélesség, teljesítmény, jel/zaj viszony

---

# CW (modulálatlan vivő billentyűzése)

- a vivő megléte/hiánya hordozza az információt (Morse)
- legkisebb sávszélesség
- egyszerű adó/vevő
- nem alkalmas beszédátvitelre

---

# AM és SSB

- **AM-DSB:** vivő + két oldalsáv, modulációs mélység $m = U_m/U_v$ (0-100%)
- sávszélesség: $B = 2f_m$
- **SSB:** a vivő és egy oldalsáv elnyomva → a teljesítmény 100%-a hasznos
- SSB: kisebb sávszélesség, de bonyolultabb előállítás/vétel

---

# FM és PM

- **FM:** a vivő pillanatnyi frekvenciáját moduláljuk, amplitúdó állandó
- **PM:** a fázist moduláljuk — vételkor a kettő egyformán demodulálható
- FM előnye: jó zajtűrés, hátránya: nagyobb sávszélesség
- keskenysávú (NBFM) és szélessávú (WFM) változat

---

# Modulációs löket és index

- frekvencialöket: $\Delta f$ — a vivőtől való maximális eltérés
- FM modulációs index: $m = \dfrac{\Delta f}{f_{mod}}$
- AM modulációs mélység legfeljebb 100%, FM löket elméletileg tetszőleges

---

# Vivő, oldalsávok, sávszélesség

- vivő: a modulálandó nagyfrekvenciás jel
- oldalsávok: a moduláció során a vivő körül keletkező spektrumkomponensek
- FM sávszélesség (közelítőleg): $B \approx 2(\Delta f + f_{mod\,max})$

---

# Digitális modulációk

- **FSK:** logikai 0/1 → két különböző frekvencia
- **BPSK:** logikai 0/1 → 0° és 180° fázis
- **QPSK:** 4 fázisállapot → 2 bit/szimbólum
- **QAM:** amplitúdó és fázis együttes változtatása → QAM-16, -64, -256 (több bit/szimbólum)

---

# Bitsebesség és Baud-sebesség

- **bitsebesség:** átvitt bitek száma másodpercenként
- **Baud-sebesség:** átvitt szimbólumok (állapotok) száma másodpercenként
- QPSK-nál 1 szimbólum = 2 bit, QAM-16-nál 1 szimbólum = 4 bit
- minél több állapot/szimbólum, annál nagyobb a zajérzékenység

---

# Teljesítményviszonyok — dB

- a teljesítményarányt logaritmikus skálán, decibelben (dB) adjuk meg
- teljesítményarány: $a_p[\mathrm{dB}] = 10\lg(P_{ki}/P_{be})$
- feszültségarány: $a_u[\mathrm{dB}] = 20\lg(U_{ki}/U_{be})$
- előny: egymás után kapcsolt fokozatok erősítése **összeadható**, nem szorzandó

---

# Fontos dB értékek

| dB | teljesítményarány |
|---|---|
| 0 dB | 1× |
| 3 dB | 2× |
| 6 dB | 4× |
| 10 dB | 10× |
| 20 dB | 100× |

- negatív dB (pl. -3 dB) = felezés, csillapítás

---

# Fokozatok összekapcsolása

- egymás után kapcsolt erősítők/csillapítók eredő erősítése (dB-ben): $a_{eredő} = a_1 + a_2 + \ldots$
- abszolút szint: dBm — 1 mW-hoz viszonyított teljesítmény
- $S[\mathrm{dBm}] = 10\lg(P/1\,\mathrm{mW})$

---

# Illesztés, hatásfok, PEP

- **illesztés:** a forrás és a terhelés impedanciájának összehangolása maximális teljesítményátvitelhez
- **hatásfok:** $\eta = P_{ki}/P_{be}$
- **PEP (csúcs burkoló teljesítmény):** SSB jel legnagyobb pillanatnyi teljesítménye

---

# Digitális jelfeldolgozás

- **mintavételezés:** az analóg jel értékeinek rögzítése meghatározott időpontokban
- **kvantálás:** a minták amplitúdójának digitális kódolása
- **Nyquist-frekvencia:** a mintavételi frekvenciának a legmagasabb jelfrekvencia **legalább kétszerese** kell legyen

---

# Szűrés és konverzió

- **anti-aliasing szűrő:** mintavételezés előtt kiszűri a Nyquist-frekvencia felett lévő komponenseket
- **visszaállító szűrő:** a digitál-analóg átalakítás után simítja a lépcsős jelet
- **ADC/DAC:** analóg-digitális / digitál-analóg átalakító

---

# Összefoglalás

- Ohm- és Kirchhoff-törvények minden áramkör alapja
- rádióhullám: elektromágneses hullám, $c = f\lambda$
- moduláció: analóg (CW, AM, SSB, FM, PM) és digitális (FSK, PSK, QAM)
- dB: logaritmikus, összeadható teljesítményskála
- digitális átvitel alapja: mintavételezés, kvantálás, Nyquist-feltétel
