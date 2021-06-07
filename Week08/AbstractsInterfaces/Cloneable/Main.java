package AbstractsInterfaces.Cloneable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            Student John = new Student("John", 20, "male", "BME");
            Student jonhTheClone = (Student) John.clone();

        jonhTheClone.introduce();
        } catch (CloneNotSupportedException c) {
        }

        System.out.println();
    }
}
