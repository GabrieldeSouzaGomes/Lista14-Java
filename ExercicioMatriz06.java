//6. Criar uma matriz 3x3 e mostrar o maior valor
//Peça para o usuário preencher uma matriz 3x3. Depois, encontre e exiba o maior valor contido nela.

package LIsta14;

import java.util.Scanner;

public class ExercicioMatriz06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível

        System.out.println("Digite os valores para a matriz 3x3:");

        // Preenche a matriz e verifica o maior valor
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();

                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }
            }
        }

        System.out.println("O maior valor da matriz é: " + maior);

        scanner.close();
    }
}
