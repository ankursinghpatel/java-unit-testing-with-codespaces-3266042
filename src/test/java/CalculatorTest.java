import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

  Calculator calculator = new Calculator();
  
  @Test
  public void testSum() {
    
    int expected = 4;
    
    int actual = calculator.sum(1, 2);
    
    assertNotEquals(expected, actual);
  }

  @Test
  public void testSum2() {

    int expected = 5;

    int actual = calculator.sum(2, 3);

    assertEquals(expected, actual);
  }
}