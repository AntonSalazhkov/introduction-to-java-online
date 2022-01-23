package by.training.java.module_6.task01.user;

import by.training.java.module_6.task01.logic.Submenu;
import org.mindrot.jbcrypt.BCrypt;

import java.util.Scanner;

public class NewAccount extends Account {

    private String LOGIN_PATTERN = "^[a-zA-Z0-9]{2,15}$";
    private String PASSWORD_PATTERN = "(?=.*[a-zA-Z])(?=.*[0-9]).{8,}";
    private String EMAIL_PATTERN = "^.+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})$";

    public NewAccount() {

        boolean correctInput = false;
        Account currentAccount;
        String line;
        readAccount();

        while (!correctInput) {

            System.out.print("Введите имя пользователя: ");
            line = inputUser(LOGIN_PATTERN);
            if (line != null) {
                correctInput = true;

                for (int i = 0; i < getAccounts().size(); i++) {
                    if (line.compareToIgnoreCase(getAccounts().get(i).getUsername()) == 0) {
                        System.out.println("Пользователь с таким именем уже зарегистрирован");
                        correctInput = false;
                    }
                }
                if (correctInput) {
                    super.setUsername(line);
                }
            } else {
                System.out.println("Некорректный ввод. Имя пользователя должно состоять из " +
                        "латинских букв (a-z), цифр(0-9), длинной от 2 - до 15 символов");
            }
        }
        correctInput = false;
        while (!correctInput) {
            System.out.print("Введите пароль: ");
            line = inputUser(PASSWORD_PATTERN);
            if (line != null) {
                super.setPassword(BCrypt.hashpw(line, BCrypt.gensalt()));
                correctInput = true;
            } else {
                System.out.println("Некорректный ввод. Пароль должен состоять из " +
                        "латинских букв (a-z) и цифр(0-9), длинной от 8 символов");
            }
        }
        correctInput = false;
        while (!correctInput) {
            System.out.print("Введите почту: ");
            line = inputUser(EMAIL_PATTERN);
            if (line != null) {
                super.setEmail(line);
                correctInput = true;
            } else {
                System.out.println("Некорректный ввод.");
            }
        }

        System.out.println(toString());
        saveAccount();

        currentAccount = new Account(getUsername(), getEmail(), getPassword(), getUserStatus());
        Submenu submenu = new Submenu(currentAccount);
    }

    public String inputUser(String pattern) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String imput = sc.nextLine();

        if (imput.matches(pattern)) {
            return imput;
        } else {
            return null;
        }
    }
}
