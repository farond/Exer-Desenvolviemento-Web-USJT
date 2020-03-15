package Teste;

import app.Retangulo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RetanguloTeste {

    Retangulo retangulo = new Retangulo();

    @Test
    public void calculateAreaSuccess() throws Exception {

        retangulo.setBase(Double.parseDouble("3"));
        retangulo.setAltura(Double.parseDouble("4"));
        Double areaCalculate = retangulo.calcularArea();

        assertNotNull(areaCalculate);
        assertEquals("Area calculada com sucesso", new Double(areaCalculate), areaCalculate);
    }

    @Test(expected = Exception.class)
    public void calculateAreaNoSuccess() throws Exception {

        retangulo.setBase(null);
        retangulo.setAltura(null);
        Double areaCalculate = retangulo.calcularArea();

        assertNotNull(areaCalculate);
        assertEquals("Não foi possivel calcular a area", areaCalculate);
    }

    @Test(expected = NumberFormatException.class)
    public void calculateAreaIsEmptyNoSuccess() throws Exception {

        retangulo.setBase(Double.parseDouble(""));
        retangulo.setAltura(Double.parseDouble(""));
        Double areaCalculada = retangulo.calcularArea();

        assertNotNull(areaCalculada);
    }

    @Test
    public void calculateDiagonalSuccess() throws Exception {

        retangulo.setBase(Double.parseDouble("3"));
        retangulo.setAltura(Double.parseDouble("4"));

        Double diagonalQuadrado = retangulo.calcularDiagonal();

        assertNotNull(diagonalQuadrado);
        assertEquals(new Double(5.0), diagonalQuadrado);
    }

    @Test(expected = Exception.class)
    public void calculateDiagonalNoSuccess() throws Exception {

        retangulo.setBase(Double.parseDouble(""));
        retangulo.setAltura(Double.parseDouble(""));

        Double diagonalRetangulo = retangulo.calcularDiagonal();

        assertNotNull(diagonalRetangulo);
        assertEquals("Não foi possivel calcular a diagonal", diagonalRetangulo);
    }


    @Test
    public void calculatePerimetroSuccess() throws Exception {

        retangulo.setBase(Double.parseDouble("3"));
        retangulo.setAltura(Double.parseDouble("4"));
        Double perimetroCalculate = retangulo.calcularPerimetro();

        assertNotNull(perimetroCalculate);
        assertEquals("Perimetro calculado com sucesso", new Double (14.0), perimetroCalculate);
    }

    @Test(expected = Exception.class)
    public void calculatePerimetroNoSuccess() throws Exception {

        retangulo.setBase(null);
        retangulo.setAltura(null);
        Double perimetroCalculate = retangulo.calcularPerimetro();

        assertNotNull(perimetroCalculate);
        assertEquals("Năo foi possivel calcular o perimetro", perimetroCalculate);
    }

    @Test(expected = NumberFormatException.class)
    public void calculatePerimetroIsEmptyNoSuccess() throws Exception {

        retangulo.setBase(Double.parseDouble(""));
        retangulo.setAltura(Double.parseDouble(""));

        Double perimetroCalculate = retangulo.calcularPerimetro();

        assertNotNull(perimetroCalculate);
    }


}
