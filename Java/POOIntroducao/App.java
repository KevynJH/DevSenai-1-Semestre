package POOIntroducao;

public class App {
    public static void main(String[] args) {
        // criar os objetos
        RegistraAluno aluno1 = new RegistraAluno();// obj

        // modificar os atributos(set)
        aluno1.setNome("Ana Clara Pereira");
        aluno1.setEndereco("A praça é nossa");
        aluno1.setIdade("17");
        aluno1.setNotaCiencias(9.5);
        aluno1.setNotaPortugues(7.5);
        aluno1.setNotaMatematica(8.5);

        System.out.println("Nome:" + aluno1.getNome());
        System.out.println("Endereço:" + aluno1.getEndereco());
        System.out.println("Idade:" + aluno1.getIdade());
        System.out.println("Média:" + aluno1.setsetNotaCiencias + aluno1.setNotaPortugues + aluno1.setNotaMatematica / 3);
    }
}