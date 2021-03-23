import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(5);
        myLinkedList.add(10);
        myLinkedList.add(15);

        myLinkedList.remove(5);
        System.out.println(myLinkedList);
    }
}
