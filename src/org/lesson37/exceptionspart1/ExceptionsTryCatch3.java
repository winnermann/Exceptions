package org.lesson37.exceptionspart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsTryCatch3 {
    public static void main(String[] args) {
        //это путь к файлу, который существует
        File file = new File("Test4.txt");

        try {
            //сканнер пытается сканировать из существующего файла
            Scanner scanner = new Scanner(file);
            System.out.println("В блоке try... после Scanner");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл Test.txt не существует");
        }
        System.out.println("После блока try ... catch");

    }
}
