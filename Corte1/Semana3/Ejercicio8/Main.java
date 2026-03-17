package Semana3.Ejercicio8;

public class Main {
    public static void main(String[] args) {
        ControlMigratorio pasaporte = new PasaporteControl();
        ControlMigratorio antecedentes = new AntecedentesControl();
        ControlMigratorio motivo = new MotivoViajeControl();
        ControlMigratorio aprobacion = new AprobacionFinalControl();

        pasaporte.setSiguiente(antecedentes);
        antecedentes.setSiguiente(motivo);
        motivo.setSiguiente(aprobacion);

        System.out.println("=== Persona con motivo inválido ===");
        IngresoRequest persona = new IngresoRequest(
                true,
                true,
                false
        );
        pasaporte.procesar(persona);

        System.out.println("\n=== Persona con todo válido ===");
        IngresoRequest persona2 = new IngresoRequest(
                true,
                true,
                true
        );
        pasaporte.procesar(persona2);
    }
}