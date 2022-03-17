package by.training.java.module_6.task04.logic;

import by.training.java.module_6.task04.content.Dock;
import by.training.java.module_6.task04.content.Ship;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Port {
    public static int currentQuantityCargo = 30;                     // текущее количество груза в порту
    public static int capacity = 100;                                // вместимость порта
    public static BlockingQueue<Ship> queue = new ArrayBlockingQueue<Ship>(10);    // Очередь кораблей

    public Port() {

        ExecutorService pool = Executors.newFixedThreadPool(4); // Пулл потоков  

        for (int i = 0; i < 3; i++) {                           // 3 задания Dock
            pool.submit(new Dock());                            // Старт 3 потоков
        }
        pool.submit(new MoveShips());                           // Поток прибытия и ожидания очереди
    }
}
