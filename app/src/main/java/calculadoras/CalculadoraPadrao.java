package calculadoras;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public abstract class CalculadoraPadrao {

    public static void processaEscolha(int escolha) {

        double numero1, numero2;
        Scanner sc = new Scanner(System.in);
        NumberFormat formatador = new DecimalFormat("##.#####");

        System.out.print("\nDigite o primeiro numero: ");
        numero1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        numero2 = sc.nextDouble();

        if (escolha == 1) {
            System.out.printf("%s%s%n%n", "Soma: ", formatador.format(soma(numero1, numero2)));
        }

        else if (escolha == 2) {
            System.out.printf("%s%s%n%n", "Diferenca: ", formatador.format(subtrai(numero1, numero2)));
        }

        else if (escolha == 3) {
            System.out.printf("%s%s%n%n", "Produto: ", formatador.format(multiplica(numero1, numero2)));
        }

        else if (escolha == 4) {
            try {
                System.out.printf("%s%s%n%n", "Divisao: ", formatador.format(divide(numero1, numero2)));
            } catch (ArithmeticException e) {
                System.out.printf("%s%n%n", e.getMessage());
            }
        }

        else {
            System.out.printf("%s%s%n%n", "Potencia: ", formatador.format(elevaAPotencia(numero1, numero2)));
        }

    }

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtrai(double a, double b) {
        return a - b;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Nao pode dividir por zero");
        return a / b;
    }

    public static double elevaAPotencia(double a, double b) {
        return Math.pow(a, b);
    }
}
