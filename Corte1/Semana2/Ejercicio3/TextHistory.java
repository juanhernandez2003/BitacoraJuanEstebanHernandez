package Semana2.Ejercicio3;
import java.util.ArrayList;
import java.util.List;

public class TextHistory {
    private List<TextMemento> history = new ArrayList<>();

    public void save(TextMemento memento) {
        history.add(memento);
    }

    public TextMemento undo() {
        if (history.isEmpty()) {
            System.out.println("No hay estados anteriores.");
            return null;
        }
        TextMemento last = history.get(history.size() - 1);
        history.remove(history.size() - 1);
        return last;
    }
}