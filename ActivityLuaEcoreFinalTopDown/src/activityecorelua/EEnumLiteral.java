/**
 */
package activityecorelua;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.EEnumLiteral#getValue <em>Value</em>}</li>
 *   <li>{@link activityecorelua.EEnumLiteral#getInstance <em>Instance</em>}</li>
 *   <li>{@link activityecorelua.EEnumLiteral#getLiteral <em>Literal</em>}</li>
 *   <li>{@link activityecorelua.EEnumLiteral#getEEnum <em>EEnum</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getEEnumLiteral()
 * @model
 * @generated
 */
public interface EEnumLiteral extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see activityecorelua.ActivityecoreluaPackage#getEEnumLiteral_Value()
	 * @model dataType="activityecorelua.EInt"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link activityecorelua.EEnumLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' attribute.
	 * @see #setInstance(Enumerator)
	 * @see activityecorelua.ActivityecoreluaPackage#getEEnumLiteral_Instance()
	 * @model dataType="activityecorelua.EEnumerator" transient="true"
	 * @generated
	 */
	Enumerator getInstance();

	/**
	 * Sets the value of the '{@link activityecorelua.EEnumLiteral#getInstance <em>Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' attribute.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(Enumerator value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see activityecorelua.ActivityecoreluaPackage#getEEnumLiteral_Literal()
	 * @model dataType="activityecorelua.EString"
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link activityecorelua.EEnumLiteral#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

	/**
	 * Returns the value of the '<em><b>EEnum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EEnum#getELiterals <em>ELiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EEnum</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EEnum</em>' container reference.
	 * @see activityecorelua.ActivityecoreluaPackage#getEEnumLiteral_EEnum()
	 * @see activityecorelua.EEnum#getELiterals
	 * @model opposite="eLiterals" resolveProxies="false" changeable="false"
	 * @generated
	 */
	EEnum getEEnum();

} // EEnumLiteral
