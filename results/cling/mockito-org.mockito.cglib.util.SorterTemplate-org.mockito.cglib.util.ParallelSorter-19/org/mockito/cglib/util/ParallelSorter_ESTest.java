/*

 * Tue Mar 03 15:02:26 CET 2020
 */

package org.mockito.cglib.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ParallelSorter_ESTest extends ParallelSorter_ESTest_scaffolding {
  @Test
  public void notGeneratedAnyTest() {
    // EvoSuite did not generate any tests
  }
}
