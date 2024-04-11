library(readxl)

#ZBIÓR KLIENCI
klienci <- read_excel("~/Desktop/Analiza i klasyfikacja danych/ZAD_1_AKD/260493_klienci.xlsx", 
                              sheet = "klienci", range = "A1:J1001")
View(klienci)
head(klienci)

dim(klienci) # Rozmiary zbioru danych
str(klienci) # struktura zbioru, typy zmiennych
table(is.na(klienci)) #Braki danych
summary(klienci[,c(2,3,9)]) #Dane statystyczne zmienny ilościowych
table(klienci$przedstawiciel) #Dane zmiennej kategorialnej


# ZBIÓR LOKATY
lokaty <- read_excel("~/Desktop/Analiza i klasyfikacja danych/ZAD_1_AKD/260493_lokaty.xlsx", 
                             sheet = "bank_additional_full")
View(lokaty)
head(lokaty)

dim(lokaty) # Rozmiary zbioru danych
str(lokaty) # struktura zbioru, typy zmiennych
table(is.na(lokaty)) #Braki danych
summary(lokaty[,c(1,11,16,17,18,19,20)]) #Dane statystyczne zmienny ilościowych
table(lokaty$y)
table(lokaty$`age range`)




