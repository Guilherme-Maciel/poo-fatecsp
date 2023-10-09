package ex1;
public class Atv1{
    public static void main(String[] args) {
        GetArea(4, 8);
        GetArea(4);
    }

    public static void GetArea(float h){
        System.out.printf("Area Quadrado: %.2f\n", h*h);
    }

    public static void GetArea(float h, float w){
        System.out.printf("Area Retângulo: %.2f\n", h*w);
    }
}