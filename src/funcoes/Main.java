package funcoes;

import java.util.Scanner;

public class Main {
    private static String[][] vars;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número desejado: ");
        int valor = scan.nextInt();

        //Invocando a função
        System.out.println(numeroPar(valor) ? "O número é Par!" : "O número é Impar!");

        String[] nomes = {"Igor", "Angra", "Lara"};

        exibirVetor(nomes);

        String[][] produtos = {
                {"Bcicleta", "Pino"},
                {"Flauta", "Computador"}
        };
        exibirMatriz(produtos);

    }

    public static boolean numeroPar(int numero) {return numero % 2 == 0;}
    public static void exibirVetor(String[] vars) {
        for (String var : vars) {System.out.println(var);}
    }public static void exibirMatriz(String[][] vars) {
        for (String[] var : vars){
            for (String value : var){System.out.print(value + "\t");
            }
        }
    }
}
