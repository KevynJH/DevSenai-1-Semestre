package LacoRepeticaoWhile;

import java.util.Random;
import java.util.Scanner;

public class While {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int iteracao = 0;
        while (iteracao < 10) {
            System.out.println("O nº da iteração é "
                    + iteracao);
            iteracao += 1;
        }
    }

    public void adivinhar() {
        Random rd = new Random();
        int nSorteado = rd.nextInt(bound:10);
        boolean tenteNovamente;
        while (tenteNovamente); {
            System.out.println("Digite um Nº");
            int nDigitado = sc.nextInt();
            if (nDigitado==nSorteado){
                System.out.println("Acertou doido");
                tenteNovamente = false;
            } else{
                System.out.println("Errouu");
                tenteNovamente=true;
            }
        }
    }
}