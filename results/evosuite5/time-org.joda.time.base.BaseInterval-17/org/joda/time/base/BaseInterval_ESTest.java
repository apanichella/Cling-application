/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 18:39:25 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.Minutes;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class BaseInterval_ESTest extends BaseInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Interval interval0 = Interval.parse((String) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Interval interval0 = new Interval(99987L, 99987L);
      Chronology chronology0 = interval0.getChronology();
      assertEquals(99987L, interval0.getEndMillis());
      
      MutableInterval mutableInterval0 = new MutableInterval(interval0, chronology0);
      assertEquals(99987L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.seconds(4018);
      Instant instant0 = new Instant((long) 4018);
      MutableInterval mutableInterval0 = new MutableInterval(period0, instant0);
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0);
      assertTrue(mutableInterval1.equals((Object)mutableInterval0));
      assertEquals((-4013982L), mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableInterval.parse("org.joda.time.chrono.LimitChronology");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: org.joda.time.chrono.LimitChronology
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadablePeriod) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.seconds(4018);
      Instant instant0 = new Instant((long) 4018);
      Interval interval0 = new Interval(instant0, period0);
      assertEquals(4022018L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      DateTime dateTime0 = mutableInterval0.getEnd();
      Interval interval0 = null;
      try {
        interval0 = new Interval((ReadableInstant) null, dateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Interval interval0 = new Interval((ReadableInstant) null, (ReadableInstant) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1392332400000L, interval0.getStartMillis());
      assertEquals(1392418800000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minutes minutes0 = Minutes.TWO;
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableInterval mutableInterval0 = new MutableInterval(minutes0, mutableDateTime0);
      Duration duration0 = new Duration(mutableInterval0);
      duration0.toIntervalFrom(mutableDateTime0);
      assertEquals(120L, duration0.getStandardSeconds());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Instant instant0 = new Instant((long) 4018);
      Duration duration0 = Duration.standardDays(4018);
      Duration duration1 = duration0.withMillis(4018);
      Interval interval0 = new Interval(duration1, instant0);
      Interval interval1 = interval0.withDurationAfterStart(duration0);
      assertEquals(0L, interval1.getStartMillis());
      assertEquals(347155200000L, interval1.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTime dateTime0 = new DateTime((-12219292800000L), (DateTimeZone) null);
      MutableInterval mutableInterval0 = new MutableInterval((ReadablePeriod) null, dateTime0);
      mutableInterval0.setDurationAfterStart(424L);
      assertEquals((-12219292799576L), mutableInterval0.getEndMillis());
  }
}
