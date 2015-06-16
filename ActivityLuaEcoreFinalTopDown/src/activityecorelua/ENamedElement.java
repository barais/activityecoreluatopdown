/**
 */
package activityecorelua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ENamed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.ENamedElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getENamedElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedName'"
 * @generated
 */
public interface ENamedElement extends EModelElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see activityecorelua.ActivityecoreluaPackage#getENamedElement_Name()
	 * @model dataType="activityecorelua.EString"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link activityecorelua.ENamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ENamedElement
