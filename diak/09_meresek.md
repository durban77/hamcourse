---
marp: true
title: Mérések (HAREC)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Mérések

## HAREC fokozat

---

# Mérési módszerek

- **közvetlen összehasonlítás:** a mérendő mennyiséget azonos mennyiséggel hasonlítjuk össze
- **közvetett összehasonlítás:** hitelesített skálát használunk
- **differenciamérés, helyettesítés, felcseréléses mérés (híd):** a mérőeszköz saját hibája kiküszöbölhető

---

# Mérési hibák

- **rendszeres hiba:** nagysága és előjele ismert/meghatározható → korrigálható
- **véletlen hiba:** oka nem ismert, időben változó → többszöri méréssel, statisztikai kiértékeléssel csökkenthető
- minél pontosabb a műszer, annál drágább — a feladatnak megfelelő pontosságot válasszunk

---

# Analóg és digitális műszerek

- **analóg:** mutató kitérése a skálán — leolvasási hibalehetőség
- **digitális:** számjegyes kijelzés — nincs leolvasási hiba, de HOLD/PEAK funkció segíthet változó jel mérésénél
- több méréshatárú műszernél: analógnál a legnagyobb méréshatárból indulunk, digitálisnál a legkisebb, még beleférő méréshatárt választjuk (vagy automatikus váltás)

---

# Feszültség mérése

- a voltmérőt a mérendő két pont közé, **párhuzamosan** kötjük
- ideális voltmérő: végtelen belső ellenállás (szakadásként viselkedik)
- valós műszer: alapműszer + előtét-ellenállás (feszültségosztó) — a rajta folyó áram mérési hibát okoz
- a mérési pontosságot a jel **frekvenciája** és **hullámalakja** is befolyásolja, mivel a műszer belső ellenállása/átviteli tulajdonsága frekvenciafüggő lehet

---

# Áram mérése

- az ampermérőt az áramkörbe **sorosan** kötjük (meg kell szakítani a kört)
- ideális ampermérő: nulla belső ellenállás (rövidzárként viselkedik)
- valós műszer: alapműszer + sönt-ellenállás (áramosztó) — a rajta eső feszültség hibát okoz

---

# Ellenállás mérése

- **feszültség és áram méréssel:** Ohm-törvény alapján számolva — figyelni kell a mérőműszerek saját hibájának hatására
- **összehasonlító módszer:** dekádellenállással azonos feszültségesésre állítva
- **hídkapcsolás (Wheatstone-híd):** kiegyenlítéskor $R_2 R_x = R_1 R_3$ — a mérés nem függ a bemeneti feszültségtől

---

# Teljesítmény mérése

- **egyenáramú:** ismert terhelésnél elég $U$ vagy $I$ mérése, $P=UI$ képlettel
- **rádiófrekvenciás:** ismert (jellemzően 50 Ω) terhelésnél a feszültséget csúcs-egyenirányítóval mérjük, majd a kapott DC szintből számítjuk a teljesítményt
- **PEP mérése:** a moduláció csúcsértékéhez tartozó pillanatnyi teljesítmény, csúcstartó (peak-hold) méréssel határozható meg
- oszcilloszkóppal a rádiófrekvenciás jel és a burkolójának hullámalakja is közvetlenül megfigyelhető (pl. túlvezérlés felismerése)

---

# Frekvenciamérés

- **oszcilloszkóppal:** a periódusidő mérése, ebből $f=1/T$
- **digitális frekvenciamérővel (számláló):** a jelet négyszögesíti, majd pontosan 1 másodpercig számlálja az átmeneteket
- **abszorpciós frekvenciamérővel:** hangolható rezgőkör induktív csatolással

---

# Rezonanciafrekvencia mérése

- passzív rezgőköröknél (oszcillátor, szűrő, antenna) alkalmazható
- eszköz: **GDO (grid dip oszcillátor)** — hangolható oszcillátor, amelynek tekercsét a mérendő rezgőkörhöz közelítik
- amikor a GDO frekvenciája megegyezik a mérendő kör rezonanciafrekvenciájával, energiát von el tőle → amplitúdó-csökkenés (dip) — a frekvencia a skáláról leolvasható

---

# SWR-mérő felépítése

- a tápvonalról csatolóhálózattal kicsatolja a mérési energiát, anélkül hogy illesztetlenséget okozna
- egyenirányítja az előremenő (FWD) és a visszatérő (REV) teljesítményt
- **keresztműszeres** kivitel: egyszerre mutatja mindkét irányt, kapcsolgatás nélkül

---

# SWR mérés menete

- a mérőt a tápvonalba kötjük (antenna vagy műterhelés felé)
- kis adóteljesítménnyel (pl. 0,5-1 W) vivős üzemmódban (FM/CW) mérünk
- nem keresztműszeres mérőnél: FWD-re 100%-ra állítjuk, majd REV állásban olvassuk le az SWR-t
- rövidebb, mint 1λ tápvonalon mérve közelebb kapjuk az antenna valós SWR-jét

---

# Abszorpciós frekvenciamérő és műterhelés

- **abszorpciós frekvenciamérő:** hangolt párhuzamos rezgőkör, a rezonanciánál maximális feszültséget jelez, 0,5-1% pontossággal
- **műterhelés:** indukciószegény, 50 Ω-os ellenállás, hűtőfelülettel — az antennát helyettesíti mérés közben, hogy ne sugározzunk zavart

---

# Jelgenerátor, oszcilloszkóp, spektrumanalizátor

- **jelgenerátor:** ismert frekvenciájú és szintű teszt-jelet állít elő (vevő/szűrő beméréshez)
- **oszcilloszkóp:** a jel időfüggvényét (hullámalakját) mutatja meg — amplitúdó, periódusidő, torzítás vizuálisan vizsgálható
- **spektrumanalizátor:** a jel frekvenciatartománybeli összetételét (spektrumát) mutatja — felharmonikusok, zavaró kisugárzások kimutatására

---

# Összefoglalás

- feszültségmérő párhuzamosan, árammérő sorosan kötendő
- rendszeres hiba korrigálható, véletlen hiba statisztikával csökkenthető
- RF méréseknél ismert (50 Ω) terhelés/műterhelés szükséges
- SWR-mérő, GDO, abszorpciós frekvenciamérő: rádióamatőr gyakorlat jellegzetes műszerei
