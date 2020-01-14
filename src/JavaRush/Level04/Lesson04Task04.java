package JavaRush.Level04;
/** 05.01.2020
 *  Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/
public class Lesson04Task04 {
    public static void main(String[] args) {
        checkSeason(77);
    }
    private static void checkSeason (int month){
        if((month > 2) && (month < 6)) System.out.println("Весна");
        if((month > 5) && (month < 9)) System.out.println("Лето");
        if((month > 8) && (month < 12)) System.out.println("Осень");
        if((month == 12) || (month < 3)) System.out.println("Зима");
        if(month > 12) System.out.println("Такого месяца не придумали ещё!");
    }
}


