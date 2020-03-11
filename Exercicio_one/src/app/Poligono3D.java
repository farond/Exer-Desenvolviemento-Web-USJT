package app;

public abstract class Poligono3D {
    private double base;
    private double altura;
    private double profundidade;

    public Poligono3D(double base, double altura, double profundidade) {
        this.base = base;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    public Poligono3D() {
        this.base = 0;
        this.altura = 0;
        this.profundidade = 0;
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

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public abstract double calcularVolume();
}