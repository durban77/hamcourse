---
marp: true
title: Áramkörök (HAREC)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Áramkörök

## HAREC fokozat

---

# Rezgőkör alapjai

- L és C kombinációja: soros vagy párhuzamos rezgőkör
- energiacsere: a kondenzátor elektromos energiája ↔ a tekercs mágneses energiája
- veszteségmentes esetben csillapítatlan, valóságban exponenciálisan csillapodó rezgés

---

# Rezonanciafrekvencia

- rezonancián: $X_L = X_C$
- $2\pi f_0 L = \dfrac{1}{2\pi f_0 C}$
- **Thomson-képlet:** $f_0 = \dfrac{1}{2\pi\sqrt{LC}}$

---

# Soros és párhuzamos rezgőkör

- **ideális soros kör** rezonancián: rövidzár ($Z_0 = 0$)
- **ideális párhuzamos kör** rezonancián: szakadás ($Z_0 \to \infty$)
- valóságban: soros kör Ω, párhuzamos kör kΩ nagyságrendű rezonancia-ellenállást mutat
- párhuzamos kör tipikus alkalmazása: vevő bemeneti hangolókörében

---

# Jósági tényező és sávszélesség

- $Q_0$: minél nagyobb, annál élesebb a rezonancia-görbe
- csillapítás: $D_0 = 1/Q_0$
- sávszélesség (a −3 dB pontok között): $B = f_0/Q_0 = f_m - f_a$
- a gyakorlatban a tekercs jósága korlátozza a kör Q-ját

---

# Sáváteresztő és sávzáró szűrő

- **sáváteresztő:** párhuzamos LC kör — rezonancián végtelen impedancia, a jel akadálytalanul átmegy
- **sávzáró:** párhuzamos LC kör zárókörben — rezonancián maximális impedancia, szakadásként viselkedik
- mindkettő a rezonanciafrekvencia körüli sávra hat

---

# Alul- és felüláteresztő szűrő

- **aluláteresztő:** soros ágban tekercs, párhuzamos ágban kondenzátor — a határfrekvencia alatt átereszt (az egyenáramot is)
- **felüláteresztő:** soros ágban kondenzátor, párhuzamos ágban tekercs — a határfrekvencia felett átereszt
- **sávszűrő:** alul- és felüláteresztő szűrő összekapcsolásával (Pí- vagy T-tag elrendezésben) is kialakítható

---

# Tápegységek — áttekintés

- feladat: hálózati (vagy egyéb) feszültségből a készülék üzemi feszültségének előállítása
- **stabilizálatlan:** fix vagy változtatható kimenetű, egyenirányító + szűrés
- **stabilizált:** visszacsatolás nélküli (Zener) vagy visszacsatolt kialakítás

---

# Egyenirányítók

- **egyutas:** 1 dióda, csak a félperiódus egyik felét engedi át — rossz hatásfok, erős lüktetés
- **kétutas (középleágazásos):** 2 dióda, mindkét félperiódust kihasználja
- **Graetz-hidas (kétutas híd):** 4 dióda, nincs szükség középleágazásos transzformátorra

---

# Kondenzátoros szűrés

- az egyenirányított jel búgófeszültséget (brummfeszültséget) tartalmaz
- pufferkondenzátor simítja a hullámosságot és energiát tárol/ad le a diódák le nem vezető szakaszában
- nagyobb C → kisebb brummfeszültség, de nagyobb csúcsáram a diódákon
- tipikus méretezés: a brumm csúcsértéke ≈ 5% a névleges kimeneti feszültségnek

---

# Stabilizált tápegység

- **Zener-stabilizátor:** kimeneti feszültség = Zener-feszültség, korlátozott terhelhetőség
- **áteresztő tranzisztoros kiegészítés:** nagyobb terhelhetőség, kimenet ≈ Zener-feszültség − U_BE
- **visszacsatolt stabilizátor:** referenciafeszültség és kimenet összehasonlítása → hibajel vezérli az áteresztő elemet
- **integrált stabilizátor (pl. 7812):** kevés külső alkatrész, beépített védelmek

---

# Túláram-védelem

- olvadóbiztosítók: lomha vagy gyors kioldási karakterisztika
- hálózati oldali biztosító: a tápegység hibája ellen védi a hálózatot
- kimeneti biztosító: túlterhelés ellen véd, méretezés a max. kimeneti áram alapján

---

# Erősítők — alapfogalmak

- feszültség-, áram- és teljesítményerősítő
- $A_u = u_{ki}/u_{be}$; $A_i = i_{ki}/i_{be}$; $A_p = P_{ki}/P_{be}$
- ideális erősítő: nagy bemeneti, kis kimeneti ellenállás
- kis- és nagyfrekvenciás erősítők; nagyfrekvenciásnál szélessávú vagy szelektív (hangolt LC kört tartalmazó) kialakítás

---

# Teljesítményerősítő osztályok

| Osztály | Vezérlési szög | Hatásfok | Torzítás |
|---|---|---|---|
| A | 360° | ~50% | kis torzítás |
| AB | 181°-359° | 60-65% | kis torzítás |
| B | 180° | 70-75% | nagyobb torzítás |
| C | <180° | 75-85% | nem lineáris |

- rádiótechnikában a lineáris erősítők jellemzően AB osztályban dolgoznak

---

# Visszacsatolás és torzítás

- **negatív visszacsatolás:** csökkenti a torzítást, stabilizál — lineáris erősítőkben ezt alkalmazzuk
- **pozitív visszacsatolás:** felerősít — oszcillátorban hasznos, erősítőben káros (begerjedés)
- torzítás típusai: harmonikus torzítás (felharmonikusok), intermodulációs torzítás (új frekvenciák keletkezése)

---

# AGC és többfokozatú erősítők

- **AGC (automatikus erősítésszabályozás):** a vett jel szintjétől függően csökkenti/növeli a KF erősítést
- **többfokozatú erősítő:** egy fokozattal csak korlátozott (10-50×) erősítés érhető el
- fokozatok közötti csatolás: közvetlen, RC, transzformátoros, optoelektronikai

---

# AM demodulátor

- egyszerű diódás detektor + RC tag
- a dióda egyenirányítja a nagyfrekvenciás jelet
- az RC tag kiszűri a nagyfrekvenciás komponenst, megmarad a hangfrekvenciás burkológörbe

---

# SSB/CW demodulátor

- nincs kisugárzott vivő → a vevőben kell előállítani (BFO — beat frequency oscillator)
- **produkt detektor:** keverő, amely az SSB/CW jelet a BFO jelével keveri
- USB/LSB vételnél a BFO-t a KF frekvenciához képest ±1,5 kHz-re hangolják

---

# FM demodulátor

- eljárások: FM-AM átalakítás, fázisátalakítás (diszkriminátor), impulzusszámlálás, PLL
- **Foster-Seely diszkriminátor:** induktívan csatolt hangolt kör, a fáziseltérés rezonancia körül változik
- vétel előtt limitálás szükséges a zavaramplitúdók eltávolítására

---

# Oszcillátor alapjai

- elemei: erősítő, visszacsatoló hálózat, frekvencia-meghatározó elem, amplitúdó-szabályozás
- feltétel az önfenntartó rezgéshez: $A\beta = 1$ (hurokerősítés)
- fontos jellemző: frekvenciastabilitás (hőmérséklet, tápfeszültség, mechanikai hatások érzékenysége)

---

# LC oszcillátorok

- legalább egy csatolt rezgőkör + egy aktív elem
- **Hartley:** induktívan csatolt rezgőkör
- **Colpitts:** kapacitívan csatolt rezgőkör
- frekvenciastabilitásuk korlátozott

---

# Kvarcoszcillátor és VFO

- **kvarcoszcillátor:** a kristály soros rezgőkörként viselkedik, stabilitása $\Delta f/f \approx 10^{-6}...10^{-10}$
- **VFO (változtatható frekvenciájú oszcillátor):** a rezgőkör egy eleme (jellemzően a kondenzátor) hangolható
- kvarc: fix frekvencia, kiváló stabilitás; VFO: hangolható, kisebb stabilitás

---

# Fáziszárt hurok (PLL)

- elemei: fázisdetektor, aluláteresztő szűrő, VCO, frekvenciaosztó (visszacsatoló hurokban)
- a VCO kimenetét fázisban és frekvenciában egy stabil referenciajelhez (kvarc) szinkronizálja
- kimenő frekvencia: $N \cdot f_{ref}$ — az osztásarány (N) változtatásával hangolható
- alkalmazás: frekvenciaszintézis, FM/AM demoduláció, vivőszinkronizáció

---

# Összefoglalás

- rezgőkör: $f_0 = 1/(2\pi\sqrt{LC})$, jósági tényező határozza meg a sávszélességet
- tápegység: egyenirányítás → szűrés → stabilizálás
- erősítő osztályok: A/AB (lineáris) vs. C (nagy hatásfok, nem lineáris)
- oszcillátor: LC, kvarc, VFO — PLL a pontos, hangolható frekvenciaszintézishez
