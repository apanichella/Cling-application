/*

 * Tue Mar 03 16:15:36 GMT 2020
 */

package org.apache.commons.lang3.math;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.math.NumberUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = NumberUtils.toInt((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = NumberUtils.toInt("`!>-N%jc,fp");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      long long0 = NumberUtils.toLong((String) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      long long0 = NumberUtils.toLong(".|0C54D4A@%");
      assertEquals(0L, long0);
  }
}
