import com.aktepe.Calculator;
import com.aktepe.CalculatorWithObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalcTestObejct {

    CalculatorWithObject calc;

    @BeforeClass
    public void setupObject() {
        calc = new CalculatorWithObject();
    }


    @Test
    public void SquareTest() {
        int[] numbers = {5, 8, 10, 12, 30};
        int[] expectedResults = {25, 64, 100, 144, 900};
        for (int i = 0; i < numbers.length; i++) {
            int actualResult = calc.Square(numbers[i]);
            Assert.assertEquals(actualResult, expectedResults[i]);
        }
    }

    @Test
    public void AddTest() {
        int[][] numbers = {{5, 4}, {8, 4}, {10, 43}, {22, 59}, {33, 453}};
        int[] expectedResults = {9, 12, 53, 81, 486};
        for (int i = 0; i < numbers.length; i++) {
            int actualResult = calc.Add(numbers[i][0], numbers[i][1]);
            Assert.assertEquals(actualResult, expectedResults[i]);
        }
    }

    @Test
    public void AddDoubleTest() {
        double[][] numbers = {{5.1, 4.2}, {8.1, 4}, {10.5, 43.5}, {22, 59}, {33.3, 453.2}};
        double[] expectedResults = {9.3, 12.1, 54.0, 81, 486.5};
        for (int i = 0; i < numbers.length; i++) {
            double actualResult = calc.Add(numbers[i][0], numbers[i][1]);
            Assert.assertEquals(actualResult, expectedResults[i]);
        }
    }

    @Test
    public void MultiplyTest() {
        int[] expectedResults = {20, 48, 430, 180, 1359};
        int[] actualResults = {
                calc.Multiply(5, 4),
                calc.Multiply(8, 6),
                calc.Multiply(10, 43),
                calc.Multiply(20, 9),
                calc.Multiply(3, 453),
        };

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test
    public void SubtractTest() {
        int[] expectedResults = {1, 2, -33, 11, -450};
        int[] actualResults = {
                calc.Subtract(5, 4),
                calc.Subtract(8, 6),
                calc.Subtract(10, 43),
                calc.Subtract(20, 9),
                calc.Subtract(3, 453),
        };

        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test
    public void DivideTest() {
        int[] expectedResults = {0, 10, 3, 5, 8};
        int[] actualResults = {
                calc.Divide(0, 4),
                calc.Divide(60, 6),
                calc.Divide(10, 3),
                calc.Divide(45, 9),
                calc.Divide(123, 15),
        };
        Assert.assertEquals(actualResults, expectedResults);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void DivideByZeroTest() {
        calc.Divide(3, 0);
    }

    @AfterClass
    public void teardown(){
        calc = null;
    }
}




