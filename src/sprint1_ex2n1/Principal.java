package sprint1_ex2n1;

public class Principal {

	 public static void main(String[] args) {
		 
	        // Creació d'un objecte de la classe Cotxe
	        Cotxe cotxe1 = new Cotxe("ALTEA", 450);
	
	        // Invocació del mètode no estàtic
	        cotxe1.accelerar();

	        // Invocació del mètode estàtic
	        Cotxe.frenar();

	        // Mostrem els atributs
	        System.out.println("Marca: " + Cotxe.MARCA); // Accés a l'atribut estàtic final
	        System.out.println("Model: " + Cotxe.model); // Accés a l'atribut estàtic
	        System.out.println("Potència: " + cotxe1.POTENCIA + " cavallos"); // Accés a l'atribut final
	    }
	}


