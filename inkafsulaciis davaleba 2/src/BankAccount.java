public class BankAccount {
    private final String accountNumber;
    private String password;
    private double balance;
    private String[] history = new String[100];
    private int index = 0;

    boolean accountLock;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (accountLock) {
            if (amount > 0 && amount <= 10_000) {
                this.balance += amount;
                historyFull();
                history[index] = "Deposit: " + amount;
                index++;
            } else {
                System.out.println("პრობლემური თანხა!");
            }
        } else {
            System.out.println("ანგარიში დაბლოკილია.");
        }

    }

    public void withdraw(double amount, String password) {
        if(accountLock) {
            if (this.password.equals(password)) {
                if (amount > 0 && amount <= balance) {
                    this.balance -= amount;
                    historyFull();
                    history[index] = "Withdraw: " + amount;
                    index++;
                } else {
                    System.out.println("არასწორი თანხა!");
                }
            } else {
                System.out.println("არასწორი პასვორდი!");
            }
        } else {
            System.out.println("ანგარიში დაბლოკილია.");
        }
    }

    private void historyFull() {
        if(history.length == index) {
            String[] history1 = new String[history.length + 100];

            for(int i = 0; i < history.length; i++) {
                history1[i] = history[i];
            }
            history = history1;
        }
    }

    public void printHistory() {
        for(int i = 0; i < history.length; i++) {
            System.out.println(history[i]);
        }
    }

    public void transferMoney(BankAccount B, double amount) {
        if (accountLock) {
            if(amount <= 1_000) {
                balance -= amount;
                B.balance += amount;
                historyFull();
                history[index] = "Transfer to : " + B.accountNumber + amount;
                index++;
            }
        } else {
            System.out.println("ანგარიში დაბლოკილია.");
        }

    }

    private void lock() {
        accountLock = false;
    }

    private void unlock() {
        accountLock = true;
    }

    public double depositCalculator(double amount, int months) {
        while(months >= 0) {
            amount += amount * 0.01;
            months--;
        }
        return amount;
    }
}
