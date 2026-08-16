package LinkedList;

public class Main1 {

    public static void main(String[] args) {

        LL list = new LL();

        for (int i = 7; i > 0; i--) {
            list.insertLast(i);
        }

        System.out.println("Before sorting:");
        list.display();

        list.bubbleSort();

        System.out.println("After sorting:");
        list.display();
    }
}