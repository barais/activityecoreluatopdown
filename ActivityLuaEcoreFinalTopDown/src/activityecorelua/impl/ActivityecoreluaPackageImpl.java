/**
 */
package activityecorelua.impl;

import activityecorelua.Action;
import activityecorelua.Activity;
import activityecorelua.ActivityEdge;
import activityecorelua.ActivityFinalNode;
import activityecorelua.ActivityNode;
import activityecorelua.ActivityecoreluaFactory;
import activityecorelua.ActivityecoreluaPackage;
import activityecorelua.Block;
import activityecorelua.BooleanValue;
import activityecorelua.BooleanVariable;
import activityecorelua.Chunk;
import activityecorelua.ControlFlow;
import activityecorelua.ControlNode;
import activityecorelua.DecisionNode;
import activityecorelua.EAnnotation;
import activityecorelua.EClassifier;
import activityecorelua.EEnum;
import activityecorelua.EEnumLiteral;
import activityecorelua.EFactory;
import activityecorelua.EModelElement;
import activityecorelua.ENamedElement;
import activityecorelua.EObject;
import activityecorelua.EParameter;
import activityecorelua.EStructuralFeature;
import activityecorelua.ETypeParameter;
import activityecorelua.ETypedElement;
import activityecorelua.ExecutableNode;
import activityecorelua.Expression;
import activityecorelua.Expression_AccessArray;
import activityecorelua.Expression_AccessMember;
import activityecorelua.Expression_And;
import activityecorelua.Expression_CallFunction;
import activityecorelua.Expression_CallMemberFunction;
import activityecorelua.Expression_Concatenation;
import activityecorelua.Expression_Division;
import activityecorelua.Expression_Equal;
import activityecorelua.Expression_Exponentiation;
import activityecorelua.Expression_False;
import activityecorelua.Expression_Function;
import activityecorelua.Expression_Invert;
import activityecorelua.Expression_Larger;
import activityecorelua.Expression_Larger_Equal;
import activityecorelua.Expression_Length;
import activityecorelua.Expression_Minus;
import activityecorelua.Expression_Modulo;
import activityecorelua.Expression_Multiplication;
import activityecorelua.Expression_Negate;
import activityecorelua.Expression_Nil;
import activityecorelua.Expression_Not_Equal;
import activityecorelua.Expression_Number;
import activityecorelua.Expression_Or;
import activityecorelua.Expression_Plus;
import activityecorelua.Expression_Smaller;
import activityecorelua.Expression_Smaller_Equal;
import activityecorelua.Expression_String;
import activityecorelua.Expression_TableConstructor;
import activityecorelua.Expression_True;
import activityecorelua.Expression_VarArgs;
import activityecorelua.Expression_VariableName;
import activityecorelua.Field;
import activityecorelua.Field_AddEntryToTable;
import activityecorelua.Field_AddEntryToTable_Brackets;
import activityecorelua.Field_AppendEntryToTable;
import activityecorelua.FinalNode;
import activityecorelua.ForkNode;
import activityecorelua.Function;
import activityecorelua.Functioncall_Arguments;
import activityecorelua.InitialNode;
import activityecorelua.Input;
import activityecorelua.InputValue;
import activityecorelua.IntegerValue;
import activityecorelua.IntegerVariable;
import activityecorelua.JoinNode;
import activityecorelua.LastStatement;
import activityecorelua.LastStatement_Break;
import activityecorelua.LastStatement_Return;
import activityecorelua.LastStatement_ReturnWithValue;
import activityecorelua.MergeNode;
import activityecorelua.NamedElement;
import activityecorelua.OpaqueAction;
import activityecorelua.Statement;
import activityecorelua.Statement_Assignment;
import activityecorelua.Statement_Block;
import activityecorelua.Statement_CallFunction;
import activityecorelua.Statement_CallMemberFunction;
import activityecorelua.Statement_For_Generic;
import activityecorelua.Statement_For_Numeric;
import activityecorelua.Statement_FunctioncallOrAssignment;
import activityecorelua.Statement_GlobalFunction_Declaration;
import activityecorelua.Statement_If_Then_Else;
import activityecorelua.Statement_If_Then_Else_ElseIfPart;
import activityecorelua.Statement_LocalFunction_Declaration;
import activityecorelua.Statement_Local_Variable_Declaration;
import activityecorelua.Statement_Repeat;
import activityecorelua.Statement_While;
import activityecorelua.Value;
import activityecorelua.Variable;

import activityecorelua.util.ActivityecoreluaValidator;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityecoreluaPackageImpl extends EPackageImpl implements ActivityecoreluaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStatement_ReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStatement_BreakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_BlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_WhileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_RepeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_If_Then_ElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_If_Then_Else_ElseIfPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_For_NumericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_For_GenericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_GlobalFunction_DeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_LocalFunction_DeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_Local_Variable_DeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_FunctioncallOrAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_NilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_TrueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_FalseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_NumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_VarArgsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_StringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_FunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_TableConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functioncall_ArgumentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass field_AddEntryToTable_BracketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass field_AddEntryToTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass field_AppendEntryToTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lastStatement_ReturnWithValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_AssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_CallMemberFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_CallFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_OrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_AndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_LargerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_Larger_EqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_SmallerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_Smaller_EqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_EqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_Not_EqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_ConcatenationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_PlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_MinusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_MultiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_DivisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_ModuloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_NegateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_LengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_InvertEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_ExponentiationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_CallMemberFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_CallFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_AccessArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_AccessMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_VariableNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBigDecimalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBigIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBooleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBooleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCharEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCharacterObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDiagnosticChainEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDoubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDoubleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eeListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eEnumeratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFeatureMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFeatureMapEntryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFloatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eIntegerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eJavaClassEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eJavaObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eLongEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eLongObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eResourceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eResourceSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eShortEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eShortObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eTreeIteratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eInvocationTargetExceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see activityecorelua.ActivityecoreluaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivityecoreluaPackageImpl() {
		super(eNS_URI, ActivityecoreluaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ActivityecoreluaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivityecoreluaPackage init() {
		if (isInited) return (ActivityecoreluaPackage)EPackage.Registry.INSTANCE.getEPackage(ActivityecoreluaPackage.eNS_URI);

		// Obtain or create and register package
		ActivityecoreluaPackageImpl theActivityecoreluaPackage = (ActivityecoreluaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActivityecoreluaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActivityecoreluaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theActivityecoreluaPackage.createPackageContents();

		// Initialize created meta-data
		theActivityecoreluaPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theActivityecoreluaPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ActivityecoreluaValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theActivityecoreluaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivityecoreluaPackage.eNS_URI, theActivityecoreluaPackage);
		return theActivityecoreluaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAttribute() {
		return eAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttribute_ID() {
		return (EAttribute)eAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAttribute_EAttributeType() {
		return (EReference)eAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAnnotation() {
		return eAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAnnotation_Source() {
		return (EAttribute)eAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_Details() {
		return (EReference)eAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_EModelElement() {
		return (EReference)eAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_Contents() {
		return (EReference)eAnnotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_References() {
		return (EReference)eAnnotationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return eClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass_Abstract() {
		return (EAttribute)eClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass_Interface() {
		return (EAttribute)eClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_ESuperTypes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EOperations() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllAttributes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllReferences() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EReferences() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAttributes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllContainments() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllOperations() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllStructuralFeatures() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllSuperTypes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EIDAttribute() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EStructuralFeatures() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EGenericSuperTypes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EAllGenericSuperTypes() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEClass__IsSuperTypeOf__EClass() {
		return eClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEClass__GetFeatureCount() {
		return eClassEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEClass__GetEStructuralFeature__int() {
		return eClassEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEClass__GetFeatureID__EStructuralFeature() {
		return eClassEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEClass__GetEStructuralFeature__String() {
		return eClassEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEClass__GetOperationCount() {
		return eClassEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEClass__GetEOperation__int() {
		return eClassEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEClass__GetOperationID__EOperation() {
		return eClassEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEClass__GetOverride__EOperation() {
		return eClassEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassifier() {
		return eClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_InstanceClassName() {
		return (EAttribute)eClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_InstanceClass() {
		return (EAttribute)eClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_DefaultValue() {
		return (EAttribute)eClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_InstanceTypeName() {
		return (EAttribute)eClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassifier_EPackage() {
		return (EReference)eClassifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassifier_ETypeParameters() {
		return (EReference)eClassifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEClassifier__IsInstance__Object() {
		return eClassifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEClassifier__GetClassifierID() {
		return eClassifierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDataType() {
		return eDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDataType_Serializable() {
		return (EAttribute)eDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnum() {
		return eEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnum_ELiterals() {
		return (EReference)eEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEEnum__GetEEnumLiteral__String() {
		return eEnumEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEEnum__GetEEnumLiteral__int() {
		return eEnumEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEEnum__GetEEnumLiteralByLiteral__String() {
		return eEnumEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnumLiteral() {
		return eEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteral_Value() {
		return (EAttribute)eEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteral_Instance() {
		return (EAttribute)eEnumLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteral_Literal() {
		return (EAttribute)eEnumLiteralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnumLiteral_EEnum() {
		return (EReference)eEnumLiteralEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFactory() {
		return eFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFactory_EPackage() {
		return (EReference)eFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEFactory__Create__EClass() {
		return eFactoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEFactory__CreateFromString__EDataType_String() {
		return eFactoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEFactory__ConvertToString__EDataType_Object() {
		return eFactoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEModelElement() {
		return eModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEModelElement_EAnnotations() {
		return (EReference)eModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEModelElement__GetEAnnotation__String() {
		return eModelElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENamedElement() {
		return eNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENamedElement_Name() {
		return (EAttribute)eNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObject() {
		return eObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEObject__EeClass() {
		return eObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEOperation() {
		return eOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EContainingClass() {
		return (EReference)eOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_ETypeParameters() {
		return (EReference)eOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EParameters() {
		return (EReference)eOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_Activity() {
		return (EReference)eOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EExceptions() {
		return (EReference)eOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EGenericExceptions() {
		return (EReference)eOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEOperation__GetOperationID() {
		return eOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEOperation__IsOverrideOf__EOperation() {
		return eOperationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPackage() {
		return ePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackage_NsURI() {
		return (EAttribute)ePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackage_NsPrefix() {
		return (EAttribute)ePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_EFactoryInstance() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_EClassifiers() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_ESubpackages() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_ESuperPackage() {
		return (EReference)ePackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEPackage__GetEClassifier__String() {
		return ePackageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEParameter() {
		return eParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEParameter_EOperation() {
		return (EReference)eParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReference() {
		return eReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_Containment() {
		return (EAttribute)eReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_Container() {
		return (EAttribute)eReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_ResolveProxies() {
		return (EAttribute)eReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference_EOpposite() {
		return (EReference)eReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference_EReferenceType() {
		return (EReference)eReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference_EKeys() {
		return (EReference)eReferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralFeature() {
		return eStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Changeable() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Volatile() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Transient() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_DefaultValueLiteral() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_DefaultValue() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Unsettable() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Derived() {
		return (EAttribute)eStructuralFeatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeature_EContainingClass() {
		return (EReference)eStructuralFeatureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEStructuralFeature__GetFeatureID() {
		return eStructuralFeatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEStructuralFeature__GetContainerClass() {
		return eStructuralFeatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETypedElement() {
		return eTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Ordered() {
		return (EAttribute)eTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Unique() {
		return (EAttribute)eTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_LowerBound() {
		return (EAttribute)eTypedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_UpperBound() {
		return (EAttribute)eTypedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Many() {
		return (EAttribute)eTypedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Required() {
		return (EAttribute)eTypedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypedElement_EType() {
		return (EReference)eTypedElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypedElement_EGenericType() {
		return (EReference)eTypedElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringToStringMapEntry() {
		return eStringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToStringMapEntry_Key() {
		return (EAttribute)eStringToStringMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToStringMapEntry_Value() {
		return (EAttribute)eStringToStringMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEGenericType() {
		return eGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_EUpperBound() {
		return (EReference)eGenericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ETypeArguments() {
		return (EReference)eGenericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ERawType() {
		return (EReference)eGenericTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ELowerBound() {
		return (EReference)eGenericTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ETypeParameter() {
		return (EReference)eGenericTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_EClassifier() {
		return (EReference)eGenericTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETypeParameter() {
		return eTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypeParameter_EBounds() {
		return (EReference)eTypeParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Nodes() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Edges() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Locals() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Inputs() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Outgoing() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Incoming() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Activity() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityNode_Running() {
		return (EAttribute)activityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge() {
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Source() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Target() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlow_Guard() {
		return (EReference)controlFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNode() {
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueAction() {
		return opaqueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_Expressions() {
		return (EReference)opaqueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNode() {
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNode() {
		return activityFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNode() {
		return forkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNode() {
		return joinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNode() {
		return mergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNode() {
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_InitialValue() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_CurrentValue() {
		return (EReference)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerVariable() {
		return integerVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanVariable() {
		return booleanVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_Value() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValue_Value() {
		return (EAttribute)integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputValue() {
		return inputValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_Value() {
		return (EReference)inputValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValue_Variable() {
		return (EReference)inputValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_InputValues() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunk() {
		return chunkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Statements() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_ReturnValue() {
		return (EReference)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStatement() {
		return lastStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStatement_Return() {
		return lastStatement_ReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStatement_Break() {
		return lastStatement_BreakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_Block() {
		return statement_BlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Block_Block() {
		return (EReference)statement_BlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_While() {
		return statement_WhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_While_Expression() {
		return (EReference)statement_WhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_While_Block() {
		return (EReference)statement_WhileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_Repeat() {
		return statement_RepeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Repeat_Block() {
		return (EReference)statement_RepeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Repeat_Expression() {
		return (EReference)statement_RepeatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_If_Then_Else() {
		return statement_If_Then_ElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_IfExpression() {
		return (EReference)statement_If_Then_ElseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_IfBlock() {
		return (EReference)statement_If_Then_ElseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_ElseIf() {
		return (EReference)statement_If_Then_ElseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_ElseBlock() {
		return (EReference)statement_If_Then_ElseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_If_Then_Else_ElseIfPart() {
		return statement_If_Then_Else_ElseIfPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_ElseIfPart_ElseifExpression() {
		return (EReference)statement_If_Then_Else_ElseIfPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_If_Then_Else_ElseIfPart_ElseifBlock() {
		return (EReference)statement_If_Then_Else_ElseIfPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_For_Numeric() {
		return statement_For_NumericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_For_Numeric_IteratorName() {
		return (EAttribute)statement_For_NumericEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Numeric_StartExpr() {
		return (EReference)statement_For_NumericEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Numeric_UntilExpr() {
		return (EReference)statement_For_NumericEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Numeric_StepExpr() {
		return (EReference)statement_For_NumericEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Numeric_Block() {
		return (EReference)statement_For_NumericEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_For_Generic() {
		return statement_For_GenericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_For_Generic_Names() {
		return (EAttribute)statement_For_GenericEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Generic_Expressions() {
		return (EReference)statement_For_GenericEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_For_Generic_Block() {
		return (EReference)statement_For_GenericEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_GlobalFunction_Declaration() {
		return statement_GlobalFunction_DeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_GlobalFunction_Declaration_Prefix() {
		return (EAttribute)statement_GlobalFunction_DeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_GlobalFunction_Declaration_FunctionName() {
		return (EAttribute)statement_GlobalFunction_DeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_GlobalFunction_Declaration_Function() {
		return (EReference)statement_GlobalFunction_DeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_LocalFunction_Declaration() {
		return statement_LocalFunction_DeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_LocalFunction_Declaration_FunctionName() {
		return (EAttribute)statement_LocalFunction_DeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_LocalFunction_Declaration_Function() {
		return (EReference)statement_LocalFunction_DeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_Local_Variable_Declaration() {
		return statement_Local_Variable_DeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_Local_Variable_Declaration_VariableNames() {
		return (EAttribute)statement_Local_Variable_DeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Local_Variable_Declaration_InitialValue() {
		return (EReference)statement_Local_Variable_DeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_FunctioncallOrAssignment() {
		return statement_FunctioncallOrAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Nil() {
		return expression_NilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_True() {
		return expression_TrueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_False() {
		return expression_FalseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Number() {
		return expression_NumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Number_Value() {
		return (EAttribute)expression_NumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_VarArgs() {
		return expression_VarArgsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_String() {
		return expression_StringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_String_Value() {
		return (EAttribute)expression_StringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Function() {
		return expression_FunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Function_Function() {
		return (EReference)expression_FunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_TableConstructor() {
		return expression_TableConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_TableConstructor_Fields() {
		return (EReference)expression_TableConstructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_Parameters() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunction_VarArgs() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Body() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctioncall_Arguments() {
		return functioncall_ArgumentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctioncall_Arguments_Arguments() {
		return (EReference)functioncall_ArgumentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Value() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField_AddEntryToTable_Brackets() {
		return field_AddEntryToTable_BracketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_AddEntryToTable_Brackets_IndexExpression() {
		return (EReference)field_AddEntryToTable_BracketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField_AddEntryToTable() {
		return field_AddEntryToTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_AddEntryToTable_Key() {
		return (EAttribute)field_AddEntryToTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField_AppendEntryToTable() {
		return field_AppendEntryToTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLastStatement_ReturnWithValue() {
		return lastStatement_ReturnWithValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLastStatement_ReturnWithValue_ReturnValues() {
		return (EReference)lastStatement_ReturnWithValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_Assignment() {
		return statement_AssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Assignment_Variable() {
		return (EReference)statement_AssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Assignment_Values() {
		return (EReference)statement_AssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_CallMemberFunction() {
		return statement_CallMemberFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_CallMemberFunction_Object() {
		return (EReference)statement_CallMemberFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_CallMemberFunction_MemberFunctionName() {
		return (EAttribute)statement_CallMemberFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_CallMemberFunction_Arguments() {
		return (EReference)statement_CallMemberFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement_CallFunction() {
		return statement_CallFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_CallFunction_Object() {
		return (EReference)statement_CallFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_CallFunction_Arguments() {
		return (EReference)statement_CallFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Or() {
		return expression_OrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Or_Left() {
		return (EReference)expression_OrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Or_Right() {
		return (EReference)expression_OrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_And() {
		return expression_AndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_And_Left() {
		return (EReference)expression_AndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_And_Right() {
		return (EReference)expression_AndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Larger() {
		return expression_LargerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Larger_Left() {
		return (EReference)expression_LargerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Larger_Right() {
		return (EReference)expression_LargerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Larger_Equal() {
		return expression_Larger_EqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Larger_Equal_Left() {
		return (EReference)expression_Larger_EqualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Larger_Equal_Right() {
		return (EReference)expression_Larger_EqualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Smaller() {
		return expression_SmallerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Smaller_Left() {
		return (EReference)expression_SmallerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Smaller_Right() {
		return (EReference)expression_SmallerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Smaller_Equal() {
		return expression_Smaller_EqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Smaller_Equal_Left() {
		return (EReference)expression_Smaller_EqualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Smaller_Equal_Right() {
		return (EReference)expression_Smaller_EqualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Equal() {
		return expression_EqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Equal_Left() {
		return (EReference)expression_EqualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Equal_Right() {
		return (EReference)expression_EqualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Not_Equal() {
		return expression_Not_EqualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Not_Equal_Left() {
		return (EReference)expression_Not_EqualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Not_Equal_Right() {
		return (EReference)expression_Not_EqualEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Concatenation() {
		return expression_ConcatenationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Concatenation_Left() {
		return (EReference)expression_ConcatenationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Concatenation_Right() {
		return (EReference)expression_ConcatenationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Plus() {
		return expression_PlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Plus_Left() {
		return (EReference)expression_PlusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Plus_Right() {
		return (EReference)expression_PlusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Minus() {
		return expression_MinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Minus_Left() {
		return (EReference)expression_MinusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Minus_Right() {
		return (EReference)expression_MinusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Multiplication() {
		return expression_MultiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Multiplication_Left() {
		return (EReference)expression_MultiplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Multiplication_Right() {
		return (EReference)expression_MultiplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Division() {
		return expression_DivisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Division_Left() {
		return (EReference)expression_DivisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Division_Right() {
		return (EReference)expression_DivisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Modulo() {
		return expression_ModuloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Modulo_Left() {
		return (EReference)expression_ModuloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Modulo_Right() {
		return (EReference)expression_ModuloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Negate() {
		return expression_NegateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Negate_Exp() {
		return (EReference)expression_NegateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Length() {
		return expression_LengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Length_Exp() {
		return (EReference)expression_LengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Invert() {
		return expression_InvertEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Invert_Exp() {
		return (EReference)expression_InvertEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_Exponentiation() {
		return expression_ExponentiationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Exponentiation_Left() {
		return (EReference)expression_ExponentiationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Exponentiation_Right() {
		return (EReference)expression_ExponentiationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_CallMemberFunction() {
		return expression_CallMemberFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_CallMemberFunction_Object() {
		return (EReference)expression_CallMemberFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_CallMemberFunction_MemberFunctionName() {
		return (EAttribute)expression_CallMemberFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_CallMemberFunction_Arguments() {
		return (EReference)expression_CallMemberFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_CallFunction() {
		return expression_CallFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_CallFunction_Object() {
		return (EReference)expression_CallFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_CallFunction_Arguments() {
		return (EReference)expression_CallFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_AccessArray() {
		return expression_AccessArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_AccessArray_Array() {
		return (EReference)expression_AccessArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_AccessArray_Index() {
		return (EReference)expression_AccessArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_AccessMember() {
		return expression_AccessMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_AccessMember_Object() {
		return (EReference)expression_AccessMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_AccessMember_MemberName() {
		return (EAttribute)expression_AccessMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression_VariableName() {
		return expression_VariableNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_VariableName_Variable() {
		return (EAttribute)expression_VariableNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBigDecimal() {
		return eBigDecimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBigInteger() {
		return eBigIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBoolean() {
		return eBooleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBooleanObject() {
		return eBooleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEByte() {
		return eByteEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEByteArray() {
		return eByteArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEByteObject() {
		return eByteObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEChar() {
		return eCharEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getECharacterObject() {
		return eCharacterObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDate() {
		return eDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDiagnosticChain() {
		return eDiagnosticChainEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDouble() {
		return eDoubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDoubleObject() {
		return eDoubleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEEList() {
		return eeListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEEnumerator() {
		return eEnumeratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFeatureMap() {
		return eFeatureMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFeatureMapEntry() {
		return eFeatureMapEntryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFloat() {
		return eFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFloatObject() {
		return eFloatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEInt() {
		return eIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEIntegerObject() {
		return eIntegerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEJavaClass() {
		return eJavaClassEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEJavaObject() {
		return eJavaObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getELong() {
		return eLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getELongObject() {
		return eLongObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEMap() {
		return eMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEResource() {
		return eResourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEResourceSet() {
		return eResourceSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEShort() {
		return eShortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEShortObject() {
		return eShortObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEString() {
		return eStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getETreeIterator() {
		return eTreeIteratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEInvocationTargetException() {
		return eInvocationTargetExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityecoreluaFactory getActivityecoreluaFactory() {
		return (ActivityecoreluaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eAttributeEClass = createEClass(EATTRIBUTE);
		createEAttribute(eAttributeEClass, EATTRIBUTE__ID);
		createEReference(eAttributeEClass, EATTRIBUTE__EATTRIBUTE_TYPE);

		eAnnotationEClass = createEClass(EANNOTATION);
		createEAttribute(eAnnotationEClass, EANNOTATION__SOURCE);
		createEReference(eAnnotationEClass, EANNOTATION__DETAILS);
		createEReference(eAnnotationEClass, EANNOTATION__EMODEL_ELEMENT);
		createEReference(eAnnotationEClass, EANNOTATION__CONTENTS);
		createEReference(eAnnotationEClass, EANNOTATION__REFERENCES);

		eClassEClass = createEClass(ECLASS);
		createEAttribute(eClassEClass, ECLASS__ABSTRACT);
		createEAttribute(eClassEClass, ECLASS__INTERFACE);
		createEReference(eClassEClass, ECLASS__ESUPER_TYPES);
		createEReference(eClassEClass, ECLASS__EOPERATIONS);
		createEReference(eClassEClass, ECLASS__EALL_ATTRIBUTES);
		createEReference(eClassEClass, ECLASS__EALL_REFERENCES);
		createEReference(eClassEClass, ECLASS__EREFERENCES);
		createEReference(eClassEClass, ECLASS__EATTRIBUTES);
		createEReference(eClassEClass, ECLASS__EALL_CONTAINMENTS);
		createEReference(eClassEClass, ECLASS__EALL_OPERATIONS);
		createEReference(eClassEClass, ECLASS__EALL_STRUCTURAL_FEATURES);
		createEReference(eClassEClass, ECLASS__EALL_SUPER_TYPES);
		createEReference(eClassEClass, ECLASS__EID_ATTRIBUTE);
		createEReference(eClassEClass, ECLASS__ESTRUCTURAL_FEATURES);
		createEReference(eClassEClass, ECLASS__EGENERIC_SUPER_TYPES);
		createEReference(eClassEClass, ECLASS__EALL_GENERIC_SUPER_TYPES);
		createEOperation(eClassEClass, ECLASS___IS_SUPER_TYPE_OF__ECLASS);
		createEOperation(eClassEClass, ECLASS___GET_FEATURE_COUNT);
		createEOperation(eClassEClass, ECLASS___GET_ESTRUCTURAL_FEATURE__INT);
		createEOperation(eClassEClass, ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE);
		createEOperation(eClassEClass, ECLASS___GET_ESTRUCTURAL_FEATURE__STRING);
		createEOperation(eClassEClass, ECLASS___GET_OPERATION_COUNT);
		createEOperation(eClassEClass, ECLASS___GET_EOPERATION__INT);
		createEOperation(eClassEClass, ECLASS___GET_OPERATION_ID__EOPERATION);
		createEOperation(eClassEClass, ECLASS___GET_OVERRIDE__EOPERATION);

		eClassifierEClass = createEClass(ECLASSIFIER);
		createEAttribute(eClassifierEClass, ECLASSIFIER__INSTANCE_CLASS_NAME);
		createEAttribute(eClassifierEClass, ECLASSIFIER__INSTANCE_CLASS);
		createEAttribute(eClassifierEClass, ECLASSIFIER__DEFAULT_VALUE);
		createEAttribute(eClassifierEClass, ECLASSIFIER__INSTANCE_TYPE_NAME);
		createEReference(eClassifierEClass, ECLASSIFIER__EPACKAGE);
		createEReference(eClassifierEClass, ECLASSIFIER__ETYPE_PARAMETERS);
		createEOperation(eClassifierEClass, ECLASSIFIER___IS_INSTANCE__OBJECT);
		createEOperation(eClassifierEClass, ECLASSIFIER___GET_CLASSIFIER_ID);

		eDataTypeEClass = createEClass(EDATA_TYPE);
		createEAttribute(eDataTypeEClass, EDATA_TYPE__SERIALIZABLE);

		eEnumEClass = createEClass(EENUM);
		createEReference(eEnumEClass, EENUM__ELITERALS);
		createEOperation(eEnumEClass, EENUM___GET_EENUM_LITERAL__STRING);
		createEOperation(eEnumEClass, EENUM___GET_EENUM_LITERAL__INT);
		createEOperation(eEnumEClass, EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING);

		eEnumLiteralEClass = createEClass(EENUM_LITERAL);
		createEAttribute(eEnumLiteralEClass, EENUM_LITERAL__VALUE);
		createEAttribute(eEnumLiteralEClass, EENUM_LITERAL__INSTANCE);
		createEAttribute(eEnumLiteralEClass, EENUM_LITERAL__LITERAL);
		createEReference(eEnumLiteralEClass, EENUM_LITERAL__EENUM);

		eFactoryEClass = createEClass(EFACTORY);
		createEReference(eFactoryEClass, EFACTORY__EPACKAGE);
		createEOperation(eFactoryEClass, EFACTORY___CREATE__ECLASS);
		createEOperation(eFactoryEClass, EFACTORY___CREATE_FROM_STRING__EDATATYPE_STRING);
		createEOperation(eFactoryEClass, EFACTORY___CONVERT_TO_STRING__EDATATYPE_OBJECT);

		eModelElementEClass = createEClass(EMODEL_ELEMENT);
		createEReference(eModelElementEClass, EMODEL_ELEMENT__EANNOTATIONS);
		createEOperation(eModelElementEClass, EMODEL_ELEMENT___GET_EANNOTATION__STRING);

		eNamedElementEClass = createEClass(ENAMED_ELEMENT);
		createEAttribute(eNamedElementEClass, ENAMED_ELEMENT__NAME);

		eObjectEClass = createEClass(EOBJECT);
		createEOperation(eObjectEClass, EOBJECT___EE_CLASS);

		eOperationEClass = createEClass(EOPERATION);
		createEReference(eOperationEClass, EOPERATION__ECONTAINING_CLASS);
		createEReference(eOperationEClass, EOPERATION__ETYPE_PARAMETERS);
		createEReference(eOperationEClass, EOPERATION__EPARAMETERS);
		createEReference(eOperationEClass, EOPERATION__ACTIVITY);
		createEReference(eOperationEClass, EOPERATION__EEXCEPTIONS);
		createEReference(eOperationEClass, EOPERATION__EGENERIC_EXCEPTIONS);
		createEOperation(eOperationEClass, EOPERATION___GET_OPERATION_ID);
		createEOperation(eOperationEClass, EOPERATION___IS_OVERRIDE_OF__EOPERATION);

		ePackageEClass = createEClass(EPACKAGE);
		createEAttribute(ePackageEClass, EPACKAGE__NS_URI);
		createEAttribute(ePackageEClass, EPACKAGE__NS_PREFIX);
		createEReference(ePackageEClass, EPACKAGE__EFACTORY_INSTANCE);
		createEReference(ePackageEClass, EPACKAGE__ECLASSIFIERS);
		createEReference(ePackageEClass, EPACKAGE__ESUBPACKAGES);
		createEReference(ePackageEClass, EPACKAGE__ESUPER_PACKAGE);
		createEOperation(ePackageEClass, EPACKAGE___GET_ECLASSIFIER__STRING);

		eParameterEClass = createEClass(EPARAMETER);
		createEReference(eParameterEClass, EPARAMETER__EOPERATION);

		eReferenceEClass = createEClass(EREFERENCE);
		createEAttribute(eReferenceEClass, EREFERENCE__CONTAINMENT);
		createEAttribute(eReferenceEClass, EREFERENCE__CONTAINER);
		createEAttribute(eReferenceEClass, EREFERENCE__RESOLVE_PROXIES);
		createEReference(eReferenceEClass, EREFERENCE__EOPPOSITE);
		createEReference(eReferenceEClass, EREFERENCE__EREFERENCE_TYPE);
		createEReference(eReferenceEClass, EREFERENCE__EKEYS);

		eStructuralFeatureEClass = createEClass(ESTRUCTURAL_FEATURE);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__CHANGEABLE);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__VOLATILE);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__TRANSIENT);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__DEFAULT_VALUE);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__UNSETTABLE);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__DERIVED);
		createEReference(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__ECONTAINING_CLASS);
		createEOperation(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE___GET_FEATURE_ID);
		createEOperation(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE___GET_CONTAINER_CLASS);

		eTypedElementEClass = createEClass(ETYPED_ELEMENT);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__ORDERED);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__UNIQUE);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__LOWER_BOUND);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__UPPER_BOUND);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__MANY);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__REQUIRED);
		createEReference(eTypedElementEClass, ETYPED_ELEMENT__ETYPE);
		createEReference(eTypedElementEClass, ETYPED_ELEMENT__EGENERIC_TYPE);

		eStringToStringMapEntryEClass = createEClass(ESTRING_TO_STRING_MAP_ENTRY);
		createEAttribute(eStringToStringMapEntryEClass, ESTRING_TO_STRING_MAP_ENTRY__KEY);
		createEAttribute(eStringToStringMapEntryEClass, ESTRING_TO_STRING_MAP_ENTRY__VALUE);

		eGenericTypeEClass = createEClass(EGENERIC_TYPE);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__EUPPER_BOUND);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ETYPE_ARGUMENTS);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ERAW_TYPE);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ELOWER_BOUND);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ETYPE_PARAMETER);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ECLASSIFIER);

		eTypeParameterEClass = createEClass(ETYPE_PARAMETER);
		createEReference(eTypeParameterEClass, ETYPE_PARAMETER__EBOUNDS);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__NODES);
		createEReference(activityEClass, ACTIVITY__EDGES);
		createEReference(activityEClass, ACTIVITY__LOCALS);
		createEReference(activityEClass, ACTIVITY__INPUTS);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OUTGOING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__ACTIVITY);
		createEAttribute(activityNodeEClass, ACTIVITY_NODE__RUNNING);

		activityEdgeEClass = createEClass(ACTIVITY_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEReference(controlFlowEClass, CONTROL_FLOW__GUARD);

		controlNodeEClass = createEClass(CONTROL_NODE);

		executableNodeEClass = createEClass(EXECUTABLE_NODE);

		actionEClass = createEClass(ACTION);

		opaqueActionEClass = createEClass(OPAQUE_ACTION);
		createEReference(opaqueActionEClass, OPAQUE_ACTION__EXPRESSIONS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		initialNodeEClass = createEClass(INITIAL_NODE);

		finalNodeEClass = createEClass(FINAL_NODE);

		activityFinalNodeEClass = createEClass(ACTIVITY_FINAL_NODE);

		forkNodeEClass = createEClass(FORK_NODE);

		joinNodeEClass = createEClass(JOIN_NODE);

		mergeNodeEClass = createEClass(MERGE_NODE);

		decisionNodeEClass = createEClass(DECISION_NODE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__INITIAL_VALUE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEReference(variableEClass, VARIABLE__CURRENT_VALUE);

		integerVariableEClass = createEClass(INTEGER_VARIABLE);

		booleanVariableEClass = createEClass(BOOLEAN_VARIABLE);

		valueEClass = createEClass(VALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__VALUE);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__VALUE);

		inputValueEClass = createEClass(INPUT_VALUE);
		createEReference(inputValueEClass, INPUT_VALUE__VALUE);
		createEReference(inputValueEClass, INPUT_VALUE__VARIABLE);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__INPUT_VALUES);

		chunkEClass = createEClass(CHUNK);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__STATEMENTS);
		createEReference(blockEClass, BLOCK__RETURN_VALUE);

		lastStatementEClass = createEClass(LAST_STATEMENT);

		lastStatement_ReturnEClass = createEClass(LAST_STATEMENT_RETURN);

		lastStatement_BreakEClass = createEClass(LAST_STATEMENT_BREAK);

		statementEClass = createEClass(STATEMENT);

		statement_BlockEClass = createEClass(STATEMENT_BLOCK);
		createEReference(statement_BlockEClass, STATEMENT_BLOCK__BLOCK);

		statement_WhileEClass = createEClass(STATEMENT_WHILE);
		createEReference(statement_WhileEClass, STATEMENT_WHILE__EXPRESSION);
		createEReference(statement_WhileEClass, STATEMENT_WHILE__BLOCK);

		statement_RepeatEClass = createEClass(STATEMENT_REPEAT);
		createEReference(statement_RepeatEClass, STATEMENT_REPEAT__BLOCK);
		createEReference(statement_RepeatEClass, STATEMENT_REPEAT__EXPRESSION);

		statement_If_Then_ElseEClass = createEClass(STATEMENT_IF_THEN_ELSE);
		createEReference(statement_If_Then_ElseEClass, STATEMENT_IF_THEN_ELSE__IF_EXPRESSION);
		createEReference(statement_If_Then_ElseEClass, STATEMENT_IF_THEN_ELSE__IF_BLOCK);
		createEReference(statement_If_Then_ElseEClass, STATEMENT_IF_THEN_ELSE__ELSE_IF);
		createEReference(statement_If_Then_ElseEClass, STATEMENT_IF_THEN_ELSE__ELSE_BLOCK);

		statement_If_Then_Else_ElseIfPartEClass = createEClass(STATEMENT_IF_THEN_ELSE_ELSE_IF_PART);
		createEReference(statement_If_Then_Else_ElseIfPartEClass, STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION);
		createEReference(statement_If_Then_Else_ElseIfPartEClass, STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK);

		statement_For_NumericEClass = createEClass(STATEMENT_FOR_NUMERIC);
		createEAttribute(statement_For_NumericEClass, STATEMENT_FOR_NUMERIC__ITERATOR_NAME);
		createEReference(statement_For_NumericEClass, STATEMENT_FOR_NUMERIC__START_EXPR);
		createEReference(statement_For_NumericEClass, STATEMENT_FOR_NUMERIC__UNTIL_EXPR);
		createEReference(statement_For_NumericEClass, STATEMENT_FOR_NUMERIC__STEP_EXPR);
		createEReference(statement_For_NumericEClass, STATEMENT_FOR_NUMERIC__BLOCK);

		statement_For_GenericEClass = createEClass(STATEMENT_FOR_GENERIC);
		createEAttribute(statement_For_GenericEClass, STATEMENT_FOR_GENERIC__NAMES);
		createEReference(statement_For_GenericEClass, STATEMENT_FOR_GENERIC__EXPRESSIONS);
		createEReference(statement_For_GenericEClass, STATEMENT_FOR_GENERIC__BLOCK);

		statement_GlobalFunction_DeclarationEClass = createEClass(STATEMENT_GLOBAL_FUNCTION_DECLARATION);
		createEAttribute(statement_GlobalFunction_DeclarationEClass, STATEMENT_GLOBAL_FUNCTION_DECLARATION__PREFIX);
		createEAttribute(statement_GlobalFunction_DeclarationEClass, STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION_NAME);
		createEReference(statement_GlobalFunction_DeclarationEClass, STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION);

		statement_LocalFunction_DeclarationEClass = createEClass(STATEMENT_LOCAL_FUNCTION_DECLARATION);
		createEAttribute(statement_LocalFunction_DeclarationEClass, STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME);
		createEReference(statement_LocalFunction_DeclarationEClass, STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION);

		statement_Local_Variable_DeclarationEClass = createEClass(STATEMENT_LOCAL_VARIABLE_DECLARATION);
		createEAttribute(statement_Local_Variable_DeclarationEClass, STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES);
		createEReference(statement_Local_Variable_DeclarationEClass, STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE);

		statement_FunctioncallOrAssignmentEClass = createEClass(STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT);

		expressionEClass = createEClass(EXPRESSION);

		expression_NilEClass = createEClass(EXPRESSION_NIL);

		expression_TrueEClass = createEClass(EXPRESSION_TRUE);

		expression_FalseEClass = createEClass(EXPRESSION_FALSE);

		expression_NumberEClass = createEClass(EXPRESSION_NUMBER);
		createEAttribute(expression_NumberEClass, EXPRESSION_NUMBER__VALUE);

		expression_VarArgsEClass = createEClass(EXPRESSION_VAR_ARGS);

		expression_StringEClass = createEClass(EXPRESSION_STRING);
		createEAttribute(expression_StringEClass, EXPRESSION_STRING__VALUE);

		expression_FunctionEClass = createEClass(EXPRESSION_FUNCTION);
		createEReference(expression_FunctionEClass, EXPRESSION_FUNCTION__FUNCTION);

		expression_TableConstructorEClass = createEClass(EXPRESSION_TABLE_CONSTRUCTOR);
		createEReference(expression_TableConstructorEClass, EXPRESSION_TABLE_CONSTRUCTOR__FIELDS);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__PARAMETERS);
		createEAttribute(functionEClass, FUNCTION__VAR_ARGS);
		createEReference(functionEClass, FUNCTION__BODY);

		functioncall_ArgumentsEClass = createEClass(FUNCTIONCALL_ARGUMENTS);
		createEReference(functioncall_ArgumentsEClass, FUNCTIONCALL_ARGUMENTS__ARGUMENTS);

		fieldEClass = createEClass(FIELD);
		createEReference(fieldEClass, FIELD__VALUE);

		field_AddEntryToTable_BracketsEClass = createEClass(FIELD_ADD_ENTRY_TO_TABLE_BRACKETS);
		createEReference(field_AddEntryToTable_BracketsEClass, FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION);

		field_AddEntryToTableEClass = createEClass(FIELD_ADD_ENTRY_TO_TABLE);
		createEAttribute(field_AddEntryToTableEClass, FIELD_ADD_ENTRY_TO_TABLE__KEY);

		field_AppendEntryToTableEClass = createEClass(FIELD_APPEND_ENTRY_TO_TABLE);

		lastStatement_ReturnWithValueEClass = createEClass(LAST_STATEMENT_RETURN_WITH_VALUE);
		createEReference(lastStatement_ReturnWithValueEClass, LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES);

		statement_AssignmentEClass = createEClass(STATEMENT_ASSIGNMENT);
		createEReference(statement_AssignmentEClass, STATEMENT_ASSIGNMENT__VARIABLE);
		createEReference(statement_AssignmentEClass, STATEMENT_ASSIGNMENT__VALUES);

		statement_CallMemberFunctionEClass = createEClass(STATEMENT_CALL_MEMBER_FUNCTION);
		createEReference(statement_CallMemberFunctionEClass, STATEMENT_CALL_MEMBER_FUNCTION__OBJECT);
		createEAttribute(statement_CallMemberFunctionEClass, STATEMENT_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME);
		createEReference(statement_CallMemberFunctionEClass, STATEMENT_CALL_MEMBER_FUNCTION__ARGUMENTS);

		statement_CallFunctionEClass = createEClass(STATEMENT_CALL_FUNCTION);
		createEReference(statement_CallFunctionEClass, STATEMENT_CALL_FUNCTION__OBJECT);
		createEReference(statement_CallFunctionEClass, STATEMENT_CALL_FUNCTION__ARGUMENTS);

		expression_OrEClass = createEClass(EXPRESSION_OR);
		createEReference(expression_OrEClass, EXPRESSION_OR__LEFT);
		createEReference(expression_OrEClass, EXPRESSION_OR__RIGHT);

		expression_AndEClass = createEClass(EXPRESSION_AND);
		createEReference(expression_AndEClass, EXPRESSION_AND__LEFT);
		createEReference(expression_AndEClass, EXPRESSION_AND__RIGHT);

		expression_LargerEClass = createEClass(EXPRESSION_LARGER);
		createEReference(expression_LargerEClass, EXPRESSION_LARGER__LEFT);
		createEReference(expression_LargerEClass, EXPRESSION_LARGER__RIGHT);

		expression_Larger_EqualEClass = createEClass(EXPRESSION_LARGER_EQUAL);
		createEReference(expression_Larger_EqualEClass, EXPRESSION_LARGER_EQUAL__LEFT);
		createEReference(expression_Larger_EqualEClass, EXPRESSION_LARGER_EQUAL__RIGHT);

		expression_SmallerEClass = createEClass(EXPRESSION_SMALLER);
		createEReference(expression_SmallerEClass, EXPRESSION_SMALLER__LEFT);
		createEReference(expression_SmallerEClass, EXPRESSION_SMALLER__RIGHT);

		expression_Smaller_EqualEClass = createEClass(EXPRESSION_SMALLER_EQUAL);
		createEReference(expression_Smaller_EqualEClass, EXPRESSION_SMALLER_EQUAL__LEFT);
		createEReference(expression_Smaller_EqualEClass, EXPRESSION_SMALLER_EQUAL__RIGHT);

		expression_EqualEClass = createEClass(EXPRESSION_EQUAL);
		createEReference(expression_EqualEClass, EXPRESSION_EQUAL__LEFT);
		createEReference(expression_EqualEClass, EXPRESSION_EQUAL__RIGHT);

		expression_Not_EqualEClass = createEClass(EXPRESSION_NOT_EQUAL);
		createEReference(expression_Not_EqualEClass, EXPRESSION_NOT_EQUAL__LEFT);
		createEReference(expression_Not_EqualEClass, EXPRESSION_NOT_EQUAL__RIGHT);

		expression_ConcatenationEClass = createEClass(EXPRESSION_CONCATENATION);
		createEReference(expression_ConcatenationEClass, EXPRESSION_CONCATENATION__LEFT);
		createEReference(expression_ConcatenationEClass, EXPRESSION_CONCATENATION__RIGHT);

		expression_PlusEClass = createEClass(EXPRESSION_PLUS);
		createEReference(expression_PlusEClass, EXPRESSION_PLUS__LEFT);
		createEReference(expression_PlusEClass, EXPRESSION_PLUS__RIGHT);

		expression_MinusEClass = createEClass(EXPRESSION_MINUS);
		createEReference(expression_MinusEClass, EXPRESSION_MINUS__LEFT);
		createEReference(expression_MinusEClass, EXPRESSION_MINUS__RIGHT);

		expression_MultiplicationEClass = createEClass(EXPRESSION_MULTIPLICATION);
		createEReference(expression_MultiplicationEClass, EXPRESSION_MULTIPLICATION__LEFT);
		createEReference(expression_MultiplicationEClass, EXPRESSION_MULTIPLICATION__RIGHT);

		expression_DivisionEClass = createEClass(EXPRESSION_DIVISION);
		createEReference(expression_DivisionEClass, EXPRESSION_DIVISION__LEFT);
		createEReference(expression_DivisionEClass, EXPRESSION_DIVISION__RIGHT);

		expression_ModuloEClass = createEClass(EXPRESSION_MODULO);
		createEReference(expression_ModuloEClass, EXPRESSION_MODULO__LEFT);
		createEReference(expression_ModuloEClass, EXPRESSION_MODULO__RIGHT);

		expression_NegateEClass = createEClass(EXPRESSION_NEGATE);
		createEReference(expression_NegateEClass, EXPRESSION_NEGATE__EXP);

		expression_LengthEClass = createEClass(EXPRESSION_LENGTH);
		createEReference(expression_LengthEClass, EXPRESSION_LENGTH__EXP);

		expression_InvertEClass = createEClass(EXPRESSION_INVERT);
		createEReference(expression_InvertEClass, EXPRESSION_INVERT__EXP);

		expression_ExponentiationEClass = createEClass(EXPRESSION_EXPONENTIATION);
		createEReference(expression_ExponentiationEClass, EXPRESSION_EXPONENTIATION__LEFT);
		createEReference(expression_ExponentiationEClass, EXPRESSION_EXPONENTIATION__RIGHT);

		expression_CallMemberFunctionEClass = createEClass(EXPRESSION_CALL_MEMBER_FUNCTION);
		createEReference(expression_CallMemberFunctionEClass, EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT);
		createEAttribute(expression_CallMemberFunctionEClass, EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME);
		createEReference(expression_CallMemberFunctionEClass, EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS);

		expression_CallFunctionEClass = createEClass(EXPRESSION_CALL_FUNCTION);
		createEReference(expression_CallFunctionEClass, EXPRESSION_CALL_FUNCTION__OBJECT);
		createEReference(expression_CallFunctionEClass, EXPRESSION_CALL_FUNCTION__ARGUMENTS);

		expression_AccessArrayEClass = createEClass(EXPRESSION_ACCESS_ARRAY);
		createEReference(expression_AccessArrayEClass, EXPRESSION_ACCESS_ARRAY__ARRAY);
		createEReference(expression_AccessArrayEClass, EXPRESSION_ACCESS_ARRAY__INDEX);

		expression_AccessMemberEClass = createEClass(EXPRESSION_ACCESS_MEMBER);
		createEReference(expression_AccessMemberEClass, EXPRESSION_ACCESS_MEMBER__OBJECT);
		createEAttribute(expression_AccessMemberEClass, EXPRESSION_ACCESS_MEMBER__MEMBER_NAME);

		expression_VariableNameEClass = createEClass(EXPRESSION_VARIABLE_NAME);
		createEAttribute(expression_VariableNameEClass, EXPRESSION_VARIABLE_NAME__VARIABLE);

		// Create data types
		eBigDecimalEDataType = createEDataType(EBIG_DECIMAL);
		eBigIntegerEDataType = createEDataType(EBIG_INTEGER);
		eBooleanEDataType = createEDataType(EBOOLEAN);
		eBooleanObjectEDataType = createEDataType(EBOOLEAN_OBJECT);
		eByteEDataType = createEDataType(EBYTE);
		eByteArrayEDataType = createEDataType(EBYTE_ARRAY);
		eByteObjectEDataType = createEDataType(EBYTE_OBJECT);
		eCharEDataType = createEDataType(ECHAR);
		eCharacterObjectEDataType = createEDataType(ECHARACTER_OBJECT);
		eDateEDataType = createEDataType(EDATE);
		eDiagnosticChainEDataType = createEDataType(EDIAGNOSTIC_CHAIN);
		eDoubleEDataType = createEDataType(EDOUBLE);
		eDoubleObjectEDataType = createEDataType(EDOUBLE_OBJECT);
		eeListEDataType = createEDataType(EE_LIST);
		eEnumeratorEDataType = createEDataType(EENUMERATOR);
		eFeatureMapEDataType = createEDataType(EFEATURE_MAP);
		eFeatureMapEntryEDataType = createEDataType(EFEATURE_MAP_ENTRY);
		eFloatEDataType = createEDataType(EFLOAT);
		eFloatObjectEDataType = createEDataType(EFLOAT_OBJECT);
		eIntEDataType = createEDataType(EINT);
		eIntegerObjectEDataType = createEDataType(EINTEGER_OBJECT);
		eJavaClassEDataType = createEDataType(EJAVA_CLASS);
		eJavaObjectEDataType = createEDataType(EJAVA_OBJECT);
		eLongEDataType = createEDataType(ELONG);
		eLongObjectEDataType = createEDataType(ELONG_OBJECT);
		eMapEDataType = createEDataType(EMAP);
		eResourceEDataType = createEDataType(ERESOURCE);
		eResourceSetEDataType = createEDataType(ERESOURCE_SET);
		eShortEDataType = createEDataType(ESHORT);
		eShortObjectEDataType = createEDataType(ESHORT_OBJECT);
		eStringEDataType = createEDataType(ESTRING);
		eTreeIteratorEDataType = createEDataType(ETREE_ITERATOR);
		eInvocationTargetExceptionEDataType = createEDataType(EINVOCATION_TARGET_EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		addETypeParameter(eeListEDataType, "E");
		addETypeParameter(eJavaClassEDataType, "T");
		addETypeParameter(eMapEDataType, "K");
		addETypeParameter(eMapEDataType, "V");
		addETypeParameter(eTreeIteratorEDataType, "E");

		// Set bounds for type parameters

		// Add supertypes to classes
		eAttributeEClass.getESuperTypes().add(this.getEStructuralFeature());
		eAnnotationEClass.getESuperTypes().add(this.getEModelElement());
		eClassEClass.getESuperTypes().add(this.getEClassifier());
		eClassifierEClass.getESuperTypes().add(this.getENamedElement());
		eDataTypeEClass.getESuperTypes().add(this.getEClassifier());
		eEnumEClass.getESuperTypes().add(this.getEDataType());
		eEnumLiteralEClass.getESuperTypes().add(this.getENamedElement());
		eFactoryEClass.getESuperTypes().add(this.getEModelElement());
		eNamedElementEClass.getESuperTypes().add(this.getEModelElement());
		eOperationEClass.getESuperTypes().add(this.getETypedElement());
		ePackageEClass.getESuperTypes().add(this.getENamedElement());
		eParameterEClass.getESuperTypes().add(this.getETypedElement());
		eReferenceEClass.getESuperTypes().add(this.getEStructuralFeature());
		eStructuralFeatureEClass.getESuperTypes().add(this.getETypedElement());
		eTypedElementEClass.getESuperTypes().add(this.getENamedElement());
		eTypeParameterEClass.getESuperTypes().add(this.getENamedElement());
		activityEClass.getESuperTypes().add(this.getNamedElement());
		activityNodeEClass.getESuperTypes().add(this.getNamedElement());
		activityEdgeEClass.getESuperTypes().add(this.getNamedElement());
		controlFlowEClass.getESuperTypes().add(this.getActivityEdge());
		controlNodeEClass.getESuperTypes().add(this.getActivityNode());
		executableNodeEClass.getESuperTypes().add(this.getActivityNode());
		actionEClass.getESuperTypes().add(this.getExecutableNode());
		opaqueActionEClass.getESuperTypes().add(this.getAction());
		initialNodeEClass.getESuperTypes().add(this.getControlNode());
		finalNodeEClass.getESuperTypes().add(this.getControlNode());
		activityFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		forkNodeEClass.getESuperTypes().add(this.getControlNode());
		joinNodeEClass.getESuperTypes().add(this.getControlNode());
		mergeNodeEClass.getESuperTypes().add(this.getControlNode());
		decisionNodeEClass.getESuperTypes().add(this.getControlNode());
		integerVariableEClass.getESuperTypes().add(this.getVariable());
		booleanVariableEClass.getESuperTypes().add(this.getVariable());
		booleanValueEClass.getESuperTypes().add(this.getValue());
		integerValueEClass.getESuperTypes().add(this.getValue());
		blockEClass.getESuperTypes().add(this.getChunk());
		lastStatement_ReturnEClass.getESuperTypes().add(this.getLastStatement());
		lastStatement_BreakEClass.getESuperTypes().add(this.getLastStatement());
		statement_BlockEClass.getESuperTypes().add(this.getStatement());
		statement_WhileEClass.getESuperTypes().add(this.getStatement());
		statement_RepeatEClass.getESuperTypes().add(this.getStatement());
		statement_If_Then_ElseEClass.getESuperTypes().add(this.getStatement());
		statement_For_NumericEClass.getESuperTypes().add(this.getStatement());
		statement_For_GenericEClass.getESuperTypes().add(this.getStatement());
		statement_GlobalFunction_DeclarationEClass.getESuperTypes().add(this.getStatement());
		statement_LocalFunction_DeclarationEClass.getESuperTypes().add(this.getStatement());
		statement_Local_Variable_DeclarationEClass.getESuperTypes().add(this.getStatement());
		statement_FunctioncallOrAssignmentEClass.getESuperTypes().add(this.getStatement());
		expressionEClass.getESuperTypes().add(this.getStatement_FunctioncallOrAssignment());
		expression_NilEClass.getESuperTypes().add(this.getExpression());
		expression_TrueEClass.getESuperTypes().add(this.getExpression());
		expression_FalseEClass.getESuperTypes().add(this.getExpression());
		expression_NumberEClass.getESuperTypes().add(this.getExpression());
		expression_VarArgsEClass.getESuperTypes().add(this.getExpression());
		expression_StringEClass.getESuperTypes().add(this.getExpression());
		expression_FunctionEClass.getESuperTypes().add(this.getExpression());
		expression_TableConstructorEClass.getESuperTypes().add(this.getExpression());
		field_AddEntryToTable_BracketsEClass.getESuperTypes().add(this.getField());
		field_AddEntryToTableEClass.getESuperTypes().add(this.getField());
		field_AppendEntryToTableEClass.getESuperTypes().add(this.getField());
		lastStatement_ReturnWithValueEClass.getESuperTypes().add(this.getLastStatement_Return());
		statement_AssignmentEClass.getESuperTypes().add(this.getStatement_FunctioncallOrAssignment());
		statement_CallMemberFunctionEClass.getESuperTypes().add(this.getStatement_FunctioncallOrAssignment());
		statement_CallFunctionEClass.getESuperTypes().add(this.getStatement_FunctioncallOrAssignment());
		expression_OrEClass.getESuperTypes().add(this.getExpression());
		expression_AndEClass.getESuperTypes().add(this.getExpression());
		expression_LargerEClass.getESuperTypes().add(this.getExpression());
		expression_Larger_EqualEClass.getESuperTypes().add(this.getExpression());
		expression_SmallerEClass.getESuperTypes().add(this.getExpression());
		expression_Smaller_EqualEClass.getESuperTypes().add(this.getExpression());
		expression_EqualEClass.getESuperTypes().add(this.getExpression());
		expression_Not_EqualEClass.getESuperTypes().add(this.getExpression());
		expression_ConcatenationEClass.getESuperTypes().add(this.getExpression());
		expression_PlusEClass.getESuperTypes().add(this.getExpression());
		expression_MinusEClass.getESuperTypes().add(this.getExpression());
		expression_MultiplicationEClass.getESuperTypes().add(this.getExpression());
		expression_DivisionEClass.getESuperTypes().add(this.getExpression());
		expression_ModuloEClass.getESuperTypes().add(this.getExpression());
		expression_NegateEClass.getESuperTypes().add(this.getExpression());
		expression_LengthEClass.getESuperTypes().add(this.getExpression());
		expression_InvertEClass.getESuperTypes().add(this.getExpression());
		expression_ExponentiationEClass.getESuperTypes().add(this.getExpression());
		expression_CallMemberFunctionEClass.getESuperTypes().add(this.getExpression());
		expression_CallFunctionEClass.getESuperTypes().add(this.getExpression());
		expression_AccessArrayEClass.getESuperTypes().add(this.getExpression());
		expression_AccessMemberEClass.getESuperTypes().add(this.getExpression());
		expression_VariableNameEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(eAttributeEClass, activityecorelua.EAttribute.class, "EAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAttribute_ID(), this.getEBoolean(), "iD", null, 0, 1, activityecorelua.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttribute_EAttributeType(), this.getEDataType(), null, "eAttributeType", null, 1, 1, activityecorelua.EAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eAnnotationEClass, EAnnotation.class, "EAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAnnotation_Source(), this.getEString(), "source", null, 0, 1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAnnotation_Details(), this.getEStringToStringMapEntry(), null, "details", null, 0, -1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAnnotation_EModelElement(), this.getEModelElement(), this.getEModelElement_EAnnotations(), "eModelElement", null, 0, 1, EAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAnnotation_Contents(), this.getEObject(), null, "contents", null, 0, -1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAnnotation_References(), this.getEObject(), null, "references", null, 0, -1, EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassEClass, activityecorelua.EClass.class, "EClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEClass_Abstract(), this.getEBoolean(), "abstract", null, 0, 1, activityecorelua.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClass_Interface(), this.getEBoolean(), "interface", null, 0, 1, activityecorelua.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_ESuperTypes(), this.getEClass(), null, "eSuperTypes", null, 0, -1, activityecorelua.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EOperations(), this.getEOperation(), this.getEOperation_EContainingClass(), "eOperations", null, 0, -1, activityecorelua.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllAttributes(), this.getEAttribute(), null, "eAllAttributes", null, 0, -1, activityecorelua.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllReferences(), this.getEReference(), null, "eAllReferences", null, 0, -1, activityecorelua.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EReferences(), this.getEReference(), null, "eReferences", null, 0, -1, activityecorelua.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAttributes(), this.getEAttribute(), null, "eAttributes", null, 0, -1, activityecorelua.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllContainments(), this.getEReference(), null, "eAllContainments", null, 0, -1, activityecorelua.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllOperations(), this.getEOperation(), null, "eAllOperations", null, 0, -1, activityecorelua.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllStructuralFeatures(), this.getEStructuralFeature(), null, "eAllStructuralFeatures", null, 0, -1, activityecorelua.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllSuperTypes(), this.getEClass(), null, "eAllSuperTypes", null, 0, -1, activityecorelua.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EIDAttribute(), this.getEAttribute(), null, "eIDAttribute", null, 0, 1, activityecorelua.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EStructuralFeatures(), this.getEStructuralFeature(), this.getEStructuralFeature_EContainingClass(), "eStructuralFeatures", null, 0, -1, activityecorelua.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EGenericSuperTypes(), this.getEGenericType(), null, "eGenericSuperTypes", null, 0, -1, activityecorelua.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EAllGenericSuperTypes(), this.getEGenericType(), null, "eAllGenericSuperTypes", null, 0, -1, activityecorelua.EClass.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEClass__IsSuperTypeOf__EClass(), this.getEBoolean(), "isSuperTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEClass(), "someClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEClass__GetFeatureCount(), this.getEInt(), "getFeatureCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEClass__GetEStructuralFeature__int(), this.getEStructuralFeature(), "getEStructuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEInt(), "featureID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEClass__GetFeatureID__EStructuralFeature(), this.getEInt(), "getFeatureID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStructuralFeature(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEClass__GetEStructuralFeature__String(), this.getEStructuralFeature(), "getEStructuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEString(), "featureName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEClass__GetOperationCount(), this.getEInt(), "getOperationCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEClass__GetEOperation__int(), this.getEOperation(), "getEOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEInt(), "operationID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEClass__GetOperationID__EOperation(), this.getEInt(), "getOperationID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEOperation(), "operation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEClass__GetOverride__EOperation(), this.getEOperation(), "getOverride", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEOperation(), "operation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eClassifierEClass, EClassifier.class, "EClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEClassifier_InstanceClassName(), this.getEString(), "instanceClassName", null, 0, 1, EClassifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getEClassifier_InstanceClass(), g1, "instanceClass", null, 0, 1, EClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassifier_DefaultValue(), this.getEJavaObject(), "defaultValue", null, 0, 1, EClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassifier_InstanceTypeName(), this.getEString(), "instanceTypeName", null, 0, 1, EClassifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassifier_EPackage(), this.getEPackage(), this.getEPackage_EClassifiers(), "ePackage", null, 0, 1, EClassifier.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassifier_ETypeParameters(), this.getETypeParameter(), null, "eTypeParameters", null, 0, -1, EClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEClassifier__IsInstance__Object(), this.getEBoolean(), "isInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEClassifier__GetClassifierID(), this.getEInt(), "getClassifierID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eDataTypeEClass, activityecorelua.EDataType.class, "EDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDataType_Serializable(), this.getEBoolean(), "serializable", "true", 0, 1, activityecorelua.EDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEnumEClass, EEnum.class, "EEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEnum_ELiterals(), this.getEEnumLiteral(), this.getEEnumLiteral_EEnum(), "eLiterals", null, 0, -1, EEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEEnum__GetEEnumLiteral__String(), this.getEEnumLiteral(), "getEEnumLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEEnum__GetEEnumLiteral__int(), this.getEEnumLiteral(), "getEEnumLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEInt(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEEnum__GetEEnumLiteralByLiteral__String(), this.getEEnumLiteral(), "getEEnumLiteralByLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEString(), "literal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eEnumLiteralEClass, EEnumLiteral.class, "EEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEEnumLiteral_Value(), this.getEInt(), "value", null, 0, 1, EEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEnumLiteral_Instance(), this.getEEnumerator(), "instance", null, 0, 1, EEnumLiteral.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEnumLiteral_Literal(), this.getEString(), "literal", null, 0, 1, EEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEnumLiteral_EEnum(), this.getEEnum(), this.getEEnum_ELiterals(), "eEnum", null, 0, 1, EEnumLiteral.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eFactoryEClass, EFactory.class, "EFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEFactory_EPackage(), this.getEPackage(), this.getEPackage_EFactoryInstance(), "ePackage", null, 1, 1, EFactory.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEFactory__Create__EClass(), this.getEObject(), "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEFactory__CreateFromString__EDataType_String(), this.getEJavaObject(), "createFromString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEDataType(), "eDataType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEString(), "literalValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEFactory__ConvertToString__EDataType_Object(), this.getEString(), "convertToString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEDataType(), "eDataType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEJavaObject(), "instanceValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eModelElementEClass, EModelElement.class, "EModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEModelElement_EAnnotations(), this.getEAnnotation(), this.getEAnnotation_EModelElement(), "eAnnotations", null, 0, -1, EModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEModelElement__GetEAnnotation__String(), this.getEAnnotation(), "getEAnnotation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEString(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eNamedElementEClass, ENamedElement.class, "ENamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENamedElement_Name(), this.getEString(), "name", null, 0, 1, ENamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eObjectEClass, EObject.class, "EObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEObject__EeClass(), this.getEClass(), "eeClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eOperationEClass, activityecorelua.EOperation.class, "EOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEOperation_EContainingClass(), this.getEClass(), this.getEClass_EOperations(), "eContainingClass", null, 0, 1, activityecorelua.EOperation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_ETypeParameters(), this.getETypeParameter(), null, "eTypeParameters", null, 0, -1, activityecorelua.EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_EParameters(), this.getEParameter(), this.getEParameter_EOperation(), "eParameters", null, 0, -1, activityecorelua.EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_Activity(), this.getActivity(), null, "activity", null, 1, 1, activityecorelua.EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_EExceptions(), this.getEClassifier(), null, "eExceptions", null, 0, -1, activityecorelua.EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_EGenericExceptions(), this.getEGenericType(), null, "eGenericExceptions", null, 0, -1, activityecorelua.EOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEOperation__GetOperationID(), this.getEInt(), "getOperationID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEOperation__IsOverrideOf__EOperation(), this.getEBoolean(), "isOverrideOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEOperation(), "someOperation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ePackageEClass, activityecorelua.EPackage.class, "EPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPackage_NsURI(), this.getEString(), "nsURI", null, 0, 1, activityecorelua.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPackage_NsPrefix(), this.getEString(), "nsPrefix", null, 0, 1, activityecorelua.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_EFactoryInstance(), this.getEFactory(), this.getEFactory_EPackage(), "eFactoryInstance", null, 1, 1, activityecorelua.EPackage.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_EClassifiers(), this.getEClassifier(), this.getEClassifier_EPackage(), "eClassifiers", null, 0, -1, activityecorelua.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_ESubpackages(), this.getEPackage(), this.getEPackage_ESuperPackage(), "eSubpackages", null, 0, -1, activityecorelua.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_ESuperPackage(), this.getEPackage(), this.getEPackage_ESubpackages(), "eSuperPackage", null, 0, 1, activityecorelua.EPackage.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEPackage__GetEClassifier__String(), this.getEClassifier(), "getEClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eParameterEClass, EParameter.class, "EParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEParameter_EOperation(), this.getEOperation(), this.getEOperation_EParameters(), "eOperation", null, 0, 1, EParameter.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eReferenceEClass, activityecorelua.EReference.class, "EReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEReference_Containment(), this.getEBoolean(), "containment", null, 0, 1, activityecorelua.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReference_Container(), this.getEBoolean(), "container", null, 0, 1, activityecorelua.EReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReference_ResolveProxies(), this.getEBoolean(), "resolveProxies", "true", 0, 1, activityecorelua.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEReference_EOpposite(), this.getEReference(), null, "eOpposite", null, 0, 1, activityecorelua.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEReference_EReferenceType(), this.getEClass(), null, "eReferenceType", null, 1, 1, activityecorelua.EReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEReference_EKeys(), this.getEAttribute(), null, "eKeys", null, 0, -1, activityecorelua.EReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStructuralFeatureEClass, EStructuralFeature.class, "EStructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStructuralFeature_Changeable(), this.getEBoolean(), "changeable", "true", 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_Volatile(), this.getEBoolean(), "volatile", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_Transient(), this.getEBoolean(), "transient", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_DefaultValueLiteral(), this.getEString(), "defaultValueLiteral", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_DefaultValue(), this.getEJavaObject(), "defaultValue", null, 0, 1, EStructuralFeature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_Unsettable(), this.getEBoolean(), "unsettable", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_Derived(), this.getEBoolean(), "derived", null, 0, 1, EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStructuralFeature_EContainingClass(), this.getEClass(), this.getEClass_EStructuralFeatures(), "eContainingClass", null, 0, 1, EStructuralFeature.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEStructuralFeature__GetFeatureID(), this.getEInt(), "getFeatureID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEStructuralFeature__GetContainerClass(), null, "getContainerClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(eTypedElementEClass, ETypedElement.class, "ETypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getETypedElement_Ordered(), this.getEBoolean(), "ordered", "true", 0, 1, ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_Unique(), this.getEBoolean(), "unique", "true", 0, 1, ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_LowerBound(), this.getEInt(), "lowerBound", null, 0, 1, ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_UpperBound(), this.getEInt(), "upperBound", "1", 0, 1, ETypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_Many(), this.getEBoolean(), "many", null, 0, 1, ETypedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_Required(), this.getEBoolean(), "required", null, 0, 1, ETypedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getETypedElement_EType(), this.getEClassifier(), null, "eType", null, 0, 1, ETypedElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getETypedElement_EGenericType(), this.getEGenericType(), null, "eGenericType", null, 0, 1, ETypedElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStringToStringMapEntryEClass, Map.Entry.class, "EStringToStringMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToStringMapEntry_Key(), this.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStringToStringMapEntry_Value(), this.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eGenericTypeEClass, activityecorelua.EGenericType.class, "EGenericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEGenericType_EUpperBound(), this.getEGenericType(), null, "eUpperBound", null, 0, 1, activityecorelua.EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGenericType_ETypeArguments(), this.getEGenericType(), null, "eTypeArguments", null, 0, -1, activityecorelua.EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGenericType_ERawType(), this.getEClassifier(), null, "eRawType", null, 1, 1, activityecorelua.EGenericType.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEGenericType_ELowerBound(), this.getEGenericType(), null, "eLowerBound", null, 0, 1, activityecorelua.EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGenericType_ETypeParameter(), this.getETypeParameter(), null, "eTypeParameter", null, 0, 1, activityecorelua.EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGenericType_EClassifier(), this.getEClassifier(), null, "eClassifier", null, 0, 1, activityecorelua.EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eTypeParameterEClass, ETypeParameter.class, "ETypeParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getETypeParameter_EBounds(), this.getEGenericType(), null, "eBounds", null, 0, -1, ETypeParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Nodes(), this.getActivityNode(), this.getActivityNode_Activity(), "nodes", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Edges(), this.getActivityEdge(), null, "edges", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Locals(), this.getVariable(), null, "locals", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Inputs(), this.getVariable(), null, "inputs", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_Outgoing(), this.getActivityEdge(), this.getActivityEdge_Source(), "outgoing", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Incoming(), this.getActivityEdge(), this.getActivityEdge_Target(), "incoming", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Activity(), this.getActivity(), this.getActivity_Nodes(), "activity", null, 1, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivityNode_Running(), ecorePackage.getEBoolean(), "running", null, 1, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outgoing(), "source", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incoming(), "target", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlFlow_Guard(), this.getBooleanVariable(), null, "guard", null, 0, 1, ControlFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableNodeEClass, ExecutableNode.class, "ExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(opaqueActionEClass, OpaqueAction.class, "OpaqueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpaqueAction_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityFinalNodeEClass, ActivityFinalNode.class, "ActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_InitialValue(), this.getValue(), null, "initialValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_CurrentValue(), this.getValue(), null, "currentValue", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerVariableEClass, IntegerVariable.class, "IntegerVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanVariableEClass, BooleanVariable.class, "BooleanVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputValueEClass, InputValue.class, "InputValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputValue_Value(), this.getValue(), null, "value", null, 1, 1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputValue_Variable(), this.getVariable(), null, "variable", null, 1, 1, InputValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_InputValues(), this.getInputValue(), null, "inputValues", null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkEClass, Chunk.class, "Chunk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Statements(), this.getStatement(), null, "statements", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_ReturnValue(), this.getLastStatement(), null, "returnValue", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lastStatementEClass, LastStatement.class, "LastStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lastStatement_ReturnEClass, LastStatement_Return.class, "LastStatement_Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lastStatement_BreakEClass, LastStatement_Break.class, "LastStatement_Break", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statement_BlockEClass, Statement_Block.class, "Statement_Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Block_Block(), this.getBlock(), null, "block", null, 0, 1, Statement_Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_WhileEClass, Statement_While.class, "Statement_While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_While_Expression(), this.getExpression(), null, "expression", null, 0, 1, Statement_While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_While_Block(), this.getBlock(), null, "block", null, 0, 1, Statement_While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_RepeatEClass, Statement_Repeat.class, "Statement_Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Repeat_Block(), this.getBlock(), null, "block", null, 0, 1, Statement_Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_Repeat_Expression(), this.getExpression(), null, "expression", null, 0, 1, Statement_Repeat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_If_Then_ElseEClass, Statement_If_Then_Else.class, "Statement_If_Then_Else", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_If_Then_Else_IfExpression(), this.getExpression(), null, "ifExpression", null, 0, 1, Statement_If_Then_Else.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_If_Then_Else_IfBlock(), this.getBlock(), null, "ifBlock", null, 0, 1, Statement_If_Then_Else.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_If_Then_Else_ElseIf(), this.getStatement_If_Then_Else_ElseIfPart(), null, "elseIf", null, 0, -1, Statement_If_Then_Else.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_If_Then_Else_ElseBlock(), this.getBlock(), null, "elseBlock", null, 0, 1, Statement_If_Then_Else.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_If_Then_Else_ElseIfPartEClass, Statement_If_Then_Else_ElseIfPart.class, "Statement_If_Then_Else_ElseIfPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_If_Then_Else_ElseIfPart_ElseifExpression(), this.getExpression(), null, "elseifExpression", null, 0, 1, Statement_If_Then_Else_ElseIfPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_If_Then_Else_ElseIfPart_ElseifBlock(), this.getBlock(), null, "elseifBlock", null, 0, 1, Statement_If_Then_Else_ElseIfPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_For_NumericEClass, Statement_For_Numeric.class, "Statement_For_Numeric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_For_Numeric_IteratorName(), ecorePackage.getEString(), "iteratorName", null, 0, 1, Statement_For_Numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_For_Numeric_StartExpr(), this.getExpression(), null, "startExpr", null, 0, 1, Statement_For_Numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_For_Numeric_UntilExpr(), this.getExpression(), null, "untilExpr", null, 0, 1, Statement_For_Numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_For_Numeric_StepExpr(), this.getExpression(), null, "stepExpr", null, 0, 1, Statement_For_Numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_For_Numeric_Block(), this.getBlock(), null, "block", null, 0, 1, Statement_For_Numeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_For_GenericEClass, Statement_For_Generic.class, "Statement_For_Generic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_For_Generic_Names(), ecorePackage.getEString(), "names", null, 0, -1, Statement_For_Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_For_Generic_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Statement_For_Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_For_Generic_Block(), this.getBlock(), null, "block", null, 0, 1, Statement_For_Generic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_GlobalFunction_DeclarationEClass, Statement_GlobalFunction_Declaration.class, "Statement_GlobalFunction_Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_GlobalFunction_Declaration_Prefix(), ecorePackage.getEString(), "prefix", null, 0, -1, Statement_GlobalFunction_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatement_GlobalFunction_Declaration_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, Statement_GlobalFunction_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_GlobalFunction_Declaration_Function(), this.getFunction(), null, "function", null, 0, 1, Statement_GlobalFunction_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_LocalFunction_DeclarationEClass, Statement_LocalFunction_Declaration.class, "Statement_LocalFunction_Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_LocalFunction_Declaration_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, Statement_LocalFunction_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_LocalFunction_Declaration_Function(), this.getFunction(), null, "function", null, 0, 1, Statement_LocalFunction_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_Local_Variable_DeclarationEClass, Statement_Local_Variable_Declaration.class, "Statement_Local_Variable_Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_Local_Variable_Declaration_VariableNames(), ecorePackage.getEString(), "variableNames", null, 0, -1, Statement_Local_Variable_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_Local_Variable_Declaration_InitialValue(), this.getExpression(), null, "initialValue", null, 0, -1, Statement_Local_Variable_Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_FunctioncallOrAssignmentEClass, Statement_FunctioncallOrAssignment.class, "Statement_FunctioncallOrAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expression_NilEClass, Expression_Nil.class, "Expression_Nil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expression_TrueEClass, Expression_True.class, "Expression_True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expression_FalseEClass, Expression_False.class, "Expression_False", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expression_NumberEClass, Expression_Number.class, "Expression_Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Number_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Expression_Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_VarArgsEClass, Expression_VarArgs.class, "Expression_VarArgs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expression_StringEClass, Expression_String.class, "Expression_String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_String_Value(), ecorePackage.getEString(), "value", null, 0, 1, Expression_String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_FunctionEClass, Expression_Function.class, "Expression_Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Function_Function(), this.getFunction(), null, "function", null, 0, 1, Expression_Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_TableConstructorEClass, Expression_TableConstructor.class, "Expression_TableConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_TableConstructor_Fields(), this.getField(), null, "fields", null, 0, -1, Expression_TableConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_VarArgs(), ecorePackage.getEBoolean(), "varArgs", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Body(), this.getBlock(), null, "body", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functioncall_ArgumentsEClass, Functioncall_Arguments.class, "Functioncall_Arguments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctioncall_Arguments_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, Functioncall_Arguments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_Value(), this.getExpression(), null, "value", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(field_AddEntryToTable_BracketsEClass, Field_AddEntryToTable_Brackets.class, "Field_AddEntryToTable_Brackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getField_AddEntryToTable_Brackets_IndexExpression(), this.getExpression(), null, "indexExpression", null, 0, 1, Field_AddEntryToTable_Brackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(field_AddEntryToTableEClass, Field_AddEntryToTable.class, "Field_AddEntryToTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_AddEntryToTable_Key(), ecorePackage.getEString(), "key", null, 0, 1, Field_AddEntryToTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(field_AppendEntryToTableEClass, Field_AppendEntryToTable.class, "Field_AppendEntryToTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lastStatement_ReturnWithValueEClass, LastStatement_ReturnWithValue.class, "LastStatement_ReturnWithValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLastStatement_ReturnWithValue_ReturnValues(), this.getExpression(), null, "returnValues", null, 0, -1, LastStatement_ReturnWithValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_AssignmentEClass, Statement_Assignment.class, "Statement_Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Assignment_Variable(), this.getExpression(), null, "variable", null, 0, -1, Statement_Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_Assignment_Values(), this.getExpression(), null, "values", null, 0, -1, Statement_Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_CallMemberFunctionEClass, Statement_CallMemberFunction.class, "Statement_CallMemberFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_CallMemberFunction_Object(), this.getExpression(), null, "object", null, 0, 1, Statement_CallMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatement_CallMemberFunction_MemberFunctionName(), ecorePackage.getEString(), "memberFunctionName", null, 0, 1, Statement_CallMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_CallMemberFunction_Arguments(), this.getFunctioncall_Arguments(), null, "arguments", null, 0, 1, Statement_CallMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statement_CallFunctionEClass, Statement_CallFunction.class, "Statement_CallFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_CallFunction_Object(), this.getExpression(), null, "object", null, 0, 1, Statement_CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_CallFunction_Arguments(), this.getFunctioncall_Arguments(), null, "arguments", null, 0, 1, Statement_CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_OrEClass, Expression_Or.class, "Expression_Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Or_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Or_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_AndEClass, Expression_And.class, "Expression_And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_And_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_And_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_LargerEClass, Expression_Larger.class, "Expression_Larger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Larger_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Larger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Larger_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Larger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_Larger_EqualEClass, Expression_Larger_Equal.class, "Expression_Larger_Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Larger_Equal_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Larger_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Larger_Equal_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Larger_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_SmallerEClass, Expression_Smaller.class, "Expression_Smaller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Smaller_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Smaller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Smaller_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Smaller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_Smaller_EqualEClass, Expression_Smaller_Equal.class, "Expression_Smaller_Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Smaller_Equal_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Smaller_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Smaller_Equal_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Smaller_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_EqualEClass, Expression_Equal.class, "Expression_Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Equal_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Equal_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_Not_EqualEClass, Expression_Not_Equal.class, "Expression_Not_Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Not_Equal_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Not_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Not_Equal_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Not_Equal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_ConcatenationEClass, Expression_Concatenation.class, "Expression_Concatenation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Concatenation_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Concatenation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Concatenation_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Concatenation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_PlusEClass, Expression_Plus.class, "Expression_Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Plus_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Plus_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_MinusEClass, Expression_Minus.class, "Expression_Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Minus_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Minus_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Minus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_MultiplicationEClass, Expression_Multiplication.class, "Expression_Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Multiplication_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Multiplication_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_DivisionEClass, Expression_Division.class, "Expression_Division", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Division_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Division_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Division.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_ModuloEClass, Expression_Modulo.class, "Expression_Modulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Modulo_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Modulo_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_NegateEClass, Expression_Negate.class, "Expression_Negate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Negate_Exp(), this.getExpression(), null, "exp", null, 0, 1, Expression_Negate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_LengthEClass, Expression_Length.class, "Expression_Length", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Length_Exp(), this.getExpression(), null, "exp", null, 0, 1, Expression_Length.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_InvertEClass, Expression_Invert.class, "Expression_Invert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Invert_Exp(), this.getExpression(), null, "exp", null, 0, 1, Expression_Invert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_ExponentiationEClass, Expression_Exponentiation.class, "Expression_Exponentiation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Exponentiation_Left(), this.getExpression(), null, "left", null, 0, 1, Expression_Exponentiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Exponentiation_Right(), this.getExpression(), null, "right", null, 0, 1, Expression_Exponentiation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_CallMemberFunctionEClass, Expression_CallMemberFunction.class, "Expression_CallMemberFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_CallMemberFunction_Object(), this.getExpression(), null, "object", null, 0, 1, Expression_CallMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_CallMemberFunction_MemberFunctionName(), ecorePackage.getEString(), "memberFunctionName", null, 0, 1, Expression_CallMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_CallMemberFunction_Arguments(), this.getFunctioncall_Arguments(), null, "arguments", null, 0, 1, Expression_CallMemberFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_CallFunctionEClass, Expression_CallFunction.class, "Expression_CallFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_CallFunction_Object(), this.getExpression(), null, "object", null, 0, 1, Expression_CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_CallFunction_Arguments(), this.getFunctioncall_Arguments(), null, "arguments", null, 0, 1, Expression_CallFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_AccessArrayEClass, Expression_AccessArray.class, "Expression_AccessArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_AccessArray_Array(), this.getExpression(), null, "array", null, 0, 1, Expression_AccessArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_AccessArray_Index(), this.getExpression(), null, "index", null, 0, 1, Expression_AccessArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_AccessMemberEClass, Expression_AccessMember.class, "Expression_AccessMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_AccessMember_Object(), this.getExpression(), null, "object", null, 0, 1, Expression_AccessMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_AccessMember_MemberName(), ecorePackage.getEString(), "memberName", null, 0, 1, Expression_AccessMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expression_VariableNameEClass, Expression_VariableName.class, "Expression_VariableName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_VariableName_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, Expression_VariableName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(eBigDecimalEDataType, BigDecimal.class, "EBigDecimal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eBigIntegerEDataType, BigInteger.class, "EBigInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eBooleanEDataType, boolean.class, "EBoolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eBooleanObjectEDataType, Boolean.class, "EBooleanObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eByteEDataType, byte.class, "EByte", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eByteArrayEDataType, byte[].class, "EByteArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eByteObjectEDataType, Byte.class, "EByteObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eCharEDataType, char.class, "EChar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eCharacterObjectEDataType, Character.class, "ECharacterObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDateEDataType, Date.class, "EDate", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDiagnosticChainEDataType, DiagnosticChain.class, "EDiagnosticChain", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDoubleEDataType, double.class, "EDouble", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDoubleObjectEDataType, Double.class, "EDoubleObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eeListEDataType, EList.class, "EEList", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eEnumeratorEDataType, Enumerator.class, "EEnumerator", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eFeatureMapEDataType, FeatureMap.class, "EFeatureMap", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eFeatureMapEntryEDataType, FeatureMap.Entry.class, "EFeatureMapEntry", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eFloatEDataType, float.class, "EFloat", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eFloatObjectEDataType, Float.class, "EFloatObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eIntEDataType, int.class, "EInt", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eIntegerObjectEDataType, Integer.class, "EIntegerObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eJavaClassEDataType, Class.class, "EJavaClass", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eJavaObjectEDataType, Object.class, "EJavaObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eLongEDataType, long.class, "ELong", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eLongObjectEDataType, Long.class, "ELongObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eMapEDataType, Map.class, "EMap", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eResourceEDataType, Resource.class, "EResource", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eResourceSetEDataType, ResourceSet.class, "EResourceSet", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eShortEDataType, short.class, "EShort", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eShortObjectEDataType, Short.class, "EShortObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eStringEDataType, String.class, "EString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eTreeIteratorEDataType, TreeIterator.class, "ETreeIterator", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eInvocationTargetExceptionEDataType, InvocationTargetException.class, "EInvocationTargetException", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (eAttributeEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentTransient"
		   });	
		addAnnotation
		  (eAnnotationEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedSourceURI"
		   });	
		addAnnotation
		  (eClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "InterfaceIsAbstract AtMostOneID UniqueFeatureNames UniqueOperationSignatures NoCircularSuperTypes WellFormedMapEntryClass ConsistentSuperTypes DisjointFeatureAndOperationSignatures"
		   });	
		addAnnotation
		  (eClassifierEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedInstanceTypeName UniqueTypeParameterNames"
		   });	
		addAnnotation
		  (eEnumEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueEnumeratorNames UniqueEnumeratorLiterals"
		   });	
		addAnnotation
		  (eNamedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedName"
		   });	
		addAnnotation
		  (eOperationEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueParameterNames UniqueTypeParameterNames NoRepeatingVoid"
		   });	
		addAnnotation
		  (ePackageEClass, 
		   source, 
		   new String[] {
			 "constraints", "WellFormedNsURI WellFormedNsPrefix UniqueSubpackageNames UniqueClassifierNames UniqueNsURIs"
		   });	
		addAnnotation
		  (eReferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentOpposite SingleContainer ConsistentKeys ConsistentUnique ConsistentContainer"
		   });	
		addAnnotation
		  (eStructuralFeatureEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidDefaultValueLiteral"
		   });	
		addAnnotation
		  (eTypedElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "ValidLowerBound ValidUpperBound ConsistentBounds ValidType"
		   });	
		addAnnotation
		  (eGenericTypeEClass, 
		   source, 
		   new String[] {
			 "constraints", "ConsistentType ConsistentBounds ConsistentArguments"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";	
		addAnnotation
		  (getEClassifier_InstanceClassName(), 
		   source, 
		   new String[] {
			 "body", "ControlFlow",
			 "unique", "false",
			 "upper", "*"
		   });	
		addAnnotation
		  (getETypedElement_Ordered(), 
		   source, 
		   new String[] {
			 "body", "Variable"
		   });	
		addAnnotation
		  (getETypedElement_LowerBound(), 
		   source, 
		   new String[] {
			 "body", "Variable"
		   });	
		addAnnotation
		  (getStatement_For_Numeric_IteratorName(), 
		   source, 
		   new String[] {
			 "body", "Statement_If_Then_Else_ElseIfPart"
		   });	
		addAnnotation
		  (getStatement_GlobalFunction_Declaration_FunctionName(), 
		   source, 
		   new String[] {
			 "body", "Statement_For_Generic"
		   });	
		addAnnotation
		  (getFunction_Parameters(), 
		   source, 
		   new String[] {
			 "body", "Expression_TableConstructor"
		   });	
		addAnnotation
		  (getField_AddEntryToTable_Key(), 
		   source, 
		   new String[] {
			 "body", "Field_AddEntryToTable_Brackets"
		   });	
		addAnnotation
		  (getStatement_CallMemberFunction_MemberFunctionName(), 
		   source, 
		   new String[] {
			 "body", "Statement_Assignment"
		   });	
		addAnnotation
		  (getExpression_CallMemberFunction_MemberFunctionName(), 
		   source, 
		   new String[] {
			 "body", "Expression_Exponentiation"
		   });	
		addAnnotation
		  (getExpression_AccessMember_MemberName(), 
		   source, 
		   new String[] {
			 "body", "Expression_AccessArray"
		   });	
		addAnnotation
		  (getExpression_VariableName_Variable(), 
		   source, 
		   new String[] {
			 "body", "Expression_AccessMember"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (eBigDecimalEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#decimal"
		   });	
		addAnnotation
		  (eBigIntegerEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#integer"
		   });	
		addAnnotation
		  (eBooleanEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#boolean"
		   });	
		addAnnotation
		  (eBooleanObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EBoolean",
			 "name", "EBoolean:Object"
		   });	
		addAnnotation
		  (eByteEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#byte"
		   });	
		addAnnotation
		  (eByteArrayEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#hexBinary"
		   });	
		addAnnotation
		  (eByteObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EByte",
			 "name", "EByte:Object"
		   });	
		addAnnotation
		  (eCharacterObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EChar",
			 "name", "EChar:Object"
		   });	
		addAnnotation
		  (eDoubleEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#double"
		   });	
		addAnnotation
		  (eDoubleObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EDouble",
			 "name", "EDouble:Object"
		   });	
		addAnnotation
		  (eFloatEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#float"
		   });	
		addAnnotation
		  (eFloatObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EFloat",
			 "name", "EFloat:Object"
		   });	
		addAnnotation
		  (eIntEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#int"
		   });	
		addAnnotation
		  (eIntegerObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EInt",
			 "name", "EInt:Object"
		   });	
		addAnnotation
		  (eLongEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#long"
		   });	
		addAnnotation
		  (eLongObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "ELong",
			 "name", "ELong:Object"
		   });	
		addAnnotation
		  (eShortEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#short"
		   });	
		addAnnotation
		  (eShortObjectEDataType, 
		   source, 
		   new String[] {
			 "baseType", "EShort",
			 "name", "EShort:Object"
		   });	
		addAnnotation
		  (eStringEDataType, 
		   source, 
		   new String[] {
			 "baseType", "http://www.w3.org/2001/XMLSchema#string"
		   });
	}

} //ActivityecoreluaPackageImpl
