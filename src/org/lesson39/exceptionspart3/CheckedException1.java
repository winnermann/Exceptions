//Урок 39: Исключения (часть 3). Checked и Unchecked исключения.
//https://www.youtube.com/watch?v=P7dByA1rz5c&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=40
package org.lesson39.exceptionspart3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException1 {
    public static void main(String[] args) {
        //CheckedException (Compile Time Exception) - это те исключения, которые возникают во время компиляции
        //CheckedException (Compile Time Exception) требуется обязательно обработать, без обработки этого исключения программа не скомпилируется
        //CheckedException (Compile Time Exception) - это скорее не ошибки, а исключительные случаи в работе программы
        //UncheckedException (Runtime Exception) - это исключения кот. возникают во время выполнения программы

        File file = new File("Test.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File is not found");
        }
    }
}
