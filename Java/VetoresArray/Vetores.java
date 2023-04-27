package VetoresArray;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // criando um Vetor
        double[] valores = new double[] { 10.5, 20.7, 30.6, 40.4 };
        System.out.println("1º posição- Índice[0]:" + valores[0]);
        System.out.println("2º posição- Índice[1]:" + valores[1]);
        System.out.println("3º posição- Índice[2]:" + valores[2]);
        System.out.println("4º posição- Índice[3]:" + valores[3]);
        // Mudando Valores de uma posição definida
        valores[0] = 15.6; // Mudando o valor do Índice[0]
        System.out.println("1º Posição- Índice[0]:" + valores[0]);
    }

    public void exemplo2() {
        // criando um vetor
        int valoresInt[] = new int[5];
        System.out.println("Digite 5 Nº inteiros");
        valoresInt[0] = sc.nextInt();
        valoresInt[1] = sc.nextInt();
        valoresInt[2] = sc.nextInt();
        valoresInt[3] = sc.nextInt();
        valoresInt[4] = sc.nextInt();
        System.out.println("1º posição- Índice[0]:" + valoresInt[0]);
        System.out.println("2º posição- Índice[1]:" + valoresInt[1]);
        System.out.println("3º posição- Índice[2]:" + valoresInt[2]);
        System.out.println("4º posição- Índice[3]:" + valoresInt[3]);
        System.out.println("5º posição- Índice[3]:" + valoresInt[4]);
    }

    public void exemplo3() {
        double valoresInt[] = new double[10];
        System.out.println("Digite 10 Nº inteiros");
        valoresInt[0] = sc.nextInt();
        valoresInt[1] = sc.nextInt();
        valoresInt[2] = sc.nextInt();
        valoresInt[3] = sc.nextInt();
        valoresInt[4] = sc.nextInt();
        valoresInt[5] = sc.nextInt();
        valoresInt[6] = sc.nextInt();
        valoresInt[7] = sc.nextInt();
        valoresInt[8] = sc.nextInt();
        valoresInt[9] = sc.nextInt();
        System.out.println("1º posição- Índice[0]:" + valoresInt[0]);
        System.out.println("2º posição- Índice[1]:" + valoresInt[1]);
        System.out.println("3º posição- Índice[2]:" + valoresInt[2]);
        System.out.println("4º posição- Índice[3]:" + valoresInt[3]);
        System.out.println("5º posição- Índice[3]:" + valoresInt[4]);
        System.out.println("6º posição- Índice[0]:" + valoresInt[5]);
        System.out.println("7º posição- Índice[1]:" + valoresInt[6]);
        System.out.println("8º posição- Índice[2]:" + valoresInt[7]);
        System.out.println("9º posição- Índice[3]:" + valoresInt[8]);
        System.out.println("10º posição- Índice[3]:" + valoresInt[9]);
    }

    public void exemplo4() {
        double notas[] = new double[4];
        System.out.println("Insira as 4 notas do Aluno");
        notas[0] = sc.nextDouble();
        notas[1] = sc.nextDouble();
        notas[2] = sc.nextDouble();
        notas[3] = sc.nextDouble();
        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        System.out.println("A média é " + media);
    }
    
}