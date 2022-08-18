public class Aluguel {
    private int codigo;
        private String dataInicio;
        private String dataFim;
        private Imovel imovel;
        private Cliente cliente;

    public Aluguel(int codigo, String dataInicio, String dataFim, Imovel imovel, Cliente cliente) {
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.imovel = imovel;
        this.cliente = cliente;
    }

    public void exibeDados(){
        System.out.println("Aluguel: "+ codigo);
        System.out.println("Data Inicio: "+ dataInicio);
        System.out.println("Data Fim: "+ dataFim);
        imovel.exibeDados();
        System.out.println("Nome Cliente: " + cliente.getNome());
    }
}
