package exercicovetor;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Yasmin
 */
public class ExercicoVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[10];
        for(int n=0; n<10; n++){
            System.out.print("Digite um número ");
            num[n] = teclado.nextInt();
        }
        System.out.println("");
        Arrays.sort(num);
        for(int n = num.length-1; n >= 0; n--){
            System.out.print(num[n]+" ");
        }
        
        
        
      /*int[] nums = new int[5];

        String msm = "";

        Scanner entrada = new Scanner(System.in);

        for(int x = 0; x < 5; x++){

            nums[x] = entrada.nextInt();

            msm += "Posição do vetor: [" + x + "] | Valor armazenado: " + nums[x] + "\n";

        }
        System.out.println(msm);*/
        
    }
    
}
