package app;

public class Triangulo extends Poligono {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public Triangulo(){
        super();
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura() / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * getBase();
    }

}