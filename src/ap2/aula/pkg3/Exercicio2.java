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
public class Exercicio2 {

    public static int[][] preencherMatriz(int[][] matriz) {
        int[][] matrizPreenchida = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizPreenchida[i][j] = (i + j + 1);
            }
        }

        return matrizPreenchida;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] matrizTransposta(int[][] matrizBase) {
        int[][] transposta = new int[matrizBase[0].length][matrizBase.length];

        for (int i = 0; i < matrizBase[0].length; i++) {
            for (int j = 0; j < matrizBase.length; j++) {
                transposta[i][j] = matrizBase[j][i];
            }
        }

        return transposta;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("tamanho da matriz: ");
        int tamanho = leitor.nextInt();
        
        int[][] novaMatriz1 = new int[2][3];
        novaMatriz1 = preencherMatriz(novaMatriz1);
        imprimirMatriz(novaMatriz1);
        
        int[][] matrizTransposta = new int [3][2];
        matrizTransposta = matrizTransposta(novaMatriz1);
        
        imprimirMatriz(matrizTransposta);
    }
}
