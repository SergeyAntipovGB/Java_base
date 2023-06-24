// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида////"Доброе утро, <Имя>!", если время от 05:00 до 11:59////"Добрый день, <Имя>!", если время от 12:00 до 17:59;////"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;////"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class SeminarOne {
    public static void main(String[] args) {

        task2("Hello happy new year");

    }

    // static void task0(){
    //     System.out.println("как тебя зовут? ");
    //     Scanner scanner = new Scanner(System.in);
    //     String name = scanner.nextLine();
    //     LocalTime time = LocalTime.now();
    //     int hour = time.getHour();
    //     if(hour>=5 && hour<12){
    //         System.out.println("Доброе утро" + name);
    //     }else if (hour<18){
    //         System.out.println("Добрый день" + name);
    //     }else if (hour<23){
    //         System.out.println("Добрый вечер" + name);
    //     }else{
    //         System.out.println("Доброй ночи" + name);
    //     }
    // }



static void task0(){
         System.out.println("Как тебя зовут?");
         Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
         LocalTime time = LocalTime.now();
         int hour = time.getHour();
         if(hour>=5 && hour<12){
             System.out.println("Доброе утро " + name);
         } else if(hour<18 && hour>=12){
             System.out.println("Добрый день " + name);
         }  else if (hour < 23 && hour>=18){
             System.out.println("Добрый вечер " + name);
         } else {
             System.out.println("Доброй ночи " + name);
         }
         scanner.close();
    }


static void task1(){
        /*Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.*/
        int[] arr = {1,1,0,1,1,1,0,1,1,1,1};
        int maxOnes = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                temp++;
            } else {
                if (temp > maxOnes){
                maxOnes = temp;}
                temp = 0;
            }
        }
        if(temp > maxOnes){
            maxOnes = temp;
        }
        System.out.println(maxOnes);
    }


static String task2(String str){
        /*Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.*/
        String[] strArr = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            stringBuilder.append(strArr[strArr.length-i-1]).append(" ");
        }
        return stringBuilder.toString();

    }


// Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.

// Пример 1: а = 3, b = 2, ответ: 9

// Пример 2: а = 2, b = -2, ответ: 0.25

// Пример 3: а = 3, b = 0, ответ: 1



// Дан массив nums = [3,2,5,3] и число val = 3.

// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.

// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.


static void task_001(){
//        System.out.println("001");

        //    Дан массив nums = [3,2,5,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

        int[] nums = {3,2,5,3};
        int val = 3;
        int[] temp = new int[nums.length];

        Arrays.fill(temp, val);
        for(int i = 0, j = 0; i < nums.length; i++){
            if(nums[i] != val){
                temp[j] = nums[i];
                j++;
            }
        }
        for (int i:temp){
            System.out.print(i + " ");
        }
    }


static void task_002(){
//    Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
//        Пример 1: а = 3, b = 2, ответ: 9
//        Пример 2: а = 2, b = -2, ответ: 0.25
//        Пример 3: а = 3, b = 0, ответ: 1

        int a = 2, b = -2;
        float rez = 1;
        int res = 1;

        if (b>0){
            for (int i=0; i<b; i++){
                res *= a;
            }
            System.out.println(res);
        } else if(b<0) {
            for (int i=b; i<0; i++) {
                rez /= a;
            }
            System.out.println(rez);
        }
//        System.out.println(rez);
    }


}