package Semana3.Ejercicio8;

public class AprobacionFinalControl extends ControlMigratorioHandler {
    @Override
    public void procesar(IngresoRequest request) {
        request.setAprobado(true);
        System.out.println("Aprobación Final: Bienvenido a Estados Unidos!");
    }
}