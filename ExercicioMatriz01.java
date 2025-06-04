//1. Criar e exibir uma matriz 3x3 de números inteiros.
//Escreva um programa que declare uma matriz 3x3 de inteiros, preencha com valores fornecidos pelo usuário e exiba a matriz na tela.

package LIsta14;

import java.util.Scanner;

public class ExercicioMatriz01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores para a matriz 3x3:");

        // Preenche a matriz
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz 3x3:");

        // Exibe a matriz
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
