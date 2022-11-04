public class MEC {
    public void imprimeUniversidades(Universidade[] universidades){
        for(int i = 0; i < universidades.length; i++){
            if(universidades[i] != null){
                int countUniversidade = i + 1;
                System.out.println("**** Universidade " + countUniversidade + " ****S");
                universidades[i].imprimeInfo();

                String tipoUniversidade = universidades[i] instanceof Privada ? "Privada" : "Pública";
                System.out.println("Tipo de instituição: " + tipoUniversidade);
                System.out.println("");
            }
        }
    }

    public void maisCara(Universidade[] universidades){
        double valorMensalidadeMaisAlto = 0;
        int indiceUniversidadeMaisCara = 0;

        for(int i = 0; i < universidades.length; i++){
            if(universidades[i] instanceof Privada){
                double valorMensalidadeUniversidadeAtual = ((Privada) universidades[i]).getValorMensalidade();

                if(valorMensalidadeUniversidadeAtual > valorMensalidadeMaisAlto){
                    valorMensalidadeMaisAlto = valorMensalidadeUniversidadeAtual;
                    indiceUniversidadeMaisCara = i;
                }
            }
        }
        System.out.println("==== UNIVERSIDADE MAIS CARA ====");
        universidades[indiceUniversidadeMaisCara].imprimeInfo();
    }

    public void universidadesDoSul(Universidade[] universidades){
        String[] estadosDoSul = new String[3];
        estadosDoSul[0] = "RS";
        estadosDoSul[1] = "SC";
        estadosDoSul[2] = "PR";

        int countUniversidadesSul = 0;
        Universidade[] universidadesDoSul = new Universidade[universidades.length];


        for(int i = 0; i < universidades.length; i++){
            if(universidades[i] instanceof Publica) {
                for (int j = 0; j < estadosDoSul.length; j++) {
                    if (((Publica) universidades[i]).getEstado().toUpperCase().equals(estadosDoSul[j])){
                        universidadesDoSul[countUniversidadesSul] = universidades[i];
                        countUniversidadesSul++;
                    }
                }
            }
        }

        System.out.println("==== UNIVERSIDADES DO SUL ====");
        imprimeUniversidades(universidadesDoSul);
    }
}

