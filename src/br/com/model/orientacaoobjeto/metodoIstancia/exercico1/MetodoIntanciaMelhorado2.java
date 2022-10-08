package br.com.model.orientacaoobjeto.metodoIstancia.exercico1;

public class MetodoIntanciaMelhorado2 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.primeiroNome = "maria";
        cliente.ultimoNome = "silva";
        cliente.telefone = "6530232855";
        cliente.email = "ale@bol.co.br";

        Cliente cliente2 = new Cliente();

        cliente2.primeiroNome = "carlos";
        cliente2.ultimoNome = "silva";
        cliente2.telefone = "6530232855";
        cliente2.email = "ale@bol.co.br";

        System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
        System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());
    }
}
