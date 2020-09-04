package org.lesson37.exceptionspart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsTryCatch4 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл Test.txt не найден");
        }
        System.out.println("После блока try ... catch");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("Test.txt");
        Scanner scanner = new Scanner(file);
        System.out.println("В блоке try... после Scanner");

    }
}
