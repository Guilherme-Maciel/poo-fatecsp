package L1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o capital inicial: ");
        double c = input.nextDouble();
        System.out.println("Digite a taxa de juros: ");
        double j = input.nextDouble();
        int t = 0;
        double m = c;
        while(m < c*2){
            m += m*j;
            t++;
        }
        System.out.printf("Tempo para dobrar: %d meses ou %.2f anos", t, ((double)t/12));


    }
    
}
