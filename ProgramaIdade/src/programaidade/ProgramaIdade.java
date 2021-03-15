package programaidade;
import java.util.Scanner;

/**
 *
 * @author Yasmin
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano que você nasceu: ");
        int nasc = teclado.nextInt();
        int idade = 2021 - nasc;
        System.out.println("Sua idade é: "+idade);
        if(idade >= 18){
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
    
}
