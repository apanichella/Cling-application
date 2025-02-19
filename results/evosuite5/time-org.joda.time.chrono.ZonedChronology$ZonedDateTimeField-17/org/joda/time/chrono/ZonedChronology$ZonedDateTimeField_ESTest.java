/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:51:15 GMT 2019
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.BasicWeekyearDateTimeField;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJYearOfEraDateTimeField;
import org.joda.time.chrono.ISOYearOfEraDateTimeField;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.LenientDateTimeField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ZonedChronology$ZonedDateTimeField_ESTest extends ZonedChronology$ZonedDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) fixedDateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.dayOfYear();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(copticChronology0, 1);
      DurationField durationField0 = basicMonthOfYearDateTimeField0.getRangeDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, fixedDateTimeZone0, durationField0, durationField0, durationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.roundCeiling(1);
      assertEquals(86400000L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2102);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      long long0 = dateTimeField0.roundHalfEven(2102);
      assertEquals((-2102L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.era();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(copticChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, fixedDateTimeZone0, durationField0, durationField0, durationField0);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.roundHalfFloor(1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.getDifferenceAsLong(0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, (DurationField) null, millisDurationField0, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.getDifferenceAsLong(0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      int int0 = zonedChronology_ZonedDateTimeField0.getDifference(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.dayOfYear();
      int int0 = dateTimeField0.getDifference((-282), (-282));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField1, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.set((-2713737602296L), 119);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 119 for weekyearOfCentury is not supported: Illegal instant due to time zone offset transition: 2002-01-03T00:59:57.704 (+01:00)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.addWrapField((long) 0, 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.era();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(copticChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, fixedDateTimeZone0, durationField0, durationField0, durationField0);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.addWrapField((long) 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MIN > MAX
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2102);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      long long0 = dateTimeField0.add((long) 1, (-1030L));
      assertEquals((-3707999999L), long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.era();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(copticChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, fixedDateTimeZone0, durationField0, durationField0, durationField0);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.add((long) 1, (long) 1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2102);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      long long0 = dateTimeField0.add((long) 2102, 1);
      assertEquals(3602102L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.dayOfYear();
      long long0 = dateTimeField0.add((long) 1, 1);
      assertEquals(86400001L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DurationField durationField0 = copticChronology0.weekyears();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = null;
      try {
        zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(unsupportedDateTimeField0, dateTimeZone0, durationField0, durationField0, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      Locale locale0 = Locale.CHINA;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      int int0 = zonedChronology_ZonedDateTimeField0.getMaximumTextLength(locale0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.era();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(copticChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, fixedDateTimeZone0, durationField0, durationField0, durationField0);
      Locale locale0 = Locale.CHINA;
      int int0 = zonedChronology_ZonedDateTimeField0.getMaximumShortTextLength(locale0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-28));
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      int[] intArray0 = new int[2];
      int int0 = zonedChronology_ZonedDateTimeField0.getMinimumValue((ReadablePartial) null, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.era();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(copticChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, fixedDateTimeZone0, durationField0, durationField0, durationField0);
      String string0 = zonedChronology_ZonedDateTimeField0.getAsText((long) 1);
      assertEquals("AM", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      // Undeclared exception!
      try { 
        zonedChronology_ZonedDateTimeField0.set((long) 0, " wJk");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \" wJk\" for yearOfEra is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      String string0 = zonedChronology_ZonedDateTimeField0.getAsShortText(1242L);
      assertEquals("1970", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, (DurationField) null, millisDurationField0, (DurationField) null);
      int[] intArray0 = new int[0];
      int int0 = zonedChronology_ZonedDateTimeField0.getMaximumValue((ReadablePartial) null, intArray0);
      assertEquals(292278993, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, (DurationField) null, millisDurationField0, (DurationField) null);
      int int0 = zonedChronology_ZonedDateTimeField0.getMaximumValue((ReadablePartial) null);
      assertEquals(292278993, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours((-7));
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      int int0 = zonedChronology_ZonedDateTimeField0.getMinimumValue((long) (-7));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance((DateTimeZone) null);
      DateTimeField dateTimeField0 = copticChronology0.minuteOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 25650000);
      DurationField durationField0 = offsetDateTimeField0.getLeapDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2102);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      DurationField durationField0 = gJYearOfEraDateTimeField0.getDurationField();
      assertNotNull(durationField0);
      assertEquals("hours", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.dayOfYear();
      int int0 = dateTimeField0.getMaximumValue((long) 1);
      assertEquals(365, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      int int0 = zonedChronology_ZonedDateTimeField0.getMinimumValue((ReadablePartial) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      int int0 = zonedChronology_ZonedDateTimeField0.getLeapAmount(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.era();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      BasicWeekyearDateTimeField basicWeekyearDateTimeField0 = new BasicWeekyearDateTimeField(copticChronology0);
      DurationField durationField0 = basicWeekyearDateTimeField0.getLeapDurationField();
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField0, fixedDateTimeZone0, durationField0, durationField0, durationField0);
      boolean boolean0 = zonedChronology_ZonedDateTimeField0.isLenient();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      Locale locale0 = Locale.CHINA;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      String string0 = zonedChronology_ZonedDateTimeField0.getAsShortText((ReadablePartial) null, 0, locale0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(2102);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = copticChronology0.hourOfDay();
      GJYearOfEraDateTimeField gJYearOfEraDateTimeField0 = new GJYearOfEraDateTimeField(dateTimeField0, copticChronology0);
      DurationField durationField0 = gJYearOfEraDateTimeField0.getRangeDurationField();
      assertNotNull(durationField0);
      assertEquals("days", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(21);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      Locale locale0 = Locale.CHINA;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      String string0 = zonedChronology_ZonedDateTimeField0.getAsText((ReadablePartial) null, 21, locale0);
      assertEquals("21", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.weekyearOfCentury();
      DateTimeField dateTimeField1 = LenientDateTimeField.getInstance(dateTimeField0, copticChronology0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(dateTimeField1, dateTimeZone0, (DurationField) null, (DurationField) null, (DurationField) null);
      long long0 = zonedChronology_ZonedDateTimeField0.set((-2296L), 1);
      assertEquals((-2713737602296L), long0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ISOYearOfEraDateTimeField iSOYearOfEraDateTimeField0 = (ISOYearOfEraDateTimeField)ISOYearOfEraDateTimeField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(0);
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      ZonedChronology.ZonedDateTimeField zonedChronology_ZonedDateTimeField0 = new ZonedChronology.ZonedDateTimeField(iSOYearOfEraDateTimeField0, dateTimeZone0, millisDurationField0, millisDurationField0, millisDurationField0);
      long long0 = zonedChronology_ZonedDateTimeField0.remainder(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.dayOfYear();
      boolean boolean0 = dateTimeField0.isLeap(1);
      assertFalse(boolean0);
  }
}
