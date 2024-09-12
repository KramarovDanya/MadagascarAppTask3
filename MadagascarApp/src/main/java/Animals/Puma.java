package Animals;

import Animals.interfases.Running;
import Animals.interfases.Speaking;

public class Puma extends Predator implements Speaking, Running {
    String sound = "rrr";

    private int maxWeight = 22;

    public Puma(String name, int weight) throws IllegalAccessException {
        super(name,weight);

        checkWeight(weight, maxWeight);

    }

    @Override
    public void Speak() {
        System.out.println(sound);
    }

    @Override
    public void Run() { System.out.printf("Пума %s бежит \n",name);}
}
