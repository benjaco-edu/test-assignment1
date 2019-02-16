import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TrainPriceMultiplierTest {
    @Test
    public void TestFailWrongHourToHigh(){
        assertThrows(IllegalArgumentException.class, () -> {
            TrainPriceMultiplier.getMultiplier(24, 0);
        });
    }
    @Test
    public void TestFailWongHourToLow(){
        assertThrows(IllegalArgumentException.class, () -> {
            TrainPriceMultiplier.getMultiplier(-1, 0);
        });
    }
    @Test
    public void TestFailWongMinuteToHigh(){
        assertThrows(IllegalArgumentException.class, () -> {
            TrainPriceMultiplier.getMultiplier(0, 60);
        });
    }
    @Test
    public void TestFailWongMinuteToLow(){
        assertThrows(IllegalArgumentException.class, () -> {
            TrainPriceMultiplier.getMultiplier(0, -1);
        });
    }

    @Test
    public void TestEquivalencePartitions(){
        Assertions.assertEquals(1, TrainPriceMultiplier.getMultiplier(9,0), "Full price at 0900");
        Assertions.assertEquals(1, TrainPriceMultiplier.getMultiplier(18,0), "Full price at 1800");

        Assertions.assertEquals(.5, TrainPriceMultiplier.getMultiplier(10,0));
        Assertions.assertEquals(.5, TrainPriceMultiplier.getMultiplier(20,0));
    }

    @Test
    public void TestBoundaryValueAnalysis(){
        Assertions.assertEquals(1, TrainPriceMultiplier.getMultiplier(0,0), "Full price at 0000");


        Assertions.assertEquals(1, TrainPriceMultiplier.getMultiplier(9,29), "Full price at 0929");
        Assertions.assertEquals(.5, TrainPriceMultiplier.getMultiplier(9,30), "Half price at 0930");

        Assertions.assertEquals(.5, TrainPriceMultiplier.getMultiplier(16,0), "Half price at 1600");
        Assertions.assertEquals(1, TrainPriceMultiplier.getMultiplier(16,1), "Full price at 1601");

        Assertions.assertEquals(1, TrainPriceMultiplier.getMultiplier(19,30), "Full price at 1930");
        Assertions.assertEquals(.5, TrainPriceMultiplier.getMultiplier(19,31), "Half price at 1931");


        Assertions.assertEquals(.5, TrainPriceMultiplier.getMultiplier(23,59), "Half price at 2359");

    }

}