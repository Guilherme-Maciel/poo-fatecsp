package ex2;
public class Teste {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(12345, "Guilherme", 1000);
        conta.deposit(100);
        conta.withdraw(1000);
        conta.showInfo();
        conta.withdraw(200);
    }
}
