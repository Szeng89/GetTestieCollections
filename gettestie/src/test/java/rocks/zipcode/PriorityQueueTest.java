package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    @Test
    public void peekAndPollTest() {
        PriorityQueue<String> priorityQueue = new PriorityQueue();
        priorityQueue.add("Zip"); // Strings Lexicographical ordering
        priorityQueue.add("Shijin");
        priorityQueue.add("Code");

        Assert.assertEquals("Code", priorityQueue.peek());
        Assert.assertEquals("Code", priorityQueue.poll());
    }
}
