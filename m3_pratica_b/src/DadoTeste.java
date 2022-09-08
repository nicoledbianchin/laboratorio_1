public class DadoTeste {
    public static void main(String[] args) {
        Dado dado1 = new Dado(6);
        Dado dado2 = new Dado(10);

        int jogada1 = dado1.jogaDado();
        int jogada2 = dado1.jogaDado();
        int jogada3 = dado1.jogaDado();
        int jogada4 = dado1.jogaDado();
        System.out.println(jogada1);
        System.out.println(jogada2);
        System.out.println(jogada3);
        System.out.println(jogada4);

        int jogada5 = dado2.jogaDado();
        int jogada6 = dado2.jogaDado();
        int jogada7 = dado2.jogaDado();
        int jogada8 = dado2.jogaDado();
        System.out.println(jogada5);
        System.out.println(jogada6);
        System.out.println(jogada7);
        System.out.println(jogada8);
    }
}
