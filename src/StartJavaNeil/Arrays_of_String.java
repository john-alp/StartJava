package StartJavaNeil;

public class Arrays_of_String {
    public static void main(String[] args){
        int[] numbers = new int[5];
        String[] strings = new String[3];  // Создаем строковый массив с тремя ячейками (0,1,2)
        strings[0] = "Привет ";
        strings[1] = "Мир ";
        strings[2] = "Джавы";
        System.out.println(strings[0]+strings[1]+strings[2]);
        System.out.println();
        for(String x:strings){     //Цикл for each для массива. for(Тип данных имя переменной:название массива)
            System.out.println(x);
        }
        System.out.println();

        int[] numbers2 = {1, 2, 3}; //Создаем числовой массив с тремя проинициализированными ячейками
        int sum = 0;                // Создаём переменную
        for(int y:numbers2){        // Запускаем цикл for each для массива numbers2
            sum += y;               // sum=sum+y  складываем все три ячейки и результат кладём в ячейку sum
        }
        System.out.println("Сумма всех чисел массива numbers2 - "+sum);   // выводим результат сложения
    }
}
