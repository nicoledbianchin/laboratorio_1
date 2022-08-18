public class Imovel {
    private int codigo;
    private String descricao;
    private double precoAluguel;
    private int qteMinimaMesesAluguel;

    public Imovel(int codigo, String descricao, double precoAluguel, int qteMinimaMesesAluguel) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoAluguel = precoAluguel;
        this.qteMinimaMesesAluguel = qteMinimaMesesAluguel;
    }

    public void exibeDados(){
        System.out.println("Dados do Imovel");
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço aluguel: " + precoAluguel);
        System.out.println("Quantidade minima de meses para aluguel: " + qteMinimaMesesAluguel);
    }
}
