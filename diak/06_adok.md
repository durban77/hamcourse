---
marp: true
title: Adók (HAREC)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Adók

## HAREC fokozat

---

# Adók típusai

- **frekvenciaáttevéses (keveréses):** egy vezéroszcillátor (VFO) közös az adó és a vevő számára — ma jellemző megoldás
- **frekvenciasokszorozásos:** a kimeneti frekvenciát az oszcillátor jelének sokszorozásával állítják elő — ma már csak régi FM adóknál

---

# CW adó

- KF frekvencián rezgő oszcillátor tápfeszültségét billentyűzik, vagy a folyamatosan működő oszcillátor kimenetét billentyűzik
- a folyamatosan üzemelő változatnál a jel sosem csillapítható teljesen (maradék kisugárzás)
- felépítés: oszcillátor → keverő → szűrő → meghajtó → teljesítményerősítő

---

# SSB adó

- a kisugárzott jel spektrumát pontosan be kell tartani (nem lehet szélesebb/keskenyebb az előírtnál)
- megvalósítás: meredek átvitelű SSB (kristály)szűrővel, vagy (régebben) fázistolós modulátorral
- adó-vevőben ugyanazt a szűrőt használják vételi szelektivitásra és adási sávkorlátozásra is

---

# SSB modulátor felépítése

- kvarcoszcillátor + DSB modulátor + SSB szűrő
- a kvarcoszcillátor nem a vivőfrekvencián, hanem attól ±1,5 kHz-re rezeg (USB/LSB szerint)
- a szűrő kiszűri a vivőt és a nem kívánt oldalsávot
- USB/LSB váltás: nem a szűrőt hangolják át, hanem az oszcillátor frekvenciáját

---

# FM adó

- **frekvenciatöbbszörözős FM adó:** kvarc alatt varicap dióda hangolja el kicsit a kvarcot a moduláló jel ütemében
- a frekvenciasokszorozó felszorozza a löketet is az üzemi frekvenciára
- alternatíva: **fázismodulátor** (FET-es RC tag, a moduláló jel hatására változó ellenállással)

---

# Elválasztó és meghajtó fokozat

- **elválasztó fokozat:** megvédi az érzékeny oszcillátort a következő fokozat terhelésétől (jellemzően emitterkövető)
- **meghajtó fokozat:** a végfokozatnak biztosítja a szükséges bemenő teljesítményt (pl. 10-20 mW → 0,5-2 W)

---

# Frekvenciasokszorozó

- az oszcillátor jelét nemlineáris elemre vezetve felharmonikusokban gazdag jelet kapunk
- a kívánt felharmonikust kiszűrik
- egy fokozat kb. 4-5×-ös szorzásra képes, több fokozat láncba kapcsolható
- FM-nél a modulált jel frekvencialökete is a szorzás mértékével nő

---

# Teljesítményerősítő (végfokozat)

- a kívánt kimenő RF teljesítményt szolgáltatja
- SSB-nél AB osztály (linearitás), CW/FM-nél C osztály is lehet (jobb hatásfok)
- kis teljesítménynél tranzisztor/FET, nagy teljesítménynél elektroncső
- 2 W felett hűtés (hűtőborda, ventilátor) szükséges

---

# Kimeneti szűrő és illesztés

- a B/C osztályú végfokozat kimenete felharmonikusokat is tartalmaz — ezeket ki kell szűrni
- megvalósítás: Collins-kör (Pí-szűrő), megfelelő átütési szilárdságú alkatrészekkel
- a kimeneti illesztés biztosítja a maximális teljesítményátvitelt az antenna felé

---

# Frekvenciastabilitás és sávszélesség

- a frekvenciastabilitás megegyezik a vezéroszcillátor (VFO/kvarc/PLL) stabilitásával
- a kisugárzott RF sávszélességet a modulátor és az SSB/FM szűrők határozzák meg
- túl széles sáv → zavarás; túl szűk sáv → romló hangminőség/vehetőség

---

# Kimenő teljesítmény és hatásfok

- kimenő teljesítmény: a végfokozattól függ, wattban mérjük
- hatásfok: $\eta = P_{ki}/P_{be}$ — osztálytól függően 50-85%
- oldalsávok aránya (SSB elnyomott oldalsáv/vivő) dB-ben adott
- **kimeneti impedancia:** a kimeneti illesztésnek ehhez kell igazodnia (jellemzően 50 Ω)
- **hangfrekvenciás tartomány:** a modulálható audiosáv szélessége (fónia üzemmódnál kb. 300-3000 Hz)
- **modulációs index:** FM-nél a löket és a moduláló frekvencia hányadosa — a kisugárzott sávszélességet befolyásolja

---

# Torzítási jelenségek adóknál

- **CW billentyűzési kattogás, csipogás:** túl gyors be/kikapcsolás széles spektrumot, "kattogást" okoz — lágyítás (alakformálás) szükséges
- **SSB túlvezérlés és fröcskölés (splattering):** a moduláció túlvezérlése a szomszédos csatornákra is kisugároz zavart

---

# Nemkívánatos kisugárzások

- **zavaró nagyfrekvenciás kisugárzások:** felharmonikusok, intermodulációs termékek a keverőkből, áthallások
- **készüléksugárzások:** a berendezés belső oszcillátorainak/digitális áramköreinek szórt sugárzása
- csökkentés: megfelelő kimeneti szűrés, árnyékolás, helyes beállítás

---

# Fáziszaj

- a vezéroszcillátor jelének frekvencia körüli "elmosódása"
- rontja a kisugárzott jel spektrális tisztaságát, zavarhatja a szomszédos csatornákat
- csökkentése: jó minőségű kvarc referencia, alacsony zajú PLL tervezés

---

# Adókészülék kezelőszervei

- **PTT:** fónia adásba kapcsolás
- **KEY:** morzebillentyű CW üzemmódban
- **PWR control:** kimenő teljesítmény állítása
- **MIC GAIN / RF GAIN:** fokozatok erősítésének állítása
- **VOX:** modulációvezérelt adáskapcsolás
- **TUNE:** az adó köreinek hangolása a maximális kisugárzott teljesítményhez

---

# Összefoglalás

- adó felépítése: oszcillátor → (keverő/sokszorozó) → meghajtó → teljesítményerősítő → kimeneti szűrő
- SSB: szűrős módszer, kvarc ±1,5 kHz eltolással
- FM: varicapos elhangolás + frekvenciasokszorozás, vagy fázismoduláció
- fontos jellemzők: stabilitás, sávszélesség, teljesítmény, hatásfok, spektrális tisztaság
