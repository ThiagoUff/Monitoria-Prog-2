package questão19;


import java.util.Scanner;

public class Questão19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int qtd, qtdR = 0, qtdS = 0, qtdC = 0, total = 0;
        String tipo;
        for (int i = 0; i < n; i++) {
            qtd = teclado.nextInt();
            tipo = teclado.next();
            if (tipo.equals("C")) {
                qtdC = qtdC + qtd;
            }
            if (tipo.equals("S")) {
                qtdS = qtdS + qtd;
            }
            if (tipo.equals("R")) {
                qtdR = qtdR + qtd;
            }
            total = total + qtd;
        }

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + qtdC);
        System.out.println("Total de ratos: " + qtdR);
        System.out.println("Total de sapos: " + qtdS);
        System.out.printf("Percentual de coelhos: %.2f %%\n", ((float) qtdC / (float) total) * 100);
        System.out.printf("Percentual de ratos: %.2f %%\n", ((float) qtdR / (float) total) * 100);
        System.out.printf("Percentual de sapos: %.2f %%\n", ((float) qtdS / (float) total) * 100);
    }
}
