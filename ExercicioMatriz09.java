//9. Trocar os valores da primeira linha com a última em uma matriz 3x3
//Permita que o usuário preencha uma matriz 3x3. Troque os valores da primeira linha com a última e exiba a nova matriz.

package LIsta14;

import java.util.Scanner;

public class ExercicioMatriz09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores para a matriz 3x3:");

        // Leitura dos valores da matriz
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        // Trocar a primeira linha (linha 0) com a última linha (linha 2)
        for (int coluna = 0; coluna < 3; coluna++) {
            int temp = matriz[0][coluna];
            matriz[0][coluna] = matriz[2][coluna];
            matriz[2][coluna] = temp;
        }

        System.out.println("Matriz após trocar a primeira linha com a última:");

        // Exibir a matriz após a troca
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
