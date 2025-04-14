package ch_08_class_ex.ex10;

public class Account {

    private int balance;

    final int MIN_BALLANCE = 0;
    final int MAX_BALLANCE = 1000000;

    public Account(){}

    public Account (int balance){
        this.balance = balance;
    }

    public void setBalance(int balance) {
        if (balance >= MIN_BALLANCE && balance <= MAX_BALLANCE) {
            this.balance += balance;
        }
    }
    public int getBalance(){
        return balance;
    }
}
