package L1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] lista = new int[3];

        for(int i=0;i<3;i++){
            System.out.printf("Digite o %d° número:", i+1);
            lista[i]=input.nextInt();
        }
        ordenar(lista);

        for(int i=0;i<3;i++){
            System.out.printf("%d ", lista[i]);
        }
    }

    public static void ordenar(int[] v) {
        for(int i = 0; i < v.length - 1; i++) {
          for(int j = 0; j < v.length - 1 - i; j++) {
            if(v[j] > v[j + 1]) {
              int aux = v[j];
              v[j] = v[j + 1];
              v[j + 1] = aux;
            }
          }
        }
    }
    
}
