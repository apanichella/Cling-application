/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 05:54:12 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.field.PreciseDurationField;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeParserBucket_ESTest extends DateTimeParserBucket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      DurationFieldType durationFieldType0 = dateTimeFieldType0.getRangeDurationType();
      PreciseDurationField preciseDurationField0 = new PreciseDurationField(durationFieldType0, 1654L);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(preciseDurationField0, durationField0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = DateTimeParserBucket.compareReverse((DurationField) null, (DurationField) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(120);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = buddhistChronology0.eras();
      int int0 = DateTimeParserBucket.compareReverse(durationField0, durationField0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.hourOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0, buddhistChronology0, locale0, (Integer) 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "0", locale0);
      dateTimeParserBucket0.saveField(dateTimeField0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "N{g_|s\"iDpr(+K'", locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      DateTimeFieldType dateTimeFieldType1 = DateTimeFieldType.monthOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "N{g_|s\"iDpr(+K'", locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      dateTimeParserBucket0.saveField(dateTimeFieldType1, "}m;(KUJ{RN0", locale0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 10);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 2000);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"}m;(KUJ{RN0\" for monthOfYear is not supported
         //
         verifyException("org.joda.time.chrono.GJLocaleSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.CANADA;
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-9223372036854775808L), lenientChronology0, locale0, (Integer) 1, 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "YJ [l# ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"YJ [l# \": Illegal instant due to time zone offset transition (Europe/Amsterdam)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.CANADA;
      LenientChronology lenientChronology0 = LenientChronology.getInstance(buddhistChronology0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-9223372036854775808L), lenientChronology0, locale0, (Integer) 1, 1);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal instant due to time zone offset transition (Europe/Amsterdam)
         //
         verifyException("org.joda.time.format.DateTimeParserBucket", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      dateTimeParserBucket0.setZone((DateTimeZone) null);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      dateTimeParserBucket0.setOffset(1);
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(1, dateTimeParserBucket0.getOffset());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      long long0 = dateTimeParserBucket0.computeMillis(true, "}rfP-");
      assertEquals((-16187905172000L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-827L), buddhistChronology0, locale0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.minuteOfDay();
      dateTimeParserBucket0.saveField(dateTimeFieldType0, "", locale0);
      // Undeclared exception!
      try { 
        dateTimeParserBucket0.computeMillis(false, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot parse \"\": Value \"\" for minuteOfDay is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1), buddhistChronology0, locale0, (Integer) null, (-4508));
      DateTimeParserBucket dateTimeParserBucket1 = new DateTimeParserBucket((-620L), buddhistChronology0, locale0);
      Object object0 = dateTimeParserBucket1.saveState();
      assertNotNull(object0);
      
      boolean boolean0 = dateTimeParserBucket0.restoreState(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, buddhistChronology0, locale0);
      boolean boolean0 = dateTimeParserBucket0.restoreState(locale0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.monthOfYear();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(24L, iSOChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 1);
      dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      dateTimeParserBucket0.saveField(dateTimeFieldType0, 1);
      assertEquals("monthOfYear", dateTimeFieldType0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_15_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) fixedDateTimeZone0, islamicChronology_LeapYearPatternType0);
      StrictChronology strictChronology0 = StrictChronology.getInstance(islamicChronology0);
      Locale locale0 = Locale.GERMAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(3099L, strictChronology0, locale0);
      dateTimeParserBucket0.setOffset(1);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(43200000L, iSOChronology0, locale0, (Integer) null);
      int int0 = dateTimeParserBucket0.getOffset();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.KOREA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      dateTimeParserBucket0.setOffset((Integer) 1);
      assertNull(dateTimeParserBucket0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.CANADA;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      dateTimeParserBucket0.setPivotYear((Integer) buddhistChronology0.BE);
      assertEquals(1, BuddhistChronology.BE);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket((-1), buddhistChronology0, locale0, (Integer) null, (-4508));
      Locale locale1 = dateTimeParserBucket0.getLocale();
      assertEquals("en_CA", locale1.toString());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-2772));
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      Locale locale0 = Locale.KOREAN;
      Integer integer0 = Integer.getInteger("m!RSrwLUn!|'{}|,a", 0);
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1851L, gJChronology0, locale0, integer0, 0);
      Integer integer1 = dateTimeParserBucket0.getPivotYear();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1, buddhistChronology0, locale0);
      long long0 = dateTimeParserBucket0.computeMillis(true);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = Locale.JAPAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(43200000L, iSOChronology0, locale0, (Integer) null);
      Chronology chronology0 = dateTimeParserBucket0.getChronology();
      assertSame(iSOChronology0, chronology0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.parse("1");
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      Locale locale0 = Locale.US;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, iSOChronology0, locale0);
      DateTimeParserBucket.SavedState dateTimeParserBucket_SavedState0 = dateTimeParserBucket0.new SavedState();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      dateTimeParserBucket0.saveField(dateTimeField0, 1);
      boolean boolean0 = dateTimeParserBucket_SavedState0.restoreState(dateTimeParserBucket0);
      assertTrue(boolean0);
      
      long long0 = dateTimeParserBucket0.computeMillis();
      assertEquals(0L, long0);
  }
}
