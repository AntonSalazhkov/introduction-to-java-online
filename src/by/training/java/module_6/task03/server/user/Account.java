package by.training.java.module_6.task03.server.user;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Account {

    private String username;
    private String password;
    private String userStatus;    // administrator or user
    private ArrayList<Account> accounts = new ArrayList<>();
    private String directoryAccounts = "src\\by\\training\\java\\module_6\\task03\\server\\user\\Accounts.txt";

    public Account() {
    }

    public Account(String username, String password, String userStatus) {
        this.username = username;
        this.password = password;
        this.userStatus = userStatus;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Account accounts) {
        this.accounts.add(accounts);
    }

    public String getDirectoryAccounts() {
        return directoryAccounts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "Вы вошли под логином: " + getUsername() + ", ваш статус: " + getUserStatus();
    }

    public void saveAccount() {
        if (getUsername() != null) {
            try (FileWriter fw = new FileWriter(directoryAccounts, true)) {
                fw.write(getUsername() + "!*#" + getPassword() + "!*#" + getUserStatus()
                        + System.getProperty("line.separator"));         // !*#  - разделитель для StringTokenizer
                fw.flush();

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void readAccount() {

        try (FileReader fr = new FileReader(getDirectoryAccounts())) {
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {
                StringTokenizer st = new StringTokenizer(scan.nextLine(), "!*#"); // !*#  - разделитель для StringTokenizer
                // добавляем сохраненные аккаунты из файла в ArrayList
                setAccounts(new Account(st.nextToken(), st.nextToken(), st.nextToken()));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
