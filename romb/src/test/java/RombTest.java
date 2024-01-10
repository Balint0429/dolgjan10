import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Romb;
public class RombTest {
    Romb romb;
    @BeforeTest
    public void setUp(){
        this.romb = new Romb();
    }
    @Test
    public void testCalcRadius_30_35() {
        double actual = this.romb.calcArea(30.2);
        double expected = 8.6;
        Assert.assertEquals(actual, expected, 0.1);
    }
    
}
