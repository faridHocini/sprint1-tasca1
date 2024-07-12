package sprint1_ex1_n2;

class Telefon {
	
    // Atributs
    private String marca;
    private String model;

    // Constructor
    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    // Mètode trucar
    public void trucar(String numero) {
        System.out.println("Se esta trucant al nnmero: " + numero);
    }
}
