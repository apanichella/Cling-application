/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 12:58:44 GMT 2019
 */

package org.mockito.cglib.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.cglib.util.ParallelSorter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ParallelSorter_ESTest extends ParallelSorter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = (-18.13831566966007);
      ParallelSorter.DoubleComparer parallelSorter_DoubleComparer0 = new ParallelSorter.DoubleComparer(doubleArray0);
      int int0 = parallelSorter_DoubleComparer0.compare(1, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[1] = 1829.6936589368017;
      ParallelSorter.DoubleComparer parallelSorter_DoubleComparer0 = new ParallelSorter.DoubleComparer(doubleArray0);
      int int0 = parallelSorter_DoubleComparer0.compare(1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      float[] floatArray0 = new float[3];
      floatArray0[0] = 1.0F;
      ParallelSorter.FloatComparer parallelSorter_FloatComparer0 = new ParallelSorter.FloatComparer(floatArray0);
      int int0 = parallelSorter_FloatComparer0.compare(1, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      float[] floatArray0 = new float[3];
      floatArray0[1] = 1.0F;
      ParallelSorter.FloatComparer parallelSorter_FloatComparer0 = new ParallelSorter.FloatComparer(floatArray0);
      int int0 = parallelSorter_FloatComparer0.compare(1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      long[] longArray0 = new long[16];
      longArray0[1] = (long) 1;
      ParallelSorter.LongComparer parallelSorter_LongComparer0 = new ParallelSorter.LongComparer(longArray0);
      int int0 = parallelSorter_LongComparer0.compare(1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      long[] longArray0 = new long[5];
      longArray0[0] = (long) 1;
      ParallelSorter.LongComparer parallelSorter_LongComparer0 = new ParallelSorter.LongComparer(longArray0);
      int int0 = parallelSorter_LongComparer0.compare(1, 0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ParallelSorter.Generator parallelSorter_Generator0 = new ParallelSorter.Generator();
      // Undeclared exception!
      try { 
        parallelSorter_Generator0.nextInstance(parallelSorter_Generator0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mockito.cglib.util.ParallelSorter$Generator cannot be cast to org.mockito.cglib.util.ParallelSorter
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ParallelSorter.Generator parallelSorter_Generator0 = new ParallelSorter.Generator();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        parallelSorter_Generator0.firstInstance(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.mockito.cglib.util.ParallelSorter
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      ParallelSorter.DoubleComparer parallelSorter_DoubleComparer0 = new ParallelSorter.DoubleComparer(doubleArray0);
      int int0 = parallelSorter_DoubleComparer0.compare(1, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      short[] shortArray0 = new short[15];
      ParallelSorter.ShortComparer parallelSorter_ShortComparer0 = new ParallelSorter.ShortComparer(shortArray0);
      // Undeclared exception!
      try { 
        parallelSorter_ShortComparer0.compare((short)1168, (short)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1168
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$ShortComparer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      float[] floatArray0 = new float[3];
      ParallelSorter.FloatComparer parallelSorter_FloatComparer0 = new ParallelSorter.FloatComparer(floatArray0);
      int int0 = parallelSorter_FloatComparer0.compare(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[6];
      ParallelSorter.IntComparer parallelSorter_IntComparer0 = new ParallelSorter.IntComparer(intArray0);
      // Undeclared exception!
      try { 
        parallelSorter_IntComparer0.compare((-578), (-578));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -578
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$IntComparer", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      ParallelSorter.ObjectComparer parallelSorter_ObjectComparer0 = new ParallelSorter.ObjectComparer(objectArray0);
      // Undeclared exception!
      try { 
        parallelSorter_ObjectComparer0.compare((-2504), (-2504));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2504
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$ObjectComparer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      long[] longArray0 = new long[5];
      ParallelSorter.LongComparer parallelSorter_LongComparer0 = new ParallelSorter.LongComparer(longArray0);
      int int0 = parallelSorter_LongComparer0.compare(1, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ParallelSorter.ByteComparer parallelSorter_ByteComparer0 = new ParallelSorter.ByteComparer(byteArray0);
      int int0 = parallelSorter_ByteComparer0.compare((byte)0, (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ParallelSorter.ComparatorComparer parallelSorter_ComparatorComparer0 = new ParallelSorter.ComparatorComparer((Object[]) null, (Comparator) null);
      // Undeclared exception!
      try { 
        parallelSorter_ComparatorComparer0.compare(3133, 3133);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$ComparatorComparer", e);
      }
  }
}
