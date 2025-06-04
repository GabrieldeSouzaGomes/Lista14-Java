//10. Verificar se uma matriz 3x3 é simétrica
//Leia uma matriz 3x3 e verifique se ela é simétrica, ou seja, se o valor na posição [i][j] é igual ao valor na posição [j][i].

package LIsta14;

import java.util.Scanner;

public class ExercicioMatriz10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores para a matriz 3x3:");

        // Leitura dos valores da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean simetrica = true;

        // Verifica se a matriz é simétrica
        for (int i = 0; i < 3 && simetrica; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }

        scanner.close();
    }
}
