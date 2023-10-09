package ex2;

public class ContaCorrente {
    private int numberAccount;
    private String owner;
    private double balance = 0;

    public ContaCorrente(int numberAccount, String owner, double balance) {
        if(balance<0){
            System.out.println("Saldo do titular não pode começar negativo");
            return;
        }
        this.numberAccount = numberAccount;
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double deposit){
        this.balance += deposit;
    }
    public void withdraw(double amount){
        if(this.balance >= amount)
            this.balance -= amount;
        else
            System.out.println("Saldo insuficiente.");
    }
    public void showInfo(){
        System.out.println("------------------");
        System.out.printf("Numero Conta: %d\n", this.numberAccount);
        System.out.printf("Titular: %s\n", this.owner);
        System.out.printf("Saldo: %.2f\n", this.balance);
        System.out.println("------------------");

    }    
}
