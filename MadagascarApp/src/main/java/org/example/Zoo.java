package org.example;

import Animals.*;
import Animals.interfases.Swimming;
import Food.*;
import Workers.Aviary;
import Workers.Worker;

public class Zoo {
    public static void main(String[] args) throws IllegalAccessException {
        //cоздание животных
        Puma Bagira = new Puma("bagira", 22);
        Tiger Shirhan = new Tiger("shirh_tiger", 35);
        Duck blackDuck = new Duck("black_duck", 11);
        Elephant Dambo = new Elephant("dambo", 99);
        Fish fish = new Fish("fish", 3);

        //создание еды
        Banana banana = new Banana();
        Berry berry = new Berry();
        Grass grass = new Grass();
        FishFillet fishFillet = new FishFillet();
        BeefSteak beefSteak = new BeefSteak();

        //Создание работника
        Worker worker = new Worker();

        //Работник кормит животных
        worker.feed(Bagira, fishFillet);
        worker.feed(blackDuck, banana);
        worker.feed(blackDuck, grass);
        worker.feed(blackDuck, grass);

        worker.feed(blackDuck, banana);

        worker.feed(Shirhan, grass);
        worker.feed(Dambo, beefSteak);

        //Работник вызывает голос
        worker.getVoice(Dambo);
        //worker.getVoice(fish);  данная команда не даст скомпилироваться программе
        worker.getVoice(Shirhan);
        worker.getVoice(Bagira);



        //создание озера и запуск туда животных
        Fish nemo = new Fish("nemo", 2);
        Fish goldFish = new Fish("goldFish", 4);
        Duck duck = new Duck("a_duck", 4);
        Swimming[] lake = {nemo, goldFish, duck};
        for (Swimming animal: lake) {
            animal.Swim();
        }


        //создание таблицы с травоядными животными
        Aviary<Herbivore> herbivoreAviary = new Aviary<>(Aviary.SizeAviary.little);
        herbivoreAviary.addAnimal(new Duck("b_duck", 11));
        herbivoreAviary.addAnimal(new Duck("c_duck", 9));
        herbivoreAviary.addAnimal(new Elephant("elepgh", 111));

        //создание таблицы с плотоядными животными
        Aviary<Predator> predatorAviary = new Aviary<>(Aviary.SizeAviary.medium);
        predatorAviary.addAnimal(new Puma("a_puma",22));
        predatorAviary.addAnimal(new Tiger("a_tiger", 33));
        predatorAviary.addAnimal(new Tiger("b_tiger", 24));

        //вывод информации о животных в вальерах
        herbivoreAviary.printAnimals();
        predatorAviary.printAnimals();

    }
}
