package ExerciciosPraticas.dominandoJava.BasicoJava;

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  
import java.util.Scanner;

public class Desafio2 {
     
// Function for calculating sum
// of multiples of a upto N
static int calculate_sum(int a, int N) {
     
    // Number of multiples
    int m = N / a;
 
    // sum of first m natural numbers
    int sum = m * (m + 1) / 2;
 
    // sum of multiples
    int ans = a * sum;
 
    return ans;
}
 



    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        
        System.out.println(calculate_sum(A, N));

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
    }
}