
public class ParqueDiversao
{
    public static void main(String args[]){
        final int IDADE_MINIMA = 12;
        
        String nome = "Maria";
        char primeiraLetraDoNome = 'M';
        int idade = 12;
        double valorBrinquedo = 3.5;
        
        System.out.print("Olá "+ nome);
        System.out.printf("\nA primeira letra do seu nome é %c\n", primeiraLetraDoNome); 
        System.out.printf("A sua idade é %d\n", idade); 
        System.out.printf("A idade mínima para entrar no brinquedo é %d\n", IDADE_MINIMA); 
        System.out.printf("O valor do brinquedo é %4.2f\n\n", valorBrinquedo); 

    }
}
