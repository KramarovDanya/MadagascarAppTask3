package Animals;

public class Fish extends Herbivore implements Floating{
    int MaxWeight = 5;
    public Fish(){
        this.name = "Fish";
        this.weight = 2;
    }
    public Fish(String name, int weight, int MaxWeight){
        this.name = name;
        this.MaxWeight = MaxWeight;
        this.weight = weight;
    }
    @Override
    public void Float() {
        System.out.println("Рыба плывет");
    }
}
