package operadoresdeatribuicao;

/**
 *
 * @author Yasmin
 */
public class OperadoresDeAtribuicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x1 = 4;
        x1 += 2;// x = x + 2
        System.out.println(x1);
        
        System.out.println("----------");
        
        int x2 = 4;
        x2 -= 2;// x = x - 2
        System.out.println(x2);
        
        System.out.println("----------");
        
        int x3 = 4;
        x3 *= 2;// x = x * 2
        System.out.println(x3);
        
        System.out.println("----------");
        
        int x4 = 4;
        x4 /= 2;// x = x / 2
        System.out.println(x4);
        
        System.out.println("----------");
        
        int x5 = 4;
        x5 %= 2;// x = x % 2
        System.out.println(x5);
    }
    
}
