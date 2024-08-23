package Animals;

public class Tiger extends Predator implements Speaking, Running{
    int MaxWeight = 33;

    public Tiger(){
        this.name = "Tiger";
        this.weight = 30;
        this.MaxWeight = 35;
    }
    public Tiger(String name, int weight, int MaxWeight){
        this.name = name;
        this.MaxWeight = MaxWeight;
        this.weight = weight;
    }
    private String sound = "aRRR";
    @Override
    public void Speak() {
        System.out.println(sound);
    }

    @Override
    public void Run() {
        System.out.println("Тигр бежит");
    }
}
