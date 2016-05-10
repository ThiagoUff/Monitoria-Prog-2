/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questão23;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questão23 {


    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);    
        int n=teclado.nextInt();
        int fatorial = 0;
        
        for (int i = n; i > 1; i--) {
            if (i == n) {
                fatorial += i * (i - 1);
            } else {
                fatorial = fatorial * (i - 1);
            }
        }
        System.out.println(fatorial);
    }
}
