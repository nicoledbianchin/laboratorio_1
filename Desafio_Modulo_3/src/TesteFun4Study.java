public class TesteFun4Study {
    public static void main(String[] args) {
        Cidade cidade1 = TesteFun4Study.criaCidade(1);
        System.out.println("");
        Estudante estudante1 = TesteFun4Study.criaEstudante(1, cidade1);
        System.out.println("");
        TesteFun4Study.atualizaSenha(estudante1);
        System.out.println("");
        Estudante estudante2 = TesteFun4Study.criaEstudante(2, cidade1);
        System.out.println("");
        TesteFun4Study.atualizaSenha(estudante2);
        System.out.println("");

        Cidade cidade2 = TesteFun4Study.criaCidade(2);
        System.out.println("");
        Estudante estudante3 = TesteFun4Study.criaEstudante(3, cidade2);
        System.out.println("");
        TesteFun4Study.atualizaSenha(estudante3);
        System.out.println("");
        Estudante estudante4 = TesteFun4Study.criaEstudante(4, cidade2);
        System.out.println("");
        TesteFun4Study.atualizaSenha(estudante4);
        System.out.println("");

        System.out.println("**** Cidades e estudantes criados: ****");
        System.out.println("==== Dados da cidade 1: ====");
        cidade1.exibeDados();
        System.out.println("\n====Estudantes da cidade 1:====");
        System.out.println("\nEstudante 1: ");
        estudante1.exibeDados();
        System.out.println("\nEstudante 2: ");
        estudante2.exibeDados();

        System.out.println("\n\n==== Dados da cidade 2: ====");
        cidade2.exibeDados();
        System.out.println("\n====Estudantes da cidade 2:====");
        System.out.println("\nEstudante 3: ");
        estudante3.exibeDados();
        System.out.println("\nEstudante 4: ");
        estudante4.exibeDados();
    }

    public static Cidade criaCidade(int numeroCidade) {
        System.out.println("Vamos criar a cidade " + numeroCidade + " : ");
        int codigo = Teclado.leInt("Insira o código da cidade " + numeroCidade + ": ");
        String descricao = Teclado.leString("Insica a descrição da cidade " + numeroCidade + ": ");
        String uf = Teclado.leString("Insira o UF da cidade " + numeroCidade + ": ");

        Cidade cidade = new Cidade(codigo, descricao, uf);
        return cidade;
    }

    public static Estudante criaEstudante(int numeroEstudante, Cidade cidade){
        System.out.println("Agora, vamos criar o estudante número " + numeroEstudante + " para a cidade " + cidade.getDescricao() + ": ");
        int codigoEstudante1 = Teclado.leInt("Insira o código do estudante número " + numeroEstudante + ": ");
        String nomeEstudante1 = Teclado.leString("Insira o nome do estudante número " + numeroEstudante + ": ");
        String dataNascimentoEstudante1 = Teclado.leString("Insira a data de nascimento do estudante número " + numeroEstudante + ": ");
        String emailEstudante1 = Teclado.leString("Insira o email do estudante número " + numeroEstudante + ": ");
        String senhaEstudante1 = Teclado.leString("Insira a senha do estudante número " + numeroEstudante + ": ");

        Estudante estudante = new Estudante(codigoEstudante1, nomeEstudante1, dataNascimentoEstudante1, emailEstudante1, senhaEstudante1, cidade);
        return estudante;
    }

    public static void atualizaSenha(Estudante estudante){
        System.out.println("Agora, vamos atualizar a senha para o estudante " + estudante.getNome() + ": ");
        String senhaAntigaDigitada = Teclado.leString("Insita a senha antiga: ");
        String senhaNova = Teclado.leString("Insira a nova senha: ");
        String senhaNovaRepetida = Teclado.leString("Insira a nova senha novamente: ");

        if(senhaAntigaDigitada.equals(estudante.getSenha()) && senhaNova.equals(senhaNovaRepetida)){
            estudante.setSenha(senhaNova);
            System.out.println("Senha atualizada com sucesso!");
        } else {
            System.out.println("Senha não atualizada: a senha antiga está incorreta ou as senhas novas não correspondem");
        }
    }
}
