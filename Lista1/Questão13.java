/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questão13;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questão13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int val;
        int par = 0, impar = 0, neg = 0, pos = 0;
       
        for (int i = 0; i < 5; i++) {
            val = teclado.nextInt();
            if (val < 0) {
                neg++;
            } else if(val!=0) {
                pos++;
            }
            if (val % 2 != 0) {
                impar++;
            } else {
                par++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");

    }
}
