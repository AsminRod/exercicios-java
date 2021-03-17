package contador01;

/**
 *
 * @author Yasmin
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cc = 0; // com quanto a varável irá começar
        while(cc<10){
            cc++; // variável recebendo +1
            if (cc == 2 || cc == 3 || cc == 4){
                continue;
            }
            if (cc == 7){
                break;
            }    
            System.out.println("Cambalhota "+cc);
            
        }
    }
    
}
