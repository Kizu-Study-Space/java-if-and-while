package point;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

  @Test
  public void getQuadrant() {
    Point point = new Point(1,1);
    assertEquals(1, point.getQuadrant());
  }
   
}
