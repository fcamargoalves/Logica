package br.com.model.orientacaoobjeto.encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        //cliente.nome = "Fernando";
        //cliente.telefone = "30232800";

        cliente.setNome("Maria Dias");
        cliente.setTelefone("30232800");

        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Nome cliente: " + cliente.primeiroNome);
        System.out.println("Nome cliente: " + cliente.ultimoNome);
    }

}
