package exerciciosM1S03.ex4;

public class CalcularMediaVetor {
    public static void main(String[] args) {
    }

    private static float calculaMediaVetor(int[] vetor, int tamanho) {
        float soma = 0;
        for (int i = 0; i < tamanho;i++){
            soma += vetor[i];
    }
        return soma / tamanho;
}

    public void main() {
}
}
