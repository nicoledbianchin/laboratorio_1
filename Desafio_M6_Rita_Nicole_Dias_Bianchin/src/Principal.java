public class Principal {
    public static void main(String[] args) {
        MEC mec = new MEC();

        int quantidadeUniversidades = Teclado.leInt("Quantas universidades você deseja criar? ");
        Universidade[] universidades = new Universidade[quantidadeUniversidades];
        int countUniversidade = 1;

        for(int i = 0; i < universidades.length; i++){
            System.out.println("==== Criando a universidade " + countUniversidade + " ====");
            Universidade universidade;
            int tipoUniversidade = Teclado.leInt("Qual tipo de universidade você deseja criar? Digite 1 para PRIVADA ou 2 para PÚBLICA ");
            String nome = Teclado.leString("Qual o nome da universidade? ");
            int qteAlunos = Teclado.leInt("Qual a quantidade de alunos? ");
            int qteProfessores = Teclado.leInt("Qual a quantidade de professores? ");
            if(tipoUniversidade == 1){
                double mensalidade = Teclado.leDouble("Qual o valor da mensalidade? ");
                universidade = new Privada(nome, qteAlunos, qteProfessores, mensalidade);
            } else {
                String estado = Teclado.leString("Qual o estado da universidade? ");
                String cidade = Teclado.leString("Qual a cidade da universidade? ");
                universidade = new Publica(nome, qteAlunos, qteProfessores, estado, cidade);
            }
            universidades[i] = universidade;
            countUniversidade++;
            System.out.println("");
        }

        mec.imprimeUniversidades(universidades);
        mec.maisCara(universidades);
        mec.universidadesDoSul(universidades);

    }
}
