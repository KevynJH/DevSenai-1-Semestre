package atividadeEmGrupo2703;

import java.util.Scanner;

public class imc {
    Scanner sc = new Scanner(System.in);

    public void Atividade1() {
        System.out.println("Informe sua Idade: ");
        double idade = sc.nextDouble();
        System.out.println("Informe seu Peso: ");
        double peso = sc.nextDouble();
        System.out.println("Informe sua Altura: ");
        double altura = sc.nextDouble();
        System.out.println("Informe seu Sexo com números F=2 M=1: ");
        double sexoF = sc.nextDouble();
        double sexoM = sc.nextInt();
        double pesoM = sc.nextInt();
        double pesoF = sc.nextDouble();
        pesoM = ((72.7 * altura) - 58);
        pesoF = ((62.1 * altura) - 44.7);
        if (sexoF == 2) {
        }
        if (sexoM == 1) {
        }
        if (pesoF >= 44.7) {
            System.out.println("Seu peso ideial é: ");
        } else if (pesoF < 44.7) {
            System.out.println("Seu peso ideial é: ");
        }
    }
}