package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {

    @Test
    public void addAndGetTest() {
        Vector<String> vector = new Vector<>();
        vector.add("zip");
        vector.add("code");

        Assert.assertEquals("zip", vector.get(0));
        Assert.assertEquals("code", vector.get(1));
    }
}
