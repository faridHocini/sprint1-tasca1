package sprint1_ex1_n3;



import java.util.ArrayList;

public class Redactor {
    private String nom;
    private final String dni;
    private static double sou = 1500.0;
    private ArrayList<Noticia> noticies;

    public Redactor(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
        this.noticies = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public static double getSou() {
        return sou;
    }

    public static void setSou(double nouSou) {
        sou = nouSou;
    }

    public void afegirNoticia(Noticia noticia) {
        noticies.add(noticia);
    }

    public void eliminarNoticia(String titular) {
        noticies.removeIf(noticia -> noticia.getTitular().equalsIgnoreCase(titular));
    }

    public ArrayList<Noticia> getNoticies() {
        return noticies;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", DNI: " + dni + ", Sou: " + sou + ", Notícies: " + noticies.size();
    }
}
