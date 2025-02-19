/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 15:22:51 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.BuddhistChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeUtils_ESTest extends DateTimeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 1);
      Chronology chronology0 = DateTimeUtils.getInstantChronology((ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 1563895045401L);
      DateTimeUtils.setCurrentMillisOffset(0L);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 1563895045446L);
      DateTimeUtils.setCurrentMillisOffset(1563895045446L);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((long) 1);
      localDate0.toInterval();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInterval) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(0);
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone0, (-256L));
      assertEquals((-256L), long0);
      assertEquals("UTC", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalTime.fromMillisOfDay(2010L);
      DateTimeZone dateTimeZone0 = DateTimeZone.forID("UTC");
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 1563895045443L);
      long long0 = DateTimeUtils.getInstantMillis((ReadableInstant) null);
      assertEquals(1563895355195L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTimeZone.setDefault(dateTimeZone0);
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 1);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalTime localTime0 = LocalTime.fromMillisOfDay((long) 1);
      boolean boolean0 = DateTimeUtils.isContiguous(localTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 1563895045432L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("'}>I,sC1sR9=");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id ''}>I,sC1sR9=' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LocalTime.fromMillisOfDay(2035L);
      // Undeclared exception!
      try { 
        DateTimeZone.forID("+x.fcrCD|~*h*^DK<");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"+x.fcrCD|~*h*^DK<\" is malformed at \"x.fcrCD|~*h*^DK<\"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      localDate0.withLocalMillis((-1578L));
      ReadableInterval readableInterval0 = mock(ReadableInterval.class, new ViolatedAssumptionAnswer());
      doReturn((Chronology) null).when(readableInterval0).getChronology();
      Chronology chronology0 = DateTimeUtils.getIntervalChronology(readableInterval0);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      Interval interval0 = localDate0.toInterval(dateTimeZone0);
      DateTimeUtils.getIntervalChronology((ReadableInterval) interval0);
      assertEquals(1563919200000L, interval0.getEndMillis());
      assertEquals(1563832800000L, interval0.getStartMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      DateTimeZone dateTimeZone1 = DateTimeZone.forTimeZone(timeZone0);
      assertSame(dateTimeZone1, dateTimeZone0);
      assertEquals("+01:00", dateTimeZone0.getID());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalTime.fromMillisOfDay(2010L);
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(1, "GMT+00:00");
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(simpleTimeZone0);
      assertNotNull(dateTimeZone0);
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, (-23L));
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval((ReadableInterval) null);
      assertEquals(1563895347475L, readableInterval0.getStartMillis());
      assertNotNull(readableInterval0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalDate localDate0 = new LocalDate(21600000L, dateTimeZone0);
      Interval interval0 = localDate0.toInterval();
      ReadableInterval readableInterval0 = DateTimeUtils.getReadableInterval(interval0);
      assertEquals(82800000L, readableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 1);
      // Undeclared exception!
      try { 
        DateTimeUtils.setCurrentMillisProvider((DateTimeUtils.MillisProvider) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The MillisProvider must not be null
         //
         verifyException("org.joda.time.DateTimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      LocalTime.fromMillisOfDay(1563895329857L);
      DateTimeUtils.SystemMillisProvider dateTimeUtils_SystemMillisProvider0 = new DateTimeUtils.SystemMillisProvider();
      DateTimeUtils.setCurrentMillisProvider(dateTimeUtils_SystemMillisProvider0);
      assertEquals(1563895346047L, dateTimeUtils_SystemMillisProvider0.getMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forID((String) null);
      long long0 = dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 417L);
      assertEquals(417L, long0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 1563895045439L);
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) mutableDateTime0);
      assertEquals(1563895345733L, mutableDateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      dateTimeZone0.getMillisKeepLocal(dateTimeZone0, 1563895045432L);
      Chronology chronology0 = DateTimeUtils.getIntervalChronology((ReadableInstant) null, (ReadableInstant) null);
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalTime.fromMillisOfDay((-2534L));
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      TimeZone timeZone0 = TimeZone.getTimeZone((ZoneId) zoneOffset0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      assertEquals("-18:00", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalTime.fromMillisOfDay((long) 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      TimeZone timeZone0 = dateTimeZone0.toTimeZone();
      // Undeclared exception!
      try { 
        DateTimeZone.forTimeZone(timeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id '+00:00:00.001' is not recognised
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }
}
