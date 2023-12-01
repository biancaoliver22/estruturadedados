/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author biancaoliveira
 */
public class atv3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Informe o número de linhas da matriz A: ");
        int linhasA = scanner.nextInt();
        System.out.print("Informe o número de colunas da matriz A: ");
        int colunasA = scanner.nextInt();

        System.out.print("Informe o número de linhas da matriz B: ");
        int linhasB = scanner.nextInt();
        System.out.print("Informe o número de colunas da matriz B: ");
        int colunasB = scanner.nextInt();

        
        if (colunasA != linhasB) {
            System.out.println("Erro: As matrizes não são compatíveis para multiplicação.");
            scanner.close();
            return;
        }

        
        int[][] matrizA = lerMatriz("A", linhasA, colunasA, scanner);

       
        int[][] matrizB = lerMatriz("B", linhasB, colunasB, scanner);

        
        int[][] matrizC = multiplicarMatrizes(matrizA, matrizB);

        
        System.out.println("Matriz resultante C (A x B):");
        imprimirMatriz(matrizC);

        scanner.close();
    }

    
    private static int[][] lerMatriz(String nomeMatriz, int linhas, int colunas, Scanner scanner) {
        System.out.println("Digite os elementos da matriz " + nomeMatriz + ":");
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(nomeMatriz + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

   
    private static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int colunasB = matrizB[0].length;

        int[][] matrizC = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return matrizC;
    }

    
    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
