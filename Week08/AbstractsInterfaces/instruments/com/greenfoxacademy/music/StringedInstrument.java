package AbstractsInterfaces.instruments.com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument {
    protected int numberOfStrings;

    protected void sound() {

    }

    @Override
    public abstract void play();
}
