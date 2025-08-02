package com.company.package3.programowanie_obiektowe.Projekt;

import com.company.package3.programowanie_obiektowe.Projekt.person.Consumer;
import com.company.package3.programowanie_obiektowe.Projekt.person.ConsumingMan;
import com.company.package3.programowanie_obiektowe.Projekt.person.Producer;
import com.company.package3.programowanie_obiektowe.Projekt.person.ProducingMan;
import com.company.package3.programowanie_obiektowe.Projekt.product.Food;

public class FoodFactory {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        foodFactory.run();
    }

    private void run() {
        ProducingMan[] producingPeople = new ProducingMan[]{
                new Producer("Alicja", "Zupowa"),
                new Producer("Krzysztof", "Ciastkarski")
        };
        ConsumingMan[] consumingPeople = new ConsumingMan[]{
                new Consumer("Łukasz", "Daniel", "chocolate"),
                new Consumer("Angelika", "Zajadacz", "fish")
        };

        int counter = 0;
        for (ProducingMan producingPerson : producingPeople) {
            for (ConsumingMan consumingPerson : consumingPeople) {
                counter++;
            }
        }

            Food[] foods = new Food[counter];

            int index = 0;
            for (ProducingMan producingPerson : producingPeople) {
                for (ConsumingMan consumingPerson : consumingPeople) {
                    Food food = producingPerson.produce(consumingPerson.getExpectations(), consumingPerson);
                    foods[index] = food;
                    index++;
                }
            }
            System.out.println("PRINTING FOOD");
            for (Food food : foods) {
                System.out.println(food);
            }
        }
    }