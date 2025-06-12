import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  Calculator calculator = new Calculator();
  
  // @Test
  // public void testSum() {
    
  //   int expected = 4;
    
  //   int actual = calculator.sum(1, 2);
    
  //   assertNotEquals(expected, actual);
  // }

  @Test
  public void testAdd() {
    
    int expected = 3;
    
    int actual = calculator.add(1, 2);
    
    assertEquals(expected, actual);
  }

  @Test
  public void testSubtract() {
    
    int expected = 8;
    
    int actual = calculator.subtract(10, 2);
    
    assertEquals(expected, actual);
  }

  @Test
  public void testMultiply() {
    
    int expected = 18;
    
    int actual = calculator.multiply(6, 3);
    
    assertEquals(expected, actual);
  }

  @Test
  public void testDivide() {
    
    int expected = 3;
    
    int actual = calculator.divide(18, 6);
    
    assertEquals(expected, actual);
  }

  @Test
  public void testIsEven() {

    boolean actual = calculator.isEven(2);

    assertTrue(actual);
  }

  @Test
  public void testIsOdd() {

    boolean actual = calculator.isEven(3);

    assertFalse(actual);
  }

  @Test
  public void testIncrementArray() {
    int[] expected = new int[]{2, 3, 4};

    int[] actual = calculator.incrementArray(new int[]{1, 2, 3});

    assertArrayEquals(expected, actual);
  }

  @Test
  public void testDivideByZero() {
    
    Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));

    String expected = "Ints cannot be divided by zero";

    String actual = exception.getMessage();

    assertEquals(expected, actual);
  }
}