package L2.Ex2;

public class Acumulador {
    private float soma = 0;
    private int contagem = 0;

    public void totalize(float valor){
        soma += valor;
        contagem++;
    }

    public void informeTotal(){
        System.out.println("Total: "+soma);
    }

    public void informeContagem(){
        System.out.println("Contagem: "+contagem);
    }

    public void fornecaMedia(){
        System.out.println("Média: "+(soma/contagem));
    }
}
