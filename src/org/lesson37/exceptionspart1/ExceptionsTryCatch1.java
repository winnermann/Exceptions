package org.lesson37.exceptionspart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsTryCatch1 {
    public static void main(String[] args) {
        //это путь к файлу, которого не существует
        File file = new File("Test.txt");

        try {
            //сканнер пытается сканировать из несуществующего файла
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл Test.txt не найден");
        }

    }
}
