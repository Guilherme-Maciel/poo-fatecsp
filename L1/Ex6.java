package L1;

import java.util.Scanner;

public class Ex6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o consumo de energia (Wh):");
        double consumo = input.nextDouble();
        double taxa = 0;
        double[] taxaCons = new double[]{
            0.20,
            0.25,
            0.25,
            0.35
        };
        int i = -1;
        while(consumo>0){
            if(i==-1){
                taxa += 10;
            }else{
                if(consumo-50>=0){
                    taxa += 50*taxaCons[i];
                }
                else{
                    taxa+=consumo*taxaCons[i];
                }
            }
            consumo -= 50;
            i = i+1>3 ? 3 : i+1;
        }
        System.out.println("Total a pagar: " + taxa);
    }
}