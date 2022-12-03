package Dominando_Algo_Basic.BasicoJava;
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.*;

public class Desafio {

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    		
    
    		
    		if(num1 == num2) {
    			System.out.print("Sao iguais!");
    		}
    		else {
    			System.out.print("Nao sao iguais!");
    			
        }

    }
}