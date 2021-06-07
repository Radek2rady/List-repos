package AbstractsInterfaces.instruments.com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument {
    private String name;

    public String getName() {
        return name;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    private int numberOfStrings;

    public BassGuitar() {
    }

    public BassGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        name = "Bass Guitar";
    }

    public BassGuitar(String name, int numberOfStrings) {
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
        System.out.println("Duum-duum-duum");
    }
}