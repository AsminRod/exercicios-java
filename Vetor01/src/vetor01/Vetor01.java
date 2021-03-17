package vetor01;

/**
 *
 * @author Yasmin
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n[] = {5,4,3,2,1,0};
        System.out.println("O vetor N tem "+n.length+" posições");
        for(int c=0;c<n.length;c++){
            System.out.println("Na posição "+c+" temos o valor "+n[c]);
        }
        
    }
    
}
