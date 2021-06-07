package AbstractsInterfaces.instruments.com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {
    private String name;

    public String getName() {
        return name;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    private int numberOfStrings;

    public ElectricGuitar() {
    }

    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        name = "Electric Guitar";
    }

    public ElectricGuitar(String name, int numberOfStrings) {
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
        System.out.println("Twang");
    }
}
