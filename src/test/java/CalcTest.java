import com.aktepe.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class CalcTest {

    @Test
    public void SquareTest() {
        int[] numbers = {5, 8, 10, 12, 30};
        int[] expectedResults = {25, 64, 100, 144, 900};
        for (int i = 0; i < numbers.length; i++) {
            int actualResult = Calculator.Square(numbers[i]);
            Assert.assertEquals(actualResult, expectedResults[i]);
        }
    }

    @Test
    public void AddTest() {
        int[][] numbers = {{5, 4}, {8, 4}, {10, 43}, {22, 59}, {33, 453}};
        int[] expectedResults = {9, 12, 53, 81, 486};
        for (int i = 0; i < numbers.length; i++) {
            int actualResult = Calculator.Add(numbers[i][0], numbers[i][1]);
            Assert.assertEquals(actualResult, expectedResults[i]);
        }
    }

    @Test
    public void AddDoubleTest() {
        double[][] numbers = {{5.1, 4.2}, {8.1, 4}, {10.5, 43.5}, {22, 59}, {33.3, 453.2}};
        double[] expectedResults = {9.3, 12.1, 54.0, 81, 486.5};
        for (int i = 0; i < numbers.length; i++) {
            double actualResult = Calculator.Add(numbers[i][0], numbers[i][1]);
            Assert.assertEquals(actualResult, expectedResults[i]);
        }
    }

    @Test
    public void MultiplyTest() {
        int[] expectedResults = {20, 48, 430, 180, 1359};
        int[] actualResults = {
                Calculator.Multiply(5, 4),
                Calculator.Multiply(8, 6),
                Calculator.Multiply(10, 43),
                Calculator.Multiply(20, 9),
                Calculator.Multiply(3, 453),
        };

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test
    public void SubtractTest() {
        int[] expectedResults = {1, 2, -33, 11, -450};
        int[] actualResults = {
                Calculator.Subtract(5, 4),
                Calculator.Subtract(8, 6),
                Calculator.Subtract(10, 43),
                Calculator.Subtract(20, 9),
                Calculator.Subtract(3, 453),
        };

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test
    public void DivideTest() {
        int[] expectedResults = {0, 10, 3, 5, 8};
        int[] actualResults = {
                Calculator.Divide(0, 4),
                Calculator.Divide(60, 6),
                Calculator.Divide(10, 3),
                Calculator.Divide(45, 9),
                Calculator.Divide(123, 15),
        };
        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test   (expectedExceptions = IllegalArgumentException.class)
        public void DivideByZeroTest() {
                Calculator.Divide(3, 0);
    }
}