package TugasBank;

public class Bank {
    private int saldo;

    // Constructor
    public Bank(int saldo) {
        this.saldo = saldo;
    }

    // Method to save money
    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }

    // Method to withdraw money
    public void ambilUang(int jumlah) {
        saldo -= jumlah;
    }

    // Method to get current balance
    public int getSaldo() {
        return saldo;
    }
}