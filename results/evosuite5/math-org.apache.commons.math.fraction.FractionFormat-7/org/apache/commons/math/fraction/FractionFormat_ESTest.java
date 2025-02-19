/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:30:46 GMT 2019
 */

package org.apache.commons.math.fraction;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
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
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      try { 
        properFractionFormat0.parse("6/ ");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"6/ \"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      // Undeclared exception!
      try { 
        properFractionFormat0.setNumeratorFormat((NumberFormat) null);
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
      FractionFormat fractionFormat0 = FractionFormat.getProperInstance();
      DecimalFormat decimalFormat0 = new DecimalFormat();
      fractionFormat0.setNumeratorFormat(decimalFormat0);
      assertEquals("-", decimalFormat0.getNegativePrefix());
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
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      FractionFormat fractionFormat0 = new FractionFormat(numberFormat0);
      fractionFormat0.setDenominatorFormat(numberFormat0);
      assertEquals(1, numberFormat0.getMinimumIntegerDigits());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FractionFormat fractionFormat0 = new FractionFormat();
      try { 
        fractionFormat0.parse("7/{F+");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"7/{F+\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FractionFormat fractionFormat0 = new FractionFormat();
      try { 
        fractionFormat0.parse("7*{F+");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"7*{F+\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FractionFormat fractionFormat0 = new FractionFormat();
      Fraction fraction0 = fractionFormat0.parse("9");
      assertEquals((byte)9, fraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ProperFractionFormat properFractionFormat0 = new ProperFractionFormat();
      // Undeclared exception!
      try { 
        properFractionFormat0.format((Object) properFractionFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot format given object as a fraction
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FractionFormat fractionFormat0 = new FractionFormat();
      Float float0 = new Float(1138.3397F);
      String string0 = fractionFormat0.format((Object) float0);
      assertEquals("237,913 / 209", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getProperInstance();
      Fraction fraction0 = fractionFormat0.parse("1 / 1");
      assertEquals((byte)1, fraction0.byteValue());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FractionFormat fractionFormat0 = new FractionFormat();
      try { 
        fractionFormat0.parseObject("\"");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Format.parseObject(String) failed
         //
         verifyException("java.text.Format", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FractionFormat fractionFormat0 = FractionFormat.getImproperInstance();
      try { 
        fractionFormat0.parse("q");
        fail("Expecting exception: ParseException");
      
      } catch(ParseException e) {
         //
         // Unparseable fraction number: \"q\"
         //
         verifyException("org.apache.commons.math.fraction.FractionFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Fraction fraction0 = Fraction.ZERO;
      String string0 = FractionFormat.formatFraction(fraction0);
      assertEquals("0 / 1", string0);
  }
}
