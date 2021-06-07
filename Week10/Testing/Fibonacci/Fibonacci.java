package Testing.Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {

        int number = 38;

        System.out.println(Fibonacci(number));
    }

    public static int Fibonacci(int number) {
        if (number <= 1)
            return number;
        return Fibonacci(number - 1) + Fibonacci(number - 2);
    }
}
