package terreno;

import java.util.Scanner;

/**
 *
 * @author Yasmin
 */
public class Terreno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a largura do terreno: ");
        float l = teclado.nextFloat();
        System.out.print("Digite o comprimento do terreno: ");
        float c = teclado.nextFloat();
        float a = l*c;
        System.out.printf("A área do terreno é de %.2f m² %n ",(a));
        if (a < 100){
            System.out.println("Terreno Popular!");
        } else if (a >= 100 && a <= 500){
            System.out.println("Terreno Master!");
        } else if (a > 500){
            System.out.println("Terreno Vip!");
        }
    }
    
}
