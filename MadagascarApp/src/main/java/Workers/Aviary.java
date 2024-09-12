package Workers;

import Animals.Animal;

import java.util.*;

public class Aviary <T extends Animal>{
    private Set<T> animals;

    private SizeAviary size;

     public enum SizeAviary{
        big,
        medium,
        little
    }

    public Aviary(SizeAviary size){
        this.animals = new HashSet<>();
        this.size = size;
    }
    public void addAnimal(T animal){


         if (this.size == SizeAviary.little && animal.GetWeight() <= 10){
             animals.add(animal);

         } else if (this.size == SizeAviary.medium && animal.GetWeight() <= 30) {
             animals.add(animal);

         } else if (this.size == SizeAviary.big && animal.GetWeight() <= 150 ) {
             animals.add(animal);
         }else {
             System.out.println(animal.GetName() + " слишком большой");
         }

    }

    public boolean removeAnimalByName(String name){
        return animals.removeIf(animal -> animal.GetName().equals(name));
    }

    public Optional<T> getAnimalByName(String name){
        return animals.stream().filter(animal -> animal.GetName().equals(name)).findFirst();
    }

    public Set<T> getAnimals(){
        return animals;
    }

    public void printAnimals(){
        for (T animal : animals){
            System.out.println("Animal" + animal.GetName());
        }
    }
}
