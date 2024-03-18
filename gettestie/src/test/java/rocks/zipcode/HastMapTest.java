package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HastMapTest {
    @Test
    public void testPutAndGet() {
        HashMap<String, Integer> map = new HashMap<>(); // Create new hashmap
        map.put("key1", 99); // put key and value

        Assert.assertEquals(Integer.valueOf(99),map.get("key1")); //value Integer 99 should be in key1
    }

    @Test
    public void testContainsKey() {
        HashMap<Integer, String> map = new HashMap<>(); // Create new hashmap
        map.put(88, "EightyEight"); // put key and value

        Assert.assertTrue(map.containsKey(88)); // map should contain key 88
    }
}
