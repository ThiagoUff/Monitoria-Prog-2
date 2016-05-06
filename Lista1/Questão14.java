/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questão14;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questão14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        if (num > 0 && num <= 1000) {
            for (int i = 1; i <= num; i = i + 2) {
                System.out.println(i);
            }
        }
    }
}
