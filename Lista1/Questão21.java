/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questão21;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questão21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();
        int y = teclado.nextInt();

        while (x != 0 && y != 0) {
            if (x < 0) {
                if (y < 0) {
                    System.out.println("terceiro");
                } else {
                    System.out.println("segundo");
                }
            } else {
                if (y < 0) {
                    System.out.println("quarto");
                } else {
                    System.out.println("primeiro");
                }

            }
            x = teclado.nextInt();
            y = teclado.nextInt();
        }
    }
}
