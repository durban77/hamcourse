# Gyakorló feladatlap 04 – helyes válaszok és magyarázatok

A kérdések: [gyakorlo_kerdesek_04.md](gyakorlo_kerdesek_04.md).

> A jogi és forgalmi szabályok változhatnak: a vizsga előtt ellenőrizd az aktuális hatályos szöveget.

## Műszaki feladatok

### M-1. — Helyes válasz: C
A két 60 Ω-os párhuzamos eredője 30 Ω, ezt a 100 Ω-hoz sorosan hozzáadva 130 Ω adódik. A 220 Ω az összes ellenállás egyszerű összege, a 23 Ω pedig mindhárom ellenállás párhuzamos eredője. Forrás: jegyzet/04_Alkatreszek.md, 4.1.4.

### M-2. — Helyes válasz: C
XL = 2π · f · L = 2π · 14·10^6 Hz · 2·10^-6 H = 2π · 28 ≈ 176 Ω. A 28 Ω a 2π tényező kihagyásából, az 1,76 kΩ nagyságrendi hibából adódik. Forrás: jegyzet/04_Alkatreszek.md, 4.3.3.

### M-3. — Helyes válasz: B
A 6 dB csillapítás negyedére (×0,25), a 20 dB erősítés százszorosára (×100) változtatja a teljesítményt: 4 W · 0,25 · 100 = 100 W (a nettó erősítés 14 dB). A 400 W a csillapítás figyelmen kívül hagyásából, a 18 W a dB-értékek és a wattok összeadásából adódik. Forrás: sajat/radioelmelet.md (dB-tábla); jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.4.1.

### M-4. — Helyes válasz: B
A modulációs mélység m = Um / Uv = 4 V / 10 V = 0,4, vagyis 40 %. A 250 % a fordított arány (Uv / Um), a 60 % az 1 – m érték; 100 % fölött egyébként a jel túlvezérelt lenne. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.1.1.

### M-5. — Helyes válasz: C
A fajlagos vezetőképesség ezüstre 63, rézre 56, alumíniumra 37, ónra 8, ólomra 5 (m/(Ω·mm²)), tehát a felsoroltak közül az ezüst a legjobb vezető. Forrás: sajat/radioelmelet.md (Vezetőképesség).

### M-6. — Helyes válasz: A
A forrás szerint minden vezető anyaggal körülvett terület mentes a kívülről érkező elektromos tér hatásaitól (elektromos árnyékolás); a fém a töltéseket elvezeti. Ehhez nem kell ferromágneses anyag. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.1.2.1.

### M-7. — Helyes válasz: A
A C = ε0 · εr · A / d összefüggés szerint a kapacitás a felülettel egyenesen, a távolsággal fordítottan arányos, és függ a dielektrikumtól. A rákapcsolt feszültség nem szerepel a képletben. Forrás: jegyzet/04_Alkatreszek.md, 4.2.1.

### M-8. — Helyes válasz: B
A tekercsek vasmagja 20 Hz–20 kHz között vas, 20 kHz–100 MHz között ferrit, 100 MHz fölött pedig légmagos tekercset használnak. Forrás: jegyzet/04_Alkatreszek.md, 4.3.5.

### M-9. — Helyes válasz: A
Antiparalel kapcsolásnál mindig az éppen nyitóirányú dióda vezet, ezért bármilyen előfeszítésnél kb. 0,6 V a nyitófeszültség (és a záróirányú feszültség is ennyire korlátozódik). Az 1,2 V soros kapcsolásnál adódna, a 0 V pedig nem igaz, mert a dióda nyitófeszültsége megmarad. Forrás: jegyzet/04_Alkatreszek.md, 4.5.8.

### M-10. — Helyes válasz: C
A BPSK-ban a vivő fázisát billentyűzik két állapot között, ezért nincs szükség két frekvenciára, így kisebb a sávszélessége; ez bonyolultabb, mint az FSK. Az amplitúdó billentyűzése a QAM sajátja, a BPSK pedig állapotonként egy bitet visz. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.5.2.

### M-11. — Helyes válasz: B
A valóságos rezgőkörben mindig van veszteségi ellenállás, ezért a magára hagyott rezgés exponenciálisan csillapodó szinuszos lefolyású. Csillapítatlan rezgés csak veszteségmentes (ideális) esetben lenne. Forrás: jegyzet/06_Aramkorok.md, 6.1. (6.1-2. ábra szövege)

### M-12. — Helyes válasz: B
A forrás szerint a hagyományos LC rezgőköröknél két nagyságrenddel jobb frekvenciastabilitás érhető el rezgőkristállyal (Δf / f ≈ 10^-6 … 10^-10). A 10–20 % és a tíz nagyságrend egyaránt eltúlozza vagy lebecsüli a különbséget. Forrás: jegyzet/06_Aramkorok.md, 6.5.2.

### M-13. — Helyes válasz: A
A stabilitás, a zavarérzékenység csökkentése és a határfrekvencia érdekében egy fokozattal reálisan csak 10…50-szeres erősítés érhető el, ezért építenek többfokozatú erősítőket. Az ezerszeres érték csak több fokozattal valósítható meg, az 1–2-szeres pedig túl kevés. Forrás: jegyzet/06_Aramkorok.md, 6.4.7.

### M-14. — Helyes válasz: B
A sávszelektivitásért és a tükörszelektivitásért a keverő előtti bemeneti sávszűrő felel. A csatornaszelektivitást a KF szűrő adja, a hangfrekvenciás erősítőnek szelektivitási szerepe nincs. Forrás: jegyzet/07_Vevok.md, 7.2 és 7.6.1.

### M-15. — Helyes válasz: C
G = 10·lg(S1/Sref) = 10·lg 20 ≈ 13 dB. A 20 dB a számérték tévesen dB-nek vétele, a 26 dB pedig a feszültségarányra használt 20·lg képlet alkalmazása teljesítményarányra. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1.6.

### M-16. — Helyes válasz: A
A digitális frekvenciamérő a bemenetére adott jelet felerősíti, négyszögesíti, majd digitális számlálóra vezeti, amely pontosan 1 másodpercig számol. A rezgőkörös, skálás leolvasás az abszorpciós frekvenciamérőre jellemző. Forrás: jegyzet/11_Meresek.md, 11.4.4 és 11.5.2.

### M-17. — Helyes válasz: A
A Földet körülvevő ionoszféra megakadályozza, hogy a 30 MHz-nél alacsonyabb rádiófrekvenciás kozmikus zajok behatoljanak a légkörbe, ezért kozmikus zajjal legfeljebb URH összeköttetéseknél számolhatunk. A másik két válasz ezzel ellentétes. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.1.

### M-18. — Helyes válasz: C
A teljesítménysűrűség a távolság négyzetével csökken: négyszeres távolságnál tizenhatod részére, 8/16 = 0,5 µW/m². A 2 µW/m² az 1/r szabály (÷4), az 1 µW/m² pedig egy ÷8-as tévedés eredménye. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.1.

### M-19. — Helyes válasz: B
A parabola tulajdonsága, hogy a fókuszponttól az apertúra síkjáig minden sugár úthossza egyforma, ezért a gömbhullám síkhullámmá alakul, és a nagy nyílásfelületen meghatározott eloszlású síkhullám lép ki. A polarizációt és a terjedési módot a reflektor nem változtatja meg. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.5.1.

### M-20. — Helyes válasz: A
A jegyzet szerint SSB moduláció esetén a végerősítő AB osztályú (lineáris), CW és FM üzemmódnál viszont C osztályú is lehet, mert ott nem a lineáris erősítés a lényeg. A C osztály az SSB jelet torzítaná, az A osztály alkalmazása pedig nem kötelező. Forrás: jegyzet/08_Adok.md, 8.3.4.

### M-21. — Helyes válasz: B
A legkisebb méréshatárt kell választani, amelybe a mérendő jel még belefér, hogy a leolvasás a lehető legpontosabb legyen: 8 V-hoz ez a 10 V-os. A 300 V-os rontaná a felbontást, a 3 V-on pedig a jel túllépné a tartományt (a műszer túlcsordulást jelezne). Forrás: jegyzet/11_Meresek.md, 11.3.2.2.

### M-22. — Helyes válasz: B
A GP antenna négy negyedhullámú ellensúlya a sugárzóhoz képest 135°-os szöget zár be, egymáshoz képest pedig 90°-ot (négy radiál = 360°/4). A 120° három radiálnál lenne természetes, de a GP-nek négy van. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.2.2.1.

### M-23. — Helyes válasz: A
Függőleges antennánál a földben pozitív tükörkép keletkezik, ami azonos antennaáram mellett kétszeres térerősséget hoz létre. A negatív tükörkép és a kioltás a vízszintes antennára jellemző. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.3.

### M-24. — Helyes válasz: C
A ballun transzformátor 4:1-es impedanciatranszformációt végez, 200…240 Ω-os antennához 50…75 Ω-os koaxiális kábelt illeszt: 200/50 = 4. A 2:1 feszültségáttételnek felelne meg (√4), a 8:1 pedig túl nagy. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.7.4.

### M-25. — Helyes válasz: C
Az erős zavaró jel blokkolhatja a vevőt: az AGC csökkenti az erősítést, illetve egyes fokozatok túlvezérelődnek, így a hasznos jel kiemelése lehetetlenné válik. Az érzékenység nem nő, a zajzár pedig csak a jel hiányában némít. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.3.

## Forgalmi feladatok

### F-1. — Helyes válasz: A
A H, K és Z betűk hivatalos szavai: Hotel, Kilo, Zulu. A Zanzibar és a Honolulu a nem vizsgaanyag DX-ábécé szavai, ezért a másik két sor hibás. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1), sajat/forgalom.md.

### F-2. — Helyes válasz: B
Az UR birtokviszonyt jelöl: az Ön…, a te…, tehát „a te riportod 599”. Az ultrarövidhullám a VHF/URH, az üzenet az MSG. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.3), kezdo/KEZDO-VIZSGA-ANYAGA.md (11. fejezet).

### F-3. — Helyes válasz: A
A hívójelben az SOS betűkombináció külön is tilos, mert ez a távíró üzemmódú nemzetközi vészjel. A CQ és a QSL nem vészjelek. Forrás: diak/12_jogi_es_forgalmi_alapok.md (hívójel szabályai, nemzetközi vészjelek).

### F-4. — Helyes válasz: B
A TNX (és a TKS) köszönetet jelent. A TX az adó, a TRUB a zavarás. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4).

### F-5. — Helyes válasz: C
Az Y betűje Yankee. A Yokohama a nem hivatalos DX-ábécéből való, a Yellow pedig nincs az ábécében. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1).

### F-6. — Helyes válasz: A
Európai forgalomban a CW-hívás kb. 30 mp-től 1 percig tart, a végén PSE K következik. Az 5 perc túl hosszú, az 5–10 mp túl rövid ahhoz, hogy valaki észrevegye. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.3.2.1).

### F-7. — Helyes válasz: B
Mozgó amatőrállomás forgalmáról nem kell forgalmi naplót vezetni. A másik két válasz naplózási kötelezettséget feltételez. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (17. fejezet), sajat/forgalom.md (forgalmi napló).

### F-8. — Helyes válasz: C
A QRU kijelentésként azt jelenti, hogy nincs több közlendőm (kérdésként: nincs közlendőd?). A QRT az adás beszüntetése, a QTC pedig éppen azt jelzi, hogy közleményünk van. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (12. fejezet), jegyzet/14_Forgalmi_ismeretek.md (14.1.1, a CW-mintában szereplő QRU).

### F-9. — Helyes válasz: A
A hívójel karakterei az angol ábécé betűiből és számjegyekből állnak. Ékezetes betűk nem szerepelhetnek, számjegy pedig kötelező (a prefix után). Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 12. § (12), (6).

### F-10. — Helyes válasz: C
Szlovénia előtagja az S5. Az SP lengyel, az OM szlovák előtag. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet), sajat/forgalom.md.

### F-11. — Helyes válasz: B
A TNC egy speciális mikroszámítógép, amely az AX.25 által megkövetelt feladatokat végzi, és általában a modemet is tartalmazza. Az antennaillesztő és a GPS-vevő más egység. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.1.6).

### F-12. — Helyes válasz: C
A 10 m-es sáv FM hívócsatornája a 29 600 kHz. A 29 300 kHz a műholdas lejövő ág kezdete, a 28 680 kHz a képátvitel aktivitásközpontja. Forrás: jegyzet/16_Mellekletek.md (16.2).

### F-13. — Helyes válasz: A
A lokátor az állomás helyét adja meg rövid kóddal, ezt közöljük a QTH mellett a QSO-ban (pl. JN97MM). A hívójelet és a teljesítményt nem a lokátor jelöli. Forrás: sajat/forgalom.md (Helymegadás), jegyzet/14_Forgalmi_ismeretek.md (14.3.1.3).

### F-14. — Helyes válasz: B
A külföldi CEPT-engedélyes a saját hívójele elé, törtvonallal elválasztva a HA betűpárt teszi. A hívójel mögé tett /HA vagy a kötőjel nem szabályos. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 13. § (2).

### F-15. — Helyes válasz: A
DTMF (pager) hívásnál is kötelező szóban bemondani a két állomás hívójelét. Átjátszón általános hívást nem szabad kezdeményezni. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.4), diak/12_jogi_es_forgalmi_alapok.md.

## Biztonságtechnikai feladatok

### B-1. — Helyes válasz: A
Egyes, szilárd szigetelőanyagú kondenzátoroknál a rövidre zárás megszüntetése után kis idő múlva újra feszültség mérhető a fegyverzeteken, mert a kondenzátor nem sül ki teljesen. Ezért a feszültségmentesített berendezés is okozhat áramütést. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.8.

### B-2. — Helyes válasz: B
A jegyzet szerint a hosszú kábelek, koaxiális fémhengerek és távvezetékek bizonyos szempontból kondenzátorként viselkednek, ezért töltést halmozhatnak fel; áramütést okozhat a feltöltött fázisjavító kondenzátor is. A védővezető és a kiolvadt biztosító nem tárol veszélyes töltést. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.8.

### B-3. — Helyes válasz: C
A jegyzet szerint az elhasznált akkumulátorok a környezetre káros anyagokat tartalmaznak, ezért megfelelő ártalmatlanításukról gondoskodni kell. A kis feszültség nem teszi őket ártalmatlanná, az égetés pedig nem szerepel biztonságos megoldásként. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.6.

### B-4. — Helyes válasz: B
A hálózati tápegység legkritikusabb alkatrésze a transzformátor: a primer és a szekunder tekercs között, valamint a vasmagtól is jó szigetelés szükséges, hogy a hálózati feszültség ne kerülhessen a szekunder oldalra. A másik két állítás ellentétes ezzel. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.7.

### B-5. — Helyes válasz: C
A jegyzet szerint a villamos balesetek legnagyobb része csak akkor válik végzetessé, ha nem nyújtanak azonnal szakszerű elsősegélyt, és az „azonnal” itt legkésőbb 4 percen belüli segítségnyújtást jelent. A 15 perc és az egy óra túl hosszú. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.2.

## Jogismereti feladatok

### J-1. — Helyes válasz: C
A rendelet szerint az amatőrállomás vagy annak fő berendezése vagy kereskedelmi forgalomba hozott rádióberendezés, vagy CEPT NOVICE, illetve CEPT HAREC fokozatú engedélyes által vagy számára épített vagy átalakított berendezés lehet. Tehát a saját építés nem tilos, de fokozathoz kötött. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 4. § (5).

### J-2. — Helyes válasz: A
A rádióamatőr minden összeköttetés kezdetekor és befejezésekor, a forgalmazás során legalább három adásvételi periódus után, a kísérletek során legalább 10 percenként, valamint másik rádióamatőr vagy a hatóság kérésére köteles a hívójelét közölni. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 15. § (2).

### J-3. — Helyes válasz: B
Távíró (CW) üzemmódban háromjegyű RST skálát, fóniában (SSB, FM) kétjegyű RS skálát, átjátszón történő forgalmazásban csak R skálát (olvashatóság) használunk. Forrás: jegyzet/14_Forgalmi_ismeretek.md, 14.2.5; diak/12_jogi_es_forgalmi_alapok.md (Vételjellemzés).

### J-4. — Helyes válasz: C
A közösségi amatőr engedély érvényességi ideje 5 év, amely nem lehet hosszabb, mint az irányító kezelő egyéni engedélyének érvényessége. A 10 év nem szerepel a rendeletben. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 11. § (3).

### J-5. — Helyes válasz: B
A kurzusanyag szerint az amatőrállomások közötti jelátvitel nem kódolható a tartalom elrejtése céljából (a rendszabályozott kivételektől eltekintve); ezzel összhangban a magyar rendelet is tiltja az információrejtő módszer alkalmazását. Forrás: sajat/jogi-targykor.md, 3/1 7/3; jogi/15_2013_IX_25_NMHH_rendelet.md, 15. § (6) e).
