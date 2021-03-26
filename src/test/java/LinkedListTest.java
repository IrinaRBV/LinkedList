import org.junit.jupiter.api.*;

@DisplayName("test linkedList")
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

    @Nested
    @DisplayName("index check method")
    class checkIndex {

        @Test
        @DisplayName("when incorrect index")
        void getIncorrectIndexShouldBeException() {
            Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
                list.get(10);
            });
        }

        @Test
        @DisplayName("when correct index")
        void getCorrectIndexShouldBeRightElement() {
            int test = list.get(5);
            Assertions.assertEquals(5, test);
        }
    }

    @Nested
    @DisplayName("change elements method")
    class changeElements{

        @Test
        @DisplayName("when add element")
        void whenAddElementSizeShouldBeIncreased() {
            list.add(10);
            Assertions.assertEquals(11, list.size());
        }

        @Test
        @DisplayName("when remove element")
        void whenRemoveByElementSizeShouldBeDecreased() {
            Assertions.assertTrue(list.remove(5));
            Assertions.assertEquals(9, list.size());
        }
    }
}
