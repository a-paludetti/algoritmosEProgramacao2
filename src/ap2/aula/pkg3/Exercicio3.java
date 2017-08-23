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
public class Exercicio3 {

    public static int[][] preencherMatriz(int[][] matriz) {
        int[][] matrizPreenchida = new int[2][3];
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
    
    public static int somaElementosMatriz(int[][] matriz){
        int soma =0;
        for (int i = 0;i<matriz.length;i++){
            for (int j = 0; j<matriz[i].length;j++){
                soma = soma + matriz[i][j];
            }
        }
        
        return soma;
    }

    public static void main(String[] args) {
        int[][] novaMatriz1 = new int[2][3];
        novaMatriz1 = preencherMatriz(novaMatriz1);
        imprimirMatriz(novaMatriz1);
        
        System.out.println(somaElementosMatriz(novaMatriz1));
    }

}
