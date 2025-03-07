/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:46:45 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.FIVE;
      Days days1 = Days.TWO;
      boolean boolean0 = days1.isLessThan(days0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Days days0 = Days.ONE;
      boolean boolean0 = days0.isLessThan((Days) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      boolean boolean0 = days0.isLessThan((Days) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.ONE;
      boolean boolean0 = days0.isLessThan(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.FOUR;
      Days days1 = Days.SEVEN;
      boolean boolean0 = days1.isGreaterThan(days0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.SIX;
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.FOUR;
      boolean boolean0 = days0.isGreaterThan(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.ONE;
      Days days1 = days0.dividedBy(1);
      assertEquals(1, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = days0.minus((Days) null);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.days(4);
      days0.MIN_VALUE.plus((Days) null);
      assertEquals(4, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = days0.minus(days0);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.parseDays("jh");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"jh\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      MutableInterval mutableInterval0 = new MutableInterval(dateMidnight0, dateMidnight0);
      Days days0 = Days.daysIn(mutableInterval0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      MonthDay monthDay0 = new MonthDay((long) 4);
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MonthDay monthDay0 = new MonthDay((long) 192);
      Days days0 = Days.daysBetween((ReadablePartial) monthDay0, (ReadablePartial) monthDay0);
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertEquals(0, days0.getDays());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Days days0 = Days.days(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Days days0 = Days.days(7);
      assertEquals(7, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = Days.TWO;
      Days days2 = days0.FOUR.plus(days1);
      assertEquals(6, days2.getDays());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Days days0 = Days.days(5);
      assertEquals(5, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Days days0 = Days.days(3);
      assertEquals(3, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Days days0 = Days.days(2);
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Days days0 = Days.days(4);
      Days days1 = days0.FOUR.dividedBy(4);
      assertEquals(1, days1.getDays());
      assertEquals(4, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Days days0 = Days.days(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Days days0 = Days.ZERO;
      int int0 = days0.getDays();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Duration duration0 = days0.ONE.toStandardDuration();
      assertEquals(86400000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Days days0 = Days.FIVE;
      Weeks weeks0 = days0.SIX.toStandardWeeks();
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Days days0 = Days.ONE;
      // Undeclared exception!
      try { 
        days0.MIN_VALUE.multipliedBy(1125);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: -2147483648 * 1125
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Days days0 = Days.days(4);
      Days days1 = days0.SEVEN.negated();
      assertEquals(4, days0.getDays());
      assertEquals((-7), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      MutablePeriod mutablePeriod0 = days0.ONE.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Days days0 = Days.ZERO;
      // Undeclared exception!
      try { 
        days0.MAX_VALUE.toStandardSeconds();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 86400
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Days days0 = Days.FOUR;
      PeriodType periodType0 = days0.MAX_VALUE.getPeriodType();
      assertEquals(1, periodType0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      Days days0 = Days.daysBetween((ReadableInstant) dateMidnight0, (ReadableInstant) dateMidnight0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Days days0 = Days.THREE;
      Hours hours0 = days0.SEVEN.toStandardHours();
      assertEquals(168, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Days days0 = Days.days(4);
      Minutes minutes0 = days0.toStandardMinutes();
      assertEquals(5760, minutes0.getMinutes());
      assertEquals(4, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Days days0 = Days.ZERO;
      String string0 = days0.toString();
      assertEquals("P0D", string0);
  }
}
