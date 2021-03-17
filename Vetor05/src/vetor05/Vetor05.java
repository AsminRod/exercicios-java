package vetor05;

import java.util.Arrays;

/**
 *
 * @author Yasmin
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[] = new int[5];
        Arrays.fill(num, 0);
        for(int v: num){
            System.out.print(v+" ");
        }
    }
    
}
