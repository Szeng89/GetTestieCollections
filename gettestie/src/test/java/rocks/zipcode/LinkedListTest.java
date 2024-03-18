package rocks.zipcode;

import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void testAddAndRetrieve() {
        LinkedList<String> list = new LinkedList<>(); // Create new LinkedList for Strings
        list.add("Zip");
        list.add("Code");
    }
}
