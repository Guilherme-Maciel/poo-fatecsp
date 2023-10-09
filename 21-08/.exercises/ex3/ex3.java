package ex3;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Capital inicial: ");
        float capital = input.nextFloat();
        System.out.println("Taxa de juros (em decimal): ");
        float juros = input.nextFloat();
        for(int i=1; i<=12; i++){
            capital += capital*juros;
            System.out.printf("Mês %d: R$ %.2f\n", i, capital);
        }
        
    }
    
}
