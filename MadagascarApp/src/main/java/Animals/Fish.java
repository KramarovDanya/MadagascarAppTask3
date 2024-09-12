package Animals;

import Animals.interfases.Swimming;

public class Fish extends Herbivore implements Swimming {
    private int maxWeight = 5;

    public Fish(String name, int weight) throws IllegalAccessException {
        super(name,weight);

        checkWeight(weight, maxWeight);
    }
    @Override
    public void Swim() {
        System.out.printf("Рыба %s плывет \n", name);
    }
}
