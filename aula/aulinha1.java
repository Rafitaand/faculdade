
package aula;

import java.util.Scanner;

public class aulinha1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Este programa realiza o perímetro de um retângulo.");
    
    System.out.println("Digite o valor da Altura do retângulo: ");
    int Altura = scanner.nextInt();
    System.out.println("Digite o valor da base: ");  int base = scanner.nextInt();
    
  

    int resultadoPerimetro = 2*(Altura+base);
    System.out.println("O valor encotrado do perímetro do retângulo, foi de: " + resultadoPerimetro);
    }
}


    

