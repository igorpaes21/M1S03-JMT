package matrizes;

public class Main {
    public static void main(String[] args) {
        int [][] valores = new int[2][3];

        System.out.println("Quantidade de linhas:" + valores.length);
        System.out.println("Quantidade de colunas: " + valores[0].length);

        valores [1][1] = 10;

        System.out.println(valores[1][1]);


    }
}
