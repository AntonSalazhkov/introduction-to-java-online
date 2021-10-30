package by.training.java.module_4.programming_with_classes.task08;

import java.math.BigInteger;

public class Customer {

    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private BigInteger creditCardNumber;
    private long bankAccountNumber;
    //id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

    public Customer(int firstParameter, String secondParameter, String thirdParameter,
                    String fourthParameter, String fifthParameter, BigInteger sixthParameter, long seventhParameter) {
        setId(firstParameter);
        setSurname(secondParameter);
        setName(thirdParameter);
        setPatronymic(fourthParameter);
        setAddress(fifthParameter);
        setCreditCardNumber(sixthParameter);
        setBankAccountNumber(seventhParameter);
    }

    public static void toString(Customer[] customer) {
        for (int i = 0; i < customer.length; i++) {
            System.out.println(customer[i].getString());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigInteger getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(BigInteger creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getString() {
        return "Id: " + getId() + ", surname: " + getSurname() + ", name: " + getName() + ", patronymic: "
                + getPatronymic() + ", address: " + getAddress() + ", credit card number: " + getCreditCardNumber()
                + ", bank account number: " + getBankAccountNumber();
    }
}
