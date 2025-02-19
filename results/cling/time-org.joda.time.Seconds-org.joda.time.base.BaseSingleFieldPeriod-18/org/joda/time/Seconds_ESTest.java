/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 17:27:50 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Seconds_ESTest extends Seconds_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      int int0 = seconds0.THREE.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.seconds((-1774));
      boolean boolean0 = seconds0.equals(seconds1);
      assertFalse(boolean0);
      assertFalse(seconds1.equals((Object)seconds0));
      assertEquals((-1774), seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Minutes minutes0 = Minutes.ZERO;
      boolean boolean0 = seconds0.MIN_VALUE.equals(minutes0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Object object0 = new Object();
      boolean boolean0 = seconds0.ZERO.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Seconds seconds0 = hours0.toStandardSeconds();
      YearMonth yearMonth0 = new YearMonth((Chronology) null);
      Seconds seconds1 = Seconds.secondsBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Seconds seconds2 = seconds0.plus(seconds1);
      assertEquals(10800, seconds2.getSeconds());
      assertSame(seconds2, seconds0);
      assertEquals(0, seconds1.getSeconds());
      assertEquals(3, hours0.getHours());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      LocalTime localTime0 = new LocalTime((Chronology) iSOChronology0);
      MonthDay monthDay0 = new MonthDay();
      // Undeclared exception!
      try { 
        Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) monthDay0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Seconds seconds0 = Seconds.parseSeconds((String) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Seconds.parseSeconds("B");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"B\"
         //
         verifyException("org.joda.time.format.PeriodFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Seconds seconds0 = Seconds.secondsIn((ReadableInterval) null);
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      DurationFieldType durationFieldType0 = DurationFieldType.WEEKYEARS_TYPE;
      boolean boolean0 = seconds0.ONE.isSupported(durationFieldType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Seconds seconds0 = Seconds.MAX_VALUE;
      Period period0 = Period.seconds(1117);
      Seconds seconds1 = Seconds.standardSecondsIn(period0);
      assertEquals(1117, seconds1.getSeconds());
      
      Seconds seconds2 = Seconds.standardSecondsIn(seconds0);
      assertSame(seconds2, seconds0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Seconds seconds0 = Seconds.secondsBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(1565717247278L, dateTime0.getMillis());
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      LocalTime localTime0 = new LocalTime((Object) null, fixedDateTimeZone0);
      Seconds seconds2 = Seconds.secondsBetween((ReadablePartial) localTime0, (ReadablePartial) localTime0);
      assertSame(seconds2, seconds1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      YearMonth yearMonth0 = new YearMonth();
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(0, seconds1.getSeconds());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      Seconds seconds0 = Seconds.secondsBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      Seconds.standardSecondsIn(seconds0);
      assertEquals(1565717244304L, dateTime0.getMillis());
      
      Seconds seconds1 = Seconds.seconds(2);
      assertNotSame(seconds1, seconds0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Seconds seconds0 = Seconds.ONE;
      Duration duration0 = seconds0.toStandardDuration();
      Hours hours0 = seconds0.toStandardHours();
      Seconds seconds1 = Seconds.standardSecondsIn(hours0);
      assertEquals(0, seconds1.getSeconds());
      
      Seconds seconds2 = duration0.toStandardSeconds();
      assertSame(seconds2, seconds0);
      assertEquals(1, seconds2.size());
      assertEquals(1000L, duration0.getMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Seconds seconds0 = Seconds.TWO;
      Seconds seconds1 = Seconds.THREE;
      Hours hours0 = seconds0.toStandardHours();
      Seconds seconds2 = Seconds.standardSecondsIn(seconds1);
      assertSame(seconds2, seconds1);
      
      Seconds seconds3 = Seconds.standardSecondsIn(hours0);
      assertEquals(0, seconds3.getSeconds());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Duration duration0 = Duration.standardHours(0L);
      Seconds seconds0 = duration0.toStandardSeconds();
      Seconds seconds1 = Seconds.TWO;
      Seconds seconds2 = seconds0.minus(seconds1);
      int int0 = seconds0.compareTo((BaseSingleFieldPeriod) seconds2);
      assertEquals(2, seconds1.getSeconds());
      assertEquals(1, int0);
      assertEquals((-2), seconds2.getSeconds());
      assertEquals(0, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Seconds seconds0 = Seconds.THREE;
      Months months0 = Months.TWELVE;
      // Undeclared exception!
      try { 
        seconds0.ONE.compareTo((BaseSingleFieldPeriod) months0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.joda.time.Seconds cannot be compared to class org.joda.time.Months
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Seconds seconds0 = Seconds.secondsIn(mutableInterval0);
      Seconds seconds1 = Seconds.MAX_VALUE;
      int int0 = seconds0.TWO.compareTo((BaseSingleFieldPeriod) seconds1);
      assertEquals(0, seconds0.getSeconds());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hours hours0 = Hours.THREE;
      Seconds seconds0 = hours0.toStandardSeconds();
      int int0 = seconds0.compareTo((BaseSingleFieldPeriod) seconds0);
      assertEquals(0, int0);
      assertEquals(3, hours0.getHours());
      assertEquals(10800, seconds0.getSeconds());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Seconds seconds0 = Seconds.MIN_VALUE;
      Seconds seconds1 = Seconds.standardSecondsIn(seconds0);
      assertEquals(Integer.MIN_VALUE, seconds1.getSeconds());
  }
}
