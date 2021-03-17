package naoseiqnomeda;

import java.util.Scanner;

/**
 *
 * @author Yasmin
 */
public class NaoSeiQNomeDa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        int divi5 = 0;
        int nulo=0;
        int somaPares = 0;
        
        for(int c=1;c<=5;c++){
            System.out.print("Digite o "+c+"o número: ");
            int num = teclado.nextInt();
            soma += num;
            if(num%5 == 0){
                divi5++; 
            }
            if(num == 0){
                nulo++;
            }   
            if(num%2 == 0){
                somaPares += num;
            }         
        }
        double media = soma/5;
        System.out.println("A soma de todos os valores informados é: "+soma);
        System.out.println("A média de todos os valores informados é: "+media);
        System.out.println("Todos os valores informados divididos por 5 é: "+divi5);
        System.out.println("Valores nulos: "+nulo);
        System.out.println("A soma de todos os valores pares informados é: "+somaPares);
        
    }
    
}
