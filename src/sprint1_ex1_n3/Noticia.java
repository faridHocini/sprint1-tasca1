package sprint1_ex1_n3;

public abstract class Noticia {
    protected String titular;
    protected String text;
    protected int puntuacio;
    protected double preu;

    public Noticia(String titular) {
        this.titular = titular;
        this.text = "";
    }

    public String getTitular() {
        return titular;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public double getPreu() {
        return preu;
    }

    public abstract void calcularPreuNoticia();
    public abstract void calcularPuntuacioNoticia();

    @Override
    public String toString() {
        return "Titular: " + titular + ", Text: " + text + ", Puntuació: " + puntuacio + ", Preu: " + preu;
    }
}
