package ex2;

import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        int candidato;
        int monica = 0; int cebolinha = 0; int cascao = 0; int magali = 0; int branco = 0; int nulo = 0;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o número do candidato: ");
            System.out.println("10 - Monica: ");
            System.out.println("20 - Cebolinha");
            System.out.println("30 - Cascao");
            System.out.println("40 - Magali");
            System.out.println("0 - Branco");
            System.out.println("1 - Nulo");
            System.out.println("-1 - Sair");
            candidato = input.nextInt();
            switch(candidato){
                case 10: monica++; break;
                case 20: cebolinha++; break;
                case 30: cascao++; break;
                case 40: magali++; break;
                case 0: branco++; break;
                case 1: nulo++; break;
                default: break;
            }
        }while(candidato != -1);
        int[] v = {monica, cebolinha, cascao, magali};
        int maximo = v[0];
        for (int i = 1; i < 4; i++) {
            if (v[i] > maximo) {
                maximo = v[i]; 
            }
        }
        System.out.printf("Resultados: \n Monica = %d \n Cebolinha = %d \n Cascao = %d \n Magali = %d \n Branco = %d \n Nulo = %d \n\n", monica, cebolinha, cascao, magali, branco, nulo);
        if(monica == maximo) System.out.println("Monica foi eleita.");
        else if(cebolinha == maximo) System.out.println("Cebolinha foi eleito.");
        else if(cascao == maximo) System.out.println("Cascao foi eleito.");
        else if(magali == maximo) System.out.println("Magali foi eleita");
        else System.out.println("Empate dos candidatos");

    }   
}

