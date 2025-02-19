/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:58:49 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ToStringBuilder_ESTest extends ToStringBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) toStringBuilder0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("K9}1VU@$rSusZ<oO70");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("xQune20l0", toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("xQune20l0");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString((String) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("K9}1VU@$rSusZ<oO70");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("xQune20l0", toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("");
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer((-811));
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ToStringBuilder.setDefaultStyle((ToStringStyle) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The style must not be null
         //
         verifyException("org.apache.commons.lang3.builder.ToStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      ToStringBuilder.setDefaultStyle(toStringStyle0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("h+q-");
      double[] doubleArray0 = new double[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer((-32));
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((Object) integer0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      long[] longArray0 = new long[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("O'E;a", longArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(46);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0, standardToStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((byte)0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0);
      float[] floatArray0 = new float[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(floatArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((-2603));
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("K9}1VU@$rSusZ<oO70");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("xQune20l0", toStringStyle0, stringBuffer0);
      short[] shortArray0 = new short[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", shortArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("'[ )sZ*GJe*fM@&", (ToStringStyle) null, stringBuffer0);
      Object[] objectArray0 = new Object[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("&>'TC^e*n?4Pm$", objectArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("'[ )sZ*GJe*fM@&", (boolean[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringBuilder", (short)0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("K9}1VU@$rSusZ<oO70");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("xQune20l0", toStringStyle0, stringBuffer0);
      int[] intArray0 = new int[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(intArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      String string0 = ToStringBuilder.reflectionToString((Object) "xQune20l0", toStringStyle0, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("NKL[-:xiQK>2!g3A", 3233L);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(46);
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0, standardToStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", (char[]) null, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      String string0 = ToStringBuilder.reflectionToString((Object) toStringBuilder0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      boolean[] booleanArray0 = new boolean[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", booleanArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("K9}1VU@$rSusZ<oO70");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("xQune20l0", toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("1O.1FBveq7a}0", (float[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer(1);
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      Class<Object> class0 = Object.class;
      String string0 = ToStringBuilder.reflectionToString(integer0, toStringStyle0, false, (Class<? super Integer>) class0);
      //  // Unstable assertion: assertEquals("1,1", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder((Object) null);
      // Undeclared exception!
      try { 
        toStringBuilder0.appendAsObjectToString((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot get the toString of a null identity
         //
         verifyException("org.apache.commons.lang3.ObjectUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      long[] longArray0 = new long[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("O'E;a", longArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("8`pT,", (byte)0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("K9}1VU@$rSusZ<oO70");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("xQune20l0", toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("1O.1FBveq7a}0", ']');
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      char[] charArray0 = new char[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("Solaris", charArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("The style must not be null");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("The style must not be null", toStringStyle0, stringBuffer0);
      toStringBuilder0.append("org.apache.commons.lang3.builder.ToStringBuilder", (-1.0F));
      assertEquals(99, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Integer integer0 = new Integer((-811));
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0, toStringStyle0);
      double[] doubleArray0 = new double[5];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("java.awt.headless", doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test32()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("K9}1VU@$rSusZ<oO70");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("xQune20l0", toStringStyle0, stringBuffer0);
      toStringBuilder0.append("K9}1VU@$rSusZ<oO70", false);
      assertEquals(62, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("z!]XEW*d", (double) 1902);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("K9}1VU@$rSusZ<oO70");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("xQune20l0", toStringStyle0, stringBuffer0);
      byte[] byteArray0 = new byte[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      int[] intArray0 = new int[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("WtWEh)v*ilY@;6#`-d", intArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Integer integer0 = new Integer(610);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      double[] doubleArray0 = new double[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("[C`rI1", doubleArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("K9}1VU@$rSusZ<oO70");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("xQune20l0", toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append('l');
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      short[] shortArray0 = new short[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(shortArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(toStringStyle0, toStringStyle0);
      short[] shortArray0 = new short[6];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("NKL[-:xiQK>2!g3A", shortArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("K9}1VU@$rSusZ<oO70");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("xQune20l0", toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, (float[]) null, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      boolean[] booleanArray0 = new boolean[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(booleanArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("lvPGw#=k", (Object) toStringBuilder0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      long[] longArray0 = new long[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(longArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Integer integer0 = new Integer((-4027));
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0, toStringStyle0);
      byte[] byteArray0 = new byte[7];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("K", byteArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Integer integer0 = new Integer(610);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((short)6489);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("K9}1VU@$rSusZ<oO70");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("xQune20l0", toStringStyle0, stringBuffer0);
      toStringBuilder0.append((String) null, 48);
      assertEquals(40, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      StringBuffer stringBuffer0 = new StringBuffer(3);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("org.apache.commons.lang3.builder.ToStringBuilder", toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((long) (short)0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("'[ )sZ*GJe*fM@&", (ToStringStyle) null, stringBuffer0);
      Object[] objectArray0 = new Object[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("user.region", objectArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      String string0 = ToStringBuilder.reflectionToString((Object) null, toStringStyle0);
      assertEquals("<null>", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("The style must not be null");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("The style must not be null", toStringStyle0, stringBuffer0);
      byte[] byteArray0 = new byte[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(integer0);
      int[] intArray0 = new int[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("'[ )sZ*GJe*fM@&", intArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test53()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.DEFAULT_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("K9}1VU@$rSusZ<oO70");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("xQune20l0", toStringStyle0, stringBuffer0);
      toStringBuilder0.append((-106.39812414071477));
      assertEquals(57, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test54()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0, stringBuffer0);
      toStringBuilder0.build();
      assertEquals(20, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(0.0F);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((char[]) null);
      assertSame(toStringBuilder1, toStringBuilder0);
  }
}
