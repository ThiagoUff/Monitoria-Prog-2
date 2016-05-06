/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questão16;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questão16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int val;
        int in = 0, out = 0;
        for (int i = 0; i < n; i++) {
            val = teclado.nextInt();
            if (val >= 10 && val <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
