import java.util.Scanner;

public class Interprete {
    private String aluno;
    private String curso;
    private String disciplina;
    private String horario;

    public Interprete(String aluno, String curso, String disciplina, String horario) {
        this.aluno = aluno;
        this.curso = curso;
        this.disciplina = disciplina;
        this.horario = horario;
    }

    public String getAluno() {
        return aluno;
    }
    public void setAluno(String aluno) {
        this.aluno = aluno;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void confirma() {
        System.out.printf("%nVocê gostaria de confirmar a solicitação? (Sim/Não)%n");

        Scanner le = new Scanner(System.in);
        String confirmacao = le.nextLine();

        if(confirmacao.equalsIgnoreCase("Sim")) {
            System.out.printf("%nSua solicitação foi confirmada.%n");
        } else if (confirmacao.equalsIgnoreCase("Não")) {
            System.out.printf("%nSua solicitação foi cancelada.%n");
        } else {
            System.out.printf("%nComando Inválido. Não foi possível confirmar sua solicitação.%n");
        }
    }

    public void exibeDados() {
        System.out.printf("%n--- Solicitação de Intérprete ---%n");
        System.out.printf("O(a) aluno(a) %s, do curso %s, gostaria de solicitar um intérprete para as aulas de %s, %s.%n", this.aluno, this.curso, this.disciplina, this.horario);
    }
}