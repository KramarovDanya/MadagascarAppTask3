package Animals;

import Food.Food;
import MyException.WrongFoodException;

import java.util.Objects;

public abstract class Animal {


    protected String name = "it animal";
    protected int weight;
    public Animal(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    protected void  checkWeight(int weight, int maxWeight) throws IllegalAccessException {
        if (weight > maxWeight) {
            throw new IllegalAccessException("Вес не может быть больше максимального веса =" + maxWeight);
        }
    }
    private void Move(){};

    public String GetName(){
        return name;
    };

    public void SetName(String name){
        this.name = name;
    };

    public int GetWeight(){return weight;};

    public abstract void Eat(Food food) throws  WrongFoodException;

    @Override
    public boolean equals(Object obj){
         if (this == obj) return true;
         if (obj == null || getClass() != obj.getClass()) return false;
         Animal animal = (Animal) obj;
         return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }




}
