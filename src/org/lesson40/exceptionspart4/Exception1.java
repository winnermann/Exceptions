package org.lesson40.exceptionspart4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception1 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    //из одного метода можно выбрасывать несколко разных исключений
    //IOException extends Exception - требует обработки
    //ParseException extends Exception - требует обработки
    //FileNotFoundException extends IOException - не требует обработки, т.к. унаследован от IOException, которое уже обработано
    //IllegalArgumentException extends RuntimeException - UncheckedException (Runtime Exception) - это скорее ошибка в работе программы, ее нет смысла обрабатывать, ошибку надо удалить или исправить
    public static void run() throws IOException, ParseException, FileNotFoundException, IllegalArgumentException {

    }
}
