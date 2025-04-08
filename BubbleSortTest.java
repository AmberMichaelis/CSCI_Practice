import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void testAlreadySortedArray() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testReverseSortedArray() {
        double[] array = {5.0, 4.0, 3.0, 2.0, 1.0};
        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testArrayWithDuplicates() {
        double[] array = {3.0, 1.0, 2.0, 3.0, 1.0};
        double[] expected = {1.0, 1.0, 2.0, 3.0, 3.0};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        double[] array = {-3.0, -1.0, -2.0, 0.0, 2.0};
        double[] expected = {-3.0, -2.0, -1.0, 0.0, 2.0};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testSingleElementArray() {
        double[] array = {1.0};
        double[] expected = {1.0};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testEmptyArray() {
        double[] array = {};
        double[] expected = {};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(expected, array);
    }
}
