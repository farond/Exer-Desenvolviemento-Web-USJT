package app;

import java.util.ArrayList;
import java.util.List;

public class Geometria{

    public static void main(String[] args){

        ArrayList<Figura> lista = new ArrayList<Figura>();
        Circulo c = new Circulo(6);
        lista.add(c);
        Losango l = new Losango(2, 3);
        lista.add(l);
        Quadrado q = new Quadrado(5, 5);
        lista.add(q);
        Retangulo r = new Retangulo(3, 4);
        lista.add(r);
        Triangulo t = new Triangulo(3, 3);
        lista.add(t);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getClass().toString());
            System.out.println("Área: " + lista.get(i).calcularArea());
            System.out.println("Perímetro: " + lista.get(i).calcularPerimetro() + "\n");
            //System.out.println("Diametro: " + lista.get(i).calcularDiagonal() + "\n");
        }

        /*ArrayList<Figura> lista2 = new ArrayList<Figura>();
        Retangulo r2 = new Retangulo(4, 5);
        lista.add(r2);
        Triangulo t2 = new Triangulo(3, 3);
        lista.add(t2);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getClass().toString());
            System.out.println("Área: " + lista.get(i).calcularArea());
            System.out.println("Perímetro: " + lista.get(i).calcularPerimetro() + "\n");
            System.out.println("Diametro: " + lista.get(i).calcularDiagonal() + "\n");
        }*/

        ArrayList<Poligono3D> lista3 = new ArrayList<Poligono3D>();
        Cilindro cilindro = new Cilindro(4, 8, 4, 8);
        lista3.add(cilindro);
        Cubo cubo = new Cubo(5, 5, 5);
        lista3.add(cubo);
        Esfera esfera = new Esfera(4, 6, 6, 4);
        lista3.add(esfera);
        Piramide piramide = new Piramide(9, 9, 9);
        lista3.add(piramide);

        for (int i = 0; i < lista3.size(); i++) {
            System.out.println(lista3.get(i).getClass().toString());
            System.out.println("Volume: " + lista3.get(i).calcularVolume() + "\n");
        }



    }




}
