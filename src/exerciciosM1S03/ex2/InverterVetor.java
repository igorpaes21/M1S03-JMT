package exerciciosM1S03.ex2;

public class InverterVetor {
    public static void main(String[] args) {

        int[] vetor_original = { 1, 2, 3, 4, 5 };
        int tamanhoVetorOriginal = vetor_original.length;
        int[] vetor_copia = new int[tamanhoVetorOriginal];
        int tamanhoVetorOriginalZeroBased = tamanhoVetorOriginal - 1;

        for(int i = 0; i < tamanhoVetorOriginal; i++) {
            vetor_copia[i] = vetor_original[tamanhoVetorOriginalZeroBased - i];
            System.out.print(vetor_copia[i]);
        }
    }
}
