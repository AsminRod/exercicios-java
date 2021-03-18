package testefuncao02;

/**
 *
 * @author Yasmin
 */
public class TesteFuncao02 {

    static int soma(int a, int b){
        int s = a+b;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        int sm = soma(5,2);
        System.out.println("O valor da soma é "+sm);
    }
    
}
