import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMinMaxTest {
    @Test
    public void TestSuccess3args(){
        MinMaxResult result = FindMinMax.eval(new String[]{"3", "1", "2"});
        assertEquals(new MinMaxResult(1,3), result);
    }
    @Test
    public void TestSuccess2args(){
        MinMaxResult result = FindMinMax.eval(new String[]{"3", "2"});
        assertEquals(new MinMaxResult(2,3), result);
    }
    @Test
    public void TestSuccess1args(){
        MinMaxResult result = FindMinMax.eval(new String[]{"2"});
        assertEquals(new MinMaxResult(2,2), result);
    }
    @Test
    public void TestFail0args(){
        assertThrows(IllegalArgumentException.class, () -> {
            FindMinMax.eval(new String[0]);
        });
    }
    @Test
    public void TestFailInvalidArgs(){
        assertThrows(IllegalArgumentException.class, () -> {
            FindMinMax.eval(new String[]{"a", "0"});
        });
    }
}