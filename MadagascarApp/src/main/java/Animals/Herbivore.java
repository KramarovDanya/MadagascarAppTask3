package Animals;


import Food.Food;
import Food.Plant;
import Food.Meat;
import MyException.WrongFoodException;

public abstract class Herbivore extends Animal {
    private int maxWeight;

    public Herbivore(String name, int weight) throws IllegalAccessException {
        super(name, weight);
    }

    @Override
    public void Eat(Food food) throws  WrongFoodException {
        try {
            if (food instanceof Plant) {

                checkAnimalWeight(food);

            } else {
                throw new WrongFoodException(name + " не может кушать мясо");
            }
        } catch (WrongFoodException e) {
            System.out.println("Неправильная еда " + e.getMessage());
        }
    }

    private void checkAnimalWeight(Food food){
        if (weight < maxWeight) {
            System.out.println(name + " поел растений");
            weight += food.GetCalorieValue();
            System.out.println(name + " теперь весит " + weight + " kg");
        } else {
            System.out.println(name + " слишком сыт");
        }
    }
}
