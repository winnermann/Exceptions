package org.lesson40.exceptionspart4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception2 {
    public static void main(String[] args) {
        try {
            run();
            //Другой вид записи отлавливания исключений,одном catch блоке через символ |
            //это называется multicatch
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static void run()throws IOException, ParseException, FileNotFoundException, IllegalArgumentException{

    }
}
