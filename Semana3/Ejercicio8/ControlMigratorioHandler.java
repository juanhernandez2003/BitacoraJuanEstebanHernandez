package Semana3.Ejercicio8;

public abstract class ControlMigratorioHandler implements ControlMigratorio {
    private ControlMigratorio siguiente;

    @Override
    public void setSiguiente(ControlMigratorio siguiente) {
        this.siguiente = siguiente;
    }

    protected void pasarSiguiente(IngresoRequest request) {
        if (siguiente != null) {
            siguiente.procesar(request);
        }
    }
}