# Gyakorló feladatlap 11 – helyes válaszok és magyarázatok

A kérdések: [gyakorlo_kerdesek_11.md](gyakorlo_kerdesek_11.md).

> A jogi és forgalmi szabályok változhatnak: a vizsga előtt ellenőrizd az aktuális hatályos szöveget.

## Műszaki feladatok

### M-1. — Helyes válasz: A
Az áram I = 12 V / (0,5 Ω + 5,5 Ω) = 2 A, a belső ellenálláson 2 A · 0,5 Ω = 1 V esik, így a kapocsfeszültség 12 V – 1 V = 11 V (= 2 A · 5,5 Ω). A 12 V terheletlen esetben igaz, az 1 V a belső ellenálláson eső feszültség. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.2.1.; 3.1.8.2.

### M-2. — Helyes válasz: C
Kirchhoff csomóponti törvénye szerint a befolyó és kifolyó áramok összege egyenlő: 3 + 1,5 = 4,5 A, ebből 2 A az egyik ágon, így 2,5 A folyik a másikon. A 6,5 A az összeadás, a 0,5 A a bejövő áramok különbségének hibás használata. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.1.8.1.

### M-3. — Helyes válasz: C
A QAM-256 egy állapota egy teljes bájtot, 8 bitet kódol, így a bitsebesség 4800 baud · 8 bit = 38 400 bit/s. A 4800 bit/s a szimbólumonként egy bitet feltételezné, a 600 bit/s a 8-cal való osztásból adódna. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.5.4.–5.2.5.5.

### M-4. — Helyes válasz: B
Az áramerősítési tényező B = IC / IB, így IB = IC / B = 20 mA / 80 = 0,25 mA (250 µA). Az 1,6 A a szorzás (IC · B), a 25 µA tízszeres hibából adódik. Forrás: jegyzet/04_Alkatreszek.md, 4.5.10.1.

### M-5. — Helyes válasz: B
Párhuzamosan csak szigorúan azonos feszültségű és állapotú cellák kapcsolhatók, különben jelentős kiegyenlítő áramok folynak, ami az önkisülést gyorsítja. A feszültségek összeadódása a soros kapcsolásra igaz. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.2.3.

### M-6. — Helyes válasz: C
Lineáris polarizációnál az E vektor végpontja egyenes mentén rezeg; a viszonyítás a földfelszín, ezért a rá merőleges rezgés függőleges polarizációt jelent. Körpolarizációnál az elektromos vektor körmozgást végez. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.1.

### M-7. — Helyes válasz: B
A változtatható kondenzátorokat felhasználás szempontjából két csoportra osztják: a működés során többször folyamatosan változtatható (forgókondenzátor, rezgőkör hangolása) és az egyszeri beállításra, trimmelésre használt típusokra. Forrás: jegyzet/04_Alkatreszek.md, 4.2.2.4.

### M-8. — Helyes válasz: A
A dióda nyitóirányban akkor van előfeszítve, ha az anód pozitívabb a katódnál; az ellentétes előfeszítés a záróirány. Azonos feszültségnél nincs előfeszítés, a dióda nem vezet. Forrás: jegyzet/04_Alkatreszek.md, 4.5.1.

### M-9. — Helyes válasz: A
A cső magas (néhány száz voltos) anódfeszültséget követelt meg, a katódot fűteni kellett, és a bemelegedés akár percekig tartott. A rácsellenállás nagyon magas (jó előerősítő), és a csövek minden frekvenciatartományban működnek. Forrás: jegyzet/04_Alkatreszek.md, 4.6.1.–4.6.2.

### M-10. — Helyes válasz: B
A külső zajok többnyire az amplitúdót zavarják, az FM információja viszont a frekvenciában van, ezért kevésbé érzékeny rájuk. Az FM sávszélessége ráadásul nagyobb, nem kisebb, mint az AM-é. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.3.

### M-11. — Helyes válasz: A
Attól függően, hogy a három csatlakozási pont közül melyiket kötik állandó potenciálú pontra, földelt emitteres, földelt bázisú és földelt kollektoros alapkapcsolást különböztetünk meg. A katód–rács–anód az elektroncsöves megfelelőket idézi, a soros–párhuzamos–vegyes az ellenállások kapcsolása. Forrás: jegyzet/04_Alkatreszek.md, 4.5.10.2.

### M-12. — Helyes válasz: B
Sávszűrő alul- és felüláteresztő szűrők összekapcsolásával is megvalósítható, és az átvitel a két sarokfrekvencia (fa és fm) között jön létre. A második válasz önmagában nem ad sávszűrőt, a harmadik pedig a forrás állításának mond ellent. Forrás: jegyzet/06_Aramkorok.md, 6.2.5.

### M-13. — Helyes válasz: C
Az FM jel információja a frekvenciában van, ezért az egyszerű burkolódetektor közvetlenül nem alkalmas; legegyszerűbben FM–AM átalakítással demodulálják: a frekvenciaváltozás a félrehangolt rezgőkörön amplitúdóváltozássá alakul. A BFO az SSB/CW jelekhez kell. Forrás: jegyzet/06_Aramkorok.md, 6.6.3.

### M-14. — Helyes válasz: B
fv = fh – fKF = 16,455 – 0,455 = 16,000 MHz. A 16,910 MHz az fh + fKF lenne, a 15,545 MHz pedig az fh – 2·fKF hibás számításából adódna; a vevő ennél a beállításnál a 16 MHz-es jelet veszi. Forrás: jegyzet/07_Vevok.md, 7.2.

### M-15. — Helyes válasz: B
A deltaillesztés mechanikai előnye, hogy a sugárzót nem kell elvágni, a középpontja fémesen rögzíthető vagy földelhető; 400–600 Ω-os kéthuzalos vonalhoz alkalmas. A gamma szimmetrikus sugárzó koaxiális táplálására, a kerülővezeték URH-n 4:1 illesztésre való. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.7.

### M-16. — Helyes válasz: A
Ugrási fadingnél a visszaverő réteg magassága változik, emiatt a visszavert hullám szöge is, és a vétel helyén a térerő erősödik vagy gyengül. A polarizáció forgása a polarizációs fading oka, az eltérő úthossz pedig az URH-n jellemző interferencia fading oka. Forrás: jegyzet/10_Hullamterjedes.md, 10.2.1.

### M-17. — Helyes válasz: B
SWR = (40 + 20)/(40 – 20) = 60/20 = 3. A 2 a VF/VR hányados, a 0,33 pedig a fordított arány; az SWR mindig legalább 1. Forrás: sajat/meresek.md (SWR képlete); jegyzet/09_Antennak_es_tapvonalak.md, 9.6.3.

### M-18. — Helyes válasz: A
Az adók egyik típusa a kimeneti frekvenciát frekvenciasokszorozással állítja elő; ezt csak FM üzemmódnál alkalmazzák, ma már nem gyártanak ilyet, de sok üzemel. A keveréses adók a ma használatos rádiók nagy részét adják. Forrás: jegyzet/08_Adok.md, 8.1.

### M-19. — Helyes válasz: C
Nem szándékos zavar keletkezhet, ha az adó beállítását, hangolását nem műterheléssel végezzük, mert a kisugárzott jel a környező vevőkben zavart okoz. A műterhelés és a kis teljesítmény éppen a kisugárzott zavaró jelek mennyiségét csökkenti. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.1; jegyzet/11_Meresek.md, 11.5.3.

### M-20. — Helyes válasz: A
A Yagi nyeresége legfeljebb 14–15 dB lehet, ehhez nagy elemszám és hosszú gerinc tartozik, magas frekvencián pedig a boom átmérője is beleszól az antenna működésébe. A Yagi 30 MHz és 3000 MHz között használható; a parabola is tápvonalon vagy tápfejen át kapja a jelet. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.4.1 és 9.5.

### M-21. — Helyes válasz: A
A véletlen hiba okait nem ismerjük, nagysága és előjele változik, de a mérés többszöri megismétlésével és statisztikai kiértékeléssel csökkenthető. A korrekció a rendszeres hibára vonatkozik, amelynek nagyságát és előjelét ismerjük. Forrás: jegyzet/11_Meresek.md, 11.2.1–11.2.2.

### M-22. — Helyes válasz: C
Z = √(L/C) = √(450·10⁻⁹ / 80·10⁻¹²) = √5625 = 75 Ω. Az 5625 Ω a gyökvonás elmaradása, a 190 Ω pedig a szorzat gyöke (√(450·80)). Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.

### M-23. — Helyes válasz: C
A légköri zajok a hideg és meleg frontok súrlódásából és a villámlás kisüléseiből erednek; nyáron a nagyon távoli zivatarok is komoly zavarást okozhatnak RH-n. A kozmikus zaj 30 MHz alatt nem hatol a légkörbe, az ipari zaj pedig nem természetes eredetű. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.1.

### M-24. — Helyes válasz: B
A KF erősítő erősítése általában automatikusan szabályozott (AGC), de ezt általában át lehet kapcsolni manuális szabályozásra, azaz MGC-re. A mikrofonerősítést a MIC GAIN állítja, a hangszóróteljesítmény korlátozása pedig nem ez a funkció. Forrás: jegyzet/07_Vevok.md, 7.5.3; jegyzet/08_Adok.md, 8.5.

### M-25. — Helyes válasz: C
A keresztműszeres SWR-mérőn kapcsolgatás nélkül, azonnal leolvasható az SWR (és a teljesítmény), mégpedig a két mutató keresztezési pontjánál. A másik két válasz a nem keresztműszeres készülék kezelését vagy teljesen téves leolvasást ír le. Forrás: jegyzet/11_Meresek.md, 11.5.1 és 11.5.1.2.

## Forgalmi feladatok

### F-1. — Helyes válasz: A
Búcsúzáskor mindig megköszönjük az összeköttetést. A QSL-küldés illik, de nem kötelező, az újabb riport nem része a búcsúzásnak. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.3.1.4).

### F-2. — Helyes válasz: B
A 88 jelentése: ölelés és csók. A szívélyes üdvözlet a 73, a sok sikert pedig az 55, amely csak német nyelvű forgalomban használatos. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4), kezdo/KEZDO-VIZSGA-ANYAGA.md (11. fejezet).

### F-3. — Helyes válasz: C
A sávváltást be kell mondani, hogy a segítséget nyújtó állomások tudják, hol keressenek minket. Tilalom nincs, a naplóbejegyzés pedig nem tájékoztatja az ellenállomást. Forrás: sajat/forgalom.md (nemzetközi vészjelek).

### F-4. — Helyes válasz: B
A szabály szerint a forgalmazás közérthető nyelven folyik, ami minden élő nyelvet, az amatőr kódokat és rövidítéseket, valamint a nemzetközi rádiótávközlési rövidítéseket jelenti. A szűkítő válaszok hibásak. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (16. fejezet).

### F-5. — Helyes válasz: A
A Q-kódok három betűsek, Q-val kezdődnek, rövidek és nyelvfüggetlenek, és kérdő és kijelentő módban is használhatók (például QRM? vagy QRM). Nem korlátozódnak a távíróra. Forrás: sajat/forgalom.md (Q-kódok), diak/12_jogi_es_forgalmi_alapok.md.

### F-6. — Helyes válasz: C
A vizsgán a vett adatokat (RST, QTH, név) kell a logba jegyezni, a hívójel és a pontos idő mellett. A készülék típusa és a teljesítmény, a lakcím és a telefonszám nem ilyen adat. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.3.3.1).

### F-7. — Helyes válasz: C
Az X betűje X-ray. A Xylophone és a Xavier nem hivatalos szavak, hiába hangzanak hihetően. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1).

### F-8. — Helyes válasz: B
Az 55 jelentése: sok sikert, de csak német nyelvű forgalomban. Az ölelés és csók a 88, az üdvözlet és minden jót a 73. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4).

### F-9. — Helyes válasz: B
A prefix nemzetközi megállapodás alapján az országot azonosítja, a suffix pedig az állomást az országon belül. A vizsgafokozatot a hívójel nem mutatja. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet).

### F-10. — Helyes válasz: A
Az RTTY nem hibamentes átvitel, erős zajnál vagy fadingnél információ veszhet el. Az újraküldés a csomagrádiós (AX.25) protokollra jellemző. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.5).

### F-11. — Helyes válasz: C
A felmenő ág 29560–29590 kHz, a lejövő 29660–29700 kHz. A 29520–29550 kHz FM szimplex rész. Forrás: jegyzet/16_Mellekletek.md (16.2).

### F-12. — Helyes válasz: A
Különleges engedélyt az a személy kaphat, aki Magyarországon kiállított CEPT fokozatú egyéni engedéllyel rendelkezik, valamint rádióamatőr közösség. A vizsgabizonyítvány önmagában nem elég, és a közösségi engedély megléte sem feltétel. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 8. § (5).

### F-13. — Helyes válasz: C
A felmenő frekvencia 7,6 MHz-cel alacsonyabb: 431,600 MHz (HG5RUG, RU736). A 446,800 MHz fordított irányú eltérés, a 437,600 MHz a régi –1,6 MHz-es shift eredménye. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.4), jegyzet/16_Mellekletek.md (16.4).

### F-14. — Helyes válasz: B
A 24929–24931 kHz az IBP (nemzetközi jeladó projekt) tartománya, jeladók számára. A DV aktivitásközpont a 24960 kHz, a CW QRP a 24906 kHz. Forrás: jegyzet/16_Mellekletek.md (16.2).

### F-15. — Helyes válasz: C
A sávterv időnként változik, ezért az aktuális változatot az internetről (IARU) érdemes ellenőrizni, és mindig kéznél tartani. A hazai szabályok mellett a sávterv a gyakorlati útmutatás. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (9. fejezet), sajat/forgalom.md (Hasznos tudnivalók).

## Biztonságtechnikai feladatok

### B-1. — Helyes válasz: C
A kezdő vizsga anyaga szerint a rádióállomás minden egységét egy szakember által elkészített földelési pontra kell külön-külön csatlakoztatni. A láncba kötés és a csak adó-vevő földelés nem felel meg ennek. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md, 5. fejezet.

### B-2. — Helyes válasz: C
A földelés lényege, hogy meghibásodás vagy statikus töltődés esetén a rádióállomás egységeinek egyike sem kerülhet más, vagy magas feszültségszintre. A teljesítmény és az SWR nem a földelés feladata. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md, 5. fejezet.

### B-3. — Helyes válasz: A
A jegyzet szerint egyenáramú baleseteknél az áram vegyi (bontó) hatása a legveszélyesebb, de a hő- és az izomhatás is jelentkezik; a váltakozó áramnál (pl. 50 Hz) az izmokra gyakorolt hatás dominál. A másik két válasz ezt felcseréli vagy leszűkíti. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.1.

### B-4. — Helyes válasz: B
A jegyzet szerint 80 mA–3 A (egyenáramnál 300 mA–3 A) a másodperc törtrésze alatt szívbénulást, szívkamraremegést okozhat. Az 1 mA körüli érték az érzetküszöb, a 15 mA körüli az elengedési áram. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.1.

### B-5. — Helyes válasz: B
A jegyzet szerint 30–40 mA (egyenáramnál 110–140 mA) már eszméletvesztést, a légzőizmok görcsét, esetleg szívbénulást és végső esetben halált is okozhat. Az 1 mA az érzetküszöb, az 5 mA pedig még az elengedési áram alatti, érzékelhető tartomány. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.1.

## Jogismereti feladatok

### J-1. — Helyes válasz: B
Alap fokozatú vagy CEPT Novice vizsgabizonyítvány alapján CEPT Novice fokozatú, HAREC fokozatú vizsgabizonyítvány alapján CEPT fokozatú egyéni engedély kapható. Az egy éves Kezdő engedély nem szerepel a rendeletben. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 8. § (6) b)–c).

### J-2. — Helyes válasz: A
Forgalmazás során a telepítési helyen az amatőr engedélyt, a forgalmi naplót és az amatőrállomás műszaki leírását, tömbvázlatát, a saját készítésű berendezések kapcsolási rajzát kell tartani. A másik két felsorolás nem a rendelet előírása. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 16. § (1).

### J-3. — Helyes válasz: B
A hatóság előzetes értesítés nélkül, helyszíni ellenőrzés során vagy térben vehető jelek alapján ellenőrizheti a rádióamatőr tevékenységét és az állomás sugárzási paramétereit, ha az előzetes értesítés az ellenőrzés eredményességét veszélyeztetné. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 19. § (1).

### J-4. — Helyes válasz: C
Az IARU sávterveket dolgoz ki az amatőrsávok belső felosztására, hogy a különböző üzemmódokban dolgozó állomások egymást ne zavarják; elve az önkéntes, önszabályozó megállapodás. A teljesítményt és a hívójel-előtagokat nem a sávterv szabályozza. Forrás: diak/12_jogi_es_forgalmi_alapok.md (Sávtervek); kezdo/KEZDO-VIZSGA-ANYAGA.md, 9. fejezet.

### J-5. — Helyes válasz: A
A QRX jelentése: várjon (várni); a frekvenciaváltás a QSY, a gyorsabb adás kérése pedig a QRQ. Forrás: jegyzet/14_Forgalmi_ismeretek.md, 14.1.2; kezdo/KEZDO-VIZSGA-ANYAGA.md, 12. fejezet.
