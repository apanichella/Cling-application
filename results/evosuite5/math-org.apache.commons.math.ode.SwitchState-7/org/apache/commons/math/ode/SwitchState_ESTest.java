/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 23:47:39 GMT 2019
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.math.ode.DummyStepInterpolator;
import org.apache.commons.math.ode.SwitchState;
import org.apache.commons.math.ode.SwitchingFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SwitchState_ESTest extends SwitchState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn(Double.NaN, 0.0, Double.NaN, 0.0, Double.NaN).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0, 0, 2);
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchState0.evaluateStep(dummyStepInterpolator0);
      assertFalse(switchState0.stop());
      
      switchState0.stepAccepted(4.0, doubleArray0);
      boolean boolean0 = switchState0.reset(0, doubleArray0);
      assertTrue(boolean0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn(Double.NaN, 0.0, Double.NaN, (-0.04432804463693693), Double.NaN).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0, 0.0, 1814);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[7];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchState0.stepAccepted((-497.1151), doubleArray1);
      dummyStepInterpolator0.storeTime(0.0);
      switchState0.evaluateStep(dummyStepInterpolator0);
      switchState0.stepAccepted((-39.17726167561544), doubleArray0);
      assertEquals((-497.1150997685152), switchState0.getEventTime(), 0.01);
      
      boolean boolean0 = switchState0.reset(0.0, doubleArray1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0, 0.0, 1814);
      double[] doubleArray0 = new double[7];
      boolean boolean0 = switchState0.reset(0.0, doubleArray0);
      assertFalse(boolean0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(switchState0.stop());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 0.0, Double.NaN, 0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0, 0, 2);
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      boolean boolean0 = switchState0.evaluateStep(dummyStepInterpolator0);
      boolean boolean1 = switchState0.reset(0, doubleArray0);
      assertFalse(boolean1 == boolean0);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(switchingFunction0).eventOccurred(anyDouble() , any(double[].class));
      doReturn(Double.NaN, 0.0, Double.NaN, (-0.04432804463693693), 1271.3317109783).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0, 0.0, 1814);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[7];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray1, false);
      switchState0.stepAccepted((-2258.4101507761893), doubleArray0);
      dummyStepInterpolator0.storeTime(1271.3317109783);
      switchState0.evaluateStep(dummyStepInterpolator0);
      switchState0.stepAccepted(204.03391204377, doubleArray1);
      boolean boolean0 = switchState0.stop();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0, 0, 2);
      boolean boolean0 = switchState0.stop();
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 0.0, Double.NaN, 0.0, Double.NaN).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0, 0.0, 1814);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[7];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchState0.stepAccepted(0, doubleArray0);
      switchState0.stepAccepted((-497.1151), doubleArray1);
      dummyStepInterpolator0.storeTime(0.0);
      switchState0.evaluateStep(dummyStepInterpolator0);
      boolean boolean0 = switchState0.evaluateStep(dummyStepInterpolator0);
      assertEquals((-497.1150997685152), dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN, 0.0, Double.NaN, 0.0, Double.NaN).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0, 1095.062, 1814);
      double[] doubleArray0 = new double[0];
      double[] doubleArray1 = new double[7];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, false);
      switchState0.stepAccepted(0, doubleArray0);
      switchState0.stepAccepted((-497.1151), doubleArray1);
      dummyStepInterpolator0.storeTime(0.0);
      switchState0.evaluateStep(dummyStepInterpolator0);
      boolean boolean0 = switchState0.evaluateStep(dummyStepInterpolator0);
      assertEquals(50.41590023148717, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn((-0.20136540080403034), 0.340825505230031, (-0.20136540080403034), 0.340825505230031, 0.340825505230031).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0.340825505230031, 1807, 1807);
      double[] doubleArray0 = new double[0];
      switchState0.stepAccepted(1807, doubleArray0);
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      boolean boolean0 = switchState0.evaluateStep(dummyStepInterpolator0);
      assertEquals(1807.0, dummyStepInterpolator0.getInterpolatedTime(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 92, 92, 92);
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
      
      double[] doubleArray0 = new double[0];
      DummyStepInterpolator dummyStepInterpolator0 = new DummyStepInterpolator(doubleArray0, true);
      switchState0.evaluateStep(dummyStepInterpolator0);
      assertFalse(switchState0.stop());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0.20136540080403034, 0.20136540080403034, (-140));
      double[] doubleArray0 = new double[0];
      switchState0.reinitializeBegin((-140), doubleArray0);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      doReturn(Double.NaN).when(switchingFunction0).g(anyDouble() , any(double[].class));
      SwitchState switchState0 = new SwitchState(switchingFunction0, Double.NaN, Double.NaN, (-127));
      double[] doubleArray0 = new double[0];
      switchState0.reinitializeBegin((-127), doubleArray0);
      assertFalse(switchState0.stop());
      assertEquals(Double.NaN, switchState0.getEventTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SwitchingFunction switchingFunction0 = mock(SwitchingFunction.class, new ViolatedAssumptionAnswer());
      SwitchState switchState0 = new SwitchState(switchingFunction0, 0.0, 0.0, (-1596));
      double double0 = switchState0.getEventTime();
      assertEquals(Double.NaN, double0, 0.01);
      assertFalse(switchState0.stop());
  }
}
