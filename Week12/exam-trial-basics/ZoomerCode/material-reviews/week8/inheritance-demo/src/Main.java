import animals.Animal;
import animals.Cat;
import animals.GuineaPig;
import animals.SchrodingersCat;


public class Main {

    public static void main(String[] args) {
//        Animal someRandomAnimal = new Animal();
//
//        System.out.println(someRandomAnimal.getHunger());
//        for (int i = 0; i < 20; i++) {
//            System.out.println("Trying to sleep");
//            someRandomAnimal.sleep();
//        }


//        System.out.println(someRandomAnimal.getHunger());
//
//        Cat mrFluffers = new Cat();
//
//        System.out.println(mrFluffers.getHunger());
//        mrFluffers.eat();
//        mrFluffers.sleep();
//        System.out.println(mrFluffers.getHunger());
//
//        mrFluffers.sleep();
//
//        Cat anna = new Cat(0);
//
//        SchrodingersCat mrUndead = new SchrodingersCat();
//        System.out.println(mrUndead.isDead());
//        System.out.println(mrUndead.isDead());
//        System.out.println(mrUndead.isDead());


        Cat mrFluffers = new Cat();
        SchrodingersCat mrUndead = new SchrodingersCat();
        GuineaPig tomik = new GuineaPig();

        Zoo ourZoo = new Zoo();

        ourZoo.addAnimal(mrFluffers);
        ourZoo.addAnimal(mrUndead);
        ourZoo.addAnimal(tomik);

        ourZoo.strokeAnimals();

        System.out.println(mrFluffers);

    }
}
