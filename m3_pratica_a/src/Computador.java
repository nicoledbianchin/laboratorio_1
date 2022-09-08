public class Computador
{
    private String modeloProcessador;
    private double capacidadeProcessador;
    private int quantidadeMemoriaRAM;
    private int tamanhoHD;

    public Computador(String mod, double cap, int qua, int tam){
        capacidadeProcessador = cap;
        quantidadeMemoriaRAM = qua;
        tamanhoHD = tam;
    }

    public void setModeloProcessador(String mod){
        modeloProcessador = mod;
    }

    public String getModeloProcessador(){
        return modeloProcessador;
    }

    public void setCapacidadeProcessador(double cap){
        capacidadeProcessador = cap;
    }

    public double getCapacidadeProcessador(){
        return capacidadeProcessador;
    }

    public void setQuantidadeMemoriaRAM(int qua){
        quantidadeMemoriaRAM = qua;
    }

    public int getQuantidadeMemoriaRAM(){
        return quantidadeMemoriaRAM;
    }

    public void setTamanhoHD(int tam){
        tamanhoHD = tam;
    }

    public int getTamanhoHD(){
        return tamanhoHD;
    }

}
