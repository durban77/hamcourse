# Gyakorló feladatlap 05 – helyes válaszok és magyarázatok

A kérdések: [gyakorlo_kerdesek_05.md](gyakorlo_kerdesek_05.md).

> A jogi és forgalmi szabályok változhatnak: a vizsga előtt ellenőrizd az aktuális hatályos szöveget.

## Műszaki feladatok

### M-1. — Helyes válasz: C
Párhuzamos kapcsolásnál 1/Re = 1/30 + 1/60 + 1/60 = 2/60 + 1/60 + 1/60 = 4/60, tehát Re = 15 Ω. A 150 Ω a soros eredő, az 50 Ω a számtani közép; párhuzamosan az eredő mindig kisebb a legkisebb tagnál. Forrás: jegyzet/04_Alkatreszek.md, 4.1.4.2.

### M-2. — Helyes válasz: B
A feszültségek aránya a menetszámok arányával egyezik meg: N2 = N1 · U2 / U1 = 2300 · 15 / 230 = 150 menet (10 menet/volt). Az 1500 és a 15 menet tízszeres nagyságrendi elszámolásból adódik. Forrás: jegyzet/04_Alkatreszek.md, 4.4.1.

### M-3. — Helyes válasz: B
Az abszolút szint 1 mW-hoz viszonyít: s = 10 · lg(100 mW / 1 mW) = 10 · lg 100 = 20 dBm. A 40 dBm a feszültségerősítés 20 · lg képletének hibás használatából, a 100 dBm pedig az arány puszta kiírásából adódik. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.4.2.

### M-4. — Helyes válasz: C
A rövidzárlati áram a forrásfeszültség és a belső ellenállás hányadosa: 9 V / 1,5 Ω = 6 A. A 13,5 A a szorzat (U · Ri), a 0,17 A a fordított hányados (Ri / U). A gyakorlatban a rövidzárlat tilos, mert az áramforrás tönkremegy. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.2.1.

### M-5. — Helyes válasz: A
A statikus elektromos tér a töltésekhez kötött, és önmagában csak akkor létezik, ha időben nem változik. Időben változó tér mágneses teret is kelt, ez az elektromágneses hullámok alapja. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.1.2.

### M-6. — Helyes válasz: C
A generátorok mechanikai energiát alakítanak villamos energiává. A galvánelem és az akkumulátor vegyi energiát, a hőelem hőenergiát (a fényelem fényenergiát) alakít át. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.1.4.

### M-7. — Helyes válasz: C
A tízes hatványszorzók: mega = 10^6, giga = 10^9, tera = 10^12. Így 1 GHz = 1000 MHz. Forrás: jegyzet/02_Matematikai_es_fizikai_alapok.md, 2.1.3.

### M-8. — Helyes válasz: A
Négy gyűrű esetén az első kettő az érték számjegye, a harmadik a szorzó, a negyedik a tűrés. Öt gyűrűnél már három gyűrű adja a számszerű értéket (értéksáv). Forrás: jegyzet/04_Alkatreszek.md, 4.1.3.

### M-9. — Helyes válasz: B
A bipoláris tranzisztor középső rétege, a bázis jóval vékonyabb, mint a két külső réteg (a kollektor és az emitter). Emiatt a bázisáram nagyon kicsi a kollektoráramhoz képest. Forrás: jegyzet/04_Alkatreszek.md, 4.5.10.

### M-10. — Helyes válasz: A
AM-nél a modulációs mélység 0 és 100 % között lehet; 100 % fölött a burkoló átlép a nulla tengelyen, a jel túlvezérelt lesz és torzul. A sávszélesség független ettől (B = 2 · fm), az FM pedig más modulációs eljárás. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.1.1.

### M-11. — Helyes válasz: C
Mindkettőnél a quad (négy állapotú) jelátvitel az alap, de QPSK-ban a két, egymáshoz képest 90°-ra álló szinuszjel fázisát, QAM-ban az amplitúdóját változtatják. A frekvencia billentyűzése az FSK sajátja. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.5.3.–5.2.5.4.

### M-12. — Helyes válasz: A
A visszacsatolás nélküli Zener-stabilizátor kimenete a Zener-diódán eső feszültség, a terhelhetősége pedig Itmax = Izmax – Izmin. A kimenet nem függ a bemenet felétől, és nem a különbségből adódik. Forrás: jegyzet/06_Aramkorok.md, 6.3.2.1.

### M-13. — Helyes válasz: B
A kvarcoszcillátorok stabilak, de kimenő frekvenciájuk általában nem éri el a 100 MHz-et; a PLL a kvarcreferencia stabilitását viszi át a magasabb frekvenciákra az osztásarány révén. A PLL teljesítményt nem erősít, és referenciajelre mindenképp szüksége van. Forrás: jegyzet/06_Aramkorok.md, 6.5.4.

### M-14. — Helyes válasz: B
A hatásos felület AH = Pv/S1, ebből Pv = AH · S1 = 3 · 0,2 = 0,6 mW. A 0,067 mW az S1/AH osztás eredménye, a 6 mW pedig tízszeres elírás. A hatásos felület nem azonos a geometriai felülettel. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1.7.

### M-15. — Helyes válasz: B
Nagy ellenállásnál a feszültségmérő árama összemérhető az ellenálláson folyó árammal, ezért az árammérő a feszültségmérő áramát is mérné. Ezt elkerülendő az árammérőt közvetlenül sorba kötjük az ellenállással, a feszültségmérőt pedig a táplálásra tesszük (kis ellenállásnál fordítva). A műszerek belső ellenállása mindig hibát okoz. Forrás: jegyzet/11_Meresek.md, 11.4.2.1.

### M-16. — Helyes válasz: A
A Yagi-antennák nyeresége a gerinchossz és az elemszám növelésével nő, nyílásszögük pedig csökken (a sugárnyaláb élesebb lesz). A nyílásszög nem nő és nem marad változatlan. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.4.1.

### M-17. — Helyes válasz: C
144 MHz / 8 MHz = 18. Mivel egy sokszorozó fokozat legfeljebb 4–5-szörös szorzásra képes, ezt több fokozat adja. A 9-szeres 16 MHz-es, a 36-szoros 4 MHz-es kvarchoz tartozna. Forrás: jegyzet/08_Adok.md, 8.2.3 és 8.3.3.

### M-18. — Helyes válasz: C
A tananyag szerint szűréssel és csatolásmentesítéssel kell megakadályozni, hogy a nagyfrekvenciás jelünk a villamos (vagy telefon) hálózatba jusson. A teljesítmény növelése a zavart csak fokozná, a villamos hálózat védővezetője és a vízhálózat pedig nem alkalmas jó RF földelésnek. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.4.1.

### M-19. — Helyes válasz: A
A D réteg a legkevésbé ionizált, ionkoncentrációját a nitrogén-oxid fotó-ionizációja és a meteortevékenység adja. Az E és az F rétegek magasabbak, az F réteg a rövidhullámú nagy távolságú összeköttetések szempontjából alapvető. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.5.2.

### M-20. — Helyes válasz: A
Ha a terhelés nem ismert, a feszültséget és az áramot is meg kell mérni: P = U · I = 12 · 0,25 = 3 W. A 48 W az U/I hányados, a 0,02 W az I/U – egyik sem teljesítmény. Forrás: jegyzet/11_Meresek.md, 11.4.3.1.

### M-21. — Helyes válasz: C
Az S9 és az S7 között két S-érték, azaz 12 dB van; 6 dB feszültségben kb. kétszeres arány, 12 dB négyszeres, így 50 µV / 4 ≈ 12,5 µV. A 25 µV csak az S8, a 38,9 µV pedig az S-értékek lineáris (50·7/9) arányosítása, ami hibás, mert az S-skála logaritmikus. Forrás: jegyzet/07_Vevok.md, 7.5.7.

### M-22. — Helyes válasz: C
Az antennahangoló az adóvevő felé fix 50 Ω-os terhelést biztosít, de kizárólag az illesztést végzi, az antenna rezonanciafrekvenciáját nem befolyásolja. A hangoló utáni szakaszon a reflektált teljesítmény megmarad, ezért ott veszteséggel kell számolni. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.8 és 9.6.8.1.

### M-23. — Helyes válasz: A
A fading a térerősség rövid idejű megváltozása; akkor számolunk vele, ha a közepes térerősség a felére csökken. A térerősség növekedése vagy a jel tartós megszűnése nem ennek a meghatározásnak felel meg. Forrás: jegyzet/10_Hullamterjedes.md, 10.2.

### M-24. — Helyes válasz: B
A VOX a moduláció által vezérelt adás-vétel kapcsolás: a PTT megnyomása nélkül, a hang hatására kapcsol adásra, és állítható az érzékenysége is. A teljesítményt a PWR, az adó hangolását a TUNE szabályozza. Forrás: jegyzet/08_Adok.md, 8.5.

### M-25. — Helyes válasz: B
Soros kapcsolásban az ellenállásokon eső feszültségek aránya az ellenállások arányával egyezik meg; ha a két feszültség azonos, a két ellenállás is azonos, és a mérendő érték a dekádról leolvasható. A másik két leírás nem vezet mérési eredményre. Forrás: jegyzet/11_Meresek.md, 11.4.2.2.

## Forgalmi feladatok

### F-1. — Helyes válasz: A
A QRS jelentése: adjon lassabban. A QRQ éppen ellenkezőleg, gyorsabb adást kér, a QRX pedig várakozást. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2), kezdo/KEZDO-VIZSGA-ANYAGA.md (12. fejezet).

### F-2. — Helyes válasz: B
E = Echo, G = Golf, E = Echo, R = Romeo. Az England a nem hivatalos DX-ábécé szava, a Gamma pedig nem szerepel az ábécében (G = Golf). Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1).

### F-3. — Helyes válasz: C
A fónia a távbeszélő, beszédalapú üzemmódok neve (FM, SSB). A távíró a CW, a géptávíró az RTTY. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.5, 14.1.4: FONE).

### F-4. — Helyes válasz: B
Az FB jelentése remek, nagyszerű. A rossz a BD, a fél-automatikus billentyű a BUG rövidítés. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4), kezdo/KEZDO-VIZSGA-ANYAGA.md (11. fejezet).

### F-5. — Helyes válasz: B
A QRL? azt kérdezi: el van foglalva? Ezzel győződünk meg a szabad frekvenciáról. A QRV a vételkészséget, a QSL a nyugtázást jelenti. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.3.2), sajat/forgalom.md (minta QSO).

### F-6. — Helyes válasz: C
A pontos, rövid ismertetés után nyugtát kell kérni, hogy tudjuk, vették-e a segélykérést. QSL-lapra és riportra ilyenkor nincs idő. Forrás: sajat/forgalom.md (nemzetközi vészjelek).

### F-7. — Helyes válasz: A
A QSB jelek erősségének ingadozását, halkulását (fading) jelenti. Az idegen adó zavarása a QRM, a közlemény meglétét a QTC jelzi. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2), kezdo/KEZDO-VIZSGA-ANYAGA.md (12. fejezet).

### F-8. — Helyes válasz: C
Az OT a régóta engedélyes amatőr rövidítése. Az állomáskezelő az OP, a „csak” az ONLY szó. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4).

### F-9. — Helyes válasz: B
A /M a földi mozgó amatőrállomás jelzése (gépkocsi, kerékpár). A /MM vízi, a /P kitelepült állomás. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 13. § (1); kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet).

### F-10. — Helyes válasz: C
Az YO–YR a román prefixtartomány. Szerbiáé az YT és YU, Ukrajnáé az UR–UZ. Forrás: sajat/forgalom.md, kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet).

### F-11. — Helyes válasz: A
A frekvenciasávokat az egyes országok hatóságai határozzák meg, az adott IARU-régió ajánlásainak megfelelően. Az IARU sávterve ajánlás, a rádióklubok pedig nem jogosultak sávot kijelölni. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (9. fejezet).

### F-12. — Helyes válasz: B
A hagyományos pakettnél előbb kapcsolatot kell építeni, az APRS-nél nem: az állomás adatai azonnal megjelennek a többi állomásnál. Az APRS elsősorban rádión működik, az internetes kapu csak kiegészítés. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.2).

### F-13. — Helyes válasz: C
A sávterv szerint a 14070 kHz a PSK31 helye, USB-ben. Az LSB itt nem szokásos (a digitális módok szinte mindig USB-ben mennek), a 14230 kHz az SSTV aktivitásközpontja. Forrás: jegyzet/16_Mellekletek.md (16.2), sajat/forgalom.md (Hasznos tudnivalók).

### F-14. — Helyes válasz: A
Alkalmi amatőrállomás ünnep, évforduló, megemlékezés vagy rendezvény alkalmából működtethető (pl. HA200CVM). A versenyállomás külön típus, a vészhelyzet nem engedélytípus. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 4. § (4) g); kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet).

### F-15. — Helyes válasz: C
HAREC vizsgabizonyítvány alapján CEPT fokozatú egyéni engedély adható. Az Alap vizsga CEPT Novice fokozatot, a Kezdő vizsga Kezdő fokozatot ad. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 8. § (6).

## Biztonságtechnikai feladatok

### B-1. — Helyes válasz: C
A segélynyújtás szabályai: a balesetest ki kell szabadítani az áramkörből (műszaki mentés), meg kell állapítani a következményeket (diagnózis), azonnal meg kell kezdeni a megfelelő elsősegélyt, és egyidejűleg értesíteni kell a mentőket vagy az orvost. A másik két sorrend ezt felborítja. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.2.

### B-2. — Helyes válasz: B
A jegyzet szerint az emberi test ellenállása sokban függ az egyéb tényezőktől (nedvesség, be- és kilépési pont), és a feszültséggel fordítottan arányos. Az egyenes arányosság és az állandóság egyaránt téves. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.1.

### B-3. — Helyes válasz: A
A földzárlat rendellenesség miatt létrejövő földzáródás. A tudatos összekötés a földelés, az energiaszolgáltatói rendszer egy pontjának földelése pedig az üzemi földelés. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.3.1.

### B-4. — Helyes válasz: C
Az érintési feszültség a hibafeszültségnek az a része, amelyet megérintéskor az ember teste áthidalhat. A B) válasz a földelő feszültséget írja le, a C) pedig nem érintésvédelmi fogalom. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.3.1.

### B-5. — Helyes válasz: B
Védőelválasztásnál minden fogyasztót külön biztonsági transzformátorral előállított, földeletlen feszültséggel táplálnak; a szekunder egyik kivezetése sincs leföldelve. A szekunder leföldelése éppen megszüntetné a védelmet. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.3.2.2.

## Jogismereti feladatok

### J-1. — Helyes válasz: B
Aki a vizsgán legfeljebb egy tárgykörből nem felelt meg, abból a tárgykörből pótvizsgát tehet egy éven belül. A teljes vizsga megismétlése nem kötelező, a 30 napos határidő pedig nem szerepel a rendeletben. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 5. § (6).

### J-2. — Helyes válasz: A
Átjátszón rövid periódusokat kell adni, a periódusok között 1–2 másodperc szünetet kell tartani, és nem szabad általános hívást kezdeményezni. Szünet nélküli forgalmazás vagy fél perces szünet nem felel meg a szabálynak. Forrás: jegyzet/14_Forgalmi_ismeretek.md, 14.2.4; diak/12_jogi_es_forgalmi_alapok.md (Átjátszó használata).

### J-3. — Helyes válasz: C
A rendelet szerint az első két karakter HA vagy HG, a további rész első karaktere számjegy, utolsó karaktere betű. A HB7ABC első két karaktere nem HA/HG (a HB a svájci előtag), a HA7AB5 utolsó karaktere pedig számjegy. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 12. § (6).

### J-4. — Helyes válasz: A
Ha a hatóság a hatósági ellenőrzés során laboratóriumi vizsgálatot tart szükségesnek, annak időtartama legfeljebb tizenöt munkanap lehet. A régebbi jegyzet pontatlanul „15 napot” említ; a hiteles rendeletszöveg munkanapot ír. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 19. § (2).

### J-5. — Helyes válasz: C
A QSL lapok továbbításának legegyszerűbb módja a rádióamatőr szövetségek által működtetett QSL iroda; Magyarországon az MRASZ működtet ilyet. A hatóság a vizsgát és az engedélyezést intézi, az ITU nemzetközi szervezet. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md, 15. fejezet (QSL lap); jegyzet/01_Radioamator_alapismeretek.md, 1.2.3.
