package point;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PointTest {

  @Test
  public void getQuadrant() throws Exception {
    Point point = new Point(1, 1);
    assertEquals(1, point.getQuadrant());

    point = new Point(-1, 1);
    assertEquals(2, point.getQuadrant());

    point = new Point(-1, -1);
    assertEquals(3, point.getQuadrant());

    point = new Point(1, -1);
    assertEquals(4, point.getQuadrant());

    assertThrows(
           InvalidPointException.class,
           () -> { Point exceptionPoint = new Point(1, 0); exceptionPoint.getQuadrant();}
    );

    assertThrows(
           InvalidPointException.class,
           () -> { Point exceptionPoint = new Point(-1, 0); exceptionPoint.getQuadrant();}
    );

    assertThrows(
           InvalidPointException.class,
           () -> { Point exceptionPoint = new Point(0, 1); exceptionPoint.getQuadrant();}
    );

    assertThrows(
           InvalidPointException.class,
           () -> { Point exceptionPoint = new Point(0, -1); exceptionPoint.getQuadrant();}
    );

    assertThrows(
           InvalidPointException.class,
           () -> { Point exceptionPoint = new Point(0, 0); exceptionPoint.getQuadrant();}
    );
  }

  @Test
  public void getQuadrantReadableImplementation() throws Exception {
    Point point = new Point(1, 1);
    assertEquals(1, point.getQuadrantReadableImplementation());

    point = new Point(-1, 1);
    assertEquals(2, point.getQuadrantReadableImplementation());

    point = new Point(-1, -1);
    assertEquals(3, point.getQuadrantReadableImplementation());

    point = new Point(1, -1);
    assertEquals(4, point.getQuadrantReadableImplementation());

    assertThrows(
           InvalidPointException.class,
           () -> { Point exceptionPoint = new Point(1, 0); exceptionPoint.getQuadrantReadableImplementation();}
    );

    assertThrows(
           InvalidPointException.class,
           () -> { Point exceptionPoint = new Point(-1, 0); exceptionPoint.getQuadrantReadableImplementation();}
    );

    assertThrows(
           InvalidPointException.class,
           () -> { Point exceptionPoint = new Point(0, 1); exceptionPoint.getQuadrantReadableImplementation();}
    );

    assertThrows(
           InvalidPointException.class,
           () -> { Point exceptionPoint = new Point(0, -1); exceptionPoint.getQuadrantReadableImplementation();}
    );

    assertThrows(
           InvalidPointException.class,
           () -> { Point exceptionPoint = new Point(0, 0); exceptionPoint.getQuadrantReadableImplementation();}
    );
  }
}
