/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questao17;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questao17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int val;
        for (int i = 1; i <= n; i++) {
            val = teclado.nextInt();
            if (val == 0) {
                System.out.println("NULL");
            } else {
                if (val % 2 == 0) {
                    if (val > 0) {
                        System.out.println("EVEN POSITIVE");
                    } else {
                        System.out.println("EVEN NEGATIVE");
                    }
                } else {
                    if (val > 0) {
                        System.out.println("ODD POSITIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }
                }
            }
        }

    }
}

