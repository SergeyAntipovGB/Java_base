package home_tasks.lesson6;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Hometask {
    public static void main(String[] args) {
        
        Set<Notebook> set = new HashSet<>();
        fillSet(set);
        Map<String,String> criteriaMap = new TreeMap<>();
        // fillCriteriaMap(criteriaMap);
        inputFindCriteria(criteriaMap);
        
        
        
        // System.out.println(set);
    }

    static void fillSet(Set<Notebook> set){
        Notebook notebook1 = new Notebook(2,250,"linux","white");
        Notebook notebook2 = new Notebook(3,500,"linux","black");
        Notebook notebook3 = new Notebook(4,750,"windows","silver");
        Notebook notebook4 = new Notebook(8,800,"windows","black");
        Notebook notebook5 = new Notebook(6,500,"linux","silver");
        Notebook notebook6 = new Notebook(12,1200,"mac-os","pink");
        Notebook notebook7 = new Notebook(10,2000,"mac-os","silver");
        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);
        set.add(notebook5);
        set.add(notebook6);
        set.add(notebook7);
    }

    static void fillCriteriaMap(Map<String,Notebook> criteriaMap){
        criteriaMap.put("1", null);
        criteriaMap.put("2", null);
        criteriaMap.put("3", null);
        criteriaMap.put("4", null);
    }

    static void inputFindCriteria(Map<String,String> criteriaMap){
        System.out.println("Введите номера искомых критериев через пробел:");
        System.out.println("ОЗУ (в Мбайтах)      - 1");
        System.out.println("бъем ЖД (в Гбайтах)  - 2");
        System.out.println("Операционная система - 3");
        System.out.println("Цвет                 - 4\n");
        Scanner in = new Scanner(System.in);
        String[] arrayCriteria = in.nextLine().split(" ");
        for (String item : arrayCriteria) {
            String criteria = new String();
            if (item.equals("1")){
                System.out.print("Введите целое значение ОЗУ в Мбайтах > ");
                criteria = in.next();
            }else if (item.equals("2")){
                System.out.print("Введите целое значение объема ЖД в Гбайтах > ");
                criteria = in.next();
            }else if (item.equals("3")){
                System.out.print("Введите ОС (windows,linux,mac-os) > ");
                criteria = in.next();
            }else if (item.equals("4")){
                System.out.print("Введите цвет (white,black,silver,pink) > ");
                criteria = in.next();
            }
            criteriaMap.put(item, criteria);
        }
        in.close();
    }
}
