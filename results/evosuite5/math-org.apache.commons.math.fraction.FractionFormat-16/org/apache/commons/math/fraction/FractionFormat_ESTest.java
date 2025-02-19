/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:20:18 GMT 2019
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
      ParsePosition parsePosition0 = new ParsePosition(0);
      Locale locale0 = new Locale(" / ", " / ", " / ");
      FractionFormat fractionFormat0 = FractionFormat.getProperInstance(locale0);
      ChoiceFormat choiceFormat0 = new ChoiceFormat(" / ");
      fractionFormat0.setNumeratorFormat(choiceFormat0);
      fractionFormat0.parse(" / ", parsePosition0);
      assertEquals(1, parsePosition0.getErrorIndex());
      assertEquals("java.text.ParsePosition[index=0,errorIndex=1]", parsePosition0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance();
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
  public void test02()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = properFractionFormat0.parse("6");
      assertEquals(6.0F, fraction0.floatValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parse("/");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"/\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat("0 / 1");
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance();
      fractionFormat0.setDenominatorFormat(decimalFormat0);
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
  public void test05()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getProperInstance();
      try { 
        fractionFormat0.parseObject("3hA");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FractionFormat fractionFormat0 = new FractionFormat();
      Long long0 = new Long(190L);
      AttributedCharacterIterator attributedCharacterIterator0 = fractionFormat0.formatToCharacterIterator(long0);
      assertEquals(7, attributedCharacterIterator0.getRunLimit());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      String string0 = FractionFormat.formatFraction(fraction0);
      assertEquals("0 / 1", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumberFormat numberFormat0 = FractionFormat.getDefaultNumberFormat();
      FractionFormat fractionFormat0 = new FractionFormat(numberFormat0);
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
  public void test09()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance();
      Fraction fraction0 = fractionFormat0.parse("0 / 1");
      assertNotNull(fraction0);
      assertEquals(0, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
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
