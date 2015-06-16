/**
 */
package activityecorelua;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see activityecorelua.ActivityecoreluaPackage
 * @generated
 */
public interface ActivityecoreluaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityecoreluaFactory eINSTANCE = activityecorelua.impl.ActivityecoreluaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAttribute</em>'.
	 * @generated
	 */
	EAttribute createEAttribute();

	/**
	 * Returns a new object of class '<em>EAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAnnotation</em>'.
	 * @generated
	 */
	EAnnotation createEAnnotation();

	/**
	 * Returns a new object of class '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClass</em>'.
	 * @generated
	 */
	EClass createEClass();

	/**
	 * Returns a new object of class '<em>EData Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EData Type</em>'.
	 * @generated
	 */
	EDataType createEDataType();

	/**
	 * Returns a new object of class '<em>EEnum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnum</em>'.
	 * @generated
	 */
	EEnum createEEnum();

	/**
	 * Returns a new object of class '<em>EEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnum Literal</em>'.
	 * @generated
	 */
	EEnumLiteral createEEnumLiteral();

	/**
	 * Returns a new object of class '<em>EFactory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFactory</em>'.
	 * @generated
	 */
	activityecorelua.EFactory createEFactory();

	/**
	 * Returns a new object of class '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject</em>'.
	 * @generated
	 */
	EObject createEObject();

	/**
	 * Returns a new object of class '<em>EOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EOperation</em>'.
	 * @generated
	 */
	EOperation createEOperation();

	/**
	 * Returns a new object of class '<em>EPackage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPackage</em>'.
	 * @generated
	 */
	EPackage createEPackage();

	/**
	 * Returns a new object of class '<em>EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EParameter</em>'.
	 * @generated
	 */
	EParameter createEParameter();

	/**
	 * Returns a new object of class '<em>EReference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EReference</em>'.
	 * @generated
	 */
	EReference createEReference();

	/**
	 * Returns a new object of class '<em>EGeneric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EGeneric Type</em>'.
	 * @generated
	 */
	EGenericType createEGenericType();

	/**
	 * Returns a new object of class '<em>EType Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EType Parameter</em>'.
	 * @generated
	 */
	ETypeParameter createETypeParameter();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Flow</em>'.
	 * @generated
	 */
	ControlFlow createControlFlow();

	/**
	 * Returns a new object of class '<em>Opaque Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Action</em>'.
	 * @generated
	 */
	OpaqueAction createOpaqueAction();

	/**
	 * Returns a new object of class '<em>Initial Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Node</em>'.
	 * @generated
	 */
	InitialNode createInitialNode();

	/**
	 * Returns a new object of class '<em>Activity Final Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Final Node</em>'.
	 * @generated
	 */
	ActivityFinalNode createActivityFinalNode();

	/**
	 * Returns a new object of class '<em>Fork Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork Node</em>'.
	 * @generated
	 */
	ForkNode createForkNode();

	/**
	 * Returns a new object of class '<em>Join Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Node</em>'.
	 * @generated
	 */
	JoinNode createJoinNode();

	/**
	 * Returns a new object of class '<em>Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Node</em>'.
	 * @generated
	 */
	MergeNode createMergeNode();

	/**
	 * Returns a new object of class '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decision Node</em>'.
	 * @generated
	 */
	DecisionNode createDecisionNode();

	/**
	 * Returns a new object of class '<em>Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Variable</em>'.
	 * @generated
	 */
	IntegerVariable createIntegerVariable();

	/**
	 * Returns a new object of class '<em>Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable</em>'.
	 * @generated
	 */
	BooleanVariable createBooleanVariable();

	/**
	 * Returns a new object of class '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value</em>'.
	 * @generated
	 */
	BooleanValue createBooleanValue();

	/**
	 * Returns a new object of class '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value</em>'.
	 * @generated
	 */
	IntegerValue createIntegerValue();

	/**
	 * Returns a new object of class '<em>Input Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Value</em>'.
	 * @generated
	 */
	InputValue createInputValue();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Chunk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk</em>'.
	 * @generated
	 */
	Chunk createChunk();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Last Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Last Statement</em>'.
	 * @generated
	 */
	LastStatement createLastStatement();

	/**
	 * Returns a new object of class '<em>Last Statement Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Last Statement Return</em>'.
	 * @generated
	 */
	LastStatement_Return createLastStatement_Return();

	/**
	 * Returns a new object of class '<em>Last Statement Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Last Statement Break</em>'.
	 * @generated
	 */
	LastStatement_Break createLastStatement_Break();

	/**
	 * Returns a new object of class '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement</em>'.
	 * @generated
	 */
	Statement createStatement();

	/**
	 * Returns a new object of class '<em>Statement Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Block</em>'.
	 * @generated
	 */
	Statement_Block createStatement_Block();

	/**
	 * Returns a new object of class '<em>Statement While</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement While</em>'.
	 * @generated
	 */
	Statement_While createStatement_While();

	/**
	 * Returns a new object of class '<em>Statement Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Repeat</em>'.
	 * @generated
	 */
	Statement_Repeat createStatement_Repeat();

	/**
	 * Returns a new object of class '<em>Statement If Then Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement If Then Else</em>'.
	 * @generated
	 */
	Statement_If_Then_Else createStatement_If_Then_Else();

	/**
	 * Returns a new object of class '<em>Statement If Then Else Else If Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement If Then Else Else If Part</em>'.
	 * @generated
	 */
	Statement_If_Then_Else_ElseIfPart createStatement_If_Then_Else_ElseIfPart();

	/**
	 * Returns a new object of class '<em>Statement For Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement For Numeric</em>'.
	 * @generated
	 */
	Statement_For_Numeric createStatement_For_Numeric();

	/**
	 * Returns a new object of class '<em>Statement For Generic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement For Generic</em>'.
	 * @generated
	 */
	Statement_For_Generic createStatement_For_Generic();

	/**
	 * Returns a new object of class '<em>Statement Global Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Global Function Declaration</em>'.
	 * @generated
	 */
	Statement_GlobalFunction_Declaration createStatement_GlobalFunction_Declaration();

	/**
	 * Returns a new object of class '<em>Statement Local Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Local Function Declaration</em>'.
	 * @generated
	 */
	Statement_LocalFunction_Declaration createStatement_LocalFunction_Declaration();

	/**
	 * Returns a new object of class '<em>Statement Local Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Local Variable Declaration</em>'.
	 * @generated
	 */
	Statement_Local_Variable_Declaration createStatement_Local_Variable_Declaration();

	/**
	 * Returns a new object of class '<em>Statement Functioncall Or Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Functioncall Or Assignment</em>'.
	 * @generated
	 */
	Statement_FunctioncallOrAssignment createStatement_FunctioncallOrAssignment();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Expression Nil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Nil</em>'.
	 * @generated
	 */
	Expression_Nil createExpression_Nil();

	/**
	 * Returns a new object of class '<em>Expression True</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression True</em>'.
	 * @generated
	 */
	Expression_True createExpression_True();

	/**
	 * Returns a new object of class '<em>Expression False</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression False</em>'.
	 * @generated
	 */
	Expression_False createExpression_False();

	/**
	 * Returns a new object of class '<em>Expression Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Number</em>'.
	 * @generated
	 */
	Expression_Number createExpression_Number();

	/**
	 * Returns a new object of class '<em>Expression Var Args</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Var Args</em>'.
	 * @generated
	 */
	Expression_VarArgs createExpression_VarArgs();

	/**
	 * Returns a new object of class '<em>Expression String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression String</em>'.
	 * @generated
	 */
	Expression_String createExpression_String();

	/**
	 * Returns a new object of class '<em>Expression Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Function</em>'.
	 * @generated
	 */
	Expression_Function createExpression_Function();

	/**
	 * Returns a new object of class '<em>Expression Table Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Table Constructor</em>'.
	 * @generated
	 */
	Expression_TableConstructor createExpression_TableConstructor();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Functioncall Arguments</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functioncall Arguments</em>'.
	 * @generated
	 */
	Functioncall_Arguments createFunctioncall_Arguments();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Field Add Entry To Table Brackets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Add Entry To Table Brackets</em>'.
	 * @generated
	 */
	Field_AddEntryToTable_Brackets createField_AddEntryToTable_Brackets();

	/**
	 * Returns a new object of class '<em>Field Add Entry To Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Add Entry To Table</em>'.
	 * @generated
	 */
	Field_AddEntryToTable createField_AddEntryToTable();

	/**
	 * Returns a new object of class '<em>Field Append Entry To Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Append Entry To Table</em>'.
	 * @generated
	 */
	Field_AppendEntryToTable createField_AppendEntryToTable();

	/**
	 * Returns a new object of class '<em>Last Statement Return With Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Last Statement Return With Value</em>'.
	 * @generated
	 */
	LastStatement_ReturnWithValue createLastStatement_ReturnWithValue();

	/**
	 * Returns a new object of class '<em>Statement Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Assignment</em>'.
	 * @generated
	 */
	Statement_Assignment createStatement_Assignment();

	/**
	 * Returns a new object of class '<em>Statement Call Member Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Call Member Function</em>'.
	 * @generated
	 */
	Statement_CallMemberFunction createStatement_CallMemberFunction();

	/**
	 * Returns a new object of class '<em>Statement Call Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statement Call Function</em>'.
	 * @generated
	 */
	Statement_CallFunction createStatement_CallFunction();

	/**
	 * Returns a new object of class '<em>Expression Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Or</em>'.
	 * @generated
	 */
	Expression_Or createExpression_Or();

	/**
	 * Returns a new object of class '<em>Expression And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression And</em>'.
	 * @generated
	 */
	Expression_And createExpression_And();

	/**
	 * Returns a new object of class '<em>Expression Larger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Larger</em>'.
	 * @generated
	 */
	Expression_Larger createExpression_Larger();

	/**
	 * Returns a new object of class '<em>Expression Larger Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Larger Equal</em>'.
	 * @generated
	 */
	Expression_Larger_Equal createExpression_Larger_Equal();

	/**
	 * Returns a new object of class '<em>Expression Smaller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Smaller</em>'.
	 * @generated
	 */
	Expression_Smaller createExpression_Smaller();

	/**
	 * Returns a new object of class '<em>Expression Smaller Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Smaller Equal</em>'.
	 * @generated
	 */
	Expression_Smaller_Equal createExpression_Smaller_Equal();

	/**
	 * Returns a new object of class '<em>Expression Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Equal</em>'.
	 * @generated
	 */
	Expression_Equal createExpression_Equal();

	/**
	 * Returns a new object of class '<em>Expression Not Equal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Not Equal</em>'.
	 * @generated
	 */
	Expression_Not_Equal createExpression_Not_Equal();

	/**
	 * Returns a new object of class '<em>Expression Concatenation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Concatenation</em>'.
	 * @generated
	 */
	Expression_Concatenation createExpression_Concatenation();

	/**
	 * Returns a new object of class '<em>Expression Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Plus</em>'.
	 * @generated
	 */
	Expression_Plus createExpression_Plus();

	/**
	 * Returns a new object of class '<em>Expression Minus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Minus</em>'.
	 * @generated
	 */
	Expression_Minus createExpression_Minus();

	/**
	 * Returns a new object of class '<em>Expression Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Multiplication</em>'.
	 * @generated
	 */
	Expression_Multiplication createExpression_Multiplication();

	/**
	 * Returns a new object of class '<em>Expression Division</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Division</em>'.
	 * @generated
	 */
	Expression_Division createExpression_Division();

	/**
	 * Returns a new object of class '<em>Expression Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Modulo</em>'.
	 * @generated
	 */
	Expression_Modulo createExpression_Modulo();

	/**
	 * Returns a new object of class '<em>Expression Negate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Negate</em>'.
	 * @generated
	 */
	Expression_Negate createExpression_Negate();

	/**
	 * Returns a new object of class '<em>Expression Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Length</em>'.
	 * @generated
	 */
	Expression_Length createExpression_Length();

	/**
	 * Returns a new object of class '<em>Expression Invert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Invert</em>'.
	 * @generated
	 */
	Expression_Invert createExpression_Invert();

	/**
	 * Returns a new object of class '<em>Expression Exponentiation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Exponentiation</em>'.
	 * @generated
	 */
	Expression_Exponentiation createExpression_Exponentiation();

	/**
	 * Returns a new object of class '<em>Expression Call Member Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Call Member Function</em>'.
	 * @generated
	 */
	Expression_CallMemberFunction createExpression_CallMemberFunction();

	/**
	 * Returns a new object of class '<em>Expression Call Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Call Function</em>'.
	 * @generated
	 */
	Expression_CallFunction createExpression_CallFunction();

	/**
	 * Returns a new object of class '<em>Expression Access Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Access Array</em>'.
	 * @generated
	 */
	Expression_AccessArray createExpression_AccessArray();

	/**
	 * Returns a new object of class '<em>Expression Access Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Access Member</em>'.
	 * @generated
	 */
	Expression_AccessMember createExpression_AccessMember();

	/**
	 * Returns a new object of class '<em>Expression Variable Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Variable Name</em>'.
	 * @generated
	 */
	Expression_VariableName createExpression_VariableName();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActivityecoreluaPackage getActivityecoreluaPackage();

} //ActivityecoreluaFactory
