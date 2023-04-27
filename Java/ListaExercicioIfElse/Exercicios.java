package ListaExercicioIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Digite um número: ");
        int valor = sc.nextInt();
        if (valor > 10) {
            System.out.println("É MAIOR DO QUE 10!!!");
        } else if (valor <= 10) {
            System.out.println("É MENOR DO QUE 10!!!");
        }
    }

    public void exercicio2() {
        System.out.println("Quantas horas de trabalho você acumulou no ultimo mês? ");
        double hTrabalhada = sc.nextDouble();
        System.out.println("Qual o valor da hora? ");
        double salario = sc.nextDouble();
        double salarioTotal;
        if (hTrabalhada >= 40) {
            double horaExtra = (hTrabalhada - 40) * salario * 0.5;
            salarioTotal = hTrabalhada * salario + horaExtra;
        } else {
            salarioTotal = hTrabalhada * salario;
        }
        System.out.println("Seu salário é " + salarioTotal);
    }

    public void exercicio3() {
        System.out.println("Qual foi a sua renda no mês?");
    }
}
