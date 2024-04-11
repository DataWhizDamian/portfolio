library(tidyverse)
library(ggplot2)
library(class)

#wczytanie danych
star<- read.csv("star_classification.csv", header=TRUE, sep=",", dec=".", na.strings="NA")
star

data("iris")
iris

#Przygotowane dane
dane = star[,c(2:8, 14)]
dane$class = ordered(as.factor(dane$class)) #Zmienna kategoryczna uporządkowana

#Podstawowe informacje o danych
names(dane)
str(dane)
dim(dane)
class(dane)

#Częstość występowania każdej klasy 
freq <- table(dane$class)
barplot(freq, col = c("red", "yellow", "green"),  main = "Wystąpienia klas")


#statystyki opisowe zmiennych numerycznych
summary(dane[,-8])
library(psych)
describe(dane[,-8])



#-------------------------------------------------------------------------------------------------------------------------------------------------
### K-NN
# Losowe 90% wierszy
random <-sample(1:nrow(dane),size=0.9*nrow(dane))
random

  #Funkcja normująca
f_nor <-function(x) { (x-min(x))/(max(x)-min(x)) }

  # Normuje kolumny zmiennych numerycznych i zapisuje jako ramka danych bez kolumny 8
dane.norm<-as.data.frame(lapply(dane[,c(-8)],f_nor))
head(dane.norm)

  # Zbiór treningowy spośród 90% losowo wybranych wierszy 
dane.train<-dane.norm[random,]
head(dane.train)
  # Zbiór testowy z pozostałych 10% wierszy 
dane.test<-dane.norm[-random,]
dane.test

  # Kolumnę prawdziwej klasyfikacji dla zbioru treningowego 
dane.train.category <- dane[random,8]
dane.train.category
  #Kolumna prawdziwej klasyfikacji dla zbioru testowego
dane.test.category <- dane[-random,8]
dane.test.category

  
  # Klasyfikuje obiekty ze zbioru testowego dla k= i 
d <- knn(dane.train,dane.test,cl=dane.train.category,k=10)
d

  # Tworzy macierz błędów (1-szy wiersz prawidłowa klasyfikacja)
error_matrix <- table(d,dane.test.category)
error_matrix

  # Funkcja licząca częstość prawidłowych prognoz k (efektywność k)
f_effective <- function(x){ sum(diag(x)/(sum(rowSums(x)))) * 100 }
f_effective(error_matrix)



#Poszukiwanie najlepszego k = i {i = 1,...,20}
skutecznosc <- 0
for(i in 1:20) {
  d = knn(dane.train,dane.test,cl=dane.train.category,k=i)          
  error_matrix <- table(d,dane.test.category)                       
  f_correct <- function(x){ sum(diag(x)/(sum(rowSums(x)))) * 100 } 
  
  print(paste("krok numer: ", i, ", skuteczność k = ",  f_correct(error_matrix)))
  skutecznosc[i] = f_correct(error_matrix)
}
skutecznosc
plot(skutecznosc, type = "l", xlab = "k", ylab = "skuteczność", main = "Precyzja funkcji k-NN", col = "red")
max = max(skutecznosc)
which(skutecznosc == max) #najlepsze k



###DOCELOWE BADANIE
#funkcja normująca
nor <- function(x){(x - min(x))/(max(x)-min(x))}

#stworzenie tabeli zmiennych numerycznych (dane bazowe)
dane1 <- dane[, c(-8)]
str(dane1)

#wprowadzenie badanych wartości
star1=c(133.689107, 30.4946318, 21.37902, 25.21130 ,19.99501, 20.96573, 19.99371)
star2=c(22.052556, 9.4978808, 23.89214, 21.35644, 20.18345, 21.84956, 15.76756)
star3=c(119.175021, 38.7576541, 22.01756, 21.47564, 18.85662, 18.18365, 17.77564)
star4=c(42.075615, 32.7460194, 21.86580, 18.68362, 17.18674, 16.57467, 16.13549 )

#połączenie danych bazowych z danymi badanymi
dane2=rbind.data.frame(dane1, star1, star2, star3, star4)

#rzutowanie typu (na ramkę danych)
dane_norm=as.data.frame(lapply(dane2[,c(-8)], nor))

#podział danych na część UCZĄCĄ (dane bazowe) i TESTOWĄ (dane badane)
dane.train=dane_norm[c(1:100000),]
dane.test=dane_norm[c(100001:100004),]

#Cechy, które będziemy nadawać badanym danym (klasa - zmienna kategoryczna)
dane.target.type <- dane[,8]
dane.target.type

#klasyfikacja obiektów dla najlepszego k = 5
odp <- knn(dane.train, dane.test, cl=dane.target.type,k=5)
odp

pie(table(odp), main = "Klasyfikacja badanych obiektów")


