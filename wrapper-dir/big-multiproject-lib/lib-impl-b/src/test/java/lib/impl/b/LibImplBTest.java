package lib.impl.b;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LibImplBTest {

  @Test
  void getStr1() {
    LibImplB o = new LibImplB();
    Assertions.assertEquals("lib.impl.b.LibImplB 01", o.getStr1());
  }

  @Test
  void getStr2() {
    LibImplB o = new LibImplB();
    Assertions.assertEquals("lib.impl.b.LibImplB 02", o.getStr2());
  }
}
