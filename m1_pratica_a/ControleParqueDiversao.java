public class ControleParqueDiversao
{
    public static void main(String args[]){
    final int IDADE_MINIMA = 12;
    final double VALOR_CARTAO = 15.0;

    int qteAcessos = 12;
    int idade = 15;
    double valorBrinquedo = 3.5;
    
    double totalSemCartao = qteAcessos*valorBrinquedo;
    double totalEconomiaCartao = totalSemCartao-VALOR_CARTAO;
    
    System.out.printf("Você economizou:  %4.2f.\n", totalEconomiaCartao);
    System.out.printf("Você acessou um brinquedo e agora possui: %d\n", --qteAcessos);
    System.out.printf("Pela sua idade seu acesso ao brinquedo é: %b\n", idade>IDADE_MINIMA);
    System.out.printf("Controle acesso: idade permitida e\n");
    System.out.printf("Possui acessos: %b.\n", idade>IDADE_MINIMA && qteAcessos>0);
    }
}
