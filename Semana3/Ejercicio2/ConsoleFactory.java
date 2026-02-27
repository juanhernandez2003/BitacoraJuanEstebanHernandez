package Semana3.Ejercicio2;

public interface ConsoleFactory {
    Controller createController();
    Game createGame();
    UI createUI();
}