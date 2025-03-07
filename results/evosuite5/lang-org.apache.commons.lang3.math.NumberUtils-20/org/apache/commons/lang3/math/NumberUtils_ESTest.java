/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:11:35 GMT 2019
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
      boolean boolean0 = NumberUtils.isNumber("L");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("2l");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("f");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0Ed");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("..");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".0E");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("e");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".0E8");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("--gtAPl};E6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("+g?)[{[tc7Xi\"v");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber(".E8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0eE8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("x9w32kby");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("...");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0x3");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x+g?)[{[tc7Xi\"v");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xD");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-0x");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0xfbLM5");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("4e.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("-F");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      boolean boolean0 = NumberUtils.isNumber("0E.8");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      boolean boolean0 = NumberUtils.isDigits((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-89), (byte) (-89), (byte) (-29));
      assertEquals((byte) (-29), byte0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      byte byte0 = NumberUtils.max((byte) (-89), (byte) (-23), (byte) (-29));
      assertEquals((byte) (-23), byte0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      short short0 = NumberUtils.max((short)48, (short)48, (short)1172);
      assertEquals((short)1172, short0);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      short short0 = NumberUtils.max((short) (-21534), (short)0, (short) (-21534));
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      int int0 = NumberUtils.max((-2643), 780, 1973);
      assertEquals(1973, int0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      int int0 = NumberUtils.max((-2643), 1966, (-2643));
      assertEquals(1966, int0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      int int0 = NumberUtils.max(1177, (int) (short) (-3773), (int) (byte)0);
      assertEquals(1177, int0);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      long long0 = NumberUtils.max((long) 1973, 2471L, (long) (-2643));
      assertEquals(2471L, long0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      long long0 = NumberUtils.max(0L, 0L, 187L);
      assertEquals(187L, long0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte)105, (byte)2, (byte)105);
      assertEquals((byte)2, byte0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      byte byte0 = NumberUtils.min((byte) (-1), (byte)104, (byte) (-18));
      assertEquals((byte) (-18), byte0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      short short0 = NumberUtils.min((short)1377, (short)1377, (short)68);
      assertEquals((short)68, short0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      short short0 = NumberUtils.min((short)101, (short)0, (short)101);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      int int0 = NumberUtils.min(1012, 2721, 13);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      int int0 = NumberUtils.min(5610, (int) (byte)0, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      long long0 = NumberUtils.min(1285L, (-2360L), 1285L);
      assertEquals((-2360L), long0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      long long0 = NumberUtils.min(1285L, 1285L, 185L);
      assertEquals(185L, long0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[2] = 230.515F;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(230.515F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      float[] floatArray0 = new float[5];
      floatArray0[4] = Float.NaN;
      float float0 = NumberUtils.max(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
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
  public void test048()  throws Throwable  {
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
  public void test049()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[3] = 668.0;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(668.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[4] = Double.NaN;
      double double0 = NumberUtils.max(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
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
  public void test052()  throws Throwable  {
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
  public void test053()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[5] = (byte)5;
      byte byte0 = NumberUtils.max(byteArray0);
      assertEquals((byte)5, byte0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
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
  public void test055()  throws Throwable  {
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
  public void test056()  throws Throwable  {
      short[] shortArray0 = new short[3];
      shortArray0[0] = (short) (-3334);
      short short0 = NumberUtils.max(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
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
  public void test058()  throws Throwable  {
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
  public void test059()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = 32;
      int int0 = NumberUtils.max(intArray0);
      assertEquals(32, int0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
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
  public void test061()  throws Throwable  {
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
  public void test062()  throws Throwable  {
      long[] longArray0 = new long[19];
      longArray0[1] = 1334L;
      long long0 = NumberUtils.max(longArray0);
      assertEquals(1334L, long0);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
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
  public void test064()  throws Throwable  {
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
  public void test065()  throws Throwable  {
      float[] floatArray0 = new float[6];
      floatArray0[0] = 4187.2F;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      float[] floatArray0 = new float[6];
      floatArray0[2] = Float.NaN;
      float float0 = NumberUtils.min(floatArray0);
      assertEquals(Float.NaN, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
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
  public void test068()  throws Throwable  {
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
  public void test069()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = Double.NaN;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
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
  public void test072()  throws Throwable  {
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
  public void test073()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-89);
      byte byte0 = NumberUtils.min(byteArray0);
      assertEquals((byte) (-89), byte0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
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
  public void test075()  throws Throwable  {
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
  public void test076()  throws Throwable  {
      short[] shortArray0 = new short[7];
      shortArray0[0] = (short)32084;
      short short0 = NumberUtils.min(shortArray0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
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
  public void test078()  throws Throwable  {
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
  public void test079()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = (int) (short)5;
      int int0 = NumberUtils.min(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
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
  public void test081()  throws Throwable  {
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
  public void test082()  throws Throwable  {
      long[] longArray0 = new long[9];
      longArray0[8] = (-2360L);
      long long0 = NumberUtils.min(longArray0);
      assertEquals((-2360L), long0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
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
  public void test084()  throws Throwable  {
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
  public void test085()  throws Throwable  {
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
  public void test086()  throws Throwable  {
      BigDecimal bigDecimal0 = NumberUtils.createBigDecimal((String) null);
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      BigInteger bigInteger0 = NumberUtils.createBigInteger((String) null);
      assertNull(bigInteger0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Long long0 = NumberUtils.createLong((String) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Integer integer0 = NumberUtils.createInteger((String) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Double double0 = NumberUtils.createDouble((String) null);
      assertNull(double0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Float float0 = NumberUtils.createFloat((String) null);
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      try { 
        NumberUtils.createNumber("?XY'z>@!L^T\"k2");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"?XY'z\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Number number0 = NumberUtils.createNumber(".2");
      assertEquals(0.2F, number0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("3D");
      assertEquals(3.0, number0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-/%/yL");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // -/%/yL is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("-2L");
      assertEquals((-2L), number0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
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
  public void test098()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("2l");
      assertEquals(2L, number0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      try { 
        NumberUtils.createNumber("SecurityExcept}on occurred");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // SecurityExcept}on occurred is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("6F");
      assertEquals(6.0F, number0);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0D");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0E");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0E is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0E8");
      assertEquals((byte)0, number0.byteValue());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      try { 
        NumberUtils.createNumber(":!{do|5;)#ie\"4HkjEf");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // :!{do|5;)#ie\"4HkjEf is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0EL Zd}t");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // 0EL Zd}t is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      try { 
        NumberUtils.createNumber("T*TBtmeXF7wWEJ(OK.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // T*TBtmeXF7wWEJ(OK. is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      try { 
        NumberUtils.createNumber(" is not a valid number.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         //  is not a valid number. is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      try { 
        NumberUtils.createNumber(".f&;n>Q?9sd8P[;L");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // .f&;n>Q?9sd8P[;L is not a valid number.
         //
         verifyException("org.apache.commons.lang3.math.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      try { 
        NumberUtils.createNumber("T*TBtmeXF7wWEJ<(OK.");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      try { 
        NumberUtils.createNumber("-0xThe stripAccents(CharSequence) method requires at least Java 1.6 or a Sun JVM");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"-The stripAccents(CharSequence) method requires at least Java 1.6 or a Sun JVM\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      try { 
        NumberUtils.createNumber("0xsun.tex%NoraliUer");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"sun.tex%NoraliUer\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("--");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      Number number0 = NumberUtils.createNumber("0f");
      assertEquals((short)0, number0.shortValue());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      Number number0 = NumberUtils.createNumber((String) null);
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
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
  public void test116()  throws Throwable  {
      short short0 = NumberUtils.toShort((String) null, (short)0);
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      byte byte0 = NumberUtils.toByte(">Ks[!tfAF*yL");
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      double double0 = NumberUtils.toDouble("%]&8~{3/H%cOST2qd", (-1430.0674190758582));
      assertEquals((-1430.0674190758582), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      float float0 = NumberUtils.toFloat((String) null);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      long long0 = NumberUtils.toLong("=h");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      int int0 = NumberUtils.toInt("--sun.text.Normalizer", (-2775));
      assertEquals((-2775), int0);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      short short0 = NumberUtils.toShort("x9w32kby");
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      float float0 = NumberUtils.toFloat("");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      int int0 = NumberUtils.toInt((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      double double0 = NumberUtils.max((double) (short) (-4276), (double) (short) (-4276), (double) (byte)102);
      assertEquals(102.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      byte byte0 = NumberUtils.toByte((String) null);
      assertEquals((byte)0, byte0);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
      double[] doubleArray0 = new double[6];
      doubleArray0[4] = (double) (int)numberUtils0.INTEGER_MINUS_ONE;
      double double0 = NumberUtils.min(doubleArray0);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      double double0 = NumberUtils.min((double) (short)0, (double) (short)0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      double double0 = NumberUtils.toDouble((String) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      float float0 = NumberUtils.min(1.0F, 0.0F, 3116.2314F);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      float float0 = NumberUtils.max((float) 0L, 0.0F, (float) (short)0);
      assertEquals(0.0F, float0, 0.01F);
  }
}
