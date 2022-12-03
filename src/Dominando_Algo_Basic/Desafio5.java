package Dominando_Algo_Basic;
// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class Desafio5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int num;
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

   
        num = leitor.nextInt();
        
        // leitura do vetor
        for(int i = 0; i < elementos.length; i++){
            
            // se existir no vetor o número digitado
            if(elementos[i] == num){
                System.out.printf("Achei %d na posicao %d", num, i);
              break;
            // se não existir...
            } else if(i == elementos.length-1){
                System.out.printf("Numero %d nao encontrado!", num);
            }
        }
    }

}

