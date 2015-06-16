/**
 */
package activityecorelua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.EParameter#getEOperation <em>EOperation</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getEParameter()
 * @model
 * @generated
 */
public interface EParameter extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>EOperation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EOperation#getEParameters <em>EParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOperation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperation</em>' container reference.
	 * @see activityecorelua.ActivityecoreluaPackage#getEParameter_EOperation()
	 * @see activityecorelua.EOperation#getEParameters
	 * @model opposite="eParameters" resolveProxies="false" changeable="false"
	 * @generated
	 */
	EOperation getEOperation();

} // EParameter
