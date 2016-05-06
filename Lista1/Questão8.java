/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questão8;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questão8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c;
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        double aux;
        if (b > a && a >= c) {
            aux = b;
            b = a;
            a = aux;
        } else if (c > a && a >= b) {
            aux = c;
            c = a;
            a = aux;
        } else if (a < b && a <= c) {
            if (b > c) {
                aux = b;
                b = a;
                a = aux;
            } else {
                aux = c;
                c = a;
                a = aux;

            }
        }

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        if (a >= b + c) {
            System.out.println("NÃO FORMA TRIANGULO");
        } else {
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
