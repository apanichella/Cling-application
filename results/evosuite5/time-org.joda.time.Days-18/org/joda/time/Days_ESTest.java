/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:30:28 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.Partial;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.chrono.IslamicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Days_ESTest extends Days_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.MIN_VALUE;
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
      Days days0 = Days.MIN_VALUE;
      boolean boolean0 = days0.isLessThan(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.MIN_VALUE;
      boolean boolean0 = days0.isGreaterThan(days1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Days days0 = Days.ONE;
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      boolean boolean0 = days0.isGreaterThan((Days) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      boolean boolean0 = days0.isGreaterThan(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = days0.MIN_VALUE.dividedBy(1);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = days0.FIVE.dividedBy((-4888));
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Days days0 = Days.days(1900);
      days0.TWO.minus((Days) null);
      assertEquals(1900, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = days0.MAX_VALUE.plus((Days) null);
      assertEquals(1, days1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      // Undeclared exception!
      try { 
        days0.plus(days0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The calculation caused an overflow: 2147483647 + 2147483647
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Days days0 = Days.parseDays((String) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.parseDays("V)");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"V)\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Days days0 = Days.daysIn((ReadableInterval) null);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Interval interval0 = new Interval(88L, 88L, islamicChronology0);
      Days days0 = Days.daysIn(interval0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Partial partial0 = new Partial();
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) partial0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Partial partial0 = new Partial();
      Days days0 = Days.daysBetween((ReadablePartial) partial0, (ReadablePartial) partial0);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Days days0 = Days.SIX;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Days days0 = Days.FOUR;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Days days0 = Days.THREE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Days days0 = Days.days(2);
      assertEquals(2, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Days days0 = Days.days(1);
      assertEquals(1, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Days days1 = Days.standardDaysIn(days0);
      assertEquals(Integer.MIN_VALUE, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Days days0 = Days.ZERO;
      Days days1 = days0.minus(days0);
      assertEquals(0, days1.getDays());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      int int0 = days0.getDays();
      assertEquals(Integer.MAX_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Days days0 = Days.MIN_VALUE;
      Duration duration0 = days0.MAX_VALUE.toStandardDuration();
      assertEquals(51539607528L, duration0.getStandardHours());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Weeks weeks0 = days0.toStandardWeeks();
      assertEquals(306783378, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Days days0 = minutes0.toStandardDays();
      days0.multipliedBy(1900);
      assertEquals(0, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      Days days1 = days0.negated();
      assertEquals((-2147483647), days1.getDays());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Days days0 = Days.ONE;
      Seconds seconds0 = days0.SEVEN.toStandardSeconds();
      assertEquals(604800, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Days days0 = Days.FIVE;
      Days days1 = Days.standardDaysIn(days0);
      assertSame(days1, days0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Days days0 = Days.FOUR;
      PeriodType periodType0 = days0.getPeriodType();
      assertEquals("Days", periodType0.getName());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        Days.daysBetween((ReadableInstant) null, (ReadableInstant) null);
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
      Days days0 = Days.MAX_VALUE;
      // Undeclared exception!
      try { 
        days0.toStandardHours();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 24
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      // Undeclared exception!
      try { 
        days0.toStandardMinutes();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 2147483647 * 1440
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Days days0 = Days.MAX_VALUE;
      String string0 = days0.toString();
      assertEquals("P2147483647D", string0);
  }
}
