
public class MaterialEscolar {
    private int codigo;
    private String nome;
    private double preco;
    private int qtdeEstoque;

    public MaterialEscolar(int cod, String nom, double pre, int qte) {
        codigo = cod;
        nome = nom;
        preco = pre;
        qtdeEstoque = qte;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nom)
    {
        nome = nom;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double pre)
    {
        preco = pre;
    }

    public int getQtdeEstoque()
    {
        return qtdeEstoque;
    }

    public int compraMaterial(int qtdeMaterialComprado) {
        qtdeEstoque+=qtdeMaterialComprado;
        return getQtdeEstoque();
    }

    public int vendeMaterial(int qtdeMaterialVendido) {
        qtdeEstoque-=qtdeMaterialVendido;
        return getQtdeEstoque();
    }
}
