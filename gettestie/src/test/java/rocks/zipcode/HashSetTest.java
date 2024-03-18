package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    @Test
    public void hashSetTest1() {
        Set<String> hashset = new HashSet<>(); // Create hashset

        hashset.add("butters"); // add "butters"


        hashset.add("meow"); // add "meow"

        hashset.remove("meow"); // remove "meow"
        Assert.assertFalse(hashset.contains("meow")); // check condition does not contain "meow"
        Assert.assertTrue(hashset.contains("butters")); //check condition contains "butters"

    }
    @Test
    public void hashSetTest2() {
        Set<Integer> hashset = new HashSet<>(); // Create HashSet
        hashset.add(11); // add Integer 11
        hashset.remove(11); // remove Integer 11
        hashset.add(88); // add Integer 88

        Assert.assertTrue(hashset.contains(88)); // check if contains 88
        Assert.assertFalse(hashset.contains(11)); // check does not contain 11
    }
}
