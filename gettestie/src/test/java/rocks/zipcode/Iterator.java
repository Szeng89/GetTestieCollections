package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator {

    private ArrayList<Integer> list;
    private ListIterator<Integer> listIterator;

    @Before
    public void setUp() {
        list = new ArrayList<>();
        list.add(1);
        list.add(3);
        listIterator = list.listIterator();
    }

    @Test
    public void IteratorAddTest() {
        listIterator.next(); // move to the first element

        listIterator.add(2); // add element between 1 and 3

        Assert.assertEquals("[1, 2, 3]", list.toString());
    }

    @Test
    public void IteratorRemoveTest() {
        listIterator.next(); // move to the first element

        listIterator.remove();// remove the first element

        Assert.assertEquals("[3]", list.toString());
    }
}
