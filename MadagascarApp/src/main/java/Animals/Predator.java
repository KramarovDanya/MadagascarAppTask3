package Animals;

import Food.Food;
import Food.Meat;
import MyException.WrongFoodException;

public abstract class Predator extends Animal {
    protected int maxWeight;
    public Predator(String name, int weight) throws IllegalAccessException {
        super(name, weight);
    }

    @Override
    public  void Eat(Food food) {
        try {
            if(food instanceof Meat){
                checkAnimalWeight(food);
            }
            else {
                throw  new WrongFoodException(name + " не может кушать траву");
            }
        }
        catch (WrongFoodException e){
            System.out.println("Неправильная еда " + e.getMessage());
        }
    }
    private void checkAnimalWeight(Food food){
        if (weight < maxWeight) {
            System.out.println(name + " поел мяса");
            weight += food.GetCalorieValue();
            System.out.println(name + " теперь веcит " + weight + " kg");
        }
        else {
            System.out.println(name + " слишком сыт");
        }
    }


}
