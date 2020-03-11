package app;

public class Losango extends Poligono {

    public Losango(double base, double altura) {
        super(base, altura);
    }

    public Losango() {
        super();
    }

    @Override
    public double calcularPerimetro() {
        return 4 * getBase();
    }



}