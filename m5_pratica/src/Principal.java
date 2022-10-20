public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
              Teclado.leInt("Informe a matrícula do usuário: "),
              Teclado.leString("Informe o nome do usuário: "),
              Teclado.leString("Informe o login do usuário: "),
              Teclado.leString("Informe a senha do usuário: ")
        );

        Professor professor = new Professor(
                Teclado.leInt("Informe a matrícula do professor: "),
                Teclado.leString("Informe o nome do professor: "),
                Teclado.leString("Informe o login do professor: "),
                Teclado.leString("Informe a senha do professor: ")
        );

        Aluno aluno = new Aluno(
                Teclado.leInt("Informe a matrícula do professor: "),
                Teclado.leString("Informe o nome do professor: "),
                Teclado.leString("Informe o login do professor: "),
                Teclado.leString("Informe a senha do professor: ")
        );

        System.out.println("\nMatrícula do usuário: " + usuario.getMatricula());
        System.out.println("\nNome do usuário: " + usuario.getNome());

        System.out.println("\nMatrícula do professor: " + professor.getMatricula());
        System.out.println("\nNome do professor: " + professor.getNome());

        System.out.println("\nMatrícula do aluno: " + aluno.getMatricula());
        System.out.println("\nNome do aluno: " + aluno.getNome());

        usuario.exibeDados();
        professor.exibeDados();
        aluno.exibeDados();
    }
}
