// Hierarchical Inheritance: Bank Account Types
class BankAccount {
    String accountNumber;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interestRate;
    void displayAccountType() {
        System.out.println("Savings Account with Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    void displayAccountType() {
        System.out.println("Checking Account with Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int term;
    void displayAccountType() {
        System.out.println("Fixed Deposit Account for Term: " + term + " years");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.interestRate = 5.5;
        sa.displayAccountType();
    }
}
