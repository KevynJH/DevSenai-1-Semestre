package POOExercicio2;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Random rd = new Random(0);
        Scanner sc = new Scanner(System.in);
        // vetor de objetos
        // "[]" serve para identificar o array
        Agenda pessoas[] = new Agenda[10];
        // preencher o meu vetor/array("[]")
        for (int i = 0; i < pessoas.length; i++) {
            // construtor de objetos
            pessoas[i] = new Agenda();
            // preencher os atributos
            pessoas[i].setNome("Pessoa" + i);
            pessoas[i].setAltura(i);
            pessoas[i].setIdade(rd.nextInt(i + 18));
        }
        // buscador
        // não parar enquanto não achar o nome da pessoa
        String nomeDigitado = JOptionPane.showInputDialog("Nome Buscado:");
        int cont = 0;
        boolean teste = true;
        while (teste) {
            if (nomeDigitado.equals(pessoas[cont].getNome())) {
                teste = false;
            } else {
                cont++;
            }
        }
        while (nomeDigitado != pessoas[cont].getNome()) {
            cont++;
        }
        System.out.println("Nome: " + pessoas[cont].getNome() + "Idade: " + pessoas[cont].getIdade() + "Altura: "
                + pessoas[cont].getAltura());
    }
}