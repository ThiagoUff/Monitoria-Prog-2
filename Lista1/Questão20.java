/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questão20;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questão20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int m = teclado.nextInt();
        int n = teclado.nextInt();
        while (m > 0 && n > 0) {
            if (m < n) {
                int temp = m;
                m = n;
                n = temp;
            }
            int soma = 0;
            for (int i = n; i <= m; i++) {
                System.out.printf("%d ", i);
                soma += i;
            }
            System.out.println("Sum="+ soma);
            m = teclado.nextInt();
            n = teclado.nextInt();
        }
    }
}
