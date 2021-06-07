package AbstractsInterfaces.Domino;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(3, 2));


        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("Buy milk", "high", true));

        for (Domino domino : dominoes) {
            domino.printAllFields();
        }

        for (Todo todo : todos) {
            todo.printAllFields();
        }
    }
}
