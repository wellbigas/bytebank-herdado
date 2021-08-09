//Nessa aula começamos a falar sobre a herança e aprendemos:
//
//quais problemas a herança pode resolver
//como usar herança no Java através de palavra chave extends
//ao herdar, a classe filha ganha todas as características (atributos) e todas as funcionalidades (métodos) da classe mãe
//conhecemos o primeiro benefício da herança: Reutilização do código
//Na próxima aula veremos mais detalhes sobre herança como as palavras chaves super, protected e a sobrescrita de métodos!

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
