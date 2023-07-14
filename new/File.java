package Java_base.new;

import java.util.Map;
import java.util.TreeMap;

public class File {
    public static void main(String[] args) {

        Map<String, Person> people = new TreeMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));
                
        for(Map.Entry<String, Person> item : people.entrySet()){   
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}