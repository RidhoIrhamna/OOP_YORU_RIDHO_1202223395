public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("Ridho_SI4603", "1202223395");
        Account account2 = new Account("Satriani", "1202200778");
        Account account3 = new Account("John_Wick", "1202200779");

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Memasukkan nominal saldo akun
        account1.deposit(50000);
        account2.deposit(10000);
        account3.deposit(75000);

        // Menampilkan saldo tiap akun
        System.out.println("");
        for (Account acc : bank.getAllAccounts()) {
            System.out.println("Saldo akun " + acc.getName() + ": " + acc.getBalance() );
        }

        account2.deposit(50000);
        System.out.println("\nSaldo akun " + account2.getName() + " setelah menyetor: " + account2.getBalance() );
        account3.withdraw(25000);
        System.out.println("Saldo akun " + account3.getName() + " setelah menyetor: " + account3.getBalance()  );
        
        // Inisialisasi remove account
        System.out.println("");
        for (Account acc : bank.getAllAccounts()) {
            if (acc.getName().equals("John_Wick")) {
                bank.removeAccount(acc);
                System.out.println("Akun " + acc.getName() + " berhasil dihapus!! \n");
                break;
            }
        }
        System.out.println("Daftar Semua akun dalam bank: ");
        for (Account acc : bank.getAllAccounts()) {
            System.out.println("Nama: " + acc.getName() + ", Nomor akun: " + acc.getAccountNumber() + ", Saldo: " + acc.getBalance());
        }
    }
}
