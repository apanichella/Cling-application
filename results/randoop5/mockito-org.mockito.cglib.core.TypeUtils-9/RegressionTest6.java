import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java.lang.hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Java.lang" + "'", str3, "Java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Java.lang" + "'", str4, "Java.lang");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean16 = org.mockito.cglib.core.TypeUtils.isPrimitive(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type15);
        java.lang.String[] strArray18 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type21);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getClassName(type25);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getBoxedType(type29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type32);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type32);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        int int39 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type36);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean42 = org.mockito.cglib.core.TypeUtils.isPrimitive(type41);
        int int43 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type41);
        int int44 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type41);
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type25, type30, type32, type36, type41 };
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getBoxedType(type47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type47);
        boolean boolean50 = org.mockito.cglib.core.TypeUtils.isArray(type47);
        boolean boolean51 = org.mockito.cglib.core.TypeUtils.isArray(type47);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type47);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type47);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang.hi!" + "'", str33, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray53);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2Elang");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.java$2Elang" + "'", str3, "java.lang.java$2Elang");
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type37);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        java.lang.Class<?> wildcardClass43 = typeArray42.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        java.lang.String[] strArray24 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        java.lang.Class<?> wildcardClass26 = strArray24.getClass();
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        java.lang.Class<?> wildcardClass30 = typeArray28.getClass();
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature33 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray32);
        java.lang.Class<?> wildcardClass34 = typeArray32.getClass();
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature37 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray36);
        java.lang.Class<?> wildcardClass38 = typeArray36.getClass();
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature41 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray40);
        java.lang.Class<?> wildcardClass42 = typeArray40.getClass();
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature45 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray44);
        java.lang.Class<?> wildcardClass46 = typeArray44.getClass();
        java.lang.Class[] classArray47 = new java.lang.Class[] { wildcardClass26, wildcardClass30, wildcardClass34, wildcardClass38, wildcardClass42, wildcardClass46 };
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.getTypes(classArray47);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray50);
        java.lang.String[] strArray55 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray55);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray56, typeArray58);
        java.lang.String[] strArray63 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray63);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray59, typeArray64);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.getBoxedType(type67);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray64, type68);
        org.mockito.asm.Type type71 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean72 = org.mockito.cglib.core.TypeUtils.isArray(type71);
        boolean boolean73 = org.mockito.cglib.core.TypeUtils.isArray(type71);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray64, type71);
        org.mockito.asm.Type type75 = org.mockito.cglib.core.TypeUtils.getBoxedType(type71);
        java.lang.String str76 = org.mockito.cglib.core.TypeUtils.getClassName(type75);
        java.lang.String str77 = org.mockito.cglib.core.TypeUtils.getClassName(type75);
        org.mockito.asm.Type type78 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type75);
        boolean boolean79 = org.mockito.cglib.core.TypeUtils.isPrimitive(type78);
        java.lang.String str80 = org.mockito.cglib.core.TypeUtils.getClassName(type78);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray51, type78);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(signature29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(signature33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(signature37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(signature41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(signature45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(classArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(type78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertNotNull(typeArray81);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2424242Elang$2424242Ejava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        int int14 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        int int17 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        int int20 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getClassName(type25);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type25);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type35);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type38);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isArray(type38);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type32, type35, type38 };
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int45 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        boolean boolean52 = org.mockito.cglib.core.TypeUtils.isArray(type50);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type44, type47, type50 };
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray53);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type57);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray53, type57);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray53);
        org.mockito.cglib.core.Signature signature61 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray60);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray60);
        java.lang.String[] strArray63 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray62);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(signature23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang.hi!" + "'", str51, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(signature61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(strArray63);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        int int2 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        int int3 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("java.lang.java$2424242Elang$2424242Ehi!");
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type5);
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.java$2424242Elang$2424242Ehi!" + "'", str6, "java.lang.java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray7);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        java.lang.Class<?> wildcardClass36 = typeArray35.getClass();
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean39 = org.mockito.cglib.core.TypeUtils.isPrimitive(type38);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getBoxedType(type38);
        java.lang.String str41 = org.mockito.cglib.core.TypeUtils.getClassName(type38);
        java.lang.Class<?> wildcardClass42 = type38.getClass();
        java.lang.Class[] classArray43 = new java.lang.Class[] { wildcardClass36, wildcardClass42 };
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.getTypes(classArray43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.getTypes(classArray43);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.getTypes(classArray43);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray43);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray43);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java.lang.hi!" + "'", str41, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray2);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang");
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type6);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type6);
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        int int12 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type14);
        int int16 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type14);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type14);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type14);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type14);
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        boolean boolean25 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray7);
        int int9 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray7);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type12);
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(type16);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$242Elang$242EJava$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.Class<?> wildcardClass5 = type1.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[] { wildcardClass5 };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type15);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isArray(type28);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type22, type25, type28 };
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int35 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type34);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str41 = org.mockito.cglib.core.TypeUtils.getClassName(type40);
        boolean boolean42 = org.mockito.cglib.core.TypeUtils.isArray(type40);
        org.mockito.asm.Type[] typeArray43 = new org.mockito.asm.Type[] { type34, type37, type40 };
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray43);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean48 = org.mockito.cglib.core.TypeUtils.isPrimitive(type47);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray43, type47);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray43);
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray52);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "java.lang.hi!" + "'", str41, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(typeArray53);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        java.lang.String[] strArray35 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        java.lang.Class<?> wildcardClass37 = strArray35.getClass();
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        java.lang.Class<?> wildcardClass41 = typeArray39.getClass();
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature44 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray43);
        java.lang.Class<?> wildcardClass45 = typeArray43.getClass();
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature48 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray47);
        java.lang.Class<?> wildcardClass49 = typeArray47.getClass();
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature52 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray51);
        java.lang.Class<?> wildcardClass53 = typeArray51.getClass();
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature56 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray55);
        java.lang.Class<?> wildcardClass57 = typeArray55.getClass();
        java.lang.Class[] classArray58 = new java.lang.Class[] { wildcardClass37, wildcardClass41, wildcardClass45, wildcardClass49, wildcardClass53, wildcardClass57 };
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.getTypes(classArray58);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.getTypes(classArray58);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.getClassName(type62);
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type62);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray60, type62);
        java.lang.String[] strArray67 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray67);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray67);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray67);
        org.mockito.asm.Type type72 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$24242Elang$24242Ehi!");
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.add(typeArray70, type72);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray65, type72);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray33, typeArray65);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str78 = org.mockito.cglib.core.TypeUtils.getClassName(type77);
        boolean boolean79 = org.mockito.cglib.core.TypeUtils.isArray(type77);
        org.mockito.asm.Type type80 = org.mockito.cglib.core.TypeUtils.getBoxedType(type77);
        boolean boolean81 = org.mockito.cglib.core.TypeUtils.isArray(type80);
        org.mockito.asm.Type type82 = org.mockito.cglib.core.TypeUtils.getBoxedType(type80);
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type82);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(signature44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(signature48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(signature52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(signature56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "java.lang.hi!" + "'", str78, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertNotNull(typeArray83);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int14 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type13, type16, type19 };
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray22);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean27 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type26);
        org.mockito.cglib.core.Signature signature29 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        java.lang.String[] strArray34 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray37);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature41 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray40);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.getClassName(type43);
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type43);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray37, typeArray40);
        java.lang.String[] strArray48 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray47);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature53 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray52);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type55);
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type55);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray52, type55);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray50, typeArray58);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray47, typeArray59);
        org.mockito.cglib.core.Signature signature61 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray60);
        java.lang.String[] strArray62 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray60);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray60);
        java.lang.Class<?> wildcardClass64 = typeArray60.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(signature29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(signature41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang.hi!" + "'", str44, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(signature53);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "java.lang.hi!" + "'", str57, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(signature61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$242Elang$242EJava$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2Elang");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        java.lang.String[] strArray35 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        java.lang.Class<?> wildcardClass37 = strArray35.getClass();
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        java.lang.Class<?> wildcardClass41 = typeArray39.getClass();
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature44 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray43);
        java.lang.Class<?> wildcardClass45 = typeArray43.getClass();
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature48 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray47);
        java.lang.Class<?> wildcardClass49 = typeArray47.getClass();
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature52 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray51);
        java.lang.Class<?> wildcardClass53 = typeArray51.getClass();
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature56 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray55);
        java.lang.Class<?> wildcardClass57 = typeArray55.getClass();
        java.lang.Class[] classArray58 = new java.lang.Class[] { wildcardClass37, wildcardClass41, wildcardClass45, wildcardClass49, wildcardClass53, wildcardClass57 };
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.getTypes(classArray58);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.getTypes(classArray58);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.getClassName(type62);
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type62);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray60, type62);
        java.lang.String[] strArray67 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray67);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray67);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray67);
        org.mockito.asm.Type type72 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$24242Elang$24242Ehi!");
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.add(typeArray70, type72);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray65, type72);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray33, typeArray65);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str78 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type77);
        java.lang.String str79 = org.mockito.cglib.core.TypeUtils.getClassName(type77);
        org.mockito.asm.Type type80 = org.mockito.cglib.core.TypeUtils.getBoxedType(type77);
        java.lang.String str81 = org.mockito.cglib.core.TypeUtils.getClassName(type80);
        java.lang.String str82 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type80);
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.add(typeArray65, type80);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(signature44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(signature48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(signature52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(signature56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(classArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "java.lang.hi!" + "'", str78, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "java.lang.hi!" + "'", str79, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "java.lang.hi!" + "'", str81, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "java.lang.hi!" + "'", str82, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray83);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java.lang.java$242424242Elang$242424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$2Elang$2Ejava$24242Elang$24242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        java.lang.String[] strArray17 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type23, type26, type29 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature36 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray35);
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray35);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray38);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int42 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.getClassName(type47);
        boolean boolean49 = org.mockito.cglib.core.TypeUtils.isArray(type47);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type41, type44, type47 };
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int54 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type53);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type56);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str60 = org.mockito.cglib.core.TypeUtils.getClassName(type59);
        boolean boolean61 = org.mockito.cglib.core.TypeUtils.isArray(type59);
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type53, type56, type59 };
        java.lang.String[] strArray63 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray62);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray50, typeArray62);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray64);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean68 = org.mockito.cglib.core.TypeUtils.isPrimitive(type67);
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getBoxedType(type67);
        java.lang.String str70 = org.mockito.cglib.core.TypeUtils.getClassName(type67);
        java.lang.String str71 = org.mockito.cglib.core.TypeUtils.getClassName(type67);
        boolean boolean72 = org.mockito.cglib.core.TypeUtils.isPrimitive(type67);
        java.lang.String str73 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type67);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray64, type67);
        int int75 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray74);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang");
        org.mockito.asm.Type type78 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type77);
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.add(typeArray74, type78);
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray74);
        org.mockito.asm.Type type82 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str83 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type82);
        java.lang.String str84 = org.mockito.cglib.core.TypeUtils.getClassName(type82);
        org.mockito.asm.Type type85 = org.mockito.cglib.core.TypeUtils.getBoxedType(type82);
        org.mockito.asm.Type type86 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type82);
        org.mockito.asm.Type type87 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type86);
        java.lang.String str88 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type86);
        org.mockito.asm.Type[] typeArray89 = org.mockito.cglib.core.TypeUtils.add(typeArray74, type86);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(signature36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "java.lang.hi!" + "'", str57, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "java.lang.hi!" + "'", str60, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java.lang.hi!" + "'", str70, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "java.lang.hi!" + "'", str71, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "java.lang.hi!" + "'", str73, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 6 + "'", int75 == 6);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(type78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "java.lang.hi!" + "'", str83, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "java.lang.hi!" + "'", str84, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type85);
        org.junit.Assert.assertNotNull(type86);
        org.junit.Assert.assertNotNull(type87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "java.lang.hi!" + "'", str88, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray89);
    }
}

