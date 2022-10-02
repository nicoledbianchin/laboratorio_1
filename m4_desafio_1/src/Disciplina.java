public class Disciplina {
    private String nome;
    private int codigo;
    private int vagasDisponiveis;
    private int quantidadeAlunosMatriculados;
    private String professor;

    public Disciplina(String nome, int codigo, int vagasDisponiveis, String professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.vagasDisponiveis = vagasDisponiveis;
        this.quantidadeAlunosMatriculados = 0;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public int getQuantidadeAlunosMatriculados() {
        return quantidadeAlunosMatriculados;
    }

    public void setQuantidadeAlunosMatriculados(int quantidadeAlunosMatriculados) {
        this.quantidadeAlunosMatriculados = quantidadeAlunosMatriculados;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void trancaMatriculaAluno(){
        this.quantidadeAlunosMatriculados = quantidadeAlunosMatriculados - 1;
        this.vagasDisponiveis = vagasDisponiveis + 1;
    }

    // estrutura de seleção
    // permite a matricula de um novo aluno apenas se há vagas disponíveis
    public void matriculaNovoAluno(){
        if(this.vagasDisponiveis == 0) {
            System.out.println("Disciplina sem vagas disponíveis, tente novamente no próximo semestre");
        } else {
            this.quantidadeAlunosMatriculados = quantidadeAlunosMatriculados + 1;
            this.vagasDisponiveis = vagasDisponiveis - 1;
            System.out.println("Aluno matriculado com sucesso");
        }
    }
}