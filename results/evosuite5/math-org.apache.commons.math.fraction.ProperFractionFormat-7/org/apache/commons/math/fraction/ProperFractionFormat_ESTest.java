/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:07:40 GMT 2019
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
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ProperFractionFormat_ESTest extends ProperFractionFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat();
      ProperFractionFormat properFractionFormat0 = null;
      try {
        properFractionFormat0 = new ProperFractionFormat((NumberFormat) null, decimalFormat0, (NumberFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // whole format can not be null.
         //
         verifyException("org.apache.commons.math.fraction.ProperFractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat(" /g ");
      DecimalFormat decimalFormat0 = new DecimalFormat();
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0, choiceFormat0, decimalFormat0);
      try { 
        properFractionFormat0.parse(" /g ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \" /g \"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("!,z4WLm(.");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0, choiceFormat0, choiceFormat0);
      try { 
        properFractionFormat0.parse("!,z4WLm(.");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"!,z4WLm(.\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("0 / 1");
      DecimalFormat decimalFormat0 = new DecimalFormat("0 / 1");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(decimalFormat0, choiceFormat0, choiceFormat0);
      Fraction fraction0 = properFractionFormat0.parse("0 / 1");
      assertEquals(0L, fraction0.longValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("0 / 1");
      DecimalFormat decimalFormat0 = new DecimalFormat();
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0, decimalFormat0, choiceFormat0);
      try { 
        properFractionFormat0.parse("-3OC6.@8$NCD.[");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"-3OC6.@8$NCD.[\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parse("185{z]t9t/w:;rz");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"185{z]t9t/w:;rz\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parse("!,z4WLm(.");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"!,z4WLm(.\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Fraction fraction0 = Fraction.ONE;
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      AttributedCharacterIterator attributedCharacterIterator0 = properFractionFormat0.formatToCharacterIterator(fraction0);
      assertEquals(7, attributedCharacterIterator0.getRunLimit());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      AttributedCharacterIterator attributedCharacterIterator0 = properFractionFormat0.formatToCharacterIterator(fraction0);
      assertEquals(5, attributedCharacterIterator0.getRunLimit());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("0 / 1");
      DecimalFormat decimalFormat0 = new DecimalFormat();
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(decimalFormat0, choiceFormat0, choiceFormat0);
      // Undeclared exception!
      try { 
        properFractionFormat0.parse("0 / 1");
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.math.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      ParsePosition parsePosition0 = new ParsePosition(0);
      Fraction fraction0 = properFractionFormat0.parse("22", parsePosition0);
      assertEquals(22L, fraction0.longValue());
  }
}
