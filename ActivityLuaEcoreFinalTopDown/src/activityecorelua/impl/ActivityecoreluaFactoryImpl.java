/**
 */
package activityecorelua.impl;

import activityecorelua.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityecoreluaFactoryImpl extends EFactoryImpl implements ActivityecoreluaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityecoreluaFactory init() {
		try {
			ActivityecoreluaFactory theActivityecoreluaFactory = (ActivityecoreluaFactory)EPackage.Registry.INSTANCE.getEFactory(ActivityecoreluaPackage.eNS_URI);
			if (theActivityecoreluaFactory != null) {
				return theActivityecoreluaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivityecoreluaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityecoreluaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ActivityecoreluaPackage.EATTRIBUTE: return createEAttribute();
			case ActivityecoreluaPackage.EANNOTATION: return createEAnnotation();
			case ActivityecoreluaPackage.ECLASS: return createEClass();
			case ActivityecoreluaPackage.EDATA_TYPE: return createEDataType();
			case ActivityecoreluaPackage.EENUM: return createEEnum();
			case ActivityecoreluaPackage.EENUM_LITERAL: return createEEnumLiteral();
			case ActivityecoreluaPackage.EFACTORY: return createEFactory();
			case ActivityecoreluaPackage.EOBJECT: return createEObject();
			case ActivityecoreluaPackage.EOPERATION: return createEOperation();
			case ActivityecoreluaPackage.EPACKAGE: return createEPackage();
			case ActivityecoreluaPackage.EPARAMETER: return createEParameter();
			case ActivityecoreluaPackage.EREFERENCE: return createEReference();
			case ActivityecoreluaPackage.ESTRING_TO_STRING_MAP_ENTRY: return (EObject)createEStringToStringMapEntry();
			case ActivityecoreluaPackage.EGENERIC_TYPE: return createEGenericType();
			case ActivityecoreluaPackage.ETYPE_PARAMETER: return createETypeParameter();
			case ActivityecoreluaPackage.ACTIVITY: return createActivity();
			case ActivityecoreluaPackage.CONTROL_FLOW: return createControlFlow();
			case ActivityecoreluaPackage.OPAQUE_ACTION: return createOpaqueAction();
			case ActivityecoreluaPackage.INITIAL_NODE: return createInitialNode();
			case ActivityecoreluaPackage.ACTIVITY_FINAL_NODE: return createActivityFinalNode();
			case ActivityecoreluaPackage.FORK_NODE: return createForkNode();
			case ActivityecoreluaPackage.JOIN_NODE: return createJoinNode();
			case ActivityecoreluaPackage.MERGE_NODE: return createMergeNode();
			case ActivityecoreluaPackage.DECISION_NODE: return createDecisionNode();
			case ActivityecoreluaPackage.INTEGER_VARIABLE: return createIntegerVariable();
			case ActivityecoreluaPackage.BOOLEAN_VARIABLE: return createBooleanVariable();
			case ActivityecoreluaPackage.BOOLEAN_VALUE: return createBooleanValue();
			case ActivityecoreluaPackage.INTEGER_VALUE: return createIntegerValue();
			case ActivityecoreluaPackage.INPUT_VALUE: return createInputValue();
			case ActivityecoreluaPackage.INPUT: return createInput();
			case ActivityecoreluaPackage.CHUNK: return createChunk();
			case ActivityecoreluaPackage.BLOCK: return createBlock();
			case ActivityecoreluaPackage.LAST_STATEMENT: return createLastStatement();
			case ActivityecoreluaPackage.LAST_STATEMENT_RETURN: return createLastStatement_Return();
			case ActivityecoreluaPackage.LAST_STATEMENT_BREAK: return createLastStatement_Break();
			case ActivityecoreluaPackage.STATEMENT: return createStatement();
			case ActivityecoreluaPackage.STATEMENT_BLOCK: return createStatement_Block();
			case ActivityecoreluaPackage.STATEMENT_WHILE: return createStatement_While();
			case ActivityecoreluaPackage.STATEMENT_REPEAT: return createStatement_Repeat();
			case ActivityecoreluaPackage.STATEMENT_IF_THEN_ELSE: return createStatement_If_Then_Else();
			case ActivityecoreluaPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART: return createStatement_If_Then_Else_ElseIfPart();
			case ActivityecoreluaPackage.STATEMENT_FOR_NUMERIC: return createStatement_For_Numeric();
			case ActivityecoreluaPackage.STATEMENT_FOR_GENERIC: return createStatement_For_Generic();
			case ActivityecoreluaPackage.STATEMENT_GLOBAL_FUNCTION_DECLARATION: return createStatement_GlobalFunction_Declaration();
			case ActivityecoreluaPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION: return createStatement_LocalFunction_Declaration();
			case ActivityecoreluaPackage.STATEMENT_LOCAL_VARIABLE_DECLARATION: return createStatement_Local_Variable_Declaration();
			case ActivityecoreluaPackage.STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT: return createStatement_FunctioncallOrAssignment();
			case ActivityecoreluaPackage.EXPRESSION: return createExpression();
			case ActivityecoreluaPackage.EXPRESSION_NIL: return createExpression_Nil();
			case ActivityecoreluaPackage.EXPRESSION_TRUE: return createExpression_True();
			case ActivityecoreluaPackage.EXPRESSION_FALSE: return createExpression_False();
			case ActivityecoreluaPackage.EXPRESSION_NUMBER: return createExpression_Number();
			case ActivityecoreluaPackage.EXPRESSION_VAR_ARGS: return createExpression_VarArgs();
			case ActivityecoreluaPackage.EXPRESSION_STRING: return createExpression_String();
			case ActivityecoreluaPackage.EXPRESSION_FUNCTION: return createExpression_Function();
			case ActivityecoreluaPackage.EXPRESSION_TABLE_CONSTRUCTOR: return createExpression_TableConstructor();
			case ActivityecoreluaPackage.FUNCTION: return createFunction();
			case ActivityecoreluaPackage.FUNCTIONCALL_ARGUMENTS: return createFunctioncall_Arguments();
			case ActivityecoreluaPackage.FIELD: return createField();
			case ActivityecoreluaPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS: return createField_AddEntryToTable_Brackets();
			case ActivityecoreluaPackage.FIELD_ADD_ENTRY_TO_TABLE: return createField_AddEntryToTable();
			case ActivityecoreluaPackage.FIELD_APPEND_ENTRY_TO_TABLE: return createField_AppendEntryToTable();
			case ActivityecoreluaPackage.LAST_STATEMENT_RETURN_WITH_VALUE: return createLastStatement_ReturnWithValue();
			case ActivityecoreluaPackage.STATEMENT_ASSIGNMENT: return createStatement_Assignment();
			case ActivityecoreluaPackage.STATEMENT_CALL_MEMBER_FUNCTION: return createStatement_CallMemberFunction();
			case ActivityecoreluaPackage.STATEMENT_CALL_FUNCTION: return createStatement_CallFunction();
			case ActivityecoreluaPackage.EXPRESSION_OR: return createExpression_Or();
			case ActivityecoreluaPackage.EXPRESSION_AND: return createExpression_And();
			case ActivityecoreluaPackage.EXPRESSION_LARGER: return createExpression_Larger();
			case ActivityecoreluaPackage.EXPRESSION_LARGER_EQUAL: return createExpression_Larger_Equal();
			case ActivityecoreluaPackage.EXPRESSION_SMALLER: return createExpression_Smaller();
			case ActivityecoreluaPackage.EXPRESSION_SMALLER_EQUAL: return createExpression_Smaller_Equal();
			case ActivityecoreluaPackage.EXPRESSION_EQUAL: return createExpression_Equal();
			case ActivityecoreluaPackage.EXPRESSION_NOT_EQUAL: return createExpression_Not_Equal();
			case ActivityecoreluaPackage.EXPRESSION_CONCATENATION: return createExpression_Concatenation();
			case ActivityecoreluaPackage.EXPRESSION_PLUS: return createExpression_Plus();
			case ActivityecoreluaPackage.EXPRESSION_MINUS: return createExpression_Minus();
			case ActivityecoreluaPackage.EXPRESSION_MULTIPLICATION: return createExpression_Multiplication();
			case ActivityecoreluaPackage.EXPRESSION_DIVISION: return createExpression_Division();
			case ActivityecoreluaPackage.EXPRESSION_MODULO: return createExpression_Modulo();
			case ActivityecoreluaPackage.EXPRESSION_NEGATE: return createExpression_Negate();
			case ActivityecoreluaPackage.EXPRESSION_LENGTH: return createExpression_Length();
			case ActivityecoreluaPackage.EXPRESSION_INVERT: return createExpression_Invert();
			case ActivityecoreluaPackage.EXPRESSION_EXPONENTIATION: return createExpression_Exponentiation();
			case ActivityecoreluaPackage.EXPRESSION_CALL_MEMBER_FUNCTION: return createExpression_CallMemberFunction();
			case ActivityecoreluaPackage.EXPRESSION_CALL_FUNCTION: return createExpression_CallFunction();
			case ActivityecoreluaPackage.EXPRESSION_ACCESS_ARRAY: return createExpression_AccessArray();
			case ActivityecoreluaPackage.EXPRESSION_ACCESS_MEMBER: return createExpression_AccessMember();
			case ActivityecoreluaPackage.EXPRESSION_VARIABLE_NAME: return createExpression_VariableName();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ActivityecoreluaPackage.EBIG_DECIMAL:
				return createEBigDecimalFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EBIG_INTEGER:
				return createEBigIntegerFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EBOOLEAN:
				return createEBooleanFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EBOOLEAN_OBJECT:
				return createEBooleanObjectFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EBYTE:
				return createEByteFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EBYTE_ARRAY:
				return createEByteArrayFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EBYTE_OBJECT:
				return createEByteObjectFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.ECHAR:
				return createECharFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.ECHARACTER_OBJECT:
				return createECharacterObjectFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EDATE:
				return createEDateFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EDOUBLE:
				return createEDoubleFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EDOUBLE_OBJECT:
				return createEDoubleObjectFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EFLOAT:
				return createEFloatFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EFLOAT_OBJECT:
				return createEFloatObjectFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EINT:
				return createEIntFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EINTEGER_OBJECT:
				return createEIntegerObjectFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EJAVA_CLASS:
				return createEJavaClassFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.EJAVA_OBJECT:
				return createEJavaObjectFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.ELONG:
				return createELongFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.ELONG_OBJECT:
				return createELongObjectFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.ESHORT:
				return createEShortFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.ESHORT_OBJECT:
				return createEShortObjectFromString(eDataType, initialValue);
			case ActivityecoreluaPackage.ESTRING:
				return createEStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ActivityecoreluaPackage.EBIG_DECIMAL:
				return convertEBigDecimalToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EBIG_INTEGER:
				return convertEBigIntegerToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EBOOLEAN:
				return convertEBooleanToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EBOOLEAN_OBJECT:
				return convertEBooleanObjectToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EBYTE:
				return convertEByteToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EBYTE_ARRAY:
				return convertEByteArrayToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EBYTE_OBJECT:
				return convertEByteObjectToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.ECHAR:
				return convertECharToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.ECHARACTER_OBJECT:
				return convertECharacterObjectToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EDATE:
				return convertEDateToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EDOUBLE:
				return convertEDoubleToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EDOUBLE_OBJECT:
				return convertEDoubleObjectToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EFLOAT:
				return convertEFloatToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EFLOAT_OBJECT:
				return convertEFloatObjectToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EINT:
				return convertEIntToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EINTEGER_OBJECT:
				return convertEIntegerObjectToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EJAVA_CLASS:
				return convertEJavaClassToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.EJAVA_OBJECT:
				return convertEJavaObjectToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.ELONG:
				return convertELongToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.ELONG_OBJECT:
				return convertELongObjectToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.ESHORT:
				return convertEShortToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.ESHORT_OBJECT:
				return convertEShortObjectToString(eDataType, instanceValue);
			case ActivityecoreluaPackage.ESTRING:
				return convertEStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute createEAttribute() {
		EAttributeImpl eAttribute = new EAttributeImpl();
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAnnotation createEAnnotation() {
		EAnnotationImpl eAnnotation = new EAnnotationImpl();
		return eAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activityecorelua.EClass createEClass() {
		EClassImpl eClass = new EClassImpl();
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activityecorelua.EDataType createEDataType() {
		EDataTypeImpl eDataType = new EDataTypeImpl();
		return eDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum createEEnum() {
		EEnumImpl eEnum = new EEnumImpl();
		return eEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral createEEnumLiteral() {
		EEnumLiteralImpl eEnumLiteral = new EEnumLiteralImpl();
		return eEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFactory createEFactory() {
		activityecorelua.impl.EFactoryImpl eFactory = new activityecorelua.impl.EFactoryImpl();
		return eFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activityecorelua.EObject createEObject() {
		EObjectImpl eObject = new EObjectImpl();
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation createEOperation() {
		EOperationImpl eOperation = new EOperationImpl();
		return eOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activityecorelua.EPackage createEPackage() {
		EPackageImpl ePackage = new EPackageImpl();
		return ePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParameter createEParameter() {
		EParameterImpl eParameter = new EParameterImpl();
		return eParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference createEReference() {
		EReferenceImpl eReference = new EReferenceImpl();
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createEStringToStringMapEntry() {
		EStringToStringMapEntryImpl eStringToStringMapEntry = new EStringToStringMapEntryImpl();
		return eStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType createEGenericType() {
		EGenericTypeImpl eGenericType = new EGenericTypeImpl();
		return eGenericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypeParameter createETypeParameter() {
		ETypeParameterImpl eTypeParameter = new ETypeParameterImpl();
		return eTypeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction createOpaqueAction() {
		OpaqueActionImpl opaqueAction = new OpaqueActionImpl();
		return opaqueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNode createActivityFinalNode() {
		ActivityFinalNodeImpl activityFinalNode = new ActivityFinalNodeImpl();
		return activityFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable createIntegerVariable() {
		IntegerVariableImpl integerVariable = new IntegerVariableImpl();
		return integerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable createBooleanVariable() {
		BooleanVariableImpl booleanVariable = new BooleanVariableImpl();
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValue createInputValue() {
		InputValueImpl inputValue = new InputValueImpl();
		return inputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chunk createChunk() {
		ChunkImpl chunk = new ChunkImpl();
		return chunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStatement createLastStatement() {
		LastStatementImpl lastStatement = new LastStatementImpl();
		return lastStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStatement_Return createLastStatement_Return() {
		LastStatement_ReturnImpl lastStatement_Return = new LastStatement_ReturnImpl();
		return lastStatement_Return;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStatement_Break createLastStatement_Break() {
		LastStatement_BreakImpl lastStatement_Break = new LastStatement_BreakImpl();
		return lastStatement_Break;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_Block createStatement_Block() {
		Statement_BlockImpl statement_Block = new Statement_BlockImpl();
		return statement_Block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_While createStatement_While() {
		Statement_WhileImpl statement_While = new Statement_WhileImpl();
		return statement_While;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_Repeat createStatement_Repeat() {
		Statement_RepeatImpl statement_Repeat = new Statement_RepeatImpl();
		return statement_Repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_If_Then_Else createStatement_If_Then_Else() {
		Statement_If_Then_ElseImpl statement_If_Then_Else = new Statement_If_Then_ElseImpl();
		return statement_If_Then_Else;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_If_Then_Else_ElseIfPart createStatement_If_Then_Else_ElseIfPart() {
		Statement_If_Then_Else_ElseIfPartImpl statement_If_Then_Else_ElseIfPart = new Statement_If_Then_Else_ElseIfPartImpl();
		return statement_If_Then_Else_ElseIfPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_For_Numeric createStatement_For_Numeric() {
		Statement_For_NumericImpl statement_For_Numeric = new Statement_For_NumericImpl();
		return statement_For_Numeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_For_Generic createStatement_For_Generic() {
		Statement_For_GenericImpl statement_For_Generic = new Statement_For_GenericImpl();
		return statement_For_Generic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_GlobalFunction_Declaration createStatement_GlobalFunction_Declaration() {
		Statement_GlobalFunction_DeclarationImpl statement_GlobalFunction_Declaration = new Statement_GlobalFunction_DeclarationImpl();
		return statement_GlobalFunction_Declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_LocalFunction_Declaration createStatement_LocalFunction_Declaration() {
		Statement_LocalFunction_DeclarationImpl statement_LocalFunction_Declaration = new Statement_LocalFunction_DeclarationImpl();
		return statement_LocalFunction_Declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_Local_Variable_Declaration createStatement_Local_Variable_Declaration() {
		Statement_Local_Variable_DeclarationImpl statement_Local_Variable_Declaration = new Statement_Local_Variable_DeclarationImpl();
		return statement_Local_Variable_Declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_FunctioncallOrAssignment createStatement_FunctioncallOrAssignment() {
		Statement_FunctioncallOrAssignmentImpl statement_FunctioncallOrAssignment = new Statement_FunctioncallOrAssignmentImpl();
		return statement_FunctioncallOrAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Nil createExpression_Nil() {
		Expression_NilImpl expression_Nil = new Expression_NilImpl();
		return expression_Nil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_True createExpression_True() {
		Expression_TrueImpl expression_True = new Expression_TrueImpl();
		return expression_True;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_False createExpression_False() {
		Expression_FalseImpl expression_False = new Expression_FalseImpl();
		return expression_False;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Number createExpression_Number() {
		Expression_NumberImpl expression_Number = new Expression_NumberImpl();
		return expression_Number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_VarArgs createExpression_VarArgs() {
		Expression_VarArgsImpl expression_VarArgs = new Expression_VarArgsImpl();
		return expression_VarArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_String createExpression_String() {
		Expression_StringImpl expression_String = new Expression_StringImpl();
		return expression_String;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Function createExpression_Function() {
		Expression_FunctionImpl expression_Function = new Expression_FunctionImpl();
		return expression_Function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_TableConstructor createExpression_TableConstructor() {
		Expression_TableConstructorImpl expression_TableConstructor = new Expression_TableConstructorImpl();
		return expression_TableConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functioncall_Arguments createFunctioncall_Arguments() {
		Functioncall_ArgumentsImpl functioncall_Arguments = new Functioncall_ArgumentsImpl();
		return functioncall_Arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field_AddEntryToTable_Brackets createField_AddEntryToTable_Brackets() {
		Field_AddEntryToTable_BracketsImpl field_AddEntryToTable_Brackets = new Field_AddEntryToTable_BracketsImpl();
		return field_AddEntryToTable_Brackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field_AddEntryToTable createField_AddEntryToTable() {
		Field_AddEntryToTableImpl field_AddEntryToTable = new Field_AddEntryToTableImpl();
		return field_AddEntryToTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field_AppendEntryToTable createField_AppendEntryToTable() {
		Field_AppendEntryToTableImpl field_AppendEntryToTable = new Field_AppendEntryToTableImpl();
		return field_AppendEntryToTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastStatement_ReturnWithValue createLastStatement_ReturnWithValue() {
		LastStatement_ReturnWithValueImpl lastStatement_ReturnWithValue = new LastStatement_ReturnWithValueImpl();
		return lastStatement_ReturnWithValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_Assignment createStatement_Assignment() {
		Statement_AssignmentImpl statement_Assignment = new Statement_AssignmentImpl();
		return statement_Assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_CallMemberFunction createStatement_CallMemberFunction() {
		Statement_CallMemberFunctionImpl statement_CallMemberFunction = new Statement_CallMemberFunctionImpl();
		return statement_CallMemberFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement_CallFunction createStatement_CallFunction() {
		Statement_CallFunctionImpl statement_CallFunction = new Statement_CallFunctionImpl();
		return statement_CallFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Or createExpression_Or() {
		Expression_OrImpl expression_Or = new Expression_OrImpl();
		return expression_Or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_And createExpression_And() {
		Expression_AndImpl expression_And = new Expression_AndImpl();
		return expression_And;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Larger createExpression_Larger() {
		Expression_LargerImpl expression_Larger = new Expression_LargerImpl();
		return expression_Larger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Larger_Equal createExpression_Larger_Equal() {
		Expression_Larger_EqualImpl expression_Larger_Equal = new Expression_Larger_EqualImpl();
		return expression_Larger_Equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Smaller createExpression_Smaller() {
		Expression_SmallerImpl expression_Smaller = new Expression_SmallerImpl();
		return expression_Smaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Smaller_Equal createExpression_Smaller_Equal() {
		Expression_Smaller_EqualImpl expression_Smaller_Equal = new Expression_Smaller_EqualImpl();
		return expression_Smaller_Equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Equal createExpression_Equal() {
		Expression_EqualImpl expression_Equal = new Expression_EqualImpl();
		return expression_Equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Not_Equal createExpression_Not_Equal() {
		Expression_Not_EqualImpl expression_Not_Equal = new Expression_Not_EqualImpl();
		return expression_Not_Equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Concatenation createExpression_Concatenation() {
		Expression_ConcatenationImpl expression_Concatenation = new Expression_ConcatenationImpl();
		return expression_Concatenation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Plus createExpression_Plus() {
		Expression_PlusImpl expression_Plus = new Expression_PlusImpl();
		return expression_Plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Minus createExpression_Minus() {
		Expression_MinusImpl expression_Minus = new Expression_MinusImpl();
		return expression_Minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Multiplication createExpression_Multiplication() {
		Expression_MultiplicationImpl expression_Multiplication = new Expression_MultiplicationImpl();
		return expression_Multiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Division createExpression_Division() {
		Expression_DivisionImpl expression_Division = new Expression_DivisionImpl();
		return expression_Division;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Modulo createExpression_Modulo() {
		Expression_ModuloImpl expression_Modulo = new Expression_ModuloImpl();
		return expression_Modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Negate createExpression_Negate() {
		Expression_NegateImpl expression_Negate = new Expression_NegateImpl();
		return expression_Negate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Length createExpression_Length() {
		Expression_LengthImpl expression_Length = new Expression_LengthImpl();
		return expression_Length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Invert createExpression_Invert() {
		Expression_InvertImpl expression_Invert = new Expression_InvertImpl();
		return expression_Invert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_Exponentiation createExpression_Exponentiation() {
		Expression_ExponentiationImpl expression_Exponentiation = new Expression_ExponentiationImpl();
		return expression_Exponentiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_CallMemberFunction createExpression_CallMemberFunction() {
		Expression_CallMemberFunctionImpl expression_CallMemberFunction = new Expression_CallMemberFunctionImpl();
		return expression_CallMemberFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_CallFunction createExpression_CallFunction() {
		Expression_CallFunctionImpl expression_CallFunction = new Expression_CallFunctionImpl();
		return expression_CallFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_AccessArray createExpression_AccessArray() {
		Expression_AccessArrayImpl expression_AccessArray = new Expression_AccessArrayImpl();
		return expression_AccessArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_AccessMember createExpression_AccessMember() {
		Expression_AccessMemberImpl expression_AccessMember = new Expression_AccessMemberImpl();
		return expression_AccessMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression_VariableName createExpression_VariableName() {
		Expression_VariableNameImpl expression_VariableName = new Expression_VariableNameImpl();
		return expression_VariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createEBigDecimalFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBigDecimalToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createEBigIntegerFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBigIntegerToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createEBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createEBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createEBooleanFromString(ActivityecoreluaPackage.Literals.EBOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEBooleanToString(ActivityecoreluaPackage.Literals.EBOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createEByteFromString(EDataType eDataType, String initialValue) {
		return (Byte)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BYTE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BYTE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createEByteArrayFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.HEX_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteArrayToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.HEX_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createEByteObjectFromString(EDataType eDataType, String initialValue) {
		return createEByteFromString(ActivityecoreluaPackage.Literals.EBYTE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEByteObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEByteToString(ActivityecoreluaPackage.Literals.EBYTE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createECharFromString(EDataType eDataType, String initialValue) {
		return (Character)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECharToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character createECharacterObjectFromString(EDataType eDataType, String initialValue) {
		return createECharFromString(ActivityecoreluaPackage.Literals.ECHAR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECharacterObjectToString(EDataType eDataType, Object instanceValue) {
		return convertECharToString(ActivityecoreluaPackage.Literals.ECHAR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createEDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createEDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDoubleToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createEDoubleObjectFromString(EDataType eDataType, String initialValue) {
		return createEDoubleFromString(ActivityecoreluaPackage.Literals.EDOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDoubleObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEDoubleToString(ActivityecoreluaPackage.Literals.EDOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createEFloatFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFloatToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createEFloatObjectFromString(EDataType eDataType, String initialValue) {
		return createEFloatFromString(ActivityecoreluaPackage.Literals.EFLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEFloatObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEFloatToString(ActivityecoreluaPackage.Literals.EFLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createEIntFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createEIntegerObjectFromString(EDataType eDataType, String initialValue) {
		return createEIntFromString(ActivityecoreluaPackage.Literals.EINT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntegerObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEIntToString(ActivityecoreluaPackage.Literals.EINT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> createEJavaClassFromString(EDataType eDataType, String initialValue) {
		return (Class<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEJavaClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEJavaObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEJavaObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createELongFromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELongToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createELongObjectFromString(EDataType eDataType, String initialValue) {
		return createELongFromString(ActivityecoreluaPackage.Literals.ELONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertELongObjectToString(EDataType eDataType, Object instanceValue) {
		return convertELongToString(ActivityecoreluaPackage.Literals.ELONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createEShortFromString(EDataType eDataType, String initialValue) {
		return (Short)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.SHORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEShortToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.SHORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createEShortObjectFromString(EDataType eDataType, String initialValue) {
		return createEShortFromString(ActivityecoreluaPackage.Literals.ESHORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEShortObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEShortToString(ActivityecoreluaPackage.Literals.ESHORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createEStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityecoreluaPackage getActivityecoreluaPackage() {
		return (ActivityecoreluaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivityecoreluaPackage getPackage() {
		return ActivityecoreluaPackage.eINSTANCE;
	}

} //ActivityecoreluaFactoryImpl
