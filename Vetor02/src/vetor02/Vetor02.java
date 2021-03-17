package vetor02;

import java.util.Scanner;

/**
 *
 * @author Yasmin
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abriu", "Maio", 
            "Junho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        System.out.print("Digite um ano qualquer: ");
        int ano = teclado.nextInt();
        for(int i=0;i < mes.length; i++){
            if ((ano%400 == 0) || ((ano%4 == 0) && (ano%100 != 0))){
                tot[1]=29;
            } 
            System.out.println(mes[i]+" tem "+ tot[i]+" dias.");
            
        }
                
                
                
    }
    
}
