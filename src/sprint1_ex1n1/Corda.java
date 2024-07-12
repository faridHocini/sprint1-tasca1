package sprint1_ex1n1;

class Corda extends Instrument {
    public Corda(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de corda");
        System.out.println("*******************************************");
    }
}



