package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.TreeMap;

public class TreeMapTest {

    @Test
    public void treeMapTest() {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("shi", "Shijin");
        Assert.assertEquals(String.valueOf("Shijin"), treeMap.get("shi"));
    }
}
