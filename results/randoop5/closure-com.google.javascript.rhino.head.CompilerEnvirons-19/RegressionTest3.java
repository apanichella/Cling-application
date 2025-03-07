import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setIdeMode(false);
        java.lang.Class<?> wildcardClass15 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        boolean boolean6 = compilerEnvirons0.isGeneratingSource();
        boolean boolean7 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean11 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean12 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean13 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.Context context8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean7 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean10 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet12);
        boolean boolean15 = compilerEnvirons9.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        java.util.Set<java.lang.String> strSet28 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons29 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean30 = compilerEnvirons29.isGenerateDebugInfo();
        boolean boolean31 = compilerEnvirons29.isStrictMode();
        compilerEnvirons29.setAllowSharpComments(true);
        compilerEnvirons29.setReservedKeywordAsIdentifier(true);
        boolean boolean36 = compilerEnvirons29.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons37 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        compilerEnvirons37.setActivationNames((java.util.Set<java.lang.String>) strSet40);
        compilerEnvirons37.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons45 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        compilerEnvirons45.setActivationNames((java.util.Set<java.lang.String>) strSet48);
        boolean boolean51 = compilerEnvirons45.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons52 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        compilerEnvirons52.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        compilerEnvirons45.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        compilerEnvirons37.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        com.google.javascript.rhino.head.ErrorReporter errorReporter60 = compilerEnvirons37.getErrorReporter();
        boolean boolean61 = compilerEnvirons37.reportWarningAsError();
        compilerEnvirons37.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons64 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        compilerEnvirons64.setActivationNames((java.util.Set<java.lang.String>) strSet67);
        boolean boolean70 = compilerEnvirons64.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons71 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        compilerEnvirons71.setActivationNames((java.util.Set<java.lang.String>) strSet74);
        compilerEnvirons64.setActivationNames((java.util.Set<java.lang.String>) strSet74);
        compilerEnvirons37.setActivationNames((java.util.Set<java.lang.String>) strSet74);
        compilerEnvirons29.setActivationNames((java.util.Set<java.lang.String>) strSet74);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet74);
        boolean boolean81 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(compilerEnvirons29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(errorReporter60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons0.setActivationNames(strSet6);
        compilerEnvirons0.setIdeMode(false);
        java.util.Set<java.lang.String> strSet10 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setAllowSharpComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compilerEnvirons0.getErrorReporter();
        boolean boolean6 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(errorReporter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean6 = compilerEnvirons0.isRecordingLocalJsDocComments();
        int int7 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean8 = compilerEnvirons0.isGenerateObserverCount();
        java.lang.Class<?> wildcardClass9 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(errorReporter19);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = compilerEnvirons0.getErrorReporter();
        boolean boolean13 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(errorReporter12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setIdeMode(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean10 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean13 = compilerEnvirons0.recoverFromErrors();
        boolean boolean14 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet17 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean20 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setOptimizationLevel((-1));
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean4 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean8 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.Context context9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean7 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean7 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = compilerEnvirons0.getErrorReporter();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorReporter13);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        compilerEnvirons3.setActivationNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = compilerEnvirons3.isGenerateDebugInfo();
        compilerEnvirons3.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isGenerateDebugInfo();
        compilerEnvirons12.setRecordingLocalJsDocComments(false);
        compilerEnvirons12.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet18 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons19.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = compilerEnvirons19.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter42);
        compilerEnvirons3.setErrorReporter(errorReporter42);
        compilerEnvirons0.setErrorReporter(errorReporter42);
        boolean boolean46 = compilerEnvirons0.recoverFromErrors();
        com.google.javascript.rhino.head.ErrorReporter errorReporter47 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(errorReporter42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(errorReporter47);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setAllowSharpComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compilerEnvirons0.getErrorReporter();
        java.util.Set<java.lang.String> strSet12 = compilerEnvirons0.getActivationNames();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorReporter11);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean13 = compilerEnvirons12.reportWarningAsError();
        compilerEnvirons12.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons12.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter16);
        boolean boolean18 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorReporter16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(errorReporter19);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setGenerateDebugInfo(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(errorReporter6);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setLanguageVersion(0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        boolean boolean6 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        java.util.Set<java.lang.String> strSet10 = compilerEnvirons0.getActivationNames();
        boolean boolean11 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        boolean boolean7 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet9 = null;
        compilerEnvirons8.setActivationNames(strSet9);
        java.util.Set<java.lang.String> strSet11 = compilerEnvirons8.getActivationNames();
        boolean boolean12 = compilerEnvirons8.isGenerateObserverCount();
        boolean boolean13 = compilerEnvirons8.isReservedKeywordAsIdentifier();
        boolean boolean14 = compilerEnvirons8.recoverFromErrors();
        compilerEnvirons8.setOptimizationLevel(1);
        boolean boolean17 = compilerEnvirons8.isXmlAvailable();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setRecordingComments(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean13 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setOptimizationLevel((int) (short) -1);
        java.util.Set<java.lang.String> strSet15 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet14 = null;
        compilerEnvirons13.setActivationNames(strSet14);
        compilerEnvirons13.setRecordingComments(false);
        compilerEnvirons13.setRecordingLocalJsDocComments(false);
        boolean boolean20 = compilerEnvirons13.isGeneratingSource();
        compilerEnvirons13.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons23.setLanguageVersion(0);
        boolean boolean31 = compilerEnvirons23.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        compilerEnvirons32.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        compilerEnvirons32.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons40 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        compilerEnvirons40.setActivationNames((java.util.Set<java.lang.String>) strSet43);
        boolean boolean46 = compilerEnvirons40.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons47 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        compilerEnvirons47.setActivationNames((java.util.Set<java.lang.String>) strSet50);
        compilerEnvirons40.setActivationNames((java.util.Set<java.lang.String>) strSet50);
        compilerEnvirons32.setActivationNames((java.util.Set<java.lang.String>) strSet50);
        boolean boolean55 = compilerEnvirons32.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons56 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean57 = compilerEnvirons56.reportWarningAsError();
        compilerEnvirons56.setReservedKeywordAsIdentifier(true);
        boolean boolean60 = compilerEnvirons56.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons61 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean62 = compilerEnvirons61.isGenerateDebugInfo();
        compilerEnvirons61.setRecordingLocalJsDocComments(false);
        compilerEnvirons61.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet67 = compilerEnvirons61.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons68 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        compilerEnvirons68.setActivationNames((java.util.Set<java.lang.String>) strSet71);
        compilerEnvirons68.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons76 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray78 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        compilerEnvirons76.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        boolean boolean82 = compilerEnvirons76.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons83 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray85 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        compilerEnvirons83.setActivationNames((java.util.Set<java.lang.String>) strSet86);
        compilerEnvirons76.setActivationNames((java.util.Set<java.lang.String>) strSet86);
        compilerEnvirons68.setActivationNames((java.util.Set<java.lang.String>) strSet86);
        com.google.javascript.rhino.head.ErrorReporter errorReporter91 = compilerEnvirons68.getErrorReporter();
        compilerEnvirons61.setErrorReporter(errorReporter91);
        compilerEnvirons56.setErrorReporter(errorReporter91);
        compilerEnvirons32.setErrorReporter(errorReporter91);
        compilerEnvirons23.setErrorReporter(errorReporter91);
        compilerEnvirons13.setErrorReporter(errorReporter91);
        compilerEnvirons0.setErrorReporter(errorReporter91);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(strSet67);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(errorReporter91);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean8 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean10 = compilerEnvirons0.recoverFromErrors();
        boolean boolean11 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean8 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean13 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        boolean boolean14 = compilerEnvirons8.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        compilerEnvirons25.setLanguageVersion(0);
        boolean boolean33 = compilerEnvirons25.isAllowMemberExprAsFunctionName();
        int int34 = compilerEnvirons25.getOptimizationLevel();
        boolean boolean35 = compilerEnvirons25.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet39);
        boolean boolean42 = compilerEnvirons36.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons43 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        compilerEnvirons43.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        boolean boolean50 = compilerEnvirons36.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons51 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean52 = compilerEnvirons51.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons53 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        compilerEnvirons53.setActivationNames((java.util.Set<java.lang.String>) strSet56);
        compilerEnvirons53.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons61 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet64);
        boolean boolean67 = compilerEnvirons61.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons68 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        compilerEnvirons68.setActivationNames((java.util.Set<java.lang.String>) strSet71);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet71);
        compilerEnvirons53.setActivationNames((java.util.Set<java.lang.String>) strSet71);
        com.google.javascript.rhino.head.ErrorReporter errorReporter76 = compilerEnvirons53.getErrorReporter();
        compilerEnvirons51.setErrorReporter(errorReporter76);
        compilerEnvirons36.setErrorReporter(errorReporter76);
        compilerEnvirons25.setErrorReporter(errorReporter76);
        compilerEnvirons0.setErrorReporter(errorReporter76);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons81 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean82 = compilerEnvirons81.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons83 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray85 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        compilerEnvirons83.setActivationNames((java.util.Set<java.lang.String>) strSet86);
        compilerEnvirons81.setActivationNames((java.util.Set<java.lang.String>) strSet86);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet86);
        boolean boolean91 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setOptimizationLevel((-1));
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(errorReporter76);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setGeneratingSource(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean10 = compilerEnvirons9.reportWarningAsError();
        int int11 = compilerEnvirons9.getOptimizationLevel();
        compilerEnvirons9.setAllowMemberExprAsFunctionName(true);
        boolean boolean14 = compilerEnvirons9.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = compilerEnvirons9.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter15);
        int int17 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean18 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean10 = compilerEnvirons9.reportWarningAsError();
        int int11 = compilerEnvirons9.getOptimizationLevel();
        compilerEnvirons9.setAllowMemberExprAsFunctionName(true);
        boolean boolean14 = compilerEnvirons9.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = compilerEnvirons9.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter15);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(errorReporter15);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons6 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean7 = compilerEnvirons6.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        boolean boolean14 = compilerEnvirons8.isStrictMode();
        boolean boolean15 = compilerEnvirons8.isXmlAvailable();
        compilerEnvirons8.setGenerateObserverCount(true);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        compilerEnvirons8.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons8.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons28.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet39);
        boolean boolean42 = compilerEnvirons36.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons43 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        compilerEnvirons43.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons6.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        int int54 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean55 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.ErrorReporter errorReporter6 = compilerEnvirons0.getErrorReporter();
        java.util.Set<java.lang.String> strSet7 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet9 = null;
        compilerEnvirons8.setActivationNames(strSet9);
        boolean boolean11 = compilerEnvirons8.isIdeMode();
        int int12 = compilerEnvirons8.getOptimizationLevel();
        compilerEnvirons8.setGeneratingSource(true);
        boolean boolean15 = compilerEnvirons8.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        boolean boolean24 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(errorReporter6);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean11 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecordingComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean15 = compilerEnvirons14.reportWarningAsError();
        int int16 = compilerEnvirons14.getOptimizationLevel();
        compilerEnvirons14.setAllowMemberExprAsFunctionName(true);
        boolean boolean19 = compilerEnvirons14.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean21 = compilerEnvirons20.reportWarningAsError();
        compilerEnvirons20.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = compilerEnvirons20.getErrorReporter();
        compilerEnvirons14.setErrorReporter(errorReporter24);
        compilerEnvirons0.setErrorReporter(errorReporter24);
        int int27 = compilerEnvirons0.getLanguageVersion();
        boolean boolean28 = compilerEnvirons0.recoverFromErrors();
        boolean boolean29 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setAllowSharpComments(false);
        int int36 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(errorReporter24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean6 = compilerEnvirons0.isXmlAvailable();
        boolean boolean7 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean11 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        java.util.Set<java.lang.String> strSet7 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isIdeMode();
        boolean boolean5 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setIdeMode(false);
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        boolean boolean12 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean13 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean16 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean11 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        boolean boolean18 = compilerEnvirons12.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        boolean boolean26 = compilerEnvirons12.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean28 = compilerEnvirons27.reportWarningAsError();
        int int29 = compilerEnvirons27.getOptimizationLevel();
        compilerEnvirons27.setAllowMemberExprAsFunctionName(true);
        boolean boolean32 = compilerEnvirons27.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = compilerEnvirons27.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter33);
        compilerEnvirons0.setErrorReporter(errorReporter33);
        int int36 = compilerEnvirons0.getLanguageVersion();
        int int37 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(errorReporter33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 170 + "'", int36 == 170);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setRecordingComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean13 = compilerEnvirons0.isRecordingComments();
        boolean boolean14 = compilerEnvirons0.recoverFromErrors();
        boolean boolean15 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean16 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons0.setActivationNames(strSet6);
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setLanguageVersion(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        int int9 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet12 = null;
        compilerEnvirons11.setActivationNames(strSet12);
        boolean boolean14 = compilerEnvirons11.isAllowMemberExprAsFunctionName();
        boolean boolean15 = compilerEnvirons11.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        boolean boolean22 = compilerEnvirons16.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        java.util.Set<java.lang.String> strSet32 = compilerEnvirons0.getActivationNames();
        boolean boolean33 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons0.setActivationNames(strSet6);
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        java.util.Set<java.lang.String> strSet10 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNotNull(errorReporter11);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean13 = compilerEnvirons0.isRecordingComments();
        boolean boolean14 = compilerEnvirons0.isRecordingComments();
        boolean boolean15 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet17 = null;
        compilerEnvirons16.setActivationNames(strSet17);
        boolean boolean19 = compilerEnvirons16.isAllowMemberExprAsFunctionName();
        boolean boolean20 = compilerEnvirons16.getAllowSharpComments();
        boolean boolean21 = compilerEnvirons16.isReservedKeywordAsIdentifier();
        compilerEnvirons16.setRecoverFromErrors(true);
        boolean boolean24 = compilerEnvirons16.isGeneratingSource();
        compilerEnvirons16.setGenerateObserverCount(false);
        boolean boolean27 = compilerEnvirons16.isRecordingLocalJsDocComments();
        compilerEnvirons16.setRecordingComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean31 = compilerEnvirons30.reportWarningAsError();
        int int32 = compilerEnvirons30.getOptimizationLevel();
        compilerEnvirons30.setAllowMemberExprAsFunctionName(true);
        boolean boolean35 = compilerEnvirons30.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean37 = compilerEnvirons36.reportWarningAsError();
        compilerEnvirons36.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter40 = compilerEnvirons36.getErrorReporter();
        compilerEnvirons30.setErrorReporter(errorReporter40);
        compilerEnvirons16.setErrorReporter(errorReporter40);
        compilerEnvirons0.setErrorReporter(errorReporter40);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(errorReporter40);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean22 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setLanguageVersion(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        boolean boolean9 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet10 = compilerEnvirons0.getActivationNames();
        boolean boolean11 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons0.setActivationNames(strSet6);
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        int int14 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean17 = compilerEnvirons0.isGenerateObserverCount();
        int int18 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        int int10 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setXmlAvailable(false);
        int int13 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean13 = compilerEnvirons0.recoverFromErrors();
        boolean boolean14 = compilerEnvirons0.reportWarningAsError();
        boolean boolean15 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean13 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean10 = compilerEnvirons0.isStrictMode();
        boolean boolean11 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean12 = compilerEnvirons0.isStrictMode();
        java.util.Set<java.lang.String> strSet13 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean7 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean9 = compilerEnvirons8.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        compilerEnvirons8.setXmlAvailable(false);
        boolean boolean19 = compilerEnvirons8.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet21 = null;
        compilerEnvirons20.setActivationNames(strSet21);
        boolean boolean23 = compilerEnvirons20.isIdeMode();
        int int24 = compilerEnvirons20.getOptimizationLevel();
        compilerEnvirons20.setGeneratingSource(true);
        boolean boolean27 = compilerEnvirons20.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        boolean boolean37 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean38 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean12 = compilerEnvirons0.isIdeMode();
        boolean boolean13 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean16 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setXmlAvailable(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean12 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean13 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean18 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter10 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(errorReporter10);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean11 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setStrictMode(true);
        int int14 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons0.setOptimizationLevel((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean16 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setIdeMode(false);
        com.google.javascript.rhino.head.Context context19 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isStrictMode();
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        int int13 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean11 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        boolean boolean7 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean12 = compilerEnvirons0.recoverFromErrors();
        com.google.javascript.rhino.head.Context context13 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.Context context5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        boolean boolean14 = compilerEnvirons8.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean27 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean6 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean18 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setWarnTrailingComma(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean4 = compilerEnvirons0.isGeneratingSource();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setOptimizationLevel((int) (byte) 0);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        boolean boolean7 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.getAllowSharpComments();
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(strSet3);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        compilerEnvirons5.setLanguageVersion(0);
        boolean boolean13 = compilerEnvirons5.isAllowMemberExprAsFunctionName();
        int int14 = compilerEnvirons5.getOptimizationLevel();
        compilerEnvirons5.setIdeMode(false);
        boolean boolean17 = compilerEnvirons5.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean19 = compilerEnvirons18.isGenerateDebugInfo();
        compilerEnvirons18.setRecordingLocalJsDocComments(false);
        compilerEnvirons18.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet24 = compilerEnvirons18.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        compilerEnvirons25.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        compilerEnvirons33.setActivationNames((java.util.Set<java.lang.String>) strSet36);
        boolean boolean39 = compilerEnvirons33.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons40 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray42 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        compilerEnvirons40.setActivationNames((java.util.Set<java.lang.String>) strSet43);
        compilerEnvirons33.setActivationNames((java.util.Set<java.lang.String>) strSet43);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet43);
        com.google.javascript.rhino.head.ErrorReporter errorReporter48 = compilerEnvirons25.getErrorReporter();
        compilerEnvirons18.setErrorReporter(errorReporter48);
        compilerEnvirons5.setErrorReporter(errorReporter48);
        compilerEnvirons5.setRecordingComments(false);
        compilerEnvirons5.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons55 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        compilerEnvirons55.setActivationNames((java.util.Set<java.lang.String>) strSet58);
        compilerEnvirons55.setLanguageVersion(0);
        boolean boolean63 = compilerEnvirons55.isGeneratingSource();
        compilerEnvirons55.setStrictMode(false);
        int int66 = compilerEnvirons55.getOptimizationLevel();
        compilerEnvirons55.setStrictMode(false);
        java.util.Set<java.lang.String> strSet69 = compilerEnvirons55.getActivationNames();
        compilerEnvirons5.setActivationNames(strSet69);
        compilerEnvirons0.setActivationNames(strSet69);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(errorReporter48);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(strSet69);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean16 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean17 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGeneratingSource();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecoverFromErrors(true);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        int int10 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean13 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean16 = compilerEnvirons0.isGenerateObserverCount();
        int int17 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isRecordingComments();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel(170);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 170");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setGeneratingSource(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean10 = compilerEnvirons0.isGeneratingSource();
        boolean boolean11 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        boolean boolean10 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateDebugInfo(false);
        java.lang.Class<?> wildcardClass13 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        boolean boolean20 = compilerEnvirons0.isGenerateObserverCount();
        int int21 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean22 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setGeneratingSource(false);
        java.util.Set<java.lang.String> strSet17 = null;
        compilerEnvirons0.setActivationNames(strSet17);
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean21 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGenerateDebugInfo(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        int int8 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 170 + "'", int8 == 170);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        boolean boolean10 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setIdeMode(false);
        boolean boolean15 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setRecordingComments(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setGenerateDebugInfo(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorReporter13);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        boolean boolean12 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean13 = compilerEnvirons0.isRecordingComments();
        boolean boolean14 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        int int4 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean5 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setStrictMode(false);
        int int7 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 170 + "'", int7 == 170);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setLanguageVersion(0);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter7 = compilerEnvirons0.getErrorReporter();
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorReporter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingComments(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        int int7 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 170 + "'", int7 == 170);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setStrictMode(true);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        int int9 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet12 = null;
        compilerEnvirons11.setActivationNames(strSet12);
        boolean boolean14 = compilerEnvirons11.isAllowMemberExprAsFunctionName();
        boolean boolean15 = compilerEnvirons11.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        boolean boolean22 = compilerEnvirons16.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean34 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        int int7 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean7 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean13 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setWarnTrailingComma(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(true);
        int int9 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean12 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGeneratingSource();
        boolean boolean5 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean6 = compilerEnvirons0.isXmlAvailable();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean8 = compilerEnvirons7.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet12);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet12);
        compilerEnvirons7.setXmlAvailable(false);
        boolean boolean18 = compilerEnvirons7.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet20 = null;
        compilerEnvirons19.setActivationNames(strSet20);
        boolean boolean22 = compilerEnvirons19.isIdeMode();
        int int23 = compilerEnvirons19.getOptimizationLevel();
        compilerEnvirons19.setGeneratingSource(true);
        boolean boolean26 = compilerEnvirons19.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean36 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        boolean boolean10 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setOptimizationLevel((int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        boolean boolean12 = compilerEnvirons0.recoverFromErrors();
        boolean boolean13 = compilerEnvirons0.isStrictMode();
        boolean boolean14 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons9.setRecordingLocalJsDocComments(true);
        boolean boolean12 = compilerEnvirons9.isGenerateObserverCount();
        boolean boolean13 = compilerEnvirons9.isGenerateDebugInfo();
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = compilerEnvirons9.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter14);
        boolean boolean16 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setAllowSharpComments(true);
        int int10 = compilerEnvirons0.getLanguageVersion();
        boolean boolean11 = compilerEnvirons0.isXmlAvailable();
        boolean boolean12 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setRecordingComments(true);
        java.lang.Class<?> wildcardClass8 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.isGenerateDebugInfo();
        int int10 = compilerEnvirons0.getLanguageVersion();
        boolean boolean11 = compilerEnvirons0.recoverFromErrors();
        java.util.Set<java.lang.String> strSet12 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        boolean boolean14 = compilerEnvirons8.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        boolean boolean22 = compilerEnvirons8.isGeneratingSource();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons8.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter23);
        compilerEnvirons0.setAllowSharpComments(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertNotNull(errorReporter27);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setRecoverFromErrors(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(errorReporter11);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setOptimizationLevel((-1));
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean25 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(errorReporter20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertNull(strSet3);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean19 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(errorReporter3);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        int int8 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setIdeMode(false);
        boolean boolean7 = compilerEnvirons0.recoverFromErrors();
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean4 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean5 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        boolean boolean14 = compilerEnvirons8.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
        boolean boolean25 = compilerEnvirons0.isRecordingComments();
        boolean boolean26 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean27 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean16 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        boolean boolean18 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean29 = compilerEnvirons0.recoverFromErrors();
        boolean boolean30 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setOptimizationLevel(0);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        int int5 = compilerEnvirons0.getLanguageVersion();
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean13 = compilerEnvirons7.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        compilerEnvirons14.setActivationNames((java.util.Set<java.lang.String>) strSet17);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet17);
        boolean boolean21 = compilerEnvirons7.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean23 = compilerEnvirons22.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons24 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray26 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        compilerEnvirons24.setActivationNames((java.util.Set<java.lang.String>) strSet27);
        compilerEnvirons24.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        compilerEnvirons32.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        boolean boolean38 = compilerEnvirons32.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons39 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        compilerEnvirons39.setActivationNames((java.util.Set<java.lang.String>) strSet42);
        compilerEnvirons32.setActivationNames((java.util.Set<java.lang.String>) strSet42);
        compilerEnvirons24.setActivationNames((java.util.Set<java.lang.String>) strSet42);
        com.google.javascript.rhino.head.ErrorReporter errorReporter47 = compilerEnvirons24.getErrorReporter();
        compilerEnvirons22.setErrorReporter(errorReporter47);
        compilerEnvirons7.setErrorReporter(errorReporter47);
        compilerEnvirons0.setErrorReporter(errorReporter47);
        boolean boolean51 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(errorReporter47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons7.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        boolean boolean21 = compilerEnvirons15.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons22 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        compilerEnvirons22.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet25);
        com.google.javascript.rhino.head.ErrorReporter errorReporter30 = compilerEnvirons7.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter30);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(errorReporter30);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setGeneratingSource(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter7 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingComments(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorReporter7);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setWarnTrailingComma(true);
        int int15 = compilerEnvirons0.getLanguageVersion();
        boolean boolean16 = compilerEnvirons0.reportWarningAsError();
        boolean boolean17 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 170 + "'", int15 == 170);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setIdeMode(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean15 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean16 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.Context context17 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean5 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        int int5 = compilerEnvirons0.getLanguageVersion();
        boolean boolean6 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 170 + "'", int5 == 170);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGeneratingSource();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setAllowSharpComments(true);
        int int9 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setAllowSharpComments(false);
        int int15 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean11 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isRecordingComments();
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean5 = compilerEnvirons0.reportWarningAsError();
        int int6 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setXmlAvailable(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        boolean boolean18 = compilerEnvirons0.isGeneratingSource();
        boolean boolean19 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean7 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setIdeMode(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet9 = null;
        compilerEnvirons8.setActivationNames(strSet9);
        java.util.Set<java.lang.String> strSet11 = compilerEnvirons8.getActivationNames();
        boolean boolean12 = compilerEnvirons8.isGenerateObserverCount();
        boolean boolean13 = compilerEnvirons8.isReservedKeywordAsIdentifier();
        boolean boolean14 = compilerEnvirons8.recoverFromErrors();
        compilerEnvirons8.setOptimizationLevel(1);
        boolean boolean17 = compilerEnvirons8.isXmlAvailable();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean20 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setLanguageVersion(170);
        boolean boolean23 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean7 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setXmlAvailable(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons12.setLanguageVersion(0);
        boolean boolean20 = compilerEnvirons12.isGeneratingSource();
        compilerEnvirons12.setStrictMode(false);
        java.util.Set<java.lang.String> strSet23 = compilerEnvirons12.getActivationNames();
        compilerEnvirons0.setActivationNames(strSet23);
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean7 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean10 = compilerEnvirons0.isStrictMode();
        boolean boolean11 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.Context context5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.recoverFromErrors();
        boolean boolean16 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean19 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean20 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        compilerEnvirons10.setLanguageVersion(0);
        boolean boolean18 = compilerEnvirons10.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons19.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        boolean boolean42 = compilerEnvirons19.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons43 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean44 = compilerEnvirons43.reportWarningAsError();
        compilerEnvirons43.setReservedKeywordAsIdentifier(true);
        boolean boolean47 = compilerEnvirons43.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons48 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean49 = compilerEnvirons48.isGenerateDebugInfo();
        compilerEnvirons48.setRecordingLocalJsDocComments(false);
        compilerEnvirons48.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet54 = compilerEnvirons48.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons55 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        compilerEnvirons55.setActivationNames((java.util.Set<java.lang.String>) strSet58);
        compilerEnvirons55.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons63 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        compilerEnvirons63.setActivationNames((java.util.Set<java.lang.String>) strSet66);
        boolean boolean69 = compilerEnvirons63.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons70 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        compilerEnvirons70.setActivationNames((java.util.Set<java.lang.String>) strSet73);
        compilerEnvirons63.setActivationNames((java.util.Set<java.lang.String>) strSet73);
        compilerEnvirons55.setActivationNames((java.util.Set<java.lang.String>) strSet73);
        com.google.javascript.rhino.head.ErrorReporter errorReporter78 = compilerEnvirons55.getErrorReporter();
        compilerEnvirons48.setErrorReporter(errorReporter78);
        compilerEnvirons43.setErrorReporter(errorReporter78);
        compilerEnvirons19.setErrorReporter(errorReporter78);
        compilerEnvirons10.setErrorReporter(errorReporter78);
        compilerEnvirons0.setErrorReporter(errorReporter78);
        compilerEnvirons0.setGenerateDebugInfo(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(strSet54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(errorReporter78);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        boolean boolean7 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateObserverCount(true);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        compilerEnvirons0.setOptimizationLevel((int) (byte) 1);
        boolean boolean18 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        java.util.Set<java.lang.String> strSet5 = compilerEnvirons0.getActivationNames();
        boolean boolean6 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean7 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(errorReporter4);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons0.setActivationNames(strSet6);
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = compilerEnvirons0.getErrorReporter();
        boolean boolean14 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean15 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean16 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean13 = compilerEnvirons0.recoverFromErrors();
        boolean boolean14 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet17 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setLanguageVersion(170);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean13 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGenerateObserverCount(false);
        int int6 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.recoverFromErrors();
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorReporter5);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons0.setActivationNames(strSet6);
        compilerEnvirons0.setIdeMode(false);
        int int10 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean13 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter7 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(errorReporter7);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean9 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean15 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setIdeMode(true);
        boolean boolean18 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setIdeMode(true);
        compilerEnvirons0.setGeneratingSource(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        boolean boolean9 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        compilerEnvirons10.setLanguageVersion(0);
        boolean boolean18 = compilerEnvirons10.isAllowMemberExprAsFunctionName();
        int int19 = compilerEnvirons10.getOptimizationLevel();
        boolean boolean20 = compilerEnvirons10.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons21 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        compilerEnvirons21.setActivationNames((java.util.Set<java.lang.String>) strSet24);
        boolean boolean27 = compilerEnvirons21.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons21.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        boolean boolean35 = compilerEnvirons21.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean37 = compilerEnvirons36.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        compilerEnvirons38.setActivationNames((java.util.Set<java.lang.String>) strSet41);
        compilerEnvirons38.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons46 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray48 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        compilerEnvirons46.setActivationNames((java.util.Set<java.lang.String>) strSet49);
        boolean boolean52 = compilerEnvirons46.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons53 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        compilerEnvirons53.setActivationNames((java.util.Set<java.lang.String>) strSet56);
        compilerEnvirons46.setActivationNames((java.util.Set<java.lang.String>) strSet56);
        compilerEnvirons38.setActivationNames((java.util.Set<java.lang.String>) strSet56);
        com.google.javascript.rhino.head.ErrorReporter errorReporter61 = compilerEnvirons38.getErrorReporter();
        compilerEnvirons36.setErrorReporter(errorReporter61);
        compilerEnvirons21.setErrorReporter(errorReporter61);
        compilerEnvirons10.setErrorReporter(errorReporter61);
        compilerEnvirons0.setErrorReporter(errorReporter61);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(errorReporter61);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean16 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean17 = compilerEnvirons0.isXmlAvailable();
        boolean boolean18 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean4 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.Context context5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int8 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean9 = compilerEnvirons0.isRecordingComments();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean12 = compilerEnvirons11.isGenerateDebugInfo();
        compilerEnvirons11.setXmlAvailable(false);
        boolean boolean15 = compilerEnvirons11.getWarnTrailingComma();
        boolean boolean16 = compilerEnvirons11.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet18 = null;
        compilerEnvirons17.setActivationNames(strSet18);
        int int20 = compilerEnvirons17.getLanguageVersion();
        compilerEnvirons17.setRecordingLocalJsDocComments(false);
        compilerEnvirons17.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        boolean boolean31 = compilerEnvirons25.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        compilerEnvirons32.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        boolean boolean39 = compilerEnvirons25.isGeneratingSource();
        com.google.javascript.rhino.head.ErrorReporter errorReporter40 = compilerEnvirons25.getErrorReporter();
        compilerEnvirons17.setErrorReporter(errorReporter40);
        compilerEnvirons11.setErrorReporter(errorReporter40);
        compilerEnvirons0.setErrorReporter(errorReporter40);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(errorReporter40);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setIdeMode(true);
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean6 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean7 = compilerEnvirons0.isIdeMode();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        int int12 = compilerEnvirons0.getLanguageVersion();
        boolean boolean13 = compilerEnvirons0.isXmlAvailable();
        boolean boolean14 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean10 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        boolean boolean12 = compilerEnvirons0.recoverFromErrors();
        boolean boolean13 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setXmlAvailable(true);
        compilerEnvirons0.setLanguageVersion((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setXmlAvailable(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGeneratingSource();
        boolean boolean2 = compilerEnvirons0.isIdeMode();
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean7 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean11 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean12 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean15 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 10");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.recoverFromErrors();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        boolean boolean22 = compilerEnvirons16.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        boolean boolean30 = compilerEnvirons16.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean32 = compilerEnvirons31.reportWarningAsError();
        int int33 = compilerEnvirons31.getOptimizationLevel();
        compilerEnvirons31.setAllowMemberExprAsFunctionName(true);
        boolean boolean36 = compilerEnvirons31.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter37 = compilerEnvirons31.getErrorReporter();
        compilerEnvirons16.setErrorReporter(errorReporter37);
        compilerEnvirons0.setErrorReporter(errorReporter37);
        int int40 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setOptimizationLevel((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(errorReporter37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        boolean boolean4 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean5 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean8 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons11 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray13 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet14);
        boolean boolean17 = compilerEnvirons11.isGenerateDebugInfo();
        compilerEnvirons11.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet23);
        boolean boolean26 = compilerEnvirons20.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons11.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons11.setAllowSharpComments(false);
        compilerEnvirons11.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = compilerEnvirons11.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter39);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(errorReporter39);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean7 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean9 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setGeneratingSource(false);
        int int8 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 170 + "'", int8 == 170);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean4 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean7 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setOptimizationLevel(1);
        compilerEnvirons0.setIdeMode(true);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean10 = compilerEnvirons9.reportWarningAsError();
        int int11 = compilerEnvirons9.getOptimizationLevel();
        compilerEnvirons9.setAllowMemberExprAsFunctionName(true);
        boolean boolean14 = compilerEnvirons9.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = compilerEnvirons9.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter15);
        compilerEnvirons0.setStrictMode(false);
        boolean boolean19 = compilerEnvirons0.getWarnTrailingComma();
        int int20 = compilerEnvirons0.getLanguageVersion();
        boolean boolean21 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 170 + "'", int20 == 170);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        boolean boolean6 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        java.util.Set<java.lang.String> strSet8 = compilerEnvirons0.getActivationNames();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean15 = compilerEnvirons0.recoverFromErrors();
        boolean boolean16 = compilerEnvirons0.isXmlAvailable();
        boolean boolean17 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean18 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean7 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean8 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        boolean boolean18 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setRecordingComments(false);
        com.google.javascript.rhino.head.Context context23 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        boolean boolean18 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean29 = compilerEnvirons0.recoverFromErrors();
        boolean boolean30 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setOptimizationLevel(0);
        java.util.Set<java.lang.String> strSet33 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean11 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean13 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet14 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        boolean boolean18 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setStrictMode(true);
        boolean boolean7 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        compilerEnvirons3.setActivationNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = compilerEnvirons3.isGenerateDebugInfo();
        compilerEnvirons3.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isGenerateDebugInfo();
        compilerEnvirons12.setRecordingLocalJsDocComments(false);
        compilerEnvirons12.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet18 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons19.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = compilerEnvirons19.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter42);
        compilerEnvirons3.setErrorReporter(errorReporter42);
        compilerEnvirons0.setErrorReporter(errorReporter42);
        boolean boolean46 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean47 = compilerEnvirons0.isGeneratingSource();
        boolean boolean48 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecordingComments(false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(errorReporter42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean7 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean9 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGenerateObserverCount(false);
        int int6 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean9 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean7 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setOptimizationLevel((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setOptimizationLevel((int) (byte) -1);
        boolean boolean13 = compilerEnvirons0.isGeneratingSource();
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.getWarnTrailingComma();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setAllowSharpComments(true);
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean7 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean8 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setOptimizationLevel((int) (byte) -1);
        boolean boolean13 = compilerEnvirons0.isGeneratingSource();
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setLanguageVersion(170);
        boolean boolean11 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setRecordingComments(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 52");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        boolean boolean9 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet10 = compilerEnvirons0.getActivationNames();
        boolean boolean11 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean12 = compilerEnvirons0.isRecordingComments();
        boolean boolean13 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean11 = compilerEnvirons0.recoverFromErrors();
        boolean boolean12 = compilerEnvirons0.recoverFromErrors();
        boolean boolean13 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean11 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setXmlAvailable(true);
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setLanguageVersion((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Bad language version: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isRecordingLocalJsDocComments();
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setOptimizationLevel(0);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        int int12 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setIdeMode(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        java.util.Set<java.lang.String> strSet19 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        boolean boolean14 = compilerEnvirons8.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        compilerEnvirons25.setLanguageVersion(0);
        boolean boolean33 = compilerEnvirons25.isAllowMemberExprAsFunctionName();
        int int34 = compilerEnvirons25.getOptimizationLevel();
        boolean boolean35 = compilerEnvirons25.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet39);
        boolean boolean42 = compilerEnvirons36.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons43 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        compilerEnvirons43.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        boolean boolean50 = compilerEnvirons36.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons51 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean52 = compilerEnvirons51.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons53 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray55 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        compilerEnvirons53.setActivationNames((java.util.Set<java.lang.String>) strSet56);
        compilerEnvirons53.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons61 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet64);
        boolean boolean67 = compilerEnvirons61.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons68 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        compilerEnvirons68.setActivationNames((java.util.Set<java.lang.String>) strSet71);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet71);
        compilerEnvirons53.setActivationNames((java.util.Set<java.lang.String>) strSet71);
        com.google.javascript.rhino.head.ErrorReporter errorReporter76 = compilerEnvirons53.getErrorReporter();
        compilerEnvirons51.setErrorReporter(errorReporter76);
        compilerEnvirons36.setErrorReporter(errorReporter76);
        compilerEnvirons25.setErrorReporter(errorReporter76);
        compilerEnvirons0.setErrorReporter(errorReporter76);
        boolean boolean81 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean82 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setWarnTrailingComma(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(errorReporter76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        java.util.Set<java.lang.String> strSet9 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setXmlAvailable(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setStrictMode(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        compilerEnvirons3.setActivationNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = compilerEnvirons3.isGenerateDebugInfo();
        compilerEnvirons3.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isGenerateDebugInfo();
        compilerEnvirons12.setRecordingLocalJsDocComments(false);
        compilerEnvirons12.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet18 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons19.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = compilerEnvirons19.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter42);
        compilerEnvirons3.setErrorReporter(errorReporter42);
        compilerEnvirons0.setErrorReporter(errorReporter42);
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setOptimizationLevel(0);
        boolean boolean50 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(errorReporter42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean7 = compilerEnvirons0.reportWarningAsError();
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet7 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setAllowSharpComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compilerEnvirons0.getErrorReporter();
        java.util.Set<java.lang.String> strSet12 = compilerEnvirons0.getActivationNames();
        boolean boolean13 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorReporter11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setXmlAvailable(false);
        java.util.Set<java.lang.String> strSet18 = compilerEnvirons0.getActivationNames();
        boolean boolean19 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        int int10 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean15 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean7 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.Context context8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setOptimizationLevel((int) (short) 0);
        compilerEnvirons0.setRecoverFromErrors(true);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isIdeMode();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        int int7 = compilerEnvirons0.getLanguageVersion();
        boolean boolean8 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean13 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean14 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        boolean boolean6 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setAllowSharpComments(false);
        java.lang.Class<?> wildcardClass11 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean13 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setStrictMode(false);
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        int int10 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        boolean boolean20 = compilerEnvirons0.isGenerateObserverCount();
        int int21 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setXmlAvailable(true);
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean26 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean6 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int7 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean8 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        boolean boolean14 = compilerEnvirons8.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons0.getErrorReporter();
        boolean boolean24 = compilerEnvirons0.reportWarningAsError();
        boolean boolean25 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setOptimizationLevel((-1));
        int int28 = compilerEnvirons0.getLanguageVersion();
        boolean boolean29 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.isGeneratingSource();
        boolean boolean5 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        java.lang.Class<?> wildcardClass10 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setStrictMode(false);
        boolean boolean7 = compilerEnvirons0.isXmlAvailable();
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean16 = compilerEnvirons15.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons17.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray27 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet28);
        boolean boolean31 = compilerEnvirons25.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray34 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        compilerEnvirons32.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet35);
        com.google.javascript.rhino.head.ErrorReporter errorReporter40 = compilerEnvirons17.getErrorReporter();
        compilerEnvirons15.setErrorReporter(errorReporter40);
        compilerEnvirons0.setErrorReporter(errorReporter40);
        boolean boolean43 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(errorReporter40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean3 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setStrictMode(false);
        java.util.Set<java.lang.String> strSet9 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean13 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean14 = compilerEnvirons0.isGeneratingSource();
        java.lang.Class<?> wildcardClass15 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setGeneratingSource(false);
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean4 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        com.google.javascript.rhino.head.Context context7 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean13 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGenerateDebugInfo(false);
        java.util.Set<java.lang.String> strSet16 = null;
        compilerEnvirons0.setActivationNames(strSet16);
        boolean boolean18 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        compilerEnvirons3.setActivationNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = compilerEnvirons3.isGenerateDebugInfo();
        compilerEnvirons3.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isGenerateDebugInfo();
        compilerEnvirons12.setRecordingLocalJsDocComments(false);
        compilerEnvirons12.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet18 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons19.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = compilerEnvirons19.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter42);
        compilerEnvirons3.setErrorReporter(errorReporter42);
        compilerEnvirons0.setErrorReporter(errorReporter42);
        boolean boolean46 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((int) (short) 1);
        boolean boolean51 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(errorReporter42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons3 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        compilerEnvirons3.setActivationNames((java.util.Set<java.lang.String>) strSet6);
        boolean boolean9 = compilerEnvirons3.isGenerateDebugInfo();
        compilerEnvirons3.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.isGenerateDebugInfo();
        compilerEnvirons12.setRecordingLocalJsDocComments(false);
        compilerEnvirons12.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet18 = compilerEnvirons12.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons19.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        boolean boolean33 = compilerEnvirons27.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        com.google.javascript.rhino.head.ErrorReporter errorReporter42 = compilerEnvirons19.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter42);
        compilerEnvirons3.setErrorReporter(errorReporter42);
        compilerEnvirons0.setErrorReporter(errorReporter42);
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setOptimizationLevel(0);
        int int50 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean51 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(errorReporter42);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setLanguageVersion((int) (byte) 100);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertNull(strSet4);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons0.recoverFromErrors();
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(true);
        boolean boolean13 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean16 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray11 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet12);
        boolean boolean15 = compilerEnvirons9.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons9.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        java.util.Set<java.lang.String> strSet28 = compilerEnvirons0.getActivationNames();
        boolean boolean29 = compilerEnvirons0.isGeneratingSource();
        boolean boolean30 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean6 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setLanguageVersion((int) (short) 0);
        compilerEnvirons0.setIdeMode(false);
        boolean boolean13 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean10 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setLanguageVersion(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        int int7 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean10 = compilerEnvirons0.isRecordingComments();
        java.util.Set<java.lang.String> strSet11 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean13 = compilerEnvirons12.reportWarningAsError();
        boolean boolean14 = compilerEnvirons12.isRecordingComments();
        int int15 = compilerEnvirons12.getOptimizationLevel();
        int int16 = compilerEnvirons12.getLanguageVersion();
        compilerEnvirons12.setAllowSharpComments(false);
        compilerEnvirons12.setWarnTrailingComma(false);
        compilerEnvirons12.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean24 = compilerEnvirons23.reportWarningAsError();
        boolean boolean25 = compilerEnvirons23.isRecordingComments();
        boolean boolean26 = compilerEnvirons23.isAllowMemberExprAsFunctionName();
        boolean boolean27 = compilerEnvirons23.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean29 = compilerEnvirons28.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons30 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        compilerEnvirons30.setActivationNames((java.util.Set<java.lang.String>) strSet33);
        compilerEnvirons30.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons38 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray40 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        compilerEnvirons38.setActivationNames((java.util.Set<java.lang.String>) strSet41);
        boolean boolean44 = compilerEnvirons38.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons45 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        compilerEnvirons45.setActivationNames((java.util.Set<java.lang.String>) strSet48);
        compilerEnvirons38.setActivationNames((java.util.Set<java.lang.String>) strSet48);
        compilerEnvirons30.setActivationNames((java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.rhino.head.ErrorReporter errorReporter53 = compilerEnvirons30.getErrorReporter();
        compilerEnvirons28.setErrorReporter(errorReporter53);
        compilerEnvirons23.setErrorReporter(errorReporter53);
        compilerEnvirons12.setErrorReporter(errorReporter53);
        compilerEnvirons0.setErrorReporter(errorReporter53);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(compilerEnvirons12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 170 + "'", int16 == 170);
        org.junit.Assert.assertNotNull(compilerEnvirons23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(errorReporter53);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        int int12 = compilerEnvirons0.getLanguageVersion();
        boolean boolean13 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorReporter14);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setOptimizationLevel((int) (short) -1);
        com.google.javascript.rhino.head.Context context10 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons5.setActivationNames(strSet6);
        boolean boolean8 = compilerEnvirons5.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons5.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = compilerEnvirons10.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        boolean boolean26 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGenerateDebugInfo(false);
        boolean boolean29 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean6 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean7 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        boolean boolean3 = compilerEnvirons0.isRecordingComments();
        boolean boolean4 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean5 = compilerEnvirons0.reportWarningAsError();
        boolean boolean6 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        boolean boolean15 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecoverFromErrors(true);
        int int18 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean11 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet13 = null;
        compilerEnvirons12.setActivationNames(strSet13);
        boolean boolean15 = compilerEnvirons12.isIdeMode();
        int int16 = compilerEnvirons12.getOptimizationLevel();
        compilerEnvirons12.setGeneratingSource(true);
        boolean boolean19 = compilerEnvirons12.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet23);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet23);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet23);
        boolean boolean28 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertNotNull(errorReporter3);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        int int4 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setIdeMode(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons9.setRecordingLocalJsDocComments(true);
        compilerEnvirons9.setStrictMode(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean15 = compilerEnvirons14.isGenerateDebugInfo();
        compilerEnvirons14.setRecordingLocalJsDocComments(false);
        compilerEnvirons14.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet20 = compilerEnvirons14.getActivationNames();
        compilerEnvirons14.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean24 = compilerEnvirons23.reportWarningAsError();
        int int25 = compilerEnvirons23.getOptimizationLevel();
        compilerEnvirons23.setAllowMemberExprAsFunctionName(true);
        boolean boolean28 = compilerEnvirons23.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = compilerEnvirons23.getErrorReporter();
        compilerEnvirons14.setErrorReporter(errorReporter29);
        int int31 = compilerEnvirons14.getOptimizationLevel();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons32 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons32.setRecordingLocalJsDocComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = compilerEnvirons32.getErrorReporter();
        compilerEnvirons14.setErrorReporter(errorReporter35);
        compilerEnvirons9.setErrorReporter(errorReporter35);
        compilerEnvirons0.setErrorReporter(errorReporter35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(compilerEnvirons14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(errorReporter29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(errorReporter35);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        boolean boolean12 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean14 = compilerEnvirons13.isGenerateDebugInfo();
        compilerEnvirons13.setRecordingLocalJsDocComments(false);
        compilerEnvirons13.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet19 = compilerEnvirons13.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet23);
        compilerEnvirons20.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        boolean boolean34 = compilerEnvirons28.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        compilerEnvirons35.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        com.google.javascript.rhino.head.ErrorReporter errorReporter43 = compilerEnvirons20.getErrorReporter();
        compilerEnvirons13.setErrorReporter(errorReporter43);
        compilerEnvirons0.setErrorReporter(errorReporter43);
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean48 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons49 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        compilerEnvirons49.setActivationNames((java.util.Set<java.lang.String>) strSet52);
        boolean boolean55 = compilerEnvirons49.isStrictMode();
        boolean boolean56 = compilerEnvirons49.isXmlAvailable();
        compilerEnvirons49.setGenerateObserverCount(true);
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        compilerEnvirons49.setActivationNames((java.util.Set<java.lang.String>) strSet62);
        compilerEnvirons49.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons49.setRecoverFromErrors(false);
        java.util.Set<java.lang.String> strSet69 = compilerEnvirons49.getActivationNames();
        compilerEnvirons0.setActivationNames(strSet69);
        int int71 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(errorReporter43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(errorReporter4);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons0.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons5.setActivationNames(strSet6);
        boolean boolean8 = compilerEnvirons5.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons5.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons10 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray12 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = compilerEnvirons10.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons10.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        boolean boolean26 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setGenerateDebugInfo(false);
        int int29 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        java.util.Set<java.lang.String> strSet7 = compilerEnvirons0.getActivationNames();
        boolean boolean8 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setAllowSharpComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(errorReporter5);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        int int6 = compilerEnvirons0.getLanguageVersion();
        boolean boolean7 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 170 + "'", int6 == 170);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        int int10 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean13 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean16 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.reportWarningAsError();
        java.lang.Class<?> wildcardClass3 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateDebugInfo(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        compilerEnvirons8.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        boolean boolean22 = compilerEnvirons16.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = compilerEnvirons8.getErrorReporter();
        boolean boolean32 = compilerEnvirons8.reportWarningAsError();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        compilerEnvirons33.setActivationNames((java.util.Set<java.lang.String>) strSet36);
        compilerEnvirons33.setLanguageVersion(0);
        boolean boolean41 = compilerEnvirons33.isAllowMemberExprAsFunctionName();
        int int42 = compilerEnvirons33.getOptimizationLevel();
        boolean boolean43 = compilerEnvirons33.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons44 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        compilerEnvirons44.setActivationNames((java.util.Set<java.lang.String>) strSet47);
        boolean boolean50 = compilerEnvirons44.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons51 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        compilerEnvirons51.setActivationNames((java.util.Set<java.lang.String>) strSet54);
        compilerEnvirons44.setActivationNames((java.util.Set<java.lang.String>) strSet54);
        boolean boolean58 = compilerEnvirons44.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons59 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean60 = compilerEnvirons59.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons61 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet64);
        compilerEnvirons61.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons69 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        compilerEnvirons69.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        boolean boolean75 = compilerEnvirons69.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons76 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray78 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        compilerEnvirons76.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        compilerEnvirons69.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        com.google.javascript.rhino.head.ErrorReporter errorReporter84 = compilerEnvirons61.getErrorReporter();
        compilerEnvirons59.setErrorReporter(errorReporter84);
        compilerEnvirons44.setErrorReporter(errorReporter84);
        compilerEnvirons33.setErrorReporter(errorReporter84);
        compilerEnvirons8.setErrorReporter(errorReporter84);
        compilerEnvirons0.setErrorReporter(errorReporter84);
        boolean boolean90 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        int int93 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setStrictMode(true);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(errorReporter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(errorReporter84);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons9 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean10 = compilerEnvirons9.reportWarningAsError();
        int int11 = compilerEnvirons9.getOptimizationLevel();
        compilerEnvirons9.setAllowMemberExprAsFunctionName(true);
        boolean boolean14 = compilerEnvirons9.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter15 = compilerEnvirons9.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter15);
        compilerEnvirons0.setStrictMode(false);
        boolean boolean19 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(errorReporter15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean16 = compilerEnvirons15.reportWarningAsError();
        int int17 = compilerEnvirons15.getOptimizationLevel();
        compilerEnvirons15.setAllowMemberExprAsFunctionName(true);
        boolean boolean20 = compilerEnvirons15.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter21 = compilerEnvirons15.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter21);
        boolean boolean23 = compilerEnvirons0.isGenerateObserverCount();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(errorReporter21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean13 = compilerEnvirons0.recoverFromErrors();
        boolean boolean14 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet17 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setGenerateDebugInfo(false);
        java.util.Set<java.lang.String> strSet22 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        boolean boolean14 = compilerEnvirons8.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        boolean boolean22 = compilerEnvirons8.isGeneratingSource();
        com.google.javascript.rhino.head.ErrorReporter errorReporter23 = compilerEnvirons8.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter23);
        compilerEnvirons0.setIdeMode(false);
        int int27 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(errorReporter23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        boolean boolean20 = compilerEnvirons0.isGenerateObserverCount();
        int int21 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean22 = compilerEnvirons0.isStrictMode();
        java.util.Set<java.lang.String> strSet23 = compilerEnvirons0.getActivationNames();
        boolean boolean24 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean25 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = compilerEnvirons0.getErrorReporter();
        boolean boolean21 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(errorReporter20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setLanguageVersion(170);
        boolean boolean11 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean12 = compilerEnvirons0.getAllowSharpComments();
        int int13 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean12 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setWarnTrailingComma(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.recoverFromErrors();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        boolean boolean22 = compilerEnvirons16.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        boolean boolean30 = compilerEnvirons16.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean32 = compilerEnvirons31.reportWarningAsError();
        int int33 = compilerEnvirons31.getOptimizationLevel();
        compilerEnvirons31.setAllowMemberExprAsFunctionName(true);
        boolean boolean36 = compilerEnvirons31.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter37 = compilerEnvirons31.getErrorReporter();
        compilerEnvirons16.setErrorReporter(errorReporter37);
        compilerEnvirons0.setErrorReporter(errorReporter37);
        int int40 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean41 = compilerEnvirons0.reportWarningAsError();
        boolean boolean42 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(errorReporter37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean7 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean10 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean15 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setIdeMode(true);
        boolean boolean18 = compilerEnvirons0.isRecordingComments();
        boolean boolean19 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setGeneratingSource(false);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean11 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecordingComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons14 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean15 = compilerEnvirons14.reportWarningAsError();
        int int16 = compilerEnvirons14.getOptimizationLevel();
        compilerEnvirons14.setAllowMemberExprAsFunctionName(true);
        boolean boolean19 = compilerEnvirons14.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean21 = compilerEnvirons20.reportWarningAsError();
        compilerEnvirons20.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter24 = compilerEnvirons20.getErrorReporter();
        compilerEnvirons14.setErrorReporter(errorReporter24);
        compilerEnvirons0.setErrorReporter(errorReporter24);
        boolean boolean27 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(errorReporter24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean3 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingComments(true);
        boolean boolean8 = compilerEnvirons0.isXmlAvailable();
        boolean boolean9 = compilerEnvirons0.isRecordingComments();
        boolean boolean10 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean9 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean5 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setGeneratingSource(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean7 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setGeneratingSource(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.recoverFromErrors();
        boolean boolean8 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean11 = compilerEnvirons0.isStrictMode();
        boolean boolean12 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean13 = compilerEnvirons0.isRecordingLocalJsDocComments();
        boolean boolean14 = compilerEnvirons0.isGeneratingSource();
        boolean boolean15 = compilerEnvirons0.isRecordingLocalJsDocComments();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setAllowSharpComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean17 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean9 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean6 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        boolean boolean10 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setGeneratingSource(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean13 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setXmlAvailable(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        java.util.Set<java.lang.String> strSet4 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setRecordingComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons7.setRecordingLocalJsDocComments(true);
        int int10 = compilerEnvirons7.getLanguageVersion();
        boolean boolean11 = compilerEnvirons7.isRecordingLocalJsDocComments();
        boolean boolean12 = compilerEnvirons7.reportWarningAsError();
        int int13 = compilerEnvirons7.getLanguageVersion();
        boolean boolean14 = compilerEnvirons7.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons15 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet18);
        compilerEnvirons15.setGenerateObserverCount(true);
        compilerEnvirons15.setStrictMode(true);
        compilerEnvirons15.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean28 = compilerEnvirons27.reportWarningAsError();
        compilerEnvirons27.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = compilerEnvirons27.getErrorReporter();
        compilerEnvirons15.setErrorReporter(errorReporter31);
        boolean boolean33 = compilerEnvirons15.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        boolean boolean40 = compilerEnvirons34.isStrictMode();
        boolean boolean41 = compilerEnvirons34.isXmlAvailable();
        compilerEnvirons34.setGenerateObserverCount(true);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet47);
        compilerEnvirons34.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons34.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons54 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        compilerEnvirons54.setActivationNames((java.util.Set<java.lang.String>) strSet57);
        compilerEnvirons54.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons62 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        compilerEnvirons62.setActivationNames((java.util.Set<java.lang.String>) strSet65);
        boolean boolean68 = compilerEnvirons62.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons69 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        compilerEnvirons69.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        compilerEnvirons62.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        compilerEnvirons54.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        compilerEnvirons15.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(errorReporter31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean6 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setAllowSharpComments(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean13 = compilerEnvirons12.reportWarningAsError();
        compilerEnvirons12.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons12.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter16);
        boolean boolean18 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons19.setLanguageVersion(0);
        boolean boolean27 = compilerEnvirons19.isGeneratingSource();
        boolean boolean28 = compilerEnvirons19.isRecordingLocalJsDocComments();
        boolean boolean29 = compilerEnvirons19.isAllowMemberExprAsFunctionName();
        compilerEnvirons19.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compilerEnvirons19.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter32);
        java.lang.Class<?> wildcardClass34 = compilerEnvirons0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorReporter16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(errorReporter32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean11 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        boolean boolean20 = compilerEnvirons0.isGeneratingSource();
        boolean boolean21 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean13 = compilerEnvirons0.isGenerateDebugInfo();
        int int14 = compilerEnvirons0.getOptimizationLevel();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean9 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGeneratingSource(false);
        compilerEnvirons0.setXmlAvailable(false);
        int int14 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setGeneratingSource(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean13 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        boolean boolean12 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = compilerEnvirons0.getErrorReporter();
        boolean boolean14 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean15 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean16 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean11 = compilerEnvirons0.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        boolean boolean18 = compilerEnvirons12.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons19 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray21 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        compilerEnvirons19.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet22);
        boolean boolean26 = compilerEnvirons12.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean28 = compilerEnvirons27.reportWarningAsError();
        int int29 = compilerEnvirons27.getOptimizationLevel();
        compilerEnvirons27.setAllowMemberExprAsFunctionName(true);
        boolean boolean32 = compilerEnvirons27.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter33 = compilerEnvirons27.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter33);
        compilerEnvirons0.setErrorReporter(errorReporter33);
        int int36 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(errorReporter33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 170 + "'", int36 == 170);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateDebugInfo(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        boolean boolean10 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean12 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setOptimizationLevel((-1));
        compilerEnvirons0.setWarnTrailingComma(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setIdeMode(false);
        boolean boolean12 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons13 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean14 = compilerEnvirons13.isGenerateDebugInfo();
        compilerEnvirons13.setRecordingLocalJsDocComments(false);
        compilerEnvirons13.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet19 = compilerEnvirons13.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet23);
        compilerEnvirons20.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        boolean boolean34 = compilerEnvirons28.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons35 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray37 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        compilerEnvirons35.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet38);
        com.google.javascript.rhino.head.ErrorReporter errorReporter43 = compilerEnvirons20.getErrorReporter();
        compilerEnvirons13.setErrorReporter(errorReporter43);
        compilerEnvirons0.setErrorReporter(errorReporter43);
        compilerEnvirons0.setRecordingComments(false);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setRecordingComments(false);
        boolean boolean52 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(errorReporter43);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean4 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        java.lang.Class<?> wildcardClass5 = compilerEnvirons0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean11 = compilerEnvirons0.reportWarningAsError();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean13 = compilerEnvirons12.reportWarningAsError();
        int int14 = compilerEnvirons12.getOptimizationLevel();
        compilerEnvirons12.setAllowMemberExprAsFunctionName(true);
        boolean boolean17 = compilerEnvirons12.getWarnTrailingComma();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons18 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean19 = compilerEnvirons18.reportWarningAsError();
        compilerEnvirons18.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = compilerEnvirons18.getErrorReporter();
        compilerEnvirons12.setErrorReporter(errorReporter22);
        compilerEnvirons0.setErrorReporter(errorReporter22);
        compilerEnvirons0.setGenerateDebugInfo(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(errorReporter22);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setWarnTrailingComma(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        boolean boolean20 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.getWarnTrailingComma();
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.setOptimizationLevel((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Optimization level outside [-1..9]: 35");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setAllowSharpComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter14 = compilerEnvirons0.getErrorReporter();
        boolean boolean15 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        com.google.javascript.rhino.head.Context context18 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(errorReporter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        int int5 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean2 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setWarnTrailingComma(false);
        int int5 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setLanguageVersion(170);
        boolean boolean11 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setRecordingComments(true);
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isRecordingComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons6 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean7 = compilerEnvirons6.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        boolean boolean14 = compilerEnvirons8.isStrictMode();
        boolean boolean15 = compilerEnvirons8.isXmlAvailable();
        compilerEnvirons8.setGenerateObserverCount(true);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet21);
        compilerEnvirons8.setOptimizationLevel((int) (byte) 1);
        compilerEnvirons8.setRecoverFromErrors(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons28 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet31);
        compilerEnvirons28.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet39);
        boolean boolean42 = compilerEnvirons36.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons43 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray45 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        compilerEnvirons43.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons28.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons6.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet46);
        boolean boolean54 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(compilerEnvirons6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        boolean boolean7 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateObserverCount(true);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean7 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setAllowSharpComments(false);
        com.google.javascript.rhino.head.Context context11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(errorReporter8);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setAllowSharpComments(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compilerEnvirons0.getErrorReporter();
        boolean boolean6 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(errorReporter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setGeneratingSource(true);
        boolean boolean20 = compilerEnvirons0.isRecordingComments();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setStrictMode(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        int int4 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(false);
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean9 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 170 + "'", int4 == 170);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setWarnTrailingComma(true);
        boolean boolean20 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int21 = compilerEnvirons0.getLanguageVersion();
        boolean boolean22 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean23 = compilerEnvirons0.getAllowSharpComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setLanguageVersion((int) (byte) 0);
        boolean boolean10 = compilerEnvirons0.isGeneratingSource();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet6 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setAllowSharpComments(false);
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setGenerateObserverCount(true);
        compilerEnvirons0.setStrictMode(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean13 = compilerEnvirons12.reportWarningAsError();
        compilerEnvirons12.setReservedKeywordAsIdentifier(true);
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons12.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter16);
        boolean boolean18 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setOptimizationLevel((int) (short) 1);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorReporter16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        int int3 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean7 = compilerEnvirons0.isGeneratingSource();
        boolean boolean8 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        int int9 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        int int12 = compilerEnvirons0.getLanguageVersion();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(errorReporter4);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean6 = compilerEnvirons5.isGenerateDebugInfo();
        compilerEnvirons5.setRecordingLocalJsDocComments(false);
        compilerEnvirons5.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet11 = compilerEnvirons5.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons12.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray22 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet23);
        boolean boolean26 = compilerEnvirons20.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons27 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        compilerEnvirons27.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons20.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet30);
        com.google.javascript.rhino.head.ErrorReporter errorReporter35 = compilerEnvirons12.getErrorReporter();
        compilerEnvirons5.setErrorReporter(errorReporter35);
        compilerEnvirons0.setErrorReporter(errorReporter35);
        java.lang.Class<?> wildcardClass38 = errorReporter35.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(errorReporter35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean12 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean15 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean2 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet6 = null;
        compilerEnvirons0.setActivationNames(strSet6);
        compilerEnvirons0.setIdeMode(false);
        int int10 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setStrictMode(false);
        boolean boolean13 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        compilerEnvirons0.setRecoverFromErrors(true);
        boolean boolean4 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean5 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateObserverCount(false);
        boolean boolean8 = compilerEnvirons0.isGenerateObserverCount();
        compilerEnvirons0.setIdeMode(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons2 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray4 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        compilerEnvirons2.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet5);
        compilerEnvirons0.setXmlAvailable(false);
        int int11 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecoverFromErrors(true);
        int int14 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGenerateDebugInfo(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons17 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        compilerEnvirons17.setActivationNames((java.util.Set<java.lang.String>) strSet20);
        boolean boolean23 = compilerEnvirons17.isGenerateDebugInfo();
        compilerEnvirons17.setGenerateDebugInfo(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons26 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet27 = null;
        compilerEnvirons26.setActivationNames(strSet27);
        boolean boolean29 = compilerEnvirons26.isIdeMode();
        int int30 = compilerEnvirons26.getOptimizationLevel();
        compilerEnvirons26.setGenerateDebugInfo(false);
        boolean boolean33 = compilerEnvirons26.isGenerateObserverCount();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons34 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        compilerEnvirons34.setActivationNames((java.util.Set<java.lang.String>) strSet37);
        compilerEnvirons34.setLanguageVersion(0);
        boolean boolean42 = compilerEnvirons34.isAllowMemberExprAsFunctionName();
        int int43 = compilerEnvirons34.getOptimizationLevel();
        compilerEnvirons34.setIdeMode(false);
        boolean boolean46 = compilerEnvirons34.isAllowMemberExprAsFunctionName();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons47 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean48 = compilerEnvirons47.isGenerateDebugInfo();
        compilerEnvirons47.setRecordingLocalJsDocComments(false);
        compilerEnvirons47.setReservedKeywordAsIdentifier(false);
        java.util.Set<java.lang.String> strSet53 = compilerEnvirons47.getActivationNames();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons54 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray56 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        compilerEnvirons54.setActivationNames((java.util.Set<java.lang.String>) strSet57);
        compilerEnvirons54.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons62 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        compilerEnvirons62.setActivationNames((java.util.Set<java.lang.String>) strSet65);
        boolean boolean68 = compilerEnvirons62.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons69 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        compilerEnvirons69.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        compilerEnvirons62.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        compilerEnvirons54.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        com.google.javascript.rhino.head.ErrorReporter errorReporter77 = compilerEnvirons54.getErrorReporter();
        compilerEnvirons47.setErrorReporter(errorReporter77);
        compilerEnvirons34.setErrorReporter(errorReporter77);
        compilerEnvirons26.setErrorReporter(errorReporter77);
        compilerEnvirons17.setErrorReporter(errorReporter77);
        compilerEnvirons0.setErrorReporter(errorReporter77);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(strSet53);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(errorReporter77);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        int int2 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setGeneratingSource(true);
        compilerEnvirons0.setReservedKeywordAsIdentifier(true);
        compilerEnvirons0.setStrictMode(false);
        int int9 = compilerEnvirons0.getLanguageVersion();
        boolean boolean10 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.isStrictMode();
        com.google.javascript.rhino.head.ErrorReporter errorReporter16 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorReporter16);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setWarnTrailingComma(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons20 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean21 = compilerEnvirons20.reportWarningAsError();
        boolean boolean22 = compilerEnvirons20.isRecordingComments();
        boolean boolean23 = compilerEnvirons20.isXmlAvailable();
        boolean boolean24 = compilerEnvirons20.isGenerateObserverCount();
        compilerEnvirons20.setRecordingComments(false);
        compilerEnvirons20.setGeneratingSource(true);
        boolean boolean29 = compilerEnvirons20.isAllowMemberExprAsFunctionName();
        compilerEnvirons20.setOptimizationLevel((int) (short) 0);
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compilerEnvirons20.getErrorReporter();
        compilerEnvirons0.setErrorReporter(errorReporter32);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(compilerEnvirons20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(errorReporter32);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isStrictMode();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        boolean boolean8 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        boolean boolean9 = compilerEnvirons0.getWarnTrailingComma();
        int int10 = compilerEnvirons0.getLanguageVersion();
        boolean boolean11 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 170 + "'", int10 == 170);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.recoverFromErrors();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        boolean boolean22 = compilerEnvirons16.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        boolean boolean30 = compilerEnvirons16.isGeneratingSource();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons31 = new com.google.javascript.rhino.head.CompilerEnvirons();
        boolean boolean32 = compilerEnvirons31.reportWarningAsError();
        int int33 = compilerEnvirons31.getOptimizationLevel();
        compilerEnvirons31.setAllowMemberExprAsFunctionName(true);
        boolean boolean36 = compilerEnvirons31.getWarnTrailingComma();
        com.google.javascript.rhino.head.ErrorReporter errorReporter37 = compilerEnvirons31.getErrorReporter();
        compilerEnvirons16.setErrorReporter(errorReporter37);
        compilerEnvirons0.setErrorReporter(errorReporter37);
        int int40 = compilerEnvirons0.getOptimizationLevel();
        int int41 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean42 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean43 = compilerEnvirons0.isGenerateDebugInfo();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(errorReporter37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setXmlAvailable(false);
        compilerEnvirons0.setGeneratingSource(true);
        java.util.Set<java.lang.String> strSet20 = compilerEnvirons0.getActivationNames();
        compilerEnvirons0.setStrictMode(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        boolean boolean20 = compilerEnvirons0.isGenerateObserverCount();
        int int21 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setXmlAvailable(true);
        boolean boolean24 = compilerEnvirons0.isStrictMode();
        boolean boolean25 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean26 = compilerEnvirons0.isGenerateObserverCount();
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(errorReporter27);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        compilerEnvirons0.setRecoverFromErrors(true);
        compilerEnvirons0.setIdeMode(false);
        com.google.javascript.rhino.head.Context context8 = null;
        // The following exception was thrown during execution in test generation
        try {
            compilerEnvirons0.initFromContext(context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons5 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = compilerEnvirons5.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons12 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray14 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        compilerEnvirons12.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons5.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet15);
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setOptimizationLevel((int) (short) 1);
        boolean boolean23 = compilerEnvirons0.isIdeMode();
        int int24 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean25 = compilerEnvirons0.isIdeMode();
        java.util.Set<java.lang.String> strSet26 = compilerEnvirons0.getActivationNames();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(errorReporter20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        compilerEnvirons0.setLanguageVersion(0);
        boolean boolean8 = compilerEnvirons0.isGeneratingSource();
        boolean boolean9 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setLanguageVersion(0);
        compilerEnvirons0.setXmlAvailable(true);
        java.util.Set<java.lang.String> strSet14 = compilerEnvirons0.getActivationNames();
        boolean boolean15 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setWarnTrailingComma(true);
        compilerEnvirons0.setOptimizationLevel((int) (byte) -1);
        compilerEnvirons0.setStrictMode(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isStrictMode();
        boolean boolean7 = compilerEnvirons0.isXmlAvailable();
        compilerEnvirons0.setGenerateObserverCount(true);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet13);
        compilerEnvirons0.setOptimizationLevel((int) (byte) 1);
        boolean boolean18 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setStrictMode(false);
        compilerEnvirons0.setAllowSharpComments(true);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean18 = compilerEnvirons0.getWarnTrailingComma();
        int int19 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGenerateDebugInfo(true);
        boolean boolean22 = compilerEnvirons0.getWarnTrailingComma();
        compilerEnvirons0.setIdeMode(false);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        compilerEnvirons0.setXmlAvailable(false);
        boolean boolean18 = compilerEnvirons0.isRecordingComments();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        compilerEnvirons0.setStrictMode(false);
        int int17 = compilerEnvirons0.getLanguageVersion();
        boolean boolean18 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setWarnTrailingComma(false);
        boolean boolean21 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter7 = compilerEnvirons0.getErrorReporter();
        compilerEnvirons0.setLanguageVersion(0);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorReporter7);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons0.setRecordingLocalJsDocComments(true);
        compilerEnvirons0.setStrictMode(true);
        boolean boolean5 = compilerEnvirons0.isIdeMode();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean8 = compilerEnvirons0.recoverFromErrors();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        compilerEnvirons0.setOptimizationLevel((int) (byte) -1);
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowMemberExprAsFunctionName(true);
        boolean boolean17 = compilerEnvirons0.isRecordingComments();
        boolean boolean18 = compilerEnvirons0.isXmlAvailable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getLanguageVersion();
        boolean boolean4 = compilerEnvirons0.reportWarningAsError();
        compilerEnvirons0.setAllowMemberExprAsFunctionName(false);
        int int7 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setAllowSharpComments(true);
        compilerEnvirons0.setRecoverFromErrors(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 170 + "'", int7 == 170);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        compilerEnvirons0.setRecoverFromErrors(false);
        boolean boolean3 = compilerEnvirons0.isRecordingLocalJsDocComments();
        com.google.javascript.rhino.head.ErrorReporter errorReporter4 = compilerEnvirons0.getErrorReporter();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(errorReporter4);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        boolean boolean9 = compilerEnvirons0.isRecordingComments();
        boolean boolean10 = compilerEnvirons0.recoverFromErrors();
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        compilerEnvirons0.setIdeMode(false);
        compilerEnvirons0.setGenerateDebugInfo(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateDebugInfo(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons8 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray10 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet11);
        compilerEnvirons8.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons16 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet19);
        boolean boolean22 = compilerEnvirons16.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons23 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        compilerEnvirons23.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons16.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        compilerEnvirons8.setActivationNames((java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.rhino.head.ErrorReporter errorReporter31 = compilerEnvirons8.getErrorReporter();
        boolean boolean32 = compilerEnvirons8.reportWarningAsError();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons33 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray35 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        compilerEnvirons33.setActivationNames((java.util.Set<java.lang.String>) strSet36);
        compilerEnvirons33.setLanguageVersion(0);
        boolean boolean41 = compilerEnvirons33.isAllowMemberExprAsFunctionName();
        int int42 = compilerEnvirons33.getOptimizationLevel();
        boolean boolean43 = compilerEnvirons33.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons44 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        compilerEnvirons44.setActivationNames((java.util.Set<java.lang.String>) strSet47);
        boolean boolean50 = compilerEnvirons44.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons51 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        compilerEnvirons51.setActivationNames((java.util.Set<java.lang.String>) strSet54);
        compilerEnvirons44.setActivationNames((java.util.Set<java.lang.String>) strSet54);
        boolean boolean58 = compilerEnvirons44.isStrictMode();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons59 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean60 = compilerEnvirons59.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons61 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet64);
        compilerEnvirons61.setGenerateObserverCount(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons69 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        compilerEnvirons69.setActivationNames((java.util.Set<java.lang.String>) strSet72);
        boolean boolean75 = compilerEnvirons69.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons76 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray78 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        compilerEnvirons76.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        compilerEnvirons69.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        compilerEnvirons61.setActivationNames((java.util.Set<java.lang.String>) strSet79);
        com.google.javascript.rhino.head.ErrorReporter errorReporter84 = compilerEnvirons61.getErrorReporter();
        compilerEnvirons59.setErrorReporter(errorReporter84);
        compilerEnvirons44.setErrorReporter(errorReporter84);
        compilerEnvirons33.setErrorReporter(errorReporter84);
        compilerEnvirons8.setErrorReporter(errorReporter84);
        compilerEnvirons0.setErrorReporter(errorReporter84);
        boolean boolean90 = compilerEnvirons0.getWarnTrailingComma();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(errorReporter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(compilerEnvirons59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(errorReporter84);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = com.google.javascript.rhino.head.CompilerEnvirons.ideEnvirons();
        boolean boolean1 = compilerEnvirons0.reportWarningAsError();
        boolean boolean2 = compilerEnvirons0.isRecordingComments();
        int int3 = compilerEnvirons0.getOptimizationLevel();
        boolean boolean4 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecordingLocalJsDocComments(false);
        compilerEnvirons0.setOptimizationLevel((-1));
        compilerEnvirons0.setGenerateObserverCount(false);
        int int11 = compilerEnvirons0.getLanguageVersion();
        boolean boolean12 = compilerEnvirons0.isRecordingLocalJsDocComments();
        compilerEnvirons0.setGenerateObserverCount(false);
        org.junit.Assert.assertNotNull(compilerEnvirons0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 170 + "'", int11 == 170);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        boolean boolean3 = compilerEnvirons0.isAllowMemberExprAsFunctionName();
        boolean boolean4 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean5 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(false);
        compilerEnvirons0.setAllowSharpComments(true);
        boolean boolean10 = compilerEnvirons0.isStrictMode();
        boolean boolean11 = compilerEnvirons0.isGeneratingSource();
        int int12 = compilerEnvirons0.getLanguageVersion();
        compilerEnvirons0.setGeneratingSource(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.util.Set<java.lang.String> strSet1 = null;
        compilerEnvirons0.setActivationNames(strSet1);
        java.util.Set<java.lang.String> strSet3 = compilerEnvirons0.getActivationNames();
        boolean boolean4 = compilerEnvirons0.isGenerateObserverCount();
        boolean boolean5 = compilerEnvirons0.isGeneratingSource();
        compilerEnvirons0.setGenerateDebugInfo(false);
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = compilerEnvirons0.getErrorReporter();
        boolean boolean9 = compilerEnvirons0.getAllowSharpComments();
        boolean boolean10 = compilerEnvirons0.isRecordingComments();
        boolean boolean11 = compilerEnvirons0.isIdeMode();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(errorReporter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons0 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet3);
        boolean boolean6 = compilerEnvirons0.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons7 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        compilerEnvirons7.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet10);
        boolean boolean14 = compilerEnvirons0.isReservedKeywordAsIdentifier();
        boolean boolean15 = compilerEnvirons0.recoverFromErrors();
        boolean boolean16 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setGenerateObserverCount(true);
        boolean boolean19 = compilerEnvirons0.isGenerateDebugInfo();
        boolean boolean20 = compilerEnvirons0.isGenerateDebugInfo();
        compilerEnvirons0.setRecoverFromErrors(false);
        compilerEnvirons0.setGenerateObserverCount(false);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons25 = new com.google.javascript.rhino.head.CompilerEnvirons();
        compilerEnvirons25.setRecordingLocalJsDocComments(true);
        compilerEnvirons25.setStrictMode(true);
        compilerEnvirons25.setAllowSharpComments(true);
        boolean boolean32 = compilerEnvirons25.getWarnTrailingComma();
        boolean boolean33 = compilerEnvirons25.getWarnTrailingComma();
        compilerEnvirons25.setAllowSharpComments(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons36 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet39);
        boolean boolean42 = compilerEnvirons36.isGenerateDebugInfo();
        compilerEnvirons36.setGenerateDebugInfo(true);
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons45 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        compilerEnvirons45.setActivationNames((java.util.Set<java.lang.String>) strSet48);
        boolean boolean51 = compilerEnvirons45.isGenerateDebugInfo();
        com.google.javascript.rhino.head.CompilerEnvirons compilerEnvirons52 = new com.google.javascript.rhino.head.CompilerEnvirons();
        java.lang.String[] strArray54 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        compilerEnvirons52.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        compilerEnvirons45.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        compilerEnvirons36.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        compilerEnvirons25.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        compilerEnvirons0.setActivationNames((java.util.Set<java.lang.String>) strSet55);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }
}

