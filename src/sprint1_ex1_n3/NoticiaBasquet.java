package sprint1_ex1_n3;

public class NoticiaBasquet extends Noticia {
    private String competicio;
    private String club;

    public NoticiaBasquet(String titular, String competicio, String club) {
        super(titular);
        this.competicio = competicio;
        this.club = club;
        calcularPreuNoticia();
        calcularPuntuacioNoticia();
    }

    @Override
    public void calcularPreuNoticia() {
        preu = 250;
        if ("Eurolliga".equalsIgnoreCase(competicio)) {
            preu += 75;
        }
        if ("Barça".equalsIgnoreCase(club) || "Madrid".equalsIgnoreCase(club)) {
            preu += 75;
        }
    }

    @Override
    public void calcularPuntuacioNoticia() {
        puntuacio = 4;
        if ("Eurolliga".equalsIgnoreCase(competicio)) {
            puntuacio += 3;
        } else if ("ACB".equalsIgnoreCase(competicio)) {
            puntuacio += 2;
        }
        if ("Barça".equalsIgnoreCase(club) || "Madrid".equalsIgnoreCase(club)) {
            puntuacio += 1;
        }
    }
}
