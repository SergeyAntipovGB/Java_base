package home_tasks.lesson5;

import java.util.*;

public class PhoneBook {
    private Map<String, String> map = new HashMap<>();
    private Map<String,List<String>> treeMap = new TreeMap<>();
    private Map<Integer, String> counter = new TreeMap<>();

    void add(String phoneNum, String name){
        map.put(phoneNum, name);
    }

    String getPhoneNum(String phoneNum){
        return map.get(phoneNum) + " : " + phoneNum;
    }

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

    String sortMap(Map<String,List<String>> getTreeMap){
        for (Map.Entry entry: treeMap.entrySet()){
            ArreyList<String> list = entry.getValue()
            if (counter.containsKey(.Length))
        }
        return ;
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
