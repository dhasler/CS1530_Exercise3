import org.junit.Test;
import static org.junit.Assert.*;

import bettersupergroupers.LazyTriangle;

public class LazyTriangleTest {

  @Test
  public void testLazy0(){
    assertEquals(LazyTriangle.lazySequence(0), 1);
  }

  @Test
  public void testTri0(){
    assertEquals(LazyTriangle.triangleSequence(0), 0);
  }

  @Test
  public void testLazy3(){
    assertEquals(LazyTriangle.lazySequence(3), 7);
  }

  @Test
  public void testTri3(){
    assertEquals(LazyTriangle.triangleSequence(3), 6);
  }


  @Test
  public void testLazy7(){
    assertEquals(LazyTriangle.lazySequence(7), 29);
  }

  @Test
  public void testTri7(){
    assertEquals(LazyTriangle.triangleSequence(7), 28);
  }
}