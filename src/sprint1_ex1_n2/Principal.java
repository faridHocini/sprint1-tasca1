package sprint1_ex1_n2;

public class Principal {

	// Mètode main per demostrar la invocació dels mètodes
    public static void main(String[] args) {
        // Creació d'un objecte de la classe Smartphone
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");

        // Invocació del mètode trucar
        smartphone.trucar("123456789");

        // Invocació del mètode fotografiar
        smartphone.fotografiar();

        // Invocació del mètode alarma
        smartphone.alarma();
        
        Telefon telefono = new Telefon("Nokia", "120" );
        
        telefono.trucar("632260165");
    }
}
