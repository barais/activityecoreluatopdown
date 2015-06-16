/**
 */
package activityecorelua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.EEnum#getELiterals <em>ELiterals</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getEEnum()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueEnumeratorNames UniqueEnumeratorLiterals'"
 * @generated
 */
public interface EEnum extends EDataType {
	/**
	 * Returns the value of the '<em><b>ELiterals</b></em>' containment reference list.
	 * The list contents are of type {@link activityecorelua.EEnumLiteral}.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EEnumLiteral#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELiterals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELiterals</em>' containment reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEEnum_ELiterals()
	 * @see activityecorelua.EEnumLiteral#getEEnum
	 * @model opposite="eEnum" containment="true"
	 * @generated
	 */
	EList<EEnumLiteral> getELiterals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="activityecorelua.EString"
	 * @generated
	 */
	EEnumLiteral getEEnumLiteral(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueDataType="activityecorelua.EInt"
	 * @generated
	 */
	EEnumLiteral getEEnumLiteral(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalDataType="activityecorelua.EString"
	 * @generated
	 */
	EEnumLiteral getEEnumLiteralByLiteral(String literal);

} // EEnum
