library(readxl)

#Baza_danych
db <- read_excel("~/Desktop/Analiza i klasyfikacja danych/3) PROJEKT/dane_260493.xlsx", 
                          sheet = "Baza_danych")
head(db)
names(db) #Nazwy nagłówków
dim(db) # Rozmiary zbioru danych
str(db) # struktura zbioru, typy zmiennych
table(is.na(db)) #Braki danych

#Region (przedstawiciela)
r <- read_excel("~/Desktop/Analiza i klasyfikacja danych/3) PROJEKT/dane_260493.xlsx", 
                 sheet = "Regiony")
dim(r)
str(r)
table(is.na(r)) 


#wojewodztwa (miasta, powiaty) 
p <- read_excel("~/Desktop/Analiza i klasyfikacja danych/3) PROJEKT/dane_260493.xlsx", 
                 sheet = "Powiaty")
dim(p)
str(p)
table(is.na(p)) 

#OSTATECZBE DANE
dane<- read_excel("~/Desktop/Analiza i klasyfikacja danych/3) PROJEKT/dane_260493.xlsx", 
                sheet = "Dane")
dane
dim(dane)
str(dane)
table(is.na(dane)) 


#----------------------------------------------------------------------------------------------

summary(dane[,c(10:15)]) #Dane statystyczne zmiennych ilościowych
summary(dane[,c(7,9)])

library(psych)
describe(dane[,c(10:15)])







