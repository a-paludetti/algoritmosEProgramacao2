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
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static int[][] preencherMatriz(int[][] matriz) {
        int[][] matrizPreenchida = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizPreenchida[i][j] = (i + j);
            }
        }

        return matrizPreenchida;
    }

    public static int[][] somaMatriz(int[][] matriz1, int[][] matriz2) {
        int[][] somaMatriz = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < somaMatriz.length; i++) {
            for (int j = 0; j < somaMatriz[i].length; j++) {
                somaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return somaMatriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("tamanho da matriz: ");
        int tamanho = leitor.nextInt();

        int[][] novaMatriz1 = new int[tamanho][tamanho];
        novaMatriz1 = preencherMatriz(novaMatriz1);

        int[][] novaMatriz2 = new int[tamanho][tamanho];
        novaMatriz2 = preencherMatriz(novaMatriz2);

        int[][] matrizSoma = somaMatriz(novaMatriz1, novaMatriz2);

        imprimirMatriz(matrizSoma);
    }

}
