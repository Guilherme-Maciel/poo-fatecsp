package L1;

import java.util.Scanner;

public class Es15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Total da sequência: ");
        int total = input.nextInt();
        for(int i = 0; i<total;i++){
            System.out.println("Temperatura Celsius");
            float c = input.nextFloat();
            float f = 32 + c*9/5;
            System.out.println("Temperatura F°: "+f);
        }   
    }
}
