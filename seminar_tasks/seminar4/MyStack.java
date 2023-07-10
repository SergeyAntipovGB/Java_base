package seminar_tasks.seminar4;

// 📔 Реализовать стэк с помощью массива. Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

public class MyStack {
    
    private Integer[] arr = new Integer[5];


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
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = item;
    }

    int peek(){
        return arr[size - 1];
    }

    int pop(){
        int item = arr[size - 1];
        int newSize;
        if (arr.length / 2 < size)
            newSize = arr.length;
        else
            newSize = arr.length / 2;
        Integer[] arr2 = new Integer[newSize];
        System.arraycopy(arr, 0, arr2, 0, --size);
        arr = arr2;
        return item;
    }

    void tell(){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if ((i == arr.length - 1) || (arr[i + 1] == null)) {
                System.out.println(arr[i] + "]");
                break;
            }else
                System.out.print(arr[i] + ", ");
        }
    }
}