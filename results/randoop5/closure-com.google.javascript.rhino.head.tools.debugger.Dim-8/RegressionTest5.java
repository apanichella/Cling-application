import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        java.lang.String str16 = dim13.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim13.setScopeProvider(scopeProvider17);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim13.functionSourceByName("undefined");
        dim13.clearAllBreakpoints();
        dim13.go();
        dim13.setReturnValue((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource26 = dim13.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim dim27 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim27.setBreak();
        java.lang.String str30 = dim27.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider31 = null;
        dim27.setScopeProvider(scopeProvider31);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource34 = dim27.functionSourceByName("undefined");
        dim27.clearAllBreakpoints();
        java.lang.String[] strArray36 = dim27.functionNames();
        dim27.setBreakOnEnter(false);
        dim27.clearAllBreakpoints();
        java.lang.String[] strArray40 = dim27.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo42 = dim27.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo44 = dim27.sourceInfo("undefined");
        dim27.dispose();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback46 = null;
        dim27.setGuiCallback(guiCallback46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = dim0.getObjectProperty((java.lang.Object) dim13, (java.lang.Object) guiCallback46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(functionSource20);
        org.junit.Assert.assertNull(functionSource26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "undefined" + "'", str30, "undefined");
        org.junit.Assert.assertNull(functionSource34);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNull(sourceInfo42);
        org.junit.Assert.assertNull(sourceInfo44);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        dim0.dispose();
        dim0.detach();
        dim0.go();
        java.lang.String str18 = dim0.eval("");
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.setReturnValue(2);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue(10);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        java.lang.String str17 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        java.lang.String str21 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim18.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback24 = null;
        dim18.setGuiCallback(guiCallback24);
        dim18.contextSwitch((int) '4');
        dim18.dispose();
        dim18.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider31 = null;
        dim18.setSourceProvider(sourceProvider31);
        com.google.javascript.rhino.head.tools.debugger.Dim dim33 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim33.setBreak();
        java.lang.String str36 = dim33.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider37 = null;
        dim33.setScopeProvider(scopeProvider37);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback39 = null;
        dim33.setGuiCallback(guiCallback39);
        dim33.contextSwitch((int) '4');
        dim33.dispose();
        dim33.setReturnValue((int) (byte) 1);
        dim33.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData47 = dim33.currentContextData();
        dim33.dispose();
        dim33.detach();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = dim0.getObjectProperty((java.lang.Object) sourceProvider31, (java.lang.Object) dim33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNull(functionSource13);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "undefined" + "'", str36, "undefined");
        org.junit.Assert.assertNull(contextData47);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        dim0.contextSwitch(2);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("undefined");
        dim0.detach();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource23 = dim0.functionSourceByName("");
        java.lang.String[] strArray24 = dim0.functionNames();
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.ContextFactory contextFactory29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        java.lang.String str12 = dim0.eval("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim20 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim20.setBreak();
        java.lang.String str23 = dim20.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim20.setScopeProvider(scopeProvider24);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource27 = dim20.functionSourceByName("undefined");
        dim20.clearAllBreakpoints();
        dim20.setBreakOnExceptions(false);
        dim20.dispose();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider32 = null;
        dim20.setScopeProvider(scopeProvider32);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider34 = null;
        dim20.setScopeProvider(scopeProvider34);
        java.lang.String str37 = dim20.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim dim38 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim38.setBreak();
        dim38.contextSwitch((int) (byte) 0);
        dim38.clearAllBreakpoints();
        dim38.detach();
        dim38.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider46 = null;
        dim38.setScopeProvider(scopeProvider46);
        dim38.dispose();
        dim38.contextSwitch(10);
        dim38.go();
        dim38.setBreakOnExceptions(false);
        java.lang.String str55 = dim38.eval("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj56 = dim0.getObjectProperty((java.lang.Object) "", (java.lang.Object) dim38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "undefined" + "'", str23, "undefined");
        org.junit.Assert.assertNull(functionSource27);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "undefined" + "'", str37, "undefined");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "undefined" + "'", str55, "undefined");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.setReturnValue((-1));
        java.lang.String[] strArray11 = dim0.functionNames();
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue((int) 'a');
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        dim0.detach();
        java.lang.Class<?> wildcardClass13 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        dim0.contextSwitch(5);
        dim0.go();
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.detach();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        java.lang.String str14 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        dim0.setBreakOnExceptions(false);
        dim0.setBreak();
        dim0.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        dim0.setReturnValue((int) (byte) 10);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setReturnValue(5);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        com.google.javascript.rhino.head.tools.debugger.Dim dim16 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim16.setBreak();
        java.lang.String str19 = dim16.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim16.setScopeProvider(scopeProvider20);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource23 = dim16.functionSourceByName("undefined");
        dim16.clearAllBreakpoints();
        dim16.go();
        java.lang.String str27 = dim16.eval("hi!");
        dim16.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider29 = null;
        dim16.setSourceProvider(sourceProvider29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = dim0.objectToString((java.lang.Object) sourceProvider29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(functionSource23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "undefined" + "'", str27, "undefined");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        java.lang.String str14 = dim0.eval("");
        dim0.setBreak();
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("hi!");
        dim0.dispose();
        dim0.setBreak();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertNull(contextData22);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        dim0.setBreakOnReturn(false);
        java.lang.String[] strArray15 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        java.lang.String[] strArray17 = dim0.functionNames();
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        dim0.contextSwitch(3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(3);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.go();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo7 = dim0.sourceInfo("hi!");
        dim0.setBreak();
        dim0.contextSwitch((int) (short) -1);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("");
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(sourceInfo7);
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        dim0.contextSwitch(10);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (byte) -1);
        java.lang.String[] strArray19 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        java.lang.String str13 = dim0.eval("hi!");
        java.lang.String[] strArray14 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        dim0.setReturnValue((int) (short) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(contextData19);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(functionSource14);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.contextSwitch(10);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        dim0.setReturnValue((int) (byte) 1);
        java.lang.String str14 = dim0.eval("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnExceptions(false);
        java.lang.String str21 = dim0.eval("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(3);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) ' ');
        dim18.setBreakOnEnter(true);
        java.lang.String str25 = dim18.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim dim26 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim26.setBreak();
        dim26.contextSwitch((int) (byte) 0);
        dim26.clearAllBreakpoints();
        dim26.detach();
        dim26.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider34 = null;
        dim26.setScopeProvider(scopeProvider34);
        dim26.dispose();
        dim26.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = dim0.getObjectProperty((java.lang.Object) str25, (java.lang.Object) dim26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "undefined" + "'", str25, "undefined");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String str11 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource4 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(functionSource4);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider9 = null;
        dim0.setScopeProvider(scopeProvider9);
        dim0.contextSwitch(0);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.detach();
        dim0.setReturnValue(2);
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        java.lang.String str15 = dim0.eval("hi!");
        dim0.setBreak();
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        dim0.setBreak();
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.ContextFactory contextFactory18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        dim0.setReturnValue((int) (byte) 10);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        dim0.contextSwitch((int) (short) -1);
        dim0.detach();
        dim0.setReturnValue((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData25 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(contextData25);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        java.lang.String str13 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        dim0.setReturnValue(0);
        dim0.contextSwitch(5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("hi!");
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        java.lang.String str12 = dim0.eval("hi!");
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.go();
        dim0.go();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        dim0.dispose();
        com.google.javascript.rhino.head.ContextFactory contextFactory14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.setBreak();
        dim0.setReturnValue((int) (short) 1);
        java.lang.String str16 = dim0.eval("");
        java.lang.String str18 = dim0.eval("");
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(true);
        dim0.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        dim0.go();
        dim0.setReturnValue(10);
        java.lang.String[] strArray13 = dim0.functionNames();
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        dim0.setReturnValue((int) (byte) 1);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (byte) 1);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        java.lang.String[] strArray18 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(contextData19);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        java.lang.String str12 = dim0.eval("hi!");
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.go();
        java.lang.String str18 = dim0.eval("");
        dim0.setBreakOnReturn(true);
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        dim0.dispose();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        java.lang.String str24 = dim21.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim21.setScopeProvider(scopeProvider25);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback27 = null;
        dim21.setGuiCallback(guiCallback27);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback29 = null;
        dim21.setGuiCallback(guiCallback29);
        dim21.setBreak();
        dim21.setBreakOnEnter(true);
        dim21.contextSwitch((int) '4');
        dim21.setBreakOnExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray38 = dim0.getObjectIds((java.lang.Object) dim21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        java.lang.String str14 = dim0.eval("undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.go();
        dim0.dispose();
        java.lang.String[] strArray12 = dim0.functionNames();
        java.lang.String[] strArray13 = dim0.functionNames();
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        java.lang.String str12 = dim0.eval("hi!");
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.go();
        java.lang.String str18 = dim0.eval("");
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        java.lang.String str24 = dim21.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider25 = null;
        dim21.setScopeProvider(scopeProvider25);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource28 = dim21.functionSourceByName("undefined");
        dim21.clearAllBreakpoints();
        dim21.go();
        java.lang.String str32 = dim21.eval("hi!");
        dim21.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider34 = null;
        dim21.setSourceProvider(sourceProvider34);
        dim21.setBreakOnExceptions(true);
        dim21.go();
        dim21.setReturnValue((int) (short) 1);
        dim21.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo44 = dim21.sourceInfo("undefined");
        dim21.contextSwitch((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = dim0.objectToString((java.lang.Object) dim21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
        org.junit.Assert.assertNull(functionSource28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "undefined" + "'", str32, "undefined");
        org.junit.Assert.assertNull(sourceInfo44);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        dim0.dispose();
        dim0.detach();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("hi!");
        dim0.setBreakOnReturn(true);
        java.lang.String[] strArray20 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        dim0.setBreakOnExceptions(true);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        java.lang.String str21 = dim0.eval("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "undefined" + "'", str21, "undefined");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreak();
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim8 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim8.setBreak();
        java.lang.String str11 = dim8.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim8.setScopeProvider(scopeProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim8.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim8.sourceInfo("undefined");
        dim8.dispose();
        dim8.clearAllBreakpoints();
        dim8.setBreakOnExceptions(true);
        dim8.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim8.setScopeProvider(scopeProvider24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dim0.objectToString((java.lang.Object) dim8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(true);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.clearAllBreakpoints();
        dim13.dispose();
        dim13.setBreakOnReturn(false);
        dim13.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource23 = dim13.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim13.functionSourceByName("");
        dim13.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback27 = null;
        dim13.setGuiCallback(guiCallback27);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource30 = dim13.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim dim31 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim31.setBreak();
        dim31.contextSwitch((int) (byte) 0);
        dim31.clearAllBreakpoints();
        dim31.dispose();
        dim31.setBreakOnReturn(false);
        dim31.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource41 = dim31.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource43 = dim31.functionSourceByName("");
        java.lang.String str45 = dim31.eval("");
        dim31.contextSwitch(4);
        dim31.setBreakOnEnter(false);
        dim31.setReturnValue((int) '4');
        dim31.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = dim0.getObjectProperty((java.lang.Object) dim13, (java.lang.Object) dim31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource23);
        org.junit.Assert.assertNull(functionSource25);
        org.junit.Assert.assertNull(functionSource30);
        org.junit.Assert.assertNull(functionSource41);
        org.junit.Assert.assertNull(functionSource43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "undefined" + "'", str45, "undefined");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource16 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource8);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertNull(functionSource16);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = functionSource12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData7);
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.detach();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray8 = dim0.functionNames();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(true);
        dim0.contextSwitch((int) (short) -1);
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        dim0.setReturnValue((int) (byte) 10);
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnReturn(false);
        dim0.dispose();
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.detach();
        dim0.setReturnValue(2);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource13 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(functionSource13);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData7 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(true);
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        java.lang.String str16 = dim13.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim13.setScopeProvider(scopeProvider17);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim13.functionSourceByName("undefined");
        dim13.clearAllBreakpoints();
        dim13.go();
        dim13.setReturnValue((int) (short) 1);
        dim13.setBreakOnReturn(false);
        dim13.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData28 = dim13.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider29 = null;
        dim13.setScopeProvider(scopeProvider29);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData31 = dim13.currentContextData();
        dim13.setBreakOnEnter(true);
        dim13.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = dim0.objectToString((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(functionSource20);
        org.junit.Assert.assertNull(contextData28);
        org.junit.Assert.assertNull(contextData31);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        dim0.setBreakOnReturn(true);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.ContextFactory contextFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setReturnValue(100);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.ContextFactory contextFactory12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.setBreakOnReturn(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        java.lang.String str11 = dim0.eval("undefined");
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.contextSwitch((int) 'a');
        java.lang.String str15 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim0.setScopeProvider(scopeProvider20);
        dim0.go();
        dim0.setBreak();
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        java.lang.String str19 = dim0.eval("");
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData22 = dim0.currentContextData();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertNull(contextData22);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("");
        java.lang.String str14 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        java.lang.String str18 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertNull(functionSource10);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "undefined" + "'", str18, "undefined");
        org.junit.Assert.assertNull(sourceInfo20);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.detach();
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        dim0.setReturnValue(3);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) (byte) 0);
        dim12.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim12.setScopeProvider(scopeProvider18);
        dim12.setBreak();
        dim12.setReturnValue(4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim12.setGuiCallback(guiCallback23);
        dim12.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider27 = null;
        dim12.setScopeProvider(scopeProvider27);
        dim12.contextSwitch((int) (short) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim31 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim31.setBreak();
        dim31.contextSwitch((int) (byte) 0);
        dim31.clearAllBreakpoints();
        dim31.detach();
        dim31.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider39 = null;
        dim31.setScopeProvider(scopeProvider39);
        dim31.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider43 = null;
        dim31.setSourceProvider(sourceProvider43);
        dim31.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider46 = null;
        dim31.setSourceProvider(sourceProvider46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = dim0.getObjectProperty((java.lang.Object) (short) -1, (java.lang.Object) dim31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.go();
        dim0.setBreakOnExceptions(true);
        dim0.setBreak();
        dim0.setBreakOnEnter(false);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (byte) -1);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.contextSwitch(1);
        dim0.setBreakOnEnter(false);
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.detach();
        dim0.setReturnValue((int) (byte) 100);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("undefined");
        dim0.clearAllBreakpoints();
        dim0.setReturnValue(3);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("undefined");
        dim0.contextSwitch(5);
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.detach();
        dim0.setReturnValue((int) 'a');
        dim0.setBreakOnReturn(true);
        dim0.setReturnValue((int) '#');
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        dim0.setBreak();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(0);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        dim0.dispose();
        dim0.detach();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim0.setGuiCallback(guiCallback20);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback22 = null;
        dim0.setGuiCallback(guiCallback22);
        dim0.go();
        dim0.setBreakOnReturn(false);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData10);
        org.junit.Assert.assertNull(sourceInfo13);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.contextSwitch(5);
        com.google.javascript.rhino.head.ContextFactory contextFactory18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String str11 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray15 = dim14.functionNames();
        dim14.contextSwitch((int) '#');
        com.google.javascript.rhino.head.tools.debugger.Dim dim18 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim18.setBreak();
        dim18.contextSwitch((int) ' ');
        dim18.go();
        dim18.setBreak();
        dim18.dispose();
        dim18.dispose();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = dim0.getObjectProperty((java.lang.Object) '#', (java.lang.Object) dim18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.contextSwitch(10);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        java.lang.String[] strArray15 = dim0.functionNames();
        java.lang.Class<?> wildcardClass16 = dim0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnEnter(true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.detach();
        java.lang.String[] strArray15 = dim0.functionNames();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource14 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider15 = null;
        dim0.setSourceProvider(sourceProvider15);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource20 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(functionSource14);
        org.junit.Assert.assertNull(functionSource18);
        org.junit.Assert.assertNull(functionSource20);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnExceptions(true);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String str11 = dim0.eval("hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        dim0.contextSwitch(100);
        dim0.clearAllBreakpoints();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider20 = null;
        dim0.setScopeProvider(scopeProvider20);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        dim0.setReturnValue(4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider15 = null;
        dim0.setScopeProvider(scopeProvider15);
        dim0.contextSwitch((int) (short) -1);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertNull(functionSource22);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData5 = dim0.currentContextData();
        dim0.setBreak();
        java.lang.String str8 = dim0.eval("hi!");
        dim0.clearAllBreakpoints();
        dim0.contextSwitch((int) (short) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) ' ');
        dim12.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider17 = null;
        dim12.setSourceProvider(sourceProvider17);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo20 = dim12.sourceInfo("");
        dim12.setBreakOnReturn(false);
        dim12.setBreak();
        dim12.clearAllBreakpoints();
        dim12.setBreakOnEnter(true);
        java.lang.Class<?> wildcardClass27 = dim12.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dim0.objectToString((java.lang.Object) dim12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(contextData5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertNull(sourceInfo20);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray13 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback19 = null;
        dim0.setGuiCallback(guiCallback19);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider21 = null;
        dim0.setSourceProvider(sourceProvider21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo17);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.setBreak();
        dim0.setReturnValue((int) (short) 1);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim0.setScopeProvider(scopeProvider21);
        dim0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("undefined", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.setBreakOnEnter(true);
        dim0.dispose();
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback9 = null;
        dim0.setGuiCallback(guiCallback9);
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        java.lang.String str14 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim0.setScopeProvider(scopeProvider14);
        java.lang.String str17 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData18 = dim0.currentContextData();
        java.lang.String str20 = dim0.eval("undefined");
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("undefined", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(contextData18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider13 = null;
        dim0.setScopeProvider(scopeProvider13);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo16 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(sourceInfo16);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame7 = contextData0.getFrame((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -98 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnReturn(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo23 = dim0.sourceInfo("");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback24 = null;
        dim0.setGuiCallback(guiCallback24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertNull(sourceInfo23);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.detach();
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        java.lang.String str16 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        java.lang.String[] strArray19 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider21 = null;
        dim0.setSourceProvider(sourceProvider21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnExceptions(true);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim0.setScopeProvider(scopeProvider21);
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        java.lang.String[] strArray9 = dim0.functionNames();
        dim0.setReturnValue(100);
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        dim0.dispose();
        dim0.detach();
        java.lang.String str17 = dim0.eval("");
        dim0.setBreakOnExceptions(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider9 = null;
        dim0.setSourceProvider(sourceProvider9);
        dim0.setBreak();
        dim0.detach();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData8);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnEnter(true);
        java.lang.String str17 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback18 = null;
        dim0.setGuiCallback(guiCallback18);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource23 = dim0.functionSourceByName("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(functionSource23);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.ContextFactory contextFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        dim0.setBreakOnReturn(true);
        dim0.detach();
        java.lang.String str16 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData19 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider20 = null;
        dim0.setSourceProvider(sourceProvider20);
        com.google.javascript.rhino.head.tools.debugger.Dim dim22 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim22.setBreak();
        dim22.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim22.setScopeProvider(scopeProvider26);
        dim22.dispose();
        dim22.setReturnValue(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray31 = dim0.getObjectIds((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNull(contextData19);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) 10);
        java.lang.String str12 = dim0.eval("hi!");
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.setBreakOnEnter(false);
        dim0.setBreakOnEnter(true);
        dim0.dispose();
        dim0.setBreakOnReturn(true);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider24 = null;
        dim0.setScopeProvider(scopeProvider24);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback14 = null;
        dim0.setGuiCallback(guiCallback14);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo18 = dim0.sourceInfo("");
        dim0.detach();
        dim0.contextSwitch((int) '4');
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(sourceInfo18);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.detach();
        dim0.setReturnValue(100);
        dim0.setReturnValue((-1));
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray17 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame7 = contextData0.getFrame((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: 0 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback8 = null;
        dim0.setGuiCallback(guiCallback8);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        java.lang.String[] strArray14 = dim0.functionNames();
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        dim0.setReturnValue(10);
        java.lang.String str16 = dim0.eval("hi!");
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        dim0.contextSwitch(100);
        java.lang.String[] strArray18 = dim0.functionNames();
        java.lang.String str20 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim0.setScopeProvider(scopeProvider21);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreakOnEnter(true);
        dim0.dispose();
        java.lang.String[] strArray11 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.dispose();
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.detach();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(true);
        dim0.go();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        dim0.contextSwitch(10);
        dim0.go();
        dim0.setBreakOnExceptions(false);
        java.lang.String str17 = dim0.eval("hi!");
        dim0.setReturnValue((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData20 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(contextData20);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) 1);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        java.lang.String str13 = dim0.eval("hi!");
        dim0.go();
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnExceptions(true);
        java.lang.String str20 = dim0.eval("undefined");
        com.google.javascript.rhino.head.ContextFactory contextFactory21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        java.lang.String str11 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        java.lang.String[] strArray14 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData15 = dim0.currentContextData();
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(contextData15);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnExceptions(true);
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        dim0.detach();
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource9);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnExceptions(false);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("hi!");
        dim0.setBreakOnEnter(true);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNull(sourceInfo11);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnExceptions(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        java.lang.String[] strArray6 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider12 = null;
        dim0.setScopeProvider(scopeProvider12);
        dim0.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim0.currentContextData();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData16);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.detach();
        dim0.clearAllBreakpoints();
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        java.lang.String[] strArray10 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(functionSource12);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        dim0.go();
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.contextSwitch(100);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.go();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertNull(functionSource17);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        int int7 = contextData0.frameCount();
        int int8 = contextData0.frameCount();
        int int9 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame11 = contextData0.getFrame(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -4 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider2 = null;
        dim0.setSourceProvider(sourceProvider2);
        dim0.detach();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = dim0.stringIsCompilableUnit("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.detach();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        // The following exception was thrown during execution in test generation
        try {
            dim0.compileScript("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.setBreak();
        dim0.go();
        dim0.contextSwitch((-1));
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("hi!");
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setReturnValue((int) 'a');
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) ' ');
        dim12.go();
        dim12.setBreakOnReturn(true);
        dim12.contextSwitch(4);
        dim12.go();
        java.lang.String[] strArray22 = dim12.functionNames();
        dim12.contextSwitch((int) (byte) 10);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource26 = dim12.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback27 = null;
        dim12.setGuiCallback(guiCallback27);
        dim12.setBreakOnReturn(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray31 = dim0.getObjectIds((java.lang.Object) dim12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(functionSource26);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider8 = null;
        dim0.setSourceProvider(sourceProvider8);
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim dim14 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim14.setBreak();
        java.lang.String str17 = dim14.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim14.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback20 = null;
        dim14.setGuiCallback(guiCallback20);
        dim14.contextSwitch((int) '4');
        dim14.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo26 = dim14.sourceInfo("undefined");
        dim14.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim28 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim28.setBreak();
        dim28.contextSwitch((int) (byte) 0);
        dim28.clearAllBreakpoints();
        dim28.dispose();
        dim28.setBreakOnReturn(false);
        dim28.clearAllBreakpoints();
        dim28.setReturnValue((int) (short) 10);
        java.lang.String str40 = dim28.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData41 = dim28.currentContextData();
        dim28.dispose();
        dim28.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource46 = dim28.functionSourceByName("undefined");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = dim0.getObjectProperty((java.lang.Object) dim14, (java.lang.Object) "undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertNull(sourceInfo26);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "undefined" + "'", str40, "undefined");
        org.junit.Assert.assertNull(contextData41);
        org.junit.Assert.assertNull(functionSource46);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        java.lang.String str13 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(contextData14);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback2 = null;
        dim0.setGuiCallback(guiCallback2);
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        dim0.go();
        dim0.setBreakOnExceptions(false);
        dim0.clearAllBreakpoints();
        org.junit.Assert.assertNull(functionSource9);
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(true);
        dim0.dispose();
        dim0.detach();
        org.junit.Assert.assertNull(sourceInfo8);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.setReturnValue(0);
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo17 = dim0.sourceInfo("hi!");
        dim0.clearAllBreakpoints();
        java.lang.String[] strArray19 = dim0.functionNames();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim0.setScopeProvider(scopeProvider21);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback23 = null;
        dim0.setGuiCallback(guiCallback23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo17);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.dispose();
        dim0.setReturnValue((int) (byte) 1);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData14 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(true);
        java.lang.String str20 = dim0.eval("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback4 = null;
        dim0.setGuiCallback(guiCallback4);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData6 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback7 = null;
        dim0.setGuiCallback(guiCallback7);
        dim0.setBreakOnExceptions(false);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider11 = null;
        dim0.setSourceProvider(sourceProvider11);
        dim0.setBreakOnEnter(true);
        dim0.setReturnValue((int) (short) -1);
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        java.lang.String str20 = dim17.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim17.setScopeProvider(scopeProvider21);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource24 = dim17.functionSourceByName("undefined");
        dim17.clearAllBreakpoints();
        dim17.detach();
        dim17.setReturnValue(3);
        dim17.setReturnValue(0);
        dim17.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo34 = dim17.sourceInfo("hi!");
        dim17.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource37 = dim17.functionSourceByName("undefined");
        java.lang.String[] strArray38 = dim17.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray39 = dim0.getObjectIds((java.lang.Object) strArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(contextData6);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
        org.junit.Assert.assertNull(functionSource24);
        org.junit.Assert.assertNull(sourceInfo34);
        org.junit.Assert.assertNull(functionSource37);
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData8 = dim0.currentContextData();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider10 = null;
        dim0.setScopeProvider(scopeProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        dim0.detach();
        org.junit.Assert.assertNull(contextData8);
        org.junit.Assert.assertNull(contextData12);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        java.lang.String str7 = dim0.eval("undefined");
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource8 = dim0.functionSourceByName("undefined");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(functionSource8);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch((int) (short) 1);
        dim0.detach();
        dim0.setReturnValue(3);
        dim0.go();
        dim0.dispose();
        dim0.setBreakOnEnter(true);
        dim0.detach();
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource17 = dim0.functionSourceByName("hi!");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        dim21.contextSwitch((int) ' ');
        dim21.setBreakOnEnter(true);
        java.lang.String str28 = dim21.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback29 = null;
        dim21.setGuiCallback(guiCallback29);
        com.google.javascript.rhino.head.tools.debugger.Dim dim31 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim31.setBreak();
        dim31.contextSwitch((int) (byte) 0);
        dim31.clearAllBreakpoints();
        dim31.detach();
        dim31.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo40 = dim31.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback41 = null;
        dim31.setGuiCallback(guiCallback41);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData43 = dim31.currentContextData();
        dim31.setBreakOnReturn(false);
        java.lang.String[] strArray46 = dim31.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj47 = dim0.getObjectProperty((java.lang.Object) guiCallback29, (java.lang.Object) strArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(functionSource17);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "undefined" + "'", str28, "undefined");
        org.junit.Assert.assertNull(sourceInfo40);
        org.junit.Assert.assertNull(contextData43);
        org.junit.Assert.assertNotNull(strArray46);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("undefined");
        dim0.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource12 = dim0.functionSourceByName("hi!");
        java.lang.String str14 = dim0.eval("");
        dim0.dispose();
        java.lang.String[] strArray16 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim21 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim21.setBreak();
        dim21.contextSwitch((int) ' ');
        dim21.go();
        dim21.setBreakOnReturn(true);
        dim21.contextSwitch(4);
        dim21.go();
        dim21.setBreakOnReturn(true);
        dim21.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider35 = null;
        dim21.setSourceProvider(sourceProvider35);
        dim21.contextSwitch(100);
        java.lang.String[] strArray39 = dim21.functionNames();
        dim21.setBreakOnEnter(false);
        com.google.javascript.rhino.head.tools.debugger.Dim dim42 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim42.setBreak();
        dim42.contextSwitch((int) ' ');
        dim42.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider47 = null;
        dim42.setSourceProvider(sourceProvider47);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo50 = dim42.sourceInfo("");
        dim42.setBreakOnReturn(false);
        dim42.setBreak();
        dim42.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource56 = dim42.functionSourceByName("");
        dim42.go();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = dim0.getObjectProperty((java.lang.Object) dim21, (java.lang.Object) dim42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(functionSource12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNull(sourceInfo50);
        org.junit.Assert.assertNull(functionSource56);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        java.lang.String str13 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback16 = null;
        dim0.setGuiCallback(guiCallback16);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider18 = null;
        dim0.setScopeProvider(scopeProvider18);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(sourceInfo15);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider12 = null;
        dim0.setSourceProvider(sourceProvider12);
        dim0.setBreakOnExceptions(true);
        // The following exception was thrown during execution in test generation
        try {
            dim0.evalScript("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource10 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(functionSource10);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        dim0.contextSwitch(0);
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) ' ');
        dim11.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim11.setSourceProvider(sourceProvider16);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo19 = dim11.sourceInfo("");
        dim11.setBreakOnReturn(false);
        dim11.setBreak();
        dim11.clearAllBreakpoints();
        dim11.setBreakOnEnter(true);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider26 = null;
        dim11.setScopeProvider(scopeProvider26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray28 = dim0.getObjectIds((java.lang.Object) scopeProvider26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo19);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        dim0.setBreakOnExceptions(true);
        dim0.go();
        dim0.setReturnValue((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        dim0.dispose();
        java.lang.String str12 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.go();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = dim0.stringIsCompilableUnit("undefined");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "undefined" + "'", str12, "undefined");
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        dim0.setReturnValue(1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider17 = null;
        dim0.setScopeProvider(scopeProvider17);
        dim0.setBreakOnExceptions(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource9 = dim0.functionSourceByName("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource9);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider9 = null;
        dim0.setScopeProvider(scopeProvider9);
        com.google.javascript.rhino.head.tools.debugger.Dim dim11 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim11.setBreak();
        dim11.contextSwitch((int) ' ');
        java.lang.String[] strArray15 = dim11.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData16 = dim11.currentContextData();
        dim11.setBreak();
        java.lang.String str19 = dim11.eval("hi!");
        dim11.detach();
        dim11.setBreakOnReturn(true);
        dim11.go();
        dim11.contextSwitch((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dim0.objectToString((java.lang.Object) dim11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(contextData16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData10 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnReturn(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData10);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo6 = dim0.sourceInfo("");
        java.lang.String[] strArray7 = dim0.functionNames();
        dim0.go();
        dim0.setBreak();
        org.junit.Assert.assertNull(sourceInfo6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.setBreakOnExceptions(false);
        dim0.detach();
        java.lang.String[] strArray13 = dim0.functionNames();
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setReturnValue((int) (byte) -1);
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("undefined");
        dim0.contextSwitch((int) '#');
        dim0.contextSwitch((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.setBreakOnExceptions(false);
        dim0.dispose();
        java.lang.String str13 = dim0.eval("hi!");
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback15 = null;
        dim0.setGuiCallback(guiCallback15);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        dim0.setReturnValue((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider21 = null;
        dim0.setScopeProvider(scopeProvider21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        java.lang.String[] strArray10 = dim0.functionNames();
        dim0.detach();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo14 = dim0.sourceInfo("undefined");
        dim0.contextSwitch((int) ' ');
        com.google.javascript.rhino.head.ContextFactory contextFactory17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dim0.attachTo(contextFactory17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(sourceInfo14);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.contextSwitch((int) (short) 1);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        dim0.setBreakOnEnter(false);
        dim0.dispose();
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData9 = dim0.currentContextData();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback11 = null;
        dim0.setGuiCallback(guiCallback11);
        java.lang.String str14 = dim0.eval("hi!");
        org.junit.Assert.assertNull(contextData9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo9 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback10 = null;
        dim0.setGuiCallback(guiCallback10);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("undefined");
        dim0.contextSwitch((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim0.functionSourceByName("");
        org.junit.Assert.assertNull(sourceInfo9);
        org.junit.Assert.assertNull(functionSource15);
        org.junit.Assert.assertNull(functionSource19);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback9 = null;
        dim0.setGuiCallback(guiCallback9);
        dim0.contextSwitch((int) (short) 1);
        dim0.go();
        dim0.setReturnValue((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider6 = null;
        dim0.setScopeProvider(scopeProvider6);
        dim0.detach();
        dim0.setBreakOnReturn(true);
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.Dim dim13 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim13.setBreak();
        dim13.contextSwitch((int) (byte) 0);
        dim13.setReturnValue(5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[] objArray19 = dim0.getObjectIds((java.lang.Object) dim13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider11 = null;
        dim0.setScopeProvider(scopeProvider11);
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo15 = dim0.sourceInfo("undefined");
        dim0.contextSwitch((int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(sourceInfo15);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.dispose();
        dim0.setBreak();
        java.lang.String str17 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.dispose();
        dim0.setBreakOnExceptions(true);
        java.lang.String[] strArray8 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo10 = dim0.sourceInfo("");
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim dim12 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim12.setBreak();
        dim12.contextSwitch((int) (byte) 0);
        dim12.clearAllBreakpoints();
        dim12.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource19 = dim12.functionSourceByName("");
        dim12.setBreak();
        dim12.dispose();
        dim12.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData23 = dim12.currentContextData();
        dim12.detach();
        dim12.contextSwitch((int) (short) -1);
        dim12.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim dim28 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim28.setBreak();
        java.lang.String str31 = dim28.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider32 = null;
        dim28.setScopeProvider(scopeProvider32);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback34 = null;
        dim28.setGuiCallback(guiCallback34);
        dim28.contextSwitch((int) '4');
        dim28.dispose();
        dim28.setReturnValue((int) (byte) 1);
        java.lang.String str42 = dim28.eval("undefined");
        dim28.dispose();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData44 = dim28.currentContextData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = dim0.getObjectProperty((java.lang.Object) dim12, (java.lang.Object) dim28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sourceInfo10);
        org.junit.Assert.assertNull(functionSource19);
        org.junit.Assert.assertNull(contextData23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "undefined" + "'", str31, "undefined");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "undefined" + "'", str42, "undefined");
        org.junit.Assert.assertNull(contextData44);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.setBreakOnEnter(true);
        java.lang.String str7 = dim0.eval("hi!");
        java.lang.String[] strArray8 = dim0.functionNames();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = dim0.stringIsCompilableUnit("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "undefined" + "'", str7, "undefined");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.dispose();
        dim0.setBreak();
        dim0.detach();
        dim0.contextSwitch((int) ' ');
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        dim0.detach();
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setReturnValue(5);
        dim0.setBreakOnExceptions(true);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback13 = null;
        dim0.setGuiCallback(guiCallback13);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        java.lang.String str6 = dim0.eval("hi!");
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo12 = dim0.sourceInfo("");
        dim0.contextSwitch(10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "undefined" + "'", str6, "undefined");
        org.junit.Assert.assertNull(sourceInfo12);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider5 = null;
        dim0.setSourceProvider(sourceProvider5);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo8 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(true);
        dim0.dispose();
        dim0.setBreakOnReturn(false);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo19 = dim0.sourceInfo("hi!");
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo21 = dim0.sourceInfo("");
        org.junit.Assert.assertNull(sourceInfo8);
        org.junit.Assert.assertNull(sourceInfo19);
        org.junit.Assert.assertNull(sourceInfo21);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        java.lang.String[] strArray4 = dim0.functionNames();
        dim0.setBreakOnEnter(false);
        dim0.setReturnValue((int) (byte) 100);
        dim0.contextSwitch((-1));
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        dim0.dispose();
        dim0.detach();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource18 = dim0.functionSourceByName("undefined");
        dim0.setBreakOnReturn(false);
        dim0.setBreak();
        dim0.setBreakOnExceptions(false);
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertNull(functionSource18);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("");
        dim0.setBreak();
        dim0.dispose();
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData11 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource15 = dim0.functionSourceByName("");
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider16 = null;
        dim0.setSourceProvider(sourceProvider16);
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertNull(contextData11);
        org.junit.Assert.assertNull(functionSource15);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.contextSwitch(4);
        dim0.go();
        dim0.setBreakOnReturn(true);
        dim0.setBreakOnExceptions(true);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider14 = null;
        dim0.setSourceProvider(sourceProvider14);
        dim0.contextSwitch(100);
        java.lang.String[] strArray18 = dim0.functionNames();
        java.lang.String str20 = dim0.eval("");
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource22 = dim0.functionSourceByName("");
        dim0.setBreakOnEnter(false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "undefined" + "'", str20, "undefined");
        org.junit.Assert.assertNull(functionSource22);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        dim0.clearAllBreakpoints();
        dim0.detach();
        dim0.setReturnValue(0);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider8 = null;
        dim0.setScopeProvider(scopeProvider8);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo13 = dim0.sourceInfo("");
        dim0.dispose();
        java.lang.String str16 = dim0.eval("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim dim17 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim17.setBreak();
        dim17.contextSwitch((int) (byte) 0);
        dim17.clearAllBreakpoints();
        dim17.setBreakOnReturn(true);
        dim17.setBreakOnExceptions(true);
        dim17.setBreakOnExceptions(true);
        java.lang.String[] strArray28 = dim17.functionNames();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dim0.objectToString((java.lang.Object) strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(sourceInfo13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "undefined" + "'", str16, "undefined");
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        java.lang.String[] strArray1 = dim0.functionNames();
        dim0.detach();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource4 = dim0.functionSourceByName("");
        java.lang.String[] strArray5 = dim0.functionNames();
        java.lang.String[] strArray6 = dim0.functionNames();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(functionSource4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.go();
        dim0.contextSwitch((int) (byte) 1);
        dim0.clearAllBreakpoints();
        com.google.javascript.rhino.head.tools.debugger.Dim dim10 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim10.setBreak();
        java.lang.String str13 = dim10.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider14 = null;
        dim10.setScopeProvider(scopeProvider14);
        dim10.setBreakOnReturn(false);
        dim10.setBreakOnExceptions(false);
        dim10.setReturnValue((int) (byte) -1);
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider22 = null;
        dim10.setScopeProvider(scopeProvider22);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource25 = dim10.functionSourceByName("");
        dim10.contextSwitch(5);
        dim10.setReturnValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dim0.objectToString((java.lang.Object) dim10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertNull(functionSource25);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        java.lang.String str11 = dim0.eval("hi!");
        dim0.detach();
        dim0.clearAllBreakpoints();
        dim0.setBreakOnEnter(true);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback17 = null;
        dim0.setGuiCallback(guiCallback17);
        dim0.setBreak();
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource21 = dim0.functionSourceByName("undefined");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "undefined" + "'", str11, "undefined");
        org.junit.Assert.assertNull(functionSource21);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.contextSwitch((int) (byte) 1);
        dim0.dispose();
        dim0.detach();
        dim0.contextSwitch((int) (short) 0);
        dim0.setBreak();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) (byte) 0);
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo5 = dim0.sourceInfo("");
        dim0.setBreakOnReturn(false);
        dim0.clearAllBreakpoints();
        dim0.setReturnValue((int) (short) -1);
        dim0.setReturnValue((int) (short) 0);
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider13 = null;
        dim0.setSourceProvider(sourceProvider13);
        org.junit.Assert.assertNull(sourceInfo5);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        dim0.contextSwitch((int) ' ');
        java.lang.String[] strArray4 = dim0.functionNames();
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider5 = null;
        dim0.setScopeProvider(scopeProvider5);
        dim0.setReturnValue(5);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback9 = null;
        dim0.setGuiCallback(guiCallback9);
        dim0.setReturnValue((int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.Dim.FunctionSource functionSource7 = dim0.functionSourceByName("undefined");
        dim0.clearAllBreakpoints();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.SourceProvider sourceProvider10 = null;
        dim0.setSourceProvider(sourceProvider10);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback12 = null;
        dim0.setGuiCallback(guiCallback12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(functionSource7);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        int int7 = contextData0.frameCount();
        int int8 = contextData0.frameCount();
        int int9 = contextData0.frameCount();
        int int10 = contextData0.frameCount();
        int int11 = contextData0.frameCount();
        int int12 = contextData0.frameCount();
        int int13 = contextData0.frameCount();
        int int14 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame16 = contextData0.getFrame(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -1 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        dim0.setBreakOnReturn(false);
        dim0.setBreakOnExceptions(false);
        dim0.setBreakOnReturn(true);
        dim0.clearAllBreakpoints();
        java.lang.String str14 = dim0.eval("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.setBreakOnExceptions(true);
        dim0.dispose();
        dim0.dispose();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.google.javascript.rhino.head.tools.debugger.Dim dim0 = new com.google.javascript.rhino.head.tools.debugger.Dim();
        dim0.setBreak();
        java.lang.String str3 = dim0.eval("hi!");
        com.google.javascript.rhino.head.tools.debugger.ScopeProvider scopeProvider4 = null;
        dim0.setScopeProvider(scopeProvider4);
        com.google.javascript.rhino.head.tools.debugger.GuiCallback guiCallback6 = null;
        dim0.setGuiCallback(guiCallback6);
        dim0.contextSwitch((int) '4');
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo11 = dim0.sourceInfo("undefined");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData12 = dim0.currentContextData();
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData13 = dim0.currentContextData();
        dim0.contextSwitch((int) (byte) 1);
        dim0.setBreak();
        dim0.go();
        com.google.javascript.rhino.head.tools.debugger.Dim.SourceInfo sourceInfo19 = dim0.sourceInfo("");
        dim0.go();
        dim0.setBreakOnReturn(false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "undefined" + "'", str3, "undefined");
        org.junit.Assert.assertNull(sourceInfo11);
        org.junit.Assert.assertNull(contextData12);
        org.junit.Assert.assertNull(contextData13);
        org.junit.Assert.assertNull(sourceInfo19);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.google.javascript.rhino.head.tools.debugger.Dim.ContextData contextData0 = new com.google.javascript.rhino.head.tools.debugger.Dim.ContextData();
        int int1 = contextData0.frameCount();
        int int2 = contextData0.frameCount();
        int int3 = contextData0.frameCount();
        int int4 = contextData0.frameCount();
        int int5 = contextData0.frameCount();
        int int6 = contextData0.frameCount();
        int int7 = contextData0.frameCount();
        int int8 = contextData0.frameCount();
        int int9 = contextData0.frameCount();
        int int10 = contextData0.frameCount();
        int int11 = contextData0.frameCount();
        int int12 = contextData0.frameCount();
        int int13 = contextData0.frameCount();
        int int14 = contextData0.frameCount();
        int int15 = contextData0.frameCount();
        int int16 = contextData0.frameCount();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.head.tools.debugger.Dim.StackFrame stackFrame18 = contextData0.getFrame((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: -53 ?? [0, 0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }
}

