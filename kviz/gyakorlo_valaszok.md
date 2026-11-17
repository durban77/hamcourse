# Gyakorló feladatlap – helyes válaszok és magyarázatok

A kérdések: [gyakorlo_kerdesek.md](gyakorlo_kerdesek.md).

> A jogi és forgalmi szabályok változhatnak: a vizsga előtt ellenőrizd az aktuális hatályos szöveget.

## Műszaki feladatok

### M-1. — Helyes válasz: B
Ohm törvénye szerint I = U / R = 12 V / 48 Ω = 0,25 A. Az A (4 A) a hányados fordított felírásából (R / U) adódik, a C (576 A) pedig a szorzásból (U · R). Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.1.6.; jegyzet/04_Alkatreszek.md, 4.1.

### M-2. — Helyes válasz: C
P = I² · R = (0,2 A)² · 50 Ω = 0,04 · 50 = 2 W. A 10 W az I · R szorzat (ez a feszültség, 10 V, nem teljesítmény), a 0,04 W pedig az áram négyzete az ellenállással való szorzás nélkül. Forrás: jegyzet/04_Alkatreszek.md, 4.1.1.

### M-3. — Helyes válasz: A
Két párhuzamos ellenállás eredője Re = (R1 · R2) / (R1 + R2) = (100 · 150) / 250 = 60 Ω. A 250 Ω a soros eredő, a 125 Ω a számtani közép; párhuzamos kapcsolásnál az eredő mindig kisebb a legkisebb tagnál. Forrás: jegyzet/04_Alkatreszek.md, 4.1.4.2.

### M-4. — Helyes válasz: C
Soros kondenzátoroknál Ce = (C1 · C2) / (C1 + C2) = (6 · 3) / 9 = 2 µF. A 9 µF a párhuzamos kapcsolás eredője, a 4,5 µF a számtani közép; sorosnál az eredő kisebb a legkisebb tagnál. Forrás: jegyzet/04_Alkatreszek.md, 4.2.3.1.

### M-5. — Helyes válasz: B
Háromjegyű kódnál az első két számjegy az érték, a harmadik a szorzó (pF-ban): 3 → 1000, tehát 22 · 1000 pF = 22 000 pF = 22 nF. A 223 pF a kód szó szerinti olvasása, a 220 nF a „4” szorzóhoz tartozna. Forrás: jegyzet/04_Alkatreszek.md, 4.2.2.2.

### M-6. — Helyes válasz: A
Xc = 1 / (2π · f · C) = 1 / (2π · 1600 Hz · 1 µF) = 1 / 0,01005 ≈ 99,5 Ω ≈ 100 Ω. A 0,01 Ω a képlet reciprokként (2π · f · C) való elírása, az 1 kΩ pedig tízszeres nagyságrendi hiba. Forrás: jegyzet/04_Alkatreszek.md, 4.2.5.

### M-7. — Helyes válasz: B
XL = 2π · f · L = 2π · 7 · 10^6 Hz · 10 · 10^-6 H = 2π · 70 ≈ 440 Ω. A 70 Ω a 2π tényező kihagyásával, a 4,4 kΩ nagyságrendi hibával jönne ki. Forrás: jegyzet/04_Alkatreszek.md, 4.3.3.

### M-8. — Helyes válasz: C
A feszültségek aránya megegyezik a menetszámok arányával: N2 = N1 · U2 / U1 = 1150 · 12 / 230 = 60 menet (1150 / 230 = 5 menet/volt, ennek 12-szerese). A 30 és a 120 menet a menet/volt arány elszámolásából adódna. Forrás: jegyzet/04_Alkatreszek.md, 4.4.1.

### M-9. — Helyes válasz: A
Az áttétel N1/N2 = U1/U2 = 10, az áramok fordítottan arányosak: I1 = I2 / 10 = 0,5 A (a teljesítmény P1 = P2: 230 V · 0,5 A = 23 V · 5 A = 115 W). Az 5 A és az 50 A az áram helytelen (nem fordított) arányosításából adódik. Forrás: jegyzet/04_Alkatreszek.md, 4.4.1.

### M-10. — Helyes válasz: B
Nyitóirányban a szilíciumdiódán kb. 0,6 V esik, így Pd = 0,6 V · 2 A = 1,2 W. A 0,3 W az U / I hányados, a 2,6 W pedig az U + I összeg, melyek nem teljesítményt adnak. Forrás: jegyzet/04_Alkatreszek.md, 4.8.1.

### M-11. — Helyes válasz: A
A Zener-dióda tartósan a záróirányú letörési tartományban dolgozik, ahol áramváltozás mellett is tartja a feszültséget, ezért stabilizálásra való. A B (keverés) nem Zener-feladat, a C a varicap dióda alkalmazása. Forrás: jegyzet/04_Alkatreszek.md, 4.5.4.

### M-12. — Helyes válasz: C
A varicap diódát záróirányban előfeszítik, a kiürített réteg vastagsága és így a kapacitás a feszültségtől függ; elsősorban feszültséggel hangolt rezgőkörökben használják. Az A a Zener-dióda, a B a LED feladata. Forrás: jegyzet/04_Alkatreszek.md, 4.5.6.

### M-13. — Helyes válasz: B
Az áramerősítési tényező B = IC / IB, tehát IC = 100 · 50 µA = 5000 µA = 5 mA. A 0,5 µA az osztás (IB / B), az 50 mA pedig tízszeres nagyságrendi hiba. Forrás: jegyzet/04_Alkatreszek.md, 4.5.10.1.

### M-14. — Helyes válasz: A
Tranzisztornál a disszipáció a kollektoráram és a kollektor-emitter feszültség szorzata: P = 6 V · 0,15 A = 0,9 W. A 40 a U / I, a 0,025 az I / U hányados (nem teljesítmény). Forrás: jegyzet/04_Alkatreszek.md, 4.8.2.

### M-15. — Helyes válasz: C
A növekményes MOSFET UGS = 0 esetén nem vezet, csak egy bizonyos küszöbfeszültség felett indul meg az áram. A JFET és a kiürítéses MOSFET vezérlés nélkül maximális árammal vezet, a vezérlőfeszültség növelésével az áram csökken. Forrás: jegyzet/04_Alkatreszek.md, 4.5.11.1. és 4.5.11.2.

### M-16. — Helyes válasz: B
Az invertáló (–) bemenetre adott jel a kimeneten 180 fokos fázisfordítással jelenik meg. Az azonos fázisú megjelenés a nem invertáló (+) bemenetre jellemző; a 90 fokos eltolás nem tartozik a bemenetek tulajdonságai közé. Forrás: jegyzet/04_Alkatreszek.md, 4.7.3.

### M-17. — Helyes válasz: C
A Thomson-képlet: f0 = 1 / (2π · √(L · C)) = 1 / (2π · √(10^-5 · 10^-10)) = 1 / (2π · 3,162 · 10^-8) ≈ 5,03 MHz. A 31,6 MHz a 2π kihagyásával, az 503 kHz nagyságrendi hibával adódik. Forrás: jegyzet/06_Aramkorok.md, 6.1.1.

### M-18. — Helyes válasz: A
A sávszélesség B = f0 / Q = 7 MHz / 70 = 100 kHz. A 10 kHz tízszeres Q-nak felelne meg, a 490 MHz a szorzás (f0 · Q) eredménye. Forrás: jegyzet/06_Aramkorok.md, 6.1.4.

### M-19. — Helyes válasz: B
Az ideális soros rezgőkör impedanciája rezonanciafrekvencián minimális (Z0 = 0), tehát rövidzárként viselkedik. A végtelen impedancia az ideális párhuzamos rezgőkörre jellemző; rezonancián az XL és XC kiegyenlíti egymást, így a kör tisztán ohmos, nem kapacitív. Forrás: jegyzet/06_Aramkorok.md, 6.1.2.

### M-20. — Helyes válasz: C
Az aluláteresztő szűrő soros ágában tekercs (nagyfrekvencián nagy impedancia), párhuzamos ágában kondenzátor (nagyfrekvencián söntöl) található, így az egyenáramot is átereszti. Az A a felüláteresztő szűrő felépítése; a B elrendezésnél nincs söntelem, így nem szűrne frekvenciaszelektíven. Forrás: jegyzet/06_Aramkorok.md, 6.2.3. és 6.2.4.

### M-21. — Helyes válasz: A
A határfrekvencia f = 1 / (2π · R · C) = 1 / (2π · 1000 Ω · 100 nF) = 1 / (6,28 · 10^-4) ≈ 1,59 kHz. A 10 kHz a 2π nélküli számítás (1 / RC), a 160 Hz tízszeres C értéknek felelne meg. Forrás: jegyzet/04_Alkatreszek.md, 4.2.5.

### M-22. — Helyes válasz: B
A tekercs jósági tényezője Q = ωL / Rs = XL / Rs = 300 Ω / 3 Ω = 100. A 0,01 a fordított arány (Rs / XL), a 900 a szorzat. Forrás: jegyzet/04_Alkatreszek.md, 4.3.4.

### M-23. — Helyes válasz: C
A Graetz-híd négy diódával kétutas egyenirányítást ad középleágazásos transzformátor nélkül. Az A hamis (négy diódát igényel és szűrés kell), a B is hamis: két soros dióda miatt dupla nyitófeszültség esik rajta. Forrás: jegyzet/06_Aramkorok.md, 6.3.1.1.

### M-24. — Helyes válasz: A
A nagyobb simítókondenzátor csökkenti a búgófeszültséget, de a diódák vezetési ideje lerövidül és a periodikus csúcsáram nő, ezért a kondenzátort adott hullámosságra méretezik. A B és a C ellentétes vagy téves hatást állít. Forrás: jegyzet/06_Aramkorok.md, 6.3.1.2.

### M-25. — Helyes válasz: B
Áteresztő tranzisztoros kiegészítésnél a kimeneti feszültség a Zener-feszültség és az UBE különbsége: 6,8 V – 0,6 V = 6,2 V. A 7,4 V az összeg, a 6,8 V a Zener-feszültség változatlanul (az UBE-t figyelmen kívül hagyva). Forrás: jegyzet/06_Aramkorok.md, 6.3.2.1.

### M-26. — Helyes válasz: C
A PLL szintézer kimenő frekvenciája fki = N · fref = 5760 · 25 kHz = 144 000 kHz = 144 MHz. A 144 kHz és a 14,4 MHz nagyságrendi (tízes hatványi) hibák. Forrás: jegyzet/06_Aramkorok.md, 6.5.4.1.

### M-27. — Helyes válasz: A
A kimeneti (F3) biztosítóra Ih ≥ 1,1…1,2 · Ikimax, így legalább 1,1 · 5 A = 5,5 A (1,2-es szorzóval 6 A). A 4,5 A és a 2,5 A kisebb, mint a maximális üzemi áram, ezért normál terhelésen is kiolvadna. Forrás: jegyzet/06_Aramkorok.md, 6.3.3.

### M-28. — Helyes válasz: B
Teljesítményerősítésnél ap = 10 · lg(Pki / Pbe) = 10 · lg(50 / 0,5) = 10 · lg 100 = 20 dB. A 40 dB a feszültségerősítés képletével (20 · lg) számolva jönne ki, a 100 dB a hányados (100-szoros) dB-nek nézve. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.4.1.

### M-29. — Helyes válasz: C
Az abszolút szint 1 mW-hoz viszonyít: 10 · lg(10 W / 1 mW) = 10 · lg(10 000) = 40 dBm. A 30 dBm az 1 W-nak felel meg, a 10 dBm a 10 mW-nak. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.4.2.

### M-30. — Helyes válasz: A
Fokozatok egymás után kapcsolásakor a dB-értékek összeadódnak, a csillapítás negatív: 15 + 10 – 3 = 22 dB. A 28 dB a csillapítást pozitívként adná hozzá, a 25 dB pedig elhagyná a szűrőt. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.4.1.

### M-31. — Helyes válasz: C
Szinuszos jelnél Ueff = Ucsúcs / √2 = 40 V / 1,414 ≈ 28,3 V. Az 56,6 V a csúcsértéket szorozná √2-vel, a 20 V pedig a felezés, ami nem az effektív érték. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.3.2.

### M-32. — Helyes válasz: B
λ = c / f = 300 000 000 m/s / 14,2 MHz ≈ 21,1 m. A 2,11 m és a 211 m tízes hatványnyi elcsúszás (MHz-ből m-re váltásnál a tizedesvessző elcsúszása). Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.1.; sajat/radioelmelet.md (terjedési sebesség, frekvencia, hullámhossz).

### M-33. — Helyes válasz: A
A kvarcoszcillátor frekvenciastabilitása (Δf/f ≈ 10^-6…10^-10) két nagyságrenddel jobb az LC rezgőkörénél, ezért fix frekvenciára előnyös. A B a VFO tulajdonsága, a C hamis: a kvarcoszcillátor is erősítőt és visszacsatolást igényel. Forrás: jegyzet/06_Aramkorok.md, 6.5.1. és 6.5.2.

### M-34. — Helyes válasz: C
Az AM-DSB sávszélessége a moduláló jel legnagyobb frekvenciájának kétszerese: B = 2 · fm = 2 · 3 kHz = 6 kHz. A 3 kHz (egy oldalsáv) SSB-nek felelne meg, az 1,5 kHz a moduláló jel felével számolt hibás érték. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.1.1.

### M-35. — Helyes válasz: B
FM-nél a modulációs index a löket és a moduláló frekvencia hányadosa: m = Δf / fmod = 5 kHz / 1 kHz = 5. A 0,2 a fordított hányados, a 10 a löket-csúcstól-csúcsig (2Δf) és a moduláló frekvencia aránya. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.3.

### M-36. — Helyes válasz: A
FM-nél a vett hangerő nem függ az adó teljesítményétől, csak a frekvencialöket nagyságától. A B tehát AM-re jellemző tévedés, a vivőfrekvencia (C) pedig nem határozza meg a hangerőt. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.3.

### M-37. — Helyes válasz: B
Az SSB/SC-nél a vivőt teljesen, az egyik oldalsávot szűrővel elnyomják, így a kisugárzott teljesítmény egésze az információt tartalmazó oldalsávra jut. Az A (megmaradó vivő) és a C (két oldalsáv) nem felel meg az SSB/SC definíciójának. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.1.2.

### M-38. — Helyes válasz: C
SSB és CW jelnél nincs kisugárzott vivő, ezért a demodulációhoz szükséges vivőt a vevőben a BFO állítja elő (a keverővel együtt, produkt detektorként). Az A hamis, mert a vivő nem áll rendelkezésre, a B az egyszerű AM demodulátor működése, ami itt nem alkalmazható. Forrás: jegyzet/06_Aramkorok.md, 6.6.2.

### M-39. — Helyes válasz: A
A C osztály hatásfoka a legjobb (75–85%), de a kollektoráram félperiódusnál rövidebb ideig folyik, ezért nem lineáris. Az A és az AB osztály lineáris, de kisebb hatásfokú. Forrás: jegyzet/06_Aramkorok.md, 6.4.3. és 6.4.3.4.

### M-40. — Helyes válasz: B
Állandó amplitúdójú rezgéshez Aβ = 1 szükséges: Aβ < 1 esetén a rezgés lecseng (az amplitúdó nullára csökken), Aβ > 1 esetén pedig az amplitúdó elvileg a végtelenig nő. Ezért kell amplitúdó-szabályozó áramkör is az oszcillátorban. Forrás: jegyzet/06_Aramkorok.md, 6.5.

### M-41. — Helyes válasz: B
A csatornaszelektivitást a KF szűrő, vagyis a KF erősítő biztosítja, mert fix frekvenciára könnyű nagy szelektivitású szűrőt építeni. A bemeneti sávszűrő a sávszelektivitásért és a tükörszelektivitásért felel, a demodulátor pedig nem szűr csatornát. Forrás: jegyzet/07_Vevok.md, 7.6.1.

### M-42. — Helyes válasz: C
A helyi oszcillátor fh = fv + fKF = 7,1 + 0,455 = 7,555 MHz. A keverő a másik oldalon is KF-t ad: fh + fKF = 7,555 + 0,455 = 8,010 MHz, ez a tükörfrekvencia (fv + 2 · fKF). A 7,555 MHz a helyi oszcillátor frekvenciája, a 6,645 MHz pedig az alsó oszcillátorállásnál lenne a helyi oszcillátor. Forrás: jegyzet/07_Vevok.md, 7.2.

### M-43. — Helyes válasz: A
A keverő a vett jel vivőfrekvenciáját a KF-re transzponálja, így a KF lesz az új vivő, amely az eredeti jel teljes modulációját hordozza. A demodulálás a demodulátor, az erősítés szabályozása az AGC feladata. Forrás: jegyzet/07_Vevok.md, 7.5.2.

### M-44. — Helyes válasz: C
Az egyenes vevők hátránya a kis szelektivitás és a kis érzékenység, főleg rövidhullámon. A KF-et csak a szuperheterodin vevő használja, és az egyenes vevő nem korlátozódik FM-re. Forrás: jegyzet/07_Vevok.md, 7.1.3.

### M-45. — Helyes válasz: B
at = 10 · lg(Pv/Pt) = 30 dB, ezért lg(Pv/Pt) = 3, tehát Pv/Pt = 10^3 = 1000. A 30 és a 300 a dB-érték és a hányados összekeverésén alapul. Forrás: jegyzet/07_Vevok.md, 7.2.

### M-46. — Helyes válasz: A
A 2-3 keverésű rendszerek nagyobb szelektivitást és jobb minőséget adnak, de bonyolultabbá teszik a vevőt. Az egyszerűbb felépítés tehát nem igaz, és a KF szűrő itt is megmarad, sőt kettő van belőle. Forrás: jegyzet/07_Vevok.md, 7.3.

### M-47. — Helyes válasz: C
Mivel mindkét KF frekvencia állandó, a második helyi oszcillátor is stabil frekvenciájú, általában kvarcoszcillátor. A szabadon hangolható VFO az első oszcillátor szerepe, a Gunn-oszcillátor pedig nem szerepel a vevő felépítésében. Forrás: jegyzet/07_Vevok.md, 7.3.

### M-48. — Helyes válasz: B
Egy S-érték 6 dB változást jelent a jelfeszültségben (S9 kb. 50 µV). A 3 és 10 dB nem ez a beosztás. Forrás: jegyzet/07_Vevok.md, 7.5.7.

### M-49. — Helyes válasz: A
Feszültségre 20 dB tízszeres arány (20 · lg 10 = 20 dB), így 50 µV · 10 = 500 µV. A jegyzet példája is ezt követi: S9 + 40 dB = 50 µV · 100 = 5000 µV. Az 1000 µV a 20 dB hibás, 20-szoros értelmezése lenne. Forrás: jegyzet/07_Vevok.md, 7.5.7.

### M-50. — Helyes válasz: B
A zajzár kikapcsolja (elnémítja) a vevőt, ha a rádiófrekvenciás jel egy szint alá esik, hogy ne erősítse a zajt. Nem növeli az érzékenységet és nem szűr tükörfrekvenciát. Forrás: jegyzet/07_Vevok.md, 7.5.6.

### M-51. — Helyes válasz: C
Ha a zajzár hasznos jelnél is elnémít, a küszöbszintet csökkenteni kell. Növelni akkor kell, ha sistergésnél nem kapcsol be. Az AGC kikapcsolása nem oldja meg a problémát. Forrás: jegyzet/07_Vevok.md, 7.5.6.

### M-52. — Helyes válasz: A
Az AGC (Automatic Gain Control) a KF erősítő erősítését szabályozza, hogy az ingadozó bemeneti jelet időben kvázi egyenletessé tegye. Az oszcillátor stabilizálása és a hangszóróteljesítmény korlátozása nem az AGC dolga. Forrás: jegyzet/07_Vevok.md, 7.5.3.

### M-53. — Helyes válasz: B
A demodulátor a KF jelre ültetett jelből visszaalakítja az eredeti moduláló jelet, így a kimenetén hangfrekvenciás jel jelenik meg. A KF-re keverés a keverő, a hangszóró meghajtása a hangfrekvenciás erősítő feladata. Forrás: jegyzet/07_Vevok.md, 7.5.4.

### M-54. — Helyes válasz: C
Az FM adóban a sokszorozó nemcsak a frekvenciát, hanem a már modulált jel frekvencialökétét is megszorozza: 12 MHz · 12 = 144 MHz, 0,5 kHz · 12 = 6 kHz. Ezért a modulátort ennek megfelelően kell méretezni. A löket tehát nem marad változatlan. Forrás: jegyzet/08_Adok.md, 8.3.3.

### M-55. — Helyes válasz: A
A kvarcoszcillátor jelét DSB/SC modulációval moduláljuk, majd az SSB szűrő kiszűri a kívánt oldalsávot. A varicapos elhangolás az FM-hez tartozik, a vivő visszaadása pedig vevőoldali eljárás. Forrás: jegyzet/08_Adok.md, 8.3.7.

### M-56. — Helyes válasz: C
USB/LSB váltásnál nem a szűrőt hangoljuk át, hanem a vivőfrekvenciát változtatjuk úgy, hogy a másik oldalsáv essen a szűrő átviteli tartományába. A mikrofon cseréjének nincs köze az oldalsávhoz. Forrás: jegyzet/08_Adok.md, 8.3.7.

### M-57. — Helyes válasz: B
A végfokozat B vagy C osztályú működése miatt a kimenőjel felharmonikusokat tartalmaz, ezeket a kimeneti szűrő (általában Collins-kör) szűri ki, hogy ne okozzunk zavart. A vivő elnyomása az SSB szűrő, a sávkorlátozás a hangfrekvenciás oldal dolga. Forrás: jegyzet/08_Adok.md, 8.3.5.

### M-58. — Helyes válasz: A
Ha az oszcillátor jelét rezgőkörből csatolják ki, az nagyon érzékeny a terhelésre, és a következő fokozat elhúzhatja a rezgési frekvenciát. Az elválasztó fokozat (általában emitterkövető) ezt akadályozza meg. Nem erősít teljesítményt és nem generál harmonikusokat. Forrás: jegyzet/08_Adok.md, 8.3.1.

### M-59. — Helyes válasz: C
A folyamatosan működő oszcillátor kimenete soha nem csillapítható teljesen, ezért nagy kimenő teljesítménynél is kisugárzódik pár watt. Az arányok megmaradnak, de ez a hátrány. A sávszélességgel és a frekvenciaelhúzással ez nincs kapcsolatban. Forrás: jegyzet/08_Adok.md, 8.2.1.

### M-60. — Helyes válasz: B
A szinuszos árameloszlású ideális dipólus talpponti impedanciája 73,2 Ω, a hurokdipólusé ennek négyszerese, 293 Ω. A fordított sorrend és az 50/200 Ω nem helyes. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1.1.

### M-61. — Helyes válasz: A
λ = c/f = 300/145 ≈ 2,07 m, a félhullámú dipólus elméleti hossza λ/2 ≈ 1,03 m. A 2,07 m a teljes hullámhossz, a 0,52 m a λ/4. A gyakorlatban a rövidülési tényező miatt a valódi sugárzó rövidebb lesz. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1.2. és 9.6.1.

### M-62. — Helyes válasz: B
Szabad térben λ = 300/10 = 30 m. A tápvonalban a hullámhossz a rövidülési tényezővel rövidül: 30 · 0,66 = 19,8 m. A 45,5 m az osztás hibája (30/0,66), a 30 m a szabad térbeli érték. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.1.

### M-63. — Helyes válasz: C
SWR = Umax/Umin = 30/10 = 3. A 20 a különbség, a 0,33 a fordított hányados, de az SWR mindig legalább 1. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.3.

### M-64. — Helyes válasz: A
SWR = (1 + √(Pr/Ph)) / (1 - √(Pr/Ph)); √(4/100) = 0,2, így SWR = 1,2/0,8 = 1,5. A jegyzet is megerősíti, hogy 1,5 SWR-nél a haladó teljesítmény kb. 4 %-a reflektálódik. A 4 a teljesítményarány százalékos hibás értelmezése. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.3.

### M-65. — Helyes válasz: C
η = 1 / (1 + Rv/Rs) = 1 / (1 + 5/45) = 1 / 1,111 = 0,9, azaz 90 %. A 10 % a veszteségi hányad, az 50 % pedig nem következik az adatokból. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1.4.

### M-66. — Helyes válasz: B
A félhullámú dipólus nyeresége az izotróp sugárzóhoz képest 2,14 dB, ezért dBi = dBd + 2,14 = 8 + 2,14 = 10,14 dBi. Kivonni nem kell, és a két érték nem azonos. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1.6.

### M-67. — Helyes válasz: A
A Yagiban a direktor néhány százalékkal rövidebb, a reflektor pár százalékkal hosszabb a sugárzónál, így nő az irányhatás a főirányban. A másik két válasz ennek az ellentéte vagy téves. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.4.1.

### M-68. — Helyes válasz: C
A hullámellenállás Z = √(L/C) rezisztív érték, ezért a frekvenciától és a vezeték hosszától független. Hosszabb kábelen a veszteség nő, de a hullámellenállás nem változik. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.

### M-69. — Helyes válasz: B
A GP antenna egy negyedhullámú sugárzóból és négy negyedhullámú ellensúlyból áll, talpponti impedanciája 50 Ω, így közvetlenül táplálható aszimmetrikus koaxkábellel. A 73 Ω a dipólusé, a 240 Ω a szalagkábelek jellemző értéke. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.2.2.1.

### M-70. — Helyes válasz: A
Az F réteg alapvető jelentőségű a rövidhullámú nagy távolságú összeköttetések számára. A D réteg inkább csillapít, az E réteg pedig alacsonyabb, stabil réteg. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.5.2.

### M-71. — Helyes válasz: C
URH-n a közvetlen hullám és a talajról visszavert hullám különböző utat tesz meg, ezért a vevőantennán erősíthetik vagy gyengíthetik egymást. Az ionoszféra változásai az RH tartományra jellemző fadinget okoznak, nem az URH-ra. Forrás: jegyzet/10_Hullamterjedes.md, 10.2.2.1.

### M-72. — Helyes válasz: B
A D réteg a legkevésbé ionizált, de a rajta áthaladó rádióhullám jelentős csillapítást szenved, ezért nappal gyakorlatilag megakadályozza a középhullámú távolsági vételt. Az E és F rétegek nem ilyen jellegű csillapítást okoznak. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.5.2.

### M-73. — Helyes válasz: A
Függőleges antennánál pozitív tükörkép keletkezik (kétszeres térerősség), vízszintes antennánál negatív tükörkép, amely a föld felszínén kioltja a térerősséget. A másik két magyarázat téves. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.3.

### M-74. — Helyes válasz: B
Az árammérőt sorosan kell bekötni, ezért az ideális belső ellenállása 0 Ω (rövidzárként viselkedik). A végtelen belső ellenállás a feszültségmérőre igaz, és a párhuzamos bekötés árammérőnél rövidzárat okozna. Forrás: jegyzet/11_Meresek.md, 11.4.1.2.

### M-75. — Helyes válasz: C
A feltételből Rx = R1 · R3 / R2 = 1000 · 250 / 500 = 500 Ω. A 125 Ω a szorzat és a hányados felcserélésével, a 2 kΩ a fordított hányadossal jönne ki. Forrás: jegyzet/11_Meresek.md, 11.4.2.3.

### M-76. — Helyes válasz: A
Rezonanciánál a mérendő rezgőkör energiát von el a GDO-tól, ezért annak rezgési amplitúdója csökken, és a feszültségminimum helyén olvasható le a frekvencia a skáláról. Az amplitúdó növekedése nem igaz. Forrás: jegyzet/11_Meresek.md, 11.4.5.

### M-77. — Helyes válasz: C
A műterhelés (indukciószegény, általában 50 Ω-os ellenállás) az antenna helyettesítésére szolgál, így a mérés közben minimális a kisugárzott zavaró jel. Nem növeli az adó teljesítményét, és nem az SWR mérés pontosságát javítja. Forrás: jegyzet/11_Meresek.md, 11.5.3.

### M-78. — Helyes válasz: B
A természetes zajokra (légköri és galaktikus/kozmikus zajok) a QRN jelölést használjuk, az ipari eredetű zajokra a QRM-et. A villámlás természetes, de a kapcsolóüzemű táp ipari zavarforrás. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.1.

### M-79. — Helyes válasz: A
Az interferencia oka sokszor a bemeneti vagy KF erősítők túlvezérlése, ami torzítást és nemkívánatos keverési termékeket (intermodulációt) okoz. A rossz földelés vagy a zajzár hibája más zavartípushoz tartozik. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.2.

### M-80. — Helyes válasz: B
Az egyik végén táplált félhullámú antenna az adó felharmonikusait is jó hatásfokkal kisugározza, ami zavart okozhat. A hatásfoka önmagában nem rossz, és a koaxhoz való illesztés nem a kerülés oka. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.4.1. és sajat/zavaras.md.

## Forgalmi feladatok

### F-1. — Helyes válasz: B
A W betűje a nemzetközi ábécében Whiskey. A Washington a nem hivatalos DX-ábécé szava, a William nincs az ábécében. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1).

### F-2. — Helyes válasz: C
A Z betűje Zulu. A Zebra hasonlóan hangzik, de nem hivatalos, a Zanzibar csak a nem vizsgaanyag DX-ábécében szerepel. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1), sajat/forgalom.md.

### F-3. — Helyes válasz: A
A magyar betűzési ábécében a Q betűje Kvelle. A Kálmán és a Kvartett nem szerepel a táblázatban. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1), kezdo/KEZDO-VIZSGA-ANYAGA.md (13. fejezet).

### F-4. — Helyes válasz: B
A W betűje a magyar ábécében dupla-Vilmos. A Vilmos önmagában nem szerepel a táblázatban (a V betűje Viktor), a Walter nem hivatalos. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1).

### F-5. — Helyes válasz: C
Sopron: Sierra Oscar Papa Romeo Oscar November. Az A válaszban a magyar „Peter” és „Oscar” keveredik (P = Papa), a B válasz „Sugar” és „Ontario” szavai nem hivatalosak. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1).

### F-6. — Helyes válasz: A
Pécs: Péter Elemér Cecil Sándor. A „Pál” és „Emil”, illetve az „Edit”, „Cinka” és „Szilárd” nem szerepel a hivatalos magyar betűzési ábécében. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1).

### F-7. — Helyes válasz: B
Az X betűje a magyar ábécében ikszes (a sajat jegyzet zárójelben xilofont is említ). A Xavér és a Xénia nem hivatalos szavak. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1), sajat/forgalom.md.

### F-8. — Helyes válasz: A
A QRM kérdésben: „Idegen adó zavarja?”. A „Légköri problémái vannak?” a QRN, a „Várjak?” a QRX. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2).

### F-9. — Helyes válasz: C
A QRV kérdésben: „Vételkész?”. A „Ki hív engem?” a QRZ, a frekvenciaváltás kérdése a QSY. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2).

### F-10. — Helyes válasz: B
A QSY kérdésben: „Váltsak másik frekvenciára?”. Az adás beszüntetése a QRT, a lassabb adás a QRS. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2).

### F-11. — Helyes válasz: A
A QRA az állomás neve (kérdésben: Mi az állomás neve?). A QTH az állomás helye, a QRB az állomások közti távolság. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (12. fejezet).

### F-12. — Helyes válasz: C
A QSL kérdésben: „Nyugtázod?”. Az ingadozó jelerősség a QSB, az összeköttetés kérdése a QSO. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (12. fejezet), jegyzet/14_Forgalmi_ismeretek.md (14.1.2).

### F-13. — Helyes válasz: B
A QTC válaszban: „Közleményem van az Ön számára.”. A „Pontos idő…” a QTR, a „pontos frekvencia…” a QRG. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2).

### F-14. — Helyes válasz: A
A QRZ? jelentése: „Ki hív engem?”. A „Mi az állomásod helye?” a QTH, a „Van zavarod?” a QRM kérdés. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2), kezdo/KEZDO-VIZSGA-ANYAGA.md.

### F-15. — Helyes válasz: C
A QRQ kérdésben: „Adhatok gyorsabban?”. A lassabb adás a QRS, a teljesítménynövelés a QRO. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (12. fejezet).

### F-16. — Helyes válasz: B
A 73 szívélyes üdvözletet jelent. Az ölelés és csók a 88, a köszönet a TNX/TKS/TU. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4), kezdo/KEZDO-VIZSGA-ANYAGA.md (11. fejezet).

### F-17. — Helyes válasz: C
A WX időjárást jelent. A feleség az XYL, a munka vége a VA. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.3–14.1.4).

### F-18. — Helyes válasz: A
Az XYL amatőrfeleséget jelent. A női operátor/kisasszony az YL, a régóta engedélyes az OT. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4), kezdo/KEZDO-VIZSGA-ANYAGA.md.

### F-19. — Helyes válasz: B
A HW? jelentése: „Hogy hall engem?”. A HR „itt”, a QTH? pedig az állomás helyére kérdez. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4).

### F-20. — Helyes válasz: C
Az SK az adás (QSO) végét jelzi. A K felszólítás adásra, a CQ pedig mindenkinek szóló általános hívás. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.3–14.1.4), kezdo/KEZDO-VIZSGA-ANYAGA.md.

### F-21. — Helyes válasz: A
Az SWL megfigyelő (rádióhallgató). Az állóhullámarány az SWR (hasonló írásmód, de más fogalom), a vételkészség a QRV. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4), kezdo/KEZDO-VIZSGA-ANYAGA.md.

### F-22. — Helyes válasz: B
Távbeszélő módban a vészjel a MAYDAY, háromszor megismételve. Az SOS a távíró vészjele, a HELP nem nemzetközi vészjel. Forrás: sajat/forgalom.md (vészjelek), diak/12_jogi_es_forgalmi_alapok.md.

### F-23. — Helyes válasz: A
A távíró vészjel az SOS morzejele: három pont, három vonás, három pont. A C válasz fordított sorrend, a B egy másik jelsorozat. Forrás: sajat/forgalom.md, diak/12_jogi_es_forgalmi_alapok.md.

### F-24. — Helyes válasz: C
A vészhelyzet pontos, rövid ismertetése a helyet, a veszélyhelyzetet és a segítségkérést tartalmazza, utána nyugtát kell kérni. A másik két válasz rendes QSO-adatokat sorol, nem vészhelyzeti információt. Forrás: sajat/forgalom.md (vészjelek).

### F-25. — Helyes válasz: B
Fogadó állomásként az üzenetet naplózni és továbbítani kell. A vészhívás mindenkinek szól, a vevő állomás feladata a segítségnyújtás, ezért sem a közömbösség, sem az adás beszüntetése (QRT) nem helyes. Forrás: sajat/forgalom.md (vészjelek).

### F-26. — Helyes válasz: C
Szabály: a rádióamatőr csak más amatőrökkel forgalmazhat, kivéve szükség- és vészhelyzetben, ahol a segítségnyújtással kapcsolatos információt köteles harmadik félnek is továbbítani. Egyéb esetben ez nem megengedett. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.2), kezdo/KEZDO-VIZSGA-ANYAGA.md (16. fejezet).

### F-27. — Helyes válasz: A
Az OK Csehország prefixe. Az OM Szlovákiáé, az SP Lengyelországé. Forrás: sajat/forgalom.md, kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet).

### F-28. — Helyes válasz: B
Horvátország prefixe 9A. A HR és a CR nem horvát prefix. Forrás: sajat/forgalom.md, kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet).

### F-29. — Helyes válasz: C
Németország prefixe többek között a DL (a DA–DD, DF–DH, DJ–DL, DP tartományokban). A DE a „-tól” rövidítés is, a GE pedig „jó estét”, nem prefix. Forrás: sajat/forgalom.md, kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet).

### F-30. — Helyes válasz: A
A magyar hívójel HA vagy HG kezdetű, utána számjegy, az utolsó karakter mindig betű. A HA5KD1 számjegyre végződik, a HAK5DR-ben a számjegy rossz helyen áll. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet), diak/12_jogi_es_forgalmi_alapok.md.

### F-31. — Helyes válasz: C
A versenyállomás különleges hívójele 4 karakteres, pl. HG5A. A HA5UDS egyéni hívójel, a HA200CVM alkalmi állomás hívójele. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet), sajat/forgalom.md.

### F-32. — Helyes válasz: B
Az alkalmi rádióállomás hívójele valamilyen esemény alkalmából kiadott, hosszabb hívójel (példa: HA200CVM, Csokonai-évforduló). A versenyállomás hívójele 4 karakteres, a jeladó nem ilyen hívójelet használ. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet).

### F-33. — Helyes válasz: A
A /AM légi mozgó állomást jelent (repülőgép, helikopter). A /MM tengeri mozgó, a /P kitelepült állomás. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet), sajat/forgalom.md.

### F-34. — Helyes válasz: C
A rádiós tájfutó amatőrállomás hívójele csak MO, MOE, MOI, MOS, MOH vagy MO5 lehet; a MOK nincs közöttük. A MOE és az MO5 megengedett. Forrás: sajat/forgalom.md (különleges állomások hívójelei).

### F-35. — Helyes válasz: B
A JN97MM Maidenhead (QTH) lokátor. A HG5RVB hívójel (átjátszó), az RV48 átjátszócsatorna-jelölés. Forrás: sajat/forgalom.md, jegyzet/14_Forgalmi_ismeretek.md (14.2.4, 14.3.1.3).

### F-36. — Helyes válasz: A
A naplóba az összeköttetés kezdetének ideje UTC szerint kerül. A helyi idő nem megfelelő, az ellenállomásé sem. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (17. fejezet), sajat/forgalom.md.

### F-37. — Helyes válasz: B
Nyáron Magyarországon az UTC+2 az érvényes, így 15:00 helyi idő = 13:00 UTC (télen UTC+1). A 14:00 a téli, a 16:00 fordított irányú számítás. Forrás: sajat/forgalom.md (idő megadása).

### F-38. — Helyes válasz: C
Kötelező: dátum, kezdés ideje (UTC), ellenállomás hívójele, frekvencia és adásmód, minőségi jellemzők (RST). Az antenna típusa nem kötelező adat. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (17. fejezet), sajat/forgalom.md.

### F-39. — Helyes válasz: A
A naplót az utolsó bejegyzéstől számított legalább 1 évig kell megőrizni. Az 5 év az engedély érvényességi ideje, nem a napló megőrzése. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (17. fejezet), diak/12_jogi_es_forgalmi_alapok.md.

### F-40. — Helyes válasz: C
Átjátszó használatakor elegendő a forgalmazás tényét, kezdetét és végét feljegyezni. Nem igaz, hogy nincs naplózás, és nem kell minden összeköttetés adata. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (17. fejezet), sajat/forgalom.md.

### F-41. — Helyes válasz: B
Az IARU sávterv ajánlás, a nemzeti előírások felülírhatják, eltérhetnek tőle. Így nem kötelező a sávterv, és a nemzeti előírás sem választható szabadon. Forrás: sajat/forgalom.md (sávtervek), kezdo/KEZDO-VIZSGA-ANYAGA.md (9. fejezet).

### F-42. — Helyes válasz: A
A 2 m-es sáv 144–146 MHz. A 430–440 MHz a 70 cm-es, az 1240–1300 MHz a 23 cm-es sáv. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (9. fejezet, kezdők sávjai).

### F-43. — Helyes válasz: C
A 20 m-es sáv 14000–14250 kHz. A 3500–3800 kHz a 80 m-es, a 7050–7200 kHz a 40 m-es sáv. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (9. fejezet).

### F-44. — Helyes válasz: B
A 14300 kHz a vészhelyzeti hívó frekvencia aktivitásközpontja. A 14230 kHz az SSTV, a 14060 kHz a CW QRP aktivitásközpontja. Forrás: jegyzet/16_Mellekletek.md (16.2).

### F-45. — Helyes válasz: A
10 MHz alatt SSB-n LSB-t használunk, felette USB-t, így a 7 MHz-es sávban LSB. A DSB nem az SSB megoldása. Forrás: sajat/forgalom.md (hasznos tudnivalók).

### F-46. — Helyes válasz: B
A 14099–14101 kHz az IBP (nemzetközi jeladó projekt) kizárólag jeladók részére. A DX expedíciók a 14125–14300 kHz között élveznek elsőbbséget, az SSTV aktivitásközpont 14230 kHz. Forrás: jegyzet/16_Mellekletek.md (16.2).

### F-47. — Helyes válasz: C
A CEPT T/R 61-01 szerint a CEPT fokozatú engedéllyel rendelkező amatőr átmenetileg más CEPT tagországban is üzemeltethet a hazai engedélye alapján, külön engedély nélkül. Szabályozás/forrás: diak/12_jogi_es_forgalmi_alapok.md (CEPT szabályozás).

### F-48. — Helyes válasz: A
CW általános hívás: „CQ CQ CQ DE hívójel…”, a végén PSE K. Az AR SK a QSO végét jelzi, a QRT az adás beszüntetése. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.3.2.1), sajat/forgalom.md (minta QSO).

### F-49. — Helyes válasz: B
Átjátszón az R skálával (csak olvashatóság) minősítünk. Az RST a távíró, az RS a fónia (FM, SSB) üzemmód skálája. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.5), diak/12_jogi_es_forgalmi_alapok.md.

### F-50. — Helyes válasz: C
Az RST második számjegye az S, a jelerősség (1–9). Az olvashatóság az első (R, 1–5), a hangszín a harmadik (T). Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (14. fejezet), jegyzet/14_Forgalmi_ismeretek.md (14.2.5).

### F-51. — Helyes válasz: A
A hívójelet minden összeköttetés kezdetén és végén, a forgalmazás során legalább három adásvételi periódus után (kísérletnél legalább 10 percenként) kell közölni. A másik két válasz ennél ritkább. Szabályozás/forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.3), kezdo/KEZDO-VIZSGA-ANYAGA.md (16. fejezet).

### F-52. — Helyes válasz: C
Alapszabály: annak van elsőbbsége, aki a frekvenciát már használja, kivéve vészhelyzetben. A teljesítmény vagy a CQ időpontja nem ad elsőbbséget. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.3).

### F-53. — Helyes válasz: B
Átjátszón a periódusok között 1–2 másodperc szünetet kell tartani, hosszú periódusok nem megengedettek, általános hívás nem kezdeményezhető. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.4), diak/12_jogi_es_forgalmi_alapok.md.

### F-54. — Helyes válasz: A
Az AX.25 az OSI-modell 2., adatkapcsolati rétegének feladatait látja el: hibamentes átvitel, kapcsolat felépítése és lebontása. Az 1. a fizikai, a 7. az alkalmazási réteg. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.1.1).

### F-55. — Helyes válasz: C
Az APRS (Automatic Packet Reporting System) GPS-szel mért pozíciók térképi megjelenítésére szolgál, emellett üzenet- és időjárás-adatot is továbbít. Az állókép az SSTV, az internetes telefónia az EchoLink. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.2).

### F-56. — Helyes válasz: A
A Baudot-kód 5 bit hosszú. A 7 és 8 bites kódok nem az RTTY kódrendszerei. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.5).

### F-57. — Helyes válasz: B
Az SSTV állóképeket továbbít, kis sávszélességgel, ezért rövidhullámon is használható. A mozgókép és hang az ATV, a pozíció az APRS. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.6–15.7).

### F-58. — Helyes válasz: C
Az ATV nagy sávszélességet igényel, ezért csak 420 MHz felett használható, ahol ez belefér az amatőrsávba. Nem csak AM-ben működik (Európában jellemzően FM, PAL képnorma), és a rövidhullámot nem is használja. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.7).

### F-59. — Helyes válasz: A
Az EchoLink VoIP (Voice over IP) alapú rendszer, amelybe szimplex és átjátszó rádióállomások is bekapcsolhatók. Az AX.25 NODE-ok a csomagrádióhoz, a géptávíró az RTTY-hez tartoznak. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.3).

### F-60. — Helyes válasz: B
A DMR digitális hangátviteli üzemmód, ilyen átjátszók szerepelnek a 70 cm-es digitális átjátszók listáján (a D-Star és a C4FM mellett). Az SSTV képátvitel, az RTTY géptávíró, nem hangüzemmód. Forrás: jegyzet/16_Mellekletek.md (16.5), jegyzet/15_Digitalis_uzemmodok.md.

## Biztonságtechnikai feladatok

### B-1. — Helyes válasz: C
Az elengedési áram az az áramerősség, amelynél a fájdalmas izomgörcs miatt a sérült már nem tud egyedül kiszabadulni (50–60 Hz-en kb. 15 mA). Az A) az érzetküszöböt (kb. 1 mA) írja le, a B) pedig a biztosíték működésére vonatkozik, nem az emberi szervezetre. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.1.

### B-2. — Helyes válasz: A
A legveszélyesebb az a fej és a bal láb között áthaladó áramút, mert életfontosságú szerveken (szív, agy) halad át. A B) kisebb veszélyt jelent, mert az áram nem megy át életfontosságú szerven; a C) téves, mert az áram útja nagymértékben befolyásolja a baleset súlyosságát. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.1.

### B-3. — Helyes válasz: B
A II. érintésvédelmi osztályú készüléknek az üzemi szigetelésen kívül kettős vagy megerősített szigetelése is van (ilyen készüléket nem szabad leföldelni). Az A) az I. osztály, a C) a III. osztály meghatározása. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.3.2.1 és 13.3.2.2.

### B-4. — Helyes válasz: A
A védővezető általában nem vezet áramot, a feladata testzárlat esetén kezdődik: a védelem működéséhez szükséges áramot vezeti, ezért folytonossága és kifogástalan állapota létfontosságú. A B) az üzemi áramot vezető nullavezetőre igaz, a C) a villámvédelmi levezetőre, amely külön rendszer, és nem azonos a védővezetővel. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.3.1 és 13.4.

### B-5. — Helyes válasz: C
Lassú kiolvadású biztosítót olyan berendezéseknél használnak, amelyek bekapcsoláskor rövid ideig nagy áramot vesznek fel, majd áramfelvételük lényegesen csökken. Az A) és a B) a gyors (F, FF) biztosítók jellemzője, mert ugyanakkora túláramnál ezek olvadnak ki hamarabb. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.5.

### B-6. — Helyes válasz: B
Először a teljes készüléket feszültségmentesíteni kell, majd a hibás biztosítót azonos típusú és értékű újra kell cserélni. Nagyobb értékű biztosító (A) vagy áthidalás (C) esetén a biztosító nem védi a készüléket, ami tűz- és balesetveszélyes. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.5.

### B-7. — Helyes válasz: C
A feltöltött kondenzátor kapcsain a hálózatról való lekapcsolás után is mérhető feszültség maradhat, tehát a feszültségmentesített berendezés is okozhat áramütést. Az A) téves ezért; a B) is téves, mert a kondenzátor a felvett töltést megtartja, és éppen ezért ütést okozhat. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.8.

### B-8. — Helyes válasz: A
Zivatar közeledtekor a forgalmazást be kell fejezni, az antennát le kell földelni, a levezető kábelt pedig el kell távolítani a készülékből (célszerű a készüléket a hálózatról is leválasztani). A B) és a C) a készüléket és a kezelőt is veszélyezteti, mert a villám a levezető kábelen át a lakótérbe juthat. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.11.

### B-9. — Helyes válasz: B
A villámvédelmi hálózat földelését nem szabad érintésvédelmi földelésre felhasználni. Ezért az A) és a C) helytelen, a gazdaságosság vagy az árboc speciális helyzete nem ad kivételt. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.11.

### B-10. — Helyes válasz: C
Ha a közelben villám csap le, a földben a becsapódási ponttól távolodva a feszültség rohamosan csökken, ezért egyetlen lépéssel is életveszélyes feszültségkülönbséget hidalhatunk át (lépésfeszültség). Az A) a testzárlatra, a B) a kondenzátor feltöltésére utal, egyik sem a lépésfeszültség. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.11.

### B-11. — Helyes válasz: A
Ilyen kis feszültségen az áramütés veszélye nem áll fent, viszont a kis belső ellenállás miatt rövidzárlatkor nagy áram folyhat, ami elektromos ívet, melegedést, szélsőséges esetben tüzet okozhat. A B) ezért téves; a C) nem akkumulátoros táplálásra jellemző veszély. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.6.

### B-12. — Helyes válasz: B
Egyfázisú rendszernél a védővezető szigetelése zöld-sárga. A világoskék a nullavezető, a fekete a fázisvezető színe. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.3.1 (vezeték színjelölés).

### B-13. — Helyes válasz: A
100 kHz feletti nagyfrekvenciás áram már nem vált ki izom- és idegingert, csupán hőhatást; a szkinhatás miatt a test felületére szorul, és ott égési sérülést okozhat. A B) téves, mert az elengedési áram a frekvencia növekedésével nő (5 kHz-nél kb. háromszorosára), nem csökken; a C) téves az égési sérülés lehetősége miatt. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.1.

### B-14. — Helyes válasz: C
Az antennaárbocot mindig le kell földelni, a jó földelés a vihar alatti antenna-leföldeléshez is szükséges. Az A) és a B) ezzel ellentétes, a koaxiális kábel használata nem pótolja az árboc földelését. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.4 és 13.11.

### B-15. — Helyes válasz: B
A balesetest bármennyire is panaszmentes, minden esetben orvosi felügyelet alá kell helyezni, aki dönt a szükséges teendőkről. Az A) és a C) téves, mert a szabály szerint a látható sérülés vagy a panasz hiánya nem mentesít az orvosi felügyelet alól. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.2.

## Jogismereti feladatok

### J-1. — Helyes válasz: B
A 15/2013. (IX. 25.) NMHH rendelet szerint önállóan az forgalmazhat, aki amatőr engedéllyel rendelkezik. A vizsgabizonyítvány önmagában nem elég (az A) téves), az életkor pedig nem feltétele a forgalmazásnak (C). Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 3. § (2).

### J-2. — Helyes válasz: C
A 15/2013. (IX. 25.) NMHH rendelet szerint az engedéllyel nem, de vizsgabizonyítvánnyal rendelkező személy közösségi amatőrállomáson, CEPT fokozatú engedéllyel rendelkező személy felügyelete mellett forgalmazhat. Az A) azért téves, mert önállóan engedély nélkül nem forgalmazhat; a B) azért, mert a közösségi állomás lehetősége létezik. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 3. § (3).

### J-3. — Helyes válasz: A
A 15/2013. (IX. 25.) NMHH rendelet szerint a vizsgára készülő személy CEPT fokozatú engedéllyel rendelkező oktató közvetlen irányítása mellett, az oktató vagy a közösségi amatőrállomás hívójelét használva, tanulási céllal forgalmazhat. A B) téves, mert saját vagy tetszőleges hívójelet nem használhat; a C) téves, mert a tanulási célú forgalmazás megengedett. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 3. § (4).

### J-4. — Helyes válasz: B
A 15/2013. (IX. 25.) NMHH rendelet szerint a jeladó állomás általában folyamatos működésű, felügyelet nélküli, és meghatározott időnként azonosító információt, a köztes időszakban modulálatlan vivőt sugároz. Az A) az átjátszó állomás, a C) a kapuállomás meghatározása. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 4. § (4) a), b), d).

### J-5. — Helyes válasz: A
A 15/2013. (IX. 25.) NMHH rendelet szerint az egyéni amatőr engedély érvényességi ideje 5 év. A 10 év (B) a megszűnt engedély hívójelének újrakiadására vonatkozó várakozási idő, a 2 év (C) nem szerepel a rendeletben. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 11. § (2); 12. § (11).

### J-6. — Helyes válasz: C
A 15/2013. (IX. 25.) NMHH rendelet szerint az engedélyes az engedély meghosszabbítását írásban, az engedély lejárta előtt legfeljebb 60 nappal kérheti. Az A) (lejárat után) és a B) („legalább 60 nappal”, korlátozva a korai kérést) ennek ellentmond. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 11. § (6).

### J-7. — Helyes válasz: A
A 15/2013. (IX. 25.) NMHH rendelet szerint az engedélyes vagy az állomás adatainak (az engedély tartalmának, pl. lakcím) megváltozása esetén harminc napon belül kérni kell az engedély módosítását. A B) és a C) téves; a bejelentés elmulasztása akár az engedély visszavonásához is vezethet. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 10. § (1) b), (3); 20. § (1).

### J-8. — Helyes válasz: C
A 15/2013. (IX. 25.) NMHH rendelet szerint a hívójel/AM légi mozgó amatőrállomást jelöl. A kitelepült állomás jele a /P (A), a belvízi vagy tengeri mozgó állomásé a /MM (B). Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 13. § (1).

### J-9. — Helyes válasz: B
A 15/2013. (IX. 25.) NMHH rendelet szerint a hívójelet minden összeköttetés kezdetekor és befejezésekor, a forgalmazás során legalább három adásvételi periódus után, kísérleteknél legalább 10 percenként, továbbá másik rádióamatőr vagy a hatóság kérésére kell közölni. Az A) és a C) ennél kevesebbet vagy más szabályt ír elő. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 15. § (2).

### J-10. — Helyes válasz: A
A 15/2013. (IX. 25.) NMHH rendelet szerint forgalmazás során tilos az információrejtő módszer alkalmazása (a tartalom elrejtése, pl. titkosítás). A forgalmi rövidítések és kódok közérthető nyelvnek számítanak (B), a kísérletek és a továbbképzés pedig megengedett témák (C). Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 15. § (4), (5), (6) e).

### J-11. — Helyes válasz: C
A 15/2013. (IX. 25.) NMHH rendelet szerint hívójelben az SOS betűkombináció nem adható ki (vészjellel való összetéveszthetőség miatt). A HA és a HG a magyar hívójelek érvényes kezdőbetűi, tehát azok használata megengedett. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 12. § (6), (8).

### J-12. — Helyes válasz: B
A 15/2013. (IX. 25.) NMHH rendelet szerint rádióamatőrök csak egymás között forgalmazhatnak; kivétel a szükség- és vészhelyzet, amikor a segítségnyújtással kapcsolatos információkat harmadik félnek is köteles továbbítani. Az A) az ország szerinti megkötéssel, a C) a közérthető nyelvre való hivatkozással tévesen tágítja vagy szűkíti a szabályt. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 15. § (3), (4).

### J-13. — Helyes válasz: A
A 15/2013. (IX. 25.) NMHH rendelet szerint a forgalmi naplót az utolsó bejegyzéstől számított legalább 1 évig kell megőrizni. A B) és a C) más időtartamot állít, ami nem szerepel a rendeletben. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 17. § (1).

### J-14. — Helyes válasz: C
A 15/2013. (IX. 25.) NMHH rendelet szerint forgalmazás közben törekedni kell arra, hogy a kisugárzott teljesítmény és a sávszélesség ne lépje túl az összeköttetés biztonságos fenntartásához szükséges értéket. Az A) és a B) a szükségesnél nagyobb teljesítményt írna elő. A konkrét teljesítményhatárokat nem ez a rendelet, hanem a nemzeti frekvenciafelosztási szabályozás (NFFF) tartalmazza. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 18. § (2); 8. § (8).

### J-15. — Helyes válasz: B
A 15/2013. (IX. 25.) NMHH rendelet szerint az adó és adóvevő beállítási, javítási és mérési feladatait az antennakimenet műantennával történő lezárása mellett kell végezni. Az A) szerinti kisugárzás zavarhatja másokat; a C) kötelezettséget a rendelet nem tartalmaz. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 18. § (4).

### J-16. — Helyes válasz: A
A 15/2013. (IX. 25.) NMHH rendelet szerint zavarokozás esetén a hatóság jogosult az állomás sugárzási paramétereit és üzemidejét korlátozni. A B) (elkobzás) nem szerepel a rendeletben, a C) pedig ellentmond a korlátozási jogosultságnak. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 18. § (5).

### J-17. — Helyes válasz: C
A 15/2013. (IX. 25.) NMHH rendelet szerint az egyéni nem különleges amatőrállomás telepítési helyének hatvan napon túli megváltoztatását előzetesen be kell jelenteni a hatóságnak. Az A) téves, mert az engedély országos érvényessége nem mentesít a bejelentés alól; a B) téves, mert a bejelentést előzetesen kell megtenni. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 10. § (5); 11. § (1).

### J-18. — Helyes válasz: B
A másodlagos állomás köteles tűrni az elsődleges jogállású állomástól származó zavartatást, de ő nem okozhat zavart az elsődleges szolgálatnak. Az A) az elsődleges jogállás jellemzője (az ott működő szolgálat élvez elsőbbséget), a C) üzemmódra vonatkozó megkötés, amely a szolgálati kategóriához nem tartozik. A 15/2013. (IX. 25.) NMHH rendelet szerint az amatőr engedély fokozata alapján használható sávokat és adásjellemzőket az NFFF tartalmazza. Forrás: jegyzet/01_Radioamator_alapismeretek.md, 1.3.4; sajat/jogi-targykor.md (3/1 7/5); jogi/15_2013_IX_25_NMHH_rendelet.md, 8. § (8).

### J-19. — Helyes válasz: C
A kibocsátás-megjelölés szerint a J3E az egyoldalsávos (SSB) analóg hang. Az F3E az FM analóg hang, az A1A a távíró (morze). A jelölések az ITU szabályozás szerinti adásmód-jelölések; a 15/2013. (IX. 25.) NMHH rendelet az adásjellemzőket az NFFF-re bízza (8. § (8)). Forrás: sajat/jogi-targykor.md (3/1 7/7); jogi/15_2013_IX_25_NMHH_rendelet.md, 1. melléklet 4.2 (J3E, F3E, A1A).

### J-20. — Helyes válasz: A
A CEPT T/R 61-01 ajánlás szerint a CEPT engedélyes legfeljebb 3 hónapig, saját érvényes nemzeti engedélyével és személyazonosságot igazoló igazolvánnyal, a helyi szabályokat betartva forgalmazhat; a hívójele elé a meglátogatott ország előtagját kell tennie törtvonallal. A B) időkorlátot és előtagot elhagy, a C) előzetes engedélyt követel, ami az ajánlás lényegével ellentétes. A 15/2013. (IX. 25.) NMHH rendelet szerint (13. § (2)) Magyarországon a külföldi CEPT engedélyes a saját hívójele elé a HA betűpárt teszi. Forrás: sajat/jogi-targykor.md (3/2 1/1); jegyzet/01_Radioamator_alapismeretek.md, 1.3.5; jogi/15_2013_IX_25_NMHH_rendelet.md, 13. § (2).
