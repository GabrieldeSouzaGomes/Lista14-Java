//3. Ler uma matriz 2x2 e exibir a soma de todos os elementos
//Permita ao usuário inserir os valores de uma matriz 2x2. Em seguida, calcule e exiba a soma de todos os elementos.

package LIsta14;

import java.util.Scanner;

public class ExercicioMatriz03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int soma = 0;

        System.out.println("Digite os valores para a matriz 2x2:");

        // Leitura dos valores e cálculo da soma
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
                soma += matriz[linha][coluna];
            }
        }

        System.out.println("A soma de todos os elementos da matriz é: " + soma);

        scanner.close();
    }
}
