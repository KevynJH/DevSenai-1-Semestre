package Atividaderevisao1;

import java.util.Scanner;

public class ExemploRevisao1 {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // 1. ler o nº
        System.out.println("Digite um nº ");
        double nDigitado = sc.nextDouble();
        // 2. se nº>10
        if (nDigitado > 10) {
            System.out.println("É maior que 10!");
        } else {
            System.out.println("Não é maior que 10!");
        }
    }

    public void exemplo2() {
        // Ler a quantidade de horas trabalhadas/mês
        System.out.println("Quantas horas de trabalho você acumulou no ultimo mês? ");
        double hTrabalhada = sc.nextDouble();
        System.out.println("Qual o valor da hora? ");
        double salario = sc.nextDouble();
        double salarioTotal;
        if (hTrabalhada >= 200) {
            double horaExtra = (hTrabalhada - 200) * salario * 0.5;
            salarioTotal = hTrabalhada * salario + horaExtra;
        } else {
            salarioTotal = hTrabalhada * salario;
        }
        System.out.println("Seu salário é " + salarioTotal);
    }
}