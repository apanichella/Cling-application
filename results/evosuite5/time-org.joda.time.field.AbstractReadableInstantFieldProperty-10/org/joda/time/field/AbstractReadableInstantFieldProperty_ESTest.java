/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:45:45 GMT 2019
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractReadableInstantFieldProperty_ESTest extends AbstractReadableInstantFieldProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      LocalDate.Property localDate_Property1 = localDate0.centuryOfEra();
      boolean boolean0 = localDate_Property0.equals(localDate_Property1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      LocalDate.Property localDate_Property0 = localDate0.property(dateTimeFieldType0);
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.property(dateTimeFieldType0);
      boolean boolean0 = localDate_Property0.equals(dateMidnight_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.dayOfWeek();
      LocalDate.Property localDate_Property1 = localDate0.centuryOfEra();
      boolean boolean0 = localDate_Property1.equals(localDate_Property0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      boolean boolean0 = localDate_Property0.equals(localDate0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.yearOfCentury();
      LocalDate localDate1 = localDate0.withWeekyear((-1));
      int int0 = localDate_Property0.compareTo((ReadablePartial) localDate1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.yearOfCentury();
      LocalDate localDate1 = localDate_Property0.roundCeilingCopy();
      int int0 = localDate_Property0.compareTo((ReadablePartial) localDate1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      // Undeclared exception!
      try { 
        localDate_Property0.compareTo((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The partial must not be null
         //
         verifyException("org.joda.time.field.AbstractReadableInstantFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.yearOfCentury();
      int int0 = localDate_Property0.compareTo((ReadablePartial) localDate0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      DateMidnight dateMidnight0 = localDate0.toDateMidnight();
      DateMidnight dateMidnight1 = dateMidnight0.withCenturyOfEra(3655);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight1.weekyear();
      int int0 = dateMidnight_Property0.compareTo((ReadableInstant) dateMidnight0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight dateMidnight1 = new DateMidnight(1L);
      DateMidnight.Property dateMidnight_Property0 = dateMidnight1.dayOfWeek();
      int int0 = dateMidnight_Property0.compareTo((ReadableInstant) dateMidnight0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.yearOfEra();
      // Undeclared exception!
      try { 
        dateMidnight_Property0.compareTo((ReadableInstant) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant must not be null
         //
         verifyException("org.joda.time.field.AbstractReadableInstantFieldProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfWeek();
      int int0 = dateMidnight_Property0.compareTo((ReadableInstant) dateMidnight0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.year();
      long long0 = localDate_Property0.getDifferenceAsLong((ReadableInstant) null);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.weekOfWeekyear();
      long long0 = dateMidnight_Property0.getDifferenceAsLong(dateMidnight0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      int int0 = localDate_Property0.getDifference((ReadableInstant) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.dayOfYear();
      int int0 = dateMidnight_Property0.getDifference(dateMidnight0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.weekOfWeekyear();
      LocalDate localDate1 = localDate_Property0.withMinimumValue();
      assertFalse(localDate1.equals((Object)localDate0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.yearOfEra();
      DateMidnight dateMidnight1 = dateMidnight_Property0.withMaximumValue();
      assertNotSame(dateMidnight0, dateMidnight1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      DurationField durationField0 = localDate_Property0.getRangeDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      long long0 = localDate_Property0.remainder();
      assertEquals((-1763424000000L), long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      localDate_Property0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      DurationField durationField0 = localDate_Property0.getLeapDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      Interval interval0 = localDate_Property0.toInterval();
      assertEquals(946684800000L, interval0.getStartMillis());
      assertEquals(4102444800000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      String string0 = localDate_Property0.toString();
      assertEquals("Property[centuryOfEra]", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.dayOfYear();
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.property(dateTimeFieldType0);
      int int0 = dateMidnight_Property0.getMaximumValueOverall();
      assertEquals(366, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.year();
      String string0 = localDate_Property0.getAsString();
      assertEquals("2014", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateMidnight dateMidnight0 = DateMidnight.now();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.monthOfYear();
      String string0 = dateMidnight_Property0.getAsShortText();
      assertEquals("Feb", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.year();
      Locale locale0 = Locale.CHINESE;
      int int0 = localDate_Property0.getMaximumShortTextLength(locale0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.dayOfMonth();
      String string0 = localDate_Property0.getAsText();
      assertEquals("14", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      int int0 = localDate_Property0.getMinimumValueOverall();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      DurationField durationField0 = localDate_Property0.getDurationField();
      assertTrue(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      Locale locale0 = Locale.ROOT;
      int int0 = localDate_Property0.getMaximumTextLength(locale0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateMidnight dateMidnight0 = new DateMidnight();
      DateMidnight.Property dateMidnight_Property0 = dateMidnight0.weekOfWeekyear();
      int int0 = dateMidnight_Property0.getLeapAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.year();
      LocalDate.Property localDate_Property1 = localDate0.yearOfEra();
      boolean boolean0 = localDate_Property0.equals(localDate_Property1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      boolean boolean0 = localDate_Property0.isLeap();
      assertFalse(boolean0);
  }
}
