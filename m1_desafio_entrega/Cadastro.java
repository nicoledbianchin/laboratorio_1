public class Cadastro {
    public static void main(String[] args) {
        System.out.print("====SEJA BEM VINDO AO SISTEMA DE CADASTRO DA LOJA DE DEPARTAMENTO R&N ESTILO====\n");
        System.out.print("== Por favor, informe os dados abaixo para prosseguir com o cadastro:\n");

        String nome = Teclado.leString("==> Nome: ");
        String dataNascimento = Teclado.leString("==> Data de nascimento (formato DD/MM/AAAA): ");
        String cpf = Teclado.leString("===> CPF: ");
        String telefone = Teclado.leString("===> Número de telefone: ");
        String email = Teclado.leString("===> Email: ");
        double renda = Teclado.leDouble("===> Renda mensal: ");
        String cidade = Teclado.leString("===> Cidade: ");
        char tamanhoRoupa = Teclado.leChar("===> Tamanho de roupa (P/M/G): ");
        int tamanhoSapato = Teclado.leChar("===> Tamanho sapato: ");
        String marcaPreferida = Teclado.leString("===> Marca preferida: ");


        System.out.print("\n\n====CADASTRO REALIZADO COM SUCESSO====\n");
        System.out.print("== Resumo do seu cadastro:\n");

        System.out.printf("== Nome: [%s]\n", nome);
        System.out.printf("== Data de nascimento: [%s]\n", dataNascimento);
        System.out.printf("== CPF: [%s]\n", cpf);
        System.out.printf("== Telefone: [%s]\n", telefone);
        System.out.printf("== Email: [%s]\n", email);
        System.out.printf("== Renda: [%.2f]\n", renda);
        System.out.printf("== Cidade: [%s]\n", cidade);
        System.out.printf("== Tamanho de roupa: [%c]\n", tamanhoRoupa);
        System.out.printf("== Tamanho de sapato: [%c]\n", tamanhoSapato);
        System.out.printf("== Marca preferida: [%s]\n", marcaPreferida);

        System.out.print("\n\n==Obrigada!");
        System.out.print("\n==============================");
    }
}
