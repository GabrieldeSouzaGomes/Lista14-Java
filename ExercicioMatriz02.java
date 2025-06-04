//2. Preencher automaticamente uma matriz 4x4 com o número 1
//Crie uma matriz 4x4 de inteiros e preencha todas as posições com o número 1. Depois, mostre a matriz formatada na tela.

package LIsta14;

public class ExercicioMatriz02 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        // Preenche a matriz com 1
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                matriz[linha][coluna] = 1;
            }
        }

        System.out.println("Matriz 4x4 preenchida com 1:");

        // Exibe a matriz formatada
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
}
