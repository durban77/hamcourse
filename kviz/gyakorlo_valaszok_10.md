# Gyakorló feladatlap 10 – helyes válaszok és magyarázatok

A kérdések: [gyakorlo_kerdesek_10.md](gyakorlo_kerdesek_10.md).

> A jogi és forgalmi szabályok változhatnak: a vizsga előtt ellenőrizd az aktuális hatályos szöveget.

## Műszaki feladatok

### M-1. — Helyes válasz: C
A feszültségerősítés dB-ben au = 20 · lg(Uki / Ube); 5-szörös erősítésre 20 · lg 5 ≈ 14 dB. A 14-szeres arány kb. 23 dB, a 100-szoros pedig 40 dB. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.4.1.

### M-2. — Helyes válasz: A
A működési idő a kapacitás és az áram hányadosa: 7,5 Ah / 1,5 A = 5 h. A 11,25 a szorzat, a 0,2 a fordított hányados. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.2.1.

### M-3. — Helyes válasz: A
A forrás szerint a legmagasabb frekvenciakomponens kétszeresével történő mintavételezés után a jel még elvileg visszaállítható: 2 · 15 kHz = 30 kHz. A gyakorlatban ennél magasabb frekvenciával mintavételeznek. A 7,5 kHz a fele, a 15 kHz pedig kevés lenne. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.3.

### M-4. — Helyes válasz: B
A disszipált teljesítmény a kollektoráram és a kollektor–emitter feszültség szorzata: 12 V · 0,25 A = 3 W. A 48 W a U / I, a 0,02 W az I / U hányados. Hűtésről gondoskodni kell. Forrás: jegyzet/04_Alkatreszek.md, 4.8.2.

### M-5. — Helyes válasz: C
A soros kapcsolás feltétele, hogy a cellák egymással ellentétes polaritású kapcsait kössük össze; ekkor az eredő feszültség a cellák számával arányosan nő. Általában csak azonos típusú és kapacitású cellákat ajánlott sorba kapcsolni. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.2.3.

### M-6. — Helyes válasz: B
Rádióhullámoknak a 30 kHz – 3000 GHz közé eső frekvenciájú elektromágneses hullámokat nevezzük. A 20 Hz – 20 kHz a hallható hangtartomány, a 3–30 MHz pedig csak a rövidhullámú tartomány. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.1.

### M-7. — Helyes válasz: A
A zárlatos kondenzátor a legveszélyesebb, mert az áramkörben károsíthatja az alkatrészeket (egyenirányító, tápegység). A kiszáradt, kapacitását vesztett vagy szakadt kondenzátor kevésbé veszélyes, egyszerűen nem teljesíti a feladatát. Forrás: jegyzet/04_Alkatreszek.md, 4.2.2.3.

### M-8. — Helyes válasz: C
Az impulzustranszformátor főleg kapcsolóüzemű tápegységekben használatos, bemenetére nagyfrekvenciás négyszög-impulzusok kerülnek. Simításra kondenzátort használnak, a regeneráláshoz pedig nincs szükség transzformátorra. Forrás: jegyzet/04_Alkatreszek.md, 4.4.3.1.

### M-9. — Helyes válasz: B
Ha a kimenő jel nemkívánatos úton visszajut a bemenetre, az erősítő oszcillálni kezd, bemenő gerjesztés nélkül is kimenő jelet ad; ekkor nem használható erősítésre. Tudatosan előidézve ez az oszcillátor működési elve. Forrás: jegyzet/04_Alkatreszek.md, 4.5.12.

### M-10. — Helyes válasz: A
A frekvencialöket a moduláló jel amplitúdójától függ, ezért azonos amplitúdójú, különböző frekvenciájú jelek esetén állandó; a moduláló frekvencia a spektrumvonalak sűrűségét változtatja. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.3.

### M-11. — Helyes válasz: B
A forrás táblázata szerint 25 kHz-es csatornatávolsághoz ±5 kHz, 20 kHz-eshez ±4 kHz, 12,5 kHz-eshez ±2,5 kHz, 10 kHz-eshez ±2 kHz löket tartozik. A ±5 és ±4 kHz a szélesebb csatornákhoz tartozik. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.3. (5.2-6. ábra)

### M-12. — Helyes válasz: B
A sávzáró szűrő a két határfrekvencia közötti jeleket nem engedi át. A határfrekvencia alattit az aluláteresztő, a két határfrekvencia közöttit a sáváteresztő szűrő engedi át. Forrás: jegyzet/06_Aramkorok.md, 6.2.2.

### M-13. — Helyes válasz: C
Távíró jelek vételénél teljesen mindegy, hogy a BFO jele a KF felett vagy alatt van; az eltérés kb. 1 kHz, ez adja a hallható hangmagasságot. Azonos frekvencia esetén nem hallanánk lebegést. Forrás: jegyzet/06_Aramkorok.md, 6.6.2.

### M-14. — Helyes válasz: B
Amatőr berkekben nagyon elterjedt a rezgőkvarcokból épített kristályszűrő: ez a legolcsóbb megoldás, minősége közepes, fizikai helyigénye relatíve nagy. Nem LC alapú, és nem hangolható a vételi frekvenciával. Forrás: jegyzet/07_Vevok.md, 7.5.3.

### M-15. — Helyes válasz: C
A félhullámú dipólusra épülő RH antennák közös tulajdonsága, hogy hosszuk λ/2 és fő sugárzási irányuk a hossztengelyre merőleges; teljesítőképességük azonos, a különbség csupán a táplálás módjában van. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.3.

### M-16. — Helyes válasz: B
Ha a mért jel szintek között ingadozik, nehéz a szélső értékeket leolvasni és feljegyezni, ezért vannak olyan digitális műszerek, amelyeken a pillanatnyi érték tartása (HOLD) és a maximális érték (PEAK) kijelzésére szolgáló funkció található. Forrás: jegyzet/11_Meresek.md, 11.3.1.

### M-17. — Helyes válasz: B
A zavarás megelőzésének alapszabálya, hogy adás előtt mindig belehallgatunk a sávba. Az azonnali CQ és a teljesítménynövelés éppen más állomások zavarását okozhatja. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.4.1.

### M-18. — Helyes válasz: C
A 10 dBd tízszeres teljesítménysűrűség-növekedést jelent a dipólushoz képest, így a szükséges adóteljesítmény tizedére, 10 W-ra csökkenhet. A 90 W a dB-érték levonása (100 – 10), az 1 W pedig 20 dB-nek felelne meg. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1.6.

### M-19. — Helyes válasz: A
A térerő nemcsak eltolási, hanem a talajban vezetési áramot is létrehoz; jó vezetőképességű talajnál vagy hosszabb hullámnál az eltolási áram elhanyagolható a vezetési mellett, és ennek köszönhető a felületi hullámterjedés. Az ionoszféra ebben a módban nem vesz részt. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.3.

### M-20. — Helyes válasz: A
Az SSB jelnek megfelelő spektrumúnak kell lennie: ha szélesebb az előírtnál, zavarokat okozunk, ha keskenyebb, az adás minősége nem lesz megfelelő. Ezt a feltételt meredek átvitelű SSB szűrővel biztosítják. Forrás: jegyzet/08_Adok.md, 8.2.2.

### M-21. — Helyes válasz: B
A számláló pontosan 1 másodpercig számol, így a számlált periódusok száma közvetlenül a frekvenciát adja hertzben: 14 200 000 Hz = 14,2 MHz. A másik két érték 100-szoros, illetve 1000-szeres tévedés. Forrás: jegyzet/11_Meresek.md, 11.4.4.

### M-22. — Helyes válasz: A
3 dB csillapítás kb. felére csökkenti a teljesítményt, így az antennára kb. 50 W jut. A 97 W a 3 %-os veszteségnek felelne meg, a 25 W pedig a 6 dB-nek. A tápvonal csillapítását a jegyzet dB-ben adja meg. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.2 és 9.6.5.2.

### M-23. — Helyes válasz: A
Az URH és a deciméteres tartományban kizárólag illesztett tápvonalak használatosak; a hangolt tápvonalat elsősorban többsávos RH antennák illesztésére használják. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.6.

### M-24. — Helyes válasz: C
A csatoló-hálózat működése frekvenciafüggő, ezért rossz sávállásnál az SWR érték még pontos lehet, de a teljesítmények értékei nem lesznek azok. A műszer nem okoz kárt az adóban. Forrás: jegyzet/11_Meresek.md, 11.5.1.2.

### M-25. — Helyes válasz: C
P = U²/R = 576/96 = 6 W. A 0,25 W az áram (0,25 A) számértéke, a 2304 W pedig az U·R szorzat. Forrás: jegyzet/11_Meresek.md, 11.4.3.1.

## Forgalmi feladatok

### F-1. — Helyes válasz: A
Az SKED megbeszélt (előre egyeztetett) vagy kísérleti adást jelent. A szó/perc a WPM, a „sajnos” az SRI. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4).

### F-2. — Helyes válasz: C
H = Helén, G = Géza. A Henrik, a Hedvig, a Gábor és a Gizella nem hivatalos betűzőszavak. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1).

### F-3. — Helyes válasz: A
Az S a jelerősség, amelyet a vevő S-mérőjéről olvasunk le. Az olvashatóságot (R) becsüljük füllel, a wattmérő az adó teljesítményét mutatja. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.5), sajat/forgalom.md (riport).

### F-4. — Helyes válasz: B
Az O betűje Oscar. Az Ontario a nem hivatalos DX-ábécé szava, az Orange nem szerepel az ábécében. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1), sajat/forgalom.md.

### F-5. — Helyes válasz: B
Általános hívásnál (CQ) nem megnevezett állomás a cél, bárki válaszolhat. Átjátszón nem szabad általános hívást adni, és a hívójellel kezdődő hívás nem feltétlenül általános. Forrás: sajat/forgalom.md (forgalmazás), jegyzet/14_Forgalmi_ismeretek.md (14.2.4).

### F-6. — Helyes válasz: C
A WKD jelentése: dolgozott (forgalmazott). A hallott a HRD, a munka vége a VA. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.3 és 14.1.4).

### F-7. — Helyes válasz: A
A QRG a pontos frekvenciára vonatkozik. A pontos idő a QTR, a telepítési hely a QTH kódja. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2), kezdo/KEZDO-VIZSGA-ANYAGA.md (12. fejezet).

### F-8. — Helyes válasz: B
A naplóba a forgalmazás megkezdésének idejét kell beírni, egyeztetett világidő (UTC) szerint. A befejezés ideje és a MEZ nem előírás. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (17. fejezet), sajat/forgalom.md.

### F-9. — Helyes válasz: A
A kiegészítés akkor használható, ha az amatőrállomás telepítési helye ideiglenesen megváltozik, és az új helyről forgalmaznak. Nem függ a versenytől vagy attól, ki használja az állomást. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 13. § (1).

### F-10. — Helyes válasz: C
Az internetre csatlakozó, nem regisztrált felhasználó csak internetes állomásnak küldhet adatot. Rádiós állomással csak a regisztrált, hívójellel rendelkező állomás cserélhet, így védett a hálózat a nem rádióamatőrtől származó adatoktól. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.2).

### F-11. — Helyes válasz: C
A kezdők 20 m-es sávja 14000–14250 kHz, a 14 280 kHz ezen kívül esik (a sávterv szerint a sáv 14350 kHz-ig tart). A 3700 kHz a 80 m-es (3500–3800), a 29 600 kHz a 10 m-es (28000–29700) kezdő sávba esik. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (9. fejezet), jegyzet/16_Mellekletek.md (16.2).

### F-12. — Helyes válasz: B
Átjátszón nem szabad általános hívást kezdeményezni, és nem szabad hosszú összeköttetést lebonyolítani. A hívójel bemondása kötelező, a rövid periódusok pedig szabályosak. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.4).

### F-13. — Helyes válasz: A
Az USA előtagjai a W, K és N. A VE Kanadáé. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet).

### F-14. — Helyes válasz: B
A CEPT Novice Licence tulajdonosa Magyarországon a CEPT Novice engedély sugárzási feltételeivel üzemelhet, a CEPT Licence tulajdonosa a CEPT engedély feltételeivel. Új vizsga nem kell. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 8. § (9).

### F-15. — Helyes válasz: A
Az RWM jele a 4,996, 9,996 és 14,996 MHz-en vehető. A 7,100 MHz és a 10,100 MHz amatőrsávi frekvencia, nem az RWM-é. Forrás: sajat/forgalom.md (Idő megadása).

## Biztonságtechnikai feladatok

### B-1. — Helyes válasz: B
A jegyzet szerint a közelben lecsapó villám által a vezetékekben indukált feszültség káros hatásainak elkerülésére a berendezéseket célszerű a villamos és a távbeszélő hálózatról is leválasztani; ezt nevezik másodlagos villámvédelemnek. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.11.

### B-2. — Helyes válasz: A
Ha a levezető kábel árnyékolása nem a földhöz csatlakozik, a jegyzet szerint a kábel belső erét és az árnyékolást össze kell kötni, és így kell leföldelni. A másik két megoldás nem biztosít földelést a belső érnek. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.11.

### B-3. — Helyes válasz: C
A jegyzet szerint az árboc földelt talppontjában a rendkívül nagy áram hatására akkor is magas feszültség alakul ki, ha jó, kis ellenállású a földelés; ez a földben távolodva rohamosan csökken. Ezért egyetlen lépéssel is életveszélyes feszültségkülönbséget (lépésfeszültséget) hidalhatunk át. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.11.

### B-4. — Helyes válasz: B
A jegyzet szerint a jó földelés még az antennák vihar alatti leföldeléséhez is szükséges; egy jó földeléstől általában megkívánjuk, hogy földelési ellenállása kis értékű legyen. A hosszú, szigetelt kábel és az adóteljesítmény nem a leföldelés hatásosságát növeli. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.4.

### B-5. — Helyes válasz: A
A kezdő vizsga anyaga szerint a földelés alapvetően életvédelmi célokat szolgál, ezen túlmenően a zavarást is csökkentheti. Az antennanyereség és a teljesítmény nem függ a védőföldeléstől. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md, 5. fejezet (Antenna, földelés szerepe).

## Jogismereti feladatok

### J-1. — Helyes válasz: A
A közösségi, illetve egyéni különleges engedélyben szereplő QTH legfeljebb hatvan napra történő megváltoztatásához nem kell módosítást kérni, de előzetesen be kell jelenteni a hatóságnak. A közösségi engedély nem országos, hanem a feltüntetett telepítési helyre szól (11. § (1)). Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 10. § (4).

### J-2. — Helyes válasz: B
Mozgó amatőrállomás és különleges amatőrállomás forgalmáról nem kell forgalmi naplót vezetni, a versenyállomás és az alkalmi amatőrállomás kivételével; ezekről tehát kell naplót vezetni. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 17. § (3).

### J-3. — Helyes válasz: C
A T/R 61-01 alapján legfeljebb 3 hónapig a saját nemzeti engedéllyel forgalmazhat, és a saját hívójele elé be kell szúrnia a meglátogatott ország előtagját törtvonallal elválasztva. A jegyzet példája: OE/HA5KDR. Forrás: sajat/jogi-targykor.md, 3/2 1/1; jegyzet/01_Radioamator_alapismeretek.md, 1.5.5.

### J-4. — Helyes válasz: C
Az engedély az engedélyes halálával megszűnik (20. § (6)); a megszűnt egyéni engedélyhez tartozó hívójel CEPT fokozat, Kezdő és CEPT Novice fokozat esetén is 10 év elteltével jelölhető ki újra. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 12. § (11) és 20. § (6).

### J-5. — Helyes válasz: A
A vészjel rádiótávíró adásmódban az SOS (· · · ─ ─ ─ · · ·), rádiótávbeszélő adásmódban a MAYDAY. A QRT az adás beszüntetését jelenti. Az SOS betűkombináció hívójelben egyébként sem adható ki. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 1. melléklet III. 4.; 12. § (8).
