package seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

        // task0();
        // task1();
        // task2();
        // task3();
        stack();

    }

    static void task0(){
        // 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        // 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
        List<Integer> list = new ArrayList<>();
        Queue<Integer> linked = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();

        for (int i = 0; i < 900000; i++) {
            linked.add(i);    
        }
        long secondend = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(secondend - end);
    }

    static void task1(){
    // 📔 Реализовать консольное приложение, которое:
    // 1. Принимает от пользователя строку вида
    // text~num
    // 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
    // 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
        List<String> linked = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Введи команду! ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            switch (text){
                case "print" :
                    System.out.println(linked.remove(num));
                    break;
                case "exit" :
                    System.out.println("До встречи!");
                    work = false;
                    break;
                default:
                    linked.add(num, text);

            }
        }
    }

    static void task2(){
        // 📔 Реализовать консольное приложение, которое:
        // 1. Принимает от пользователя и “запоминает” строки.
        // 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        // 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
        LinkedList<String> linked = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите строку: ");
            String text = scanner.nextLine();
            text = text.trim();
            switch (text){
                case "exit" :
                    work = false;
                    break;
                case "revert" :
                    linked.removeLast();
                    break;
                case "print" :
                    ListIterator listIterator = linked.listIterator(linked.size());
                    while (listIterator.hasPrevious()){
                        System.out.println(listIterator.previous());
                    }
                    break;
                default:
                    linked.add(text);
            }
        }

    }

    static void task3(){
        // 📔 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
        // 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.add(5);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        System.out.println("");

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }

    static void stack(){
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(6);
        myStack.push(8);
        myStack.tell();
        System.out.println(myStack.empty());
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        myStack.tell();

        myStack.push(10);

        myStack.tell();

        myStack.push(20);

        myStack.tell();
        System.out.println(myStack.empty());
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
                System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        myStack.tell();

    }
}
