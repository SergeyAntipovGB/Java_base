package home_tasks.lesson5;

public class HomeTask {
    public static void main(String[] args) {
        
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("80001234567", "Николай");
        phoneBook.add("80001234568", "Сергей");
        phoneBook.add("90001234569", "Борис");
        phoneBook.add("70001234569", "Борис");
        phoneBook.add("80001234569", "Борис");
        phoneBook.add("80001234570", "Николай");
        phoneBook.add("80001234571", "Борис");
        phoneBook.add("80001234572", "Николай");

        System.out.println(phoneBook.getName("Борис"));// возвращает таблицу всех телефонов по имени
        System.out.println(phoneBook.getRowPhoneNum("80001234570"));// возвращает имя абонента с указанным номером
        System.out.println(phoneBook.getAll());// выводит в терминал исходную телефонную книгу HashMap
        phoneBook.sortMap();// сортировка справочника и вывод в консоль
        
    }
}
