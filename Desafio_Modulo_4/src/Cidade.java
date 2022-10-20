public class Cidade {
    private int codigo;
    private String descricao;
    private String uf;
    private int quantidadeEstudantes;

    public Cidade(int codigo, String descricao, String uf) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUf() {
        return uf;
    }

    public int getQuantidadeEstudantes() { return quantidadeEstudantes; };

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void adicionaNovoEstudante() {
        this.quantidadeEstudantes++;
    }

    public void exibeDados() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("UF: " + this.uf);
        System.out.println("Quantidade de estudantes: " + this.quantidadeEstudantes);
    }
}
