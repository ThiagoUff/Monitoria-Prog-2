/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questão15;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questão15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, y;
        int soma = 0;
        x = teclado.nextInt();
        y = teclado.nextInt();
        if (y < x) {
            int aux;
            aux = x;
            x = y;
            y = aux;
        }
        if (x % 2 != 0) {
            x++;
        }

        while (x < y) {
            if (x % 2 != 0) {
                System.out.println("x: " + x);
                System.out.println("y: " + y);
                System.out.println("-----------------");
                soma = soma + x;
                System.out.println("soma: " + soma);
            }
            x++;
        }
        System.out.println(soma);
    }
}
