import calculadoras.CalculadoraPadrao;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculadoraPadraoTest {

    @Test
    public void somaValores() {

        double n1 = 2.5, n2 = 1.9;

        double soma = CalculadoraPadrao.soma(n1, n2);

        assertEquals(4.400, soma, 0.001);
    }

    @Test
    public void subtraiValores() {

        double n1 = 5.1, n2 = 0.7;

        double diferenca = CalculadoraPadrao.subtrai(n1, n2);

        assertEquals(4.400, diferenca, 0.001);
    }

    @Test
    public void multiplicaValores() {

        double n1 = 2.5, n2 = 1.9;

        double produto = CalculadoraPadrao.multiplica(n1, n2);

        assertEquals(4.750, produto, 0.001);
    }

    @Test
    public void divideValores() {

        double n1 = 3.6, n2 = 2;

        double divisao = CalculadoraPadrao.divide(n1, n2);

        assertEquals(1.800, divisao, 0.001);
    }

    @Test
    public void elevaValorAPotencia() {

        double n1 = 3.0, n2 = 4;

        double potencia = CalculadoraPadrao.elevaAPotencia(n1, n2);

        assertEquals(81.000, potencia, 0.001);
    }
}
