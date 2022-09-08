public class Livro
{
    private String titulo;
    private boolean emprestado;

    public Livro(String t) {
        titulo = t;
        emprestado = false;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getSituacao() {
        if(isEmprestado()) {
            return " EMPRESTADO";
        }
        else {
            return " DISPON�?VEL";
        }
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void empresta() {
        if(!isEmprestado())
            emprestado = true;
    }

    public void devolve() {
        emprestado = false;
    }

    public void exibeDados() {
        System.out.println("O titulo do livro e: " + titulo);
        System.out.println("Este livro esta: " + getSituacao());
    }
}
