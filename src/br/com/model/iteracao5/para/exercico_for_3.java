package br.com.model.iteracao5.para;

public class exercico_for_3 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Vai parar " + i);
                break;
            }
            System.out.println("Iteração: " + i);
        }

    }
}
