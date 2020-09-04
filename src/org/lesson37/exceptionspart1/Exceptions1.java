package org.lesson37.exceptionspart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Обработка исключений
public class Exceptions1 {
    //throws FileNotFoundException орабатывает ситуацию, что бы сканнер не считывал строки из
    //файла котрого нет и выбрасывает исключение FileNotFoundException
    //FileNotFoundException в сигнатуре метода означает, что этот метод возможно выбросит исключение
    public static void main(String[] args) throws FileNotFoundException {
        //это путь к файлу, которого не существует
        File file = new File("Test.txt");
        //сканнер пытается сканировать из несуществующего файла
        Scanner scanner = new Scanner(file);
    }
}
