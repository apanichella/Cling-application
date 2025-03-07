/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 14:41:29 GMT 2020
 */

package org.mockito.cglib.proxy;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Mixin$Generator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.cglib.proxy.Mixin$Generator"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/botsing-integration-experiment"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Mixin$Generator_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.cglib.core.Customizer",
      "org.mockito.cglib.core.MethodInfo",
      "org.mockito.cglib.core.EmitUtils",
      "org.mockito.cglib.core.ClassesKey",
      "org.mockito.cglib.core.Constants",
      "org.mockito.cglib.core.LocalVariablesSorter$1",
      "org.mockito.cglib.core.LocalVariablesSorter",
      "org.mockito.cglib.core.ClassNameReader$1",
      "org.mockito.cglib.core.ReflectUtils",
      "org.mockito.cglib.core.DebuggingClassWriter",
      "org.mockito.cglib.core.ClassInfo",
      "org.mockito.cglib.core.ObjectSwitchCallback",
      "org.mockito.cglib.proxy.MixinBeanEmitter",
      "org.mockito.cglib.proxy.Mixin$Generator",
      "org.mockito.cglib.core.NamingPolicy",
      "org.mockito.cglib.core.ClassEmitter$FieldInfo",
      "org.mockito.cglib.core.GeneratorStrategy",
      "org.mockito.cglib.core.LocalVariablesSorter$State",
      "org.mockito.cglib.core.ReflectUtils$4",
      "org.mockito.cglib.core.ReflectUtils$2",
      "org.mockito.cglib.core.Local",
      "org.mockito.cglib.proxy.MixinEverythingEmitter",
      "org.mockito.cglib.core.ReflectUtils$3",
      "org.mockito.asm.ByteVector",
      "org.mockito.cglib.core.ReflectUtils$1",
      "org.mockito.cglib.core.ClassNameReader$EarlyExitException",
      "org.mockito.cglib.core.MethodWrapper",
      "org.mockito.cglib.core.DebuggingClassWriter$1",
      "org.mockito.asm.Item",
      "org.mockito.cglib.core.AbstractClassGenerator$1",
      "org.mockito.asm.FieldVisitor",
      "org.mockito.cglib.core.ClassEmitter",
      "org.mockito.cglib.core.Transformer",
      "org.mockito.cglib.core.DefaultGeneratorStrategy",
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.cglib.core.MethodWrapper$MethodWrapperKey",
      "org.mockito.cglib.core.ProcessSwitchCallback",
      "org.mockito.cglib.core.ClassNameReader",
      "org.mockito.cglib.core.AbstractClassGenerator$Source",
      "org.mockito.asm.FieldWriter",
      "org.mockito.cglib.proxy.Mixin$Route",
      "org.mockito.cglib.core.EmitUtils$ParameterTyper",
      "org.mockito.cglib.core.DefaultNamingPolicy",
      "org.mockito.cglib.core.CodeEmitter$State",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.asm.ClassReader",
      "org.mockito.cglib.proxy.Mixin$MixinKey",
      "org.mockito.cglib.core.KeyFactory$Generator",
      "org.mockito.asm.Type",
      "org.mockito.cglib.core.ClassEmitter$3",
      "org.mockito.cglib.core.ProcessArrayCallback",
      "org.mockito.asm.MethodWriter",
      "org.mockito.cglib.proxy.MixinEmitter",
      "org.mockito.asm.Opcodes",
      "org.mockito.asm.Edge",
      "org.mockito.cglib.core.ClassesKey$Key",
      "org.mockito.asm.Label",
      "org.mockito.cglib.core.RejectModifierPredicate",
      "org.mockito.cglib.core.Signature",
      "org.mockito.cglib.core.ClassEmitter$1",
      "org.mockito.cglib.proxy.Mixin",
      "org.mockito.asm.Attribute",
      "org.mockito.cglib.core.EmitUtils$8",
      "org.mockito.asm.AnnotationVisitor",
      "org.mockito.cglib.core.EmitUtils$9",
      "org.mockito.asm.ClassAdapter",
      "org.mockito.cglib.core.Predicate",
      "org.mockito.cglib.core.EmitUtils$7",
      "org.mockito.cglib.core.EmitUtils$ArrayDelimiters",
      "org.mockito.asm.ClassVisitor",
      "org.mockito.cglib.core.CodeGenerationException",
      "org.mockito.cglib.core.CollectionUtils",
      "org.mockito.asm.MethodVisitor",
      "org.mockito.asm.Frame",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.asm.ClassWriter",
      "org.mockito.cglib.core.KeyFactory",
      "org.mockito.cglib.core.KeyFactory$2",
      "org.mockito.cglib.core.KeyFactory$1",
      "org.mockito.cglib.core.ClassGenerator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Mixin$Generator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.cglib.proxy.Mixin$Generator",
      "org.mockito.cglib.core.ReflectUtils",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.asm.Type",
      "org.mockito.cglib.core.KeyFactory",
      "org.mockito.cglib.core.KeyFactory$Generator",
      "org.mockito.cglib.core.DefaultGeneratorStrategy",
      "org.mockito.cglib.core.DefaultNamingPolicy",
      "org.mockito.asm.ClassWriter",
      "org.mockito.cglib.core.DebuggingClassWriter",
      "org.mockito.cglib.core.ClassEmitter",
      "org.mockito.cglib.core.EmitUtils",
      "org.mockito.asm.MethodWriter",
      "org.mockito.asm.Label",
      "org.mockito.cglib.core.Constants",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.asm.Frame",
      "org.mockito.asm.Edge",
      "org.mockito.asm.ClassReader",
      "org.mockito.cglib.core.ClassNameReader",
      "org.mockito.cglib.core.ClassesKey",
      "org.mockito.cglib.proxy.Mixin",
      "org.mockito.cglib.proxy.MixinEmitter",
      "org.mockito.cglib.core.MethodWrapper"
    );
  }
}
