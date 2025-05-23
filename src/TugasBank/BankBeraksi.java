package TugasBank;

public class BankBeraksi {
    public static void main(String[] args) {
        // Initialize with initial balance of Rp. 100000
        Bank bank = new Bank(100000);

        // Welcome message and display initial balance
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
        System.out.println();

        // Deposit Rp. 500000
        System.out.println("Simpan uang: Rp. 500000");
        bank.simpanUang(500000);
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
        System.out.println();

        // Withdraw Rp. 150000
        System.out.println("Ambil uang: Rp. 150000");
        bank.ambilUang(150000);
        System.out.println("Saldo saat ini: Rp. " + bank.getSaldo());
    }
}