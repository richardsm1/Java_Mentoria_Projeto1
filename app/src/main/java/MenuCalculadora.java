import calculadoras.CalculadoraArea;
import calculadoras.CalculadoraIMC;
import calculadoras.CalculadoraPadrao;

import java.util.Scanner;

public class MenuCalculadora {

    public static void main(String[] args) {
        int escolha;

        escolha = escolheCalculadora();

        if (1 <= escolha && escolha <= 5)
            CalculadoraPadrao.processaEscolha(escolha);
        else if(escolha == 6)
            CalculadoraIMC.main();
        else if (escolha < 10)
            CalculadoraArea.processaEscolha(escolha);
    }

    public static int escolheCalculadora(){
        int escolha;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite o numero da opcao desejada: ");
            System.out.println("\nCalculadora Padrao");
            System.out.println("\t1 - Soma");
            System.out.println("\t2 - Subtracao");
            System.out.println("\t3 - Multiplicacao");
            System.out.println("\t4 - Divisao");
            System.out.println("\t5 - Potenciacao");
            System.out.println("\n6 - Calculadora de IMC");
            System.out.println("\nCalculadora de Areas");
            System.out.println("\t7 - Quadrado");
            System.out.println("\t8 - Retangulo");
            System.out.println("\t9 - Circulo");
            System.out.println("10 - Sair");
            System.out.print("\nEscolha: ");
            escolha = sc.nextInt();
        } while (escolha < 1 || escolha > 10);

        return escolha;
    }
}