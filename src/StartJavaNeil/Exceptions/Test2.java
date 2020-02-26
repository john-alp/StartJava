package StartJavaNeil.Exceptions;

import java.io.IOException;
import java.util.Scanner;

/**
 * Урок 38 Исключения. Вторая часть. 11.12.2019
 *
 * Сценарий, что пользователь ввел не ноль и это ошибка. Будем её обрабатывать как исключение
 *
 * Исключения нужно выбрасывать, если в ходе выполнения программы, она пришла в состояние в котором не должна быть
 */
public class Test2 {
    public static void main(String[] args) throws Exceptions.ScannerExceptions {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        //// Второй пример
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            count++;
            System.out.println("Цикл номер "+count);
            if(x!=0){
                    throw new Exceptions.ScannerExceptions("Нет нуля!!"); // Вызываем наше исключение ScannerExceptions и передаём описание проблеммы


            }
        }
    }
}

/*
//// Первый пример
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            count++;
            System.out.println("Цикл номер "+count);
            if(x!=0){     // если не равен 0, то выбрасываем IOException()
                try{
                    throw new IOException(); // Если введён не нуль, то выбрасываем исключение IOException()
                }catch (IOException e){
                    System.out.println("Нет нуля!");
                }
 */