package by.training.java.module_6.task03.client.launch;

import java.io.*;
import java.net.Socket;

public class Client {

    private static Socket clientSocket;    //сокет для общения
    private static BufferedReader reader;  // нам нужен ридер читающий с консоли, иначе как мы узнаем что хочет сказать клиент
    private static BufferedReader in;      // поток чтения из сокета
    private static BufferedWriter out;     // поток записи в сокет

    public Client() {
        try {
            try {
                // адрес - локальный хост, порт - 4004, такой же, как у сервера
                clientSocket = new Socket("localhost", 4004);

                // этой строкой мы запрашиваем у сервера доступ на соединение
                reader = new BufferedReader(new InputStreamReader(System.in));

                // читать сообщения с сервера
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                // писать туда же
                out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                // если соединение произошло и потоки успешно созданы - мы можем
                // работать дальше и предложить клиенту что-то ввести, если нет - вылетит исключение

                String serverWord = "";

                while (serverWord.compareTo("end") != 0) {  // пока не придет команда о закрытии end
                    serverWord = in.readLine();             // ждём, что скажет сервер
                    if (serverWord.compareTo("lose") != 0 && serverWord.compareTo("end") != 0 && serverWord.compareTo("showOnce") != 0) {
                        System.out.println(serverWord);     // получив - выводим на экран
                        String word = reader.readLine();    // ждём пока клиент что-нибудь не напишет в консоль
                        out.write(word + "\n");         // отправляем сообщение на сервер
                        out.flush();
                    } else if (serverWord.compareTo("lose") == 0 && serverWord.compareTo("end") != 0) { // для вывода некорректного сообщения
                        System.out.println("Некорректно введенные данные");
                        serverWord = in.readLine();

                    } else if (serverWord.compareTo("showOnce") == 0) {    // для вывода только одного сообщения
                        serverWord = in.readLine();
                        System.out.println(serverWord);
                    }
                }

            } finally { // в любом случае необходимо закрыть сокет и потоки
                System.out.println("Клиент был закрыт...");
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
