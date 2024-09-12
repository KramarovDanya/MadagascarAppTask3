package Animals;

import Animals.interfases.Running;
import Animals.interfases.Speaking;

public class Elephant extends Herbivore implements Speaking, Running {
    private String sound = "tytyty";
    private int maxWeight = 150;
    public Elephant(String name, int weight) throws IllegalAccessException {
        super(name, weight);

        checkWeight(weight, maxWeight);

    }
    @Override
    public void Speak() {
        System.out.printf("Слон %s сказал %s \n",name,sound);
    }

    @Override
    public void Run() {
        System.out.printf("Cлон %s бежит \n", name);
    }
}
