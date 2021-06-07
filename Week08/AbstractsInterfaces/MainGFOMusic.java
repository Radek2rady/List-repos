package AbstractsInterfaces;

import AbstractsInterfaces.instruments.com.greenfoxacademy.music.ElectricGuitar;
import AbstractsInterfaces.instruments.com.greenfoxacademy.music.BassGuitar;
import AbstractsInterfaces.instruments.com.greenfoxacademy.music.Violin;

public class MainGFOMusic {
    public static void main(String[] args) {
        System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
        ElectricGuitar guitar = new ElectricGuitar(6);
        BassGuitar bassGuitar = new BassGuitar(4);
        Violin violin = new Violin(4);

        System.out.println("Test 1 Play");
        guitar.play();
        bassGuitar.play();
        violin.play();

        System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
        ElectricGuitar guitar2 = new ElectricGuitar(7);
        BassGuitar bassGuitar2 = new BassGuitar(5);

        System.out.println("Test 2 Play");
        guitar2.play();
        bassGuitar2.play();
    }
}
