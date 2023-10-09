package L1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nota 1: ");
        float n1 = input.nextFloat();
        System.out.println("Nota 2: ");
        float n2 = input.nextFloat();
        float media = (n1+n2)/2;
        if(media >= 7){
            System.out.println("APROVADO");
        }else if(media < 4){
            System.out.println("REPROVADO");
        }else{
            System.out.println("EXAME");
        }

    }
}
