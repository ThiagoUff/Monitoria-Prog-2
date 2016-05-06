/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão5;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Questão5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();

        
        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1);
            if (num2 <= num3) {
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num2);
            }
        }
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num3);
                System.out.println(num2);
                System.out.println(num1);
            }
            if (num2 <= num3) {
                System.out.println(num2);
                System.out.println(num3);
                System.out.println(num1);
            }
        }
        if (num1 <= num2 && num1 >= num3) {
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        }
        if (num1 >= num2 && num1 <= num3) {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }
        
        System.out.println();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }   

}
