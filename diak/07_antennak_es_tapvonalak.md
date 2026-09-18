---
marp: true
title: Antennák és tápvonalak (HAREC)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Antennák és tápvonalak

## HAREC fokozat

---

# Félhullámú dipólus

- legelterjedtebb antenna, a nyereség vonatkozási alapja
- feszültség- és árameloszlás a vezető hossza mentén szinuszos
- ideális, vékony dipólus talpponti impedanciája: **73,2 Ω**
- hurokdipólusé kb. négyszerese: **293 Ω**

---

# Rövidülési tényező és sávszélesség

- a valódi (véges vastagságú) sugárzó geometriai hossza kisebb, mint az elméleti elektromos hossz
- a vastagság növelésével: rövidülési tényező csökken, talpponti ellenállás csökken, **sávszélesség nő**
- karcsúsági tényező: $\lambda/d$ (hullámhossz / vezető átmérő)

---

# Sugárzási ellenállás és hatásfok

- sugárzási ellenállás: $R_S = P_S/I_{max}^2$
- valós antenna: veszteségi ellenállás ($R_V$) is van → $R_{be} = R_S + R_V$
- hatásfok: $\eta = \dfrac{1}{1+R_V/R_S}$

---

# Iránykarakterisztika

- **izotróp sugárzó:** fiktív, minden irányba egyenlő intenzitással sugároz (elméleti referencia)
- valódi antennák iránykarakterisztikával rendelkeznek (E- és H-síkbeli diagram)
- félhullámú dipólus: E-síkban irányított (±3 dB pont ≈ 78°), H-síkban körsugárzó

---

# Antennanyereség

- $G = S_1/S_{REF}$, decibelben: $G[\mathrm{dB}] = 10\lg(S_1/S_{REF})$
- **dBi:** izotróp sugárzóhoz viszonyítva
- **dBd:** félhullámú dipólushoz viszonyítva
- a dipólus nyeresége az izotróphoz képest: 2,14 dB

---

# Hatásos felület

- vevőantenna hatásos felülete: $A_H = P_v/S_1$
- kapcsolat a nyereséggel: $A_H = \dfrac{G\lambda^2}{4\pi}$
- minél nagyobb a nyereség, annál nagyobb az antenna hatásos felülete

---

# Végén táplált és hajlított dipól

- **végén táplált félhullámú antenna:** a tápvonal az egyik végén csatlakozik, magas impedanciás betáplálási pont
- **hajlított (hurok-) dipól:** a két vég párhuzamos vezetővel összekötve — impedanciája a négyszerese az egyenes dipólusénak
- gyakorlati formák: Windom, Y-antenna, szigetelt tápvonalas dipól

---

# Negyedhullámú függőleges antenna

- **Marconi-antenna:** negyedhullámú rúd jó vezető talaj felett, a talaj tükörképszerűen kiegészíti félhullámúvá
- **Groundplane (GP) antenna:** negyedhullámú sugárzó + 4 db negyedhullámú ellensúly (radiál), 90°-onként
- talpponti impedanciája ≈ 50 Ω, közvetlenül koaxkábellel táplálható
- vízszintes síkban (E-sík) körsugárzó

---

# Parazitaelemes antenna (Yagi)

- dipólus + parazita elemek: **direktor** (rövidebb, előtte) és **reflektor** (hosszabb, mögötte)
- jellemzők: nyereség, előre-hátra viszony, nyílásszög, sávszélesség — mind a mechanikai elrendezéstől függenek
- rövid Yagi: alacsonyabb frekvenciákon; hosszú Yagi: magasabb frekvenciákon (144 MHz felett)

---

# Apertúra antennák

- **parabolikus reflektor:** a tükör a besugárzó (feeder) sugárzását párhuzamos nyalábba fókuszálja — nagy nyereség mikrohullámon
- **tölcsérantenna (horn):** hullámvezetőből fokozatosan bővülő sugárzó, mikrohullámú tartományban
- 1200 MHz felett a Yagi mechanikailag már kedvezőtlen — itt előnyösebbek
- a nagy nyereségű apertúra antenna kis nyílásszöggel, kis **besugárzott területtel** dolgozik — pontos irányítást igényel

---

# Többsávos antennák

- cél: egy antennával több amatőrsáv lefedése
- **trap dipól (pl. W3DZZ):** LC csapdakörökkel (trap) elektromosan "megrövidített" szakaszok
- kompromisszumos megoldás — a többsávos üzem hangolt tápvonal vagy csapda révén érhető el

---

# ERP és EIRP

- **ERP (Effective Radiated Power):** a kisugárzott teljesítmény félhullámú dipólusra viszonyítva
- **EIRP (Effective Isotropic Radiated Power):** izotróp sugárzóra viszonyítva
- $EIRP = ERP + 2{,}14\,\mathrm{dB}$
- dB-ben: $ERP[\mathrm{dBd}] = P_{adó}[\mathrm{dBW}] + G_{antenna}[\mathrm{dBd}] - L_{tápvonal}[\mathrm{dB}]$

---

# Előre-hátra viszony, sugárzási diagram

- **előre-hátra viszony:** a fő irányban és a hátrafelé sugárzott teljesítmény aránya (dB-ben)
- vízszintes (azimut) és függőleges (elevációs) sugárzási diagram jellemzi az irányított antennákat
- függőleges sugárzók: kis emelkedési szög, vízszintes síkban körsugárzók

---

# Nem rezonáns antenna impedanciája

- a rezonanciafrekvenciától eltérő üzemi frekvencián az antenna impedanciája nem tisztán ohmos
- a rezonancia alatt **induktív**, felette **kapacitív** reaktáns komponens jelenik meg
- ez okozza az illesztetlenséget és a megnövekedett SWR-t

---

# Tápvonal — hullámimpedancia

- feladata: az RF energia veszteségmentes továbbítása, saját sugárzás nélkül
- típusai: párhuzamos vezetőkből álló (szimmetrikus), koaxiális, és mikrohullámon **hullámvezető** (fémcsőben terjedő EM hullám, nagyfrekvencián kis veszteséggel)
- hullámellenállás: $Z = \sqrt{L/C}$ — frekvenciától és hossztól független, valós (ohmos jellegű) érték
- illesztés feltétele: $R_i = Z = R_a$ (generátor = tápvonal = terhelés)

---

# Terjedési sebesség és veszteségek

- a hullám sebessége a tápvonalban kisebb, mint vákuumban → rövidülési tényező: 0,6-0,9
- veszteségforrások: **sugárzás** (frekvenciával nő), **vezetékmelegedés** (ohmos), **dielektromos melegedés**
- minél hosszabb a tápvonal, annál nagyobb a veszteség

---

# Állóhullámarány (SWR)

- illesztetlenség → reflektált hullám → állóhullók a tápvonalon
- $SWR = U_{max}/U_{min} \geq 1$
- teljesítménnyel: $SWR = \dfrac{1+\sqrt{P_r/P_h}}{1-\sqrt{P_r/P_h}}$
- SWR = 1,5-nél a visszavert teljesítmény ≈ 4%; SWR = 2-3 fölött már kritikus

---

# Szimmetrikus tápvonalak

- **légszigeteléses kéthuzalos ("macskalétra"):** Z ≈ 500-600 Ω
- **szalagkábel (TV):** Z ≈ 240-300 Ω, időjárásra érzékeny
- **árnyékolt kettős tápvonal:** Z ≈ 120-240 Ω

---

# Koaxiális kábel

- felépítés: belső ér — dielektrikum — köpeny (árnyékolás) — védőburkolat
- rádióamatőr használatban jellemzően 50 Ω hullámimpedanciájú
- kábelválasztás szempontjai: frekvencia, megengedett csillapítás, átvihető teljesítmény, hajlítási sugár
- példák: RG-213 (nagy teljesítmény, 300 MHz-ig), RG-58 (kis átmérő, nagyobb veszteség), H155/H500 (URH, kis csillapítás)

---

# Csatlakozók

| Típus | Impedancia | Tartomány | Jellemző |
|---|---|---|---|
| BNC | 50 Ω | 0-4 GHz | bajonettzár, kis teljesítmény |
| UHF (PL-259) | - | 0-300 MHz | RH-n elterjedt, nagy teljesítmény |
| N | 50 Ω | 0-11 GHz | 300 MHz felett, kis veszteség |
| SMA | 50 Ω | 0-13 GHz | kisméretű, kis teljesítmény |

---

# Táplálási módok

- **illesztett tápvonal:** haladóhullámú, nincs reflexió (Z = terhelés)
- **hangolt tápvonal:** hossza λ/4 vagy λ/2 többszöröse — a tápvonal maga is transzformál
- URH és annál magasabb sávokon kizárólag illesztett tápvonalat használunk

---

# Illesztő tagok (delta, T, gamma)

- **delta-illesztés:** 400-600 Ω-os kéthuzalos tápvonalhoz, a sugárzót nem kell elvágni
- **T-illesztés:** mechanikailag merev változat, csőantennáknál, URH-n elterjedt
- **gamma/omega-illesztés:** aszimmetrikus koaxkábel csatlakoztatása szimmetrikus sugárzóhoz szimmetrizáló nélkül

---

# Balun és negyedhullámú kerülővezeték

- **balun transzformátor:** 4:1 impedanciatranszformáció (pl. 200-240 Ω antenna ↔ 50-75 Ω koax), egyben szimmetrizál
- **negyedhullámú koaxiális kerülővezeték:** URH-n a tekercses balunt helyettesíti (pl. Yagi hurok-dipólusnál)

---

# Antennahangoló egység

- fix 50 Ω terhelést biztosít az adóvevő felé, ha az antenna impedanciája nem 50 Ω
- felépítés: változtatható tekercs(ek) és kondenzátor(ok) — **T-tag** vagy **Pí-tag**
- csak illeszt — az antenna rezonanciafrekvenciáját nem változtatja meg
- a lehangolt antenna és az adóvevő közötti szakaszon a reflektált teljesítmény veszteségként megmarad

---

# Mit old meg / nem old meg az antennahangoló

- **megold:** aszimmetrikus-szimmetrikus illesztés (beépített balunnal), antenna más sávon való használata, keskeny SWR-sávú antenna problémái
- **nem old meg:** más rendszerekkel való interferencia (ehhez kimeneti szűrő kell), ha az antenna egyáltalán nem hangolható 1,5:1 SWR alá

---

# Összefoglalás

- dipólus talpponti impedanciája 73 Ω, nyeresége a viszonyítási alap (dBd)
- Yagi: parazita elemekkel irányított nagyobb nyereség; GP: körsugárzó, 50 Ω
- SWR: az illesztés mértéke, minél kisebb, annál jobb ($SWR=1$ ideális)
- illesztés eszközei: balun, gamma/T/delta-tag, antennahangoló (Pí-/T-tag)
