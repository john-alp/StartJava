package Courses.Nail.StartJavaNeil;

public class Multidimensional_arrays {
    public static void main(String[] args){
        int[][] numbers = {{1,2,3},   // Двухмерный массив. Первая цифра - номер строки, вторая номер столбца
                           {4,5,6},     // numbers.length - выдает колличество строк, а numbers[1].length к-во столбцов, в строке к которой обращается
                           {7,8,9}};
        String[][] strings = {{"Привет ","прекрасный "},{"мир "},{"Джавы"},{"!!!"}};
        System.out.println("Вот наш прекрасный, числовой, двухмерный массив: ");
        for (int i=0; i<numbers.length; i++){         // numbers.length - к-во строк
            for(int j=0; j<numbers[i].length; j++) {  // numbers[].length - к-во столбцов
                System.out.print(numbers[i][j]+" ");      // Цикл i делает три цикла, так как numbers.length = 3
            }                                         // Цикл j делает по три цикла, в каждом цикле i, всего 9 циклов
            System.out.println();
        }
        System.out.println();
        System.out.println("А это не менее прекрасный, строковый, двухмерный массив: ");
        System.out.print(strings[0][0]+strings[0][1]+strings[1][0]+strings[2][0]+strings[3][0]);
    }
}
