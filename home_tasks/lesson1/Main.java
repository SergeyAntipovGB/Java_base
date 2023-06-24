package home_tasks.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        task1();

    }

    static void task1(){
        // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        int num = 4;
        int summa = 0;
        int fact = 1;
        for (int i =1; i <= num; i++){
            summa += i;
            fact *= i;
        }
        System.out.println("сумма чисел равна ");
        System.out.println(summa);
        System.out.println("произведение чисел равно ");
        System.out.println(fact);
    }

    static void task2(){
        // Вывести все простые числа от 1 до 1000
        // System.out.println(1);
        int resDiv;
        boolean flag;
        int count;
        for (int num = 1; num <= 1000; num++){
            flag = true;
            resDiv = (num - (num % 2)) / 2;
            count = resDiv;
            while (flag == true && count > 1){
                if (num % count == 0) flag = false;
                count--;
            }
            if (flag == true) System.out.println(num);
        }
    }

    static void task3(){
        // Реализовать простой калькулятор
        System.out.print("input first number ");
        Scanner scanner = new Scanner(System.in);
        double number1 = Double.parseDouble(scanner.nextLine());
        System.out.print("input second number ");
        double number2 = Double.parseDouble(scanner.nextLine());
        System.out.println("input operation:\n1 - addition\n2 - subtraction\n3 - multiplication\n4 - division");
        int operation = Integer.parseInt(scanner.nextLine());
        double res = 0;
        switch (operation) {
            case 1:
            res = number1 + number2;
            break;
            case 2:
            res = number1 - number2;
            break;
            case 3:
            res = number1 * number2;
            break;
            case 4:
            res = number1 / number2;
            break;
            default:
            break;
        }
        System.out.print(res);
        scanner.close();
    }
}