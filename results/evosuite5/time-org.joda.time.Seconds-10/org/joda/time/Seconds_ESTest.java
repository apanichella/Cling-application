/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:45:32 GMT 2019
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
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.seconds(776);
      boolean boolean0 = seconds0.isLessThan(seconds1);
      assertEquals(776, seconds1.getSeconds());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = seconds0.isLessThan((Seconds) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds0.isLessThan((Seconds) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      boolean boolean0 = seconds0.isLessThan(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Minutes minutes0 = Minutes.ONE;
      Seconds seconds1 = minutes0.toStandardSeconds();
      boolean boolean0 = seconds1.isGreaterThan(seconds0);
      assertTrue(boolean0);
      assertEquals(60, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      boolean boolean0 = seconds0.isGreaterThan((Seconds) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = seconds0.isGreaterThan((Seconds) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      boolean boolean0 = seconds0.isGreaterThan(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = seconds0.ZERO.dividedBy(1);
      assertEquals(1, seconds1.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Seconds seconds1 = seconds0.ZERO.dividedBy(7);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = seconds0.MAX_VALUE.minus((Seconds) null);
      assertNotSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Seconds seconds1 = seconds0.plus((Seconds) null);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Seconds seconds1 = seconds0.THREE.plus(seconds0);
      assertEquals(3, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Seconds seconds1 = seconds0.MAX_VALUE.minus(seconds0);
      assertEquals(2147483646, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds("org.joda.time.IllegalFieldValueException");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"org.joda.time.IllegalFieldValueE...\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Seconds seconds0 = Seconds.secondsIn(mutableInterval0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalTime localTime0 = LocalTime.now();
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalTime localTime0 = new LocalTime((DateTimeZone) fixedDateTimeZone0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Seconds seconds0 = Seconds.seconds(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      String string0 = seconds0.ZERO.toString();
      assertEquals("PT0S", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Days days0 = seconds0.ZERO.toStandardDays();
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      int int0 = seconds0.getSeconds();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Hours hours0 = seconds0.TWO.toStandardHours();
      assertEquals(0, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Seconds seconds0 = Seconds.ZERO;
      Minutes minutes0 = seconds0.toStandardMinutes();
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      Seconds seconds0 = Seconds.secondsBetween((ReadableInstant) mutableDateTime0, (ReadableInstant) mutableDateTime0);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Seconds seconds1 = seconds0.negated();
      assertEquals((-3), seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Seconds seconds1 = seconds0.TWO.multipliedBy(60);
      assertEquals(120, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Weeks weeks0 = seconds0.ZERO.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      PeriodType periodType0 = seconds0.TWO.getPeriodType();
      assertEquals("Seconds", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Duration duration0 = seconds0.toStandardDuration();
      assertEquals(3000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }
}
