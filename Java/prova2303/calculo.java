package prova2303;

import java.util.Scanner;

public class calculo {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        System.out.println("Informe um valor: ");
        double valor1 = sc.nextInt();
        System.out.println("Informe outro valor: ");
        double valor2 = sc.nextInt();
        System.out.println("Escolha a operação: 1-adicao; 2-subtracao; 3-multiplicacao; 4-divisao;");
        int operacao = sc.nextInt();
        double adicao = valor1 + valor2;
        System.out.println("A soma dos valores é " + adicao);
        double subtracao = valor1 - valor2;
        System.out.println("A subtração dos valores é " + subtracao);
        double multiplicacao = valor1 * valor2;
        System.out.println("A multiplicação dos valores é " + multiplicacao);
        double divisao = valor1 / valor2;
        System.out.println("A divisão dos valores é " + divisao);
    }
}