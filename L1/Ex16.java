package L1;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite x1: ");
        float x1 = input.nextFloat();
        System.out.println("Digite y1: ");
        float y1 = input.nextFloat();
        System.out.println("Digite x2: ");
        float x2 = input.nextFloat();
        System.out.println("Digite y2: ");
        float y2 = input.nextFloat();
        float base = x2-x1;
        float altura = y1-y2;
        System.out.printf("Altura: %.2f\n",altura);
        System.out.printf("Base: %.2f\n",base);
        System.out.printf("Area: %.2f\n",(base*altura));

        int[][] pontos = new int[][]{
            {1,0},
            {2,1},
            {3,4},
            {12,7}
        };

        for(int i=0;i<pontos.length;i++){
            boolean eixoX = (pontos[i][0] >= x1 && pontos[i][0] <= x2);
            boolean eixoY = (pontos[i][1] <= y1 && pontos[i][1] >= y2);
            if( eixoX && eixoY){
                System.out.printf("Ponto (%d,%d) está no interior.\n", pontos[i][0], pontos[i][1]);
            }
        }
    }
}
