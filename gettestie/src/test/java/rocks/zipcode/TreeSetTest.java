package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void treeSetTest() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("zip");
        treeSet.add("shijin");
        treeSet.add("code");

        Assert.assertEquals("zip", treeSet.last());
        Assert.assertEquals("code", treeSet.first());
    }
}
