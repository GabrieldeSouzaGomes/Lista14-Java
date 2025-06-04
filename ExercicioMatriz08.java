//8. Mostrar a soma dos elementos de cada linha de uma matriz 3x3
//Crie uma matriz 3x3 com valores fornecidos pelo usuário. Depois, calcule e mostre a soma dos elementos de cada linha separadamente

package LIsta14;

import java.util.Scanner;

public class ExercicioMatriz08 {

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

        // Soma dos elementos de cada linha
        for (int linha = 0; linha < 3; linha++) {
            int somaLinha = 0;
            for (int coluna = 0; coluna < 3; coluna++) {
                somaLinha += matriz[linha][coluna];
            }
            System.out.println("Soma da linha " + linha + ": " + somaLinha);
        }

        scanner.close();
    }
}
