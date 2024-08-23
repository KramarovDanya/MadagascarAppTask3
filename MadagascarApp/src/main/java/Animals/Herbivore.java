package Animals;


import Food.Food;
import Food.Plant;
import Food.Meat;
import MyException.WrongFoodException;

public abstract class Herbivore extends Animal {

    @Override
    public void Eat(Food food) throws  WrongFoodException {
        try {
            if (food instanceof Plant) {
                if (weight < MaxWeight) {
                    System.out.println("Я поел растений");
                    weight += food.GetCalorieValue();
                    System.out.println("И теперь вешу " + weight + " kg");
                } else {
                    System.out.println("Я слишком сыт");
                }
            } else {
                throw new WrongFoodException("Я не могу кушать мясо");
            }
        } catch (WrongFoodException e) {
            System.out.println("Неправильная еда " + e.getMessage());
        }
    }
}
