package Animals;

import Animals.interfases.Running;
import Animals.interfases.Speaking;

public class Cat  extends Predator  implements Speaking, Running {

    private String sound = "meow";

    private int maxWeight = 5;

    public Cat(String name, int weight) throws IllegalAccessException {
        super(name,weight );

        checkWeight(weight, maxWeight);

    }

    @Override
    public void Speak() {
        System.out.printf("Кошка %s cказала %s \n",name,sound);

    }

    @Override
    public void Run() {
        System.out.printf("Кошка %s бежит \n", name);
    }
}
