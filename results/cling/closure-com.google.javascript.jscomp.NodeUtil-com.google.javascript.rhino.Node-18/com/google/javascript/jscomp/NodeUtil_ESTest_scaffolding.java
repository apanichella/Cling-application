/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 19:27:22 GMT 2020
 */

package com.google.javascript.jscomp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class NodeUtil_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.NodeUtil"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NodeUtil_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.jscomp.type.ReverseAbstractInterpreter",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.Collections2",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.common.collect.PeekingIterator",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Sets$3",
      "com.google.javascript.jscomp.JSModule",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.common.collect.Sets$1",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.rhino.jstype.RecordType",
      "com.google.javascript.rhino.Node$AncestorIterable$1",
      "com.google.common.collect.Iterators$12",
      "com.google.javascript.jscomp.CodingConvention$SubclassType",
      "com.google.common.collect.Iterators$11",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.common.base.Predicate",
      "com.google.common.collect.AbstractMultimap$AsMap",
      "com.google.javascript.jscomp.CodingConvention",
      "com.google.javascript.jscomp.SourceMap$DetailLevel",
      "com.google.javascript.jscomp.SourceMap",
      "com.google.common.base.Joiner",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.jstype.ProxyObjectType",
      "com.google.javascript.rhino.jstype.TemplateType",
      "com.google.javascript.rhino.jstype.NamedType",
      "com.google.common.collect.Iterators$14",
      "com.google.common.collect.Iterators$13",
      "com.google.javascript.rhino.InputId",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.ValueType",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.javascript.jscomp.CssRenamingMap",
      "com.google.common.base.Preconditions",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.javascript.jscomp.parsing.Config",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.javascript.jscomp.ErrorHandler",
      "com.google.common.collect.ImmutableCollection",
      "com.google.javascript.rhino.jstype.IndexedType",
      "com.google.javascript.jscomp.NodeUtil$MatchNodeType",
      "com.google.javascript.jscomp.CodingConvention$ObjectLiteralCast",
      "com.google.javascript.jscomp.CodingConvention$SubclassRelationship",
      "com.google.javascript.jscomp.CompilerPass",
      "com.google.javascript.jscomp.NodeUtil$MatchDeclaration",
      "com.google.javascript.jscomp.NodeUtil$VarCollector",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.jscomp.Scope",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Iterators$7",
      "com.google.javascript.jscomp.Scope$Var",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.javascript.jscomp.CodeChangeHandler",
      "com.google.javascript.jscomp.AbstractPeepholeOptimization",
      "com.google.javascript.rhino.jstype.SimpleSourceFile",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode",
      "com.google.javascript.jscomp.NodeUtil$MayBeStringResultPredicate",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators$3",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection",
      "com.google.common.collect.RegularImmutableList$1",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.google.javascript.jscomp.NodeUtil$1",
      "com.google.common.collect.Lists$1",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.base.Predicates$ObjectPredicate$1",
      "com.google.common.base.Supplier",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.javascript.jscomp.GlobalVarReferenceMap",
      "com.google.javascript.jscomp.TypeValidator",
      "com.google.common.collect.ImmutableList",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.javascript.jscomp.NodeUtil$MatchNotFunction",
      "com.google.common.collect.AbstractMultimap$KeySet",
      "com.google.javascript.jscomp.SourceMap$LocationMapping",
      "com.google.javascript.jscomp.CodingConvention$Bind",
      "com.google.javascript.jscomp.PeepholeRemoveDeadCode",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.base.Predicates$ObjectPredicate$4",
      "com.google.common.base.Predicates$ObjectPredicate$3",
      "com.google.common.base.Predicates$ObjectPredicate$2",
      "com.google.javascript.jscomp.NodeUtil$MatchNameNode",
      "com.google.common.collect.Hashing",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.common.collect.ListMultimap",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.common.collect.AbstractMultimap$WrappedCollection",
      "com.google.javascript.rhino.TokenStream",
      "com.google.javascript.rhino.jstype.FunctionParamBuilder",
      "com.google.javascript.jscomp.SourceAst",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.javascript.rhino.jstype.TernaryValue$1",
      "com.google.common.collect.RegularImmutableList",
      "com.google.javascript.rhino.jstype.TernaryValue$3",
      "com.google.javascript.rhino.jstype.TernaryValue$2",
      "com.google.javascript.jscomp.SourceExcerptProvider",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.common.collect.Maps$KeySet",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.head.ErrorReporter",
      "com.google.javascript.jscomp.NodeUtil",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.javascript.jscomp.AbstractCompiler$LifeCycleStage",
      "com.google.javascript.jscomp.NodeUtil$BooleanResultPredicate",
      "com.google.javascript.jscomp.SourceMap$1",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.javascript.jscomp.SyntheticAst",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.javascript.jscomp.ScopeCreator",
      "com.google.javascript.rhino.jstype.ParameterizedType",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.common.base.Predicates",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceMap",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.common.collect.EmptyImmutableList$1",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.common.collect.AbstractIterator",
      "com.google.javascript.rhino.jstype.FunctionBuilder",
      "com.google.javascript.jscomp.CodingConvention$DelegateRelationship",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.common.collect.MapDifference",
      "com.google.javascript.jscomp.CodingConvention$AssertionFunctionSpec",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.javascript.jscomp.ExploitAssigns",
      "com.google.common.collect.AbstractMultimap$WrappedList",
      "com.google.javascript.jscomp.NodeUtil$Visitor",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.jscomp.JSError",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.common.collect.AbstractMultimap$RandomAccessWrappedList",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.javascript.rhino.jstype.UnresolvedTypeExpression",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.jscomp.ErrorManager",
      "com.google.javascript.jscomp.NodeUtil$NumbericResultPredicate",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.base.Function",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.javascript.jscomp.JSModuleGraph",
      "com.google.common.collect.AbstractMultimap$SortedKeySet",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.jscomp.Region",
      "com.google.javascript.rhino.IR",
      "com.google.common.collect.AbstractMultimap$SortedAsMap",
      "com.google.javascript.jscomp.SourceMap$DetailLevel$2",
      "com.google.common.collect.Multimap",
      "com.google.javascript.jscomp.SourceMap$DetailLevel$1",
      "com.google.common.collect.Iterators",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.StaticSymbolTable",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.javascript.jscomp.NodeUtil$MatchShallowStatement",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.common.collect.Maps",
      "com.google.javascript.jscomp.deps.DependencyInfo",
      "com.google.common.collect.SetMultimap",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.JSTypeExpression"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.google.javascript.jscomp.AbstractCompiler", false, NodeUtil_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.javascript.jscomp.CodingConvention", false, NodeUtil_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.javascript.rhino.ErrorReporter", false, NodeUtil_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.javascript.rhino.Node", false, NodeUtil_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NodeUtil_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.javascript.jscomp.NodeUtil",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.rhino.Node$AbstractPropListItem",
      "com.google.javascript.rhino.Node$ObjectPropListItem",
      "com.google.javascript.rhino.Node$IntPropListItem",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.Maps",
      "com.google.javascript.rhino.Token",
      "com.google.common.base.Predicates",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax",
      "com.google.javascript.jscomp.Compiler",
      "com.google.javascript.jscomp.GoogleCodingConvention",
      "com.google.javascript.jscomp.ClosureCodingConvention",
      "com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention",
      "com.google.common.collect.EmptyImmutableList",
      "com.google.common.collect.Iterators",
      "com.google.javascript.jscomp.PeepholeFoldConstants",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.HashMultimap",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.BooleanType",
      "com.google.javascript.rhino.jstype.NullType",
      "com.google.javascript.rhino.jstype.NumberType",
      "com.google.javascript.rhino.jstype.StringType",
      "com.google.javascript.rhino.jstype.UnknownType",
      "com.google.javascript.rhino.jstype.VoidType",
      "com.google.javascript.rhino.jstype.AllType",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.rhino.jstype.FunctionType$Kind",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.rhino.jstype.ObjectType$Property",
      "com.google.javascript.rhino.jstype.NoObjectType",
      "com.google.javascript.rhino.jstype.NoType",
      "com.google.javascript.rhino.jstype.NoResolvedType",
      "com.google.javascript.rhino.jstype.ErrorFunctionType",
      "com.google.javascript.rhino.jstype.UnionTypeBuilder",
      "com.google.javascript.rhino.jstype.UnionType",
      "com.google.javascript.rhino.jstype.JSTypeRegistry$1",
      "com.google.javascript.jscomp.MakeDeclaredNamesUnique",
      "com.google.javascript.jscomp.MakeDeclaredNamesUnique$ContextualRenamer",
      "com.google.common.collect.AbstractMapBasedMultiset",
      "com.google.common.collect.HashMultiset",
      "com.google.common.primitives.Ints",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.SyntheticAst",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.TightenTypes",
      "com.google.javascript.jscomp.AbstractMessageFormatter",
      "com.google.javascript.jscomp.LightweightMessageFormatter",
      "com.google.javascript.jscomp.SourceExcerptProvider$SourceExcerpt",
      "com.google.javascript.jscomp.BasicErrorManager$LeveledJSErrorComparator",
      "com.google.javascript.jscomp.PeepholeReplaceKnownMethods",
      "com.google.javascript.jscomp.JqueryCodingConvention",
      "com.google.javascript.jscomp.ShowByPathWarningsGuard$ShowType",
      "com.google.javascript.jscomp.CodeGenerator",
      "com.google.javascript.jscomp.Normalize",
      "com.google.javascript.jscomp.JSSourceFile",
      "com.google.common.base.Charsets",
      "com.google.javascript.jscomp.SourceFile$Generated",
      "com.google.javascript.jscomp.Tracer",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler$NullAliasTransformation",
      "com.google.javascript.jscomp.CompilerOptions$NullAliasTransformationHandler",
      "com.google.javascript.jscomp.CompilerOptions",
      "com.google.javascript.jscomp.DependencyOptions",
      "com.google.javascript.jscomp.ProcessCommonJSModules",
      "com.google.javascript.jscomp.ComposeWarningsGuard",
      "com.google.javascript.jscomp.ComposeWarningsGuard$GuardComparator",
      "com.google.javascript.jscomp.SourceMap$DetailLevel",
      "com.google.javascript.jscomp.SourceMap$Format",
      "com.google.javascript.jscomp.CompilerOptions$LanguageMode",
      "com.google.javascript.jscomp.CompilerOptions$DevMode",
      "com.google.javascript.jscomp.VariableRenamingPolicy",
      "com.google.javascript.jscomp.PropertyRenamingPolicy",
      "com.google.javascript.jscomp.AnonymousFunctionNamingPolicy",
      "com.google.javascript.jscomp.CompilerOptions$TweakProcessing",
      "com.google.javascript.jscomp.CompilerOptions$TracerMode",
      "com.google.javascript.jscomp.InlineProperties",
      "com.google.javascript.jscomp.SourceFile$OnDisk",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.jscomp.SourceFile$Preloaded",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.jscomp.CheckLevel"
    );
  }
}
