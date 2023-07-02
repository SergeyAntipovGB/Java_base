package home_tasks.lesson4;

import java.util.LinkedList;

public class MyLinkedList {
    // 1  Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    // 2  Реализуйте очередь с помощью LinkedList со следующими методами:
    // enqueue() - помещает элемент в конец очереди,
    // dequeue() - возвращает первый элемент из очереди и удаляет его,
    // first() - возвращает первый элемент из очереди, не удаляя.

    private int[] arr = new int[5];

    private int size = 0;

    int[] reverse(){
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < size; i++)
            arr2[i] = arr[size - 1 - i];
        arr = arr2;
        return arr;
    }

    void enqueue(int item){
        // увеличивает размер массива в 2 раза при необходимости
        if (size == arr.length) {
            int[] arr2 = new int[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = item;
    }
    
    int dequeue(){
        int item = arr[0];
        int newSize;
        // уменьшает размер массива в 2 раза при необходимости
        if (arr.length / 2 < size)
            newSize = arr.length;
        else
            newSize = arr.length / 2;
        int[] arr2 = new int[newSize];
        System.arraycopy(arr, 1, arr2, 0, --size);
        arr = arr2;
        return item;
    }
    
    int first(){
        return arr[0];
    }

    void toScreen(){ // метод выводит список на экран
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.println(arr[i] + "]");
                break;
            }else
                System.out.print(arr[i] + ", ");
        }
    }

}
