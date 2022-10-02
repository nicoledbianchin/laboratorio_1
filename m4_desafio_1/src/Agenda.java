public class Agenda
{
    private String compromisso; // Nome do compromisso na agenda
    private int    dia;
    private int    mes;
    private int    ano;
    static  int    cont;
    private String turno;


    // metodo construtor
    public Agenda(String compromisso, int dia, int mes, int ano, String turno){
        this.compromisso = compromisso;
        this.dia   = dia;
        this.mes   = mes;
        this.ano   = ano;
        this.turno = turno;
        System.out.printf ("\n%s\n",ValidaData(dia,mes,ano));
        cont = ++cont;
    }


    // getters and setters
    public String getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(String compromisso) {
        this.compromisso = compromisso;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;

    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTurno() {
        return turno;

    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    // lista o compromisso cadastrado
    public void listaComp(){
        System.out.println("Compromisso        : "+ getCompromisso());
        System.out.printf ("Data               : %d/%d/%d\n", getDia(),getMes(), getAno());
        System.out.println("Turno              : "+getTurno());
    }

    //lista a quantidade de compromissos cadastrados
    public void listaQteCompromissos(){
        System.out.printf ("\nQtdeCompromisso(s) : %d \n",cont);
    }

    // O objetivo desse método é retornar se uma data informada é correta ou não.
    // Ele vai ser útil na melhoria dessa classe. Quando a data for cadastrada pelo usuário.
    // Dia, mes e ano são valores inteiros informados separadamente.
    // Não é feito a verificacao se o ano é bissesto.


    public String ValidaData(int d, int m, int a ){
        String retorno;
        if (d < 1 || d > 31){ // Se o dia é inválido não faz as demais verificacoes
            retorno = "Dia incorreto";
        } else if (m < 1 || m > 12){ // Embora dia seja válido, basta o mês ser inválido para não verifica o ano
            retorno = "Mes incorreto";
        } else if (a < 2022){ // Como o software foi escrito em 2022 ele não permite agendar um compromisso antes disso.
            retorno = "Ano incorreto";
        } else {
            retorno = "Data correta"; // Se nenhuma das condicoes anteriores forem verdadeiras a data é válida.
        }
        return retorno;
    }

}