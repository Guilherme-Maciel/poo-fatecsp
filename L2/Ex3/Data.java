package L2.Ex3;

import java.util.Arrays;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int d, int m, int a) {
        setData(d, m, a);
    }
    public Data(int m, int a) {
        setData(1, m, a);
    }
    public Data(int a) {
        setData(1, 1, a);
    }
    public void setData(int d, int m, int a){
        int[] meses30 = new int[]{4,6,9,11};
        int[] meses31 = new int[]{1,3,5,7,8,10,12};
        this.ano = a;

        if(m == 2){
            int qtdDias = bissexto() ? 29 : 28;
            if(d<=qtdDias){
                dia = d;
                mes = m;
                return;
            }
        }
        else if(Arrays.binarySearch(meses30, m)>=0){
            if(d<=30){
                dia = d;
                mes = m;
                return;
            }
        }
        else if(Arrays.binarySearch(meses31, m)>=0){
            if(d<=31){
                dia = d;
                mes = m;
                return;
            }
        }
        else{
            System.out.println("Digite um mês válido.");
        }

        System.out.printf("Data inconsistente: %d/%d/%d", d, m, a);
    }

    public boolean bissexto(){
        return ano%4==0 && ano%100!=0;
    }

    
}