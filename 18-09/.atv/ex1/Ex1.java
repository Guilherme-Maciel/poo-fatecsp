import java.util.Scanner;
public class Ex1{
    public static void main(String[] args) {
        
        double[] numbers = {1,2,3,4,5,6,7,8,9,10,11.9,12.7,13,14,15,16,17,18,19,20};
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double guess = input.nextDouble();
        boolean found = false;
        int position = 0;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] == guess){
                found = true;
                position = i;
            }
        }
        if(found){
            System.out.printf("O número %.2f foi encontrado na posição %d\n", guess, position);
        }
        else{
            System.out.println("Número não encontrado.");
        }
    }
}