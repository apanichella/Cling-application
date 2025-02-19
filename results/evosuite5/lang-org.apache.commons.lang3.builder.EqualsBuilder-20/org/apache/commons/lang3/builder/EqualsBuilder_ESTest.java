/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 16:48:02 GMT 2019
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;
import org.apache.commons.lang3.Pair;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.IDKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EqualsBuilder_ESTest extends EqualsBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      boolean[] booleanArray0 = new boolean[2];
      boolean[] booleanArray1 = new boolean[2];
      booleanArray1[0] = true;
      equalsBuilder0.append(booleanArray0, booleanArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      boolean[] booleanArray0 = new boolean[4];
      equalsBuilder0.append(booleanArray0, (boolean[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      boolean[] booleanArray0 = new boolean[17];
      equalsBuilder0.append((boolean[]) null, booleanArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean[] booleanArray0 = new boolean[4];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(booleanArray0, booleanArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(1383L, (long) (byte) (-27));
      boolean[] booleanArray0 = new boolean[3];
      equalsBuilder1.append(booleanArray0, booleanArray0);
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      float[] floatArray0 = new float[3];
      float[] floatArray1 = new float[3];
      floatArray1[0] = (float) (byte)105;
      equalsBuilder0.append(floatArray1, floatArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      float[] floatArray0 = new float[1];
      float[] floatArray1 = new float[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray0, floatArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      float[] floatArray0 = new float[3];
      float[] floatArray1 = new float[2];
      equalsBuilder0.append(floatArray0, floatArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      float[] floatArray0 = new float[1];
      equalsBuilder0.append((float[]) null, floatArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      float[] floatArray0 = new float[3];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(floatArray0, floatArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      float[] floatArray0 = new float[0];
      equalsBuilder0.append(floatArray0, (float[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) (byte) (-1);
      double[] doubleArray1 = new double[2];
      equalsBuilder0.append(doubleArray0, doubleArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[0];
      equalsBuilder0.append(doubleArray0, doubleArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      double[] doubleArray0 = new double[3];
      equalsBuilder0.append(doubleArray0, (double[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      double[] doubleArray0 = new double[1];
      equalsBuilder0.append((double[]) null, doubleArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = new double[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(doubleArray0, doubleArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.appendSuper(false);
      double[] doubleArray0 = new double[0];
      equalsBuilder1.append(doubleArray0, doubleArray0);
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      double[] doubleArray0 = new double[3];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(doubleArray0, doubleArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)10;
      byte[] byteArray1 = new byte[8];
      equalsBuilder0.append(byteArray0, byteArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = new byte[8];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray1);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append(byteArray0, (byte[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      byte[] byteArray0 = new byte[4];
      equalsBuilder0.append((byte[]) null, byteArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      byte[] byteArray0 = new byte[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      byte[] byteArray1 = new byte[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(byteArray0, byteArray1);
      equalsBuilder1.append(byteArray0, (byte[]) null);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      char[] charArray0 = new char[3];
      equalsBuilder0.append(charArray0, (char[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      char[] charArray0 = new char[5];
      equalsBuilder0.append((char[]) null, charArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[6];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, (Object[]) null);
      equalsBuilder1.append((char[]) null, (char[]) null);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[4];
      shortArray0[1] = (short) (-1693);
      short[] shortArray1 = new short[4];
      equalsBuilder0.append(shortArray0, shortArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      short[] shortArray0 = new short[1];
      short[] shortArray1 = new short[17];
      equalsBuilder0.append(shortArray0, shortArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[3];
      equalsBuilder0.append(shortArray0, (short[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      short[] shortArray0 = new short[1];
      equalsBuilder0.append((short[]) null, shortArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      short[] shortArray0 = new short[4];
      short[] shortArray1 = new short[4];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, shortArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      boolean[] booleanArray0 = new boolean[17];
      boolean[] booleanArray1 = new boolean[12];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(booleanArray0, booleanArray1);
      equalsBuilder1.append((short[]) null, (short[]) null);
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      short[] shortArray0 = new short[4];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(shortArray0, shortArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      int[] intArray0 = new int[7];
      intArray0[0] = (int) (byte)2;
      int[] intArray1 = new int[7];
      equalsBuilder0.append(intArray0, intArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      int[] intArray0 = new int[7];
      int[] intArray1 = new int[7];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(intArray0, intArray1);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      int[] intArray0 = new int[0];
      int[] intArray1 = new int[9];
      equalsBuilder0.append(intArray0, intArray1);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      int[] intArray0 = new int[5];
      equalsBuilder0.append(intArray0, (int[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      int[] intArray0 = new int[1];
      equalsBuilder0.append((int[]) null, intArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      int[] intArray0 = new int[0];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(intArray0, intArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      byte[] byteArray1 = new byte[1];
      equalsBuilder0.append(byteArray0, byteArray1);
      int[] intArray0 = new int[0];
      equalsBuilder0.append(intArray0, intArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      long[] longArray0 = new long[1];
      long[] longArray1 = new long[1];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray1, longArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[1];
      long[] longArray1 = new long[0];
      equalsBuilder0.append(longArray1, longArray0);
      float[] floatArray0 = new float[2];
      equalsBuilder0.append(floatArray0, floatArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      long[] longArray0 = new long[1];
      equalsBuilder0.append(longArray0, (long[]) null);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      long[] longArray0 = new long[2];
      equalsBuilder0.append((long[]) null, longArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      long[] longArray0 = new long[1];
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(longArray0, longArray0);
      assertTrue(equalsBuilder1.isEquals());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      equalsBuilder0.appendSuper(false);
      equalsBuilder0.append((long[]) null, (long[]) null);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      String[] stringArray0 = new String[0];
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      equalsBuilder0.append((Object[]) stringArray0, objectArray0);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[3];
      equalsBuilder0.append((Object[]) null, objectArray0);
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[2];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, objectArray0);
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(',', '+');
      Object[] objectArray0 = new Object[4];
      equalsBuilder1.append(objectArray0, objectArray0);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      boolean[] booleanArray0 = new boolean[2];
      booleanArray0[1] = true;
      boolean[] booleanArray1 = new boolean[2];
      equalsBuilder0.append(booleanArray0, booleanArray1);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Object object0 = new Object();
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((Object) "", object0);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append((-2392.05F), (-446.0F));
      assertSame(equalsBuilder1, equalsBuilder2);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object[] objectArray0 = new Object[6];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, (Object[]) null);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append(1.5, 1742.244488);
      assertFalse(equalsBuilder2.isEquals());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Object[] objectArray0 = new Object[6];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, (Object[]) null);
      equalsBuilder1.append((byte)85, (byte)85);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append('_', '_');
      assertTrue(equalsBuilder1.build());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      equalsBuilder0.append(',', ']');
      equalsBuilder0.append(',', ']');
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((-2392.05F), (-446.0F));
      equalsBuilder1.append((short)1055, (short)1055);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((short) (-1262), (short)5893);
      EqualsBuilder equalsBuilder2 = equalsBuilder1.append(true, false);
      assertFalse(equalsBuilder2.build());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Boolean boolean0 = new Boolean(" rPnKPP");
      Integer integer0 = new Integer(0);
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((Object) boolean0, (Object) integer0);
      equalsBuilder1.append(0, 0);
      assertFalse(equalsBuilder0.isEquals());
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.isEquals());
      
      Boolean boolean0 = new Boolean(" rPnKPP");
      Integer integer0 = new Integer(0);
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append((Object) boolean0, (Object) integer0);
      equalsBuilder1.append((long) 0, (long) 0);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      Object[] objectArray0 = new Object[6];
      EqualsBuilder equalsBuilder1 = equalsBuilder0.append(objectArray0, (Object[]) null);
      equalsBuilder1.append((Object) "6", objectArray0[4]);
      assertFalse(equalsBuilder0.build());
      assertFalse(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      assertTrue(equalsBuilder0.build());
      
      equalsBuilder0.append(0.0F, (-1.0F));
      equalsBuilder0.appendSuper(true);
      assertFalse(equalsBuilder0.build());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Object object0 = new Object();
      Set<Pair<IDKey, IDKey>> set0 = EqualsBuilder.getRegistry();
      //  // Unstable assertion: assertNotNull(set0);
      
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, (Object) set0);
      //  // Unstable assertion: assertEquals(14, set0.size());
      //  // Unstable assertion: assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      EqualsBuilder equalsBuilder1 = new EqualsBuilder();
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) equalsBuilder1, (Object) equalsBuilder0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Boolean boolean0 = new Boolean(false);
      boolean boolean1 = EqualsBuilder.reflectionEquals((Object) equalsBuilder0, (Object) boolean0);
      assertTrue(equalsBuilder0.build());
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) null, (Object) equalsBuilder0);
      assertFalse(boolean0);
      assertTrue(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      equalsBuilder0.reset();
      assertTrue(equalsBuilder0.isEquals());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Boolean boolean0 = equalsBuilder0.build();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object object0 = new Object();
      Class<IDKey> class0 = IDKey.class;
      boolean boolean0 = EqualsBuilder.reflectionEquals((Object) equalsBuilder0, object0, true, (Class<?>) class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Object object0 = new Object();
      Boolean boolean0 = Boolean.valueOf(true);
      boolean boolean1 = EqualsBuilder.reflectionEquals((Object) boolean0, object0, true);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      EqualsBuilder equalsBuilder0 = new EqualsBuilder();
      Object object0 = new Object();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = EqualsBuilder.reflectionEquals(object0, (Object) equalsBuilder0, (Collection<String>) linkedList0);
      assertFalse(boolean0);
      assertTrue(equalsBuilder0.isEquals());
  }
}
