/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap2.aula.pkg3;

/**
 *
 * @author aline.poliveira3
 */
public class Exercicio4 {

    public static int[][] preencherMatriz(int[][] matriz) {
        int[][] matrizPreenchida = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizPreenchida[i][j] = (i + j + 2);
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
    
    public static int somaMatriz(int[][] matriz){
        int soma = 0;
        
        for (int i = 0;i<matriz.length;i++){
            for (int j = 0;j<matriz[i].length;j++){
                if(i>j){
                    soma = soma + matriz[i][j];
                }
            }
        }
        
        return soma;
    }

    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        mat = preencherMatriz(mat);
        
        imprimirMatriz(mat);
        
        System.out.println(somaMatriz(mat));
    }
}
