/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 21:18:17 GMT 2019
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ISODateTimeFormat_ESTest extends ISODateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ISODateTimeFormat.basicDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ISODateTimeFormat.weekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeekDay();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISODateTimeFormat.weekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecondFraction();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinute();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISODateTimeFormat.basicWeekDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDate();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ISODateTimeFormat.basicDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.ordinalDate();
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ISODateTimeFormat.weekyearWeek();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeek();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISODateTimeFormat.basicDate();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISODateTimeFormat.yearMonth();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.yearMonth();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ISODateTimeFormat.hourMinuteSecondFraction();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.tTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ISODateTimeFormat.dateHour();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHour();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecondFraction();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondFraction();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecond();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecond();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ISODateTimeFormat.dateHourMinute();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinute();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.hourMinuteSecondMillis();
      assertNotSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ISODateTimeFormat.hourMinute();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinute();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecond();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinuteSecond();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTime();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.weekDateTime();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ISODateTimeFormat.weekDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.tTime();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.ordinalDateTimeNoMillis();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ISODateTimeFormat.basicDateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTime();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.ordinalDateTime();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ISODateTimeFormat.basicTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTimeNoMillis();
      assertNotNull(dateTimeFormatter0);
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ISODateTimeFormat.dateTime();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ISODateTimeFormat.localDateOptionalTimeParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateOptionalTimeParser();
      assertNotNull(dateTimeFormatter0);
      assertFalse(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ISODateTimeFormat.basicDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.basicOrdinalDateTime();
      assertSame(dateTimeFormatter1, dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ISODateTimeFormat.dateOptionalTimeParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeParser();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ISODateTimeFormat.ordinalDateTimeNoMillis();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localTimeParser();
      assertTrue(dateTimeFormatter0.isPrinter());
      assertNotNull(dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ISODateTimeFormat.dateParser();
      ISODateTimeFormat.dateParser();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedList0, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeParser();
      assertTrue(dateTimeFormatter0.isPrinter());
      assertNotNull(dateTimeFormatter0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ISODateTimeFormat.dateElementParser();
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateParser();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ISODateTimeFormat.dateOptionalTimeParser();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      linkedHashSet0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid format for fields: [halfdayOfDay]
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ISODateTimeFormat.hourMinuteSecondFraction();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      linkedHashSet0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid format for fields: [halfdayOfDay]
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ISODateTimeFormat.weekDateTimeNoMillis();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      linkedHashSet0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid format for fields: [halfdayOfDay]
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ISODateTimeFormat.weekyearWeek();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ISODateTimeFormat.tTime();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields((Collection<DateTimeFieldType>) null, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ISODateTimeFormat.dateOptionalTimeParser();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      linkedHashSet0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid ISO8601 format for fields: []
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ISODateTimeFormat.dateTime();
      LinkedList<DateTimeFieldType> linkedList0 = new LinkedList<DateTimeFieldType>();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedList0, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecondFraction();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields((Collection<DateTimeFieldType>) null, false, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeElementParser();
      assertTrue(dateTimeFormatter0.isPrinter());
      
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter1 = ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      assertTrue(dateTimeFormatter1.isParser());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ISODateTimeFormat.dateHour();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      linkedHashSet0.add(dateTimeFieldType0);
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.forFields(linkedHashSet0, true, false);
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateParser();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ISODateTimeFormat.dateParser();
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields((Collection<DateTimeFieldType>) null, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ISODateTimeFormat.dateHourMinuteSecondFraction();
      LinkedHashSet<DateTimeFieldType> linkedHashSet0 = new LinkedHashSet<DateTimeFieldType>();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.millisOfSecond();
      linkedHashSet0.add(dateTimeFieldType0);
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields(linkedHashSet0, true, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No valid ISO8601 format for fields: []
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }
}
