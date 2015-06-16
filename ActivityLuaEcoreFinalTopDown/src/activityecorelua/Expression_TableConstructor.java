/**
 */
package activityecorelua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Table Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.Expression_TableConstructor#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getExpression_TableConstructor()
 * @model
 * @generated
 */
public interface Expression_TableConstructor extends Expression {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link activityecorelua.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getExpression_TableConstructor_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // Expression_TableConstructor
