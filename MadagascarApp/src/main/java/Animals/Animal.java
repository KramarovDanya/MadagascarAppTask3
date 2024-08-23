package Animals;

import Food.Food;
import MyException.WrongFoodException;

import java.util.Objects;

public abstract class Animal {
    protected String name = "it animal";
    protected int MaxWeight = 50;
    protected int weight = 1;

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
