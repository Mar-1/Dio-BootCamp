package Dominando_Algo_Basic;
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class Desafio3 {
     
// Function for calculating sum
// of multiples of a upto N
  static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
 
// Driver code
public static void main(String[] args) {
  int n;
   Scanner numero = new Scanner(System.in);
    n = numero.nextInt();
    System.out.println(somatorio(n) );
}
}