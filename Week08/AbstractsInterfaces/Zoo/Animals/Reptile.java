package AbstractsInterfaces.Zoo.Animals;

public class Reptile extends Animal {
    private String name;
    private int age;
    private String gender;
    private String color;

    public Reptile() {

    }

    public Reptile(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String getName() {
        super.getName();
        return name;
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public void sound() {
        System.out.println("sound");
    }
}
