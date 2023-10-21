import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void removeAccount(Account account) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(account.getAccountNumber())) {
                accounts.remove(acc);
                break;
            }
        }
    }
    
    public Account getAccount(String accountNumber) {
        for (Account acc : this.accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public List<Account> getAllAccounts() {
        return this.accounts;
    }
}
