/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:56:53 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.CharArrayWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.joda.time.Chronology;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormatterBuilder$PaddedNumber_ESTest extends DateTimeFormatterBuilder$PaddedNumber_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 195, true, 0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Sh)!ux4NJZ", true);
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(mockFileOutputStream0);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      LocalDateTime localDateTime0 = LocalDateTime.now((Chronology) copticChronology0);
      Locale locale0 = new Locale("Sh)!ux4NJZ");
      dateTimeFormatterBuilder_PaddedNumber0.printTo((Writer) outputStreamWriter0, (ReadablePartial) localDateTime0, locale0);
      assertEquals("sh)!ux4njz", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 195, true, 0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Sh)!ux4NJZ", true);
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(mockFileOutputStream0);
      LocalTime localTime0 = LocalTime.now();
      Locale locale0 = new Locale("Sh)!ux4NJZ");
      dateTimeFormatterBuilder_PaddedNumber0.printTo((Writer) outputStreamWriter0, (ReadablePartial) localTime0, locale0);
      assertEquals("", locale0.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (-1), true);
      StringBuffer stringBuffer0 = new StringBuffer("Types array must not contain null");
      MockDate mockDate0 = new MockDate((-1), (-1), (-1));
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(mockDate0);
      dateTimeFormatterBuilder_FixedNumber0.printTo(stringBuffer0, (ReadablePartial) localDateTime0, (Locale) null);
      assertEquals(34, stringBuffer0.length());
      assertEquals("Types array must not contain null0", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber((DateTimeFieldType) null, 0, true);
      StringBuffer stringBuffer0 = new StringBuffer(0);
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      Partial partial0 = new Partial(julianChronology0);
      Locale locale0 = Locale.forLanguageTag("");
      dateTimeFormatterBuilder_FixedNumber0.printTo(stringBuffer0, (ReadablePartial) partial0, locale0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.PaddedNumber dateTimeFormatterBuilder_PaddedNumber0 = new DateTimeFormatterBuilder.PaddedNumber(dateTimeFieldType0, 195, true, 0);
      int int0 = dateTimeFormatterBuilder_PaddedNumber0.estimatePrintedLength();
      assertEquals(195, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4739, true);
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      Locale locale0 = Locale.PRC;
      dateTimeFormatterBuilder_FixedNumber0.printTo((Writer) charArrayWriter0, (long) 4739, (Chronology) null, 0, dateTimeZone0, locale0);
      assertEquals(4739, charArrayWriter0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekOfWeekyear();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, 4739, true);
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(0, 0);
      Locale locale0 = Locale.PRC;
      StringBuffer stringBuffer0 = new StringBuffer(4739);
      dateTimeFormatterBuilder_FixedNumber0.printTo(stringBuffer0, (-1L), (Chronology) gregorianChronology0, (-292269054), dateTimeZone0, locale0);
      assertEquals(4739, stringBuffer0.length());
  }
}
