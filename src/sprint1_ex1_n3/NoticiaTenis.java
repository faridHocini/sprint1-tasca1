package sprint1_ex1_n3;

public class NoticiaTenis extends Noticia {
    private String competicio;
    private String tenistes;

    public NoticiaTenis(String titular, String competicio, String tenistes) {
        super(titular);
        this.competicio = competicio;
        this.tenistes = tenistes;
        calcularPreuNoticia();
        calcularPuntuacioNoticia();
    }

    @Override
    public void calcularPreuNoticia() {
        preu = 150;
        if ("Federer".equalsIgnoreCase(tenistes) || "Nadal".equalsIgnoreCase(tenistes) || "Djokovic".equalsIgnoreCase(tenistes)) {
            preu += 100;
        }
    }

    @Override
    public void calcularPuntuacioNoticia() {
        puntuacio = 4;
        if ("Federer".equalsIgnoreCase(tenistes) || "Nadal".equalsIgnoreCase(tenistes) || "Djokovic".equalsIgnoreCase(tenistes)) {
            puntuacio += 3;
        }
    }
}
