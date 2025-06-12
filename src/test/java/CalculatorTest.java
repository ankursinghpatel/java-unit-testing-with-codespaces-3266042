import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
}