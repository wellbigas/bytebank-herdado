public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario wellington = new Funcionario("Wellington Luís Moreno Bigas", "083.938.179-43", 2600);

        System.out.println(wellington.getNome());
        System.out.println(wellington.getBonificacao());
    }
}
