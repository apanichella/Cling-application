/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 21:28:25 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$TextField_ESTest extends DateTimeFormatterBuilder$TextField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.CANADA_FRENCH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(5133L, copticChronology0, locale0, (Integer) copticChronology0.AM, 1);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "R9", 1);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.era();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(841L, buddhistChronology0, (Locale) null, (Integer) buddhistChronology0.BE, 1);
      dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "}-*tz:v3)3UcB#/j:", 1);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALIAN;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(1398L, copticChronology0, locale0, (Integer) 1, 1);
      int int0 = dateTimeFormatterBuilder_TextField0.parseInto(dateTimeParserBucket0, "bce", 1);
      assertEquals(20, dateTimeFormatterBuilder_TextField0.estimateParsedLength());
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      LocalDate localDate0 = new LocalDate();
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.printTo((StringBuffer) null, (ReadablePartial) localDate0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      Locale locale0 = new Locale("kd~v", "org.joda.time.Hours", "kd~v");
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.printTo((Writer) null, 0L, (Chronology) islamicChronology0, 11, (DateTimeZone) null, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.yearOfCentury();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      int int0 = dateTimeFormatterBuilder_TextField0.estimatePrintedLength();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = new LocalDateTime((Object) null, gJChronology0);
      Locale locale0 = Locale.US;
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, (ReadablePartial) localDateTime0, locale0);
      assertEquals("73281", stringBuffer0.toString());
      assertEquals("73281", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      int int0 = dateTimeFormatterBuilder_TextField0.estimateParsedLength();
      assertEquals(20, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, true);
      GJChronology gJChronology0 = GJChronology.getInstanceUTC();
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      // Undeclared exception!
      try { 
        dateTimeFormatterBuilder_TextField0.printTo((Writer) null, (-577L), (Chronology) gJChronology0, 365, (DateTimeZone) fixedDateTimeZone0, (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField((DateTimeFieldType) null, false);
      StringBuffer stringBuffer0 = new StringBuffer(0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      DateMidnight dateMidnight0 = new DateMidnight(dateTimeZone0);
      Chronology chronology0 = dateMidnight0.getChronology();
      Locale locale0 = Locale.ITALY;
      dateTimeFormatterBuilder_TextField0.printTo(stringBuffer0, 604800000L, chronology0, 0, dateTimeZone0, locale0);
      assertEquals("\uFFFD", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfMinute();
      DateTimeFormatterBuilder.TextField dateTimeFormatterBuilder_TextField0 = new DateTimeFormatterBuilder.TextField(dateTimeFieldType0, false);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      Locale locale0 = Locale.ITALIAN;
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(1);
      dateTimeFormatterBuilder_TextField0.printTo((Writer) charArrayWriter0, (ReadablePartial) localDateTime0, locale0);
      assertEquals(2, charArrayWriter0.size());
      assertEquals("21", charArrayWriter0.toString());
  }
}
