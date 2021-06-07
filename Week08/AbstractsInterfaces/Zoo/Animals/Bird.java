package AbstractsInterfaces.Zoo.Animals;

public class Bird extends Animal {
    private String name;
    private int age;
    private String gender;
    private String color;

    public Bird() {

    }

    public Bird(String name) {
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
        System.out.println("");
    }
}
