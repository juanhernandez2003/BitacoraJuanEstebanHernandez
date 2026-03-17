package Semana3.Ejercicio10;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}