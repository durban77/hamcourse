# Gyakorló feladatlap 07 – írásbeli feladatok megoldása és pontozási útmutatója

Feladatok: [gyakorlo_irasbeli_kerdesek_07.md](gyakorlo_irasbeli_kerdesek_07.md).

**Pontozás röviden:** feladatonként 32 pont, összesen 96 pont. A pontozási táblák részpontokat engednek: ha egy elem hiányos vagy hibás, annak csak az egy része jár. A rajz a kapcsolás vagy az ábra lényegét kell, hogy mutassa; a szépség nem pontozandó. A minta ASCII-rajzok csak vázlatok, kézzel rajzolt ábra természetesen elfogadott. Az elfogadási határ nincs megadva, a minták sem közölnek ilyet.

## 1. feladat (32 pont)

**Feladat:** Rajzoljon le egy Graetz-hidas egyenirányítót hálózati transzformátorral, simítókondenzátorral és terhelő ellenállással! Jelölje a diódák nyitóirányát, a kondenzátor polaritását és a kimeneti feszültséget, majd magyarázza el a működését!

**Elvárt megoldás:** A transzformátor szekunder tekercsét a négydiódás híd két váltakozóáramú sarkára (bal és jobb sarok) kötjük. A D1 és D2 katódja a híd felső sarkában közös: ez a pozitív kimenet; a D3 és D4 anódja az alsó sarokban közös: ez a negatív kimenet. A bal sarokra a D1 anódja és a D3 katódja, a jobb sarokra a D2 anódja és a D4 katódja csatlakozik. A pozitív és a negatív kimenet közé, párhuzamosan kerül a Cp simítókondenzátor (+ a pozitív sínen) és az Rt terhelés; a kimenő feszültség Uki. A rajzon a pont nélkül keresztező vezetékek nem érintkeznek.

**Mintarajz:**
```text
                                 +--------------------*-------*-------o +
           +---------------------|--------------+     |       |       |
           |                     |              |     |       |       |
o---(||)---+             D1      |      D2      |    ---+     |       |
    (||)          +------>|------*------|<------+    --- Cp   |       |
    (||)          |                             |     |      [ ] Rt   | Uki
o---(||)----------*                             |     |       |       |
                  |                             |     |       |       |
230 V~            +------|<------*------>|------+     |       |       |
                         D3      |      D4            |       |       v
                                 +--------------------*-------*-------o -

Jelölések: (||) transzformátor, >| és |< dióda (a | a katód), --- / ---
  kondenzátor, * összekötött csomópont
```

**Magyarázat:** Ha a bal sarok pozitív, az áram D1-en, a terhelésen és D4-en át folyik; a másik félperiódusban a jobb sarok pozitív, és az áram D2-n, a terhelésen és D3-on át folyik. Így a terhelésen mindkét félperiódusban azonos irányú áram halad (kétutas egyenirányítás), és nincs szükség középleágazású transzformátorra. A híd miatt mindig két dióda van sorosan, ezért a nyitófeszültség kétszeresével kell számolni. A Cp a diódák nem vezető szakaszában táplálja a terhelést, így csökken a brummfeszültség; nagyobb kapacitás kisebb hullámosságot, de nagyobb csúcsáramot jelent a diódákon. Forrás: jegyzet/06_Aramkorok.md, 6.3.1.1. és 6.3.1.2. (6.3-6., 6.3-8. ábra).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| Négy dióda helyes hídkapcsolása, a nyitóirányok | 12 |
| A transzformátor a váltakozóáramú, a terhelés az egyenáramú sarkokra kötve | 4 |
| Simítókondenzátor Cp párhuzamosan Rt-vel, polaritás | 4 |
| Jelölések (D1–D4, Cp, Rt, Uki, +/−) | 4 |
| Működés: a két félperiódus áramútja, simítás | 8 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A diódák nyitóirányai nem adnak összefüggő utat mindkét félperiódusban (pl. két dióda egymással szemben).
- A terhelés a váltakozóáramú sarkokra, a transzformátor pedig az egyenáramú sarkokra kerül.
- A simítókondenzátor polaritása fordított, vagy sorosan szerepel a terheléssel.

## 2. feladat (32 pont)

**Feladat:** Rajzolja le egy m = 50%-os modulációs mélységű, két oldalsávos amplitúdómodulált (AM-DSB) jel időfüggvényét, ha a vivő amplitúdója 10 V! Jelölje a vivő és a moduláló jel amplitúdóját és a burkológörbét, adja meg a modulációs mélység képletét, és mondja meg, mi történik 100% fölött!

**Elvárt megoldás:** A vízszintes tengely az idő, a függőleges a feszültség (u, V). A vivő frekvenciája állandó, az amplitúdója a moduláló jel ütemében változik: Umax = Uv + Um = 15 V és Umin = Uv − Um = 5 V között. A burkológörbe (a csúcsokat összekötő vonal) a moduláló jel alakját adja, a tengely mindkét oldalán (±). A modulációs mélység m = Um / Uv = 5 V / 10 V = 0,5 = 50%. 0% a modulálatlan vivő, 100% a legnagyobb megengedett moduláció; 100% fölött a jel túlvezérelt lesz és torzul.

**Mintarajz:**
```text
                Uv = 10 V, Um = 5 V,  m = Um/Uv = 0,5 = 50%
                Umax = Uv + Um = 15 V,  Umin = Uv - Um = 5 V
u [V]
         ^
+15 V    |......                                                     ......
         | |  | ....                                             ....  |  |
         | |  |  |  ...                                       ...|  |  |  |
         | |  |  |  |  ..                                   ..|  |  |  |  |
+10 V    | |  |  |  |  | ...                             ...  |  |  |  |  |
         | |  |  |  |  |  | ..                         ..  |  |  |  |  |  |
         | |  |  |  |  |  |  |...                   ... |  |  |  |  |  |  |
         | |  |  |  |  |  |  |  |....           .... |  |  |  |  |  |  |  |
+5 V     | |  |  |  |  |  |  |  |  | ...........  |  |  |  |  |  |  |  |  |
         | |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
         | |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
         | |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
         --|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|>
         | |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |t |
         | |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
         | |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |
-5 V     | |  |  |  |  |  |  |  |  | ...........  |  |  |  |  |  |  |  |  |
         | |  |  |  |  |  |  |  |....           .... |  |  |  |  |  |  |  |
         | |  |  |  |  |  |  |...                   ... |  |  |  |  |  |  |
         | |  |  |  |  |  | ..                         ..  |  |  |  |  |  |
-10 V    | |  |  |  |  | ...                             ...  |  |  |  |  |
         | |  |  |  |  ..                                   ..|  |  |  |  |
         | |  |  |  ...                                       ...|  |  |  |
         | |  | ....                                             ....  |  |
-15 V    |......                                                     ......
         |
         |
    pontsor (.....) = burkológörbe = a moduláló jel alakja
    függőleges vonalak = a vivő rezgései (ritkított rajz)
```

**Magyarázat:** Az AM-ben az információt a vivő amplitúdója hordozza, a frekvenciája nem változik. A burkológörbe pontosan a moduláló jel alakját követi; az m = Um / Uv hányados 0 és 100% között lehet, mert a burkoló legfeljebb a nulla tengelyig süllyedhet. Az m > 100% esetén a burkoló „átfordul”, a jel torzul. A mintarajzon a vivőrezgéseket a jobb láthatóságért függőleges vonalak jelzik. Forrás: jegyzet/05_Radiohullam_es_modulacio.md, 5.2.1.1.

**Pontozási útmutató (32 pont):**

| Elem | Pont |
|---|---|
| Tengelyek: u [V] (2 p), t (2 p), értékek jelölése (2 p) | 6 |
| Modulált jel: állandó frekvenciájú vivő (3 p), amplitúdó a moduláló jel ütemében változik (4 p), szimmetria a tengely körül (3 p) | 10 |
| Jelölések: Uv (2 p), Um (2 p), Umax = 15 V és Umin = 5 V (2 p) | 6 |
| Modulációs mélység: képlet (3 p), érték 50% (2 p) | 5 |
| A burkológörbe a moduláló jel alakja (2 p); 100% fölött túlvezérlés, torzítás (3 p) | 5 |
| **Összesen** | **32** |

**Gyakori hibák:**
- A vivő frekvenciája is változik (FM-et rajzolnak AM helyett).
- A burkológörbe nem szinuszos a moduláló jel szerint, vagy csak a pozitív oldalon szerepel.
- A modulációs mélységet fordítva írják fel (Uv / Um), így az 50% helyett 200% jön ki.

## 3. feladat (32 pont)

**Feladat:** Rajzoljon le egy függőleges (GP, ground-plane) antennát, és nevezze meg az elemeit! Adja meg az elemek hosszát és az ellensúlyok elhelyezkedését!

**Elvárt megoldás:** A GP (groundplane) antenna egy függőleges, λ/4 hosszúságú sugárzó elemből és négy, szintén λ/4 hosszúságú ellensúlyból (radiálból) áll. Az ellensúlyok a sugárzó alsó végéről, a táppontból indulnak, a sugárzóhoz képest 135°-os szöget zárnak be (lefelé hajlanak), egymáshoz képest pedig 90°-ot. A táppontra csatlakozik az aszimmetrikus koaxiális tápvonal. Talpponti impedanciája 50 Ω, vízszintes irányban körsugárzó.

**Mintarajz:**
```text
                   sugárzó
                      |
                      |
                      |
                      |
                      | <- λ/4 függőleges sugárzó
                      |
                      |
                      |
                      |
                      X <- táppont
                    / | \            <- ellensúlyok (radiálok):
                  /   |   \             4 db, mindegyik λ/4,
                /     |     \           135° a sugárzóhoz,
              /       |       \         90° egymáshoz képest
            /         |         \
                      |
                      |
                      v koax tápvonal (50 Ω) a táppontra
```

**Magyarázat:** Ha jól vezető talaj felett függőleges λ/4-es rudat állítunk fel, a talaj tükörképe félhullámú sugárzóvá egészíti ki (Marconi-antenna). A földfelszín helyett az ellensúlyok hálózata is megoldja ezt, így az antenna magasabbra is telepíthető. A GP talpponti impedanciája pontosan 50 Ω, ezért aszimmetrikus koaxkábellel közvetlenül táplálható. Forrás: jegyzet/09_Antennak_es_tapvonalak.md, 9.2.1. és 9.2.2.1. fejezet (9.2-2. ábra).

**Pontozási útmutató (32 pont):**
| Elem | Pont |
|---|---|
| A függőleges λ/4-es sugárzó és a táppont helyes ábrázolása | 8 |
| Az ellensúlyok: 4 db, λ/4 hosszúak, 135° a sugárzóhoz, 90° egymáshoz | 10 |
| A tápvonal (koax) csatlakozása a táppontra | 4 |
| Megnevezések | 4 |
| Jellemzők: 50 Ω talpponti impedancia, körsugárzó | 6 |
| **Összesen** | **32** |

**Gyakori hibák:**
- Az ellensúlyokat vízszintesre (180°) rajzolják, vagy a hosszukat λ/2-nek adják meg.
- A sugárzó hosszát λ/2-nek veszik.
- A GP-t vízszintes polarizációjúnak tekintik, holott függőleges polarizációjú, körsugárzó.
