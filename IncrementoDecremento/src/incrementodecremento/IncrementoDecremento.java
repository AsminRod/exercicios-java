package incrementodecremento;

/**
 *
 * @author Yasmin
 */
public class IncrementoDecremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Incremento");
        int num1 = 8;
        num1++;
        System.out.println(num1);
        
        System.out.println("--------------------------");
        
        System.out.println("Decremento");
        int num2 = 8;
        num2--;
        System.out.println(num2);
        
        System.out.println("---------------------------");
        
        System.out.println("Incremento pós variável");
        int num3 = 6;
        int valor1 = 5 + num3++;
        System.out.println(valor1);
        
        System.out.println("---------------------------");
        
        System.out.println("Incremento pré variável");
        int num4 = 6;
        int valor2 = 5 + ++num4;
        System.out.println(valor2);
        
        System.out.println("---------------------------");
        
        System.out.println("Decremento pós variável");
        int num5 = 7;
        int valor3 = 6 + num5--;
        System.out.println(valor3);
        
        System.out.println("---------------------------");
        
        System.out.println("Decremento pré variável");
        int num6 = 7;
        int valor4 = 6 + --num6;
        System.out.println(valor4);
    }
    
}
