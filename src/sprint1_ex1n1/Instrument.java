package sprint1_ex1n1;

//Classe abstracta Instrument
abstract class Instrument {
 protected String nom;
 protected double preu;
 public static int instrumentsCount = 0; // Atribut estàtic

 public Instrument(String nom, double preu) {
     this.nom = nom;
     this.preu = preu;
     instrumentsCount++;
 }

 // Mètode abstracte tocar
 public abstract void tocar();
}
