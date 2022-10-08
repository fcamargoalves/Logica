package br.com.model.iteracao5.enquanto;

public class exe_while_03 {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            if (i == 5) {
                System.out.println("Vai parar");
                i++;
                continue;
            }
            System.out.println(i + ": Qualquer numeros");
            i++;
        }
    }
}
