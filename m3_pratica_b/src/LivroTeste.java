
public class LivroTeste {

    public static void main (String[] args) {

        System.out.println("###############################################################");
        System.out.println("CRIANDO OBJETOS E APRESENTANDO OS VALORES DOS ATRIBUTOS NA TELA");
        System.out.println("###############################################################");

        Livro livro1 = new Livro("Guerra dos Mundos");
        Livro livro2 = new Livro("O Senhor dos Aneis");

        livro1.exibeDados();
        livro2.exibeDados();

        System.out.println("");
        System.out.println("#####################################################################");
        System.out.println("EMPRESTANDO OS LIVROS E APRESENTANDO OS VALORES DOS ATRIBUTOS NA TELA");
        System.out.println("#####################################################################");

        livro1.empresta();
        livro2.empresta();
        livro1.exibeDados();
        livro2.exibeDados();

        System.out.println("");
        System.out.println("#####################################################################");
        System.out.println("DEVOLVENDO OS LIVROS E APRESENTANDO OS VALORES DOS ATRIBUTOS NA TELA");
        System.out.println("#####################################################################");

        livro1.devolve();
        livro2.devolve();
        livro1.exibeDados();
        livro2.exibeDados();

    }

}