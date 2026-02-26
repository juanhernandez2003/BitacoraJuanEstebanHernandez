import java.util.*;
import java.util.function.Function;

// Interfaz base - Barco
interface Barco {
    String getDescripcion();
    int getPoderAtaque();
    int getDefensa();
}

// Componente concreto - BarcoBase
class BarcoBase implements Barco {
    @Override
    public String getDescripcion() {
        return "Barco básico";
    }

    @Override
    public int getPoderAtaque() {
        return 0;
    }

    @Override
    public int getDefensa() {
        return 0;
    }
}

// Decorador abstracto
abstract class BarcoBaseDecorador implements Barco {
    protected Barco barco;

    public BarcoBaseDecorador(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion();
    }

    @Override
    public int getPoderAtaque() {
        return barco.getPoderAtaque();
    }

    @Override
    public int getDefensa() {
        return barco.getDefensa();
    }
}

// Decoradores concretos
class BlindajeDecorador extends BarcoBaseDecorador {
    public BlindajeDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + ", Blindaje reforzado";
    }

    @Override
    public int getDefensa() {
        return barco.getDefensa() + 30;
    }
}

class RadarDecorador extends BarcoBaseDecorador {
    public RadarDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + ", Radar avanzado";
    }

    @Override
    public int getPoderAtaque() {
        return barco.getPoderAtaque() + 10;
    }
}

class MisilesDecorador extends BarcoBaseDecorador {
    public MisilesDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + ", Misiles";
    }

    @Override
    public int getPoderAtaque() {
        return barco.getPoderAtaque() + 40;
    }
}

class AntitorpedosDecorador extends BarcoBaseDecorador {
    public AntitorpedosDecorador(Barco barco) {
        super(barco);
    }

    @Override
    public String getDescripcion() {
        return barco.getDescripcion() + ", Sistema antitorpedos";
    }

    @Override
    public int getPoderAtaque() {
        return barco.getPoderAtaque() + 20;
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        Barco barcoBase = new BarcoBase();

        // Mapa de mejoras con sus constructores
        Map<String, Function<Barco, Barco>> mejoras = Map.of(
                "BLINDAJE", BlindajeDecorador::new,
                "RADAR", RadarDecorador::new,
                "MISILES", MisilesDecorador::new,
                "ANTITORPEDOS", AntitorpedosDecorador::new
        );

        // Configuración deseada
        List<String> configuracion = List.of(
                "BLINDAJE",
                "RADAR",
                "MISILES"
        );

        // Aplicar decoradores usando streams y reduce
        Barco barcoFinal = configuracion.stream()
                .map(mejoras::get)
                .reduce(barcoBase,
                        (barco, decorador) -> decorador.apply(barco),
                        (b1, b2) -> b1);

        // Mostrar resultados
        System.out.println(barcoFinal.getDescripcion());
        System.out.println("Ataque: " + barcoFinal.getPoderAtaque());
        System.out.println("Defensa: " + barcoFinal.getDefensa());

        System.out.println("\n--- Barco completamente equipado ---\n");

        // Otra configuración completa
        List<String> configuracion2 = List.of(
                "BLINDAJE",
                "RADAR",
                "MISILES",
                "ANTITORPEDOS"
        );

        Barco barcoBase2 = new BarcoBase();
        Barco barcoCompleto = configuracion2.stream()
                .map(mejoras::get)
                .reduce(barcoBase2,
                        (barco, decorador) -> decorador.apply(barco),
                        (b1, b2) -> b1);

        System.out.println(barcoCompleto.getDescripcion());
        System.out.println("Ataque: " + barcoCompleto.getPoderAtaque());
        System.out.println("Defensa: " + barcoCompleto.getDefensa());
    }
}