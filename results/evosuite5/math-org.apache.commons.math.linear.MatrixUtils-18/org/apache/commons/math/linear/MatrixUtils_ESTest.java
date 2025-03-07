/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 15:51:37 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import org.apache.commons.math.linear.BigMatrix;
import org.apache.commons.math.linear.MatrixUtils;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MatrixUtils_ESTest extends MatrixUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BigMatrix bigMatrix0 = MatrixUtils.createBigIdentityMatrix(17);
      assertEquals(17, bigMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        MatrixUtils.createColumnBigMatrix(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[8];
      BigMatrix bigMatrix0 = MatrixUtils.createColumnBigMatrix(bigDecimalArray0);
      assertEquals(8, bigMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      BigMatrix bigMatrix0 = MatrixUtils.createColumnBigMatrix(doubleArray0);
      assertEquals(6, bigMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealMatrix realMatrix0 = MatrixUtils.createColumnRealMatrix(doubleArray0);
      assertEquals(2, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RealMatrix realMatrix0 = MatrixUtils.createRealIdentityMatrix(17);
      assertEquals(17, realMatrix0.getColumnDimension());
      assertEquals(1.0, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrix realMatrix0 = MatrixUtils.createRowRealMatrix(doubleArray0);
      assertEquals(1, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MatrixUtils matrixUtils0 = new MatrixUtils();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[][] stringArray0 = new String[1][6];
      // Undeclared exception!
      try { 
        MatrixUtils.createBigMatrix(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.math.BigDecimal", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      BigMatrix bigMatrix0 = MatrixUtils.createRowBigMatrix(doubleArray0);
      assertEquals(1, bigMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BigDecimal[][] bigDecimalArray0 = new BigDecimal[0][8];
      // Undeclared exception!
      try { 
        MatrixUtils.createBigMatrix(bigDecimalArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one row.
         //
         verifyException("org.apache.commons.math.linear.BigMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[7][7];
      BigMatrix bigMatrix0 = MatrixUtils.createBigMatrix(doubleArray0);
      assertEquals(7, bigMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[4][8];
      RealMatrix realMatrix0 = MatrixUtils.createRealMatrix(doubleArray0);
      assertEquals(4, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        MatrixUtils.createRowBigMatrix(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one column.
         //
         verifyException("org.apache.commons.math.linear.BigMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[1];
      BigMatrix bigMatrix0 = MatrixUtils.createRowBigMatrix(bigDecimalArray0);
      assertEquals(1, bigMatrix0.getColumnDimension());
  }
}
