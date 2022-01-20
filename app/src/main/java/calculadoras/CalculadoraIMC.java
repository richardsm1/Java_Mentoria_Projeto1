package calculadoras;

import java.util.Scanner;

public abstract class CalculadoraIMC {
    public static void main() {
        double altura, peso, imc;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o peso: ");
        peso = sc.nextDouble();

        System.out.print("Digite a altura: ");
        altura = sc.nextDouble();

        try {
            imc = calculaIMC(peso, altura);
            System.out.printf("%s%.2f%n%n", "IMC: ", imc);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculaIMC(double peso, double altura) {
        if (altura == 0) throw new ArithmeticException("Nao pode dividir por zero!");
        return peso / (altura * altura);
    }
}
