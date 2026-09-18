---
marp: true
title: Matematikai és fizikai alapok (HAREC)
author: Urbán Dániel
paginate: true
theme: gaia
---

# Matematikai és fizikai alapok

## HAREC fokozat

---

# Fizikai mennyiség

- mértékszám + mértékegység
- pl.: 230 V, 1750 Hz, 50 Ω
- SI alapegységek: m, kg, s, A, K, mol, cd

---

# Prefixumok (ismétlés)

| Jel | Érték | | Jel | Érték |
|---|---|---|---|---|
| T | 10^12 | | m | 10^-3 |
| G | 10^9 | | µ | 10^-6 |
| M | 10^6 | | n | 10^-9 |
| k | 10^3 | | p | 10^-12 |

---

# Összetett mértékegységek

- egy mennyiség több alapegységből is összetevődhet
- pl. térerősség: **V/m**
- pl. teljesítménysűrűség: **W/m²**
- pl. sebesség: **m/s**
- a mértékegység elárulja, mit mérünk

---

# Alapműveletek

- összeadás, kivonás, szorzás, osztás
- műveleti sorrend: zárójel → hatványozás → szorzás/osztás → összeadás/kivonás
- kommutativitás: $a+b=b+a$, $a \cdot b = b \cdot a$
- disztributivitás: $(a+b)\cdot c = a\cdot c + b\cdot c$

---

# Törtek

- $\dfrac{a}{b}$: a = számláló, b = nevező, $b \neq 0$
- összeadás: $\dfrac{a}{b}+\dfrac{c}{d}=\dfrac{ad+bc}{bd}$
- szorzás: $\dfrac{a}{b}\cdot\dfrac{c}{d}=\dfrac{ac}{bd}$
- osztás: fordított tört szorzása

---

# Tíz hatványai, kitevős mennyiségek

- $a^n = a \cdot a \cdot \ldots \cdot a$ ($n$ db)
- $a^0 = 1$ ($a \neq 0$)
- $a^m \cdot a^n = a^{m+n}$
- $a^m / a^n = a^{m-n}$
- $(a^m)^n = a^{m \cdot n}$
- negatív kitevő: $a^{-n} = \dfrac{1}{a^n}$

---

# Négyzetre emelés, négyzetgyök

- $a^2 = a \cdot a$
- $\sqrt{a}$: az a szám négyzetgyöke ($\sqrt{a}\cdot\sqrt{a}=a$)
- $\sqrt{a \cdot b} = \sqrt{a}\cdot\sqrt{b}$
- fontos rádiótechnikai példa: $P = \dfrac{U^2}{R}$, tehát $U = \sqrt{P \cdot R}$

---

# Logaritmus

- a hatványozás inverze: ha $10^x = a$, akkor $x = \log_{10}a$
- $\log(a \cdot b) = \log a + \log b$
- $\log(a/b) = \log a - \log b$
- $\log(a^n) = n \cdot \log a$
- a rádiótechnikában a **dB** (decibel) számítás alapja

---

# Inverz érték

- egy mennyiség reciproka: $\dfrac{1}{a}$
- pl. ellenállás és vezetőképesség: $G = \dfrac{1}{R}$
- pl. frekvencia és periódusidő: $f = \dfrac{1}{T}$
- párhuzamos kapcsolásoknál gyakran reciprokokkal számolunk

---

# Lineáris és nemlineáris diagramok

- lineáris összefüggés: egyenes vonal, $y = a \cdot x + b$
- pl. $U = I \cdot R$ grafikonja (állandó R esetén) egyenes
- nemlineáris összefüggés: nem egyenes (pl. görbe, törtfüggvény)
- pl. dióda áram-feszültség jelleggörbéje nemlineáris

---

# Bináris számrendszer

- csak két számjegyet használ: 0 és 1
- helyiértékek: $2^0, 2^1, 2^2, \ldots$
- példa: $1011_2 = 1\cdot8 + 0\cdot4 + 1\cdot2 + 1\cdot1 = 11_{10}$
- a digitális áramkörök és digitális üzemmódok alapja

---

# Képletek átalakítása

- egy képlet átrendezhető, ha mindkét oldalt ugyanazzal a mennyiséggel szorozzuk/osztjuk
- $P = U \cdot I \;\Rightarrow\; U = \dfrac{P}{I} \;\Rightarrow\; I = \dfrac{P}{U}$
- $U = I \cdot R \;\Rightarrow\; I = \dfrac{U}{R} \;\Rightarrow\; R = \dfrac{U}{I}$
- fontos: a HAREC vizsgán a képleteket önállóan kell átalakítani

---

# Miért fontos ez a HAREC vizsgán?

- áramkörök elemzése számításokat igényel
- dB-es teljesítményarányok logaritmust igényelnek
- digitális modulációk (FSK, PSK, QAM) leírása bináris alapú
- szűrők, rezgőkörök jelleggörbéi nemlineárisak

---

# Összefoglalás

- mértékegység és prefixum pontos ismerete
- hatványozás, gyökvonás, logaritmus biztos használata
- képletek önálló átalakítása
- bináris számrendszer alapjai
