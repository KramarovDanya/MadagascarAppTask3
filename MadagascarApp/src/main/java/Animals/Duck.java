package Animals;

import Animals.interfases.Flying;
import Animals.interfases.Running;
import Animals.interfases.Speaking;
import Animals.interfases.Swimming;

public class Duck extends Herbivore implements Speaking, Flying, Running, Swimming {
    private String sound = "gaaa";
    private int maxWeight = 12;
    public Duck(String name, int weight) throws IllegalAccessException {
        super(name, weight);
        checkWeight(weight,maxWeight);
    }
    @Override
    public void Speak() {
        System.out.printf("Утка %s cказала %s \n", name,sound);
    }

    @Override
    public void Fly() {
        System.out.printf("Утка %s летит \n", name);
    }
    @Override
    public void Run() {
        System.out.printf("Утка %s бежит \n", name);
    }

    @Override
    public void Swim() {
        System.out.printf("Утка %s плавает \n", name);
    }
}
