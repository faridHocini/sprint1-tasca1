package sprint1_ex1_n3;

public class NoticiaF1 extends Noticia {
    private String escuderia;

    public NoticiaF1(String titular, String escuderia) {
        super(titular);
        this.escuderia = escuderia;
        calcularPreuNoticia();
        calcularPuntuacioNoticia();
    }

    @Override
    public void calcularPreuNoticia() {
        preu = 100;
        if ("Ferrari".equalsIgnoreCase(escuderia) || "Mercedes".equalsIgnoreCase(escuderia)) {
            preu += 50;
        }
    }

    @Override
    public void calcularPuntuacioNoticia() {
        puntuacio = 4;
        if ("Ferrari".equalsIgnoreCase(escuderia) || "Mercedes".equalsIgnoreCase(escuderia)) {
            puntuacio += 2;
        }
    }
}
