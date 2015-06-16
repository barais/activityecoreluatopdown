/**
 */
package activityecorelua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETyped Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.ETypedElement#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link activityecorelua.ETypedElement#isUnique <em>Unique</em>}</li>
 *   <li>{@link activityecorelua.ETypedElement#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link activityecorelua.ETypedElement#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link activityecorelua.ETypedElement#isMany <em>Many</em>}</li>
 *   <li>{@link activityecorelua.ETypedElement#isRequired <em>Required</em>}</li>
 *   <li>{@link activityecorelua.ETypedElement#getEType <em>EType</em>}</li>
 *   <li>{@link activityecorelua.ETypedElement#getEGenericType <em>EGeneric Type</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getETypedElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidLowerBound ValidUpperBound ConsistentBounds ValidType'"
 * @generated
 */
public interface ETypedElement extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see activityecorelua.ActivityecoreluaPackage#getETypedElement_Ordered()
	 * @model default="true" dataType="activityecorelua.EBoolean"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Variable'"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link activityecorelua.ETypedElement#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see activityecorelua.ActivityecoreluaPackage#getETypedElement_Unique()
	 * @model default="true" dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link activityecorelua.ETypedElement#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see activityecorelua.ActivityecoreluaPackage#getETypedElement_LowerBound()
	 * @model dataType="activityecorelua.EInt"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='Variable'"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link activityecorelua.ETypedElement#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see activityecorelua.ActivityecoreluaPackage#getETypedElement_UpperBound()
	 * @model default="1" dataType="activityecorelua.EInt"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link activityecorelua.ETypedElement#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see activityecorelua.ActivityecoreluaPackage#getETypedElement_Many()
	 * @model dataType="activityecorelua.EBoolean" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isMany();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see activityecorelua.ActivityecoreluaPackage#getETypedElement_Required()
	 * @model dataType="activityecorelua.EBoolean" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Returns the value of the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType</em>' reference.
	 * @see #setEType(EClassifier)
	 * @see activityecorelua.ActivityecoreluaPackage#getETypedElement_EType()
	 * @model unsettable="true" volatile="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EClassifier getEType();

	/**
	 * Sets the value of the '{@link activityecorelua.ETypedElement#getEType <em>EType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EType</em>' reference.
	 * @see #getEType()
	 * @generated
	 */
	void setEType(EClassifier value);

	/**
	 * Returns the value of the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EGeneric Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGeneric Type</em>' containment reference.
	 * @see #setEGenericType(EGenericType)
	 * @see activityecorelua.ActivityecoreluaPackage#getETypedElement_EGenericType()
	 * @model containment="true" unsettable="true" volatile="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EGenericType getEGenericType();

	/**
	 * Sets the value of the '{@link activityecorelua.ETypedElement#getEGenericType <em>EGeneric Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EGeneric Type</em>' containment reference.
	 * @see #getEGenericType()
	 * @generated
	 */
	void setEGenericType(EGenericType value);

} // ETypedElement
