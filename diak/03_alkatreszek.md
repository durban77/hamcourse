---
marp: true
title: Alkatrészek (HAREC)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Alkatrészek

## HAREC fokozat

---

# Ellenállás

- $R = U/I$, egysége Ω (ohm)
- áram-feszültség karakterisztikája lineáris
- teljesítmény-disszipáció: $P = UI = I^2R = U^2/R$
- **soros kapcsolás:** $R_e = R_1+R_2+\ldots$
- **párhuzamos kapcsolás:** $R_e = \dfrac{1}{1/R_1+1/R_2+\ldots} = \dfrac{R_1 R_2}{R_1+R_2}$ (két ellenállásnál)

---

# Kondenzátor

- kapacitás (C) egysége F (farad); gyakorlatban nF, pF, µF
- $C$ arányos a lemezek felületével, fordítva arányos a lemezek távolságával, függ a dielektrikumtól
- **reaktancia:** $X_C = \dfrac{1}{\omega C} = \dfrac{1}{2\pi f C}$
- ideális kondenzátoron a feszültség 90°-kal késik az áram után

---

# Kondenzátor típusai

- fix kapacitású: lég-, csillám-, kerámia-, műanyag szigetelésű
- **elektrolit kondenzátor:** nagy kapacitás kis méretben, polarizált (irányfüggő)
- **változtatható (forgó/trimmer) kondenzátor:** hangoláshoz
- **soros kapcsolás:** $C_e = \dfrac{1}{1/C_1+1/C_2+\ldots}$
- **párhuzamos kapcsolás:** $C_e = C_1+C_2+\ldots$

---

# Induktivitás

- induktivitás (L) egysége H (henry); gyakorlatban µH, nH
- $L$ függ a menetszámtól ($n^2$-tel arányos), a keresztmetszettől, a hossztól és a mag anyagától
- **reaktancia:** $X_L = \omega L = 2\pi f L$
- ideális tekercsen a feszültség 90°-kal megelőzi az áramot

---

# Tekercs jósági tényezője

- valós tekercs: soros veszteségi ellenállás ($R_s$) is van
- **jósági tényező:** $Q = \dfrac{\omega L}{R_s}$
- nagy Q → kis veszteség
- vasmag típusa frekvenciafüggő: vas (hangfrekvencia), ferrit (RF), légmag (VHF/UHF felett)

---

# Transzformátor

- ideális transzformátor: veszteségmentes energiaátvitel primerről szekunderre
- $\dfrac{N_1}{N_2} = \dfrac{U_1}{U_2} = \dfrac{I_2}{I_1}$; $P_1 = P_2$
- alkalmazás: feszültség-, áram- és impedanciaillesztés, galvanikus leválasztás
- típusok: hálózati (lemezelt vasmagos, toroid), impulzus-, szórótranszformátor

---

# Dióda — alapok

- P-N átmenet, egyirányú vezetés
- nyitóirányban (Si): kb. 0,6 V nyitófeszültség felett vezet
- záróirányban csak elhanyagolható visszáram folyik, letörési feszültség felett tönkremehet
- disszipált teljesítmény: $P_d \approx U_{nyitó} \cdot I$

---

# Dióda típusok

- **egyenirányító dióda:** hálózati/RF egyenirányításra
- **Zener-dióda:** tartósan a letörési tartományban dolgozik → feszültségstabilizálás
- **Schottky-dióda:** kis nyitófeszültség, gyors kapcsolás
- **varicap (kapacitásdióda):** záróirányú feszültséggel változtatható kapacitás (VCO-kban)
- **LED:** direkt félvezető (GaAs, GaN), fényt bocsát ki nyitóirányban

---

# Tranzisztor — bipoláris

- két csoport: bipoláris és térvezérlésű (FET)
- rétegek: NPN vagy PNP (bázis, kollektor, emitter)
- áramerősítési tényező: $\beta = \dfrac{\Delta I_C}{\Delta I_B}$ (statikus: $B = I_C/I_B$)
- erősítő és kapcsoló elemként használható

---

# Tranzisztor alapkapcsolások

- **földelt emitteres:** közepes bemeneti, nagy kimeneti impedancia, feszültség- és áramerősítés is van
- **földelt bázisú:** kis bemeneti, nagy kimeneti impedancia, csak feszültségerősítés
- **földelt kollektoros (emitterkövető):** nagy bemeneti, kis kimeneti impedancia, csak áramerősítés
- az előfeszítés (munkapont beállítása) módja: fix bázisáramú, osztós, negatív visszacsatolásos

---

# Térvezérlésű tranzisztor (FET)

- vezérlőelektróda: gate (G), a másik kettő: source (S), drain (D)
- vezérlés feszültséggel, nem árammal → gate-source ellenállás közel végtelen
- N- és P-csatornás változat létezik
- drain áram (I_D) a gate-source feszültség (U_GS) függvénye

---

# JFET és MOSFET

- **JFET:** vezérlés nélkül vezet (UGS=0-nál max. áram), UGS növelésével az áram csökken
- **MOSFET (kiürítéses):** hasonló a JFET-hez
- **MOSFET (növekményes):** vezérlés nélkül nem vezet, egy küszöbfeszültség felett indul meg az áram
- alkalmazás: lineáris erősítő, digitális kapcsoló, feszültségvezérelt ellenállás/áramforrás

---

# Elektroncsövek

- katód (izzítva) → elektronkibocsátás, anód gyorsítja/befogja az elektronokat
- vezérlőrács: a katód-rács feszültség szabályozza az elektronáramot
- nagy bemeneti (rács-) impedancia, magas anódfeszültség (több száz V)
- nagyteljesítményű fokozatokban impedanciatranszformálás szükséges a kimeneti illesztéshez
- alkalmazás: nagyteljesítményű RF adók, radar, audiotechnika

---

# Integrált áramkörök

- diszkrét elemek egyetlen tokban (lapkán) — analóg és digitális IC-k
- előnyök: megbízhatóság, gazdaságosság, helytakarékosság, javíthatóság
- passzív elemek (nagy C, L, transzformátor) integrálása korlátozott

---

# Műveleti erősítő (op-amp)

- bemenetek: „+” nem invertáló, „–” invertáló
- a kimenet a bemeneti feszültségek különbségét erősíti fel
- alapkapcsolások: invertáló és nem-invertáló erősítő, összeadó, kivonó, integráló, differenciáló, késleltető áramkör
- negatív visszacsatolással stabil, lineáris erősítés érhető el

---

# Hőviszonyok egyszerű áramkörökben

- minden alkatrész disszipált teljesítménye hővé alakul: $P = U \cdot I$
- diódán: $P_d \approx U_{nyitó} \cdot I$
- tranzisztornál: $P_d = U_{CE} \cdot I_C$
- a disszipált hőt hűtőbordával/hűtőcsillaggal el kell vezetni, különben az alkatrész tönkremegy

---

# Összefoglalás

- R, C, L: alap passzív elemek — impedanciájuk frekvenciafüggő (C, L esetén)
- dióda: irányfüggő vezetés — Zener, Schottky, varicap, LED speciális változatok
- tranzisztor: bipoláris (áramvezérelt) és FET (feszültségvezérelt)
- op-amp: sokoldalú, negatív visszacsatolással stabil erősítő elem
