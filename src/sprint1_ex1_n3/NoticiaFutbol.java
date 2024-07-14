package sprint1_ex1_n3;

public class NoticiaFutbol extends Noticia {
    private String competicio;
    private String club;
    private String jugador;

    public NoticiaFutbol(String titular, String competicio, String club, String jugador) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;
        calcularPreuNoticia();
        calcularPuntuacioNoticia();
    }

    @Override
    public void calcularPreuNoticia() {
        preu = 300;
        if ("Lliga de Campions".equalsIgnoreCase(competicio)) {
            preu += 100;
        }
        if ("Barça".equalsIgnoreCase(club) || "Madrid".equalsIgnoreCase(club)) {
            preu += 100;
        }
        if ("Ferran Torres".equalsIgnoreCase(jugador) || "Benzema".equalsIgnoreCase(jugador)) {
            preu += 50;
        }
    }

    @Override
    public void calcularPuntuacioNoticia() {
        puntuacio = 5;
        if ("Lliga de Campions".equalsIgnoreCase(competicio)) {
            puntuacio += 3;
        } else if ("Lliga".equalsIgnoreCase(competicio)) {
            puntuacio += 2;
        }
        if ("Barça".equalsIgnoreCase(club) || "Madrid".equalsIgnoreCase(club)) {
            puntuacio += 1;
        }
        if ("Ferran Torres".equalsIgnoreCase(jugador) || "Benzema".equalsIgnoreCase(jugador)) {
            puntuacio += 1;
        }
    }
}
