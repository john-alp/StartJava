package StartJavaNeil;

public class Arrays {
    public static void main(String[] args){
        int[] numbers = new int[5];                // Массив, ссылочный тип данных. [5]колличество ячеек
        System.out.println(numbers[0]);            // Не инициализированный массив int по умолчанию, в ячейках нули
        numbers[0] = 10;                           // Присвоение ячейки 0, значение 10
        System.out.println(numbers[0]);
        //Заполняем массив, с помощью цикла for
        for(int i=0; i<numbers.length; i++){
            numbers[i] = i*10;
            System.out.println("Массив 1 "+numbers[i]);
        }
        int[] numbers2 = {0,1,2,3,4};
        for(int i=0; i<numbers2.length; i++){
            System.out.println("Массив 2 "+numbers2[i]);
        }



    }
}
