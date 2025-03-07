/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:25:59 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(islamicChronology0);
      MutableInterval mutableInterval0 = new MutableInterval(1616L, 1616L, lenientChronology0);
      mutableInterval0.setPeriodBeforeEnd((ReadablePeriod) null);
      assertEquals(1616L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      Weeks weeks0 = Weeks.weeks(4338);
      mutableInterval0.setPeriodBeforeEnd(weeks0);
      assertEquals((-2623619972000L), mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      mutableInterval0.setPeriodAfterStart((ReadablePeriod) null);
      assertEquals(0L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period(0L);
      MutableInterval mutableInterval0 = new MutableInterval(period0, (ReadableInstant) null);
      mutableInterval0.setPeriodAfterStart(period0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      mutableInterval0.setInterval((ReadableInstant) null, (ReadableInstant) null);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period(0L);
      MutableInterval mutableInterval0 = new MutableInterval(period0, (ReadableInstant) null);
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(ethiopicChronology0);
      MutableDateTime mutableDateTime0 = MutableDateTime.now((Chronology) lenientChronology0);
      mutableInterval0.setInterval((ReadableInstant) null, (ReadableInstant) mutableDateTime0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      DateTime dateTime0 = mutableInterval0.getEnd();
      mutableInterval0.setInterval((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      assertEquals(0L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      // Undeclared exception!
      try { 
        mutableInterval0.setInterval((ReadableInterval) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Interval must not be null
         //
         verifyException("org.joda.time.MutableInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period(0L);
      MutableInterval mutableInterval0 = new MutableInterval(period0, (ReadableInstant) null);
      Duration duration0 = Duration.standardDays(0L);
      Interval interval0 = duration0.toIntervalFrom((ReadableInstant) null);
      mutableInterval0.setInterval((ReadableInterval) interval0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, (ReadableInstant) null);
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      mutableInterval0.setDurationAfterStart(0L);
      assertEquals(0L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      DateTime dateTime0 = mutableInterval0.getEnd();
      mutableInterval0.setEnd(dateTime0);
      assertEquals(0L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period(0L);
      MutableInterval mutableInterval0 = new MutableInterval(period0, (ReadableInstant) null);
      Duration duration0 = Duration.standardDays(0L);
      mutableInterval0.setDurationBeforeEnd((ReadableDuration) duration0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period((ReadableInstant) null, (ReadableInstant) null);
      MutableInterval mutableInterval0 = new MutableInterval((ReadableInstant) null, period0);
      assertEquals(1392409281320L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((Object) null);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Duration duration0 = new Duration(1999L, 10800000L);
      MutableInterval mutableInterval0 = new MutableInterval(duration0, (ReadableInstant) null);
      assertEquals(1392398483319L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = new Period(0L);
      MutableInterval mutableInterval0 = new MutableInterval(period0, (ReadableInstant) null);
      mutableInterval0.setStart((ReadableInstant) null);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(islamicChronology0);
      MutableInterval mutableInterval0 = new MutableInterval(1616L, 1616L, lenientChronology0);
      mutableInterval0.setDurationBeforeEnd(0L);
      assertEquals(1616L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds((-4));
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval((ReadableInstant) null, duration0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MutableInterval mutableInterval0 = new MutableInterval(0L, 0L, julianChronology0);
      MutableInterval mutableInterval1 = mutableInterval0.copy();
      assertEquals(0L, mutableInterval1.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, buddhistChronology0);
      assertEquals(0L, mutableInterval1.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        MutableInterval.parse("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Format requires a '/' separator: 
         //
         verifyException("org.joda.time.convert.StringConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval();
      mutableInterval0.setDurationAfterStart((ReadableDuration) null);
      assertEquals(0L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(0L, 0L);
      assertEquals(0L, mutableInterval0.getStartMillis());
  }
}
