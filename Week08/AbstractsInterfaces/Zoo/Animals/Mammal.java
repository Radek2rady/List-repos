package AbstractsInterfaces.Zoo.Animals;

public class Mammal extends Animal {
    private String name;
    private int age;
    private String gender;
    private String color;


    public Mammal() {

    }

    public Mammal(String name) {
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
        return "pushing miniature versions out.";
    }

    @Override
    public void sound() {
        System.out.println("");
    }
}
