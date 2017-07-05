/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.array;

/**
 * Estudo array - exemplo 6 - Array Multidimensional
 * @author Pablo Elian
 */
public class Array6 {
    public static void main(String[] args) {
    // a linha abaixo cria um array de duas dimensões
    String[][] agenda = {{"Bom dia e companhia","4002-8922","bill@outlook.com"} , {"Linus","0800-9999","linus@tux.com"} , {"Steve","6666-6666","steve@icloud.com"}};
    //recuperando o email do bill
    //System.out.println(agenda[0][2]);          
    //montado a agenda de contatos
    //o primeiro laço percorre as linhas
        for (int i = 0; i < agenda.length; i++) {
            System.out.println("____________________________________________");
            //o segundo laço dentro do primeiro laço, percorre as colunas, montando a agenda
            for (int j = 0; j < agenda[i].length; j++) {
                System.out.println(agenda[i][j]);
            }
            
        }
    }
   
}
