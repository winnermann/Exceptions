package org.lesson38.exceptionspart2;

//Создаем класс с собственным видом Исключения ScannerExceptionWithArgument и унаследуемся от стандартного
// java класса Exception из пакета java.util
public class ScannerExceptionWithArgument extends Exception {
    public ScannerExceptionWithArgument(String description){
        super(description);
    }
}
