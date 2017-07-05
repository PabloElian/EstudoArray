/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Estudo Array - exemplo 1 - Array simples
 * @author Pablo Elian
 */
public class Array1 {
    public static void main(String[] args) {
        // Sem array
        System.out.println("Array simples");
        System.out.println("1. Sem array");
        // String -> aceita uma cadeira de caracteres (qualquer caractere)
        String time1="Palmeiras";
        String time2="Corinthians";
        String time3="São Paulo";
        String time4="Santos";
        System.out.println("Time: " + time2);
        
        System.out.println("2. Com array");
        //a linha abaixo cria um array(vetor) simples de tamanho 4
        String [] times={"Palmeiras" , "Corinthians" , "São Paulo", "Santos"};
        // a lnha abaixo exibe o conteúdo do array na posição 1
        // [0] [1] [2] [3]
        System.out.println("Time: " + times[1]);
        // na linha abaixo o .length exibe o tamanho do array
        System.out.println("Tamanho do array: " + times.length);
        // a linha abaixo altera o conteúdo do array
        times[1] = "Flamengo";
        System.out.println("Time: " + times[1]);
    }
            
}
