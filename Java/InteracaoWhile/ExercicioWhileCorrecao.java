package InteracaoWhile;

public class ExercicioWhileCorrecao {
    // resolvendo lista extra vetores
    public void exercicio1() {
        int vetorA[] = new int[] { 3, 5, 7, 11, 13 };
        int vetorB[] = new int[5];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i];
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void exercicio2() {
        int vetorA[] = new int[] { 3, 5, 7, 11, 13, 15, 17, 21 };
        int vetorB[] = new int[vetorA.length];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * 2;
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void exercicio3() {
        int vetorA[] = new int[] { 3, 5, 7, 11, 13, 15, 17, 21, 23, 25, 27, 30, 32, 34, 36 };
        int vetorB[] = new int[vetorA.length];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * vetorA[i];
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void exercicio4() {
        int vetorA[] = new int[] { 3, 5, 7, 11, 13, 15, 17, 21, 23, 25, 27, 30, 32, 34, 36 };
        double vetorB[] = new double[vetorA.length];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void exercicio5() {
        int vetorA[] = new int[] { 3, 5, 7, 11, 13, 15, 17, 21, 23, 25 };
        int vetorB[] = new int[vetorA.length];
        int i = 0;
        while (i < vetorA.length) {
            vetorB[i] = vetorA[i] * i;
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }

    public void exercicio6() {
        int vetorA[] = new int[] { 3, 5, 7, 11, 13, 15, 17, 21, 23, 25 };
        int vetorB[] = new int[] { 3, 5, 7, 11, 13, 15, 17, 21, 23, 25 };
        int vetorC[] = new int[vetorA.length];
        int i = 0;
        while (i < vetorA.length) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println("VetorB[" + i + "]=" + vetorB[i]);
            i++;
        }
    }
}
