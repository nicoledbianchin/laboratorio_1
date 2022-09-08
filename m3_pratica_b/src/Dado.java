public class Dado {
    private int lados;

    public Dado(int lados){
        this.lados = lados;
    }

    public int jogaDado() {
        return (int) (Math.random() * lados+ 1);
    }
}
