public class Professor extends Usuario{
    private String areaAtuacao;

    public Professor(int matricula, String nome, String login, String senha) {
        super(matricula, nome, login, senha);
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public void exibeDados()
    {
        System.out.println("");
        System.out.println("++++++ Dados do Professor ++++++");

        super.exibeDados();

        if(areaAtuacao!=null && !areaAtuacao.isEmpty())
            System.out.println("Área de Atuação: " + areaAtuacao);
    }
}
