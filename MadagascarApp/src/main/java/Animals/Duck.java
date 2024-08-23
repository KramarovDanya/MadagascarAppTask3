package Animals;

public class Duck extends Herbivore implements Speaking, Flying, Running, Floating{
    private String sound = "gaaa";
    public Duck(){
        this.name = "Duck";
        this.MaxWeight = 12;
        this.weight = 5;
    }
    @Override
    public void Speak() {
        System.out.println(sound);
    }

    @Override
    public void Fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void Run() {
        System.out.println("Утка бежит");
    }

    @Override
    public void Float() {
        System.out.println("Утка плавает");
    }
}
