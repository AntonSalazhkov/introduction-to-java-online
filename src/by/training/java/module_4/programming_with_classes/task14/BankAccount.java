package by.training.java.module_4.programming_with_classes.task14;

public class BankAccount {

    private int accountNumber;
    private String clientSurname;
    private double accountBalance;
    private String accountStatus;
    // номер акаунда, фамилия клиента, баланс счета, статус счета

    public BankAccount(int accountNumber, String clientSurname, int accountBalance, String accountStatus) {
        this.setAccountNumber(accountNumber);
        this.setClientSurname(clientSurname);
        this.setAccountBalance(accountBalance);
        this.setAccountStatus(accountStatus);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}