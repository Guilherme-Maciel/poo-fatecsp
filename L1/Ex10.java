package L1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int[] meses30 = new int[]{4,6,9,11};
        int[] meses31 = new int[]{1,3,5,7,8,10,12};
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int ano = input.nextInt();
        System.out.println("Digite o mês: ");
        int mes = input.nextInt();
        System.out.println("Digite o dia: ");
        int dia = input.nextInt();
        boolean bissexto = ano%4==0 && ano%100!=0;

        if(mes == 2){
            int qtdDias = bissexto ? 29 : 28;
            if(dia<=qtdDias){
                System.out.printf("Data consistente: %d/%d/%d", dia, mes, ano);
                return;
            }
        }
        else if(Arrays.binarySearch(meses30, mes)>=0){
            if(dia<=30){
                System.out.printf("Data consistente: %d/%d/%d", dia, mes, ano);
                return;
            }
        }
        else if(Arrays.binarySearch(meses31, mes)>=0){
            if(dia<=31){
                System.out.printf("Data consistente: %d/%d/%d", dia, mes, ano);
                return;
            }
        }
        else{
            System.out.println("Digite um mês válido.");
        }

        System.out.printf("Data inconsistente: %d/%d/%d", dia, mes, ano);
    }
    
}
