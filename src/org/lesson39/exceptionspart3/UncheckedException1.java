//Урок 39: Исключения (часть 3). Checked и Unchecked исключения.
//https://www.youtube.com/watch?v=P7dByA1rz5c&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=40
package org.lesson39.exceptionspart3;

public class UncheckedException1 {
    public static void main(String[] args) {
        //CheckedException (Compile Time Exception) - это те исключения, которые возникают во время компиляции
        //CheckedException (Compile Time Exception) требуется обязательно обработать, без обработки этого исключения программа не скомпилируется
        //CheckedException (Compile Time Exception) - это скорее не ошибки, а исключительные случаи в работе программы
        //UncheckedException (Runtime Exception) - это исключения кот. возникают во время выполнения программы
        //UncheckedException (Runtime Exception) - это скорее ошибка в работе программы, ее нет смысла обрабатывать, ошибку надо удалить или исправить

        //ArithmeticException
        int a = 1/0;

    }
}
