
package questão6;

import java.util.Scanner;


public class Questão6 {

   
    public static void main(String[] args) {
       boolean triangulo = false;
       double a,b,c,perimetro,area;
       Scanner teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        if ((b - c) < a && a < b + c && c < a + b){
            triangulo = true;
        }
        if (triangulo == true){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }
        else{
            area = (c * (a +b))/2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
    
}
