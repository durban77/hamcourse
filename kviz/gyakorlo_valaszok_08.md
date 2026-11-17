# Gyakorló feladatlap 08 – helyes válaszok és magyarázatok

A kérdések: [gyakorlo_kerdesek_08.md](gyakorlo_kerdesek_08.md).

> A jogi és forgalmi szabályok változhatnak: a vizsga előtt ellenőrizd az aktuális hatályos szöveget.

## Műszaki feladatok

### M-1. — Helyes válasz: A
Ideális transzformátornál P1 = P2: a szekunder teljesítmény 13,8 V · 10 A = 138 W, így I1 = 138 W / 230 V = 0,6 A. A 167 A az áramok nem fordított (hanem egyenes) arányosításából adódik, a 10 A pedig az áttétel figyelmen kívül hagyásából. Forrás: jegyzet/04_Alkatreszek.md, 4.4.1.

### M-2. — Helyes válasz: B
A Thomson-képletet C-re rendezve C = 1 / ((2π · f0)² · L) = 1 / ((4,46 · 10^7)² · 10^-6) ≈ 5,0 · 10^-10 F = 500 pF. Az 50 pF és az 5 nF tízszeres nagyságrendi hibából adódik. Forrás: jegyzet/06_Aramkorok.md, 6.1.1.

### M-3. — Helyes válasz: C
A periódusidő és a frekvencia egymás reciproka: T = 1 / f = 1 / 2500 Hz = 0,0004 s = 0,4 ms. A 2,5 ms és a 4 ms a számértékek összekeveréséből, illetve tízszeres hibából adódik. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.3.1.

### M-4. — Helyes válasz: A
A kimeneti feszültség a Zener-feszültség és a bázis–emitter feszültség különbsége: 9,1 V – 0,6 V = 8,5 V. A 9,7 V az összeg, a 9,1 V az egyszerű Zener-stabilizátor kimenete (az UBE figyelmen kívül hagyásával). Forrás: jegyzet/06_Aramkorok.md, 6.3.2.1.

### M-5. — Helyes válasz: B
A rövidzárlati áramot a forrásfeszültség és a belső ellenállás hányadosa adja, ami kis belső ellenállásnál igen nagy; ez az áramforrás tönkremeneteléhez, akkumulátornál robbanáshoz is vezethet. Rövidzárlatkor a feszültség nem nő, és az áram nem nulla. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.2.1.

### M-6. — Helyes válasz: C
A FET-nél a vezérlés feszültséggel történik és nem folyik vezérlőáram, ezért teljesítmény sem szükséges a vezérléshez, és a bemeneti ellenállás közel végtelen. A bázisáram a bipoláris tranzisztor jellemzője, és a drain–source ág vezet. Forrás: jegyzet/04_Alkatreszek.md, 4.5.11.

### M-7. — Helyes válasz: A
Az ellenálláson áthaladó áram hőt fejleszt, amelyet a környezetnek le kell adni; minden ellenállás jellemző értéke a maximális disszipációs teljesítmény, ebből a ráköthető feszültség és áram is kiszámítható. Ez nem az ellenállás értéke és nem reaktancia. Forrás: jegyzet/04_Alkatreszek.md, 4.1.1.

### M-8. — Helyes válasz: C
Az elektrolit kondenzátor szigetelő oxidrétege magától is bomlik, ha a kondenzátor sokáig nincs használva; üzemi feszültségre töltve a réteg újra felépül. Ellenkező polaritás vagy rövidzár éppen a kondenzátor tönkremeneteléhez vezetne. Forrás: jegyzet/04_Alkatreszek.md, 4.2.2.3.

### M-9. — Helyes válasz: B
A gyűrű alakú magra tekercselt toroid transzformátor hatásfoka a hagyományos vasmagoshoz képest jobb, ezért kisebb méretű, de tekercselése nehéz. Az olcsó, rosszabb hatásfokú megoldás a lemezelt vasmagos kivitel; a toroidnak van (gyűrű alakú) vasmagja. Forrás: jegyzet/04_Alkatreszek.md, 4.4.2.1.–4.4.2.2.

### M-10. — Helyes válasz: A
Az SSB előnye, hogy a kisugárzott teljesítmény egésze az információt hordozó oldalsávra fordítódik és kisebb a sávszélessége; hátránya a bonyolultabb előállítás és demodulálás. Az AM-DSB egyszerűen előállítható, de pazarló. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.4.

### M-11. — Helyes válasz: B
A forrás szerint a CD lemezen a minták 44,1 kHz-es mintavétellel, 16 bites kódolással vannak tárolva. A 8 kHz / 8 bit a nemzetközi telefonhálózat jellemzője (100 Hz–3,1 kHz-es sáv), a 20 kHz / 4 bit pedig nem felel meg a 20 kHz-es hangsáv visszaállításához szükséges értéknek. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.3.

### M-12. — Helyes válasz: A
A monolitikus integrált stabilizátorok általában csak három lábbal rendelkeznek: be- és kimeneti, valamint közös láb. A 7812 kimenete 12 V. Két kivezetéssel nem lenne közös pont, öt kivezetésre pedig nincs szükség. Forrás: jegyzet/06_Aramkorok.md, 6.3.2.3.

### M-13. — Helyes válasz: C
B osztályban a munkapont a zárókönyökben van, nyugalomban nem folyik áram, így egy tranzisztor csak az egyik félperiódust erősíti; a másikhoz ellentétes fázisban működő második tranzisztor kell. Ezért nem alkalmazható egyetlen tranzisztorral. Forrás: jegyzet/06_Aramkorok.md, 6.4.3.2.

### M-14. — Helyes válasz: B
A fázismodulátor lényegében RC tag, amelynek az ellenállás részét maga a FET adja; az ellenállást a hangfrekvencia ütemében változtatva a fázistolás is változik. A moduláló jelet a modulátor és a hangfrekvenciás erősítő közé iktatott vágó áramkörrel korlátozzák. A varicapos kvarcelhangolás a frekvenciamodulátor megoldása, az amplitúdóváltoztatás pedig nem fázismoduláció. Forrás: jegyzet/08_Adok.md, 8.3.6.

### M-15. — Helyes válasz: C
A Yagi nyeresége a gerinchosszal és az elemszámmal nő, de kb. 3 λ gerinchossz felett már számottevően nem növelhető; a maximum 14–15 dB körüli. A 0,5 λ túl rövid lenne ahhoz, hogy a telítődés ott kezdődjön, a 20 λ-es gerinc pedig gyakorlatilag kivitelezhetetlen. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.4.1 és 9.5.

### M-16. — Helyes válasz: B
A csillapítást dB/100 m-ben adják meg, és a kábel hosszával arányosan nő: 6 dB · 0,4 = 2,4 dB. A 15 dB az osztás (6/0,4), a 0,24 dB pedig tízszeres tévedés. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.2 és 9.6.5.2.

### M-17. — Helyes válasz: C
Az ionoszférában növekvő frekvenciákkal egyre magasabb rétegről kapunk visszatérő rádióhullámot, és a magasság növelésével a visszaverődés vesztesége egyre kisebb. A másik két válasz ezt tagadja. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.5.1.

### M-18. — Helyes válasz: A
Egyenes vételnél a jelet az eredeti vivőfrekvencián erősítik és demodulálják, nincs frekvenciakeverés; az egyenes vevő tehát nem szuperheterodin. A KF-re keverés a szuperheterodin elv lényege. Forrás: jegyzet/07_Vevok.md, 7.1.1 és 7.1.3.

### M-19. — Helyes válasz: C
Az SWR méréshez a használható legkisebb teljesítményre kapcsoljuk az adót (jellemzően 0,5–1 W), és állandó vivőt adó üzemmódot (FM, CW) választunk, hogy a műszer kitérése stabil legyen. SSB-ben a beszéd ingadozó jele miatt a mérés nem végezhető értelmesen, a nagy teljesítmény pedig felesleges és káros. Forrás: jegyzet/11_Meresek.md, 11.5.1.2.

### M-20. — Helyes válasz: B
A nagyfrekvenciás zaj minden digitális áramkörből jöhet, ellene zajszűrő ferritet kell használni. A zajzár kinyitása csak a zajt tenné hallhatóvá, a földelés hiánya pedig a népszerű zavarforrások közé tartozik. Forrás: sajat/zavaras.md (szűrés, népszerű zavarforrások).

### M-21. — Helyes válasz: A
A félhullámú dipólus nyeresége az izotróp sugárzóhoz képest 2,14 dB, ezért a dBi érték a dBd érték + 2,14. Így 12 dBi = 12 – 2,14 = 9,86 dBd. A 14,14 dBd az ellenkező irányú átszámítás, a 12 dBd pedig az átszámítás elmaradása. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1.6.

### M-22. — Helyes válasz: A
A kimeneti szűrő a végfokozat felharmonikusait vágja ki, a teljes kimenő teljesítményt át kell vinnie, ezért vastag vezetékű tekercsek és nagy átütési szilárdságú kondenzátorok kellenek. A vékony huzal túlmelegedne, a vivő elnyomása pedig nem a kimeneti szűrő feladata. Forrás: jegyzet/08_Adok.md, 8.3.5.

### M-23. — Helyes válasz: C
A közvetlen hullámterjedésnél a nagyobb frekvenciájú mikrohullámokat a légkör abszorpciós vonalai, az eső és a köd jelentősen csillapíthatják. A talajreflexió a térerősséget az interferencia révén módosítja, az ionoszféra D rétege pedig a rövidebb hullámok közvetlen útját nem érinti. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.1.

### M-24. — Helyes válasz: B
f = 1/T = 1 / 125 ns = 8 · 10⁶ Hz = 8 MHz. A 8 kHz a mértékegység tévesztése (µs helyett ns), a 125 MHz pedig a periódusidő számértékének frekvenciává olvasása. Forrás: jegyzet/11_Meresek.md, 11.4.4.

### M-25. — Helyes válasz: A
10 dB feszültségben √10 ≈ 3,16-szoros arányt jelent, így 50 µV · 3,16 ≈ 158 µV. A 60 µV a dB-ek lineáris hozzáadása (50 + 10), az 500 µV pedig +20 dB-nek felelne meg. Forrás: jegyzet/07_Vevok.md, 7.5.7.

## Forgalmi feladatok

### F-1. — Helyes válasz: B
A RIG az állomásfelszerelést, a berendezést jelöli. A rádió-távgépíró az RTTY, az állóhullámarány az SWR. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4), kezdo/KEZDO-VIZSGA-ANYAGA.md (11. fejezet).

### F-2. — Helyes válasz: A
A forgalmi napló lehet papír alapú (az MRASZ-tól beszerezhető) és elektronikus is. A másik két állítás kizárja az egyik formát. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (17. fejezet), jegyzet/14_Forgalmi_ismeretek.md (állomásnapló minta).

### F-3. — Helyes válasz: A
A forgalmi gyakorlatban a 9-es számjegyet „Niner”-nek mondjuk, hogy ne keverjék más szóval. A „Nein” német szó (nem), a „Ninety” a 90-et jelentené. Forrás: sajat/forgalom.md (nemzetközi betűzési ábécé, számjegyek).

### F-4. — Helyes válasz: C
Az R3 nehezen értelmezhető adást jelent, de az információ nagy része érthető. A minden szó érthető az R4, az értelmezhetetlen az R1. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.5).

### F-5. — Helyes válasz: B
A 6 WPM × 5 karakter = 30 karakter/perc. A 6 és a 60 hibás szorzás eredménye. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.3.3.2).

### F-6. — Helyes válasz: C
A QSZ kérdésben azt kérdezi: adjak minden szót kétszer? A lassabb adás a QRS, az adás beszüntetése a QRT. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2).

### F-7. — Helyes válasz: B
Az SRI jelentése: sajnos, sajnálom. Az SKED megbeszélt adást, az SWR állóhullámarányt jelent. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4).

### F-8. — Helyes válasz: C
Az U betűje Uniform. A United a nem hivatalos DX-ábécéből való, az Umbrella nincs az ábécében. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1).

### F-9. — Helyes válasz: B
Az LZ Bulgária előtagja. A lengyel előtag az SP, az LZ-t a luxemburgival tévesztik. Forrás: sajat/forgalom.md (Nemzeti azonosító jelek).

### F-10. — Helyes válasz: B
Nyáron a magyar idő UTC+2, ezért az UTC két órával korábbi: 23:30, az előző napon (a dátum is változik). A 03:30 fordított számolás, a 00:30 csak egy órás eltérést feltételezne. Forrás: sajat/forgalom.md (Idő megadása).

### F-11. — Helyes válasz: A
Beszédalapú (FM) átjátszón csak beszédalapú forgalmazás megengedett, digitális (pl. pakett) nem. Az SSTV szintén nem beszéd. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.4).

### F-12. — Helyes válasz: C
A leggyakoribb 320×240-es színes kép átvitele kb. 2 percig tart. A 8 másodperc egy 120 soros fekete-fehér képre, a 7 perc egy 640×480-as true color képre jellemző. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.6).

### F-13. — Helyes válasz: A
Az egyéni engedély szerint a természetes személynek egy hívójele van, különleges engedélyek alapján további hívójeleket is kaphat. Sávonkénti vagy korlátlan számú hívójelre nincs lehetőség. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 12. § (9).

### F-14. — Helyes válasz: C
A kezdők 23 cm-es sávja 1240–1300 MHz, ide esik az 1296 MHz. A 435 MHz a 70 cm-es sávban van, a 2400 MHz a 13 cm-es sávban (2300–2450 MHz). Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (9. fejezet), jegyzet/15_Digitalis_uzemmodok.md (15.4.1).

### F-15. — Helyes válasz: A
Alap fokozatú vagy CEPT Novice vizsgabizonyítvány alapján CEPT Novice fokozatú engedély adható. A CEPT fokozat HAREC vizsgához tartozik. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 8. § (6) b).

## Biztonságtechnikai feladatok

### B-1. — Helyes válasz: C
A 6–24 V-os telepes táplálásnál az áramütés veszélye nem áll fenn; a fő veszély a kis belső ellenállás miatt rövidzárlatkor fellépő nagy áram, amely ívet, melegedést, szélsőséges esetben tüzet okozhat. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.6.

### B-2. — Helyes válasz: B
A jegyzet szerint a primer oldali résznek megfelelő szigeteléssel kell rendelkeznie, és a primer körben is biztosítót kell használni. A transzformátor nem helyettesíti a biztosítót. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.7.

### B-3. — Helyes válasz: B
A hálózati táplálásnál fontos a kábel bevezetésénél a törésmentesség biztosítása, hogy a sérült szigetelés ne okozzon veszélyt. A megfeszített vagy lehántolt kábel éppen a sérülés veszélyét növelné. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.7.

### B-4. — Helyes válasz: A
Kisfeszültségű berendezésnél gyakorlatilag csak úgy következhet be áramütés, ha a feszültség alatt álló részt megérintjük; nagyfeszültségen a közvetlen érintés nélküli megközelítés is elég lehet. A B) és a C) ezt megfordítja vagy tagadja. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.9.

### B-5. — Helyes válasz: C
A jegyzet a nagyfeszültségű berendezéseket az 1000 V-nál nagyobb feszültségűekként határozza meg. A 230 V a kisfeszültségű hálózati feszültség, az 50 V pedig nem szerepel határként. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.9 és 13.7.

## Jogismereti feladatok

### J-1. — Helyes válasz: B
A vizsgabizottság legalább 3 főből áll; tagja 25. évét betöltött személy lehet, és legalább egy tagnak CEPT fokozatú engedéllyel kell rendelkeznie. Egy tagot a rádióamatőrök nemzeti képviseleti szervezete delegálhat. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 5. § (8).

### J-2. — Helyes válasz: C
A rendelet a forgalmazás során kifejezetten tiltja az egyéni vagy közösségi rádióamatőr állomás más elektronikus hírközlő hálózattal való összekapcsolását. A partner státusza és a kapcsolat időtartama ezt nem változtatja meg. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 15. § (6) h).

### J-3. — Helyes válasz: A
A QSL lapon az állomások hívójele, az összeköttetés dátuma, UTC időpontja, frekvenciája, üzemmódja és a riport szerepel (esetleg név, cím, berendezés). Az engedély- és vizsgabizonyítvány-szám, valamint az érvényességi idő nem tartozik a QSL lap adatai közé. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md, 15. fejezet; jegyzet/01_Radioamator_alapismeretek.md, 1.6.

### J-4. — Helyes válasz: B
A versenyállomás hívójele 4 karakterből áll. Az 5–7 karakteres hossz az általános szabály (a versenyállomás, az alkalmi és a tájfutó állomás kivételével), az 5–10 karakter pedig az alkalmi amatőrállomásé. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 12. § (3)–(5).

### J-5. — Helyes válasz: A
A vizsgázónak be kell mutatnia, hogy képes betű- és számcsoportokat, írásjeleket tartalmazó morzekódokat adni és venni 3 percig, 6 WPM (azaz 30 karakter/perc) sebességgel, kézi úton. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 1. melléklet (Morze vizsga követelményei); jegyzet/14_Forgalmi_ismeretek.md, 14.3.3.2.
