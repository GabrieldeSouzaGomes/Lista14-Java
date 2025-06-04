//7. Contar quantos números pares existem em uma matriz 4x4
//Permita que o usuário preencha uma matriz 4x4 com números inteiros e, ao final, informe quantos desses números são pares.

package LIsta14;

import java.util.Scanner;

public class ExercicioMatriz07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int contadorPares = 0;

        System.out.println("Digite os valores para a matriz 4x4:");

        // Leitura dos valores e contagem dos pares
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();

                if (matriz[linha][coluna] % 2 == 0) {
                    contadorPares++;
                }
            }
        }

        System.out.println("Quantidade de números pares na matriz: " + contadorPares);

        scanner.close();
    }
}
