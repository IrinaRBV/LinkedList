import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    private LinkedListInterface list;

    @BeforeEach
    void createList() {
        list = new MyLinkedList();
        // Заполняем LinkedList элементами
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }

    @Test
    void getIncorrectIndexShouldBeException() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(10);
        });
    }

    @Test
    void getCorrectIndexShouldBeRightElement() {
        int test = list.get(5);
        Assertions.assertEquals(5, test);
    }

    @Test
    void whenAddElementSizeShouldBeIncreased() {
        list.add(10);
        Assertions.assertEquals(11, list.size());
    }

    @Test
    void whenRemoveByElementSizeShouldBeDecreased() {
        Assertions.assertTrue(list.remove(5));
        Assertions.assertEquals(9, list.size());
    }

}
