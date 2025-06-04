//4. Mostrar os elementos da diagonal principal de uma matriz 3x3

//Crie uma matriz 3x3 com valores inseridos pelo usuário. Depois, mostre apenas os elementos da diagonal principal.

package LIsta14;

import java.util.Scanner;

public class ExercicioMatriz04 {

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

        System.out.println("Elementos da diagonal principal:");

        // Exibição dos elementos da diagonal principal
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][i]);
        }

        scanner.close();
    }
}
