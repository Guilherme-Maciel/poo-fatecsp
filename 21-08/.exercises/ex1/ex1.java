package ex1;

import java.util.Scanner;

public class ex1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o dia de seu nascimento: ");
        int dia = input.nextInt();
        System.out.println("Digite o mês de seu nascimento: ");
        int mes = input.nextInt();
        System.out.println("Digite o ano de seu nascimento: ");
        int ano = input.nextInt();
        int diaMes = (dia * 100) + mes;
        int somaAno = diaMes + ano;
        int milhar = somaAno / 100;
        int dezena = somaAno - (milhar*100);
        int somaMilharDezena = milhar + dezena;
        int perfil = somaMilharDezena % 5;
        switch(perfil){
            case 0: System.out.println("Timido"); break;
            case 1: System.out.println("Sonhador"); break;
            case 2: System.out.println("Paquerador"); break;
            case 3: System.out.println("Atraente"); break;
            case 4: System.out.println("Irresistivel"); break;
        }
    }   
}

