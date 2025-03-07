/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:41:50 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.Months;
import org.joda.time.MutableInterval;
import org.joda.time.Period;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeParser;
import org.joda.time.format.DateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class MutableInterval_ESTest extends MutableInterval_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(100000000000000L);
      DateTime dateTime0 = new DateTime(100000000000000L, (DateTimeZone) null);
      MutableInterval mutableInterval0 = new MutableInterval(duration0, dateTime0);
      mutableInterval0.setPeriodBeforeEnd((ReadablePeriod) null);
      assertEquals(100000000000000L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((Object) null);
      Months months0 = Months.TWO;
      mutableInterval0.setPeriodBeforeEnd(months0);
      assertEquals(1387052481320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-794L), 2259L, (Chronology) null);
      mutableInterval0.setPeriodAfterStart((ReadablePeriod) null);
      assertEquals((-794L), mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) null);
      MutableInterval mutableInterval0 = new MutableInterval(dateMidnight0, dateMidnight0);
      Period period0 = Period.millis(12740625);
      mutableInterval0.setPeriodAfterStart(period0);
      assertEquals(1392345140625L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((Object) null);
      Instant instant0 = Instant.now();
      mutableInterval0.setInterval((ReadableInstant) null, (ReadableInstant) instant0);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1479L), 2699L, (Chronology) null);
      mutableInterval0.setInterval((ReadableInstant) null, (ReadableInstant) null);
      assertEquals(1392409281320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(100000000000000L);
      DateTime dateTime0 = new DateTime(100000000000000L, (DateTimeZone) null);
      MutableInterval mutableInterval0 = new MutableInterval(duration0, dateTime0);
      mutableInterval0.setInterval((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      assertEquals(100000000000000L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((Object) null);
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
      DateMidnight dateMidnight0 = new DateMidnight((Chronology) null);
      MutableInterval mutableInterval0 = new MutableInterval(dateMidnight0, dateMidnight0);
      mutableInterval0.setInterval((ReadableInterval) mutableInterval0);
      assertEquals(1392332400000L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Interval interval0 = new Interval((Object) null);
      assertEquals(1392409281320L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(1421L, 1421L);
      mutableInterval0.setDurationAfterStart((ReadableDuration) null);
      assertEquals(1421L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-794L), 2259L, (Chronology) null);
      DateTime dateTime0 = new DateTime((-794L), (Chronology) null);
      DateMidnight dateMidnight0 = dateTime0.toDateMidnight();
      // Undeclared exception!
      try { 
        mutableInterval0.setEnd(dateMidnight0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((Object) null);
      Duration duration0 = Duration.standardHours(2059L);
      mutableInterval0.setDurationBeforeEnd((ReadableDuration) duration0);
      assertEquals(1384996881320L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimeParser dateTimeParser0 = mock(DateTimeParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(dateTimeParser0).parseInto(any(org.joda.time.format.DateTimeParserBucket.class) , anyString() , anyInt());
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimePrinter0, dateTimeParser0);
      DateTime dateTime0 = DateTime.parse("", dateTimeFormatter0);
      DateMidnight dateMidnight0 = dateTime0.toDateMidnight();
      Period period0 = new Period(203, 13421772, (-1180), (-2124), 203, 0, (-1180), 13421772);
      MutableInterval mutableInterval0 = new MutableInterval(dateMidnight0, period0);
      assertEquals(35301360860641772L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Period period0 = Period.minutes((-1216));
      DateTime dateTime0 = new DateTime(dateTimeZone0);
      MutableInterval mutableInterval0 = null;
      try {
        mutableInterval0 = new MutableInterval(period0, dateTime0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval(1421L, 1421L);
      mutableInterval0.setDurationBeforeEnd(1421L);
      assertEquals(0L, mutableInterval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Duration duration0 = Duration.standardHours(494L);
      DateMidnight dateMidnight0 = new DateMidnight();
      MutableInterval mutableInterval0 = new MutableInterval(dateMidnight0, duration0);
      assertEquals(1394110800000L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(100000000000000L);
      DateTime dateTime0 = new DateTime(100000000000000L, (DateTimeZone) null);
      MutableInterval mutableInterval0 = new MutableInterval(duration0, dateTime0);
      MutableInterval mutableInterval1 = mutableInterval0.copy();
      assertNotSame(mutableInterval0, mutableInterval1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Duration duration0 = Duration.standardSeconds(100000000000000L);
      DateTime dateTime0 = new DateTime(100000000000000L, (DateTimeZone) null);
      MutableInterval mutableInterval0 = new MutableInterval(duration0, dateTime0);
      GJChronology gJChronology0 = GJChronology.getInstance((DateTimeZone) null, (ReadableInstant) dateTime0);
      StrictChronology strictChronology0 = StrictChronology.getInstance(gJChronology0);
      MutableInterval mutableInterval1 = new MutableInterval(mutableInterval0, strictChronology0);
      assertEquals(100000000000000L, mutableInterval1.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((Object) null);
      mutableInterval0.setDurationAfterStart(2059L);
      assertEquals(1392409283379L, mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MutableInterval mutableInterval0 = new MutableInterval((-1479L), 2699L, (Chronology) null);
      // Undeclared exception!
      try { 
        mutableInterval0.setStart((ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The end instant must be greater or equal to the start
         //
         verifyException("org.joda.time.base.AbstractInterval", e);
      }
  }
}
