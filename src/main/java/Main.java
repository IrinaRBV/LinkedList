import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedListInterface myLinkedList = new MyLinkedList();

        for (int i = 0; i < 10; i++) {
            myLinkedList.add(i);
        }

        myLinkedList.remove(5);
        System.out.println(myLinkedList);
    }
}
