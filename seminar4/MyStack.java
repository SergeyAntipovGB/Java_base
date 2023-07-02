package seminar4;

// 📔 Реализовать стэк с помощью массива. Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

public class MyStack {
    
    private Integer[] arr = new Integer[10];


    private int size = 0;

    int size(){
        return size;
    }

    boolean empty(){
        return size == 0;
    }

    void push(int item){
        if (size == arr.length) {
            Integer[] arr2 = new Integer[arr.length * 2];
            System.arraycopy(arr2, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = item;
    }

    int peek(){
        return arr[size - 1];
    }

    int pop(){
        return arr[--size];
    }

}











// class dList{
//     static Node head;
//     static Node tail;
//     static class Node{
//         int value;
//         Node next;
//         Node prev;
//     }

//     public static void pushFront(int value){ // O(1)
//         Node node = new Node();
//         node.value = value;

//         if(head == null){
//             tail = node;
//         }else{
//             node.next = head;
//             head.prev = node;
//         }
//         head = node;
//     }

//     public static void popFront(){ // O(1)
//         if(head != null){
//             if(head.next == null){
//                 head = null;
//                 tail = null;
//             }else {
//                 head = head.next;
//                 head.prev = null;
//             }
//         }
//     }
//     public static void print(){
//         Node node = head;
//         while(node != null){
//             System.out.printf("%d ", node.value);
//             node = node.next;
//         }
//         System.out.println();
//     }

//     public static boolean contains(int value){
//         Node node = head;
//         while(node != null){
//             if(node.value == value){
//                 return true;
//             }
//             node = node.next;
//         }
//         return false;
//     }

//     public static void pushBack(int value){ // O(1)
//         Node node = new Node();
//         node.value = value;

//         if(tail == null){
//             head = node;
//         }else{
//             node.prev = tail;
//             tail.next = node;
//         }
//         tail = node;
//     }

//     public static void popBack(){ // O(1)
//         if(tail != null){
//             if(tail.prev == null){
//                 head = null;
//                 tail = null;
//             }else {
//                 tail = tail.prev;
//                 tail.next = null;
//             }
//         }
//     }

//     public static void sort(){ // O(N^2)
//         //bubble sort
//         //for(int i = 0; i < n; i++)
//             //for(int j = 0; j < n - 1 - i; j++)
//                // if(A[j] > A[j+1])
//                     //swap(A[j], A[j+1]);

//         boolean needSort = true;
//         do{
//             needSort = false;
//             Node node = head;
//             while(node != null && node.next != null){
//                 if(node.value > node.next.value){
//                     Node before = node.prev;
//                     Node cur = node;
//                     Node next = node.next;
//                     Node after = next.next;

//                     cur.next = after;
//                     cur.prev = next;
//                     next.next = cur;
//                     next.prev = before;

//                     if(before != null)
//                         before.next = next;
//                     else
//                         head = next;

//                     if(after != null)
//                         after.prev = cur;
//                     else
//                         tail = cur;

//                     needSort = true;
//                 }
//                 node = node.next;
//             }

//         }while(needSort);
//     }
// }