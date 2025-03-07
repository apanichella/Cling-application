/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 15:48:12 GMT 2019
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import org.apache.commons.math.fraction.Fraction;
import org.apache.commons.math.fraction.ProperFractionFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ProperFractionFormat_ESTest extends ProperFractionFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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
  public void test1()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("/LV{");
      DecimalFormat decimalFormat0 = new DecimalFormat();
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0, choiceFormat0, decimalFormat0);
      try { 
        properFractionFormat0.parseObject("/LV{");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("LV{");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0, choiceFormat0, choiceFormat0);
      try { 
        properFractionFormat0.parseObject("LV{");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("0q4Gb");
      DecimalFormat decimalFormat0 = new DecimalFormat("0q4Gb");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(decimalFormat0, choiceFormat0, choiceFormat0);
      Fraction fraction0 = (Fraction)properFractionFormat0.parseObject("0q4Gb");
      assertEquals(0, fraction0.getNumerator());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parse("4vGf");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"4vGf\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parse("vG");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"vG\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("H");
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(choiceFormat0, choiceFormat0, choiceFormat0);
      Fraction fraction0 = (Fraction)properFractionFormat0.parseObject("H");
      assertEquals((short)0, fraction0.shortValue());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = Fraction.ONE;
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition((-663));
      properFractionFormat0.format(fraction0, stringBuffer0, fieldPosition0);
      assertEquals(7, stringBuffer0.length());
      assertEquals("1 0 / 1", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat("/LV_G%i{");
      DecimalFormat decimalFormat0 = new DecimalFormat();
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat(decimalFormat0, choiceFormat0, choiceFormat0);
      // Undeclared exception!
      try { 
        properFractionFormat0.parseObject("4/`y3AV=/");
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // The denominator must not be zero
         //
         verifyException("org.apache.commons.math.fraction.Fraction", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      Fraction fraction0 = Fraction.ZERO;
      StringBuffer stringBuffer0 = new StringBuffer();
      FieldPosition fieldPosition0 = new FieldPosition((-663));
      properFractionFormat0.format(fraction0, stringBuffer0, fieldPosition0);
      assertEquals(5, stringBuffer0.length());
      assertEquals("0 / 1", stringBuffer0.toString());
  }
}
