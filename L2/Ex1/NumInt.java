package L2.Ex1;

public class NumInt {
    private int num;
    public NumInt(int num) {
        this.num = num;
    }
    public boolean isPar(){
        return num % 2 == 0;
    }

    public boolean isPrimo(){
        int divisores = 0;
        for(int i=1; i<=num;i++){
            if(num%i==0){
                divisores++;
            }
        }
        return divisores == 2;
    }

    public int fatorial(){
        int f = 1;
        if(num == 0){
            return 1;
        }
        for(int i=num;i>0;i--){
            f *= i;
        }
        return f;
    }
    
}
