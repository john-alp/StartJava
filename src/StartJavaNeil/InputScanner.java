import java.util.Scanner;    // Импорт пакета

public class InputScanner {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);          //Обьявляем обьект "scan"
        System.out.println("Введите, что хотите:");
        System.out.println("Вы ввели: " +scan.nextLine());  // обьект.метод  scan.nextLine (я так понимаю, что nextLine встроенный метод из Scanner)
    }
}
