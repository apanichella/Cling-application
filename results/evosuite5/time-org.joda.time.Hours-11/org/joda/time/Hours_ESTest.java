/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:33:53 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Hours_ESTest extends Hours_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Hours hours1 = Hours.TWO;
      boolean boolean0 = hours1.isLessThan(hours0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      boolean boolean0 = hours0.isLessThan((Hours) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      boolean boolean0 = hours0.isLessThan((Hours) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      boolean boolean0 = hours0.isLessThan(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.TWO;
      boolean boolean0 = hours0.isGreaterThan(hours1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      boolean boolean0 = hours0.isGreaterThan((Hours) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      boolean boolean0 = hours0.isGreaterThan((Hours) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      boolean boolean0 = hours0.isGreaterThan(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = hours0.EIGHT.dividedBy(1);
      assertEquals(8, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Hours hours1 = hours0.SIX.dividedBy(7);
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hours hours0 = Hours.hours((-339));
      Hours hours1 = hours0.minus((Hours) null);
      assertEquals((-339), hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Hours hours1 = hours0.plus((Hours) null);
      assertEquals(1, hours1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hours hours0 = Hours.ZERO;
      Hours hours1 = hours0.MAX_VALUE.minus(hours0);
      assertEquals(Integer.MAX_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hours hours0 = Hours.parseHours((String) null);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hours.parseHours("!z%bvu@IWd)KbQ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"!z%bvu@IWd)KbQ\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hours hours0 = Hours.hoursIn((ReadableInterval) null);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Hours hours0 = Hours.hoursIn(mutableInterval0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(0L);
      // Undeclared exception!
      try { 
        Hours.hoursBetween((ReadablePartial) localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime(dateTimeZone0);
      Hours hours0 = Hours.hoursBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hours.hoursBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hours hours0 = Hours.MAX_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Hours hours1 = hours0.plus(hours0);
      assertEquals(8, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Hours hours0 = Hours.SEVEN;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Hours hours0 = Hours.hours(5);
      assertEquals(5, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Hours hours0 = Hours.TWO;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Hours hours0 = Hours.ONE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertEquals(Integer.MIN_VALUE, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Minutes minutes0 = hours0.FOUR.toStandardMinutes();
      assertEquals(240, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      int int0 = hours0.getHours();
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Hours hours0 = Hours.SIX;
      Hours hours1 = hours0.ZERO.negated();
      assertEquals(0, hours1.getHours());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Weeks weeks0 = hours0.FIVE.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      PeriodType periodType0 = hours0.THREE.getPeriodType();
      assertEquals("Hours", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Days days0 = hours0.THREE.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Hours hours0 = seconds0.toStandardHours();
      hours0.multipliedBy(2353);
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      Hours hours1 = Hours.standardHoursIn(hours0);
      assertSame(hours1, hours0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Hours.hoursBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Hours hours0 = Hours.FOUR;
      String string0 = hours0.toString();
      assertEquals("PT4H", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Hours hours0 = Hours.FIVE;
      Seconds seconds0 = hours0.SEVEN.toStandardSeconds();
      assertEquals(25200, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Hours hours0 = Hours.MIN_VALUE;
      Duration duration0 = hours0.THREE.toStandardDuration();
      assertEquals(10800000L, duration0.getMillis());
  }
}
