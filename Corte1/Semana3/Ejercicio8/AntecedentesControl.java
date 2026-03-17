package Semana3.Ejercicio8;

public class AntecedentesControl extends ControlMigratorioHandler {
    @Override
    public void procesar(IngresoRequest request) {
        if (!request.isAntecedentesLimpios()) {
            System.out.println("Control de Antecedentes: Antecedentes penales encontrados. Ingreso denegado.");
            return;
        }
        System.out.println("Control de Antecedentes: Aprobado.");
        pasarSiguiente(request);
    }
}