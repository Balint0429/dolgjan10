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
    public void testCalcArea_30_35() {
        double actual = this.romb.calcArea(30.2,35); 
        double expected = 523.12;
        Assert.assertEquals(actual, expected, 8.6);
    }
    @Test
    public void testCalcArea_50_60() {
        double actual = this.romb.calcArea(50, 60);
        double expected = 2165.06;
        Assert.assertEquals(actual, expected, 19.1);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcArea_Negative_Side() {
        this.romb.calcArea(-1, 90);
    }
    
    
    
}
