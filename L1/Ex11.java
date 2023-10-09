package L1;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o sexo:\n 1 - Homem\n 2- Mulher\n");
        int sexo = input.nextInt();
        System.out.print("Digite a altura (metros):\n");
        double altura = input.nextDouble();
        double pesoIdeal = 0;

        switch (sexo) {
            case 1:
                pesoIdeal = 72.7*altura-58;
                break;
            case 2:
                pesoIdeal = 62.1*altura-44.7;
                break;
        
            default:
                System.out.println("Sexo inválido.");
                return;
        }
        System.out.printf("Peso ideal: %.2f\n", pesoIdeal);
    }
}
