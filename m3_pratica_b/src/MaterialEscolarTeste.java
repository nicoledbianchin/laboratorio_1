public class MaterialEscolarTeste {

    public static void main(String[] args){
        MaterialEscolar caneta = new MaterialEscolar(23,"caneta",7.50,20);
        MaterialEscolar lapis = new MaterialEscolar(67,"lapis",2.50,50);

        System.out.println("#########################################");
        System.out.println("APRESENTANDO DADOS DO MATERIAL ESCOLAR 23 - CANETA");
        System.out.println("#########################################");
        System.out.println("Codigo: " + caneta.getCodigo());
        System.out.println("Nome: " + caneta.getNome());
        System.out.println("Preco: " + caneta.getPreco());
        System.out.println("Qtde em Estoque: " + caneta.getQtdeEstoque());


        caneta.vendeMaterial(3);
        lapis.setPreco(2.70);
        caneta.compraMaterial(10);

        System.out.println("#########################################");
        System.out.println("#########################################");
        System.out.println("APRESENTANDO DADOS DO MATERIAL ESCOLAR 23 - CANETA");
        System.out.println("#########################################");
        System.out.println("Codigo: " + caneta.getCodigo());
        System.out.println("Nome: " + caneta.getNome());
        System.out.println("Preco: " + caneta.getPreco());
        System.out.println("Qtde em Estoque: " + caneta.getQtdeEstoque());


        System.out.println("#########################################");
        System.out.println("#########################################");
        System.out.println("APRESENTANDO DADOS DO MATERIAL ESCOLAR 67 - LAPIS");
        System.out.println("#########################################");
        System.out.println("Codigo: " + lapis.getCodigo());
        System.out.println("Nome: " + lapis.getNome());
        System.out.println("Preco: " + lapis.getPreco());
        System.out.println("Qtde em Estoque: " + lapis.getQtdeEstoque());
    }
}

