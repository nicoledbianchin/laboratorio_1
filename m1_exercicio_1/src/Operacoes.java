public class Operacoes {
    public static void main(String[] args) {
        int a = Teclado.leInt("Informe um número inteiro: ");
        int b = Teclado.leInt("Informe outro número inteiro: ");

        int multiplicado = a*b;
        int dividido = a/b;
        int somado = a+b;
        int subtraido = a-b;
        int elevado = (int) Math.pow(a,b);

        System.out.printf("%d multiplicado por %d é %d\n", a, b, multiplicado);
        System.out.printf("%d dividido por %d é %d\n", a, b, dividido);
        System.out.printf("%d mais por %d é %d e %d menos %d é %d\n", a, b, somado, a, b, subtraido);
        System.out.printf("%d elevado por %d é %d\n", a, b, elevado);
    }
}
