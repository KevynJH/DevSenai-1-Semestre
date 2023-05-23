package AtividadeFormativa1905;

import java.util.Random;
import java.util.Scanner;

public class CORRECAO {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void Atv1C() {//NÃO FOI CORRIGIDO TOTALMENTE
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
        // imprimir
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
                if (i < j) {
                    matriz[i][j] = 1;
                }
            }
        }
        // preencher com as regras determinadas na condição
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }
        // imprimir
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
                if (i < j) {
                    matriz[i][j] = 1;
                }
            }
        }
    }

    public void Atv2C() {// CORRIGIDO
        int nSorteado = rd.nextInt(1000);
        int nDigitado; // receber nº digitado pelo user
        System.out.println("Digite um numero");
        nDigitado = sc.nextInt();
        int contador = 1;
        while (nSorteado != nDigitado) {
            // falr se é ><
            if (nDigitado > nSorteado) {
                System.out.println("O número é > que o nº sorteado");
            } else if (nDigitado < nSorteado) {
                System.out.println("O número é < que o nº sorteado");
            } else {
                // vazio
            }
            // digitar outro nº
            System.out.println("Tente novamente");
            nDigitado = sc.nextInt();
            contador++;
        }
        System.out.println("Parabéns você acertou");
        // falar que conseguiu e o nº de vezes
        System.out.println("Em " + contador + " tentativas");
    }

    // criar um vetor e procurar os Impares e Pares
    public void Atv3C() {// CORRIGIDO
        // criar um vetor de tamanho de 100-1000
        int tamanhoVetor = rd.nextInt(900) + 100;
        int vetor[] = new int[tamanhoVetor];
        // preencher o vetor random 1-100
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100) + 1;
        }
        int contImparNoPar = 0;
        int contParNoImpar = 0;
        // imprimir os nº Pares do vetor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {// resto da divisão
                System.out.println(vetor[i]);
                if (i % 2 == 0) {
                    contParNoImpar++;
                }
            }
        }
        // imprimir os nº Impares do vetor
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {// resto da divisão
                System.out.println(vetor[i]);
                if (i % 2 == 0) {
                    contImparNoPar++;
                }
            }
        }




        // outra forma de reolver(n faz parte)
        for (int i = 0; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 0) {
                contParNoImpar++;
            }
        }
        for (int i = 1; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 1) {
                contParNoImpar++;
            }
        }
    }
}