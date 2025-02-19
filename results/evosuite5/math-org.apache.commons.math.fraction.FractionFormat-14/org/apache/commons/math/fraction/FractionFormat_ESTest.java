/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:18:57 GMT 2019
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.AttributedCharacterIterator;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.FractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FractionFormat_ESTest extends FractionFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumberFormat numberFormat0 = FractionFormat.getDefaultNumberFormat();
      ChoiceFormat choiceFormat0 = new ChoiceFormat("1 / 1");
      FractionFormat fractionFormat0 = new FractionFormat(choiceFormat0, numberFormat0);
      try { 
        fractionFormat0.parse(" / ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \" / \"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getProperInstance();
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
      DecimalFormat decimalFormat0 = (DecimalFormat)FractionFormat.getDefaultNumberFormat();
      FractionFormat fractionFormat0 = new FractionFormat(decimalFormat0, decimalFormat0);
      fractionFormat0.setNumeratorFormat(decimalFormat0);
      assertTrue(decimalFormat0.isParseIntegerOnly());
      assertEquals("#,##0", decimalFormat0.toPattern());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getProperInstance();
      // Undeclared exception!
      try { 
        fractionFormat0.setDenominatorFormat((NumberFormat) null);
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
      FractionFormat fractionFormat0 = FractionFormat.getProperInstance();
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance();
      fractionFormat0.setDenominatorFormat(numberFormat0);
      assertEquals(0, numberFormat0.getMinimumFractionDigits());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("");
      FractionFormat fractionFormat0 = new FractionFormat(choiceFormat0, choiceFormat0);
      ParsePosition parsePosition0 = new ParsePosition(1179);
      fractionFormat0.parse("", parsePosition0);
      assertEquals(1178, parsePosition0.getErrorIndex());
      assertEquals(1178, parsePosition0.getIndex());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance();
      Float float0 = new Float((-1560.0813F));
      AttributedCharacterIterator attributedCharacterIterator0 = fractionFormat0.formatToCharacterIterator(float0);
      assertEquals(14, attributedCharacterIterator0.getRunLimit());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance();
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      // Undeclared exception!
      try { 
        fractionFormat0.formatToCharacterIterator(numberFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given object as a fraction
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance();
      try { 
        fractionFormat0.parseObject("Caused by: ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FractionFormat fractionFormat0 = new FractionFormat();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getProperInstance();
      ParsePosition parsePosition0 = new ParsePosition(7);
      fractionFormat0.parse(":o*<G#i1HJ", parsePosition0);
      assertEquals("java.text.ParsePosition[index=7,errorIndex=8]", parsePosition0.toString());
      assertEquals(8, parsePosition0.getErrorIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      FractionFormat fractionFormat0 = new FractionFormat(decimalFormat0, decimalFormat0);
      Fraction fraction0 = fractionFormat0.parse("1 / 1");
      assertEquals(1L, fraction0.longValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      String string0 = FractionFormat.formatFraction(fraction0);
      assertEquals("1 / 1", string0);
  }
}
