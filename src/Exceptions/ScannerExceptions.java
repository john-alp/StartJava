package Exceptions;

/**
 *  Создаём свое собственное исключение
 */
public class ScannerExceptions extends Exception{
    public ScannerExceptions(String description){
        super(description);
    }
}
