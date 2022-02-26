package by.training.java.module_6.task03.server.logic;

import by.training.java.module_6.task03.server.user.Account;
import by.training.java.module_6.task03.server.user.NewAccount;
import org.mindrot.jbcrypt.BCrypt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Authorization {

    private static BufferedWriter out;    // поток записи в сокет
    private static BufferedReader in;     // поток чтения из сокета
    private Account account = new Account();
    private int numberAccount = 0;
    private Account currentAccount;

    public Authorization(Socket clientSocket) throws IOException {
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

        account.readAccount();
        String number = "";

        do {
            out.write("1. Войти под существующим логином " + "| 2. Регистрация нового пользователя " + "\n");
            out.flush();

            number = in.readLine();

        } while (!number.matches("[12]"));


        if (number.compareTo("1") == 0) {
            out.write("Введите имя пользователя: " + "\n");
            out.flush();

            if (checkUserName(in.readLine())) {
                out.write("Введите пароль: " + "\n");
                out.flush();

                if (checkPassword(in.readLine())) {
                    out.write("showOnce" + "\n");
                    out.flush();
                    out.write(getCurrentAccount().toString() + "\n");
                    out.flush();

                    Menu menu = new Menu(clientSocket, getCurrentAccount());

                } else {
                    out.write("lose" + "\n");
                    out.flush();
                    out.write("end" + "\n");
                    out.flush();
                }
            } else {
                out.write("lose" + "\n");
                out.flush();
                out.write("end" + "\n");
                out.flush();
            }

        } else {
            NewAccount newAccount = new NewAccount();
            out.write("Введите имя пользователя (должно состоять из "
                    + "латинских букв (a-z), цифр(0-9), длинной от 2 - до 15 символов): " + "\n");
            out.flush();

            if (newAccount.enterUserName(in.readLine())) {
                out.write("Введите пароль (должен состоять из " +
                        "латинских букв (a-z) и цифр(0-9), длинной от 8 символов): " + "\n");
                out.flush();
                if (newAccount.enterPassword(in.readLine())) {
                    out.write("showOnce" + "\n");
                    out.flush();
                    out.write(newAccount.getCurrentAccount().toString() + "\n");
                    out.flush();
                    setCurrentAccount(newAccount.getCurrentAccount());

                    newAccount.saveAccount();

                    Menu menu = new Menu(clientSocket, getCurrentAccount());

                } else {
                    out.write("lose" + "\n");
                    out.flush();
                    out.write("end" + "\n");
                    out.flush();
                }
            } else {
                out.write("lose" + "\n");
                out.flush();
                out.write("end" + "\n");
                out.flush();
            }
        }
        // потоки хорошо бы закрыть
        in.close();
        out.close();
    }

    public boolean checkUserName(String line) {
        boolean correctInput = false;

        for (int i = 0; i < account.getAccounts().size(); i++) {
            if (line.compareToIgnoreCase(account.getAccounts().get(i).getUsername()) == 0) {
                correctInput = true;
                numberAccount = i;
            }
        }
        return correctInput;
    }

    public boolean checkPassword(String line) {
        boolean correctInput = false;

        if (BCrypt.checkpw(line, account.getAccounts().get(numberAccount).getPassword())) {

            setCurrentAccount(account.getAccounts().get(numberAccount));
            correctInput = true;
        }
        return correctInput;
    }

    public Account getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(Account currentAccount) {
        this.currentAccount = currentAccount;
    }
}
