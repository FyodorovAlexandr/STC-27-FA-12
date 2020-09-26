package ru.fyodorov.lesson12;

import java.util.ArrayList;
import java.util.List;

/**
 * Программа, которая демонстрирует утечку памяти
 * и выводит ошибку OutOfMemoryError c пометкой Java Heap Space
 *
 * Коллекции или объекты объявленые как статические,
 * остаются в памяти в течение всего срока работы приложения
 *
 * @author Fyodorov Alexandr
 */
public class Main {
    //Создаем статический список
    public static List<Double> list = new ArrayList<>();

    /**
     * Метод заполняет статический список рандомными числами
     */
    public void test(){
        while (true){
            list.add(Math.random());
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.test();
    }
}
