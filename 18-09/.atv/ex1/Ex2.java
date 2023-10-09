public class Ex2 {
    public static void main(String[] args) {
        int estante[][] = {
            {2,6,1},
            {4,2,2},
            {2,2,2},
            {8,8,6}
        };
        int soma = 0;
        for(int i=0; i<estante.length;i++){
            for(int j=0;j<estante[i].length;j++){
                soma += estante[i][j];
            }
            System.out.printf("Prateleira %d: %d\n", i+1, soma);
            soma = 0;
        }
    }
    
}
