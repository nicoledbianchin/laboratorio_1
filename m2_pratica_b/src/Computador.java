public class Computador {
    private String modeloProcessador;
    private double capacidadeProcessador;
    private int quantidadeMemoriaRAM;
    private int tamanhoHD;

    public Computador(String modeloProcessador, double capacidadeProcessador, int quantidadeMemoriaRAM, int tamanhoHD) {
        this.modeloProcessador = modeloProcessador;
        this.capacidadeProcessador = capacidadeProcessador;
        this.quantidadeMemoriaRAM = quantidadeMemoriaRAM;
        this.tamanhoHD = tamanhoHD;
    }
}
