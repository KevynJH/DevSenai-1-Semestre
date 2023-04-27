package InteraçãoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("o nº da iteração é" + i);
        }
    }

    public void exemplo2() {
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]=");
            vetor[i] = sc.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println("vetor[" + i + "]=" + vetor[1]);
        }
    }

    public void exemplo3() {
        double carrinhoCompra[] = new double[] { 19.90, 35.70, 56.80, };
        double valorFinal = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
            System.out.println("valor parcial compra: R$" + valorFinal);
        }
        System.out.println("o valor da compra é R$ " + valorFinal);
    }

    public void exemplo4() {
        double vetorNotas[] = new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a sua Nota" + (i + 1) + ":");
            vetorNotas[i] = sc.nextDouble();
        }
        double mediaNotas = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas += vetorNotas[i];
            System.out.println("A" + (i + 1) + "a nota é" + vetorNotas[i]);
        }
        mediaNotas /= vetorNotas.length;
        System.out.printf("A média do aluno é %.2f", mediaNotas);
    }

    public void exemplo5() {
        double vetorMedia[] = new double[10];
        for (int i = 0; i < vetorMedia.length; i++) {
            double notas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.println("Nota " + (j + 1) + "Aluno " + (i + 1));
                notas += sc.nextDouble();
            }
            notas /= 4;
            vetorMedia[i] = notas;
        }
        for (int i = 0; i < vetorMedia.length; i++) {
            if (vetorMedia[i] >= 7) {
                System.out.println("A média dp aluno " + (i + 1) + "é" + vetorMedia[i]);
            }
        }
    }

    public void exemplo6() {
        
    }
}
