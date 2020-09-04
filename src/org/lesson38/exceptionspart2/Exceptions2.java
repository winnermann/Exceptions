package org.lesson38.exceptionspart2;

import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        //cчитывает ввод из консоли
        Scanner scanner = new Scanner(System.in);
        //пока верно что x=0
        while (true){
            //преобразует строки в целые числа и ложит в переменную x
            int x = Integer.parseInt(scanner.nextLine());

            //если x не равен нулю выбрасывается исключение
            //сценарий что пользователь ввел не ноль является ошибочным
            if (x!=0){
                //Выбрасывается созданное нами исключение ScannerException()
                throw new ScannerException();
            }
        }
    }
}
