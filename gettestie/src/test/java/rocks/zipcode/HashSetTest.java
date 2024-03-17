package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    @Test
    public void hashSetTest1() {
        Set<String> hashset = new HashSet<>();

        hashset.add("butters");
        hashset.add("meow");
        hashset.remove("meow");

        Assert.assertTrue(hashset.contains("butters"));
        Assert.assertFalse(hashset.contains("meow"));


    }

    @Test
    public void hashSetTest2() {
        Set<Integer> hashset = new HashSet<>();
        hashset.add(11);
        hashset.remove(11);
        hashset.add(88);

        Assert.assertTrue(hashset.contains(88));
        Assert.assertFalse(hashset.contains(11));
    }
}
