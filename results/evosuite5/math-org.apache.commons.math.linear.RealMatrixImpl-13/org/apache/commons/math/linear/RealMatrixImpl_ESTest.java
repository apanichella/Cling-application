/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:04:28 GMT 2019
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class RealMatrixImpl_ESTest extends RealMatrixImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getRowMatrix((-3132));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal row argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      realMatrixImpl0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl)realMatrixImpl0.add(realMatrixImpl0);
      realMatrixImpl1.equals(realMatrixImpl0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(28, 11);
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(11, 11);
      realMatrixImpl1.equals(realMatrixImpl0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(31, 31);
      realMatrixImpl1.equals(realMatrixImpl0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(31, 31);
      Object object0 = new Object();
      realMatrixImpl0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[0] = (-2722.82046511);
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.add(realMatrixImpl0);
      realMatrixImpl0.equals(realMatrix0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(31, 31);
      realMatrixImpl0.toString();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      realMatrixImpl0.toString();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getLUMatrix();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // LU decomposition requires that the matrix be square.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.solve(doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // coefficient matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 31;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      realMatrixImpl0.solve(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      double[] doubleArray1 = new double[2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1);
      try { 
        realMatrixImpl0.solve(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // constant vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.solve(doubleArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Matrix is singular.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[][] doubleArray0 = new double[14][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = new double[0];
      try { 
        realMatrixImpl0.preMultiply(doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[16];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      realMatrixImpl0.preMultiply(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.operate(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // vector has wrong length
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      realMatrixImpl0.operate(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[14];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getTrace();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(17, 17);
      realMatrixImpl0.getTrace();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double[][] doubleArray1 = new double[6][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      doubleArray1[5] = doubleArray0;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1);
      RealMatrixImpl.TOO_SMALL = (-3525.0);
      RealMatrix realMatrix0 = realMatrixImpl0.inverse();
      RealMatrix realMatrix1 = realMatrixImpl0.solve(realMatrix0);
      assertTrue(realMatrix1.isSquare());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) 31;
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      realMatrixImpl0.getDeterminant();
      RealMatrix realMatrix0 = realMatrixImpl0.getLUMatrix();
      assertNotSame(realMatrixImpl0, realMatrix0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getDeterminant();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix is not square
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(31, 31);
      assertTrue(realMatrixImpl0.isSquare());
      
      double double0 = realMatrixImpl0.getDeterminant();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[][] doubleArray0 = new double[8][1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.transpose();
      try { 
        realMatrixImpl0.solve(realMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Incorrect row dimension
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[][] doubleArray0 = new double[7][5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getEntry(23, 1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix entry does not exist
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getColumn((-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal column argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(31, 31);
      double[] doubleArray0 = realMatrixImpl0.getColumn(0);
      assertEquals(31, doubleArray0.length);
      assertTrue(realMatrixImpl0.isSquare());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getRow(1389);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal row argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      double[] doubleArray1 = realMatrixImpl0.getRow(1);
      assertEquals(1, doubleArray1.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(31, 31);
      try { 
        realMatrixImpl0.getColumnMatrix(31);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // illegal column argument
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(2733, 2733);
      RealMatrix realMatrix0 = realMatrixImpl0.getColumnMatrix(2719);
      assertEquals(2733, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 0, 2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[][] doubleArray0 = new double[9][5];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 0, 4065);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix must be initialized to perfom this method
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 225, 225);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // matrix must be initialized to perfom this method
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[][] doubleArray0 = new double[6][1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 32, 1214);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      double[][] doubleArray1 = new double[19][1];
      doubleArray1[0] = doubleArray0;
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // All input rows must have the same length.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[][] doubleArray0 = new double[9][0];
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one column.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      double[][] doubleArray0 = new double[0][6];
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrix must have at least one row.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      double[][] doubleArray0 = new double[8][1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, 1, (-1133));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[][] doubleArray0 = new double[10][6];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.setSubMatrix(doubleArray0, (-1), (-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      int[] intArray0 = new int[0];
      try { 
        realMatrixImpl0.getSubMatrix(intArray0, intArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // selected row and column index arrays must be non-empty
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      int[] intArray0 = new int[1];
      RealMatrix realMatrix0 = realMatrixImpl0.getSubMatrix(intArray0, intArray0);
      assertTrue(realMatrix0.isSquare());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(4, 4, 30, 1751);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(31, 31);
      try { 
        realMatrixImpl0.getSubMatrix(31, 31, 39, 31);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(4, 4);
      try { 
        realMatrixImpl0.getSubMatrix(4, 4, (-763), (-763));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.getSubMatrix(31, 31, 31, 31);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      try { 
        realMatrixImpl0.getSubMatrix(0, (-1602), 18, 18);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      assertEquals(1, realMatrixImpl0.getRowDimension());
      
      RealMatrix realMatrix0 = realMatrixImpl0.getSubMatrix(0, 0, 0, 0);
      assertTrue(realMatrix0.isSquare());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      try { 
        realMatrixImpl0.getSubMatrix((-19), (-19), (-19), (-19));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid row or column index selection
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(31, 31);
      double double0 = realMatrixImpl0.getNorm();
      assertTrue(realMatrixImpl0.isSquare());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      try { 
        realMatrixImpl0.preMultiply((RealMatrix) realMatrixImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Matrices are not multiplication compatible.
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.scalarMultiply(13);
      assertTrue(realMatrix0.equals((Object)realMatrixImpl0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(36, 36);
      RealMatrix realMatrix0 = realMatrixImpl0.scalarAdd(0.0);
      assertTrue(realMatrix0.isSquare());
      assertEquals(0.0, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(1, 1);
      try { 
        realMatrixImpl1.subtract(realMatrixImpl0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.subtract(realMatrixImpl0);
      assertEquals(0.0, realMatrix0.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(7, 7);
      try { 
        realMatrixImpl0.subtract(realMatrixImpl1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      double[][] doubleArray0 = new double[18][1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.getRowMatrix(1);
      try { 
        realMatrixImpl0.add(realMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(31, 31);
      RealMatrix realMatrix0 = realMatrixImpl0.getIdentity(13);
      try { 
        realMatrixImpl0.add(realMatrix0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // matrix dimension mismatch
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl(2100, (-2229));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // row and column dimensions must be postive
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = null;
      try {
        realMatrixImpl0 = new RealMatrixImpl((-17), (-17));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // row and column dimensions must be postive
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      // Undeclared exception!
      try { 
        realMatrixImpl0.getPermutation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
      RealMatrix realMatrix0 = realMatrixImpl0.preMultiply((RealMatrix) realMatrixImpl0);
      assertTrue(realMatrix0.equals((Object)realMatrixImpl0));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
      // Undeclared exception!
      try { 
        realMatrixImpl0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
