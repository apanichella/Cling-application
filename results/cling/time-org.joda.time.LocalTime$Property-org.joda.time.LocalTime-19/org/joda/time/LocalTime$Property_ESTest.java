/*

 * Tue Mar 03 17:29:59 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.LocalTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class LocalTime$Property_ESTest extends LocalTime$Property_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1);
      LocalTime localTime1 = LocalTime.fromMillisOfDay((-322L));
      localTime1.isEqual(localTime0);
      // Undeclared exception!
      try { 
        localTime1.toString("Field is not supported");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: F
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1);
      LocalTime localTime1 = localTime0.minusHours(1);
      localTime0.isBefore(localTime1);
      // Undeclared exception!
      try { 
        localTime0.toString("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern specification
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1);
      String string0 = localTime0.toString((String) null);
      assertEquals(4, localTime0.size());
      assertEquals("00:00:00.001", string0);
  }
}
