package app;

public class Circulo extends Figura {

    private double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    public Circulo() {
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
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }





}
