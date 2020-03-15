package Teste;

import app.Quadrado;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class QuadradoTeste {

    Quadrado quadrado = new Quadrado();

    @Test
    public void calculateAreaSuccess() throws Exception {

        quadrado.setBase(Double.parseDouble("5"));
        quadrado.setAltura(Double.parseDouble("5"));
        Double areaCalculate = quadrado.calcularArea();

        assertNotNull(areaCalculate);
        assertEquals("Area calculada com sucesso", new Double(25.0), areaCalculate);
    }

    @Test(expected = Exception.class)
    public void calculateAreaNoSuccess() throws Exception {

        quadrado.setBase(null);
        quadrado.setAltura(null);
        Double areaCalculate = quadrado.calcularArea();

        assertNotNull(areaCalculate);
        assertEquals("Não foi possivel calcular a area", areaCalculate);
    }

    @Test(expected = NumberFormatException.class)
    public void calculateAreaIsEmptyNoSuccess() throws Exception {

        quadrado.setBase(Double.parseDouble(""));
        quadrado.setAltura(Double.parseDouble(""));
        Double areaCalculate = quadrado.calcularArea();

        assertNotNull(areaCalculate);
    }


    //Calculo da Diagonal Obteve sucesso
    @Test
    public void calculateDiagonalSuccess() throws Exception {

        quadrado.setBase(Double.parseDouble("5"));

        Double diagonalQuadrado = quadrado.calcularDiagonal();

        assertNotNull(diagonalQuadrado);
        assertEquals(new Double(7.0710678118654755), diagonalQuadrado);
    }

    //Calcular a Diagonal não obteve exito
    @Test(expected = Exception.class)
    public void calculateDiagonalNoSuccess() throws Exception {

        quadrado.setBase(null);

        Double diagonalQuadrado = quadrado.calcularDiagonal();

        assertNotNull(diagonalQuadrado);
        assertEquals("Não foi possivel calcular a diagonal", diagonalQuadrado);
    }


}
