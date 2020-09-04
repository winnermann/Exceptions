package org.lesson38.exceptionspart2;

import java.io.IOException;
import java.util.Scanner;

//Выбрасывание исключений
public class ExceptionsTryCatch1 {
    public static void main(String[] args) {
        //cчитывает ввод из консоли
        Scanner scanner = new Scanner(System.in);
        //пока верно что x=0
        while (true){
            //преобразует строки в целые числа и ложит в переменную x
            int x = Integer.parseInt(scanner.nextLine());

            //если x не равен нулю выбрасывается исключение
            //сценарий что пользователь ввел не ноль является ошибочным
            if (x!=0){
                try {
                    //Выбрасывается стандартное Джавовское исключение IOException() (или InputOutputException)
                    throw new IOException();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Пользователь ввел не ноль");
                }
            }
        }
    }
}
