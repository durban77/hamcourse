---
marp: true
title: Hullámterjedés (HAREC)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Hullámterjedés

## HAREC fokozat

---

# Terjedési módok áttekintése

- közvetlen hullámterjedés (LOS)
- talajreflexió
- felületi hullámterjedés
- troposzférikus terjedés
- ionoszférikus terjedés

---

# Közvetlen hullámterjedés (LOS)

- URH és mikrohullámon domináns; a két antenna közötti egyenes vonalban terjed
- határa a **rádióhorizont** (antennamagasság + Föld sugara, gyakorlatban $4/3 R_{Föld}$-del számolva)
- teljesítménysűrűség a távolság négyzetével, térerősség a távolsággal fordítva arányos (szabadtéri csillapítás)
- mikrohullámon: légköri abszorpció, eső, köd jelentős csillapítást okozhat

---

# Talajreflexió

- URH-n domináns kísérő jelenség: a direkt hullám mellett a talajról visszaverődő (indirekt) hullám is eljut a vevőhöz
- a vevőponton az eredő térerősség a két hullám amplitúdójától és fáziskülönbségétől függ
- a visszaverődés amplitúdó- és fázisugrása a talaj paramétereitől, polarizációtól és beesési szögtől függ

---

# Felületi hullámterjedés

- hosszúhullámon jellemző, a hullám a földfelszín mentén terjed (**felületi hullám**), a magasabban terjedő komponens a **térhullám**
- függőleges polarizációnál a talajban keletkező tükörkép erősíti a térerőt
- vízszintes polarizációnál a tükörkép kioltja a térerőt a felszín közelében → ezért csak függőleges polarizációval működik
- az antenna **kisugárzási szöge** és magassága határozza meg az áthidalható távolságot (kis szög → nagyobb távolság rövidhullámon)

---

# Troposzférikus terjedés

- a troposzféra inhomogenitásai (turbulencia) szétszórják a kisugárzott energiát
- a szórt energia egy része a vevőantennába kerülhet (közös szórótérfogat)
- nagy csillapítás, nagy teljesítmény és éles antennák szükségesek — 200 MHz felett, ritkán amatőr alkalmazás

---

# Ionoszféra rétegei

- **D réteg** (~60-90 km): erős csillapítás nappal, akadályozza a KH/hosszúhullámú távvételt
- **E réteg** (~100-110 km): stabil, napszaktól/évszaktól kevésbé függő
- **F réteg** (~250 km): rövidhullámú távolsági összeköttetések alapja; nappal F1/F2-re bomlik, éjjel egybeolvad

---

# Ionoszférikus terjedés mechanizmusa

- a beérkező rádióhullám a szabad elektronokat mozgásba hozza
- elegendő ütközésszám esetén a réteg vezetővé válik → visszaverődés
- növekvő frekvencián egyre magasabb rétegről verődik vissza a hullám
- **többutas terjedés:** a hullám egyszerre több úton (más rétegmagasság, más szög) is elérheti a vevőt, ezek interferenciája okozza a szelektív fadinget
- az ionoszféra állapota változó: hosszútávú előrejelzés statisztika, rövidtávú szondázás alapján

---

# Kritikus frekvencia és MUF

- **kritikus frekvencia:** a legnagyobb frekvencia, amely még függőleges beesésnél visszaverődik az ionoszféráról
- **MUF (maximális használható frekvencia):** a legnagyobb frekvencia, amely adott ferde beesési szögnél még visszajut a Földre egy adott szakaszon
- a MUF felett a hullám áthatol az ionoszférán (nincs visszaverődés)

---

# Holt zóna és többugrásos terjedés

- **holt zóna (skip zone):** a felületi hullám hatótávolsága és az ionoszféráról visszavert hullám becsapódási pontja között nem vehető a jel
- **többugrásos terjedés:** a hullám egymás után többször verődik vissza a Föld és az ionoszféra között — így nagy távolságok hidalhatók át

---

# Szórt E-visszaverődés, meteor-terjedés

- **szórt (sporadikus) E-visszaverődés:** az E rétegben időszakosan kialakuló, erősen ionizált foltokról való visszaverődés — VHF-en is lehetővé tesz távolsági vételt
- **meteor-nyomvonalas terjedés:** a légkörbe belépő meteorok ionizált csíkjairól való rövid idejű visszaverődés, jellemzően VHF-en

---

# Hold-visszaverődés (EME)

- Earth-Moon-Earth: a rádióhullám a Holdról verődik vissza a Földre
- nagy útcsillapítás → nagy antennanyereség és teljesítmény szükséges
- elsősorban VHF/UHF sávokban alkalmazott, különleges összeköttetési mód

---

# Fading — ionoszférás módok

- **szelektív fading:** az ionoszféra változása a jel egyes frekvenciakomponenseit eltérően csillapítja
- **polarizációs fading:** a visszavert jel polarizációja forgásszerűen változik
- **abszorpciós fading:** a D/F réteg csillapítása a napsugárzás hatására ingadozik
- **ugrási fading:** a visszaverő réteg magasságváltozása miatt a beesési szög és a vett térerő is változik

---

# Fading — közvetlen terjedési módok

- **interferencia fading:** a direkt és a talajról visszavert jel eltérő úthosszal érkezik, erősítik/gyengítik egymást
- **abszorpciós fading:** por, füst, csapadék (eső, hó, köd) csillapítja az URH/VHF jelet — a csillapítás a frekvenciával nő

---

# Zajforrások

- **galaktikus zajok:** a Tejútrendszerből érkező háttérzaj (elsősorban alacsonyabb frekvenciákon jelentős)
- **földi eredetű zajok (termikus zaj):** a vevő és a környezet hőmozgásából eredő zaj
- **atmoszférikus zajok:** távoli villámlásokból eredő zaj, elsősorban alacsony frekvenciákon erős

---

# Napfolt-ciklus hatása

- a Nap aktivitása kb. 11 éves ciklusban változik
- magas napfolt-aktivitás → erősebb ionizáció → magasabb MUF, jobb rövidhullámú DX-terjedés
- a hosszútávú terjedési előrejelzések ezen a cikluson alapulnak

---

# RH, URH és mikrohullámú terjedés sajátosságai

- **RH (rövidhullám):** ionoszférikus terjedés dominál, nagy távolságok, erősen napszak-/évszakfüggő
- **URH:** elsősorban LOS + talajreflexió, kiegészülve sporadikus E és troposzférikus terjedéssel
- **mikrohullám:** LOS dominál, időjárás (eső, köd) jelentősen csillapíthat

---

# Terjedési előrejelzéshez szükséges ismeretek

- domináns zajforrások és jel/zaj viszony
- legkisebb vehető jelszint (vevő érzékenysége/zajtényezője)
- szakasz-csillapítás, antennanyereség, tápvonal-csillapítás
- ezek együtt határozzák meg a szükséges legkisebb adóteljesítményt

---

# Összefoglalás

- rövidhullámon az ionoszféra (D/E/F réteg, MUF, kritikus frekvencia) a döntő
- URH/mikrohullámon a LOS és a troposzférikus/légköri hatások dominálnak
- különleges terjedési módok: sporadikus E, meteor-szórás, Hold-visszaverődés
- a fading sokféle oka lehet — ionoszférás és közvetlen terjedésnél is más mechanizmus áll mögötte
