package home_tasks.lesson3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    
    public static void main(String[] args){
        /* Пусть дан произвольный список целых чисел.

        1) Нужно удалить из него чётные числа
        2) Найти минимальное значение
        3) Найти максимальное значение
        4) Найти среднее значение */

        List<Integer> list = createList(14);
        System.out.println("исходный список целых чисел: " + list);
        deleteEven(list);
        System.out.println("из него только нечетные: " + list);
        findExtremum(list);
        System.out.println("минимальный элемент: " + list.get(0));
        System.out.println("максимальный элемент: " + list.get(list.size()-1));
        System.out.println("среднее значение: " + calculateMean(list));
    }

    static List<Integer> createList(int size){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) list.add((int)(Math.random() * 11));
        return list;
    }

    static void deleteEven(List<Integer> list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if ((int)o % 2 == 0) iterator.remove();
        }
    }

    static void findExtremum(List<Integer> list){
        Collections.sort(list, Comparator.naturalOrder());
    }

    static String calculateMean(List<Integer> list){
        int sum = 0;
        for (Integer integer : list) sum += integer;
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
        String result = decimalFormat.format((double)(sum)/(double)(list.size()));
        return result;
    }
}