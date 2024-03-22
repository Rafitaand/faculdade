
package aula;

import java.util.Scanner;

public class aulinha1 {
    

    public static void main(String[] args) {
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Este programa realiza a área do quadrado: ");

       // Informa o pedido do valor do lado desejado, para que descubra a área
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da lateral do quadrado desejado: ");
        int Lado = scanner.nextInt();
     

        // Calcula a área
        int resultadoArea = (Lado*2);

        // Exibe o resultado para o usuário
        System.out.println("o valor da área do quadrado, é igual a: " + resultadoArea);

        // Fecha o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
