package AbstractsInterfaces.Zoo.Animals;

abstract class Animal {
    private String name;
    private int age;
    private String gender;
    private String color;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract String breed();

    protected abstract void sound();
}
