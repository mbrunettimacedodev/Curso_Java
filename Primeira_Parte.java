package Curso_Java;
import java.util.Scanner;

public class Primeira_Parte {
    // Java

    /*oiiii */

    /** 
     * 1
     * 2
     * 3
     * 4
     * comentário para documentação */
public static void main(String[] args){
    // 1- O que são variáveis?
    // tipo -> nome -> atribuir um valor;

    String firstName = "Matheus";
     String secondName = "Macedo";

     // 2- Atribuição de uma variável + a outra

     String fullName = firstName + " " + secondName;
     String full = "O nome é: " + fullName;

     System.out.println(firstName + secondName);
     System.out.println(fullName);
     System.out.println(full);
// Outro tipo de variável "char"
     char letra = 'A';
     System.out.println(letra);

     char simbolo = '$';
     System.out.println(simbolo);
// Outro tipo de variável "int"
     int numeroFixo = 560;
     System.out.println(numeroFixo);

    int n = 50;
    System.out.println(n + 50);
    System.out.println(n * 3);
    System.out.println(n / 3);

// Outro tipo de variável "long"
    long numeroGrandao = 500_000_000_000L;
    long numeroGrande = 500000000000L;

    System.out.println(numeroGrandao + 1);
// Outro tipo de variável "double"
    double numeroComVirgula = 19.99D;
    double preco = 77.890d;
    double precoBaixo = 12.99;
    
    System.out.println(numeroComVirgula);
    System.out.println(preco);
    System.out.println(precoBaixo);

    double pi = 3.14_156_123;
    System.out.println(pi);

    // 9: Operadores Aritméticos

    int soma = 12 + 5;

    System.out.println(soma);
    System.out.println(10 - 5);
    System.out.println(10.0 / 3);
    System.out.println(12.5 / 3);
    System.out.println(10 * 3);
    System.out.println(10 % 3);

    // 10: Operadores Aritméticos 2

    int x = 5;
    x++;
    x++;
    x++;
    x++;
// loops For e While
    System.out.println(x);

    int y = 10;
    y--;

    System.out.println(y);

    int a = 10;
    a+= 5;
    System.out.println(a);

    int b = 15;
    b-= 5;
    System.out.println(b);

    // Type Casting (Implicito - widening)

    int numero = 42;

    long numeroLong = numero;

    System.out.println(numero);
    System.out.println(numeroLong);
   
      // Explicito - narrowing

      double  valorDouble = 9.78;

      int valorInt = (int) valorDouble;
  
      System.out.println(valorInt);

      //Casting de char para Int
      char nomeChar = 'A';
      int numeroInt2 = (int) nomeChar;
      System.out.println(numeroInt2);

      // Classe Scanner

      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite seu nome: ");
      String nome = scanner.nextLine();
      System.out.println("Seu nome é " + nome);
      
      System.out.println("Agora, digite sua idade: ");
      int idade = scanner.nextInt(); 
      System.out.println("Sua idade é: " + idade + " Anos");
      
}


  
}
