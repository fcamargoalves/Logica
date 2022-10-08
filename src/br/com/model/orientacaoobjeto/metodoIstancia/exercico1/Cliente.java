package br.com.model.orientacaoobjeto.metodoIstancia.exercico1;

public class Cliente {

    String primeiroNome;
    String ultimoNome;
    String telefone;
    String email;


    /* Metodo utilitário */

    //Retorna o nome completo
    String obterNomeCompleto( ) {
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }


    //Retorna o DDD
    String obterDDD(){
        String ddd = telefone.substring(0 ,2);
        return ddd;
    }
}
