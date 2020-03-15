package Teste;

import app.Circulo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CirculoTeste {

    Circulo circulo = new Circulo();

    @Test
    //calculo da area deu sucesso
    public void calculateAreaSuccess() throws Exception {

        circulo.setRaio(Double.parseDouble("6"));
        Double areaCalculate = circulo.calcularArea();

        assertNotNull(areaCalculate);
        assertEquals("Area calculada com sucesso", new Double (113.09733552923255), areaCalculate);
    }

    //calculo da area não deu certo
    @Test(expected = Exception.class)
    public void calculateAreaNoSuccess() throws Exception {

        circulo.setRaio(null);
        Double areaCalculate = circulo.calcularArea();

        assertNotNull(areaCalculate);
        assertEquals("Năo foi possivel calcular a area", areaCalculate);
    }

    @Test(expected = NumberFormatException.class)
    public void calculateAreaIsEmptyNoSuccess() throws Exception {

        circulo.setRaio(Double.parseDouble(""));

        Double areaCalculate = circulo.calcularArea();

        assertNotNull(areaCalculate);
    }


    @Test
    public void calculatePerimetroSuccess() throws Exception {

        circulo.setRaio(Double.parseDouble("6"));
        Double perimetroCalculate = circulo.calcularPerimetro();

        assertNotNull(perimetroCalculate);
        assertEquals("Perimetro calculado com sucesso", new Double (37.69911184307752), perimetroCalculate);
    }

    @Test(expected = Exception.class)
    public void calculatePerimetroNoSuccess() throws Exception {

        circulo.setRaio(null);
        Double perimetroCalculate = circulo.calcularPerimetro();

        assertNotNull(perimetroCalculate);
        assertEquals("Năo foi possivel calcular o perimetro", perimetroCalculate);
    }

    @Test(expected = NumberFormatException.class)
    public void calculatePerimetroIsEmptyNoSuccess() throws Exception {

        circulo.setRaio(Double.parseDouble(""));

        Double perimetroCalculate = circulo.calcularPerimetro();

        assertNotNull(perimetroCalculate);
    }












}
