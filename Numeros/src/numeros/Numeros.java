package numeros;

import java.util.Scanner;

/**
 *
 * @author Yasmin
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, soma=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.print("Digite um número: ");
            num = teclado.nextInt();
            soma += num;
            System.out.println("Quer continuar? [S/N]");
            resp = teclado.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é "+soma);
    }
    
}
