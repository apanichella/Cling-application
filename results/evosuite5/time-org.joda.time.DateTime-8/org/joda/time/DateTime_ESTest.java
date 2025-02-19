/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 04:38:18 GMT 2019
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTime_ESTest extends DateTime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.property((DateTimeFieldType) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The DateTimeFieldType must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTime.Property dateTime_Property0 = dateTime0.property(dateTimeFieldType0);
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMillis(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusMillis(1);
      assertEquals(1392409281319L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusSeconds(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusSeconds(1107);
      assertEquals(1392408174320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusMinutes(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusMinutes(2593);
      assertEquals(1392253701320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusHours(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusHours((-2147477935));
      assertEquals(7732312975281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusDays(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusDays((-16));
      assertEquals(1393791681320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusWeeks(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusWeeks(1107);
      assertEquals(722895681320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMonths(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.minusMonths(2985);
      assertEquals((-6457546690680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusYears(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minusYears(23);
      assertEquals(666562881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMillis(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusMillis((-7));
      assertEquals(1392409281313L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusSeconds(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusSeconds((-1));
      assertEquals(1392409280320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMinutes(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusMinutes(255);
      assertEquals(1392424581320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusHours(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusHours(1);
      assertEquals(1392412881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusDays(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusDays((-2147483646));
      assertEquals((-185541194602690680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusWeeks(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusWeeks((-1));
      assertEquals(1391804481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMonths(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusMonths((-3790));
      assertEquals((-8574433090680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plusYears(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusYears(1092);
      assertEquals(35852530881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Days days0 = Days.THREE;
      DateTime dateTime1 = dateTime0.withPeriodAdded(days0, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Seconds seconds0 = Seconds.THREE;
      DateTime dateTime1 = dateTime0.plus((ReadablePeriod) seconds0);
      assertEquals(1392409284320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Days days0 = Days.daysBetween((ReadableInstant) dateTime0, (ReadableInstant) dateTime0);
      Minutes minutes0 = Minutes.standardMinutesIn(days0);
      Duration duration0 = minutes0.toStandardDuration();
      DateTime dateTime1 = dateTime0.withDurationAdded((ReadableDuration) duration0, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withDurationAdded(31449600000L, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Duration duration0 = Duration.millis(0L);
      DateTime dateTime1 = dateTime0.minus((ReadableDuration) duration0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DurationFieldType durationFieldType0 = DurationFieldType.millis();
      DateTime dateTime1 = dateTime0.withFieldAdded(durationFieldType0, 432);
      assertEquals(1392409281752L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withFieldAdded((DurationFieldType) null, (-2147483628));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DurationFieldType durationFieldType0 = DurationFieldType.weekyears();
      DateTime dateTime1 = dateTime0.withFieldAdded(durationFieldType0, 0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withField((DateTimeFieldType) null, 62);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      // Undeclared exception!
      try { 
        dateTime0.withField(dateTimeFieldType0, 2858);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2858 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withFields((ReadablePartial) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      MonthDay monthDay0 = new MonthDay();
      DateTime dateTime1 = dateTime0.withFields(monthDay0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withZoneRetainFields((DateTimeZone) null);
      //  // Unstable assertion: assertNotSame(dateTime1, dateTime0);
      //  // Unstable assertion: assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime1 = dateTime0.withZoneRetainFields(fixedDateTimeZone0);
      assertEquals(1392412881320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTime dateTime1 = dateTime0.withChronology(islamicChronology0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTime dateTime1 = dateTime0.toDateTime((Chronology) julianChronology0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) null);
      //  // Unstable assertion: assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime1 = dateTime0.toDateTime((DateTimeZone) fixedDateTimeZone0);
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.toDateTimeISO();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTime dateTime0 = new DateTime((-665L), (Chronology) buddhistChronology0);
      DateTime dateTime1 = dateTime0.toDateTimeISO();
      assertNotSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTime.now((Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Chronology must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTime.now((DateTimeZone) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Zone must not be null
         //
         verifyException("org.joda.time.DateTime", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.yearOfCentury();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfWeek();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.weekyear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withHourOfDay(5);
      assertEquals(1392351681320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withZone((DateTimeZone) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withDate((-753), (-753), (-753));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -753 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfMonth();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withEarlierOffsetAtOverlap();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      DateTime dateTime0 = new DateTime((Object) null, (DateTimeZone) null);
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      DateTime dateTime0 = new DateTime((-1117L));
      assertEquals((-1117L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfMinute();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plus(282L);
      assertEquals(1392409281602L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withYear(1221);
      assertEquals((-23632225090680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withMillisOfSecond(1023);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1023 for millisOfSecond must be in the range [0,999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfSecond();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minus(282L);
      assertEquals(1392409281038L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.yearOfEra();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.millisOfDay();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withYearOfCentury(1023);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1023 for yearOfCentury must be in the range [0,99]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withEra((-2610));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2610 for era must be in the range [0,1]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LenientChronology lenientChronology0 = LenientChronology.getInstance(copticChronology0);
      DateTime dateTime0 = new DateTime(1891, 1891, 1891, 3118, 47, 1891, lenientChronology0);
      assertEquals(11223011911000L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1);
      assertEquals((-62135594312000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      LocalTime localTime0 = dateTime0.toLocalTime();
      assertEquals(4, localTime0.size());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      LocalDateTime localDateTime0 = dateTime0.toLocalDateTime();
      assertEquals(4, localDateTime0.size());
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateMidnight dateMidnight0 = dateTime0.toDateMidnight();
      assertEquals(1392332400000L, dateMidnight0.getMillis());
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      DateTime dateTime0 = null;
      try {
        dateTime0 = new DateTime((-283), (-568), (-283), (-568), (-6183), 97, (DateTimeZone) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -568 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withMillisOfDay(84);
      assertEquals(1392332400084L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.hourOfDay();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, islamicChronology0);
      assertEquals((-42521584712000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfYear(2327);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 2327 for dayOfYear must be in the range [1,365]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withMonthOfYear((-2624));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2624 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = new DateTime(dateTime0, (Chronology) null);
      assertTrue(dateTime1.equals((Object)dateTime0));
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withTimeAtStartOfDay();
      assertNotSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withYearOfEra((-2147483640));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2147483640 for yearOfEra must be in the range [1,292278993]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.secondOfDay();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.dayOfYear();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withMinuteOfHour((-16));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -16 for minuteOfHour must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.withLaterOffsetAtOverlap();
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.plus((ReadablePeriod) null);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, 1, dateTimeZone0);
      assertEquals((-62135594310999L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.centuryOfEra();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plus((ReadableDuration) null);
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      DateTime dateTime0 = DateTime.now((Chronology) islamicChronology0);
      assertEquals(1392409281320L, dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTime.parse("$ac2$l/FXPR^ & ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid format: \"$ac2$l/FXPR^ & \"
         //
         verifyException("org.joda.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfMonth((-516));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -516 for dayOfMonth must be in the range [1,28]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withWeekOfWeekyear(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 0 for weekOfWeekyear must be in the range [1,52]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      DateTime dateTime0 = null;
      try {
        dateTime0 = new DateTime((-2839), 0, 0, (-2839), (-2839), dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2839 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withCenturyOfEra((-483));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -483 for centuryOfEra must be in the range [0,2922789]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withTime(1482, 1482, 1482, 1482);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1482 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfHour();
      assertNotNull(dateTime_Property0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      // Undeclared exception!
      try { 
        dateTime0.withDayOfWeek(17);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 17 for dayOfWeek must be in the range [1,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.toDateTime();
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1, 1);
      assertEquals((-62135594310999L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      // Undeclared exception!
      try { 
        dateTime0.withSecondOfMinute((-1626));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1626 for secondOfMinute must be in the range [0,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.withWeekyear(44);
      assertEquals((-60774375490680L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime dateTime1 = dateTime0.minus((ReadablePeriod) null);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      DateTime dateTime0 = new DateTime(1, 1, 1, 1, 1, 1);
      assertEquals((-62135594311000L), dateTime0.getMillis());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfDay();
      DateTime dateTime1 = dateTime_Property0.addWrapFieldToCopy(543);
      assertEquals(1392355461320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.year();
      // Undeclared exception!
      try { 
        dateTime_Property0.addToCopy(1392409281127L);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: 1392409281127
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(14);
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfDay();
      DateTime dateTime1 = dateTime_Property0.roundCeilingCopy();
      assertEquals(1392409320000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.year();
      Chronology chronology0 = dateTime_Property0.getChronology();
      assertNotNull(chronology0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.year();
      DateTime dateTime1 = dateTime_Property0.roundHalfEvenCopy();
      assertEquals(1388530800000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      DateTime dateTime0 = new DateTime((Object) null);
      DateTime.Property dateTime_Property0 = dateTime0.weekOfWeekyear();
      // Undeclared exception!
      try { 
        dateTime_Property0.setCopy("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value \"\" for weekOfWeekyear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      DateTime dateTime0 = new DateTime((-1L), dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.year();
      DateTime dateTime1 = dateTime_Property0.addToCopy(0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.year();
      DateTime dateTime1 = dateTime_Property0.roundHalfCeilingCopy();
      assertEquals(1388530800000L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      DateTime dateTime0 = new DateTime((Object) null);
      DateTime.Property dateTime_Property0 = dateTime0.era();
      DateTime dateTime1 = dateTime_Property0.roundFloorCopy();
      assertEquals((-62135600400000L), dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      LocalDateTime localDateTime0 = LocalDateTime.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = localDateTime0.toDateTime(dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.monthOfYear();
      DateTime dateTime1 = dateTime_Property0.getDateTime();
      assertSame(dateTime0, dateTime1);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis((-1955));
      DateTime dateTime0 = DateTime.now(dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.minuteOfDay();
      DateTime dateTime1 = dateTime_Property0.withMaximumValue();
      assertEquals(1392422361320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      DateTime dateTime0 = new DateTime((Object) null);
      DateTime.Property dateTime_Property0 = dateTime0.weekOfWeekyear();
      DateTime dateTime1 = dateTime_Property0.withMinimumValue();
      assertEquals(1388780481320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime.Property dateTime_Property0 = dateTime0.year();
      DateTime dateTime1 = dateTime_Property0.roundHalfFloorCopy();
      assertEquals(1388530800000L, dateTime1.getMillis());
  }
}
