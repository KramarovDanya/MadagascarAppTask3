package Animals;

import Food.Plant;

public class Puma extends Predator implements Speaking, Running {
    String sound = "rrr";
    public Puma(){
        this.name = "Puma";
        this.weight = 20;
        this.MaxWeight = 22;
    }
    public Puma(String name, int weight, int MaxWeight){
        this.name = name;
        this.MaxWeight = MaxWeight;
        this.weight = weight;
    }

    @Override
    public void Speak() {
        System.out.println(sound);
    }

    @Override
    public void Run() { System.out.println("Пума бежит");}
}
