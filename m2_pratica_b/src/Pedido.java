public class Pedido {
    private int codigo;
    private String data;
    private Cliente cliente;
    private Computador computador;

    public Pedido(int codigo, String data, Cliente cliente, Computador computador) {
        this.codigo = codigo;
        this.data = data;
        this.cliente = cliente;
        this.computador = computador;
    }
}
