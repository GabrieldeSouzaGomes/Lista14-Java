//5. Exibir os elementos da diagonal secundária de uma matriz 3x3
//Similar ao exercício anterior, mas agora mostre os valores da diagonal secundária.

package LIsta14;

import java.util.Scanner;

public class ExercicioMatriz05 {

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

        System.out.println("Elementos da diagonal secundária:");

        // Exibição dos elementos da diagonal secundária
        // A diagonal secundária vai de [0][2], [1][1], [2][0]
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][2 - i]);
        }

        scanner.close();
    }
}
