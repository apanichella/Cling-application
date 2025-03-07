/*

 * Tue Mar 03 15:32:45 GMT 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import org.apache.commons.math.linear.BigMatrixImpl;
import org.apache.commons.math.linear.MatrixUtils;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MatrixUtils_ESTest extends MatrixUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      BigMatrixImpl bigMatrixImpl0 = (BigMatrixImpl)MatrixUtils.createColumnBigMatrix(doubleArray0);
      assertEquals(4, bigMatrixImpl0.getRoundingMode());
      assertEquals(64, bigMatrixImpl0.getScale());
      assertEquals(1, bigMatrixImpl0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      RealMatrix realMatrix0 = MatrixUtils.createColumnRealMatrix(doubleArray0);
      assertEquals(2, realMatrix0.getRowDimension());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[2];
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
  public void test3()  throws Throwable  {
      RealMatrix realMatrix0 = MatrixUtils.createRealIdentityMatrix(17);
      assertEquals(1.0, realMatrix0.getNorm(), 0.01);
      assertEquals(17, realMatrix0.getColumnDimension());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BigDecimal[] bigDecimalArray0 = new BigDecimal[5];
      BigMatrixImpl bigMatrixImpl0 = (BigMatrixImpl)MatrixUtils.createColumnBigMatrix(bigDecimalArray0);
      assertEquals(5, bigMatrixImpl0.getRowDimension());
      assertEquals(4, bigMatrixImpl0.getRoundingMode());
      assertEquals(64, bigMatrixImpl0.getScale());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BigMatrixImpl bigMatrixImpl0 = (BigMatrixImpl)MatrixUtils.createBigIdentityMatrix(27);
      assertTrue(bigMatrixImpl0.isSquare());
      assertEquals(4, bigMatrixImpl0.getRoundingMode());
      assertEquals(64, bigMatrixImpl0.getScale());
      assertEquals(27, bigMatrixImpl0.getRowDimension());
  }
}
