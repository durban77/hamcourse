# Gyakorló feladatlap 07 – helyes válaszok és magyarázatok

A kérdések: [gyakorlo_kerdesek_07.md](gyakorlo_kerdesek_07.md).

> A jogi és forgalmi szabályok változhatnak: a vizsga előtt ellenőrizd az aktuális hatályos szöveget.

## Műszaki feladatok

### M-1. — Helyes válasz: B
Xc = 1 / (2π · f · C) = 1 / (2π · 10 000 Hz · 100 nF) = 1 / (6,28 · 10^-3) ≈ 159 Ω. Az 1 kΩ a 2π tényező kihagyásából (1 / (f · C)), az 1,6 kΩ nagyságrendi hibából adódik. Forrás: jegyzet/04_Alkatreszek.md, 4.2.5.

### M-2. — Helyes válasz: A
XL = 2π · 7·10^6 · 5·10^-6 ≈ 220 Ω, így Q = XL / Rs = 220 Ω / 2 Ω = 110. A 440 az XL és Rs szorzata, a 17,5 a 2π kihagyásával kapott érték (35 / 2). Forrás: jegyzet/04_Alkatreszek.md, 4.3.3.–4.3.4.

### M-3. — Helyes válasz: B
A frekvencia f = c / λ = 3·10^8 m/s / 40 m = 7,5·10^6 Hz = 7,5 MHz. A 75 MHz és a 750 kHz tízszeres nagyságrendi hibából adódik. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.1.

### M-4. — Helyes válasz: C
FM-nél a modulációs index a löket és a moduláló frekvencia hányadosa: m = Δf / fmod = 3 kHz / 1,5 kHz = 2. A 0,5 a fordított hányados, a 4,5 az összeg. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.3.

### M-5. — Helyes válasz: C
Terhelés nélkül nem folyik áram, így a belső ellenálláson nem esik feszültség, és a kapocsfeszültség a forrásfeszültséggel egyezik meg. Terhelés vagy rövidzár esetén a belső ellenálláson feszültségesés lép fel. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.2.1.

### M-6. — Helyes válasz: B
A térerősség E = F / Q vektormennyiség, iránya a pozitív töltésegységre ható erő irányával egyezik, mértékegysége V/m. Nem skalár, és az iránya a pozitív (nem a negatív) töltésre ható erőből adódik. Forrás: jegyzet/03_Villamossag_elektromagnesesseg_radio.md, 3.1.2.

### M-7. — Helyes válasz: A
A tranzisztor lényegében vezérelt áramgenerátor: a kollektoráramot a BE diódával, vagyis a bázis–emitter feszültséggel (és így a bázisárammal) lehet szabályozni. A kollektor–bázis diódát záróirányban előfeszítik. Forrás: jegyzet/04_Alkatreszek.md, 4.5.10.1. és 4.5.12.

### M-8. — Helyes válasz: C
Az 1. típusú kerámiakondenzátorok stabil kapacitásúak, kis tűrésűek, lineáris hőmérsékletfüggésűek, ezért rezgőkörökben és oszcillátorokban használják. A 2. típus nagy kapacitású, de kevésbé stabil, szűrésre és csatolásra való. Forrás: jegyzet/04_Alkatreszek.md, 4.2.2.2.

### M-9. — Helyes válasz: A
A két tekercs egymással galvanikusan nem érintkezik, ezért a két áramkör között teljes leválasztás érhető el (pl. hálózati transzformátor). A feszültségek és az áramok a menetszámok arányában különbözhetnek. Forrás: jegyzet/04_Alkatreszek.md, 4.4.3.

### M-10. — Helyes válasz: C
Az SSB-nél a vivőt és az egyik oldalsávot elnyomják; ha a felsőt hagyják meg, USB (Upper Side Band), ha az alsót, LSB (Lower Side Band) a jel neve. Mindkettőnél elnyomott a vivő, és mindkettő analóg. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.1.2.

### M-11. — Helyes válasz: B
A forrás szerint a mintavételezés utáni számszerűsítést nevezzük kvantálásnak; a mintavételi frekvencia azt adja meg, milyen sűrűn veszünk mintát. A visszaalakítás a dekódolás. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.3.

### M-12. — Helyes válasz: A
A hibajelképző erősítő a kimeneti és a referenciafeszültséget hasonlítja össze (hibadetektor), kimenete vezérli az áteresztő tranzisztort, így tartja állandón a kimeneti feszültséget. A simítás a pufferkondenzátor, a lecsökkentés a transzformátor dolga. Forrás: jegyzet/06_Aramkorok.md, 6.3.2.2.

### M-13. — Helyes válasz: C
Az A osztályban a bemeneti jel 100 %-a felhasználásra kerül (folyási szög 360°), ezért a torzítás nagyon kedvező, de a nyugalmi áramfelvétel nagy. A B osztály 180°-ig, a C osztály 180° alatt vezet. Forrás: jegyzet/06_Aramkorok.md, 6.4.3.

### M-14. — Helyes válasz: C
Az antennacsatoló áramkör feladata az antenna kellő elválasztása, a megfelelő sávszelekció, a tükörszelektivitás növelése és a KF elnyomás. A hangfrekvenciás erősítés és az oszcillátor stabilizálása nem az antennacsatoló dolga. Forrás: jegyzet/07_Vevok.md, 7.5.1.

### M-15. — Helyes válasz: B
λ = c/f = 300/7,1 ≈ 42,3 m, a félhullámú dipólus hossza ennek fele, kb. 21,1 m. A 42,3 m a teljes hullámhossz, a 10,6 m pedig a negyedhullám. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1 és 9.6.1.

### M-16. — Helyes válasz: A
A mennyiség = mérőszám · mértékegység: U a mennyiség, 13,8 a mérőszám (lehet negatív is), V a mértékegység. Forrás: jegyzet/11_Meresek.md (bevezető).

### M-17. — Helyes válasz: C
A hangfrekvenciás bemeneteken mindig aluláteresztő szűrőt kell alkalmazni, hogy a nagyfrekvenciás zavaró jel ne jusson be. A felüláteresztő és az amatőrsávra hangolt sáváteresztő szűrő éppen átengedné a rádiófrekvenciás jelet. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.4.2.

### M-18. — Helyes válasz: C
Végkitérésnél az alapműszeren 1 mA folyik, rajta 90 mV esik; a söntön a többi, 9 mA, így Rsönt = 90 mV / 9 mA = 10 Ω. A 9 Ω a 90/10 hibás osztás, a 810 Ω pedig a 90·9 szorzat. Forrás: jegyzet/11_Meresek.md, 11.4.1.2.

### M-19. — Helyes válasz: A
A légzárványos dielektrikumú kábelek csillapítása kicsi, de nedvesség ellen védeni kell őket, nagyobb a hajlítási sugaruk, és a mechanikai behatásokat is rosszabbul viselik. Az alaktartóság és a nedvességtűrés a tömör dielektrikumú kábelek előnye. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.5.1.

### M-20. — Helyes válasz: A
A felületi hullámterjedés a hosszúhullámú tartomány jellemző terjedési formája: a talajban folyó vezetési áramnak köszönhetően a hullám az egész utat a földfelszín mentén teszi meg. A LOS az URH és mikrohullámú tartományban domináns, a troposzférikus szórás pedig 200 MHz fölött használható. Forrás: jegyzet/10_Hullamterjedes.md, 10.1.1–10.1.4.

### M-21. — Helyes válasz: B
A jegyzet szerint a vétel a dióda bekötésétől független, mivel a kétoldalsávos AM jelnél mindkét oldalsáv ugyanazt az információt hordozza. A detektoros vevő egyáltalán nem erősít, a fejhallgató pedig a hangfrekvenciás összetevőt szólaltatja meg. Forrás: jegyzet/07_Vevok.md, 7.1.1.

### M-22. — Helyes válasz: A
A frekvencia az abszorpciós mérővel 0,5–1 % pontossággal olvasható le; 14,2 MHz 1 %-a 142 kHz (0,5 % esetén 71 kHz). A 14,2 kHz 0,1 %-nak, az 1,42 MHz pedig 10 %-nak felelne meg. Forrás: jegyzet/11_Meresek.md, 11.5.2.

### M-23. — Helyes válasz: C
A rövidhullámú tartományban akkor célszerű gamma illesztést használni, ha szimmetrikus sugárzót külön szimmetrizáló transzformátor nélkül akarunk koaxiális kábellel táplálni; a gamma-tag lényegében fél T-tag, impedanciaillesztést is megvalósít. A negyedhullámú kerülővezeték az URH megoldás. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.6.7.3 és 9.6.7.5.

### M-24. — Helyes válasz: B
Rezonanciában a talpponti ellenállás a sugárzási és a veszteségi ellenállás összege: Rbe = Rs + Rv = 36 + 4 = 40 Ω. A 32 Ω a különbség, a 9 Ω pedig a hányados lenne. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.1.4.

### M-25. — Helyes válasz: B
A teljesítmény növelése nem mindig vezet célra: a jegyzet szerint érdemes más polarizációval, modulációval vagy más frekvencián próbálkozni. A további teljesítménynövelés zavart okozhat, a zajzár és az AGC kikapcsolása pedig nem a kapcsolat létrejöttét segíti. Forrás: jegyzet/12_Zavaras_es_vedelem.md, 12.4.1.

## Forgalmi feladatok

### F-1. — Helyes válasz: B
Fónia üzemmódokban (FM, SSB) az RS skálát használjuk, az RST-t távíróban, az R skálát átjátszón. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.2.5), kezdo/KEZDO-VIZSGA-ANYAGA.md (14. fejezet).

### F-2. — Helyes válasz: A
A QRL válaszban azt jelenti: el vagyok foglalva, vagyis a frekvencia használatban van. A vételkészség a QRV, a légköri zavar a QRN. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2), sajat/forgalom.md (minta QSO: QRL? a CQ előtt).

### F-3. — Helyes válasz: A
Az AGN jelentése: újra (például PSE AGN). Az antenna az AER, a „minden” az ALL. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.4).

### F-4. — Helyes válasz: C
Az M betűje Mike. A Mexico a nem hivatalos DX-ábécé szava, a Mary nincs az ábécében. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.1).

### F-5. — Helyes válasz: B
A vészjelzést a sáv hívó vagy vészhelyzeti frekvenciáján kell adni, ahol a legtöbb állomás figyel. Az átjátszó korlátozott, a CQ hívás pedig nem vészjelzés. Forrás: sajat/forgalom.md (nemzetközi vészjelek).

### F-6. — Helyes válasz: B
A QSL manager az expedíciónak érkező QSL lapokat fogadja, és az expedíciótól kapott log alapján küldi el a válaszlapokat. A hívójelet nem ő osztja ki, a forgalmazást nem ő végzi. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (15. fejezet).

### F-7. — Helyes válasz: A
A QRP kérdésben a teljesítmény csökkentésére kérdez rá. A növelés a QRO, a lassabb adás a QRS. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.1.2).

### F-8. — Helyes válasz: C
A TNX köszönöm, a FOR/FER -ért, a CALL hívás, tehát: köszönöm a hívást. A hívás ismétlését a PSE RPT kérné, az időjárás a WX. Forrás: jegyzet/14_Forgalmi_ismeretek.md (14.3.2.3, 14.1.4).

### F-9. — Helyes válasz: A
A /P a kitelepült állomás jelzése, ami új telepítési hely esetén használható. A /M földi mozgó (jármű), a /MM vízi mozgó állomás. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 13. § (1) d); kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet).

### F-10. — Helyes válasz: B
A HAREC a CEPT T/R 61-02 ajánlásra épül. A T/R 61-01 a CEPT amatőr engedélyről, az ECC/REC/(05)06 a CEPT Novice engedélyről szól. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 5. § (1) c), 8. § (10)–(11).

### F-11. — Helyes válasz: C
A rádióamatőröknél a két frekvencia távolsága 170 Hz. A 425 Hz és 850 Hz más területeken használt érték. Forrás: jegyzet/15_Digitalis_uzemmodok.md (15.5).

### F-12. — Helyes válasz: C
A 29300–29510 kHz a műholdas kommunikáció lejövő ága (a felmenő ág 2 m-es vagy 70 cm-es sávban van). Az FM átjátszók lejövő ága 29660–29700 kHz, az IBP jeladók a 28190–28225 kHz-en vannak. Forrás: jegyzet/16_Mellekletek.md (16.2).

### F-13. — Helyes válasz: B
Az SP (és SN–SR) a lengyel előtag. Svédországé az SM. Spanyolországé nem az SP, a forrás a lengyel előtagot adja. Forrás: sajat/forgalom.md, kezdo/KEZDO-VIZSGA-ANYAGA.md (10. fejezet).

### F-14. — Helyes válasz: A
A rádióengedélyből következik, hogy az engedélyes az adott sávon milyen üzemmódban és teljesítménnyel adhat. A sávterv ajánlás, a készülék adatlapja nem jogosít. Szabályozás/forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md (9. fejezet), jogi/15_2013_IX_25_NMHH_rendelet.md, 8. § (8).

### F-15. — Helyes válasz: C
Az egyéni és a rádiós tájfutó versenyen elhelyezett amatőrállomás engedélye Magyarország teljes területén érvényes. A közösségi és a különleges engedély (a tájfutó kivételével) a telepítési helyhez kötött. Szabályozás/forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 11. § (1).

## Biztonságtechnikai feladatok

### B-1. — Helyes válasz: B
A földelési ellenállás a földelővezető és a földelő saját fémes ellenállásából, a földelő és a talaj közötti átmeneti ellenállásból, valamint a földelő szétterjedési ellenállásából tevődik össze. A készülék tekercsének ellenállása nem tartozik ide. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.4.

### B-2. — Helyes válasz: A
A jegyzet szerint ugyanakkora túláram esetén a gyors biztosító rövidebb idő alatt olvad ki, mint a lassú. A jelölés (FF, F, N, T) a kiolvadási jelleget adja meg, nem a méretet. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.5.

### B-3. — Helyes válasz: C
A jegyzet szerint a kiolvadás lehet nagyon gyors (FF), gyors (F), normál (N) vagy lassú (T); a gyorstól a lassú felé tehát FF, F, N, T a sorrend. A másik két felsorolás sorrendje hibás. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.5.

### B-4. — Helyes válasz: C
A berendezéseket nemcsak érintésvédelmi okból, hanem saját áramköreik védelmére is túláramvédelemmel látják el: ha a megengedettnél nagyobb tápáram folyik, a biztosító kiold, és megvédi a többi alkatrészt. A villámáram levezetése és a feszültség stabilizálása nem a biztosító feladata. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.5.

### B-5. — Helyes válasz: A
A Wichmann-biztosító egy, a két végén fémkupakkal lezárt üveg- vagy kerámiacsőben elhelyezett ólomhuzal; ha a megadott áram folyik rajta, a huzal felizzik és elolvad, megszakítva a vele soros áramkört. A másik két leírás nem ezt a működést adja. Forrás: jegyzet/13_Villamos_biztonsagtechnika.md, 13.5.

## Jogismereti feladatok

### J-1. — Helyes válasz: A
A rendelet szerint Kezdő fokozatú egyéni engedély a 18. évét be nem töltött vagy a 60. évét betöltött személynek adható Magyarországon kiállított Kezdő vizsgabizonyítvány alapján. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 8. § (6) a).

### J-2. — Helyes válasz: C
A forgalmazás során tilos a moduláció nélküli vivőfrekvencia 2 percen túli sugárzása, kivéve a rádióamatőr jeladó állomás esetét. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 15. § (6) g).

### J-3. — Helyes válasz: B
A HAREC fokozatú vizsga a T/R 61-02 ajánlásnak felel meg; a T/R 61-01 a CEPT fokozatú engedélyre vonatkozik, az ERC 32. jelentés az Alap fokozatú (Novice) vizsgára. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 5. § (1) c) és 7. § (2)–(3).

### J-4. — Helyes válasz: C
Átjátszó állomás használata esetén a forgalmi naplóba elegendő az átjátszón való forgalmazás tényét, kezdetét és végét beírni; teljes naplózási mentesség nincs, az ellenállomásonkénti részletes adatok pedig nem kötelezők. Forrás: jogi/15_2013_IX_25_NMHH_rendelet.md, 17. § (2).

### J-5. — Helyes válasz: B
A kezdő vizsga anyaga szerint a YO Románia előtagja; Szerbiáé YT, YU, Ukrajnáé az UR–UZ tartomány. Forrás: kezdo/KEZDO-VIZSGA-ANYAGA.md, 10. fejezet (Néhány ország prefixei).
