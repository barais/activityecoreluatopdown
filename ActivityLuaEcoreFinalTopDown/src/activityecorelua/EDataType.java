/**
 */
package activityecorelua;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EData Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.EDataType#isSerializable <em>Serializable</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getEDataType()
 * @model
 * @generated
 */
public interface EDataType extends EClassifier {
	/**
	 * Returns the value of the '<em><b>Serializable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serializable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serializable</em>' attribute.
	 * @see #setSerializable(boolean)
	 * @see activityecorelua.ActivityecoreluaPackage#getEDataType_Serializable()
	 * @model default="true" dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isSerializable();

	/**
	 * Sets the value of the '{@link activityecorelua.EDataType#isSerializable <em>Serializable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serializable</em>' attribute.
	 * @see #isSerializable()
	 * @generated
	 */
	void setSerializable(boolean value);

} // EDataType
