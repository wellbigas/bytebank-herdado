//Nessa aula come�amos a falar sobre a heran�a e aprendemos:
//
//quais problemas a heran�a pode resolver
//como usar heran�a no Java atrav�s de palavra chave extends
//ao herdar, a classe filha ganha todas as caracter�sticas (atributos) e todas as funcionalidades (m�todos) da classe m�e
//conhecemos o primeiro benef�cio da heran�a: Reutiliza��o do c�digo
//Na pr�xima aula veremos mais detalhes sobre heran�a como as palavras chaves super, protected e a sobrescrita de m�todos!

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public double getBonificacao(){
        return this.salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
