package sprint1_ex1_n3;

public class NoticiaMotociclisme extends Noticia {
    private String equip;

    public NoticiaMotociclisme(String titular, String equip) {
        super(titular);
        this.equip = equip;
        calcularPreuNoticia();
        calcularPuntuacioNoticia();
    }

    @Override
    public void calcularPreuNoticia() {
        preu = 100;
        if ("Honda".equalsIgnoreCase(equip) || "Yamaha".equalsIgnoreCase(equip)) {
            preu += 50;
        }
    }

    @Override
    public void calcularPuntuacioNoticia() {
        puntuacio = 3;
        if ("Honda".equalsIgnoreCase(equip) || "Yamaha".equalsIgnoreCase(equip)) {
            puntuacio += 3;
        }
    }
}
