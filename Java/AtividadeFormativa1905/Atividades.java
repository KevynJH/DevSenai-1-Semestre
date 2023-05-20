package AtividadeFormativa1905;

import java.util.Random;
import java.util.Scanner;

public class Atividades {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void Atv1() {
        System.out.println("Digite o tamanho da linha: ");
        int linha = sc.nextInt();
        System.out.println("DIgite o tamanho da coluna: ");
        int coluna = sc.nextInt();

        int matriz[][] = new int[linha][coluna];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (i < j) {
                    matriz[i][j] = 1;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (i == j) {
                    matriz[i][j] = 0;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
                if (j > i) {
                    matriz[i][j] = 2;
                }
            }
            System.out.println();
        }
    }

    public void Atv2() {
        System.out.println("Digite um numero de 0 à 1000");
        int nSorteado = rd.nextInt(1000);
        int nDigitado = sc.nextInt();
        while(nDigitado!=nSorteado){
            System.out.println("Tente Novamente");
        }if(nDigitado==nSorteado){
            System.out.println("Parabénss você acertou!");
        }
    }

    public void Atv3() {
        int tamanhoVetor = rd.nextInt(1000);
        int vetor[] = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100) + 1;
        }
    }
}