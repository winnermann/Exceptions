package org.lesson37.exceptionspart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("Test.txt");
        Scanner scanner = new Scanner(file);

    }
}
