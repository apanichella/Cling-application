/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 19:57:53 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      long long0 = dateTimeZone0.adjustOffset(4685L, true);
      assertEquals(4685L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2363));
      // Undeclared exception!
      try { 
        dateTimeZone0.convertLocalToUTC(9223372036854775807L, false);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      // Undeclared exception!
      try { 
        dateTimeZone0.isLocalDateTimeGap((LocalDateTime) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.DateTimeZone", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2147483639);
      long long0 = dateTimeZone0.convertLocalToUTC(10800000L, true);
      assertEquals((-2136683639L), long0);
      
      String string0 = dateTimeZone0.getName(10800000L);
      assertEquals("+596:31:23.639", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight(1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2147483576);
      dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      long long0 = dateTimeZone0.convertLocalToUTC((long) 1, false);
      assertEquals((-2147483575L), long0);
      assertEquals("+596:31:23.576", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      long long0 = dateTimeZone0.convertLocalToUTC(909L, false);
      assertEquals((-3599091L), long0);
      
      String string0 = dateTimeZone0.getName(2147483663L);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2147483639);
      long long0 = dateTimeZone0.convertLocalToUTC(10800000L, true);
      assertEquals((-2136683639L), long0);
      assertEquals("+596:31:23.639", dateTimeZone0.getID());
      
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals(1565647200000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      String string0 = dateTimeZone0.getName(10L, locale0);
      assertNotNull(string0);
      assertEquals("+01:00", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      Locale locale0 = Locale.CANADA_FRENCH;
      dateTimeZone0.getShortName((long) 1, locale0);
      LocalDate localDate0 = new LocalDate((long) 18, dateTimeZone0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      dateTimeZone0.getShortName(9223372036854775807L);
      LocalDate localDate0 = new LocalDate(1L, (Chronology) buddhistChronology0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2147483639);
      String string0 = dateTimeZone0.getName(10800000L);
      assertEquals("+596:31:23.639", string0);
      
      Interval interval0 = localDate0.toInterval();
      assertEquals(1565733600000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1, 1, 1);
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals((-62135597972000L), dateMidnight0.getMillis());
      
      Interval interval0 = localDate0.toInterval();
      assertEquals((-62135511572000L), interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1565647200000L, interval0.getStartMillis());
      
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      assertEquals(1565647200000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      dateTimeZone0.isStandardOffset(4797312L);
      LocalDate localDate0 = new LocalDate((Chronology) copticChronology0);
      assertEquals(3, localDate0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      boolean boolean0 = dateTimeZone0.isStandardOffset(1000000000L);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      int int0 = dateTimeZone0.getOffset((ReadableInstant) null);
      assertEquals(7200000, int0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2147483581);
      int int0 = dateTimeZone0.getOffset((ReadableInstant) dateMidnight0);
      assertEquals(1565647200000L, dateMidnight0.getMillis());
      assertEquals(2147483581, int0);
      assertEquals("+596:31:23.581", dateTimeZone0.toString());
      
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1565733600000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(1, 1, 1);
      localDate0.toDateMidnight();
      LocalDate localDate1 = LocalDate.now();
      assertNotSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      String string0 = fixedDateTimeZone0.getName((long) 1);
      assertEquals("+00:00", string0);
      
      LocalDate localDate0 = LocalDate.now();
      Interval interval0 = localDate0.toInterval();
      assertEquals(1565733600000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      assertNotNull(dateTimeZone0);
      
      boolean boolean0 = dateTimeZone0.isStandardOffset(1000000000L);
      assertTrue(boolean0);
      
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.year();
      long long0 = dateTimeField0.roundCeiling(31083597720000L);
      assertEquals(31106152800000L, long0);
  }
}
