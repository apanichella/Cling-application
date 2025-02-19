/*

 * Tue Mar 03 17:10:11 GMT 2020
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Minutes_ESTest extends Minutes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDateTime localDateTime0 = new LocalDateTime((Chronology) iSOChronology0);
      LocalTime localTime0 = new LocalTime((Chronology) iSOChronology0);
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localDateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = minutes0.minus(minutes0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Seconds seconds0 = Seconds.ONE;
      // Undeclared exception!
      try { 
        minutes0.THREE.compareTo((BaseSingleFieldPeriod) seconds0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Minutes cannot be compared to class org.joda.time.Seconds
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Object object0 = new Object();
      boolean boolean0 = minutes0.ZERO.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Weeks weeks0 = Weeks.ZERO;
      Minutes minutes0 = Minutes.standardMinutesIn(weeks0);
      assertEquals(0, minutes0.getMinutes());
      
      LocalTime localTime0 = LocalTime.now();
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.years();
      boolean boolean0 = minutes0.ONE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      int int0 = minutes0.ONE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(2, minutes0.getMinutes());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Minutes minutes1 = Minutes.minutes(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, minutes1.getMinutes());
      
      Hours hours0 = minutes0.toStandardHours();
      Minutes minutes2 = Minutes.standardMinutesIn(hours0);
      assertEquals(0, minutes2.getMinutes());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Weeks weeks0 = Weeks.ONE;
      Minutes minutes0 = Minutes.standardMinutesIn(weeks0);
      assertEquals(1, weeks0.getWeeks());
      assertEquals(10080, minutes0.getMinutes());
      
      LocalTime localTime0 = LocalTime.now();
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      assertEquals(1, minutes0.size());
      
      LocalDateTime localDateTime0 = new LocalDateTime();
      Minutes minutes1 = Minutes.minutesBetween((ReadablePartial) localDateTime0, (ReadablePartial) localDateTime0);
      Minutes minutes2 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes2.getMinutes());
      assertSame(minutes0, minutes1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Minutes minutes1 = Minutes.ZERO;
      int int0 = minutes0.ONE.compareTo((BaseSingleFieldPeriod) minutes1);
      assertEquals(1, int0);
      assertEquals(0, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      int int0 = minutes0.ONE.compareTo((BaseSingleFieldPeriod) minutes0);
      assertEquals(1, minutes0.getMinutes());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Minutes minutes0 = Minutes.minutesIn((ReadableInterval) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Minutes minutes0 = Minutes.minutesIn(mutableInterval0);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      Hours hours0 = minutes0.toStandardHours();
      Minutes minutes1 = Minutes.standardMinutesIn(hours0);
      assertEquals(0, minutes1.getMinutes());
      
      Minutes minutes2 = Minutes.standardMinutesIn(minutes0);
      assertSame(minutes2, minutes0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      DurationFieldType durationFieldType0 = DurationFieldType.eras();
      int int0 = minutes0.ONE.get(durationFieldType0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      boolean boolean0 = minutes0.MAX_VALUE.equals(minutes0);
      assertFalse(boolean0);
      assertEquals(2, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      Days days0 = Days.TWO;
      boolean boolean0 = minutes0.ONE.equals(days0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Minutes minutes0 = Minutes.ONE;
      MutablePeriod mutablePeriod0 = minutes0.toMutablePeriod();
      Minutes minutes1 = Minutes.standardMinutesIn(mutablePeriod0);
      assertSame(minutes1, minutes0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Minutes minutes0 = Minutes.MIN_VALUE;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(Integer.MIN_VALUE, minutes1.getMinutes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Minutes minutes0 = Minutes.THREE;
      Days days0 = minutes0.toStandardDays();
      Minutes minutes1 = Minutes.standardMinutesIn(days0);
      Minutes minutes2 = minutes1.plus(minutes0);
      assertEquals(0, minutes1.getMinutes());
      assertEquals(1, minutes2.size());
      assertSame(minutes2, minutes0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Minutes minutes0 = Minutes.parseMinutes((String) null);
      assertEquals(0, minutes0.getMinutes());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        Minutes.parseMinutes("Xq$DC_k!D'f6fm");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"Xq$DC_k!D'f6fm\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Minutes minutes0 = Minutes.ZERO;
      Minutes minutes1 = Minutes.standardMinutesIn(minutes0);
      assertEquals(0, minutes1.getMinutes());
      
      Minutes minutes2 = Minutes.minutes(365);
      assertEquals(365, minutes2.getMinutes());
      assertEquals(1, minutes2.size());
  }
}
