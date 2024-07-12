package sprint1_ex2n1;

public class Cotxe {
    // Atributs
    public static final String MARCA = "Ford"; // Marca és estàtic final
    public static String model; // Model és estàtic
    public final int potencia; // Potència és final

    // Constructor
    public Cotxe(String model, int potencia) {
        Cotxe.model = model; // Com que és estàtic, el model és compartit per tots els objectes de la classe
        this.potencia = potencia; // Com que és final, la potència s'ha d'assignar al constructor i no es pot canviar després
    }

    // Mètode no estàtic
    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

    // Mètode estàtic
    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }
    }
