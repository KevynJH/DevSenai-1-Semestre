package POOHeranca;

import POOHeranca.Pessoas.Alunos;
import POOHeranca.Pessoas.Funcionarios;
import POOHeranca.Pessoas.Pessoas;
import POOHeranca.Pessoas.Professores;

public class App {
    public static void main(String[] args) {
        //objetos
        Alunos aluno01 = new Alunos();
        Pessoas pessoa01 = new Pessoas();
        Funcionarios funcionario01 = new Funcionarios();
        Professores professor01 = new Professores();
        
        //set(exemplos)
        aluno01.setNome("ALberto Silva");
        aluno01.setIdade(15);
        aluno01.setCurso("Dev");
        aluno01.setTurma("B-02");

        pessoa01.setNome("Carlos Alberto");
        pessoa01.setIdade(25);
        pessoa01.setEndereco("A Villa do Chaves");
        pessoa01.setnCpf("109.194.201-97");

        funcionario01.setNome("Sherlayne");
        funcionario01.setIdade(45);
        funcionario01.setAreaFuncao("Limpeza");]
        funcionario01.setTempoExperiencia(18);

        professor01.setNome("Carlinhos");
        professor01.setIdade(58);
        professor01.setMateriaEspecializada("Matemática");
        professor01.setTempoExperiencia(25);
    }
}