/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap2.aula.pkg3;

import java.util.Scanner;

/**
 *
 * @author aline.poliveira3
 */
public class Exercicio5 {

    public static String[] preencherLista(String[] lista) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        String[] listaPreenchida = new String[lista.length];

        for (int i = 0; i < lista.length; i++) {
            listaPreenchida[i] = lista[i];
            if (lista[i] == null) {
                System.out.print("Nome: ");
                listaPreenchida[i] = leitor.nextLine();
                break;
            }
        }
        return listaPreenchida;
    }
    
    

    public static void main(String[] args) {
        String[] listaNomes = new String[4];
        
        
        
        listaNomes = preencherLista(listaNomes);
        
    }
}
