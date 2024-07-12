package sprint1_ex1n1;

//Subclasse Vent
class Vent extends Instrument {
	//Constructor
 public Vent(String nom, double preu) {
     super(nom, preu);
 }

 @Override
 public void tocar() {
     System.out.println("Està sonant un instrument de vent");
     System.out.println("*******************************************");
 }
}
