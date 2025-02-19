/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 20:59:34 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Writer;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeParserBucket;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat$StyleFormatter_ESTest extends DateTimeFormat$StyleFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter((-383), 354, 2);
      Locale locale0 = Locale.ITALY;
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.getPattern(locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 354
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(1, 1, 1);
      Locale locale0 = new Locale("'", "");
      String string0 = dateTimeFormat_StyleFormatter0.getPattern(locale0);
      assertEquals("h:mm:ss a z", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(1, 0, 0);
      Locale locale0 = Locale.GERMAN;
      String string0 = dateTimeFormat_StyleFormatter0.getPattern(locale0);
      assertEquals("d. MMMM yyyy", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(1, 1, 1362);
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.parseInto((DateTimeParserBucket) null, "", 1362);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormat$StyleFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(1);
      Locale locale0 = Locale.JAPAN;
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo((Writer) null, (long) 1, (Chronology) null, 1, dateTimeZone0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, (-1489), 0);
      int int0 = dateTimeFormat_StyleFormatter0.estimateParsedLength();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(1, 1, 1);
      StringBuffer stringBuffer0 = new StringBuffer("%s");
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo(stringBuffer0, (ReadablePartial) null, (Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter((-1461), (-1461), (-696));
      StringBuffer stringBuffer0 = new StringBuffer("");
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      Locale locale0 = Locale.CANADA_FRENCH;
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo(stringBuffer0, (long) (-696), (Chronology) null, (-2605), (DateTimeZone) fixedDateTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No datetime pattern for locale: fr_CA
         //
         verifyException("org.joda.time.format.DateTimeFormat$StyleFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(1, 1, 1);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHours(1);
      LocalDate localDate0 = LocalDate.now(dateTimeZone0);
      Locale locale0 = Locale.CHINA;
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo((Writer) null, (ReadablePartial) localDate0, locale0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$TextField", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, (-2232), 1618);
      int int0 = dateTimeFormat_StyleFormatter0.estimatePrintedLength();
      assertEquals(40, int0);
  }
}
