/*

 * Tue Mar 03 14:47:27 GMT 2020
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.NumberFormat;
import java.text.ParseException;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ProperFractionFormat_ESTest extends ProperFractionFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = Fraction.ZERO;
      String string0 = properFractionFormat0.format((Object) fraction0);
      assertEquals("0 / 1", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      // Undeclared exception!
      try { 
        properFractionFormat0.format((Object) properFractionFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given object as a fraction
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parse("3vS\"=WO!qW#1\"5:");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"3vS\"=WO!qW#1\"5:\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = null;
      try {
        properFractionFormat0 = new ProperFractionFormat((NumberFormat) null, (NumberFormat) null, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // whole format can not be null.
         //
         verifyException("org.apache.commons.math.fraction.ProperFractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = properFractionFormat0.parse("0 / 1");
      assertNotNull(fraction0);
      assertEquals(0.0F, fraction0.floatValue(), 0.01F);
  }
}
