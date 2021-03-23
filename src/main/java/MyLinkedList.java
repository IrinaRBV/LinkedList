import java.util.Arrays;

public class MyLinkedList implements LinkedListInterface{
    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;
    private int size = 0;

    public void add(int value) {
        // Если первое добавление
        if(head == null) {
            this.head = new Node(value);
        } else {
            Node step = head;
            while (step.getNext() != null) {
                step = step.getNext();
            }
            step.setNext(new Node(value));
        }
        size++;
    }

    public int get(int index) {
        int currentIndex = 0;
        Node step = head;

        while (step != null) {
            if(currentIndex == index) {
                return step.getValue();
            } else {
                step = step.getNext();
                currentIndex++;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean remove(int index) {
        int currentIndex = 0;
        Node step = head;

        if (index == 0) {
            head = head.getNext();
            size--;
            return true;
        }

        while (step != null) {
            if(currentIndex == index - 1) {
                step.setNext(step.getNext().getNext());
                size--;
                return true;
            } else {
                step = step.getNext();
                currentIndex++;
            }
        }

        throw new IndexOutOfBoundsException();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        int[] array = new int[size];
        Node step = head;
        int index = 0;

        while (step != null) {
            array[index] = step.getValue();
            step = step.getNext();
            index++;
        }
        return Arrays.toString(array);
    }

}
