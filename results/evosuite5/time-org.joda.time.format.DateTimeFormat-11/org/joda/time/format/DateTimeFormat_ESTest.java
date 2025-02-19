/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 20:47:34 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DateTimeFormat_ESTest extends DateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(2, 2236, 2);
      assertEquals(40, dateTimeFormat_StyleFormatter0.estimatePrintedLength());
      assertEquals(40, dateTimeFormat_StyleFormatter0.estimateParsedLength());
      assertNotNull(dateTimeFormat_StyleFormatter0);
      
      Locale locale0 = Locale.JAPAN;
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("ja_JP", locale0.toString());
      assertEquals("JP", locale0.getCountry());
      assertEquals("ja", locale0.getLanguage());
      assertNotNull(locale0);
      
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.getPattern(locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal time style 2236
         //
         verifyException("java.text.DateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forStyle("MD");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid style character: D
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forStyle("Ll");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid style character: l
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = Locale.UK;
      assertEquals("en_GB", locale0.toString());
      assertEquals("en", locale0.getLanguage());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("GB", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("GBR", locale0.getISO3Country());
      assertNotNull(locale0);
      
      // Undeclared exception!
      try { 
        DateTimeFormat.patternForStyle("Fj", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid style character: j
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forStyle("-Q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid style character: Q
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.toString());
      assertNotNull(locale0);
      
      // Undeclared exception!
      try { 
        DateTimeFormat.patternForStyle("Zy:.mxd", locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid style specification: Zy:.mxd
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forStyle((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid style specification: null
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern specification
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern specification
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("Y.e\",m2Ywf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern(" >Yf3c@QV");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("xU2eW(p&#!T%i");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("]xSF9hZ'uv@V5j=>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: F
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("-KyP&9!v'C");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("YGq.e\",m2Ywf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("yEnmR");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("-KyD!vt'C");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: v
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("17''2VEqtr \u0004LN");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("'");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Both printing and parsing not supported
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("ZZPmZe3o%[}L)v*zt");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: P
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("ZZZca`3t");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.forPattern("\"x0|5&^7Z3Y");
      assertTrue(dateTimeFormatter0.isPrinter());
      assertFalse(dateTimeFormatter0.isOffsetParsed());
      assertTrue(dateTimeFormatter0.isParser());
      assertNull(dateTimeFormatter0.getPivotYear());
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
      assertNotNull(dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("<E2Yu):|!}':Iet d|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: u
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("Y.e\"7,m2Ytwf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: t
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("Yq.e\",m2Yw");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: q
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("xpvG)e,n<f");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: p
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("Ye\",=2Yo^Z");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: o
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("xn0zRp_^uaq1Vb1/!e");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: n
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("ym/ISa0Dn)8");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: I
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("YleM,F2Ywf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: l
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("xj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: j
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("Maximum value exceeded for add");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: i
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("h~hYs<(+=O`|OkW");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern(";9xgWDwNY1w2$^");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: g
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("8 d2>y/+fHjtpWnd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: f
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("we;yYXaP+");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: X
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("YWM,F2-Ywf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: W
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("YV<#.&|O7f(wK{}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: V
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("kxx(Ue");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: U
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("(yTop$4Y");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: T
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("Sxc^q>;aP;),KuOH-");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: c
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("4YRv=8`p");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: R
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("`[xQW5\"*d~94yo=(+c");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: Q
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("9`YOE<xDD)\"$-g");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: O
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("@y0xN)nN1.Xb(L?Nj");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: N
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forPattern("YM,F2Ywf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern component: F
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test46()  throws Throwable  {
      DateTimeFormat.forPattern("#xLZw");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test47()  throws Throwable  {
      DateTimeFormat.forPattern("&YxKr.2C<{2L$");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test48()  throws Throwable  {
      DateTimeFormat.forPattern("a|yJ+J*$\"nU|3");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test49()  throws Throwable  {
      DateTimeFormat.forPattern("YIJf");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test50()  throws Throwable  {
      DateTimeFormat.forPattern("7}Hyb}_g=G@");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test51()  throws Throwable  {
      DateTimeFormat.forPattern("GyyearA28fEra");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(32, 0, 32);
      MockFileWriter mockFileWriter0 = new MockFileWriter("No valid ISO8601 format for fields: ", true);
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) null);
      Locale locale0 = new Locale("No valid ISO8601 format for fields: ", "No valid ISO8601 format for fields: ");
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo((Writer) mockFileWriter0, (-1283L), (Chronology) copticChronology0, 0, dateTimeZone0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No datetime pattern for locale: no valid iso8601 format for fields: _NO VALID ISO8601 FORMAT FOR FIELDS: 
         //
         verifyException("org.joda.time.format.DateTimeFormat$StyleFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter(292272984, 7593748, 7593748);
      int int0 = dateTimeFormat_StyleFormatter0.estimateParsedLength();
      assertEquals(40, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DateTimeFormat.StyleFormatter dateTimeFormat_StyleFormatter0 = new DateTimeFormat.StyleFormatter((-1801), (-1801), (-1801));
      StringWriter stringWriter0 = new StringWriter();
      LocalTime localTime0 = LocalTime.now();
      Locale locale0 = Locale.US;
      // Undeclared exception!
      try { 
        dateTimeFormat_StyleFormatter0.printTo((Writer) stringWriter0, (ReadablePartial) localTime0, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No datetime pattern for locale: en_US
         //
         verifyException("org.joda.time.format.DateTimeFormat$StyleFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      LocalDate localDate0 = new LocalDate((Object) null);
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.longDate();
      String string0 = localDate0.toString(dateTimeFormatter0);
      //  // Unstable assertion: assertEquals("February 14, 2014 \uFFFD:\uFFFD\uFFFD:\uFFFD\uFFFD \uFFFD ", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.shortDateTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.mediumDateTime();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.forStyle("S$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid style character: $
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.shortDate();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DateTimeFormat dateTimeFormat0 = new DateTimeFormat();
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.fullDate();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test62()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.mediumDate();
      // Undeclared exception!
      try { 
        MonthDay.parse((String) null, dateTimeFormatter0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.fullDateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.shortTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      // Undeclared exception!
      try { 
        DateTimeFormat.appendPatternTo((DateTimeFormatterBuilder) null, "0?67'Fb|.#KN?4");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.format.DateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.longTime();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.longDateTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.mediumTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormat.fullTime();
      StringBuffer stringBuffer0 = new StringBuffer();
      DateMidnight dateMidnight0 = new DateMidnight();
      dateTimeFormatter0.printTo((Appendable) stringBuffer0, (ReadableInstant) dateMidnight0);
      assertEquals(18, stringBuffer0.length());
      assertEquals("12:00:00 AM +01:00", stringBuffer0.toString());
  }
}
