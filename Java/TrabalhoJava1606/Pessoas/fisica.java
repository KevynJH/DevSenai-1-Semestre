package Pessoas;

import javax.swing.JOptionPane;

import POOHeranca.Pessoas.Pessoas;

public class fisica extends Pessoas {
    public void pessoaF1() {
        int cpf;
        String endereco;
        int nIdentificacao;
        String nome;

        public pessoaF1(int cpf, String endereco, int nIdentificacao, String nome){
            this.cpf = cpf;
            this.endereco = endereco;
            this.nIdentificacao = nIdentificacao;
            this.nome = nome;
        }

        public int cpf() {
            return cpf;
        }
        public void setcpf(int cpf) {
            this.cpf = cpf;
        }

        public String endereco() {
            return endereco;
        }
        public void setendereco(String endereco) {
            this.endereco = endereco;
        }

        public int nIdentificacao() {
            return nIdentificacao;
        }
        public void setnIdentificacao(int nIdentificacao) {
            this.nIdentificacao = nIdentificacao;
        }

        public String nome() {
            return nome;
        }
        public void setnome(String nome) {
            this.nome = nome;
        }

        public void Imprimir1() {
            JOptionPane.showMessageDialog("CPF: "+cpf+"Endereço: "+endereco+"Numero de Identificação:"+nIdentificacao+"Nome: "+nome);
        }
    }
}