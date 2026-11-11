package com.efsavage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class CalculatorTest {
  @Test
  void addWorks() {
    assertEquals(5, new Calculator().add(2,3));
  }
  @Test
  void subtractWorks() {
    assertEquals(1, new Calculator().subtract(3,2));
  }
}
