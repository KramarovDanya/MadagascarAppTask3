package Workers;

import Animals.Animal;
import Animals.interfases.Speaking;
import Food.Food;
import MyException.WrongFoodException;

public class Worker {
    public void feed(Animal animal, Food food) {
        try {
            animal.Eat(food);
        }
        catch (WrongFoodException e){
            System.out.println("Животное не стало есть еду " + e.getMessage());
        }

    }
    public <T extends Animal & Speaking> void getVoice(T animal){
        animal.Speak();
    }
}
