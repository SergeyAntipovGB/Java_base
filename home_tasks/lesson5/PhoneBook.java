package home_tasks.lesson5;

import java.util.*;
import java.Arrays;

public class PhoneBook {
    private Map<String, String> map = new HashMap<>();// телефонный справочник
    private Map<String,List<String>> treeMap = new TreeMap<>();// развернутый справочник
    private Map<Integer, String> counter = new TreeMap<>();// сортировочная временная коллекция

    void add(String phoneNum, String name){
        map.put(phoneNum, name);
    }

    /**метод getRowPhoneNum возвращает строку записи телефонного справочника
     * @param phoneNum
     * @return key(name): value(phoneNum)
     */
    String getRowPhoneNum(String phoneNum){
        return map.get(phoneNum) + " : " + phoneNum;
    }

    /**метод формирует коллекцию с ключем по имени абонента из телефонного справочника map
     * @return treeMap
     */
    Map<String,List<String>> getTreeMap(){
        for (Map.Entry entry: map.entrySet()){
            if (treeMap.containsKey(entry.getValue())){
                List<String> list = treeMap.get(entry.getValue());
                list.add(entry.getKey().toString());
            }else {
                List<String> list = new ArrayList<>();
                list.add(entry.getKey().toString());
                treeMap.put(entry.getValue().toString(), list);
            }
        }
        return treeMap;
    }

    /**метод сортирует абонентов по количеству телефонных номеров
     * @param getTreeMap
     * @return counter
     */
    Map<Integer,String> sortMap(){
        for (Map.Entry entry: treeMap.entrySet()){
            List<String> list = toString(((Map<String, String>) entry).values());
            // if (counter.containsKey(((CharSequence) list).length())){
            //     String item = counter.get(((CharSequence) list).length());
                
            // }else {
                counter.put(((CharSequence) list).length(), (String) entry.getKey());
            // }
        }
        return counter;
    }
    
    
    static List<String> toString(Object object){
        List<String> aList = new ArrayList<String>();
        for (String text: object){
            aList.add(text);
        }
        return aList;
    }



    String getName(String name){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry: map.entrySet()) {
            if(entry.getValue().equals(name)){
                stringBuilder.append(entry.getValue());
                stringBuilder.append(" : ");
                stringBuilder.append(entry.getKey());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getAll(){
        return map.toString();
    }
}
