/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 23 13:03:34 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodAdapter;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;
import org.mockito.cglib.core.Signature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CodeEmitter_ESTest extends CodeEmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Signature signature0 = new Signature(";)P12N)5vg&y", ";)P12N)5vg&y");
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      ClassWriter classWriter0 = new ClassWriter(4);
      String[] stringArray0 = new String[3];
      stringArray0[0] = "58GAZ_5,(3Xz]";
      stringArray0[1] = "hfN1";
      stringArray0[2] = "hfN1";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(10, "", "e|", "float", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      Type[] typeArray0 = new Type[1];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodAdapter0, (-2144899119), signature0, typeArray0);
      codeEmitter0.box(type0);
      codeEmitter0.newarray(type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature(";)P12N)5vXg&y", ";)P12N)5vXg&y");
      Type[] typeArray0 = new Type[8];
      Type type0 = Type.CHAR_TYPE;
      ClassWriter classWriter0 = new ClassWriter(1073741824);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Opcodes";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(7, " |H}Hm~[L:e=", "hfN1", "org.mockito.asm.Opcodes", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodAdapter0, 156, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.load_args();
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature(";)P12N)5vXg&y", ";)P12N)5vXg&y");
      Type[] typeArray0 = new Type[8];
      Type type0 = Type.BOOLEAN_TYPE;
      Type type1 = Type.CHAR_TYPE;
      ClassWriter classWriter0 = new ClassWriter(1073741824);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Opcodes";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(7, " |H}Hm~[L:e=", "hfN1", "org.mockito.asm.Opcodes", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodAdapter0, 156, signature0, typeArray0);
      codeEmitter0.box(type0);
      codeEmitter0.newarray(type1);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature(";)P12N)5vg&y", ";)P12N)5vg&y");
      Type[] typeArray0 = new Type[8];
      Type type0 = Type.BOOLEAN_TYPE;
      ClassWriter classWriter0 = new ClassWriter(1073741824);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Opcodes";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(7, " |H}Hm~[L:e=", "hfN1", "org.mockito.asm.Opcodes", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodAdapter0, 156, signature0, typeArray0);
      codeEmitter0.box(type0);
      Type type1 = Type.FLOAT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Signature signature0 = new Signature(";)P12N)5vg&", ";)P12N)5vg&");
      Type[] typeArray0 = new Type[8];
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 4, signature0, typeArray0);
      // Undeclared exception!
      try { 
        codeEmitter0.push((float) 4);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("Y+pc<Zk3wNjt3fp0k<", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 1, signature0, typeArray0);
      // Undeclared exception!
      try { 
        codeEmitter0.push((double) 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature(";)P12N)5vg&y", ";)P12N)5vg&y");
      Type[] typeArray0 = new Type[8];
      Type type0 = Type.BOOLEAN_TYPE;
      ClassWriter classWriter0 = new ClassWriter(1073741824);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.mockito.asm.Opcodes";
      MethodVisitor methodVisitor0 = classWriter0.visitMethod(7, " |H}Hm~[L:e=", "hfN1", "org.mockito.asm.Opcodes", stringArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodAdapter0, 156, signature0, typeArray0);
      codeEmitter0.box(type0);
      Label label0 = codeEmitter0.make_label();
      codeEmitter0.if_icmp((-1744), label0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Signature signature0 = new Signature(";)P12N)5vg&", ";)P12N)5vg&");
      Type[] typeArray0 = new Type[8];
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 4, signature0, typeArray0);
      // Undeclared exception!
      try { 
        codeEmitter0.push((float) 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }
}
