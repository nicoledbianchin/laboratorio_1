public class Cofre {
    private Pessoa dono;
    private int qte50;
    private int qte25;
    private int qte10;

    public Cofre(Pessoa pessoa){
        this.dono = pessoa;
        this.qte50 = 0;
        this.qte25 = 0;
        this.qte10 = 0;
    }

    public Cofre(String nome, int idade){
        this.dono = new Pessoa(nome, idade);
        this.qte50 = 0;
        this.qte25 = 0;
        this.qte10 = 0;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }


    public void depositaUmaMoedaDezCentavos() {
        this.qte50 = qte50 + 1;
    }

    public void depositaUmaMoedaVinceCincoCentavos() {
        this.qte25 = qte25 + 1;
    }

    public void depositaUmaMoedaCinquentaCentavos() {
        this.qte10 = qte10 + 1;
    }

    public double calculaTotal() {
        double total;
        total = (0.5 * this.qte50) + (0.25 + this.qte25) + (0.1 * this.qte10);
        return total;
    }

    private String retornaDados() {
        String dados = this.dono.getNome() + "tem um totel de" + this.calculaTotal() + "reais no cofrinho";
        return dados;
    }
}

