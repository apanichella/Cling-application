/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 16:13:27 GMT 2019
 */

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.TimeZone;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DurationFormatUtils_ESTest extends DurationFormatUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("H");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("S");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("M", (-325));
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token("M", (-325));
      durationFormatUtils_Token1.increment();
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012");
      DurationFormatUtils.Token durationFormatUtils_Token1 = new DurationFormatUtils.Token(durationFormatUtils_Token0);
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012");
      boolean boolean0 = durationFormatUtils_Token0.equals(durationFormatUtils_Token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("d");
      boolean boolean0 = durationFormatUtils_Token0.equals("d");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod((long) (-334), (long) (-334), "HCvc^!{DSrsvv6I%");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DurationFormatUtils.Token[] durationFormatUtils_TokenArray0 = new DurationFormatUtils.Token[1];
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("T.P}Nobg'M^58 SPc");
      durationFormatUtils_TokenArray0[0] = durationFormatUtils_Token0;
      String string0 = DurationFormatUtils.format(durationFormatUtils_TokenArray0, 0, 0, 0, 0, 0, 0, 0, true);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(3599952L, 115L, " 1 days");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(0L, (-1003L), "dljw4Mx");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriod(0L, 0L, "CeNu*A~dr[]XE7qMo");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = DurationFormatUtils.formatPeriodISO((-2332L), 825L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords(0L, true, true);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDuration(558L, "u");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DurationFormatUtils durationFormatUtils0 = new DurationFormatUtils();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationHMS(971L);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      DurationFormatUtils.formatPeriod(3599952L, (-1944L), "s");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationISO((-7));
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DurationFormatUtils.Token durationFormatUtils_Token0 = new DurationFormatUtils.Token("d");
      String string0 = durationFormatUtils_Token0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeZone timeZone0 = TimeZone.getTimeZone("0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012");
      String string0 = DurationFormatUtils.formatPeriod((-42L), 3600000L, "0java.lang.StringBuffer@00000000090java.lang.StringBuffer@00000000100java.lang.StringBuffer@00000000110java.lang.StringBuffer@0000000012", false, timeZone0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String string0 = DurationFormatUtils.formatDurationWords((-42L), false, false);
      assertNotNull(string0);
  }
}
