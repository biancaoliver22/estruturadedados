/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author biancaoliveira
 */
import java.util.Scanner;

public class atv2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int[] vetorPar;
        int[] vetorImpar;

        int qtdPares = 0; 
        int qtdImpares = 0; 
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        for (int num : numeros) {
            if (num % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
        }
        vetorPar = new int[qtdPares];
        vetorImpar = new int[qtdImpares];
        int indicePar = 0;
        int indiceImpar = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                vetorPar[indicePar++] = num;
            } else {
                vetorImpar[indiceImpar++] = num;
            }

        }

        System.out.println("Vetor Original:");
        imprimirVetor(numeros);

    System.out.println("\nVetor de Números Pares:");
        imprimirVetor(vetorPar);

        System.out.println("\nVetor de Números Ímpares:");
        imprimirVetor(vetorImpar);

        scanner.close();
    }
    private static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
