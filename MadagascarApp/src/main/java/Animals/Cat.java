package Animals;

public class Cat  extends Predator  implements Speaking, Running{

    private String sound = "meow";

    public Cat(){
        this.name = "Cat";
        this.MaxWeight = 12;
        this.weight = 1;
    }
    public Cat(String name, int weight, int MaxWeight){
        this.name = name;
        this.MaxWeight = MaxWeight;
        this.weight = weight;
    }

    @Override
    public void Speak() {
        System.out.println(sound);

    }

    @Override
    public void Run() {
        System.out.println("Кошка бежит");
    }
}
