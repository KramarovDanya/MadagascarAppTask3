package Animals;

import Food.Food;
import Food.Meat;
import MyException.WrongFoodException;

public abstract class Predator extends Animal {
    @Override
    public  void Eat(Food food) {
        try {
            if(food instanceof Meat){
                if (weight < MaxWeight) {
                    System.out.println("Я поел мяса");
                    weight += food.GetCalorieValue();
                    System.out.println("И теперь вешу " + weight + " kg");
                }
                else {
                    System.out.println("Я слишком сыт");
                }
            }
            else {
                throw  new WrongFoodException("Я не могу кушать траву");
            }
        }
        catch (WrongFoodException e){
            System.out.println("Неправильная еда " + e.getMessage());
        }
    }
}
