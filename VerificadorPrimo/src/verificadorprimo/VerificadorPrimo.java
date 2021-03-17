package verificadorprimo;

import java.util.Scanner;

/**
 *
 * @author Yasmin
 */
public class VerificadorPrimo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("======= Número Primo =======");
        System.out.print("Digite um número: ");
        int num = teclado.nextInt();
        int cont = 0;
        int contDiv = 0;
        cont++;
        
        while(cont>num){
            if(num%cont == 0){
                contDiv++;
            }
            cont++;
        }
        if(contDiv >= 2){
            System.out.println("O número "+num+" NÃO É primo!");
        } else {
            System.out.println("O número "+num+" É primo!");
        }
        
    }
    
}
