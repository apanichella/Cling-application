/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:20:06 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.MonthDay;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BasePartial_ESTest extends BasePartial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((Chronology) null);
      assertEquals(2, monthDay0.getMonthOfYear());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MonthDay monthDay0 = null;
      try {
        monthDay0 = new MonthDay("t=wDq");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"t=wDq\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MonthDay monthDay0 = null;
      try {
        monthDay0 = new MonthDay(0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for monthOfYear must not be smaller than 1
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay(31083597720000L);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        monthDay0.withChronologyRetainFields(ethiopicChronology0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 31 for dayOfMonth must not be larger than 30
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test4()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay();
      MonthDay monthDay1 = monthDay0.minusMonths(1);
      assertEquals(14, monthDay0.getDayOfMonth());
      assertEquals(1, monthDay1.getMonthOfYear());
  }
}
