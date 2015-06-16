/**
 */
package activityecorelua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.EOperation#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link activityecorelua.EOperation#getETypeParameters <em>EType Parameters</em>}</li>
 *   <li>{@link activityecorelua.EOperation#getEParameters <em>EParameters</em>}</li>
 *   <li>{@link activityecorelua.EOperation#getActivity <em>Activity</em>}</li>
 *   <li>{@link activityecorelua.EOperation#getEExceptions <em>EExceptions</em>}</li>
 *   <li>{@link activityecorelua.EOperation#getEGenericExceptions <em>EGeneric Exceptions</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getEOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueParameterNames UniqueTypeParameterNames NoRepeatingVoid'"
 * @generated
 */
public interface EOperation extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EClass#getEOperations <em>EOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContaining Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Class</em>' container reference.
	 * @see activityecorelua.ActivityecoreluaPackage#getEOperation_EContainingClass()
	 * @see activityecorelua.EClass#getEOperations
	 * @model opposite="eOperations" resolveProxies="false" changeable="false"
	 * @generated
	 */
	EClass getEContainingClass();

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
	 * @see activityecorelua.ActivityecoreluaPackage#getEOperation_ETypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ETypeParameter> getETypeParameters();

	/**
	 * Returns the value of the '<em><b>EParameters</b></em>' containment reference list.
	 * The list contents are of type {@link activityecorelua.EParameter}.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EParameter#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EParameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EParameters</em>' containment reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEOperation_EParameters()
	 * @see activityecorelua.EParameter#getEOperation
	 * @model opposite="eOperation" containment="true"
	 * @generated
	 */
	EList<EParameter> getEParameters();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see activityecorelua.ActivityecoreluaPackage#getEOperation_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link activityecorelua.EOperation#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>EExceptions</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EExceptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EExceptions</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEOperation_EExceptions()
	 * @model unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<EClassifier> getEExceptions();

	/**
	 * Returns the value of the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link activityecorelua.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EGeneric Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGeneric Exceptions</em>' containment reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEOperation_EGenericExceptions()
	 * @model containment="true" unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<EGenericType> getEGenericExceptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="activityecorelua.EInt"
	 * @generated
	 */
	int getOperationID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isOverrideOf(EOperation someOperation);

} // EOperation
