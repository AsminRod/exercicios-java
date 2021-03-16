package diamulherpromo;

import java.util.Scanner;

/**
 *
 * @author Yasmin
 */
public class DiaMulherPromo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite o seu gênero: [F/M]");
        String sexo = teclado.nextLine();
        System.out.println("Digite o valor da compra: ");
        double valorC = teclado.nextDouble();
        
        switch (sexo){
            case "F":
                double dF = valorC - (valorC*0.13);
                System.out.printf(nome+" o valor de sua compra com 13 por cento de desconto é de %.2f %n",dF);
                break;
            case "M":
                double dM = valorC - (valorC*0.05);
                System.out.printf(nome+" o valor de sua compra com 5 por cento de desconto é de %.2f %n",dM);
                break;
            default:
                System.out.println("Digite uma opção válida!");
        }
    }
}
