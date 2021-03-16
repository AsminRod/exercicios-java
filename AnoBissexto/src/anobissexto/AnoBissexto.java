package anobissexto;

import java.util.Scanner;

/**
 *
 * @author Yasmin
 */
public class AnoBissexto {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um ano qualquer: ");
        int ano = teclado.nextInt();
        
        if ((ano%400 == 0) || ((ano%4 == 0) && (ano%100 != 0))){
            System.out.println("O ano é Bissexto!");
        } else {
            System.out.println("O ano não é bissexto");
        }
    }
    
}
