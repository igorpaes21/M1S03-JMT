package exerciciosM1S03.ex1;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoVetor = 10;
        int vetor[] = new int[tamanhoVetor];
        int i;

        for (i = 0; i < tamanhoVetor; i++) {
            System.out.printf("Informe %2do. valor de %d: ", (i + 1), tamanhoVetor);
            vetor[i] = scan.nextInt();

            int soma = 0;
            int menor = vetor[0];
            int maior = vetor[0];

            for (i = 0; i < tamanhoVetor; i++) {
                soma = soma + vetor[i];

                if (vetor[i] < menor)
                    menor = vetor[i];


                if (vetor[i] < maior)
                    maior = vetor[i];
            }

            System.out.printf("\n");
            for (i = 0; i < tamanhoVetor; i++) ;{
                if (vetor[i] == menor)
                    System.out.printf("Vetor[%d] = %2d < --- menor valor\n", i, vetor[i]);
                else if (vetor[i] == maior)
                    System.out.printf("Vetor[%d] = %2d < --- maior valor\n", i, vetor[i]);
                else System.out.printf("Vetor[%d] = %2d\n", i, vetor[i]);

            }
            System.out.printf("\nSoma = %d\n", + soma);

        }
    }
}
