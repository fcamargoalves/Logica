package br.com.model.orientacaoobjeto.metodoIstancia.exercico1;

public class MetodoIntancia {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.primeiroNome = "maria";
        cliente.ultimoNome = "silva";
        cliente.telefone = "00000";
        cliente.email = "ale@bol.co.br";

        System.out.println("Nome cliente: " + cliente.primeiroNome + " " + cliente.ultimoNome);
    }

}
