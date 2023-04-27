package ExercicioIfElse;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Exercicios {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Informe o Valor 1:");
        int valor1 = sc.nextInt();
        System.out.println("Informe o Valor 2:");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println("O maior Valor é " + valor1);
        } else if (valor1 < valor2) {
            System.out.println("O Maior Valor é " + valor2);
        } else {
            System.out.println("Os Valores são Iguais");
        }
    }

    public void exercicio2() {
        System.out.println("Bem Vindo.");
        System.out.println("Informe o Ano que Nasceu:");
        int ano = sc.nextInt();
        if (ano <= 2007) {
            System.out.println("Você Pode Votar Esse Ano! ");
        } else if (ano > 2007) {
            System.out.println("Você não Pode Votar Esse Ano! ");
        }
    }

    public void exercicio3() {
        System.out.println("Digite sua Senha:");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else
            System.out.println("ACESSO NEGADO");
    }

    public void exercicio4() {
        System.out.println("Quantas Maças Você Comprou?");
        int maças = sc.nextInt();
        double preço1 = 0.30;
        double preço2 = 0.25;
        double quantidade;
        double resultado;
        if (maças <= 12) {
            
        }
    }

    public void exercicio5() {
    }

    public void exercicio6() {
    }

    public void exercicio7() {
    }
}
