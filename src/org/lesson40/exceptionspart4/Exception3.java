package org.lesson40.exceptionspart4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception3 {
    public static void main(String[] args) {
        try {
            run();
            //В блоке catch можно не указывать каждый вид Исключения, а указывать только Exception для всех видов исключений, т.к
            // все исключения наследуются от Exception
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void run()throws IOException, ParseException, FileNotFoundException, IllegalArgumentException{

    }
}
