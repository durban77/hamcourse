# 12. Zavarás és védelem

Czigány Róbert HG5PK, Dr. Csahók Zoltán HA5CQZ

## 12.1. A zaj és a zavar

A **zaj** egy nemkívánatos jelenség, amely a rádiófrekvenciás spektrumban is az ősidőktől fogva létezik és az ember megjelenésével, az elektronikus berendezések tömeges alkalmazásával egyre több fajtája jelenik meg. Ha egy rádió-vevő berendezésre antennát kapcsolunk és az ún. zajzárat teljesen kinyitjuk, a vevőt hangolva sistergést és egyéb nemkívánatos zörejeket hallunk. A kezelő szempontjából minden ilyen nemkívánatos jelenség, ami a hasznos jel mellett megjelenik **zavarnak** minősíthető. 

Zavarni csak rádió-vevőberendezést lehet! 

A zajt a forrása alapján két nagy csoportba sorolhatjuk: 

1.   Természetes zajok 

A természetes zajok a környezetünkben állandóan jelenlévő zajok, melyek véletlenszerű eloszlást mutatnak, erősségük nagyban függ az időjárási viszonyoktól és a kozmikus tevékenységektől. Megszüntetésükre nincs lehetőségünk, rádióösszeköttetések tervezésekor eleve figyelembe kell venni őket. 

	(a) Légköri zajok A légkör hideg és meleg frontfelületeinek súrlódása, valamint villámlás során keletkező elektromos kisülések. RH összeköttetések tervezésekor kell figyelembe venni, nagyban függ az időjárási viszonyoktól. Például nyáron a nagyon távoli zivatarok is komoly zavarást tudnak létrehozni. 

	(b) Galaktikus vagy kozmikus zajok Nem a légkörből, hanem távoli égitestekről, a világűrből származó zajok. A Földet körülvevő ionoszféra megakadályozza, hogy a 30 MHz-nél alacsonyabb rádiófrekvenciás zajok behatoljanak a légkörbe, ezért kozmikus zajjal legfeljebb URH összeköttetések esetén számolhatunk. 

A természetes zajokra a `QRN` megjelölést használjuk. 
	
2.   Ipari eredetű zajok 

Az ipari elektromos zaj - mivel az ember tevékenysége által létrejött nemkívánatos jelenség - rádiózavarnak minősül. Rádiózavarnak nevezünk minden olyan jelenséget, mely egy rádióadó jelének vételénél olyan járulékos összetevőket hoz létre, amelyek az eredetileg kisugárzott moduláló jelben nem léteztek. A rádiózavaroknak két nagy területe van: 

	(a) Szándékos rádiózavarok A szándékos rádiózavarokat a rádióvevő berendezések ellen alkalmazzák, abból a célból, hogy a hasznos jel vételét megakadályozzák. Például hadicselekmények előtt és közben a szembenálló felek alkalmazzák egymás kommunikációs rendszereinek időszakos bénítására. A rádióamatőr gyakorlatban szintén előfordulnak szándékos zavarok, amelyek alapvetően rosszindulatú célból az összeköttetések megszakítására, illetve lehetetlenné tételére irányulnak. 
	
	(b) Nem szándékos rádiózavarok A nem szándékos rádiózavarok az ipari vagy civil tevékenységek során használt elektromos és elektromágneses rezgéskeltő berendezések, valamint más rádióadó berendezések kisugárzott jelének nemkívánatos melléktermékei a vevőberendezésben. Ilyen keletkezhet például egy adóberendezést beállítása vagy hangolása során, amennyiben nem műterheléssel végezzük. Hasonlóan rádiózavart okozhat egy torzító végfokozat, amely széles frekvenciasávban sugároz nemkívánatos jeleket (ez az ún. **splatter**, „fröcsögés”), ezzel zavarva a sávban forgalmazó többi állomást. 

Az ipari (nem természetes) eredetű zajokra a `QRM` megjelölést használjuk.

## 12.2. Interferenciás zavarok

A rádióvevő kimenetén megjelenő, nem a venni kívánt rádióadó berendezés által létrehozott jel legtöbbször valamilyen **interferencia** terméke. Megkülönböztetünk azonos csatornás interferencia zavarokat és nem-azonos csatornás interferencia zavarokat.

- Azonos csatornás interferencia zavarok akkor jönnek létre, ha a venni kívánt és a "zavaró" rádióberendezés azonos frekvencián sugároz és a vevő bemenetén mindkettő jel megjelenik hasonló teljesítménnyel. Védekezni ellene különböző polarizáció megválasztásával és az adóberendezések területi elkülönítésével lehet.

- Nem azonos csatornás interferencia zavarok akkor jönnek létre mikor a szomszédos rádiócsatornában működő rádióadó jele kerül a vevő bemenetére.

- Kombinációs interferencia zavarok a szuperheterodin elven működő vevőkészülékek esetében jöhetnek létre, amikor valamelyik keverő oszcillátor vagy valamelyik KF erősítő sávjával megegyező jel kerül a vevő bemenetére, ami az alapsávba kerülve vételi zavarokat okoz. Ezek neve másképpen tükörfrekvenciás vagy oszcillátor zavaroknak. 

Az interferencia a vevő kimenetén a hasznos jel és a "zavaró" jel együttes meglétével érzékelhető gyakran a "zavaró" adó tisztán halható a venni kívánt adó szüneteiben illetve alatta (**keresztmoduláció**). 

Sokszor az interferencia oka a bemeneti vagy KF erősítők túlvezérlése, ami a hasznos jel torzításához és ezáltal különböző nemkívánatos keverési termékek létrejöttéhez vezet. A kimeneti jelben ez az **intermoduláció** szintén zavarként jelentkezik. A vevőkészülékek fontos jellemzője, hogy mekkora jelet képesek érzékelhető intermoduláció nélkül feldolgozni. 

Amennyiben az adó által kisugárzott erős rádiófrekvenciás jel TV bemenetére kerül, akkor élvezhetetlenné tudja tenni a képet és a hangot egyaránt. Hangfrekvenciás erősítők bemenetére kerülve szintén gondot okozhat a rádiófrekvencia, az erősítő képes a jelet valamennyire demodulálni és az megjelenik a hangszórókban.

## 12.3. A zavarok keletkezésének okai

A hasznos jel kiszűrését a zajból intelligens áramkörök segítik, amelyek a mindenkori zaj mértékének figyelembevételével változtatják a vevő paramétereit (érzékenység, erősítés, sávszélesség). Legismertebb formája a **zajzár** (squelch) áramkör, amely némítja a vevőt, ha úgy érzékeli, hogy nincs hasznos bemeneti jel. A zajzárat főleg FM készülékekben alkalmazzák. 

Sok esetben zavaró jel olyan nagy jelszintet hoz létre a vevő bemenetén, hogy azt képes blokkolni: az erős zavaró jel miatt a vevő AGC-je csökkenti az erősítést (illetve túlvezérelődhetnek egyes fokozatok), ami által a hasznos jel detektálása lehetetlenné válik. 

A rádió adó-vevő berendezések vonatkozásában az alábbi szempontok alapján vizsgálhatjuk a zavarhatásokat: 

1.   Kezelői hibából adódó zavarokról abban az esetben beszélhetünk, mikor a berendezést üzemeltető személy nem a frekvencia sávhasználatra vonatkozó előírásoknak megfelelően működteti a berendezését, vagy nem megfelelő műszaki paraméterekkel rendelkező berendezést szándékosan üzemeltet. Az előírásoktól eltérő frekvenciákat, sávszélességet, modulációs módot, teljesítményt használ.

2.   A rádió-adóberendezés által okozott zavarok az adóberendezés hibás működéséből adódnak. A környező rádióvevő készülékekben és TV-kben okozhatnak jelentős zavart. A kezelő kontrollvevő hiányában nem veszi észre a hibás működést, ami más rádióvevő berendezésekben zavart, interferenciát okoz. 

A hibák jellegzetes okai:

	-   Az adóberendezés által kisugárzott frekvencia eltér a frekvenciaskálán beállított értéktől,
	-   A kisugárzott jel sávszélessége nagyobb a megengedett sávszélességnél,
	-   A kisugárzott jel nagysága jóval nagyobb mint az szükséges vagy a környezetben tolerált értéket meghaladja.
	-   A mellékhullámú (szomszédos csatornán) sugárzás nagyobb a megengedettnél.
	-   A közeli térben vevőberendezés helyezkedik el
	-   A táphálózaton a nem-megfelelő leválasztás miatt kisugárzásra kerül a jel
	-   Az teljesítményerősítő illesztetlensége az antennarendszerhez

3.   A rádióvevő berendezésen tapasztalható zavarok a vevő hibája vagy nem megfelelő méretezése miatt:

	-   A bemeneti nagyfrekvenciás szűrő nem megfelelő
	-   Az AGC túl- vagy nem szabályoz
	-   Rossz tükörfrekvenciás elnyomás
	-   IIlesztetlenség
	-   Zajzár hibája
	-   Az antenna tápvonal illesztetlen az antenna és vevő oldal felöl
	-   Nem megfelelő a vevőberendezés árnyékolása

## 12.4. A zavarok kiküszöbölésének és elkerülésének módjai

### 12.4.1. Hogy ne okozzunk zavart...

- mindig megfelelően illesztett tápvonalat és antennát használjunk,

- lehetőleg kerüljük az egyik végén táplált félhullámú antennák használatát: ezek az adónk által termelt felharmonikusokat is jó hatásfokkal kisugározzák,

- az antennánkat ne telepítsünk TV vagy más vevőantenna közelébe,

- használjunk jó rádiófrekvenciás (RF) földelést: a villamos hálózat védővezetője vagy a vízhálózat nem alkalmas erre!

- csak a minimálisan szükséges teljesítményt használjuk,

- megfelelő elektromágneses árnyékolással lássuk el berendezéseinket,

- szűréssel és csatolásmentesítéssel gondoskodjunk róla, hogy a nagyfrekvenciás jelünk ne jusson a villamos (vagy telefon) hálózatba,

- mindig hallgassunk bele a sávba mielőtt adni kezdenénk 

A teljesítmény növelése nem mindig vezet célra: próbáljuk más polarizációval, modulációval vagy más frekvencián felvenni az összeköttetést. 

Legyünk jó kapcsolatban a szomszédokkal, tájékoztassuk őket milyen tevékenységet folytatunk, annak milyen hatásai lehetnek az általuk üzemeltetett vevőberendezésekre.

Vevőkészülékekkel sűrűn ellátott környezetben ne üzemeltessünk nagyteljesítményű adóberendezést, különösen ne távíró üzemmódban.

### 12.4.2. Hogy ne szenvedjünk zavart...

- mindig megfelelően illesztett tápvonalat és antennát használjunk,

- kerüljük nagyteljesítményű rádióadók vagy ipari berendezések környezetét,

- megfelelő elektromágneses árnyékolással lássuk el berendezéseinket,

- használjunk NF és KF szűrőket, valamint frekvencia és teljesítményszabályozó áramköröket a berendezéseinkben,

- hangfrekvenciás bemeneteken mindig alkalmazzunk aluláteresztő szűrőt,

- megfelelően válasszuk le berendezésünket a hálózati áramforrásról.
