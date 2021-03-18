package funcao01;

import java.util.Scanner;

/**
 *
 * @author Yasmin
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();
        Fatorial f = new Fatorial();
        f.setValor(numero);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
    
}
