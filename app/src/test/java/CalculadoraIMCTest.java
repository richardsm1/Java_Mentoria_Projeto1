import calculadoras.CalculadoraIMC;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraIMCTest {

    @Test
    public void calculaIMC() {

        double peso = 75, altura = 1.75;

        double imc = CalculadoraIMC.calculaIMC(peso, altura);

        assertEquals(24.489, imc, 0.001);
    }

}
