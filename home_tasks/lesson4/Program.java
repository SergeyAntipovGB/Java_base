package home_tasks.lesson4;

public class Program {
    public static void main(String[] args) {

        MyLinkedList lList = new MyLinkedList();

        lList.enqueue("first");
        lList.enqueue("second");
        lList.enqueue("third");
        lList.enqueue("fourth");
        lList.enqueue("fifth");

        lList.toScreen();
    }

}
