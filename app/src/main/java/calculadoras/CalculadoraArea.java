package calculadoras;

import java.util.Scanner;

public abstract class CalculadoraArea {

    public static void processaEscolha(int escolha) {
        Scanner sc = new Scanner(System.in);
        double medida1, medida2;


        if (escolha == 7) {
            System.out.print("\nDigite o lado do quadrado: ");
            medida1 = sc.nextDouble();

            System.out.printf("%s%.3f%n%n", "Area: ", areaQuadrado(medida1));
        } else if (escolha == 8) {
            System.out.print("\nDigite a largura do retangulo: ");
            medida1 = sc.nextDouble();

            System.out.print("Digite o comprimento do retangulo: ");
            medida2 = sc.nextDouble();

            System.out.printf("%s%.3f%n%n", "Area: ", areaRetangulo(medida1, medida2));
        } else {
            System.out.print("\nDigite o raio do circulo: ");
            medida1 = sc.nextDouble();

            System.out.printf("%s%.3f%n%n", "Area: ", areaCirculo(medida1));
        }
    }

    public static double areaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public static double areaQuadrado(double lado) {
        return lado * lado;
    }

    public static double areaRetangulo(double comprimento, double largura) {
        return comprimento * largura;
    }
}
