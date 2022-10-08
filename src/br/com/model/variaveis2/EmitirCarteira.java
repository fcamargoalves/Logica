package br.com.model.variaveis2;

public class EmitirCarteira {
    public static void main(String[] args) {

        Integer idade = 19;
        Boolean podeTirarCarteira = idade > 19;

        if (podeTirarCarteira){
            System.out.print("Sim pode tirar");
        }else
        {
            System.out.print("Não pode tirar");
        }




    }
}
