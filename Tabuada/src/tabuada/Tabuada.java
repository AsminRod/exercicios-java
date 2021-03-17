package tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        int entrada;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informar um número: ");
        entrada = scanner.nextInt();

        int multiplicador = 0;
        while(multiplicador <= 10)
        {
            int resultado = entrada * multiplicador;
            System.out.println(entrada+" X "+multiplicador+" = "+resultado);   
            multiplicador++;
        }
    }
    
}
