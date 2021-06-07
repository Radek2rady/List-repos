package AbstractsInterfaces.instruments.com.greenfoxacademy.music;

public class Violin extends StringedInstrument {
    public String getName() {
        return name;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    private String name;
    private int numberOfStrings;

    public Violin() {
    }

    public Violin(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        name = "Violin";
    }

    public Violin(String name, int numberOfStrings) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.print(this.getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes " );
        sound();
    }

    @Override
    protected void sound() {
        System.out.println("Screech");
    }
}
