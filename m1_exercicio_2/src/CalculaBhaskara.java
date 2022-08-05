public class CalculaBhaskara {
    public static void main(String[] args) {
        int a = Teclado.leInt("Informe a: ");
        int b = Teclado.leInt("Informe b: ");
        int c = Teclado.leInt("Informe c: ");

        double dentroRaiz = (b*b) - (4*a*c);
        double divisor = 2*a;
        double dividendo1 = -b+ Math.sqrt(dentroRaiz);
        double dividendo2 = -b - Math.sqrt(dentroRaiz);

        double xLinha = dividendo1/divisor;
        double xDuasLinhas = dividendo2/divisor;

        System.out.printf("Raízes calculadas:\n");
        System.out.printf("x' raiz positiva: %.1f\n", xLinha);
        System.out.printf("x'' raiz negativa: %.1f:\n", xDuasLinhas);
    }
}
