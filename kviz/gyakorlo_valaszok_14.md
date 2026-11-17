# Gyakorló feladatlap 14 – helyes válaszok és magyarázatok

A kérdések: [gyakorlo_kerdesek_14.md](gyakorlo_kerdesek_14.md).

> A jogi és forgalmi szabályok változhatnak: a vizsga előtt ellenőrizd az aktuális hatályos szöveget.

## Műszaki feladatok

### M-1. — Helyes válasz: B
A térerősség E = F / Q = 4·10^-3 N / 2·10^-6 C = 2000 V/m. A 2 V/m a milli és mikro előtagok elcsúszásából, a 0,0005 V/m a fordított hányados (Q / F) számításából adódik. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.1.2.

### M-2. — Helyes válasz: C
A giga 10^9, a mega 10^6, így 1 GHz = 1000 MHz, tehát 2,4 GHz = 2400 MHz. A 24 és a 240 MHz a szorzó hibás (10-es, 100-as) használatából adódik. Forrás: jegyzet/02_Matematikai_es_fizikai_alapok.md, 2.1.3.

### M-3. — Helyes válasz: A
A P = U² / R összefüggésből U = √(P · R) = √(0,25 W · 1000 Ω) = √250 ≈ 15,8 V ≈ 16 V (a megengedett áram 15,8 mA). A 250 V a P · R gyökvonás nélküli értéke, a 0,25 V pedig a teljesítmény számértéke, nem feszültség. Forrás: jegyzet/04_Alkatreszek.md, 4.1.1.

### M-4. — Helyes válasz: B
A P = I² · R összefüggésből I = √(P / R) = √(0,5 W / 200 Ω) = √0,0025 = 0,05 A = 50 mA. A 2,5 mA a P / R hányados gyökvonás nélkül, az 500 mA pedig tízszeres nagyságrendi hiba. Forrás: jegyzet/04_Alkatreszek.md, 4.1.1.

### M-5. — Helyes válasz: A
A logaritmikus dB-skála tulajdonsága, hogy két egymás utáni fokozat eredő erősítése a két erősítés összege, nem a szorzatuk; ez megkönnyíti a számítást. A szorzás a hányadosként (nem dB-ben) megadott erősítésekre igaz. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.4.1.

### M-6. — Helyes válasz: C
A nem szinuszos jelek, köztük a négyszögjel, a névleges frekvenciánál magasabb frekvenciájú komponenseket (felharmonikusokat) is tartalmaznak, a négyszögjel kifejezetten sokat. A tiszta szinuszjelben nincs felharmonikus. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.3.3.

### M-7. — Helyes válasz: A
Az akkumulátorok kis belső ellenállásuk miatt nagy áram leadására képesek, és ilyenkor nincs káros mértékű visszahatás. Nagy belső ellenálláson a terhelés alatt nagy feszültség esne, a kapocsfeszültség pedig legfeljebb a forrásfeszültséggel egyenlő. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.2.1.

### M-8. — Helyes válasz: C
A határfrekvencia az a kitüntetett pont, ahol a kapacitás impedanciája pontosan megegyezik az ellenállás értékével: f = 1 / (2π · R · C). A reaktancia csak igen nagy frekvencián tart a nullához, a töltődés pedig időbeli folyamat. Forrás: jegyzet/04_Alkatreszek.md, 4.2.5.

### M-9. — Helyes válasz: C
A GHz-es tartományban fellépő jelenségek miatt a nagyfrekvenciás diódák eltérő kialakításúak (pl. Gunn, IMPATT), és vannak rezgéskeltésre is alkalmas diódák. A Zener-dióda stabilizálásra, a varicap dióda feszültséggel hangolt rezgőkörökhöz való. Forrás: jegyzet/04_Alkatreszek.md, 4.5. és 4.5.2.

### M-10. — Helyes válasz: B
A transzformátor feszültség-, áram- és impedanciaillesztésre egyaránt használható; az impedanciaillesztést nagyfrekvenciás körökben szokták alkalmazni, a hálózati transzformátor a feszültségillesztésre példa. Forrás: jegyzet/04_Alkatreszek.md, 4.4.3.

### M-11. — Helyes válasz: C
Az AM mélység (m = Um / Uv) legfeljebb 1, azaz 100 % lehet, efölött a jel torzul; az FM löket (Hz-ben) elvileg tetszőleges nagyságú. A két mennyiség az adott üzemmód elsődleges jellemzője. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.3.

### M-12. — Helyes válasz: B
A két diódás kétutas egyenirányító mindkét félperiódust kihasználja, de két egyforma féltekercset, azaz középleágazásos transzformátort igényel. A kimenete is lüktet, ezért simítás kell; a csak pozitív félperiódus az egyutas kapcsolás jellemzője. Forrás: jegyzet/06_Aramkorok.md, 6.3.1.1.

### M-13. — Helyes válasz: A
A két legismertebb LC oszcillátor-kapcsolás csak a csatolt rezgőkör kialakításában különbözik: a Hartley jellegzetessége az induktív, a Colpitts-kapcsolásé a kapacitív csatolás. Frekvenciameghatározó elemük LC rezgőkör, nem kvarc. Forrás: jegyzet/06_Aramkorok.md, 6.5.1.

### M-14. — Helyes válasz: A
A vevők hangfrekvenciás erősítői általában kétfokozatúak (elő- és végerősítő), és a hangszórónak legfeljebb 1–2 W teljesítményt szolgáltatnak. Az 50–100 W adóteljesítmény nagyságrendje, a 10 mW pedig a meghajtó fokozat bemenő teljesítménye. Forrás: jegyzet/07_Vevok.md, 7.5.5.

### M-15. — Helyes válasz: C
Az omega illesztés a gamma illesztés elektromosan javított változata (+1 kondenzátor), elsősorban olyan RH antennákhoz, ahol a gamma-tag bilincsének tologatása veszélyes lenne. A kerülővezeték egy másik, URH-s megoldás. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.7.3.

### M-16. — Helyes válasz: A
Multiméterrel ellenállást feszültség alatt nem szabad mérni, a mérendő ellenállást célszerű az áramkörből kivenni. A feszültség alatti mérés a mérést meghamisítja, és károsíthatja a műszert. Forrás: sajat/meresek.md (ellenállás mérése; jegyzetek).

### M-17. — Helyes válasz: B
A szándékos rádiózavarokat a vevők ellen alkalmazzák abból a célból, hogy a hasznos jel vételét megakadályozzák; ilyenek a rosszindulatú amatőr zavarások is. A hibás beállításból eredő zavar nem szándékos, a villámlás pedig természetes zaj. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.1.

### M-18. — Helyes válasz: B
URH-n a rádióhullámok a levegőrétegek eltérő törésmutatója miatt görbülnek, ezért a rádióhorizont számításához a Földsugár 4/3-szorosát vesszük. Az ionoszféra szerepe a közvetlen (LOS) terjedésnél elhanyagolható. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.1.

### M-19. — Helyes válasz: C
Egy fokozat legfeljebb 4–5-szörös szorzásra képes; 4-szeres maximummal két fokozat legfeljebb 4·4 = 16-szoros szorzást ad, ami kevés a 24-hez, három fokozat viszont már elég (pl. 2·3·4). A 6 fokozat szükségtelenül sok. Forrás: jegyzet/08_Adok.md, 8.3.3.

### M-20. — Helyes válasz: B
√(Pr/Ph) = √(10/90) = 1/3, így SWR = (1 + 1/3)/(1 – 1/3) = (4/3)/(2/3) = 2. A 9 a Ph/Pr hányados, az 1,5-ös érték pedig csak a haladó teljesítmény kb. 4 %-ának reflexiójánál adódna. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.3.

### M-21. — Helyes válasz: A
Szabad térben λ = 300/50 = 6 m; a kábelben a sebesség, így a hullámhossz is a rövidülési tényező szorosára csökken: 6 · 0,8 = 4,8 m. A 6 m a szabadtéri érték, a 7,5 m pedig a 6/0,8 osztás eredménye, ami hibás. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.1.

### M-22. — Helyes válasz: A
40 dB feszültségben 100-szoros arányt jelent, így 50 µV · 100 = 5000 µV. A 2000 µV a 40-szeres szorzás, az 500 µV pedig +20 dB-nek felelne meg. Forrás: jegyzet/07_Vevok.md, 7.5.7.

### M-23. — Helyes válasz: C
A GDO hangolható rezgőkörös oszcillátor, amelynek tekercsét a mérendő passzív rezgőkörhöz közelítve a rezonanciafrekvencia mérhető; ilyenek az oszcillátorok, erősítők, szűrők rezgőkörei és az antennák is. Az SWR-t SWR-mérővel, a teljesítményt teljesítménymérővel mérjük. Forrás: jegyzet/11_Meresek.md, 11.4.5.

### M-24. — Helyes válasz: C
Hangfrekvenciás erősítő bemenetére kerülve a rádiófrekvenciás jel zavart okozhat, mert az erősítő képes valamennyire demodulálni, és az megjelenik a hangszórókban. Az erősítő nem bontja harmonikusokra, és nem megy tönkre. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.2.

### M-25. — Helyes válasz: B
Az antennahangoló csökkentheti a felharmonikusokat, de az interferenciát nem szünteti meg; helytelen antennatelepítésnél vagy tápvonalnál magát az okot kell megszüntetni (például kimeneti aluláteresztő szűrővel). A 40 m-es dipólus 10 m-es használata és a szimmetrikus tápvonal (beépített ballunnal) hangolóval megoldható. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.8.2–9.6.8.3.

## Forgalmi feladatok

### F-1. — Helyes válasz: C
A QSD válaszban azt jelenti, hogy az adó billentyűzése hibás. A halkulás a QSB, a lassabb adás a QRS kódja. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2).

### F-2. — Helyes válasz: B
A QSL lap az összeköttetés nyugtázása, igazolása, bemutatása számos rádióamatőr diploma feltétele. Engedélynek és hívójel-igénylésnek nincs köze hozzá. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (15. fejezet), sajat/forgalom.md (QSL lapok).

### F-3. — Helyes válasz: B
Az OM kedves barátom, öregem (megszólítás). A feleség az XYL, a női operátor az YL. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4), sajat/forgalom.md (bevezető).

### F-4. — Helyes válasz: C
Az alapelvek szerint riportot, QTH-t és az operátor nevét adjuk át, ehhez jöhet a rádió, az antenna és a teljesítmény. Lakcímet, telefonszámot, engedélyadatokat nem szokás közölni. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.3.1.3, 14.3.2.2).

### F-5. — Helyes válasz: A
Magyarországon télen a helyi idő UTC+1, ezért 18:00 helyi időnek 17:00 UTC felel meg. A 16:00 nyári (UTC+2), a 19:00 pedig a fordított irányú számítás eredménye. Forrás: sajat/forgalom.md (idő megadása).

### F-6. — Helyes válasz: C
Kísérletek során legalább 10 percenként köteles a rádióamatőr a hívójelét közölni. A 30 perc és az 1 óra túl ritka. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.3), kezdo/KEZDO-VIZSGA-ANYAGA.md (16. fejezet).

### F-7. — Helyes válasz: A
A QSL válaszban azt jelenti: adok önnek vételi nyugtázást. A közvetlen forgalmazásra a QSO válasza utal, a pontos időt a QTR adja. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2).

### F-8. — Helyes válasz: B
Az E betűje Echo. Az England a nem hivatalos DX-ábécé szava, az Edison nincs az ábécében. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1).

### F-9. — Helyes válasz: B
A 7175–7200 kHz minden üzemmódú rész, kontinensek közötti összeköttetésekre. A 7000–7025 kHz a CW-verseny, a 7040–7047 kHz a keskenysávú digimód-rész. Forrás: jegyzet/16_Mellekletek.md (16.2).

### F-10. — Helyes válasz: A
A digimódok szinte mindig USB-ben mennek, még 10 MHz alatt is, szemben a fónia SSB-vel, ahol 10 MHz alatt LSB a szokás. A DSB nem SSB-megoldás. Forrás: sajat/forgalom.md (Hasznos tudnivalók).

### F-11. — Helyes válasz: C
A 430–440 MHz a 70 cm-es sáv, a HG3RUC a 70 cm-es átjátszók táblázatában szerepel. A 2 m-es sáv 144–146 MHz, a 23 cm-es 1240–1300 MHz. Forrás: jegyzet/16_Mellekletek.md (16.4), kezdo/KEZDO-VIZSGA-ANYAGA.md (9. fejezet).

### F-12. — Helyes válasz: B
A HAMNET a mikrohullámú, magasabb frekvenciákat használja, pl. a 13 cm-es és a 6 cm-es sávot, nagysebességű TCP/IP adatátvitelre. A rövidhullámú és az URH-sávok nem alkalmasak ekkora sávszélességre. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.4.1).

### F-13. — Helyes válasz: C
A PSK31 jelsebessége 31,25 baud, a sávszélessége kb. 31 Hz. A 300 és 1200 baud az RH, illetve URH pakett jellemző értéke. Forrás: diak/14_korszeru_technika.md (PSK31), jegyzet/15_Digitalis_uzemmodok.md (15.1.1).

### F-14. — Helyes válasz: A
A varicode változó hosszúságú, önszinkronizáló karakterkód, ezért külön hibajavítás nélkül is működik. A rögzített 5 bites Baudot-kódot az RTTY használja. Forrás: diak/14_korszeru_technika.md (PSK31), jegyzet/15_Digitalis_uzemmodok.md (15.5).

### F-15. — Helyes válasz: A
A HG5RUD a táblázatban D-Star üzemmódú. A HG5RUC Budapesten DMR, a HG0RUA, HG4RUC, HG7RUA és HG9RUA pedig C4FM/FM. Forrás: jegyzet/16_Mellekletek.md (16.5).

## Biztonságtechnikai feladatok

### B-1. — Helyes válasz: C
A segélynyújtás szabályai szerint egyidejűleg értesíteni kell a mentőket vagy az azonnal elérhető orvost, szükség szerint az áramszolgáltatót és a műszaki mentés érdekében esetleg a tűzoltókat is. A rendőrség és a hatóság értesítése nem szerepel az előírt teendők között. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.2.

### B-2. — Helyes válasz: A
A műszaki mentés (kiszabadítás az áramkörből) után meg kell állapítani, hogy az áramütés milyen következményekkel járt (diagnózis), és ezután kell megkezdeni a megállapított hatásnak megfelelő elsősegélyt. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.2.

### B-3. — Helyes válasz: B
A jegyzet szerint az elengedési áram értéke 50–60 Hz-es váltakozó áramnál kb. 15 mA, egyenáramnál kb. 70–80 mA. Az 1 mA az érzetküszöb váltakozó árammal, nem az elengedési áram. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.1.

### B-4. — Helyes válasz: B
A jegyzet szerint a nagy áramú villámot sokszor kisebb kisülés előzi meg, amely ionizálja a levegőt, így mintegy előkészíti a következő, nagy áramú villám útját. Az ionizált levegő vezetőképessége nő, nem csökken. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.11.

### B-5. — Helyes válasz: C
A jegyzet a feltöltött kondenzátoros veszélyek mellett az elektrosztatikus feltöltődést is megemlíti, amely emberi szervezeten keresztül sülhet ki, és áramütéses balesetet okozhat. A nagyfeszültségű hálózathoz kötés nem feltétel. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.8.

## Jogismereti feladatok

### J-1. — Helyes válasz: B
Ha az engedélyes a bejelentési kötelezettségének nem tesz eleget, a hatóság határidő kitűzésével felszólítja a pótlásra; ha a határidőn belül sem teljesít, az amatőr engedélyt határozatban visszavonja. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 20. § (1).

### J-2. — Helyes válasz: A
A hívójel az engedélyeshez kötött, és a hatóság jelöli ki az amatőr engedélyben. Szabad választásról vagy átruházásról a rendelet nem szól, a kijelölés pedig nem az érdekvédelmi szervezet feladata. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 12. § (1)–(2).

### J-3. — Helyes válasz: C
A QRV kérdésként azt jelenti: vételkész vagy-e; a frekvencia foglaltságát a QRL, a „ki hív engem?” kérdést a QRZ fejezi ki. Forrás: jegyzet/14_Forgalmi_ismeretek.md, 14.1.2; kezdo/KEZDO-VIZSGA-ANYAGA.md, 12. fejezet.

### J-4. — Helyes válasz: B
Általános hívás előtt meg kell győződni arról, hogy szabad-e a frekvencia (fóniában „Szabad a frekvencia?”, CW-ben „QRL? DE hívójel” vagy „QRX? DE hívójel”). A nagy teljesítmény felesleges is, mert a teljesítménynek az összeköttetés biztonságos fenntartásához szükséges értéket nem kell meghaladnia. Forrás: jegyzet/14_Forgalmi_ismeretek.md, 14.3.1.1 és 14.3.2; jogi/15_2013_IX_25_NMHH_rendelet.md, 18. § (2).

### J-5. — Helyes válasz: C
A kezdő vizsga anyaga szerint a 9A Horvátország előtagja; Szlovéniáé az S5, Montenegróé a 4O. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md, 10. fejezet (Néhány ország prefixei).
