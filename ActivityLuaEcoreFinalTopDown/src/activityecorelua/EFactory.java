/**
 */
package activityecorelua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFactory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.EFactory#getEPackage <em>EPackage</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getEFactory()
 * @model
 * @generated
 */
public interface EFactory extends EModelElement {
	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EPackage#getEFactoryInstance <em>EFactory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' reference.
	 * @see #setEPackage(EPackage)
	 * @see activityecorelua.ActivityecoreluaPackage#getEFactory_EPackage()
	 * @see activityecorelua.EPackage#getEFactoryInstance
	 * @model opposite="eFactoryInstance" resolveProxies="false" required="true" transient="true"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Sets the value of the '{@link activityecorelua.EFactory#getEPackage <em>EPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EPackage</em>' reference.
	 * @see #getEPackage()
	 * @generated
	 */
	void setEPackage(EPackage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject create(EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activityecorelua.EJavaObject" literalValueDataType="activityecorelua.EString"
	 * @generated
	 */
	Object createFromString(EDataType eDataType, String literalValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activityecorelua.EString" instanceValueDataType="activityecorelua.EJavaObject"
	 * @generated
	 */
	String convertToString(EDataType eDataType, Object instanceValue);

} // EFactory
