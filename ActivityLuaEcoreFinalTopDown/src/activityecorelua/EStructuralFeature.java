/**
 */
package activityecorelua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStructural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.EStructuralFeature#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link activityecorelua.EStructuralFeature#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link activityecorelua.EStructuralFeature#isTransient <em>Transient</em>}</li>
 *   <li>{@link activityecorelua.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link activityecorelua.EStructuralFeature#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link activityecorelua.EStructuralFeature#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link activityecorelua.EStructuralFeature#isDerived <em>Derived</em>}</li>
 *   <li>{@link activityecorelua.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getEStructuralFeature()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidDefaultValueLiteral'"
 * @generated
 */
public interface EStructuralFeature extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>Changeable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changeable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changeable</em>' attribute.
	 * @see #setChangeable(boolean)
	 * @see activityecorelua.ActivityecoreluaPackage#getEStructuralFeature_Changeable()
	 * @model default="true" dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isChangeable();

	/**
	 * Sets the value of the '{@link activityecorelua.EStructuralFeature#isChangeable <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changeable</em>' attribute.
	 * @see #isChangeable()
	 * @generated
	 */
	void setChangeable(boolean value);

	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(boolean)
	 * @see activityecorelua.ActivityecoreluaPackage#getEStructuralFeature_Volatile()
	 * @model dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isVolatile();

	/**
	 * Sets the value of the '{@link activityecorelua.EStructuralFeature#isVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #isVolatile()
	 * @generated
	 */
	void setVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see activityecorelua.ActivityecoreluaPackage#getEStructuralFeature_Transient()
	 * @model dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link activityecorelua.EStructuralFeature#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Literal</em>' attribute.
	 * @see #setDefaultValueLiteral(String)
	 * @see activityecorelua.ActivityecoreluaPackage#getEStructuralFeature_DefaultValueLiteral()
	 * @model dataType="activityecorelua.EString"
	 * @generated
	 */
	String getDefaultValueLiteral();

	/**
	 * Sets the value of the '{@link activityecorelua.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Literal</em>' attribute.
	 * @see #getDefaultValueLiteral()
	 * @generated
	 */
	void setDefaultValueLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see activityecorelua.ActivityecoreluaPackage#getEStructuralFeature_DefaultValue()
	 * @model dataType="activityecorelua.EJavaObject" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Object getDefaultValue();

	/**
	 * Returns the value of the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsettable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsettable</em>' attribute.
	 * @see #setUnsettable(boolean)
	 * @see activityecorelua.ActivityecoreluaPackage#getEStructuralFeature_Unsettable()
	 * @model dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isUnsettable();

	/**
	 * Sets the value of the '{@link activityecorelua.EStructuralFeature#isUnsettable <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsettable</em>' attribute.
	 * @see #isUnsettable()
	 * @generated
	 */
	void setUnsettable(boolean value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see activityecorelua.ActivityecoreluaPackage#getEStructuralFeature_Derived()
	 * @model dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link activityecorelua.EStructuralFeature#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EClass#getEStructuralFeatures <em>EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContaining Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Class</em>' container reference.
	 * @see activityecorelua.ActivityecoreluaPackage#getEStructuralFeature_EContainingClass()
	 * @see activityecorelua.EClass#getEStructuralFeatures
	 * @model opposite="eStructuralFeatures" resolveProxies="false" changeable="false"
	 * @generated
	 */
	EClass getEContainingClass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="activityecorelua.EInt"
	 * @generated
	 */
	int getFeatureID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="activityecorelua.EJavaClass<?>"
	 * @generated
	 */
	Class<?> getContainerClass();

} // EStructuralFeature
