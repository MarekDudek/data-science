#!/bin/bash

echo Running R script

rm -frv ./*.pdf
rm -frv ./*.gif

Rscript ./linear-regression.R
Rscript ./structure-of-a-function.R
Rscript ./mandelbrot.R
Rscript ./coagulation-vs-diet.R
