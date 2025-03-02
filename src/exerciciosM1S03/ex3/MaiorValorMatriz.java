package exerciciosM1S03.ex3;

public class MaiorValorMatriz {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int soma = 0;

        for( int linha = 0; linha < matriz.length; linha++) {
            for( int coluna = 0; coluna < matriz[linha].length; coluna++) {

                matriz[linha][coluna] = linha * coluna;
            }
        }

        for( int linha = 0; linha < matriz.length; linha++) {
            for( int coluna = 0; coluna < matriz[linha].length; coluna++) {
                soma += matriz[linha][coluna];
            }
        }

        System.out.println(soma);
    }
}
