package questão18;

import java.util.Scanner;

public class Questão18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int atual,maior =0, pos=0;
        for (int i = 1; i <= 100; i++) {
            atual = teclado.nextInt();
            if(atual>maior){
                maior = atual;
                pos=i;
            }
        }
        System.out.println(maior);
        System.out.println(pos);
    }
}
