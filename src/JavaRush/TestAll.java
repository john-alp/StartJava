package JavaRush;

import java.io.*;

import java.util.Date;
import java.util.Scanner;


public class TestAll {
    public static void main(String[] args) {
        May cat = new May();
        cat.id = 1;
        cat.name = "Мурзик";
         start(cat);
        System.out.println("Переопределил:");
        System.out.println(cat.id+" "+cat.name);
    }
     static void start(May a){
        int id=2;
        String name="Мявк";
        System.out.println("a id "+a.id+" a name  "+a.name);
        a.id = 3;
        a.name = "hhhhh";

    }
}


class May{
    int id;
    String name;
}
