/*

 * Tue Mar 03 16:06:00 GMT 2020
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.CharUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CharUtils_ESTest extends CharUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject('\u0081');
      assertEquals('\u0081', (char)character0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Character character0 = CharUtils.toCharacterObject((String) null);
      assertNull(character0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharUtils.toCharacterObject("normalize");
  }
}
