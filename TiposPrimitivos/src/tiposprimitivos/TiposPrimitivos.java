package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Yasmin
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite o nome do aluno: ");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();// passando o valor de teclado para a String nome
        System.out.println("Digite a nota do aluno:");
        float nota = teclado.nextFloat();// passando o valor de teclado para o Float nota
        // O \n serve para quebrar a linha. E o %.2f para exibir duas casas 
        // decimais.
        System.out.printf("A nota de %s é %.1f \n",nome, nota);
    }
    
}
