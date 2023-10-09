package L1;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o capital investido:");
        float c = input.nextFloat();
        System.out.println("Digite a taxa de juros");
        float j = input.nextFloat();
        for(int i=1;i<=12;i++){
            c += c*j;
            System.out.printf("Mes %d = %.2f\n", i, c);
        }
    }
    
}
