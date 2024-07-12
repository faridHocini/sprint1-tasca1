package sprint1_ex1_n2;


	// Classe Smartphone que hereta de Telèfon i implementa Camera i Rellotge
	class Smartphone extends Telefon implements Camera, Rellotge {
	    // Constructor
	    public Smartphone(String marca, String model) {
	        super(marca, model);
	    }

	    // Implementació del mètode fotografiar de la interfície Camera
	    @Override
	    public void fotografiar() {
	        System.out.println("Se esta fent una foto");
	    }

	    // Implementació del mètode alarma de la interfície Rellotge
	    @Override
	    public void alarma() {
	        System.out.println("Esta sonant la alarma");
	    }
}
