package ExercicioOperadores.ExercicioOperadoress;

import java.util.Scanner;

public class NotaAlunos {
    Scanner sc = new Scanner(System.in);
    public void notasFrequencia() {
        System.out.println("Informe a nota 1 do aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do aluno");
        int nota2 = sc.nextInt();
        // double mediaAluno = (nota1 + nota2)/2;
        double mediaAluno = nota1;
        mediaAluno + nota2;
        mediaAluno /= 2;
        System.out.println("A média do Aluno é "+mediaAluno);
        boolean mediaAprovado = mediaAluno >= 50;
        System.out.println("O Aluno Esta Aprovado? "+mediaAprovado);
        System.out.println("Informe a Frequência do Aluno:");
        int frequenciaAluno = sc.nextInt();
        boolean frequenciaAprovado = frequenciaAluno >= 75;
        System.out.println("O Aluno Esta Aprovado por Frequencia?" +frequenciaAprovado);
        boolean aprovacaoFinal = (mediaAprovado==true)&&(frequenciaAprovado==true);
        System.out.println("O Aluno Esta Aprovado no Curso? "+aprovacaoFinal );
        
    } 
}
