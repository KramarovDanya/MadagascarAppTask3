package Animals;

import Animals.interfases.Running;
import Animals.interfases.Speaking;

public class Tiger extends Predator implements Speaking, Running {
    int maxWeight  = 35;


    public Tiger(String name, int weight) throws IllegalAccessException {
        super(name, weight);
        checkWeight(weight, maxWeight);
    }
    private String sound = "aRRR";
    @Override
    public void Speak() {
        System.out.println(sound);
    }

    @Override
    public void Run() {
        System.out.printf("Тигр %s бежит\n", name);
    }
}
