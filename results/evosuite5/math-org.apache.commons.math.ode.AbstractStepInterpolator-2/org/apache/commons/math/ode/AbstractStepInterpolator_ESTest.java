/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:41:57 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectOutputStream;
import org.apache.commons.math.ode.DormandPrince54StepInterpolator;
import org.apache.commons.math.ode.DormandPrince853StepInterpolator;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.EulerStepInterpolator;
import org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator;
import org.apache.commons.math.ode.HighamHall54StepInterpolator;
import org.apache.commons.math.ode.ThreeEighthesStepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractStepInterpolator_ESTest extends AbstractStepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EulerStepInterpolator eulerStepInterpolator0 = new EulerStepInterpolator();
      EulerStepInterpolator eulerStepInterpolator1 = new EulerStepInterpolator(eulerStepInterpolator0);
      MockFile mockFile0 = new MockFile(":#jg \"Gl=:'6)5Q/");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      double[] doubleArray0 = new double[2];
      eulerStepInterpolator1.currentState = doubleArray0;
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      eulerStepInterpolator1.writeBaseExternal(objectOutputStream0);
      assertEquals(Double.NaN, eulerStepInterpolator1.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, eulerStepInterpolator1.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, eulerStepInterpolator1.getPreviousTime(), 0.01);
      assertTrue(eulerStepInterpolator1.isForward());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      graggBulirschStoerStepInterpolator0.finalizeStep();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.copy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.GraggBulirschStoerStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator();
      double[] doubleArray0 = new double[9];
      dummyStepInterpolator0.currentState = doubleArray0;
      // Undeclared exception!
      try { 
        dummyStepInterpolator0.doCopy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.storeTime(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[][] doubleArray0 = new double[0][4];
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = null;
      try {
        graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator((double[]) null, (double[]) null, (double[]) null, (double[]) null, doubleArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      // Undeclared exception!
      try { 
        graggBulirschStoerStepInterpolator0.reinitialize((double[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ThreeEighthesStepInterpolator threeEighthesStepInterpolator0 = new ThreeEighthesStepInterpolator();
      // Undeclared exception!
      try { 
        threeEighthesStepInterpolator0.setInterpolatedTime(0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.ThreeEighthesStepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      double double0 = graggBulirschStoerStepInterpolator0.getCurrentTime();
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HighamHall54StepInterpolator highamHall54StepInterpolator0 = new HighamHall54StepInterpolator();
      double double0 = highamHall54StepInterpolator0.getPreviousTime();
      assertTrue(highamHall54StepInterpolator0.isForward());
      assertEquals(Double.NaN, highamHall54StepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertEquals(Double.NaN, highamHall54StepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GraggBulirschStoerStepInterpolator graggBulirschStoerStepInterpolator0 = new GraggBulirschStoerStepInterpolator();
      graggBulirschStoerStepInterpolator0.shift();
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getPreviousTime(), 0.01);
      assertTrue(graggBulirschStoerStepInterpolator0.isForward());
      assertEquals(Double.NaN, graggBulirschStoerStepInterpolator0.getInterpolatedTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince54StepInterpolator dormandPrince54StepInterpolator0 = new DormandPrince54StepInterpolator();
      boolean boolean0 = dormandPrince54StepInterpolator0.isForward();
      assertEquals(Double.NaN, dormandPrince54StepInterpolator0.getPreviousTime(), 0.01);
      assertTrue(boolean0);
      assertEquals(Double.NaN, dormandPrince54StepInterpolator0.getInterpolatedTime(), 0.01);
      assertEquals(Double.NaN, dormandPrince54StepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EulerStepInterpolator eulerStepInterpolator0 = new EulerStepInterpolator();
      double double0 = eulerStepInterpolator0.getInterpolatedTime();
      assertEquals(Double.NaN, eulerStepInterpolator0.getCurrentTime(), 0.01);
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(eulerStepInterpolator0.isForward());
      assertEquals(Double.NaN, eulerStepInterpolator0.getPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      // Undeclared exception!
      try { 
        dormandPrince853StepInterpolator0.getInterpolatedState();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractStepInterpolator", e);
      }
  }
}
