package JavaNeil.JavaCollectionsFramework02.MyLinkedList;

import java.util.Arrays;

public class MyLinkedList {
    // Создаем "Голову" списка
    private Node head;
    // Здесь размер нашего Линк листа. По умолчанию, инициализируется 0;
    private int size;

    // Логика добавления элементов в наш односвязный список
    public void add(int value) {
        // Если это первое добавление
        if (head == null) {
            // Создаём первый обьект (node) со значением value
            this.head = new Node(value);
        }
        // Если добавление не первое. Нужно дойти до конца списка и указать последнему узлу (node) значение на следующий добавляемый узел.
        else {
            // Создаём времменный узел
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            // Добавляем узел  [1]->[2]-->[3]
            temp.setNext(new Node(value));

        }
        // После любого добавления переменная будет инкрементироваться
        size++;
    }
    // Метод получения значения по индексу
    public int get(int index){
        int currentIndex = 0;
        Node temp = head;
        while (temp != null){
            if(currentIndex == index) return temp.getValue();
            temp = temp.getNext();
            currentIndex++;
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        int[] result = new int[size];
        int idx = 0;
        // Указывает на начало нашего списка (head)
        Node temp = head;
            while(temp != null){
                result[idx++] = temp.getValue();
                temp = temp.getNext();
            }
        return Arrays.toString(result);
    }

    private static class Node {
        private int value;
        // Ссылка на следующий узел
        private Node next;

        // Конструктор
        public Node(int value) {
            this.value = value;
        }

//        @Override
//        public String toString() {
//            return "Node{" +
//                    "value=" + value +
//                    ", next=" + next +
//                    '}';
//        }

        // Сеттеры и геттеры
        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            System.out.println("get next "+next);
            return next;
        }

    }
}
