/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author biancaoliveira
 */
public class atv1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = scanner.nextLine();
        }
        System.out.print("Digite um nome a ser buscado: ");
        String nomeBuscado = scanner.nextLine();

        // Verifica se o nome está no vetor
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equals(nomeBuscado)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
            scanner.close();
    }
}

