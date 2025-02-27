package matrizes;

public class Main {
    public static void main(String[] args) {
        int [][] valores = new int[2][3];

        //Declarar e Inicializar uma matriz
        String[][] matriz = {
                {"A", "B", "C"},
                {"D", "E","F"},
                {"G","H","I"}
        };
        String[][] letras = matriz;


        System.out.println("Quantidade de linhas:" + valores.length);
        System.out.println("Quantidade de colunas: " + valores[0].length);

        valores [1][1] = 10;

        System.out.println(valores[1][1]);

        //iterar a nossa matriz

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++){
                System.out.println(matriz[linha][coluna] + "\t\t");
            }
            System.out.println(matriz);
            System.out.println(linha);
        }


    }
}
