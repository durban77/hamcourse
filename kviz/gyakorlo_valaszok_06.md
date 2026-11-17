# Gyakorló feladatlap 06 – helyes válaszok és magyarázatok

A kérdések: [gyakorlo_kerdesek_06.md](gyakorlo_kerdesek_06.md).

> A jogi és forgalmi szabályok változhatnak: a vizsga előtt ellenőrizd az aktuális hatályos szöveget.

## Műszaki feladatok

### M-1. — Helyes válasz: C
A két sorba kötött 10 nF eredője (10 · 10) / (10 + 10) = 5 nF; ehhez a párhuzamos 4,7 nF-ot hozzáadva 9,7 nF az eredő. A 24,7 nF az összes kapacitás összege, a 2,4 nF mindhárom sorba kapcsolt eredője. Forrás: jegyzet/04_Alkatreszek.md, 4.2.3.

### M-2. — Helyes válasz: C
A határfrekvencia f = 1 / (2π · R · C) = 1 / (2π · 4700 Ω · 10 nF) = 1 / (2,95 · 10^-4) ≈ 3,4 kHz. A 21,3 kHz a 2π nélküli számítás (1 / RC), a 340 Hz tízszeres C értéknek felelne meg. Forrás: jegyzet/04_Alkatreszek.md, 4.2.5.

### M-3. — Helyes válasz: B
Az effektív érték a csúcsérték osztva √2-vel: 170 V / 1,414 ≈ 120 V. A 240 V a √2-vel való szorzás, a 85 V a 2-vel való osztás eredménye. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.3.2.

### M-4. — Helyes válasz: A
A terhelhetőség Itmax = Izmax – Izmin = 40 mA – 5 mA = 35 mA. A 45 mA az összeg, a 200 mA a szorzat; egyik sem a hasznosítható terhelőáram. Forrás: jegyzet/06_Aramkorok.md, 6.3.2.1.

### M-5. — Helyes válasz: B
A galvánelem ún. primer elem: a bennük felhalmozott anyagok elfogyása után nem tölthető újra, eldobható. Az újratölthetőség az akkumulátorok (szekunder elemek) tulajdonsága, amelyek egyenárammal tölthetők. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.2.1.

### M-6. — Helyes válasz: C
Mágneses töltések nincsenek, ezért a jelenség nem magyarázható az elektromos árnyékoláshoz hasonlóan; a változó mágneses tér a fémben örvényáramokat indukál, és a tér nehezen hatol át a vezető felületen. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.1.3.1.

### M-7. — Helyes válasz: A
Azonos alapú hatványok szorzásakor a kitevők összeadódnak: 10^3 · 10^-6 = 10^(3 – 6) = 10^-3. A –18 a kitevők szorzásából, a 9 az előjel figyelmen kívül hagyásából adódik. Forrás: jegyzet/02_Matematikai_es_fizikai_alapok.md, 2.2.1.

### M-8. — Helyes válasz: B
Az elektrolit kondenzátor felépítése hasonlít a papírkondenzátoréhoz, de a dielektrikum nem a papír, hanem az alumínium felületén kiképzett oxidréteg. Ez magyarázza, hogy az elko polarizált. Forrás: jegyzet/04_Alkatreszek.md, 4.2.2.3.

### M-9. — Helyes válasz: B
A tekercs jósági tényezője Q = ωL / Rs, azaz a reaktív és az ohmos (veszteségi) összetevő aránya adott frekvencián; kis soros veszteség esetén nagy a Q. Nem két alkatrész reaktanciájának különbsége és nem geometriai arány. Forrás: jegyzet/04_Alkatreszek.md, 4.3.4.

### M-10. — Helyes válasz: A
Az AM-DSB-ben mindkét oldalsáv ugyanazt az információt viszi, a vivő pedig információt nem; ezért is született az SSB. A sávszélessége a moduláló jel legnagyobb frekvenciájának kétszerese, nem a fele. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.1.2.

### M-11. — Helyes válasz: C
A baud-sebesség a szimbólumsebesség. A bitsebesség ettől csak akkor egyezik meg, ha egy szimbólum egy bitet visz; többállapotú modulációnál (pl. QAM) a bitsebesség nagyobb. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.5.5.

### M-12. — Helyes válasz: A
A sávszélesség B = f0 / Q, tehát a jósági tényezővel fordítottan arányos: nagyobb Q mellett keskenyebb a rezonanciagörbe, a kör szelektívebb. Forrás: jegyzet/06_Aramkorok.md, 6.1.4.

### M-13. — Helyes válasz: B
A PLL VCO-ból, frekvenciaosztóból, fázisdetektorból és aluláteresztő szűrőből álló szabályozási hurok. A keverő–BFO–szűrő felépítés az SSB demodulátoré, a dióda és RC tag pedig az egyszerű AM demodulátoré. Forrás: jegyzet/06_Aramkorok.md, 6.5.4.; 6.6.1.–6.6.2.

### M-14. — Helyes válasz: C
Az S3 és az S9 között 6 S-érték van, ez 6 · 6 dB = 36 dB. Az 54 dB a 9 · 6, a 18 dB pedig a 3 · 6 szorzat – ezek nem a két érték különbségét adják. Forrás: jegyzet/07_Vevok.md, 7.5.7.

### M-15. — Helyes válasz: B
Elméleti számítások és mérések szerint a félhullámú dipólus E síkú –3 dB-es pontjainak távolsága kb. 78°. A 360° a H síkra jellemző (ott körsugárzó), a 20° pedig a dipólushoz képest sokkal élesebb irányítottságot jelentene. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1.5.

### M-16. — Helyes válasz: A
Z = √(L/C) = √(250·10⁻⁹ / 100·10⁻¹²) = √2500 = 50 Ω. A 2500 Ω a gyökvonás elhagyásából, a 158 Ω pedig a hányados helyett a szorzat gyökének vételéből adódik. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.

### M-17. — Helyes válasz: B
Hosszú tápvonal módosíthatja az illesztetlenség értékét, ezért az antenna SWR-jét rövid tápvonallal mérjük. Műterheléssel lezárva nem az antenna, hanem csak a tápvonal állóhullám-arányát mérnénk. Forrás: jegyzet/11_Meresek.md, 11.5.1.2.

### M-18. — Helyes válasz: A
A torzító végfokozat széles frekvenciasávban sugároz nemkívánatos jeleket – ez az ún. splatter („fröcsögés”), amely a sávban forgalmazó többi állomást zavarja. A zajzár működése vevőoldali jelenség, a zivatar okozta recsegés pedig természetes (QRN) zaj. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.1.

### M-19. — Helyes válasz: B
A rádióhorizontot a földsugár (állandó) és az antennamagasság határozza meg, így az antenna magasabbra telepítésével nő. Az adóteljesítmény csak a jelszintet befolyásolja, a horizontot nem. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.1.

### M-20. — Helyes válasz: C
U = √(P·R) = √(100·50) = √5000 ≈ 70,7 V. A 100 V ennek a csúcsértéke (70,7·√2), az 1,41 V pedig a √(P/R), vagyis az áram értéke amperben. Forrás: jegyzet/11_Meresek.md, 11.4.3.2.

### M-21. — Helyes válasz: A
A KF erősítőkben manapság már nem LC szűrőket, hanem kristály- és mechanikus szűrőket alkalmaznak, az integrált áramkörös erősítőkben pedig kerámia szűrőket. Az RC aluláteresztő szűrő nem adna megfelelő szelektivitást. Forrás: jegyzet/07_Vevok.md, 7.5.3.

### M-22. — Helyes válasz: C
Az Amphenol UHF csatlakozó rövidhullámon közkedvelt, a legtöbb kábeltípussal használható, és nagy teljesítményt bír. Az SMA és a BNC csak kis teljesítmény átvitelére alkalmas, hordozható készülékekhez és mérőműszerekhez használják. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.5.3.

### M-23. — Helyes válasz: A
Ohm törvénye szerint R = U/I = 6 V / 0,02 A = 300 Ω. A 120 Ω a szorzat (6·20), a 3,3 mΩ pedig az I/U hányados, mindkettő hibás. Forrás: jegyzet/11_Meresek.md, 11.4.2.1.

### M-24. — Helyes válasz: B
A vevő hibái közé tartozik például a nem megfelelő bemeneti szűrő, az AGC hibás működése, a rossz tükörfrekvenciás elnyomás és a zajzár hibája. A másik két válasz az adóberendezés hibás működésének jellemző oka. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.3.

### M-25. — Helyes válasz: C
Nappal az F réteg a kb. 200 km magasságú F1 és a 220–400 km magasságú F2 rétegre bomlik; éjszaka a két réteg egybeolvad, és az alja kb. 300 km-re emelkedik. A másik két válasz nem felel meg a leírásnak. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.5.2.

## Forgalmi feladatok

### F-1. — Helyes válasz: A
A QTR a pontos idő kérdése (válaszban: Pontos idő…). A QTH a telepítési hely, a QRG a pontos frekvencia. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2).

### F-2. — Helyes válasz: A
Az IRC (International Reply Coupon) a nemzetközi válaszdíj-szelvény, amelynek ellenében bármely ország postahivatala felvesz egy nemzetközi levelet. A másik két válasz nem ezt jelenti. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (15. fejezet).

### F-3. — Helyes válasz: B
K = Kilo, D = Delta, R = Romeo. A Kilowatt, a Radio és a Denmark a nem vizsgaanyag DX-ábécé szavai, ezeket hívójel betűzésekor nem használjuk hivatalos betűzésként. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1), sajat/forgalom.md.

### F-4. — Helyes válasz: B
A GE jelentése: jó estét. A GM jó reggelt, a GN jó éjszakát. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4).

### F-5. — Helyes válasz: C
A magyar ábécében a H betűje Helén. A Hanna és a Henrik nem hivatalos betűzőszó. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1).

### F-6. — Helyes válasz: C
A mozgó és a különleges amatőrállomás mentesül a naplózás alól, de a versenyállomás és az alkalmi amatőrállomás kivétel, ezeknél kell napló. A másik két állomás mentes. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (17. fejezet), diak/12_jogi_es_forgalmi_alapok.md (forgalmi napló).

### F-7. — Helyes válasz: A
Az RPT kérem ismételje (vagy ismétlem). Az RPRT tudósítást jelent, az RST a vételjellemzés (olvashatóság, jelerősség, hangszín). Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.3 és 14.1.4).

### F-8. — Helyes válasz: C
CW-ben rövidítéseket használunk, nyílt szöveget soha: PSE RPT UR QTH (vagy QTH?). A másik két megoldás nyílt szöveg. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.3.2.2).

### F-9. — Helyes válasz: C
A hívójelet a hatóság jelöli ki az amatőr engedélyben, és az engedélyeshez kötött. A kérelmező nem választhatja szabadon, a nemzeti szervezet pedig csak véleményt ad bizonyos különleges engedélyekhez. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 12. § (1)–(2).

### F-10. — Helyes válasz: A
A kezdők 40 m-es sávja 7050–7200 kHz, tehát a 7000–7050 kHz-es rész (amely a sávtervben szerepel) számukra nem engedélyezett. A 7100 kHz csak a sáv közepe. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (9. fejezet), jegyzet/16_Mellekletek.md (16.2).

### F-11. — Helyes válasz: B
Az AX.25 csomag maximális hossza 256 byte plusz a fejléc. A 64 és az 1024 byte nem a protokoll értéke. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.1.1).

### F-12. — Helyes válasz: A
A felmenő frekvencia, amin mi adunk, 600 kHz-cel alacsonyabb: 145,100 MHz (a HG3RVF táblázati adata is ez, RV56). A 146,300 MHz fordított irányú shift, a 138,100 MHz a 70 cm-es sáv 7,6 MHz-es eltérésének tévesztése. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.4), jegyzet/16_Mellekletek.md (16.3).

### F-13. — Helyes válasz: B
A GPS-idő a helymeghatározó műholdak rádiójeléből vett pontos idő. Az NTP számítógépes hálózaton, a DCF77 időjel-adón keresztül ad időt. Forrás: sajat/forgalom.md (Idő megadása).

### F-14. — Helyes válasz: C
A moduláció nélküli vivő 2 percen túli sugárzása tilos, kivéve a rádióamatőr jeladó állomást, amely az azonosítás közti időszakban modulálatlan vivőt sugároz. Átjátszó és versenyállomás nem kivétel. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 4. § (4) b), 15. §; kezdo/KEZDO-VIZSGA-ANYAGA.md (16. fejezet).

### F-15. — Helyes válasz: B
Az UR–UZ tartomány ukrán. Románia előtagja az YO–YR, Oroszországé az R és RA–RZ. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet), sajat/forgalom.md.

## Biztonságtechnikai feladatok

### B-1. — Helyes válasz: A
Az elkerítés a védendő berendezést kerítéssel, korláttal veszi körül: nem akadályozza meg, hogy az üzemszerűen feszültségmentes részek veszélyes feszültség alá kerüljenek, de a véletlen érintés ellen véd. Az automatikus leválasztás a biztosítók és kapcsolók feladata. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.3.2.2.

### B-2. — Helyes válasz: C
A jegyzet kifejezetten kimondja, hogy a kettős szigetelésű berendezést nem szabad leföldelni; a megkettőzött szigetelés az üzemi szigetelés meghibásodása esetén is véd. A villámvédelmi földelést egyébként sem szabad érintésvédelmi célra használni. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.3.2.2 és 13.11.

### B-3. — Helyes válasz: B
A védővezető normál üzemben általában nem vezet áramot, feladata testzárlatkor kezdődik; ekkor a védelem hatásossága a védővezető folytonosságán és kifogástalan állapotán múlik. A szín a bekötés azonosítását segíti, a hatásosságot nem határozza meg. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.4.

### B-4. — Helyes válasz: A
A védővezetős rendszerek elmaradhatatlan tartozéka a biztosítórendszer, amely testzárlat esetén a nagy zárlati áramtól kiold, és leválasztja a készüléket a hálózatról. A másik két válasz nem a védelem tényleges működését írja le. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.4.

### B-5. — Helyes válasz: B
Jó földeléstől kis földelési ellenállást várunk; ha ez egy földelővel nem érhető el, több földelőt telepítenek és összekötik őket. A vékonyabb vezeték csak növelné az ellenállást, a földelés elhagyása pedig szembemegy az érintésvédelem céljával. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.4.

## Jogismereti feladatok

### J-1. — Helyes válasz: C
A rendelet szerint kimentett távolmaradás esetén a jelentkező egy éven belül, egy alkalommal kérheti újabb vizsgaidőpont kitűzését a vizsgadíj ismételt megfizetésének kötelezettsége nélkül. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 6. § (3).

### J-2. — Helyes válasz: B
A rendelet szerint közérthető nyelvnek számít minden élő nyelv, a rádióamatőrök által használt kódok és rövidítések, valamint a nemzetközileg elfogadott rádiótávközlési rövidítések. A két szűkítő válasz tehát hibás. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 15. § (4).

### J-3. — Helyes válasz: A
A jegyzet szerint rádióamatőröknél alapszabály, hogy mindig elsőbbsége van annak, aki az adott frekvenciát már használja (vészhelyzet kivételével), ezért ha a mondandó ráér, meg kell várni a végét. A teljesítmény és a hívójel közlésének sorrendje nem ad elsőbbséget. Forrás: jegyzet/14_Forgalmi_ismeretek.md, 14.2.3.

### J-4. — Helyes válasz: B
A közösségi és a különleges amatőr engedély (a rádiós tájfutó versenyen elhelyezett állomás kivételével) az engedélyben feltüntetett telepítési helyen érvényes; az egyéni engedély érvényes Magyarország teljes területén. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 11. § (1).

### J-5. — Helyes válasz: A
A CQ általános (mindenkinek szóló) hívás, a DX nagytávolságú összeköttetés; nagytávolságú összeköttetéshez a CQ helyett CQ DX-et adunk. Az adás végét az AR/SK jelzi. Forrás: jegyzet/14_Forgalmi_ismeretek.md, 14.3.2.1 és 14.1.4; kezdo/KEZDO-VIZSGA-ANYAGA.md, 11. fejezet.
