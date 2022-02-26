package by.training.java.module_6.task03.server.logic;

import by.training.java.module_6.task03.server.content.Archive;
import by.training.java.module_6.task03.server.user.Account;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Menu {

    private static BufferedWriter out;    // поток записи в сокет
    private static BufferedReader in;     // поток чтения из сокета

    public Menu(Socket clientSocket, Account account) throws IOException {
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        String number;
        Archive archive = new Archive();


        if (account.getUserStatus().compareTo("administrator") == 0) {
            do {
                out.write("1. Просмотр дела " + "| 2. Внести изменение в дело " + "| 3. Создать новое дело "
                        + "| 0. Окончание работы программы." + "\n");
                out.flush();

                number = in.readLine();

                switch (number) {
                    case "1":
                        viewing(archive);
                        break;
                    case "2":
                        out.write("Выберите номер дела " + "\n");
                        out.flush();

                        String userChoiceNumber = in.readLine();

                        int numberDeal = archive.choiceDeal(userChoiceNumber);

                        if (numberDeal != 0) {
                            out.write("1. Изменить имя " + "| 2. Изменить фамилию " + "| 3. Изменить место жительства "
                                    + "| 4. Изменить дату рождения " + "| 0. Окончание работы программы." + "\n");
                            out.flush();

                            String userChoice = in.readLine();

                            out.write("Введите новое значение (дата рождения должна быть в формате ДД:ММ:ГГГГ) " + "\n");
                            out.flush();

                            String newValue = in.readLine();

                            out.write("showOnce" + "\n");      // для только вывода одного сообщения
                            out.flush();
                            // выбор пункта меню, номер дела, новое значение
                            out.write(archive.changeDeal(userChoice, numberDeal, newValue) + "\n");
                            out.flush();

                        } else {
                            out.write("lose" + "\n");
                            out.flush();
                            out.write("\n");
                        }
                        break;
                    case "3":
                        out.write("Введите имя " + "\n");
                        out.flush();

                        String newFirstName = in.readLine();

                        out.write("Введите фамилию " + "\n");
                        out.flush();

                        String newLastName = in.readLine();

                        out.write("Введите место жительства " + "\n");
                        out.flush();

                        String newPlaceOfResidence = in.readLine();

                        out.write("Введите дату рождения в формате ДД:ММ:ГГГГ" + "\n");
                        out.flush();

                        String newBirthday = in.readLine();

                        out.write("showOnce" + "\n");      // для только вывода одного сообщения
                        out.flush();

                        out.write(archive.newDeal(newFirstName, newLastName, newPlaceOfResidence, newBirthday) + "\n");
                        out.flush();
                        break;
                    case "0":
                        out.write("end" + "\n");
                        out.flush();
                        break;
                }
            } while (!number.matches("[0]"));

        } else {

            do {
                out.write("1. Просмотр дела " + "| 0. Окончание работы программы." + "\n");
                out.flush();

                number = in.readLine();

                switch (number) {
                    case "1":
                        viewing(archive);
                        break;
                    case "0":
                        out.write("end" + "\n");
                        out.flush();
                        break;
                }
            } while (!number.matches("[0]"));
        }
        in.close();
        out.close();
    }

    public void viewing(Archive archive) throws IOException {
        out.write("1. Показать все дела " + "| 2. Поиск дела " + "\n");
        out.flush();

        String userChoice = in.readLine();

        if (userChoice.compareTo("1") == 0) {
            int i = 1;
            while (archive.showDeals(i) != null) {
                out.write("showOnce" + "\n");
                out.flush();
                out.write(archive.showDeals(i) + "\n");
                out.flush();
                i++;
            }
        } else if (userChoice.compareTo("2") == 0) {
            out.write("Введите фамилию для поиска" + "\n");
            out.flush();

            userChoice = in.readLine();

            int i = 1;
            while (archive.searchDeals(i, userChoice) != null) {

                if (archive.searchDeals(i, userChoice).compareTo("0") != 0) {
                    out.write("showOnce" + "\n");
                    out.flush();
                    out.write(archive.searchDeals(i, userChoice) + "\n");
                    out.flush();
                }
                i++;
            }
        } else {
            out.write("lose" + "\n");
            out.flush();
            out.write("\n");
        }
    }
}