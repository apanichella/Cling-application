/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 20:51:31 GMT 2019
 */

package org.mockito.cglib.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.cglib.util.ParallelSorter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ParallelSorter_ESTest extends ParallelSorter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[1] = 3607.127;
      ParallelSorter.DoubleComparer parallelSorter_DoubleComparer0 = new ParallelSorter.DoubleComparer(doubleArray0);
      int int0 = parallelSorter_DoubleComparer0.compare(0, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      ParallelSorter.DoubleComparer parallelSorter_DoubleComparer0 = new ParallelSorter.DoubleComparer(doubleArray0);
      int int0 = parallelSorter_DoubleComparer0.compare(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[21];
      doubleArray0[1] = 0.75;
      ParallelSorter.DoubleComparer parallelSorter_DoubleComparer0 = new ParallelSorter.DoubleComparer(doubleArray0);
      int int0 = parallelSorter_DoubleComparer0.compare(1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      float[] floatArray0 = new float[3];
      floatArray0[0] = 1.0F;
      ParallelSorter.FloatComparer parallelSorter_FloatComparer0 = new ParallelSorter.FloatComparer(floatArray0);
      int int0 = parallelSorter_FloatComparer0.compare(0, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      float[] floatArray0 = new float[3];
      ParallelSorter.FloatComparer parallelSorter_FloatComparer0 = new ParallelSorter.FloatComparer(floatArray0);
      int int0 = parallelSorter_FloatComparer0.compare(0, 1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      float[] floatArray0 = new float[17];
      floatArray0[0] = (-1.0F);
      ParallelSorter.FloatComparer parallelSorter_FloatComparer0 = new ParallelSorter.FloatComparer(floatArray0);
      int int0 = parallelSorter_FloatComparer0.compare(0, 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      long[] longArray0 = new long[6];
      longArray0[2] = 4294967340L;
      ParallelSorter.LongComparer parallelSorter_LongComparer0 = new ParallelSorter.LongComparer(longArray0);
      int int0 = parallelSorter_LongComparer0.compare(0, 2);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      long[] longArray0 = new long[6];
      ParallelSorter.LongComparer parallelSorter_LongComparer0 = new ParallelSorter.LongComparer(longArray0);
      int int0 = parallelSorter_LongComparer0.compare(2, 2);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      long[] longArray0 = new long[6];
      longArray0[0] = 4294967295L;
      ParallelSorter.LongComparer parallelSorter_LongComparer0 = new ParallelSorter.LongComparer(longArray0);
      int int0 = parallelSorter_LongComparer0.compare(0, 2);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ParallelSorter.Generator parallelSorter_Generator0 = new ParallelSorter.Generator();
      ClassLoader classLoader0 = parallelSorter_Generator0.getClassLoader();
      // Undeclared exception!
      try { 
        parallelSorter_Generator0.nextInstance(classLoader0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.instrumentation.InstrumentingClassLoader cannot be cast to org.mockito.cglib.util.ParallelSorter
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParallelSorter.Generator parallelSorter_Generator0 = new ParallelSorter.Generator();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        parallelSorter_Generator0.firstInstance(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.mockito.cglib.util.ParallelSorter
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$Generator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      short[] shortArray0 = new short[2];
      ParallelSorter.ShortComparer parallelSorter_ShortComparer0 = new ParallelSorter.ShortComparer(shortArray0);
      int int0 = parallelSorter_ShortComparer0.compare((short)0, (short)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[10];
      ParallelSorter.IntComparer parallelSorter_IntComparer0 = new ParallelSorter.IntComparer(intArray0);
      int int0 = parallelSorter_IntComparer0.compare(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      ParallelSorter.ObjectComparer parallelSorter_ObjectComparer0 = new ParallelSorter.ObjectComparer(objectArray0);
      // Undeclared exception!
      try { 
        parallelSorter_ObjectComparer0.compare((short)1223, (short)1223);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1223
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$ObjectComparer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ParallelSorter.ByteComparer parallelSorter_ByteComparer0 = new ParallelSorter.ByteComparer(byteArray0);
      // Undeclared exception!
      try { 
        parallelSorter_ByteComparer0.compare((byte)0, 2586);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2586
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$ByteComparer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Comparator<InputStream> comparator0 = (Comparator<InputStream>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      ParallelSorter.ComparatorComparer parallelSorter_ComparatorComparer0 = new ParallelSorter.ComparatorComparer((Object[]) null, comparator0);
      // Undeclared exception!
      try { 
        parallelSorter_ComparatorComparer0.compare((-3935), (-3935));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.util.ParallelSorter$ComparatorComparer", e);
      }
  }
}
