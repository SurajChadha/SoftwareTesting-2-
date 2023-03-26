import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class _test_runnerTestSuite {

  @Test
  public void test1() {
      Adder adder = new Adder();
    int result = adder.add(12, 13);
    assertEquals(12, result);
    
  }

}