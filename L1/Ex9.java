package L1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor 1: ");
        float v1 = input.nextFloat();
        System.out.println("Valor 2: ");
        float v2 = input.nextFloat();
        System.out.println("Valor 3: ");
        float v3 = input.nextFloat();
        float maior = 0;
        if(v1 > v2){
            maior = v1;
        }else{
            maior = v2;
        }

        if(maior < v3){
            maior = v3;
        }

        System.out.println("Maior = "+maior);
    }
}
