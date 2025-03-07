/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:08:46 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;
import org.mockito.cglib.core.ProcessSwitchCallback;
import org.mockito.cglib.core.Signature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CodeEmitter_ESTest extends CodeEmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[20];
      classEmitter0.visit((-2064), 1, "", "zH5m&YHn-y=hw", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.VOID_TYPE;
      codeEmitter0.push(2.0F);
      codeEmitter0.newarray(type0);
      assertEquals(0, type0.getSort());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[19];
      classEmitter0.visit(1414, 1, "p", "?2uE", "?2uE", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      codeEmitter0.newarray(type0);
      codeEmitter0.push((float) 10);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      typeArray0[8] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 23, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((float) 7);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      typeArray0[8] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 23, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((double) 4);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(2, 21, "", "", "S", (String[]) null);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      codeEmitter0.newarray(type0);
      codeEmitter0.push((double) 8);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[20];
      classEmitter0.visit((-2064), 1, "", "zH5m&YHn-y=hw", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.VOID_TYPE;
      codeEmitter0.newarray(type0);
      codeEmitter0.push((double) 130);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      typeArray0[8] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 23, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((double) 4);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.push(true);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2056));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[31];
      classEmitter0.visit(5401, 0, "I", "RuntimeInvisibleParameVerA/notations", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.push((double) 5401);
      codeEmitter0.push(true);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 10);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.push((double) 10);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[20];
      classEmitter0.visit((-2064), 1260, "", "", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      int[] intArray0 = new int[6];
      intArray0[0] = 130;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter0.process_switch(intArray0, processSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[19];
      classEmitter0.visit(1414, 1, "p", "?2uE", "?2uE", stringArray0);
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      codeEmitter0.newarray(type0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      typeArray0[8] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 23, signature0, typeArray0);
      codeEmitter0.load_arg(5);
      codeEmitter0.newarray(type0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[19];
      classEmitter0.visit(1414, 1, "p", "?2uE", "?2uE", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      codeEmitter0.newarray(type0);
      codeEmitter0.new_instance_this();
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[20];
      classEmitter0.visit((-2064), 1, "", "zH5m&YHn-y=hw", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.VOID_TYPE;
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[20];
      classEmitter0.visit((-2064), 1260, "", "zH5m&YHn-y=hw", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type0);
      codeEmitter0.push((double) 9);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[19];
      classEmitter0.visit(1414, 1, "p", "?2uE", "?2uE", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.FLOAT_TYPE;
      codeEmitter0.box(type0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2056));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[31];
      classEmitter0.visit(5401, 0, "I", "RuntimeInvisibleParameVerA/notations", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      // Undeclared exception!
      try { 
        codeEmitter0.load_args(6, 136);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[4];
      classEmitter0.visit(1414, 1, "p", "?2uE", "rc ", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.load_args();
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2056));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[31];
      classEmitter0.visit(5401, 0, "I", "RuntimeInvisibleParameVerA/notations", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.BYTE_TYPE;
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      // Undeclared exception!
      try { 
        codeEmitter0.invoke_constructor(type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      typeArray0[8] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 23, signature0, typeArray0);
      codeEmitter0.load_arg(5);
      codeEmitter0.newarray(type0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      typeArray0[8] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 23, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      typeArray0[8] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 23, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      codeEmitter0.push(false);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[20];
      classEmitter0.visit((-2064), 1260, "", "", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0, true);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[20];
      classEmitter0.visit((-2064), 1, "", "zH5m&YHn-y=hw", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Label label0 = new Label();
      codeEmitter0.if_icmp(199, label0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[4];
      classEmitter0.visit(1414, 1, "p", "?2uE", "rc ", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.push(true);
      codeEmitter0.push((-1252.7F));
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2064));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[20];
      classEmitter0.visit((-2064), 1, "", "zH5m&YHn-y=hw", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.push(2.0F);
      codeEmitter0.create_arg_array();
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      codeEmitter0.push((float) 8);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature(";", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.push((float) 8);
      assertEquals(104, CodeEmitter.MUL);
  }
}
