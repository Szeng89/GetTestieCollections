package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void testAddAndRetrieve() {
        LinkedList<String> list = new LinkedList<>(); // Create new LinkedList for Strings
        list.add("Zip"); // last in last out
        list.add("Code"); // so Code should be last

        Assert.assertEquals("Code", list.get(1));
    }

    @Test
    public void retrieveTest() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Zip");
        list.add("Code");
        list.add(1, "Shijin");

        Assert.assertEquals("Shijin", list.get(1));
    }
}
