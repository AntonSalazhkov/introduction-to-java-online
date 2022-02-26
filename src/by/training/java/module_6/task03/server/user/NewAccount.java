package by.training.java.module_6.task03.server.user;

import org.mindrot.jbcrypt.BCrypt;

public class NewAccount extends Account {

    private String LOGIN_PATTERN = "^[a-zA-Z0-9]{2,15}$";
    private String PASSWORD_PATTERN = "(?=.*[a-zA-Z])(?=.*[0-9]).{8,}";
    private Account currentAccount;
    private String line;

    public NewAccount() {
        readAccount();
    }

    public boolean enterUserName(String imput) {
        boolean correctInput = false;

        line = inputUser(LOGIN_PATTERN, imput);
        if (line != null) {
            correctInput = true;

            for (int i = 0; i < getAccounts().size(); i++) {
                // проверяем наличие пользователя с таким же именем
                if (line.compareToIgnoreCase(getAccounts().get(i).getUsername()) == 0) {
                    correctInput = false;
                }
            }
            if (correctInput) {
                super.setUsername(line);
            }
        }
        return correctInput;
    }

    public boolean enterPassword(String imput) {
        boolean correctInput = false;

        line = inputUser(PASSWORD_PATTERN, imput);
        if (line != null) {
            super.setPassword(BCrypt.hashpw(line, BCrypt.gensalt()));
            correctInput = true;
        }

        if (getUsername().compareToIgnoreCase("administrator") == 0) {
            setUserStatus("administrator");
        } else {
            setUserStatus("user");
        }
        setCurrentAccount(new Account(getUsername(), getPassword(), getUserStatus()));
        return correctInput;
    }

    public Account getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(Account currentAccount) {
        this.currentAccount = currentAccount;
    }

    public String inputUser(String pattern, String imput) {

        if (imput.matches(pattern)) {
            return imput;
        } else {
            return null;
        }
    }
}
