package app;

public class Esfera extends Poligono3D{

    private double raio;

    public Esfera(double base, double altura, double profundidade, double raio) {
        super(base, altura, profundidade);
        this.raio = raio;
    }

    public Esfera() {
        super();
        this.raio = 0;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularVolume() {
        return (4 / 3) * Math.PI * Math.pow(raio, 3);
    }
}
