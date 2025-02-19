/*
 * This file was automatically generated by EvoSuite
 * Thu Jul 25 03:03:55 GMT 2019
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.Weeks;
import org.joda.time.Years;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodParser;
import org.joda.time.format.PeriodPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractPeriod_ESTest extends AbstractPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = new Period((-1946L));
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      doReturn((-1843)).when(periodPrinter0).calculatePrintedLength(any(org.joda.time.ReadablePeriod.class) , any(java.util.Locale.class));
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, (PeriodParser) null);
      // Undeclared exception!
      try { 
        period0.toString(periodFormatter0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.minutes((-461));
      period0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Years years0 = Years.ZERO;
      MutablePeriod mutablePeriod0 = new MutablePeriod(years0);
      Weeks weeks0 = Weeks.standardWeeksIn(mutablePeriod0);
      boolean boolean0 = mutablePeriod0.equals(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1951L, 1951L);
      MutablePeriod mutablePeriod1 = new MutablePeriod(mutablePeriod0);
      assertTrue(mutablePeriod1.equals((Object)mutablePeriod0));
      
      mutablePeriod1.setMonths(1);
      boolean boolean0 = mutablePeriod0.equals(mutablePeriod1);
      assertFalse(mutablePeriod1.equals((Object)mutablePeriod0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      Weeks weeks0 = Weeks.MAX_VALUE;
      boolean boolean0 = mutablePeriod0.equals(weeks0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1951L, 1951L);
      MutablePeriod mutablePeriod1 = new MutablePeriod(mutablePeriod0);
      boolean boolean0 = mutablePeriod0.equals(mutablePeriod1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      PeriodPrinter periodPrinter0 = mock(PeriodPrinter.class, new ViolatedAssumptionAnswer());
      PeriodFormatter periodFormatter0 = new PeriodFormatter(periodPrinter0, (PeriodParser) null);
      boolean boolean0 = mutablePeriod0.equals(periodFormatter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1951L, 1951L);
      int int0 = mutablePeriod0.get((DurationFieldType) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Period period0 = new Period((-1946L));
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1951L, 1951L);
      Years years0 = Years.MIN_VALUE;
      DurationFieldType durationFieldType0 = years0.getFieldType();
      boolean boolean0 = mutablePeriod0.isSupported(durationFieldType0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1951L, 1951L);
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod(1951L, 1951L);
      MutablePeriod mutablePeriod1 = mutablePeriod0.toMutablePeriod();
      assertNotSame(mutablePeriod1, mutablePeriod0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod();
      String string0 = mutablePeriod0.toString((PeriodFormatter) null);
      assertEquals("PT0S", string0);
  }
}
