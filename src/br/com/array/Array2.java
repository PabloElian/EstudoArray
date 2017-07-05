/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.array;

import java.util.Random;

/**
 * Estudo do array - exemplo 2 - Sortei de uma carta
 * @author Pablo Elian
 */
public class Array2 {
    public static void main(String[] args) {
      String[] naipes = {"Espadas" , "Paus" , "Copas" , "Ouros"};
      String [] faces = {"AZ" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9", "10" , "Valete" , "Dama" , "Rei"};
      // a linha cria um objeto chamado sorteio usando como modelo a classe Random
      Random sorteio = new Random();
      // a linha abaixo faz o sortei do índice dos naipes, usando o objetos sortei que atribui o resultado a variável índice_naipes
      // o número 4 gera números aleatórios no intervalo de 0 a 3
     int indice_naipes = sorteio.nextInt(4); 
     // a linha abaixo faz o sortei do índice das faces, usando o objetos sorteio que atribui o resultado a variável índice_faces
     // o .length gera números aleatórios no intervalo do tamanho total do array
     int indice_faces = sorteio.nextInt(faces.length);
     // as linhas abaixo atribuem o resultado do sorteio ao array correspondente
     String face = faces[indice_faces];
     String naipe = naipes[indice_naipes];
     // a linha abaixo exibe a carta sorteada
     System.out.println("Carta: " + face + " de " + naipe);
      
    }
      
}
