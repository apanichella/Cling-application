/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:09:54 GMT 2019
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5L");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("l");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("7E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("3");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--org.apache.commons.lang3.math.NumberUtils");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5e+r");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("Eu~\"-G1F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5EeaF$xI _ESaOz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("..");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("5er");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x5D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x! s80M)fzWGOy@BA*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xf");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0/xZsqetyz");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0xpVa{- Hm^<j");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)9, (byte) (-16), (byte)74);
      assertEquals((byte)74, byte0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte)10, (byte)120, (byte)10);
      assertEquals((byte)120, byte0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-3), (short) (byte)64, (short)2170);
      assertEquals((short)2170, short0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-1120), (short) (-1120), (short) (-1120));
      assertEquals((short) (-1120), short0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      int int0 = NumberUtils.max((int) (byte) (-125), (int) (byte)10, (int) (byte)10);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      int int0 = NumberUtils.max((-1919), (-3160), 21);
      assertEquals(21, int0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      long long0 = NumberUtils.max((long) (byte)101, 0L, (long) (byte)118);
      assertEquals(118L, long0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      long long0 = NumberUtils.max((-2548L), (-978L), (-978L));
      assertEquals((-978L), long0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)120, (byte) (-108), (byte)120);
      assertEquals((byte) (-108), byte0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)114, (byte)114, (byte)7);
      assertEquals((byte)7, byte0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      short short0 = NumberUtils.min((short)1423, (short)2, (short)1423);
      assertEquals((short)2, short0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      short short0 = NumberUtils.min((short) (byte)76, (short)2074, (short)69);
      assertEquals((short)69, short0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      int int0 = NumberUtils.min((int) (byte)114, (-18), (int) (byte)114);
      assertEquals((-18), int0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      int int0 = NumberUtils.min(70, (int) (byte)76, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      long long0 = NumberUtils.min(3942L, (-1827L), (-1827L));
      assertEquals((-1827L), long0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      long long0 = NumberUtils.min((long) numberUtils0.INTEGER_ZERO, (long) numberUtils0.LONG_ZERO, (-893L));
      assertEquals((-893L), long0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[2] = 1053.93F;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(1053.93F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[4] = Float.NaN;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 3539.1653335331366;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(3539.1653335331366, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[3] = Double.NaN;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[2] = (byte)101;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)101, byte0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      short[] shortArray0 = new short[15];
      shortArray0[0] = (short) (-4183);
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      int[] intArray0 = new int[19];
      intArray0[1] = 113;
      int int0 = NumberUtils.max(intArray0);
      assertEquals(113, int0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[2] = 3019L;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(3019L, long0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.max(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.max((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[4] = (-1.0F);
      float float0 = NumberUtils.min(floatArray0);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[4] = Float.NaN;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(floatArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((float[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      double[] doubleArray0 = new double[19];
      doubleArray0[1] = (-270.6540904208405);
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals((-270.6540904208405), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[1] = Double.NaN;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((double[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte) (-108);
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-108), byte0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((byte[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      short[] shortArray0 = new short[5];
      shortArray0[0] = (short)3140;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      short[] shortArray0 = new short[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(shortArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((short[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 10;
      int int0 = NumberUtils.min(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((int[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      long[] longArray0 = new long[9];
      longArray0[1] = (-2866L);
      long long0 = NumberUtils.min(longArray0);
      assertEquals((-2866L), long0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      long[] longArray0 = new long[0];
      // Undeclared exception!
      try { 
        NumberUtils.min(longArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Array cannot be empty.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.min((long[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Array must not be null
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Number number0 = NumberUtils.createNumber(".5");
      assertEquals(0.5F, number0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      try { 
        NumberUtils.createNumber("DB5zwe3");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("5D");
      assertEquals(5.0, number0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("5F");
      assertEquals(5.0F, number0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-[IL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -[IL is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("5L");
      assertEquals(5L, number0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      try { 
        NumberUtils.createNumber("Q)}d&71^`W.3\u0000hn:&L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // Q)}d&71^`W.3\u0000hn:&L is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      try { 
        NumberUtils.createNumber("The Array must not be null");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The Array must not be null is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      try { 
        NumberUtils.createNumber("f");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // f is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      try { 
        NumberUtils.createNumber("IllegalArgumentException occurred");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // IllegalArgumentException occurred is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0F");
      assertEquals((byte)0, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0eIVe+8nPDg");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0eIVe+8nPDg is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0e");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0e is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      try { 
        NumberUtils.createNumber("..");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      try { 
        NumberUtils.createNumber("&>4KEaR#s>kL{,X+Ie7");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // &>4KEaR#s>kL{,X+Ie7 is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      try { 
        NumberUtils.createNumber("JM~e5#4(E\"}1");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"JM~\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      try { 
        NumberUtils.createNumber("hcAj.eyX/A1X>");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // hcAj.eyX/A1X> is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      try { 
        NumberUtils.createNumber("The stripAccents(CharSequence) method requires at least Java 1.6 or a Sun JVM");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // The stripAccents(CharSequence) method requires at least Java 1.6 or a Sun JVM is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      try { 
        NumberUtils.createNumber("W.MLK{h#!eCUE}a?N");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // W.MLK{h#!eCUE}a?N is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-4L");
      assertEquals((-4L), number0);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0xhw.M/87vgE");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-hw.M/87vgE\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0xJd& 1eQ");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"Jd& 1eQ\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--org.apache.commons.lang3.math.NumberUtils");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      Number number0 = NumberUtils.createNumber(".0");
      assertEquals((byte)0, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      try { 
        NumberUtils.createNumber("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // A blank string is not a valid number
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null, (short) (-48));
      assertEquals((short) (-48), short0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      double double0 = NumberUtils.toDouble("...");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      long long0 = NumberUtils.toLong((String) null, (long) numberUtils0.SHORT_MINUS_ONE);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      int int0 = NumberUtils.toInt("", (int) (byte)118);
      assertEquals(118, int0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      short short0 = NumberUtils.toShort("--");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      float float0 = NumberUtils.toFloat("");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      int int0 = NumberUtils.toInt((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      long long0 = NumberUtils.toLong("--NFD");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      byte byte0 = NumberUtils.toByte("8FEUY2eC\"M");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      double double0 = NumberUtils.max((double) numberUtils0.BYTE_MINUS_ONE, (double) numberUtils0.BYTE_ONE, (double) numberUtils0.INTEGER_ONE);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      double double0 = NumberUtils.min(4.533264107769289, 4.533264107769289, 4.533264107769289);
      assertEquals(4.533264107769289, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      float float0 = NumberUtils.min((float) (-2959L), (float) (-2959L), (float) (-2959L));
      assertEquals((-2959.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      float float0 = NumberUtils.max((float) (byte)9, 9.0F, 76.0F);
      assertEquals(76.0F, float0, 0.01F);
  }
}
