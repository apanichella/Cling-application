/*

 * Tue Mar 03 14:56:18 GMT 2020
 */

package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import org.apache.commons.math.ode.DormandPrince853StepInterpolator;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.StepInterpolator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class DormandPrince853StepInterpolator_ESTest extends DormandPrince853StepInterpolator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[2];
      double[][] doubleArray1 = new double[0][1];
      dormandPrince853StepInterpolator0.reinitialize(firstOrderDifferentialEquations0, doubleArray0, doubleArray1, true);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream(byteArrayOutputStream0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(printStream0);
      // Undeclared exception!
      try { 
        dormandPrince853StepInterpolator0.writeBaseExternal(objectOutputStream0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.DormandPrince853StepInterpolator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn(0.0, 0.0, 0.0, 0.0).when(objectInput0).readDouble();
      doReturn(0, 0, 0).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      ObjectOutput objectOutput0 = mock(ObjectOutput.class, new ViolatedAssumptionAnswer());
      dormandPrince853StepInterpolator0.writeExternal(objectOutput0);
      assertEquals(0.0, dormandPrince853StepInterpolator0.getPreviousTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn((-239.9370966), (-239.9370966), 2487.7591, (-239.9370966), 0.0).when(objectInput0).readDouble();
      doReturn(55, 55, 55).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      ObjectInput objectInput1 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput1).readBoolean();
      doReturn(0.0, 2487.7591, 0.0, 2487.7591, 0.0).when(objectInput1).readDouble();
      doReturn(7, 55, 7).when(objectInput1).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput1);
      assertEquals(0.0, dormandPrince853StepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      StepInterpolator stepInterpolator0 = dormandPrince853StepInterpolator0.doCopy();
      assertTrue(stepInterpolator0.isForward());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      ObjectInput objectInput0 = mock(ObjectInput.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(objectInput0).readBoolean();
      doReturn((-239.9370966), (-239.9370966), 2487.7591, (-239.9370966), 0.0).when(objectInput0).readDouble();
      doReturn(55, 55, 55).when(objectInput0).readInt();
      dormandPrince853StepInterpolator0.readExternal(objectInput0);
      dormandPrince853StepInterpolator0.doCopy();
      assertEquals(0.0, dormandPrince853StepInterpolator0.getCurrentTime(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DormandPrince853StepInterpolator dormandPrince853StepInterpolator0 = new DormandPrince853StepInterpolator();
      FirstOrderDifferentialEquations firstOrderDifferentialEquations0 = mock(FirstOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      double[] doubleArray0 = new double[2];
      double[][] doubleArray1 = new double[0][1];
      dormandPrince853StepInterpolator0.reinitialize(firstOrderDifferentialEquations0, doubleArray0, doubleArray1, true);
      // Undeclared exception!
      try { 
        dormandPrince853StepInterpolator0.computeInterpolatedState(0.0, 0.0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.apache.commons.math.ode.DormandPrince853StepInterpolator", e);
      }
  }
}
