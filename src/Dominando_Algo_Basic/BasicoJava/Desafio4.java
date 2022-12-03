package Dominando_Algo_Basic.BasicoJava;
import java.util.Scanner;
 
public class Desafio4 
{
  public static void main(String[] args) 
  {
    
        Scanner number = new Scanner(System.in);

        int num = number.nextInt();
        fizzBuzz(num);
      
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

  }
 
  private static void fizzBuzz(int num) 
  {
    
      if (((num % 5) == 0) && ((num % 3) == 0)) // Is it a multiple of 5 & 7?
        System.out.println("FizzBuzz ");
      else if ((num % 3) == 0) // Is it a multiple of 5?
        System.out.println("Fizz");
      else if ((num % 5) == 0) // Is it a multiple of 7?
        System.out.println("Buzz");
      else
        System.out.println(num); // Not a multiple of 5 or 7
    
 }
  

}