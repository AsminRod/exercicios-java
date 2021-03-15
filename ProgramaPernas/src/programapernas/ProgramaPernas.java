package programapernas;

import java.util.Scanner;

/**
 *
 * @author Yasmin
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de pernas: ");
        int pernas = teclado.nextInt();
        System.out.print("Isso é um(a): ");
        String tipo;
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrupíde";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
        
    }
    
}
