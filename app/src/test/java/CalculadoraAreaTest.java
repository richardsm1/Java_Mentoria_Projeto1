import calculadoras.CalculadoraArea;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraAreaTest {

    @Test
    public void calculaAreaCirculo() {

        double raio = 2.5;

        double area = CalculadoraArea.areaCirculo(raio);

        assertEquals(19.634, area, 0.001);
    }

    @Test
    public void calculaAreaQuadrado() {

        double lado = 3.6;

        double area = CalculadoraArea.areaQuadrado(lado);

        assertEquals(12.960, area, 0.001);
    }

    @Test
    public void calculaRetangulo() {

        double lado1 = 3.6, lado2 = 7.2;

        double area = CalculadoraArea.areaRetangulo(lado1, lado2);

        assertEquals(25.920, area, 0.001);
    }
}
