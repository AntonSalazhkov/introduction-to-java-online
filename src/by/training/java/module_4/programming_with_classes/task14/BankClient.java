package by.training.java.module_4.programming_with_classes.task14;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BankClient {

    private List<BankAccount> bankAccountList;

    public BankClient(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public double getTotalSum() {
        double sum = 0;
        for (int i = 0; i < bankAccountList.size(); i++) {
            sum += bankAccountList.get(i).getAccountBalance();
        }
        return sum;
    }

    public void getSeparateSum() {
        double negativeSum = 0;
        double positiveSum = 0;
        for (int i = 0; i < bankAccountList.size(); i++) {
            if (bankAccountList.get(i).getAccountBalance() < 0) {
                negativeSum += bankAccountList.get(i).getAccountBalance();
            } else {
                positiveSum += bankAccountList.get(i).getAccountBalance();
            }
        }
        System.out.println("Общая положительная сумма счетов: " + positiveSum);
        System.out.println("Общая отрицательная сумма счетов: " + negativeSum);
    }

    public void findByNumber(String inputString) {
        int outputCounter = 0;
        for (int i = 0; i < bankAccountList.size(); i++) {
            if (inputString.compareTo("" + bankAccountList.get(i).getAccountNumber()) == 0) {
                if (bankAccountList.get(i).getAccountStatus().compareTo("unlocked") == 0) {
                    getSting(i);
                    outputCounter += 1;
                } else {
                    System.out.println("Доступ к счету " + inputString + " закрыт");
                    outputCounter += 1;
                }
            }
        }
        if (outputCounter == 0) {
            System.out.println("Данный счет отсутствует в базе");
        }
    }

    public void getSortAccountNumber() {
        Comparator<BankAccount> comparator = (bankAccount1, bankAccount2)
                -> ("" + bankAccount1.getAccountNumber()).compareTo("" + bankAccount2.getAccountNumber());
        Collections.sort(bankAccountList, comparator);
    }

    public void toSting() {
        for (int i = 0; i < bankAccountList.size(); i++) {
            getSting(i);
        }
    }

    public void getSting(int i) {
        System.out.println("Номер счета: " + bankAccountList.get(i).getAccountNumber() + ", фамилия: "
                + bankAccountList.get(i).getClientSurname() + ", баланс счета: " + bankAccountList.get(i).getAccountBalance()
                + ", доступ: " + bankAccountList.get(i).getAccountStatus());
    }
}