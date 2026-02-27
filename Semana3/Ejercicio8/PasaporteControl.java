package Semana3.Ejercicio8;

public class PasaporteControl extends ControlMigratorioHandler {
    @Override
    public void procesar(IngresoRequest request) {
        if (!request.isPasaporteValido()) {
            System.out.println("Control de Pasaporte: Pasaporte inválido. Ingreso denegado.");
            return;
        }
        System.out.println("Control de Pasaporte: Aprobado.");
        pasarSiguiente(request);
    }
}