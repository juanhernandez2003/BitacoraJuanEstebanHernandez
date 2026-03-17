package Semana3.Ejercicio8;

public class MotivoViajeControl extends ControlMigratorioHandler {
    @Override
    public void procesar(IngresoRequest request) {
        if (!request.isMotivoValido()) {
            System.out.println("Control de Motivo de Viaje: Motivo inválido. Ingreso denegado.");
            return;
        }
        System.out.println("Control de Motivo de Viaje: Aprobado.");
        pasarSiguiente(request);
    }
}