package aula4;

import java.util.Scanner;

public class exercicio {
    // PRIMEIRO EXERCÍCIO:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        // Informa ao usuário sobre o propósito do programa
        System.out.println("Digite o valor desejado para saber o valor da raíz cubica do número: ");
        int raiz = scanner.nextInt();
        
        // Calcula a raiz cubica
        int resultadocubico = (raiz)*(raiz)*(raiz);
  
        // Exibe o resultado para o usuário
        System.out.println("O valor da raíz cúbica de " + raiz + " é igual a: " +resultadocubico);
  
    System.out.println("--------------------------------------------------");

        
    // SEGUNDO EXERCÍCIO:
   
    // Informa ao usuário sobre o propósito do programa
    System.out.println("Este programa realiza o perímetro de um retângulo.");
    
      // Informa o pedido do valor da Altura, para que descubra o perímetro
    System.out.println("Digite o valor da Altura do retângulo: ");
    int Altura = scanner.nextInt();

    // Informa o pedido do valor da base, para que descubra o perímetro
    System.out.println("Digite o valor da base: ");  
    int base = scanner.nextInt();
  
    // Calcula o perímetro desejado
    int resultadoPerimetroR = 2*(Altura+base);
    
    // Exibe o resultado para o usuário
    System.out.println("O valor encotrado do perímetro do retângulo, foi de: " + resultadoPerimetroR);

    System.out.println("--------------------------------------------------");
    
    
    // TERCEIRO EXERCÍCIO:
    
    // Informa ao usuário sobre o propósito do programa
    System.out.println("Este programa realiza o perímetro do quadrado: ");

    // Informa o pedido do valor do lado desejado, para que descubra o perímetro

     System.out.print("Digite o valor da lateral do quadrado: ");
     int Lado = scanner.nextInt();


     // Calcula o perímetro
     int resultadoPerimetro = (Lado*4);

     // Exibe o resultado para o usuário
     System.out.println("o valor da área do quadrado, é igual a: " + resultadoPerimetro);

     System.out.println("--------------------------------------------------");
    
    
     // QUARTO EXERCÍCIO:

    // Informa ao usuário sobre o propósito do programa
    System.out.println("Este programa realiza a área do quadrado: ");

    // Informa o pedido do valor do lado desejado, para que descubra a área
     System.out.print("Digite o valor da lateral do quadrado desejado: ");
     int LadoQ = scanner.nextInt();


     // Calcula a área
     int resultadoArea = (LadoQ*LadoQ);

     // Exibe o resultado para o usuário
     System.out.println("o valor da área do quadrado, é igual a: " + resultadoArea);
    
     System.out.println("--------------------------------------------------");
    
    
     // QUINTO EXERCÍCIO:

    // Informa ao usuário sobre o propósito do programa
    System.out.println("Este programa realiza a conversão de Celsius para Fahrenheit.");
    
    // Informa o valor do °C para conversão
    System.out.println("Digite o valor do graus Celsius: ");
    float Celsius = scanner.nextInt();
    
  
    // Calcula conversão (fiquei com dúvda: por que eu não pude colocar 1.8 no lugar da fração?)
    float resultadoConversão = (Celsius*9/5) +32;
    
    // Exibe o resultado para o usuário
    System.out.println("O valor da conversão de "  + Celsius + "°C para Fahrenheit, foi de: " + resultadoConversão + "F");   

    System.out.println("--------------------------------------------------");
    
    
    // SEXTO EXERCÍCIO:
    
    // Informa ao usuário sobre o propósito do programa
    System.out.println("Este programa realiza o cálculo de juros simples.");
    
    System.out.println("Digite o valor do capital inicial: ");
    double capitalInicial = scanner.nextDouble();

    System.out.println("Digite o valor da taxa de juros: ");
    double taxaDeJuros = scanner.nextDouble();

    System.out.println("Digite o valor do tempo ao ano ou ao mês de aplicação: ");
    double tempo = scanner.nextDouble();
    
    // cálculo do juros simples (J = c.i.t)
    double taxa = taxaDeJuros/100;
    double resultadoJuros = capitalInicial*tempo*taxa;
    
     // Exibe o resultado para o usuário 
    System.out.println("o juros final foi de: " +resultadoJuros);

    scanner.close();

    }

}
