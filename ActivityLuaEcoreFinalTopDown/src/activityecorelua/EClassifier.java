/**
 */
package activityecorelua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClassifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.EClassifier#getInstanceClassName <em>Instance Class Name</em>}</li>
 *   <li>{@link activityecorelua.EClassifier#getInstanceClass <em>Instance Class</em>}</li>
 *   <li>{@link activityecorelua.EClassifier#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link activityecorelua.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}</li>
 *   <li>{@link activityecorelua.EClassifier#getEPackage <em>EPackage</em>}</li>
 *   <li>{@link activityecorelua.EClassifier#getETypeParameters <em>EType Parameters</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getEClassifier()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedInstanceTypeName UniqueTypeParameterNames'"
 * @generated
 */
public interface EClassifier extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class Name</em>' attribute.
	 * @see #setInstanceClassName(String)
	 * @see activityecorelua.ActivityecoreluaPackage#getEClassifier_InstanceClassName()
	 * @model unsettable="true" dataType="activityecorelua.EString" volatile="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='ControlFlow' unique='false' upper='*'"
	 * @generated
	 */
	String getInstanceClassName();

	/**
	 * Sets the value of the '{@link activityecorelua.EClassifier#getInstanceClassName <em>Instance Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class Name</em>' attribute.
	 * @see #getInstanceClassName()
	 * @generated
	 */
	void setInstanceClassName(String value);

	/**
	 * Returns the value of the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class</em>' attribute.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClassifier_InstanceClass()
	 * @model dataType="activityecorelua.EJavaClass<?>" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Class<?> getInstanceClass();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClassifier_DefaultValue()
	 * @model dataType="activityecorelua.EJavaObject" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Object getDefaultValue();

	/**
	 * Returns the value of the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type Name</em>' attribute.
	 * @see #setInstanceTypeName(String)
	 * @see activityecorelua.ActivityecoreluaPackage#getEClassifier_InstanceTypeName()
	 * @model unsettable="true" dataType="activityecorelua.EString" volatile="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getInstanceTypeName();

	/**
	 * Sets the value of the '{@link activityecorelua.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type Name</em>' attribute.
	 * @see #getInstanceTypeName()
	 * @generated
	 */
	void setInstanceTypeName(String value);

	/**
	 * Returns the value of the '<em><b>EPackage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EPackage#getEClassifiers <em>EClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EPackage</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EPackage</em>' container reference.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClassifier_EPackage()
	 * @see activityecorelua.EPackage#getEClassifiers
	 * @model opposite="eClassifiers" changeable="false"
	 * @generated
	 */
	EPackage getEPackage();

	/**
	 * Returns the value of the '<em><b>EType Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link activityecorelua.ETypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Parameters</em>' containment reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClassifier_ETypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ETypeParameter> getETypeParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activityecorelua.EBoolean" objectDataType="activityecorelua.EJavaObject"
	 * @generated
	 */
	boolean isInstance(Object object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="activityecorelua.EInt"
	 * @generated
	 */
	int getClassifierID();

} // EClassifier
