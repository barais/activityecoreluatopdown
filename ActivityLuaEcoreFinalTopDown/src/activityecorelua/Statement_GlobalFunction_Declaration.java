/**
 */
package activityecorelua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Global Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.Statement_GlobalFunction_Declaration#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link activityecorelua.Statement_GlobalFunction_Declaration#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link activityecorelua.Statement_GlobalFunction_Declaration#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getStatement_GlobalFunction_Declaration()
 * @model
 * @generated
 */
public interface Statement_GlobalFunction_Declaration extends Statement {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute list.
	 * @see activityecorelua.ActivityecoreluaPackage#getStatement_GlobalFunction_Declaration_Prefix()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getPrefix();

	/**
	 * Returns the value of the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Name</em>' attribute.
	 * @see #setFunctionName(String)
	 * @see activityecorelua.ActivityecoreluaPackage#getStatement_GlobalFunction_Declaration_FunctionName()
	 * @model annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Statement_For_Generic'"
	 * @generated
	 */
	String getFunctionName();

	/**
	 * Sets the value of the '{@link activityecorelua.Statement_GlobalFunction_Declaration#getFunctionName <em>Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Name</em>' attribute.
	 * @see #getFunctionName()
	 * @generated
	 */
	void setFunctionName(String value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(Function)
	 * @see activityecorelua.ActivityecoreluaPackage#getStatement_GlobalFunction_Declaration_Function()
	 * @model containment="true"
	 * @generated
	 */
	Function getFunction();

	/**
	 * Sets the value of the '{@link activityecorelua.Statement_GlobalFunction_Declaration#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(Function value);

} // Statement_GlobalFunction_Declaration
