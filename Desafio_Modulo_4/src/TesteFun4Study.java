public class TesteFun4Study {
    public static void main(String[] args) {
        int opcaoCidade = 1;
        int opcaoEstudante = 1;
        int numeroCidade = 1;
        int numeroEstudante = 1;

        do{
            Cidade cidade = criaCidade(numeroCidade);
            numeroCidade++;

            System.out.println("\nDados da cidade criada:\n");
            cidade.exibeDados();

            do{
                Estudante estudante = criaEstudante(numeroEstudante, cidade);
                System.out.println("\nDados do estudante criado:\n");
                estudante.exibeDados();

                atualizaDadoEstudante(estudante);
                atualizaSenha(estudante);

                numeroEstudante++;

                if(cidade.getQuantidadeEstudantes() >= 4 ){
                    int opcaoEstudanteUsuario = Teclado.leInt("\nVocê deseja criar outro estudante para esta? Digite 1 para sim ou 0 para não ");
                    opcaoEstudante = opcaoEstudanteUsuario;
                }
            } while (opcaoEstudante != 0);
            int opcaoCidadeUsuario = Teclado.leInt("\nVocê deseja criar outra cidade? Digite 1 para sim ou 0 para não ");
            opcaoCidade = opcaoCidadeUsuario;
        }while(opcaoCidade != 0);

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
        System.out.println("\nAgora, vamos criar o estudante número " + numeroEstudante + " para a cidade " + cidade.getDescricao() + ": ");
        int codigoEstudante1 = Teclado.leInt("Insira o código do estudante número " + numeroEstudante + ": ");
        String nomeEstudante1 = Teclado.leString("Insira o nome do estudante número " + numeroEstudante + ": ");
        String dataNascimentoEstudante1 = Teclado.leString("Insira a data de nascimento do estudante número " + numeroEstudante + ": ");
        String emailEstudante1 = Teclado.leString("Insira o email do estudante número " + numeroEstudante + ": ");
        String senhaEstudante1 = Teclado.leString("Insira a senha do estudante número " + numeroEstudante + ": ");

        Estudante estudante = new Estudante(codigoEstudante1, nomeEstudante1, dataNascimentoEstudante1, emailEstudante1, senhaEstudante1, cidade);
        return estudante;
    }

    public static void atualizaSenha(Estudante estudante){
        System.out.println("\nAgora, vamos atualizar a senha para o estudante " + estudante.getNome() + ": ");
        String senhaAntigaDigitada = Teclado.leString("Insita a senha antiga: ");
        String senhaNova = Teclado.leString("Insira a nova senha: ");
        String senhaNovaRepetida = Teclado.leString("Insira a nova senha novamente: ");

        while(!senhaAntigaDigitada.equals(estudante.getSenha()) || !senhaNova.equals(senhaNovaRepetida)){
            System.out.println("Senha não atualizada: a senha antiga está incorreta ou as senhas novas não correspondem");
            senhaAntigaDigitada = Teclado.leString("Insita a senha antiga: ");
            senhaNova = Teclado.leString("Insira a nova senha: ");
            senhaNovaRepetida = Teclado.leString("Insira a nova senha novamente: ");
        }

        estudante.setSenha(senhaNova);
        System.out.println("Senha atualizada com sucesso!");
    }

    public static void atualizaDadoEstudante(Estudante estudante){
        System.out.println("\n Você deseja atualizar algum dado do estudante?");
        System.out.println("1 - Não desejo alterar nada");
        System.out.println("2 - Alterar código");
        System.out.println("3 - Alterar nome");
        System.out.println("4 - Alterar data de nascimento");
        System.out.println("5 - Alterar email");
        int opcao = Teclado.leInt("Digite a opção desejada: ");
        switch (opcao){
            case 1:
                break;
            case 2:
                int novoCodigo = Teclado.leInt("Digite o novo código: ");
                estudante.setCodigo(novoCodigo);
                break;
            case 3:
                String novoNome = Teclado.leString("Digite o novo nome: ");
                estudante.setNome(novoNome);
                break;
            case 4:
                String novaDataNascimento = Teclado.leString("Digite a nova data de nascimento: ");
                estudante.setNome(novaDataNascimento);
                break;
            case 5:
                String novoEmail = Teclado.leString("Digite o novo email: ");
                estudante.setNome(novoEmail);
                break;
        }
        System.out.println("\nDados atualizados:");
        estudante.exibeDados();
        System.out.println("");
    }
}
