package Animals;

public class Elephant extends Herbivore implements Speaking, Running {
    private String sound = "tytyty";
    public Elephant(){
        this.name = "Elephant";
        this.MaxWeight = 150;
        this.weight = 100;
    }
    public Elephant(String name, int weight, int MaxWeight){
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
        System.out.println("слон бежит");
    }
}
