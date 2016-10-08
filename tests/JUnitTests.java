/**
 * Created by Alexander_Demidovich on 10/8/2016.
 */

import Objects.Ball;
import Objects.Basket;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTests {
    Ball firstBlueBall = new Ball(5,"blue");
    Ball secondBlueBall = new Ball(2,"blue");
    Ball thirdBlueBall = new Ball(3,"blue");
    Ball firstGreenBall = new Ball(9,"green");

    Basket basket = new Basket();
    @Before
    public void setUp() {
        basket.putBall(firstBlueBall);
        basket.putBall(secondBlueBall);
        basket.putBall(thirdBlueBall);
        basket.putBall(firstGreenBall);
    }
    @Test
    public void WeightAllBalls_19_19Returned() {
        double expectedWeightOfTheBalls = 19;
        double actual = basket.getWeightOfBalls();
        assertEquals(expectedWeightOfTheBalls, actual,0.001);
    }
    @Test
    public void CountBlueBalls_3_3Returned() {
        int expectedWeightOfTheBalls = 3;
        int actual = basket.getCountBlueBalls();
        assertEquals(expectedWeightOfTheBalls, actual);
    }
}
