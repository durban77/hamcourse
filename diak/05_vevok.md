---
marp: true
title: Vevők (HAREC)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Vevők

## HAREC fokozat

---

# Egyenes vevők

- **detektoros vevő:** rezgőkör + dióda + fejhallgató, nincs erősítés
- **audion:** visszacsatolt nagyfrekvenciás erősítő, közvetlenül hangfrekvenciát ad ki
- **TRF (egyenes) vevő:** több hangolt fokozat erősíti a vivőfrekvencián
- hátránya: kis szelektivitás és érzékenység, főleg rövidhullámon

---

# Szuperheterodin elve

- a bejövő jelet állandó **középfrekvenciára (KF)** keverjük
- keverés: helyi oszcillátor (VFO/PLL) + bejövő jel → összeg és különbségi frekvenciák
- $f_v = f_h \pm f_{KF}$
- fix KF-re könnyebb nagyszelektivitású szűrőt készíteni

---

# Tükörfrekvencia

- a helyi oszcillátor frekvenciájához két különböző bejövő frekvencia tartozhat → **tükörfrekvencia**
- ezt a bemeneti sávszűrő nyomja el (**tükörszelektivitás**, dB-ben)
- $a_t = 10\lg(P_v/P_t)$

---

# Egyszeres és kétszeres keverés

- **egyszeres transzponálás:** egy keverő + egy KF fokozat
- **kétszeres transzponálás:** két keverő, két KF fokozat, jobb szelektivitás és minőség
- a 2. helyi oszcillátor jellemzően kvarcstabilizált (fix frekvenciájú)

---

# Vevő tömbvázlat — közös elemek

- antennacsatoló → nagyfrekvenciás előerősítő → keverő + oszcillátor → KF erősítő → demodulátor → hangfrekvenciás erősítő
- CW vevő: a demodulátor előtt BFO szükséges
- AM vevő: egyszerű diódás demodulátor
- SSB vevő: produkt detektor + BFO, USB/LSB váltással
- FM vevő: limiter + diszkriminátor (fázisdetektoros demodulátor)

---

# Antennacsatoló és NF előerősítő

- feladata: antenna leválasztása, sávszelekció, tükörszelektivitás növelése, KF-elnyomás
- a nagyfrekvenciás előerősítő szelektív, gyakran AGC-vel szabályozott
- negatív visszacsatolás a stabilitás és a begerjedés elleni védelem miatt

---

# Oszcillátor és keverőfokozat

- helyi oszcillátor: egyszerű VFO (LC) vagy PLL-alapú
- keverő kimenetén: összeg- és különbségfrekvenciák, ill. kombinációs termékek
- nemkívánt kombinációs frekvenciák csillapítása: 80-90 dB
- megvalósítás: diódás ringmodulátor vagy dual-gate MOSFET aktív keverő

---

# Középfrekvenciás erősítő

- a keverő és a demodulátor között — a **csatornaszelektivitásért** felelős
- típusai: LC hangolt körös, sávszűrős, kristályszűrős, kerámiaszűrős
- amatőr berendezésekben gyakori a kvarckristályokból épített kristályszűrő
- erősítése automatikusan szabályozott (AGC), kapcsolható manuálisra (MGC)

---

# Demodulátorok (emlékeztető)

- AM: diódás burkoló-detektor
- SSB/CW: produkt detektor + BFO (±1,5 kHz eltolással)
- FM: diszkriminátor vagy PLL alapú demodulátor
- (részletesen: lásd Áramkörök — Detektorok)

---

# Hangfrekvenciás erősítő, zajzár

- **HF erősítő:** elő- és végerősítő, tipikusan 1-2 W a hangszórónak
- **zajzár (squelch):** a beállított küszöb alatti jelnél elnémítja a vevőt, hogy a háttérzaj ne hallatszon

---

# S-mérő

- a vett jel erősségének skálája: S1-S9, majd +10...+40 dB
- 1 S-egység ≈ 6 dB jelfeszültség-változás
- S9 ≈ 50 µV jelfeszültség (nem hitelesített, készülékenként eltérhet)

---

# Szelektivitás

- **csatornaszelektivitás:** a kívánt csatorna kiemelése a szomszédosak közül — a KF szűrő feladata
- **sávszelektivitás:** a bemeneti sávszűrő feladata, ez adja a tükörszelektivitást is
- **szomszédos csatorna szelektivitás:** mennyire nyomja el a vevő a szomszédos csatorna jelét

---

# Érzékenység és zaj

- **érzékenység:** a legkisebb bemeneti jelszint, amely még használható kimenetet ad
- **vevőzaj, zajtényező (NF):** a vevő saját (elsősorban termikus) zaja rontja az érzékenységet
- minél kisebb a zajtényező, annál gyengébb jel is vehető

---

# Stabilitás

- a vevő (helyi oszcillátorának) frekvenciája időben és hőmérséklet hatására ne sodródjon
- instabil oszcillátor → elhangolódás, torz vétel
- javítása: kvarcstabilizálás, termosztát, PLL

---

# Lefulladás és blokkolás

- **lefulladás (blokkolás):** erős, közeli állomás a vevő valamely fokozatát túlvezérli, a kívánt jel vétele elromlik/megszűnik
- oka: nem megfelelő nagyfrekvenciás szelektivitás vagy túl nagy erősítés a keverő előtt

---

# Intermoduláció és keresztmoduláció

- **intermoduláció:** két (vagy több) erős jel a nemlineáris fokozatban új, nem kívánt frekvenciákat kelt
- **keresztmoduláció:** egy erős zavaró állomás modulációja átkerül a kívánt jelre
- csökkentése: jobb bemeneti szelektivitás, nagyobb dinamikatartományú keverő

---

# Visszakeverés (fáziszaj)

- a helyi oszcillátor fáziszaja a keverés során a közeli erős állomások jelét a kívánt csatornába "keni át"
- ez rontja a vevő effektív érzékenységét erős szomszédos jelek mellett
- csökkentése: kisebb fáziszajú oszcillátor (jó minőségű PLL/kvarc referenciával)

---

# Összefoglalás

- szuperheterodin: fix KF-re keverve könnyebb a szelektív szűrés
- tükörfrekvencia elnyomása: bemeneti sávszűrő feladata
- vevő minőségét jellemzi: szelektivitás, érzékenység, zajtényező, stabilitás, intermodulációs tulajdonságok
- kétszeres keverés jobb szelektivitást és minőséget ad, de bonyolultabb
