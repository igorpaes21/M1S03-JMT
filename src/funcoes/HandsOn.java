package funcoes;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class HandsOn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


    }

    public static int calculatIdade(Date dataAtual, int anoNascimento) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataAtual);

        return calendar.get(Calendar.YEAR) - anoNascimento;
    }

    public static int calcularIdade(LocalDate dataAtual, int anoNascimento) {
        return dataAtual.getYear() - anoNascimento;
    }
}

