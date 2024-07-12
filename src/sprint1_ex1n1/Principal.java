package sprint1_ex1n1;

public class Principal {

	public static void main(String[] args) {

		// Crear una instància de Vent per demostrar la càrrega per instància
        Vent flauta = new Vent("Flauta", 300);
        flauta.tocar();  // Ha de mostrar: "Està sonant un instrument de vent"

        // Accedir a un membre estàtic per demostrar la càrrega per accés a membre estàtic
        System.out.println("Nombre total d'instruments: " + Instrument.instrumentsCount);
        System.out.println("*************************************************************************");
     // Crear una instància de Corda per demostrar la càrrega per instància
        Corda guitarra = new Corda("guitarra", 500);
        guitarra.tocar();  // Ha de mostrar: "Està sonant un instrument de corda"

        // Accedir a un membre estàtic per demostrar la càrrega per accés a membre estàtic
        System.out.println("Nombre total d'instruments: " + Instrument.instrumentsCount);

        
        
     // Crear una instància de percussio per demostrar la càrrega per instància
        Percussio bateria = new Percussio("bateria", 1000);
        bateria.tocar();  // Ha de mostrar: "Està sonant un instrument de corda"

        // Accedir a un membre estàtic per demostrar la càrrega per accés a membre estàtic
        System.out.println("Nombre total d'instruments: " + Instrument.instrumentsCount);
	}

}
