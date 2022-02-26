package by.training.java.module_6.task03.server.launch;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {
		/*
		  Создайте киент-серверное приложение "Архив".
		  В архиве хранятся дела. Архив находится на сервере.
		  Клиент, в зависимости от прав, может запросить дело на просмотр, внести в
		  него изменения, или создать новое дело.
		 */

        // Пользователи имеющиеся в базе: administrator, anton
        // Псе пароли пользователей 1234qwer

        // Запуск сервера
        Server server = new Server();

    }
}
