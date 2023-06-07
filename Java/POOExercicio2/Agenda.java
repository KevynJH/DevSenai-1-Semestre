package POOExercicio2;

import javax.swing.JOptionPane;

public class Agenda {
    // atributos
    String nome;
    int idade;
    double altura;

    // métodos
    // construtor com parâmetros(valores atribuidos na construção)
    // construtor default(vazio = quando eu n declaro nada)

    public Agenda(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // sets and gets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // métodos definidos pelo programador
    // imprimir
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "Idade: " + idade + "Altura: " + altura);
    }

}
