/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 13:52:09 GMT 2019
 */

package org.mockito.asm;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Attribute;
import org.mockito.asm.ClassReader;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.FieldVisitor;
import org.mockito.asm.Item;
import org.mockito.asm.Type;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ClassWriter_ESTest extends ClassWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      Item item0 = classWriter0.newFloat(0.0F);
      assertNotNull(item0);
      
      classWriter0.index = 1527;
      Item item1 = classWriter0.newDouble(1);
      assertNotNull(item1);
      assertNotSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      classWriter0.index = 252;
      classWriter0.visitInnerClass("", "", "", 252);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-361));
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.Edge", "org.mockito.asm.ClassWriter");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(66);
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.ClassWriter", "org.mockito.asm.ClassWriter");
      assertEquals("org.mockito.asm.ClassWriter", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777216);
      String string0 = classWriter0.getCommonSuperClass("org.mockito.asm.MethodWriter", "java/lang/Object");
      assertEquals("java/lang/Object", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(124);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(124, 124);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-268435456));
      Item[] itemArray0 = new Item[1];
      classWriter0.typeTable = itemArray0;
      int int0 = classWriter0.addType("");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      int int0 = classWriter0.addUninitializedType("HO|OkJXUXXL", 1);
      assertEquals(1, int0);
      
      int int1 = classWriter0.addUninitializedType("HO|OkJXUXXL", 1);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(19);
      int int0 = classWriter0.addType("XztG&=ry#");
      assertEquals(1, int0);
      
      int int1 = classWriter0.addType("XztG&=ry#");
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      classWriter0.newField("uDTV", "", "org.mockito.asm.ClassWriter");
      Item item0 = classWriter0.newMethodItem("org.mockito.asm.ClassWriter", "", "org.mockito.asm.ClassWriter", false);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      classWriter0.newConst("KS\" ");
      Item item0 = classWriter0.newConstItem("KS\" ");
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-365));
      Item item0 = classWriter0.newDouble((-365));
      Item item1 = classWriter0.newDouble((-365));
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      Item item0 = classWriter0.newLong(1L);
      Item item1 = classWriter0.newLong(1);
      assertSame(item1, item0);
      assertNotNull(item1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(0);
      Item item0 = classWriter0.newFloat((-1.0F));
      Item item1 = classWriter0.newFloat((-1.0F));
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3670);
      Item item0 = classWriter0.newInteger(3670);
      Item item1 = classWriter0.newInteger(3670);
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3246);
      Item item0 = classWriter0.newMethodItem("", "", "", true);
      Item item1 = classWriter0.newMethodItem("", "", "", true);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3259);
      Item item0 = classWriter0.newFieldItem("KS\" ", "KS\" ", "KS\" ");
      Item item1 = classWriter0.newFieldItem("KS\" ", "KS\" ", "KS\" ");
      assertNotNull(item1);
      assertSame(item1, item0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-906));
      Type type0 = Type.getObjectType("|");
      FieldVisitor fieldVisitor0 = classWriter0.visitField((-906), "", "@669I", "|", type0);
      assertNotNull(fieldVisitor0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(12);
      Type type0 = Type.SHORT_TYPE;
      Item item0 = classWriter0.newConstItem(type0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3246);
      // Undeclared exception!
      try { 
        classWriter0.newConstItem(classWriter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value org.mockito.asm.ClassWriter@5
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-328));
      Double double0 = new Double((-328));
      Item item0 = classWriter0.newConstItem(double0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(198);
      Long long0 = new Long(198);
      Item item0 = classWriter0.newConstItem(long0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(11);
      Float float0 = new Float((double) 11);
      Item item0 = classWriter0.newConstItem(float0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      Boolean boolean0 = Boolean.FALSE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      Boolean boolean0 = Boolean.TRUE;
      Item item0 = classWriter0.newConstItem(boolean0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(46);
      Short short0 = new Short((short)628);
      Item item0 = classWriter0.newConstItem(short0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(4);
      Character character0 = new Character('x');
      Item item0 = classWriter0.newConstItem(character0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3248);
      Byte byte0 = new Byte((byte)46);
      Item item0 = classWriter0.newConstItem(byte0);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(13);
      Item item0 = classWriter0.newConstItem(classWriter0.COMPUTE_FRAMES);
      assertNotNull(item0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(5);
      classWriter0.invalidFrames = true;
      // Undeclared exception!
      try { 
        classWriter0.toByteArray();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      Attribute attribute0 = new Attribute("");
      byte[] byteArray0 = new byte[6];
      attribute0.value = byteArray0;
      classWriter0.visitAttribute(attribute0);
      byte[] byteArray1 = classWriter0.toByteArray();
      assertEquals(39, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-62));
      classWriter0.visitAnnotation("", true);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-328));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      classWriter0.visit((-2247), (-2247), "", "", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(73, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(32);
      classWriter0.visitSource("#*7{z2", "@+}bo");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(89, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-328));
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      classWriter0.visit(1, (-2247), "", "", "", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(91, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-328));
      String[] stringArray0 = new String[4];
      stringArray0[0] = "SourceFile";
      stringArray0[1] = "SourceFile";
      stringArray0[2] = "";
      stringArray0[3] = "SourceFile";
      classWriter0.visitMethod((-328), "jinEIK_zOP{(?n\"}(^", "SourceFile", "jinEIK_zOP{(?n\"}(^", stringArray0);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(161, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-882));
      classWriter0.visitInnerClass("java/lang/Object", "java/lang/Object", (String) null, (-882));
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(77, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777211);
      classWriter0.visitInnerClass((String) null, (String) null, "IERQSN&", 16777211);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3670);
      classWriter0.visitInnerClass("a[+q", "org.mockito.asm.ClassWriter", "a[+q", 3670);
      classWriter0.visitInnerClass("U7(T7<", (String) null, "", (-1032));
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(68);
      classWriter0.visitAnnotation("float", false);
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(74, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-906));
      classWriter0.visitOuterClass("", "", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-2954));
      classWriter0.visitOuterClass("long", "long", "long");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(67, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(16777216);
      classWriter0.visitOuterClass("char", (String) null, (String) null);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      classWriter0.visitSource("", (String) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(252);
      classWriter0.visitSource((String) null, ".(cm|RO");
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(124);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      classWriter0.visit(124, 124, "", "", "", stringArray0);
      // Undeclared exception!
      try { 
        classWriter0.getMergedType(124, 124);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.ClassWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-906));
      String[] stringArray0 = new String[0];
      classWriter0.visit(76, 76, "}d?zmMvd(Q:Ut", "}d?zmMvd(Q:Ut", "-QJQ{'qo_5h(_", stringArray0);
      assertEquals(1, ClassWriter.COMPUTE_MAXS);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3341);
      classWriter0.visit(3938, 3341, ")V", "RuntimeVisibleAnnotations", "xc6K9D0%lv8G3vIYq_", (String[]) null);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter((-36));
      String[] stringArray0 = new String[16];
      // Undeclared exception!
      try { 
        classWriter0.visit((-36), (-36), ";b/\"/M6w2Yif}JDv]P", (String) null, (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(113);
      classWriter0.visitField(113, "", "TB", "TB", "TB");
      byte[] byteArray0 = classWriter0.toByteArray();
      assertEquals(87, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3);
      int int0 = classWriter0.newMethod("java/lang/Object", "java/lang/Object", "java/lang/Object", true);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassReader classReader0 = new ClassReader("org.mockito.asm.ClassWriter");
      ClassWriter classWriter0 = new ClassWriter(classReader0, 1337);
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(3064);
      classWriter0.visitEnd();
      assertEquals(2, ClassWriter.COMPUTE_FRAMES);
  }
}
