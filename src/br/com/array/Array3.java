/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.array;

/**
 * Estudo array - exemplo 3 - Instanciando(Criando) um array
 * @author Pablo Elian
 */
public class Array3 {
    public static void main(String[] args) {
        //Iniciando um array com um tamanho fixo de 5 variáveis
        int[] impares = new int[5];
        impares[0] = 1;
        impares[1] = 3;
        impares[2] = 5;
        impares[3] = 7;
        impares[4] = 9;
        System.out.println("Tamanho do array: " + impares.length);
        System.out.println("Posição 1 do array: " + impares[1]);
        // a linha abaixo gera um erro, pois o tamanho do array é 5
        impares[5] = 11;
        System.out.println("Posição 5 do array: " + impares[5]);
    }
    
}
