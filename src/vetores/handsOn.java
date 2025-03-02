package vetores;

import java.util.Scanner;

public class handsOn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] alunos;
        double[] medias;
        double mediaTurma = 0, maiorMedia = 0, menorMedia = 0;


        System.out.println("Quantidade de alunos: ");
        int quantidadeAlunos = scan.nextInt();
        scan.nextLine();

        alunos = new String[quantidadeAlunos];
        medias = new double[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.printf("%d° Aluno:", i + 1);
            alunos[i] = scan.nextLine();
            System.out.print("Média do Aluno: ");
            medias[i] = scan.nextDouble();
            scan.nextLine();
            mediaTurma += medias[i];
        }

        for (int i = 0; i < quantidadeAlunos; i++) {
            if (i == 0) {
                maiorMedia = medias[i];
                maiorMedia = medias[i];
            }
            if (maiorMedia < medias[i]) {
                maiorMedia = medias[i];
            }
            if (menorMedia > medias[i]) {
                menorMedia = medias[i];
            }

            System.out.printf("Média da turma: %.1f\n", mediaTurma / quantidadeAlunos);
            System.out.println("Menor média: \n" + menorMedia);
            System.out.println("Maior média: \n" + maiorMedia);
        }
    }
}
