package home_tasks.lesson4;

public class Program {
    public static void main(String[] args) {

        MyLinkedList lList = new MyLinkedList();

        lList.enqueue(1);
        lList.enqueue(2);
        lList.enqueue(5);
        lList.enqueue(9);
        lList.enqueue(12);

        System.out.print("исходный linkedList -> ");
        lList.toScreen();
        
        lList.reverse();
        System.out.print("перевернутый список -> ");
        lList.toScreen();
        
        System.out.printf("dequeue() возвращает %d,  результирующий список -> ", lList.dequeue());
        lList.toScreen();

        System.out.printf("first() возвращает %d,  результирующий список -> ", lList.first());
        lList.toScreen();
    }

}
