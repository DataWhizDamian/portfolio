# Instalowanie i ładowanie pakietów
library(tidyverse)
library(readxl)

# Wczytanie danych
data <- read_excel("Desktop/a.xlsx")
data <- read_excel("Desktop/Praca inżynierska/P2_260493/260493_szpital.xlsx")
data = data[,-c(16,17)]
head(data)

# Przetwarzanie wstępne danych
# Zamiana przecinka na kropkę w kolumnie "CENA" i "WARTOSC_SKOR" oraz zmiana typu danych
data$CENA <- as.numeric(gsub(",", ".", data$CENA))
data$WARTOSC_SKOR <- as.numeric(gsub(",", ".", data$WARTOSC_SKOR))
data$ID_PACJENT <- as.factor(data$ID_PACJENT)
data$ID_SWIADCZENIA <- as.factor(data$ID_SWIADCZENIA)




# Podstawowe statystyki opisowe
summary(data)

library(psych)
describe(data[,c(1,2,3,4,11,12,13)])




