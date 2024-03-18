package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {
    @Test
    public void testArrayList1() {
        ArrayList<String> list = new ArrayList<>(); // Create ArrayList
        list.add("Hello"); // add String "Hello"

        Assert.assertEquals(1, list.size()); // check size expected, var name.size
        Assert.assertTrue(list.contains("Hello")); // check var name.contains "Hello"
    }

    @Test
    public void testArrayList2() {
        ArrayList<Integer> list = new ArrayList<>(); //Create ArrayList
        list.add(11); // add to var name.add(11)
        Assert.assertEquals(1, list.size()); // check for size with expected/ var name.size

        list.remove(0); // .remove to remove index
        Assert.assertEquals(0,list.size()); // check size with expected, .size
    }


}
