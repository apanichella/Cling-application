/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 05:21:29 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.MonthDay;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeParserBucket;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat$StyleFormatter_ESTest extends DateTimeFormat$StyleFormatter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, (-3174), 0);
      Locale locale0 = Locale.KOREA;
      String string0 = dateTimeFormat_StyleFormatter0.getPattern(locale0);
      assertEquals("yyyy'\uB144' M'\uC6D4' d'\uC77C' EEEE", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(2, 31, 2);
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.getPattern(locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 31
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(1, 1, 1);
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.getPattern((Locale) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter((-1), (-1), (-1));
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.parseInto((DateTimeParserBucket) null, "", (-1));
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
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, (-1035), (-1035));
      int int0 = dateTimeFormat_StyleFormatter0.estimateParsedLength();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(0, 0, 0);
      StringBuffer stringBuffer0 = new StringBuffer("");
      MonthDay monthDay0 = new MonthDay();
      Locale locale0 = Locale.ITALIAN;
      dateTimeFormat_StyleFormatter0.printTo(stringBuffer0, (ReadablePartial) monthDay0, locale0);
      assertEquals("\uFFFD 14 febbraio \uFFFD\uFFFD\uFFFD\uFFFD", stringBuffer0.toString());
      assertEquals(18, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(1170, 0, 1170);
      StringBuffer stringBuffer0 = new StringBuffer();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Locale locale0 = Locale.ENGLISH;
      DateTimeParserBucket dateTimeParserBucket0 = new DateTimeParserBucket(0L, buddhistChronology0, locale0, (Integer) 1, (-548));
      DateTimeZone dateTimeZone0 = dateTimeParserBucket0.getZone();
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo(stringBuffer0, 10000000000000L, (Chronology) buddhistChronology0, (-548), dateTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No datetime pattern for locale: en
         //
         verifyException("org.joda.time.format.DateTimeFormat$StyleFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter((-1704), (-1704), 8);
      int int0 = dateTimeFormat_StyleFormatter0.estimatePrintedLength();
      assertEquals(40, int0);
  }
}
