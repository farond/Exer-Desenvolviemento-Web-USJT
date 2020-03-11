package app;

public abstract class Poligono extends Figura {

    private double base;
    private double altura;

    public Poligono(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public Poligono() {
        super();
        this.base = 0;
        this.altura = 0;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }



}
