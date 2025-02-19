/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 15:04:26 GMT 2019
 */

package org.apache.commons.math.util;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.util.MathUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MathUtils_ESTest extends MathUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      long long0 = MathUtils.subAndCheck((-2147482748L), (-9223372036854775807L));
      assertEquals(9223372034707293059L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test001()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(1L, (-9223372036854775796L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck(1, (-2147483647));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      int int0 = MathUtils.subAndCheck((-1926), (-1926));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-2604), Integer.MAX_VALUE);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      short short0 = MathUtils.sign((short) (-1445));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      short short0 = MathUtils.sign((short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      short short0 = MathUtils.sign((short)1370);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      long long0 = MathUtils.sign(9218868437227405312L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      long long0 = MathUtils.sign((long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      long long0 = MathUtils.sign((-905L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      int int0 = MathUtils.sign((-3958));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      int int0 = MathUtils.sign(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      int int0 = MathUtils.sign(997);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      float float0 = MathUtils.sign(796.8215F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      float float0 = MathUtils.sign((float) 0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      float float0 = MathUtils.sign(Float.NaN);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      float float0 = MathUtils.sign((-4428.19F));
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      double double0 = MathUtils.sign(1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      double double0 = MathUtils.sign((-1.0));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      double double0 = MathUtils.sign(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      double double0 = MathUtils.sign(0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)17);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte)0);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      byte byte0 = MathUtils.sign((byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      float float0 = MathUtils.round((float) 7, 7, 7);
      assertEquals(7.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      float float0 = MathUtils.round((-2360.4604F), 854);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      float float0 = MathUtils.round((float) 6, 241, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      float float0 = MathUtils.round((float) 6, 6, 6);
      assertEquals(6.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      float float0 = MathUtils.round(5.0F, 2556, 5);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      float float0 = MathUtils.round((-1507.7245F), 2239, 3);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      float float0 = MathUtils.round((float) 1024, 1024, 2);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round((float) (-7), (-7), (-7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid rounding method.
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.round(1.0F, (-1), 7);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Inexact result from rounding
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      float float0 = MathUtils.round((float) 5, 5, 5);
      assertEquals(5.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      float float0 = MathUtils.round((float) 3, 241, 3);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      float float0 = MathUtils.round((float) 1, 1, 1);
      assertEquals(0.9F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      double double0 = MathUtils.round(Double.POSITIVE_INFINITY, 209, 209);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      double double0 = MathUtils.round(Double.NaN, 2965, 2965);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.5, (-881.66));
      assertEquals(0.49999999999999994, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0.49999999999999994, 1418.0400390625);
      assertEquals(0.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      float float0 = MathUtils.round((-1496.829F), 2, 2);
      assertEquals((-1496.82F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      double double0 = MathUtils.nextAfter(0, Double.NEGATIVE_INFINITY);
      assertEquals((-4.9E-324), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      float float0 = MathUtils.round((float) 0, 0, 0);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      float float0 = MathUtils.round((float) 0, 258, 0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(9223372036854775807L, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) 0, (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((-1L), 1885L);
      assertEquals((-1885L), long0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((long) 0, (-1195L));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck((-3987L), (-3987L));
      assertEquals(15896169L, long0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-5107548160L), (-5107548160L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(9218868437227405312L, (-2986L));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: multiply
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      long long0 = MathUtils.mulAndCheck(32L, 32L);
      assertEquals(1024L, long0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck((-1994752), (-1994752));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.mulAndCheck(1802231, (-2147483647));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: mul
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      short short0 = MathUtils.indicator((short)3130);
      assertEquals((short)1, short0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      short short0 = MathUtils.indicator((short) (-1089));
      assertEquals((short) (-1), short0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      long long0 = MathUtils.indicator(1718L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      long long0 = MathUtils.indicator((-3201L));
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      int int0 = MathUtils.indicator(1024);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      int int0 = MathUtils.indicator((-21));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      float float0 = MathUtils.round(Float.NaN, 6, 6);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      double double0 = MathUtils.indicator((double) 0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      double double0 = MathUtils.indicator(Double.NaN);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      double double0 = MathUtils.indicator((-2.5301331577033017));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte)45);
      assertEquals((byte)1, byte0);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      byte byte0 = MathUtils.indicator((byte) (-1));
      assertEquals((byte) (-1), byte0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      int int0 = MathUtils.hash((double[]) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      int int0 = MathUtils.gcd((-1252), (-2783));
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      int int0 = MathUtils.gcd(32, 32);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      int int0 = MathUtils.gcd(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialLog((-32));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n > 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorialDouble((short) (-1089));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for n!
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.factorial(441);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      long long0 = MathUtils.factorial(0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[1];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      doubleArray1[0] = (double) 1;
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(boolean0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {1.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertEquals(1, doubleArray0.length);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[1];
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray1);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertFalse(boolean0);
      assertArrayEquals(new double[] {}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertEquals(0, doubleArray0.length);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      boolean boolean0 = MathUtils.equals((double[]) null, (double[]) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      boolean boolean0 = MathUtils.equals(doubleArray0, (double[]) null);
      assertFalse(boolean0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      double[] doubleArray0 = new double[10];
      boolean boolean0 = MathUtils.equals((double[]) null, doubleArray0);
      assertFalse(boolean0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(10, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, Double.NaN);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      boolean boolean0 = MathUtils.equals(Double.NaN, 0.0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      boolean boolean0 = MathUtils.equals(doubleArray0, doubleArray0);
      assertTrue(boolean0);
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(2, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(0, (-1));
      assertEquals(Double.NEGATIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(399, 1);
      assertEquals(5.988961416889864, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientLog(5, 0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientLog((-1), (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficientDouble((-1444), 640);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(2435, 32);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // result too large to represent in a long integer
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(5, (-1758));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(2412, 1);
      assertEquals(2412L, long0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(7, 0);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(2435, 2435);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient((-2135), (-2135));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= 0 for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.binomialCoefficient(9, 1173);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // must have n >= k for binomial coefficient (n,k)
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      long long0 = MathUtils.binomialCoefficient(0, (-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(9223372036854775807L, 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.subAndCheck((-2147482748L), 9223372036854775807L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: subtract
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      long long0 = MathUtils.subAndCheck(2258L, 2258L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      long long0 = MathUtils.subAndCheck(1174L, (long) 0);
      assertEquals(1174L, long0);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      int int0 = MathUtils.addAndCheck(1034, 1034);
      assertEquals(2068, int0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck(1073741839, 1073741839);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathUtils.addAndCheck((-2146998799), (-2146998799));
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // overflow: add
         //
         verifyException("org.apache.commons.math.util.MathUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      double double0 = MathUtils.log((-1493.6177), 1126.8433239891342);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      double double0 = MathUtils.round((double) (-2514), (-2514));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      double double0 = MathUtils.cosh((-12));
      assertEquals(81377.39571257407, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      float float0 = MathUtils.round(2.6129866F, 6);
      assertEquals(2.612987F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      double double0 = MathUtils.binomialCoefficientDouble(8, 8);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      double double0 = MathUtils.normalizeAngle((-1.251249704401146), (-1.251249704401146));
      assertEquals((-1.251249704401146), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      double double0 = MathUtils.sinh(1.0);
      assertEquals(1.1752011936438014, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      long long0 = MathUtils.addAndCheck((-3987L), (-3987L));
      assertEquals((-7974L), long0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      float float0 = MathUtils.round(2.5537288F, 6, 6);
      assertEquals(2.553729F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      int int0 = MathUtils.lcm(1013, 1013);
      assertEquals(1013, int0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      int int0 = MathUtils.hash(doubleArray0);
      assertEquals(1922, int0);
  }
}
