package home_tasks.lesson5;

import java.util.*;

public class HomeTask {
    public static void main(String[] args) {
        
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("80001234567", "Николай");
        phoneBook.add("80001234568", "Сергей");
        phoneBook.add("80001234569", "Борис");
        phoneBook.add("80001234570", "Николай");
        phoneBook.add("80001234571", "Борис");
        phoneBook.add("80001234572", "Николай");

        // System.out.println(phoneBook.getName("Борис"));
        // System.out.println(phoneBook.getPhoneNum("80001234570"));
        // System.out.println(phoneBook.getAll());
        System.out.println(phoneBook.getTreeMap());
        
    }
}
