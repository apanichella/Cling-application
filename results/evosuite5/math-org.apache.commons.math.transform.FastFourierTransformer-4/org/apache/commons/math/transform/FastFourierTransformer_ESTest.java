/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 22 11:33:22 GMT 2019
 */

package org.apache.commons.math.transform;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.PolynomialFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FastFourierTransformer_ESTest extends FastFourierTransformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      try { 
        FastFourierTransformer.verifyInterval((-4829.7), (-4829.7));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Endpoints do not specify an interval: [-4829.7, -4829.7]
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      try { 
        FastFourierTransformer.verifyDataSet(objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = FastFourierTransformer.isPowerOf2(0L);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      double[] doubleArray1 = FastFourierTransformer.scaleArray(doubleArray0, 1.0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex[] complexArray0 = new Complex[1];
      Complex complex0 = Complex.I;
      complexArray0[0] = complex0;
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      fastFourierTransformer0.inversetransform2(complexArray0);
      Complex[] complexArray1 = fastFourierTransformer0.inversetransform(complexArray0);
      assertNotSame(complexArray1, complexArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      try { 
        fastFourierTransformer0.computeOmega(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot compute 0-th root of unity, indefinite result.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[8];
      Complex complex0 = Complex.NaN;
      complexArray0[0] = complex0;
      complexArray0[1] = complexArray0[0];
      complexArray0[2] = complexArray0[0];
      complexArray0[3] = complex0;
      complexArray0[4] = complexArray0[0];
      complexArray0[5] = complex0;
      complexArray0[6] = complexArray0[0];
      complexArray0[7] = complexArray0[3];
      Complex[] complexArray1 = fastFourierTransformer0.transform(complexArray0);
      assertNotSame(complexArray0, complexArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[4];
      Complex[] complexArray0 = fastFourierTransformer0.fft(doubleArray0, false);
      Complex[] complexArray1 = fastFourierTransformer0.inversetransform2(complexArray0);
      assertEquals(4, complexArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[4];
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      Complex[] complexArray0 = new Complex[4];
      // Undeclared exception!
      try { 
        fastFourierTransformer0.transform2(complexArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      // Undeclared exception!
      try { 
        fastFourierTransformer0.inversetransform2((double[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[4];
      Complex[] complexArray0 = fastFourierTransformer0.transform(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform((UnivariateRealFunction) polynomialFunction0, (-1742.1673535884254), (-4017.01651046416), (-377));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[6];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.transform2((UnivariateRealFunction) polynomialFunction0, 2.0, 6.283185307179586, 433);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not power of 2, consider padding for fix.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[1];
      Complex[] complexArray0 = fastFourierTransformer0.inversetransform(doubleArray0);
      assertEquals(1, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[4];
      Complex[] complexArray0 = fastFourierTransformer0.transform2(doubleArray0);
      assertEquals(4, complexArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[9];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform((UnivariateRealFunction) polynomialFunction0, (-503.782), 3597.5, (-5197));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FastFourierTransformer fastFourierTransformer0 = new FastFourierTransformer();
      double[] doubleArray0 = new double[4];
      PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
      try { 
        fastFourierTransformer0.inversetransform2((UnivariateRealFunction) polynomialFunction0, 0.0, (-1181.411576767), (-3624));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Number of samples not positive.
         //
         verifyException("org.apache.commons.math.transform.FastFourierTransformer", e);
      }
  }
}
