/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 16:10:32 GMT 2019
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
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) toStringBuilder0;
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("user.timezone", objectArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendToString("(24>D^>w!weqS6nI");
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
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper("(24>D^>w!weqS6nI");
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendSuper((String) null);
      assertSame(toStringBuilder1, toStringBuilder0);
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
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      ToStringBuilder.setDefaultStyle(toStringStyle0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      double[] doubleArray0 = new double[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(doubleArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((Object) toStringBuilder0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0, stringBuffer0);
      long[] longArray0 = new long[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", longArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((byte) (-6));
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(">xe~@DZ");
      float[] floatArray0 = new float[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(floatArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((int) (short)1152);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      short[] shortArray0 = new short[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", shortArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      Object[] objectArray0 = new Object[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", objectArray0, false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      boolean[] booleanArray0 = new boolean[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", booleanArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, (short)0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      Object[] objectArray0 = new Object[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(objectArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      int[] intArray0 = new int[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(intArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Object object0 = new Object();
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      String string0 = ToStringBuilder.reflectionToString(object0, (ToStringStyle) standardToStringStyle0, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", 1L);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      char[] charArray0 = new char[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", charArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      String string0 = ToStringBuilder.reflectionToString((Object) toStringBuilder0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      boolean[] booleanArray0 = new boolean[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", booleanArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      float[] floatArray0 = new float[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("(24>D^>w!weqS6nI", floatArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      Class<Object> class0 = Object.class;
      String string0 = ToStringBuilder.reflectionToString((Object) "<null>", toStringStyle0, true, (Class<? super Object>) class0);
      //  // Unstable assertion: assertEquals("String[value={<,n,u,l,l,>},value={<,n,u,l,l,>},hash=1822929115]hash=1822929115,value={<,n,u,l,l,>},hash=1822929115]]", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.appendAsObjectToString(object0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      long[] longArray0 = new long[0];
      toStringBuilder0.append("U~-:~", longArray0, false);
      assertEquals(34, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", (byte)18);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", '8');
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      char[] charArray0 = new char[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(":V9}`fPxrTR;%_", charArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, 0.0F);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SIMPLE_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", (double[]) null);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", false);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("0ZWn", toStringStyle0, (StringBuffer) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, 814.82769019401);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer(0);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0, stringBuffer0);
      byte[] byteArray0 = new byte[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(")'{]I}8;I6{f${bV/Ho", byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("awt.toolkit");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      int[] intArray0 = new int[4];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("<", intArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("0ZWn", toStringStyle0, (StringBuffer) null);
      double[] doubleArray0 = new double[2];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, doubleArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.MULTI_LINE_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer(0);
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("", toStringStyle0, stringBuffer0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append('o');
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("0ZWn", toStringStyle0, (StringBuffer) null);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      short[] shortArray0 = new short[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(shortArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      short[] shortArray0 = new short[5];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("", shortArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      float[] floatArray0 = new float[7];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("org.apache.commons.lang3.builder.StandardToStringStyle", floatArray0, false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      boolean[] booleanArray0 = new boolean[3];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(booleanArray0);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("bEoeBA[3V[x.[C", (Object) "bEoeBA[3V[x.[C", false);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringBuilder.getDefaultStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      long[] longArray0 = new long[0];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(longArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      byte[] byteArray0 = new byte[5];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("=#N)-n%R>YLiqrs", byteArray0, true);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((short)1152);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((String) null, (int) (byte)70);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Object object0 = new Object();
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append((-2523L));
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      String string0 = ToStringBuilder.reflectionToString(object0, toStringStyle0);
      assertEquals("Object[]", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      byte[] byteArray0 = new byte[9];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(byteArray0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      int[] intArray0 = new int[1];
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append("PFpZ.i_", intArray0, true);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0);
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(0.0);
      assertSame(toStringBuilder0, toStringBuilder1);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      String string0 = toStringBuilder0.build();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ToStringBuilder toStringBuilder0 = new ToStringBuilder("");
      ToStringBuilder toStringBuilder1 = toStringBuilder0.append(0.0F);
      assertSame(toStringBuilder1, toStringBuilder0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test56()  throws Throwable  {
      Object object0 = new Object();
      ToStringStyle toStringStyle0 = ToStringStyle.NO_FIELD_NAMES_STYLE;
      StringBuffer stringBuffer0 = new StringBuffer("");
      ToStringBuilder toStringBuilder0 = new ToStringBuilder(object0, toStringStyle0, stringBuffer0);
      char[] charArray0 = new char[3];
      toStringBuilder0.append(charArray0);
      assertEquals(27, stringBuffer0.length());
  }
}
