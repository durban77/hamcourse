# Rádióamatőr vizsgára felkészítő jegyzet — Markdown conversion

Converted from the HA5KDR club's amateur-radio exam study notes (167-page PDF, 2015
edition). Split into one Markdown file per chapter, each with its images extracted
into `images/` and referenced inline with a one-line caption. Page numbers were
dropped per request.

**Math note:** the source PDF encoded operators and Greek letters (=, *, Ω, λ, π,
μ, ω, Δ, Σ, etc.) as Symbol-font glyphs that most extractors mis-render as
gibberish or blank characters. These were identified and mapped back to their
correct symbols, and formulas that were still broken across multiple lines
(stacked fractions, superscript exponents) were manually reconstructed as plain-text
expressions (e.g. `f0 = 1 / (2π√(LC))`), cross-checked against the rendered PDF pages.

## Chapters

1. Rádióamatőr alapismeretek
2. Matematikai és fizikai alapok
3. Villamosság-, elektromágnesesség-, és rádiótechnika alapjai
4. Alkatrészek
5. Rádióhullám és moduláció
6. Áramkörök
7. Vevők
8. Adók
9. Antennák és tápvonalak
10. Hullámterjedés
11. Mérések
12. Zavarás és védelem
13. Villamos biztonságtechnika
14. Forgalmi ismeretek
15. Digitális üzemmódok
16. Mellékletek

A few large multi-row tables with awkward original wrapping (frequency-band
plans, cable-attenuation table) are preserved as plain-text blocks rather than
Markdown tables, to avoid losing/misaligning data — everything else uses proper
Markdown tables, headers, and lists.
