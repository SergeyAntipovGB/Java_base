package seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class lesson3 {

    public static void main(String[] args) {
        
        // task0();
        // task1(createList(10,0,10));
        // task2();
        task3();

    }

    public static void task0(){
        // Даны следующие строки, cравнить их с помощью == и метода equals() класса Object

        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1==s2); //true
        System.out.println(s2==s3); //true
        System.out.println(s3==s4); //true
        System.out.println(s4==s5); //false
        System.out.println(s5==s6); //false
        
        System.out.println(s1.equals(s2));  //true
        System.out.println(s2.equals(s3));  //true
        System.out.println(s3.equals(s4));  //true
        System.out.println(s4.equals(s5));  //true
        System.out.println(s5.equals(s6));  //true
    }

    static void task1(List<Integer>list){
//         Текст задачи:
// Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
    
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
    static List<Integer> createList(int size, int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++){
            list.add((int)(Math.random() * (max - min + 1) + min));
            // int для отделения целой части дробного случайного числа
        }
        return list;
        
    }

    static void task2(){
        // Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
        List list = new ArrayList<>();
        list.add("list");
        list.add(77);
        list.add(55);
        list.add("hello");
        list.add(12);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next(); //array[i]
            if (o instanceof Integer){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    static void task3(){
        // Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
        List<ArrayList<String>> catalog = new ArrayList<>();
        addBook("Фантастика", "Трудно быть богом", catalog);
        addBook("Фантастика", "Марсианин", catalog);
        addBook("Детектив", "Убийство в восточном экспрессе", catalog);
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введи жанр : название или q для выхода > ");
        // String input = "";
        // while (!input.equals(anObject("q"))) {
            
        // }
        System.out.println(catalog);
    }

    public static void addBook(String type, String name, List<ArrayList<String>> catalog){
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).get(0).equals(type)) {
                catalog.get(i).add(name);
                return;
            }
        }
        ArrayList<String> t = new ArrayList<>();
        t.add(type);
        t.add(name);
        catalog.add(t);
    }
}