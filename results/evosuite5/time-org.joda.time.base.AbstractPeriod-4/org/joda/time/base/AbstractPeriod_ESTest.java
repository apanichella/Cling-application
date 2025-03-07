/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 03:04:47 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.Seconds;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractPeriod_ESTest extends AbstractPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.months(1242);
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      String string0 = period0.toString(periodFormatter0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.months(1242);
      period0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      YearMonth yearMonth0 = YearMonth.now((Chronology) ethiopicChronology0);
      Seconds seconds0 = Seconds.secondsBetween((ReadablePartial) yearMonth0, (ReadablePartial) yearMonth0);
      PeriodType periodType0 = PeriodType.months();
      MutablePeriod mutablePeriod0 = new MutablePeriod(periodType0);
      boolean boolean0 = mutablePeriod0.equals(seconds0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = new Period((-3339L), (PeriodType) null);
      Period period1 = period0.normalizedStandard((PeriodType) null);
      boolean boolean0 = period0.equals(period1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hours hours0 = Hours.hours(1242);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Period period0 = new Period((long) 1242, (PeriodType) null, (Chronology) buddhistChronology0);
      boolean boolean0 = period0.equals(hours0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = Period.months(1242);
      Object object0 = new Object();
      boolean boolean0 = period0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = new Period((-3371L), (PeriodType) null);
      Period period1 = period0.plusMillis((-1));
      boolean boolean0 = period0.equals(period1);
      assertFalse(boolean0);
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = new Period((-3371L), (PeriodType) null);
      int int0 = period0.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period((-3339L), (PeriodType) null);
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.months(4250);
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("P4250M", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodParser periodParser0 = mock(PeriodParser.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(periodParser0).parseInto(any(org.joda.time.ReadWritablePeriod.class) , anyString() , anyInt() , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, periodParser0);
      Period period0 = Period.parse("", periodFormatter0);
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.millis(1242);
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period((-3371L), (PeriodType) null);
      boolean boolean0 = period0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }
}
