---
marp: true
title: HA5KDR rádióamatőr konzultáció
author: Urbán Dániel
paginate: true
theme: default
---

# Rádióamatőr vizsgára felkészítő tanfolyam

2. Fejezet: Villamosság-, elektromágnesesség-, és rádióelmélet

Mai előadó: Urbán Dániel - HA5UDS

Készült: [marp](https://marp.app/) [vscode](https://code.visualstudio.com/) [github](https://github.com/durban77/hamcourse)

---

# Villamosság-, elektromágnesesség-, és rádióelmélet

```markdown
* Bevezető alkalom
* Általános tárgykör / Matematikai és fizikai alapok
* Műszaki tárgykör / ▶ Villamosság-, elektromágnesesség-, és rádióelmélet ◀
* Műszaki tárgykör / Alkatrészek
* Jogi tárgykör / Jogi anyag
* Forgalmazási tárgykör / Forgalmi ismeretek
* Műszaki tárgykör / Áramkörök
* Műszaki tárgykör / Vevők
* Műszaki tárgykör / Adók
* Műszaki tárgykör / Antennák és tápvonalak
* Műszaki tárgykör / Hullámterjedés
* Műszaki tárgykör / Mérések
* Műszaki tárgykör / Zavarás és védelem
* Biztonságtechnika / Villamos biztonságtechnika
```

---

# Témakörök
* Vezetőképesség
* Áramforrások
* Elektromágneses tér
* Szinuszos és nem-szinuszos jelek
* Modulált jelek
* Teljesítmény és energia

---

# Vezetőképesség

Az anyagokban a töltések (szabad elektron, ionok) áramlása elektromos vezetőképességet okoz.

Az anyagok vezetőképességét egy számmal jelölik, amely megadja, hogy az adott anyagból 1 méter hosszúságú, 1 négyzetmilliméter felületű rész, 1 volt feszültség esetén hány ampert képes vezetni. 
| Anyagok | Fajlagos vezetőképesség | Anyagok | Fajlagos vezetőképesség |
|:----------|---:|:-----|--:|
| ezüst     | 63 | ón   | 8 |
| réz       | 56 | ólom | 5 |
| alumínium | 37 |      |   | 

---

## vezető 🪛

Szabad elektronokkal (pl. fémek, grafit) vagy szabadon áramló ionokkal (sós víz) rendelkező anyagok jól vezetik az elektromos áramot.

## szigetelő 🛡️

Kötött elektronokkal rendelkező anyagok, amelyekben nincsen töltés áramlás (pl. gumi, kerámia, üveg, műanyagok) nem vezetik az elektromos áramot.

## félvezető 💎

E két csoport közötti anyagok, amelyek külső hatásra (fény, hő, szennyezés, elektromos mező) vezetőképességük megváltoztatható. Példák: szilícium, gallium, germánium.

---

## feszültség ⚡️

Az elektromos feszültség a két pont közötti elektromos potenciálkülönbség, vagyis az elektromos töltések mozgásához szükséges energia. Az elektromos feszültség arra kényszeríti az elektromos töltéseket, hogy áramoljanak egy adott áramkörben. Az elektromos feszültséget "U" betűvel jelölik.
Mérési egysége a volt (V).
| Áramforrás | Névleges feszültség | Áramforrás | Névleges feszültség |
|:--|--:|:--|--:|
| AA elem           | 1,5 V | USB port | 5 V |
| Autó akkumulátora | 12 V  | hálózati feszültség | 230 V |

---

## áram 🔌

Az elektromos áram az elektromos töltéshordozók (általában elektronok) rendezett mozgása egy vezető anyagon keresztül. Az elektromos áram azt mutatja, hogy milyen gyorsan és mennyi töltés halad át egy adott ponton egy adott idő alatt. Az elektromos áramot az "I" betűvel jelölik.
Megállapodás alapján a pozitív töltéshordozók mozgásának irányát tekintjük az áram irányának.
Mérési egysége az amper (A).
| Elektromos áram | mennyisége | Elektromos áram | mennyisége |
|:--|--:|:--|--:|
| Telefon töltése  | 2 A | Hangszóró működtetése | 0.01 A |
| Gamer PC-n játék | 5 A | Elektromos autó töltése | 15 A |

---

## ellenállás 🌡️

Az ellenállás az elektromos árammal szembeni akadályozás mértéke egy vezetőben vagy elektromos áramkörben. Minél nagyobb az ellenállás, annál nehezebb az áramnak folyni. Az ellenállást az "R" betűvel jelölik.
Mérési egysége az ohm (Ω).
| Vezető | ellenállása | Elektromos áram | mennyisége |
|:--|--:|:--|--:|
| Porszívó tápkábele |  2 Ω | emberi test | 100 000 Ω |
| Villanykörte       | 60 Ω |  |  |

---

##  Ohm-törvény

|||
|:-|:-|
|Az eletromos áramkörök alapvető törvénye, amely leírja a kapcsolatot az elektromos ellenállás, a feszültség és az áramerősség között. A feszültség (V) egyenesen arányos az áramerősséggel (I) és az ellenállással (R).|Áramkör: ![Feszültség, áram és ellenállás](https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/OhmsLaw.svg/150px-OhmsLaw.svg.png)|

| feszültség | áramerősség | ellenállás |
|:----------:|:-----------:|:----------:|
| $U = I \times R$ | $I = {U \over R}$ | $R = {U \over I}$ |

---

###  Ohm-törvény példa 🕹

> Mekkora az ellenállás, ha 5 Amper áram folyik 230V feszültség mellett?

Adott az áramerősség (I=5 Amper) és a feszültség (V=230), így az ellenállást az alábbi módon számíthatjuk ki:

$R = {U \over I}$

$R = {230 V \over 5 A}$

$R = 46 Ω$

Tehát ha 5 Amper áram folyik 230 V feszültség mellett, az ellenállás mértéke 46 ohm.

---

##  villamos teljesítmény 🚋

Az elektromos áramkörben felhasznált energia mennyiségét jellemzi egy adott időegység alatt. 
Mérési egysége a watt (W). 
A villamos teljesítmény a feszültség és az áramerősség szorzata.

| teljesítmény | feszültség | áramerősség |
|:----------:|:-----------:|:----------:|
| $P = U \times I$ | $U = {P \over I}$ | $I = {P \over U}$ |

---

##  teljesítmény mértékegységei 📏

A fizikai teljesítmény (P) a munkavégzés vagy energiaátvitel sebessége, más szóval az egységnyi idő alatt végzett munka.

| teljesítmény | elektromos | általános |
|:------------:|:----------:|:---------:|
|  | feszültség és áramerősség szorzata | adott idő alatt elvégzett munka és az idő hányadosa |
|  | $P = U \times I$ | $P = {W \over t}$ |
| $1 W$ | $= 1 {VA}$ | $= 1{J \over s}$ |

---

## Áramforrások (🔋 telepek és 🔌 tápegységek)

Jellemzően a villamos hálózat váltakozó áramát használjuk fel transzformátorral és egyenirányítóval, vagy akkumulátorokban tárolt kémiai energiát alakítjuk elektromos árammá.
Az akkumulátorok kapacitása az energia mennyisége, amelyet egy akkumulátor képes tárolni, ezt amperórában (Ah) mérik.
Áramforrásokat összeköthetünk sorosan és párhuzamosan.

---

## Elektromágneses tér

Az elektromágneses sugárzás terjedési közege. Elektromos és a mágneses mezőből áll, amelyek kölcsönhatásban vannak egymással.
Ez az erőtér az elektromos töltéseket az áramkörökben mozgásra ösztönzi, valamint a töltések mozgása is hullámot kelt az elektromágneses mezőben.

Az elektromágneses hullámok mindenféle formái a rádióhullámok, a látható fény is.
![Elektromágneses spektrum](https://astro-canada.ca/uploads/a3400-electromagnatique-eng-g.jpg)

---

###  terjedési sebesség (v) 🏎

Vákuumban mindig a fénysebesség (c) értékével megegyezik, ami ~ `300 000 000 m/s`. 
Azonban más közegben, például levegőben vagy egyéb anyagokban az elektromágneses hullámok terjedési sebessége kisebb lehet.
Amikor ilyen eltérő közegeken halad át a hullám, az iránya, energiája, sebessége megváltozik.

---

###  frekvencia (f) 🎶

Az elektromágneses hullámok frekvenciája a hullámok ismétlődési gyakoriságát jelzi, és egységének mértékegysége a hertz (Hz), ami egy másodpercben mért ismétlődést jelent. Minél magasabb a frekvencia, annál több hullámcsúcs érkezik egy adott időtartamban. Az elektromágneses hullámok frekvenciája közvetlenül arányos az energiájukkal.
$f = {1 \over t}$
1 Hz annak a jelnek a frekvenciája, ahol 1 s alatt 1 periódus játszódik le.
Példa: [A normál zenei A hang frekvenciája 440 Hz](https://upload.wikimedia.org/wikipedia/commons/archive/5/50/20150415133718%21Sine_wave_440.ogg)

---

###  hullámhossz (λ) 📏

Az elektromágneses hullámok hossza a két egymást követő hullámcsúcs vagy hullámvölgy közötti távolság. A hullámhosszt általában méterben (m) mérik.
Az elektromágneses hullámok hullámhossza és frekvenciája fordítottan arányosan változik: minél nagyobb a frekvencia, annál rövidebb a hullámhossz.
| Példa alkalmazás | Hullámhossz |
|:-----------------|------------:|
| PMR rádió        |       70 cm |
| WiFi (2.4G)      |     12,5 cm |
| Látható fény     |      600 nm |

---

##  terjedési sebesség, frekvencia, hullámhossz összefüggése 〰️

Az elektromágneses hullámok terjedési sebessége azok frekvenciájának és hullámhosszának szorzata.
Az összefüggés a következő képlet segítségével adható meg:

$v = f \times λ$

ahol:

    v a hullámok terjedési sebessége (m/s),
    f a hullámok frekvenciája (Hz),
    λ a hullámok hullámhossza (m).

---

## Szinuszos jelek

Az elektrotechnikában, híradástechnikában legnagyobb jelentősége a szinuszos lefolyású váltakozó feszültségnek van. Az ilyen típusú feszültséget gyakran alkalmazzák váltakozó áramú rendszerekben, például az otthoni elektromos hálózatban vagy az elektronikus eszközökben. Az ilyen hullámforma könnyen kezelhető és előállítható, és számos alkalmazási területen hasznos.
$V(t)=Vmax​⋅sin(2πft+ϕ)$

---

##  grafikus ábrázolása az idő függvényében 📈

Egy szinuszos lefolyású váltakozó feszültség grafikusan egyenletesen változik a pozitív és negatív irányban egy szinusz hullámforma szerint. A frekvencia meghatározza a hullám gyakoriságát, míg a maximális feszültség meghatározza a hullám amplitúdóját. A fáziseltolás pedig azt jelzi, hogy a hullám melyik pontján kezdődik az időben.
![Szinusz hullám](https://i0.wp.com/thescienceandmathszone.com/wp-content/uploads/2020/11/IMG_0564.jpg?resize=768%2C332&ssl=1)

---

##  frekvencia mértékegysége 🦸‍♂️

A váltakozó áram effektív értéke az az érték, amely azonos teljesítményt adna egy ugyanilyen értékű egyenárammal.
Kiszámítása a váltakozó áram hullámformája alapján történik, szinuszos esetben a csúcsértéket osztjuk 2 négyzetgyökével.
|||
|-|-|
|$U_{eff} = {U_{max} \over \sqrt 2 }$|$I_{eff} = {I_{max} \over \sqrt 2 }$|

🔌Példa: $U_{eff} = 230V$, $U_{max}=U_{eff} \times \sqrt 2=230V*1.41 \approx 325V$

---

## Nem-szinuszos jelek

Minden nem szinuszos, de periodikus jel felírható szinuszos jelek összegeként / különbségeként.

* periodikus négyszögjel
* szaggatott jelek (PWM)
* hang

---

##  grafikus ábrázolás az idő függvényében 📉

![jelek](https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Waveforms.svg/620px-Waveforms.svg.png)

---

## Modulált jelek

A moduláció során egy magasabb frekvenciájú jel (vivő) tulajdonságait módosítjuk egy alacsonyabb frekvenciájú jel (moduláló jel) alapján.
Ennek eredményeként a hullám hordozza a vivő jel és a moduláló jel tartalmát. A moduláló jel gyakran hang, vagy adat.
A moduláció előnye, hogy a magasabb frekvenciájú hordhullám hatékonyabban terjed , így lehetővé teszi a nagyobb hatótávolságú kommunikációt és jobb zajállóságot.

---

##  modulációk típusai, előnyeik, hátrányaik 🔍

* Távíró üzemmód (CW): két állapotot különböztet meg: szünet (space) / jel (mark). Az egymást váltó jelek és szünetek hosszának aránya az információ.
* Amplitúdó moduláció (AM): A moduláló jel amplitúdójának módosítása a vivőhullámon.
* Frekvenciamoduláció (FM): A moduláló jel frekvenciájának módosítása a vivóhullámon.
* Fázis moduláció (PM): A moduláló jel fázisának módosítása a vivőhullámon.

![Modulációk](https://upload.wikimedia.org/wikipedia/commons/a/a4/Amfm3-en-de.gif)

---

##  modulálatlan vivőhullám [(CW)](https://www.sigidwiki.com/wiki/Morse_Code_(CW))

Legkisebb sávszélesség az összes üzemmód közül. Jellemzője a WPM, ami a percenkénti szavak rövidítése, az adás sebességének mértéke.

   ➕ Egyszerűsége miatt nagyon könnyű adó- és vevőberendezést építeni hozzá.
   ➕ Kitűnő jel/zaj viszony, kis energiával nagy távolság érhető el.
   ➖ Hang átvitel helyett csak karakterek.

---

##  amplitúdómoduláció [(AM)](https://www.sigidwiki.com/wiki/AM)

A szinuszos vivőhullám amplitúdóját a moduláció ütemének megfelelően változtatjuk, a frekvencia változatlanul hagyása mellett. Az információt a vivőhullám amplitúdója tartalmazza.
AM esetében egy moduláló jel esetén is két jel keletkezik a vivőhullám mellett, emiatt két oldalsávos amplitúdómodulációnak nevezik (AM-DSB).

   ➕ Könnyű előállítás és demodulálhatóság
   ➖ Rossz jel/zaj viszony, a vivő és a két oldalsávból az egyik nem hordoz plusz információt (felesleges energia).

---

##  egyoldalsávos amplitúdómoduláció [(SSB)](https://www.sigidwiki.com/wiki/SSB)

AM-DSB jel: alsó oldalsáv + vivő + felső oldalsáv. Ebből a vivő és az egyik oldalsáv elnyomásával csak az átvinni kívánt információ sugárzik ki. USB a felső oldalsáv megtartása, LSB az alsó oldalsáv megtartása.
![SSB-SC magyazázó ábra](https://eng.libretexts.org/@api/deki/files/32735/clipboard_eac2ba19011866dff2ed75df085a9e787.png)
AM-SSB/SC moduláció:
   ➕ Kisugárzott teljesítmény 100%-a információt hordoz.
   ➖ Bonyolultabb a jel előállítása és demodulálása.

---

##  frekvenciamoduláció [(FM)](https://www.sigidwiki.com/wiki/NFM_Voice) és fázismoduláció (PM)

A szinuszos vivőhullám pillanatnyi frekvenciáját a moduláció ütemében úgy változatjuk, hogy közben az amplitúdója változatlan marad.
A frekvenciamoduláció és a fázismoduláció között az a különbség, hogy a moduláció során FM esetében a frekvenciát, míg fázismoduláció (PM) esetén a φ-fázisszöget befolyásoljuk, amely vételi szempontból nem lényeges.

   ➕ Kevésbé érzékeny a külső eredetű zajokra
   ➕ Adó hatásfoka jobb
   ➕ Vett állomás hangereje nem függ az adó teljesítményétől
   ➖ Nagyobb sávszélesség
   ➖ Kisugárzott teljesítmény nagy része nem hordoz információt

---

##  vivő, oldalsávok, sávszélesség 🏍

![](https://upload.wikimedia.org/wikipedia/commons/2/23/Am-sidebands-en.svg)

---

## Teljesítmény és energia

Az elektromos teljesítmény az elektromos berendezések által felvett vagy leadott energia egységnyi időre vetítve.

Az elektromos energia az elektromos berendezések által felhasznált vagy előállított összmennyiség.

A rádiótechnikában a teljesítményarányokat decibelben (dB) adják meg. A dB skála nem lineáris, hanem logaritmikus. Értelmezünk relatív, és abszolút dB értékeket. `0 dB` az azonosat jelenti.

| dB érték | Teljesítmény szorzó | dB érték | Teljesítmény szorzó |
|---:|----:|----:|-----:|
|  3 |   2 | -3  | 0.5  |
|  6 |   4 | -6  | 0.25 |
| 10 |  10 | -10 | 0.1  |
| 20 | 100 | -20 | 0.01 |

---

##  szinuszos jelek teljesítménye 🎤

Amikor az áram vagy feszültség szinuszos jelként viselkedik és egy ellenálláson keresztül halad, teljesítmény képletével és az Ohm-törvény felhasználásával:
| | | |
|--|--|--|
|$P={V^2_{rms} ​​\over R}$|$P=I^2_{rms} \times R$|![RMS](https://upload.wikimedia.org/wikipedia/commons/8/89/Sine_wave_voltages.svg)|

---

##  be- és kimeneti teljesítmény és a hatásfok közötti összefüggés 🔮
Egy rendszer vagy eszköz esetén
* a bemeneti teljesítmény, amelyet felvesz a bemeneti forrásból,
* a kimeneti teljesítmény, amennyi hasznos munkát vagy kimeneti jelet állít elő,
* a hatásfok egy arány, amely azt mutatja meg, hogy mennyire hatékonyan alakítja át a bemeneti energiát hasznos kimeneti energiává.
Általában százalékban fejezik ki, és a kimeneti teljesítmény és a bemeneti teljesítmény hányadosaként számolják ki.
Minél magasabb a hatásfok, annál hatékonyabban működik.

---

# Befejezés

## Ajánlott irodalom
[15/2013. (IX. 25.) NMHH rendelet a rádióamatőr szolgálatról](https://net.jogtar.hu/jogszabaly?docid=a1300015.nmh)
[hg9ieg gyűjteménye](https://hg9ieg.hu/_sz/muszaki_ismeretek.html)
[ha5kdr jegyzet](https://www.ha5kdr.hu/uploads/2015/10/jegyzet.pdf)
[puskás jegyzet](http://www.puskas.hu/r_tanfolyam/r_tananyag.html)