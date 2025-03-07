/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:40:02 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Weeks_ESTest extends Weeks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.ZERO;
      boolean boolean0 = weeks0.isLessThan(weeks1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      boolean boolean0 = weeks0.isLessThan((Weeks) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      boolean boolean0 = weeks0.isLessThan((Weeks) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Weeks weeks0 = days0.toStandardWeeks();
      boolean boolean0 = weeks0.isLessThan(weeks0);
      assertEquals(1, weeks0.getWeeks());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Weeks weeks1 = Weeks.ZERO;
      boolean boolean0 = weeks0.isGreaterThan(weeks1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      boolean boolean0 = weeks0.isGreaterThan((Weeks) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      boolean boolean0 = weeks0.isGreaterThan((Weeks) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      boolean boolean0 = weeks0.isGreaterThan(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(65);
      Weeks weeks1 = weeks0.dividedBy(1);
      assertSame(weeks1, weeks0);
      assertEquals(65, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks((-3467));
      Weeks weeks1 = weeks0.dividedBy((-3467));
      assertEquals((-3467), weeks0.getWeeks());
      assertEquals(1, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Weeks weeks1 = weeks0.minus((Weeks) null);
      assertEquals(1, weeks1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = weeks0.THREE.plus((Weeks) null);
      assertEquals(1, weeks1.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Weeks weeks0 = Weeks.parseWeeks((String) null);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.parseWeeks("5*^R8'Ee#D");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"5*^R8'Ee#D\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      Weeks weeks0 = Weeks.weeksIn((ReadableInterval) null);
      Weeks weeks1 = weeks0.plus(weeks0);
      assertEquals(0, weeks1.getWeeks());
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Interval interval0 = new Interval((-1846), (-1846));
      Weeks weeks0 = Weeks.weeksIn(interval0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(0L);
      MockDate mockDate0 = new MockDate();
      LocalTime localTime0 = LocalTime.fromDateFields(mockDate0);
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localTime0);
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
      LocalDate localDate0 = new LocalDate();
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      YearMonth yearMonth0 = new YearMonth((Chronology) ethiopicChronology0);
      Weeks weeks0 = Weeks.weeksBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Weeks weeks0 = Weeks.MAX_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Weeks weeks0 = Weeks.THREE;
      Weeks weeks1 = Weeks.standardWeeksIn(weeks0);
      assertSame(weeks1, weeks0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Years years0 = Years.ZERO;
      Weeks weeks0 = Weeks.MIN_VALUE;
      Weeks weeks1 = Weeks.standardWeeksIn(years0);
      Weeks weeks2 = weeks1.plus(weeks0);
      assertEquals(Integer.MIN_VALUE, weeks2.getWeeks());
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Hours hours0 = weeks0.ZERO.toStandardHours();
      assertEquals(1, hours0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      String string0 = weeks0.toString();
      assertEquals("P2W", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Seconds seconds0 = weeks0.THREE.toStandardSeconds();
      assertEquals(1814400, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Days days0 = weeks0.toStandardDays();
      Weeks weeks1 = days0.toStandardWeeks();
      assertSame(weeks1, weeks0);
      assertEquals(14, days0.getDays());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Days days0 = Days.days((-1874));
      Weeks weeks0 = days0.toStandardWeeks();
      Weeks weeks1 = weeks0.THREE.negated();
      assertEquals((-3), weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      Weeks weeks1 = weeks0.minus(weeks0);
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Weeks weeks0 = Weeks.TWO;
      int int0 = weeks0.getWeeks();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Weeks weeks0 = days0.toStandardWeeks();
      weeks0.ZERO.getPeriodType();
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Minutes minutes0 = weeks0.ONE.toStandardMinutes();
      assertEquals(10080, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Days days0 = Days.SEVEN;
      Weeks weeks0 = days0.toStandardWeeks();
      Weeks weeks1 = weeks0.ZERO.multipliedBy(43);
      assertEquals(1, weeks0.getWeeks());
      assertEquals(0, weeks1.getWeeks());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        Weeks.weeksBetween((ReadableInstant) null, (ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadableInstant objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Weeks weeks0 = Weeks.MIN_VALUE;
      Duration duration0 = weeks0.MAX_VALUE.toStandardDuration();
      assertEquals(15032385529L, duration0.getStandardDays());
  }
}
