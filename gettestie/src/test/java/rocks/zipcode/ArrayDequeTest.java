package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayDeque;

public class ArrayDequeTest {
    @Test
    public void addAndOfferFirstTest() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(1); // add first element to deque

        deque.offerFirst(2); // offer first adds another element making the first element

        Assert.assertEquals(2, deque.size()); // check size to make sure 2

        Assert.assertEquals(Integer.valueOf(2), deque.peekFirst()); // check the first element is 2 because it should be at the front of deque

        Assert.assertEquals(Integer.valueOf(1), deque.peekLast()); // check that the last element is 1 since it was added first
    }

    @Test
    public void addAndOfferLastTest() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addLast(1); //add 1 to the last element

        Assert.assertEquals(Integer.valueOf(1), deque.peekLast()); // check the last element

        boolean offerResult = deque.offerLast(2); // use offer last to add another element

        Assert.assertTrue(offerResult); //verify offerlast worked

        Assert.assertEquals(Integer.valueOf(1), deque.peekFirst()); // 1 is not the first element
        Assert.assertEquals(Integer.valueOf(2), deque.peekFirst()); //2 should be the last

        Assert.assertEquals(2, deque.size()); // check size of deque
    }

}
