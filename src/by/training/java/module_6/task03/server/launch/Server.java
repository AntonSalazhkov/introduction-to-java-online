package by.training.java.module_6.task03.server.launch;

import by.training.java.module_6.task03.server.logic.Authorization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static Socket clientSocket;   //сокет для общения
    private static ServerSocket server;   // серверсокет
    private static BufferedReader in;     // поток чтения из сокета

    public Server() {
        try {
            try {

                server = new ServerSocket(4004);    // серверсокет прослушивает порт 4004
                System.out.println("Сервер запущен!");    // хорошо бы серверу объявить о своем запуске
                clientSocket = server.accept();           // accept() будет ждать пока кто-нибудь не захочет подключиться

                try { // установив связь и воссоздав сокет для общения с клиентом можно перейти
                    // к созданию потоков ввода/вывода.

                    // теперь мы можем принимать сообщения
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                    Authorization authorization = new Authorization(clientSocket);

                } finally { // в любом случае сокет будет закрыт
                    clientSocket.close();
                    in.close();
                }
            } finally {
                System.out.println("Сервер закрыт!");
                server.close();
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}