/*

 * Tue Mar 03 18:39:59 GMT 2020
 */

package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ProxyObjectType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ProxyObjectType_ESTest extends ProxyObjectType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ErrorReporter errorReporter0 = mock(ErrorReporter.class, new ViolatedAssumptionAnswer());
      JSTypeRegistry jSTypeRegistry0 = new JSTypeRegistry(errorReporter0, false);
      JSType jSType0 = mock(JSType.class, new ViolatedAssumptionAnswer());
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, jSType0);
      boolean boolean0 = proxyObjectType0.isGlobalThisType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      doReturn((JSType) null).when(jSTypeRegistry0).getNativeType(any(com.google.javascript.rhino.jstype.JSTypeNative.class));
      JSType jSType0 = mock(JSType.class, new ViolatedAssumptionAnswer());
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, jSType0);
      boolean boolean0 = proxyObjectType0.isGlobalThisType();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JSTypeRegistry jSTypeRegistry0 = mock(JSTypeRegistry.class, new ViolatedAssumptionAnswer());
      JSType jSType0 = mock(JSType.class, new ViolatedAssumptionAnswer());
      ProxyObjectType proxyObjectType0 = new ProxyObjectType(jSTypeRegistry0, jSType0);
      boolean boolean0 = proxyObjectType0.hasDisplayName();
      assertFalse(boolean0);
  }
}
