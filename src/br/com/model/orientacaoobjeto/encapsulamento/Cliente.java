package br.com.model.orientacaoobjeto.encapsulamento;

public class Cliente {

    String primeiroNome;
    String ultimoNome;

    //String nome;
    String telefone;

    public String getNome() {
        return primeiroNome + " " + ultimoNome;
    }

    public void setNome(String nome) {
        String[] nomecompleto = nome.split(" ");
        primeiroNome = nomecompleto[0];
        ultimoNome = nomecompleto[1];
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
}
