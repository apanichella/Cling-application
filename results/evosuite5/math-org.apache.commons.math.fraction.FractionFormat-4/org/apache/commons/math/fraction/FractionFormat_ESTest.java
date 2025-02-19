/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:28:06 GMT 2019
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.AttributedCharacterIterator;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.FractionFormat;
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FractionFormat_ESTest extends FractionFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Locale locale0 = Locale.UK;
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance(locale0);
      try { 
        fractionFormat0.parse(" ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \" \"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance(locale0);
      // Undeclared exception!
      try { 
        fractionFormat0.setNumeratorFormat((NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // numerator format can not be null.
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FractionFormat fractionFormat0 = new FractionFormat();
      NumberFormat numberFormat0 = FractionFormat.getDefaultNumberFormat();
      fractionFormat0.setNumeratorFormat(numberFormat0);
      assertTrue(numberFormat0.isParseIntegerOnly());
      assertEquals(0, numberFormat0.getMaximumFractionDigits());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      // Undeclared exception!
      try { 
        properFractionFormat0.setDenominatorFormat((NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // denominator format can not be null.
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FractionFormat fractionFormat0 = new FractionFormat();
      try { 
        fractionFormat0.parse("4 \"B%Mn");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"4 \"B%Mn\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = properFractionFormat0.parse("1");
      assertEquals(1.0, fraction0.doubleValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.CANADA;
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance(locale0);
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale0);
      fractionFormat0.setDenominatorFormat(numberFormat0);
      try { 
        fractionFormat0.parse("0 / 1");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"0 / 1\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getProperInstance();
      // Undeclared exception!
      try { 
        fractionFormat0.parseObject("2A8dsM=@/RG]", (ParsePosition) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      String string0 = FractionFormat.formatFraction(fraction0);
      assertEquals("1 / 1", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FractionFormat fractionFormat0 = new FractionFormat();
      Short short0 = new Short((short) (-42));
      AttributedCharacterIterator attributedCharacterIterator0 = fractionFormat0.formatToCharacterIterator(short0);
      assertEquals(7, attributedCharacterIterator0.getEndIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance(locale0);
      Fraction fraction0 = fractionFormat0.parse("1 / 1");
      assertEquals(1.0F, fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        FractionFormat.formatFraction((Fraction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given object as a fraction
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }
}
