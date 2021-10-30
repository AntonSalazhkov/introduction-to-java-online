package by.training.java.module_4.programming_with_classes.task08;

import java.math.BigInteger;

public class Shop {

    public static void sortAlphabetically(Customer[] customer) {
        boolean cycle = false;
        while (!cycle) {      // Сортировка по фамилии
            cycle = true;
            for (int i = 0; i < customer.length - 1; i++) {
                if (customer[i].getSurname().compareTo(customer[i + 1].getSurname()) > 0) {
                    getSort(customer, i);
                    cycle = false;
                }
            }
        }
        cycle = false;
        while (!cycle) {     // Сортировка по имени, если фамилии одинаковые
            cycle = true;
            for (int i = 0; i < customer.length - 1; i++) {
                if (customer[i].getSurname().compareTo(customer[i + 1].getSurname()) == 0 &&
                        customer[i].getName().compareTo(customer[i + 1].getName()) > 0) {
                    getSort(customer, i);
                    cycle = false;
                }
            }
        }
        Customer.toString(customer);
    }

    public static Customer[] getSort(Customer[] customer, int i) {
        Customer currentCustomer = customer[i];
        customer[i] = customer[i + 1];
        customer[i + 1] = currentCustomer;
        return customer;
    }

    public static void sortByInterval(Customer[] customer, BigInteger startInterval, BigInteger endInterval) {
        int outputCounter = 0;
        for (int i = 0; i < customer.length; i++) {
            if (startInterval.compareTo(customer[i].getCreditCardNumber()) <= 0 && endInterval.compareTo(customer[i].getCreditCardNumber()) >= 0
                    || startInterval.compareTo(customer[i].getCreditCardNumber()) >= 0 && endInterval.compareTo(customer[i].getCreditCardNumber()) <= 0) {

                System.out.println(customer[i].getString());
                outputCounter += 1;
            }
        }
        if (outputCounter == 0) {
            System.out.println("В заданном интервале нет подходящих покупателей");
        }
    }
}

