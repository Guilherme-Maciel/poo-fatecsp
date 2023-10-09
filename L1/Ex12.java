package L1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura = 0;
        double media = 0;
        int qtdPessoas = 0;


        do{
            System.out.print("Digite a altura (metros):\n");
            altura = input.nextDouble();
            if(altura<=0) break;
            System.out.print("Digite o sexo:\n 1 - Homem\n 2 - Mulher\n");
            int sexo = input.nextInt();
            double pesoIdeal = 0;
            media += altura;
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


            qtdPessoas += 1;
        }while(altura!=0);

        media = media / qtdPessoas;
        System.out.printf("Media das alturas: %.2f", media);
    }
    
}
