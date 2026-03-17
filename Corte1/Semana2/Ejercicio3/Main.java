package Semana2.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextHistory history = new TextHistory();

        editor.setText("Hola mundo");
        history.save(editor.save());
        System.out.println("Estado actual: " + editor.getText());

        editor.setText("Hola mundo cruel");
        history.save(editor.save());
        System.out.println("Estado actual: " + editor.getText());

        editor.setText("Texto completamente diferente");
        System.out.println("Estado actual: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("Después de undo: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("Después de undo: " + editor.getText());

        history.undo();
    }
}