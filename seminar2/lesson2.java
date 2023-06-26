package seminar2;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class lesson2 {

    public static void main(String[] args) {
        
        // System.out.println(task0(10, "a", "b"));
        // System.out.println(task1("aaaaabbbccdddecbbaaa"));
        // System.out.println(wordRepeat("Word~", 10));
        Task4(wordRepeat("Test~", 20));
        // System.out.println(Task05("1 232 1"));

    }

    static String task0 (int n, String string, String string2){
        if(n%2==0){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < n/2; i++) {
                stringBuilder.append(string).append(string2);
            }
            return stringBuilder.toString();
        } else {
            System.out.println("N is not even number! ");
            return null;
        }

    }

    static String task1(String str){
        /* Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. Выход: a4b3c1d2*/
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < chars.length ; i++) {
            if(chars[i] == chars[i-1]) count++;
            else {
                stringBuilder.append(chars[i-1]).append(count+1);
                count = 0;
            }
        }
        stringBuilder.append(chars[chars.length-1]).append(count+1);
        return stringBuilder.toString();
    }

    static String wordRepeat(String word, int n){
       StringBuilder stringBuilder = new StringBuilder();
       for (int i = 0; i < n; i++) {
           stringBuilder.append(word);
       }
       return stringBuilder.toString();
    }

    static void task2(String str) {
        String path = "text.txt";
        try (FileWriter fileWriter = new FileWriter(path, true);){
            fileWriter.write(str);
            fileWriter.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void Task4(String str) {
        String pathlog = "log.txt";
        String path = "text.txt";

        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler(pathlog, true);

        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);

        try (FileWriter fw = new FileWriter(path, false)) {
            fw.write(str); //добавление на запись
            logger.log(Level.INFO, "Str add");
            fw.flush(); //пропихнуть на выход, т.е. записать
            logger.log(Level.INFO, "Str flush");
        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }

        fileHandler.close();
        logger.getHandlers()[0].close();
    }


// static void task3(String str) {
//         String path = "log.txt";

//         Logger logger = Logger.getAnonymousLogger();
//         FileHandler fileHandler = null;
//         try {
//             fileHandler = new FileHandler(path, true);
//         } catch (IOException e){
//             e.printStackTrace();
//         }
//         logger.addHandler(fileHandler);
//         SimpleFormatter simpleFormatter = new SimpleFormatter();
//         fileHandler.setFormatter(simpleFormatter);

//         try (FileWriter fileWriter = new FileWriter("g/g/g//g/g/text.txt", true);){
//             fileWriter.write(str);
//             fileWriter.flush();
//         } catch (Exception e){
//             e.printStackTrace();
//             logger.log(Level.WARNING, e.getMessage());
//         }

//         fileHandler.close();
//         logger.getHandlers()[0].close();

//     }

    /**
     * Напишите метод, который принимает на вход строку (String) 
     * и определяет является ли строка палиндромом (возвращает boolean значение).
     */

    public static boolean Task05(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        String newText = stringBuilder.reverse().toString(); // ревертирование строки text
        return newText.equals(text);  // сравнение содержимого двух строк
    }

}