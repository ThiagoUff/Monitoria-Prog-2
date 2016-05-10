/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questão26;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questão26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int val;
        int pi = 0, pp = 0;
        for (int i = 0; i < 15; i++) {
            val = teclado.nextInt();
            if (val % 2 != 0) {
                impar[pi] = val;
                pi++;

            } else {
                par[pp] = val;
                pp++;
            }
            if (pp == 5) {
                for (int j = 0; j < par.length; j++) {
                    System.out.println("par[" + j + "] = " + par[j]);
                }
                pp = 0;
            }
            if (pi == 5) {
                for (int j = 0; j < impar.length; j++) {
                    System.out.println("impar[" + j + "] = " + impar[j]);
                }
                pi = 0;
            }
        }
        for (int j = 0; j < pi; j++) {
            System.out.println("impar[" + j + "] = " + impar[j]);
        }
        for (int j = 0; j < pp; j++) {
            System.out.println("par[" + j + "] = " + par[j]);
        }


    }
}
