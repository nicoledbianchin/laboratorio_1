import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);

        System.out.println("--- Informe os dados do estudante ---");
        System.out.printf("Aluno: ");
        String aluno = le.nextLine();

        System.out.printf("Curso: ");
        String curso = le.nextLine();

        System.out.printf("Disciplina: ");
        String disciplina = le.nextLine();

        System.out.printf("Horário: ");
        String horario = le.nextLine();

        Interprete interprete1 = new Interprete(aluno, curso, disciplina, horario);

        interprete1.exibeDados();
        interprete1.confirma();

        le.close();
    }
}