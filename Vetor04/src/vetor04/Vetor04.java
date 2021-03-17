
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Yasmin
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet[] = {3,7,6,1,9,4,2};
        for(int valor: vet){
            System.out.print(valor+" ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 8);
        System.out.println("Encontrei o valor na posição "+ p);
    }
    
}
