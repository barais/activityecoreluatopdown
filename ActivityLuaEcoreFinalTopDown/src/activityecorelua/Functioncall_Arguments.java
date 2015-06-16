/**
 */
package activityecorelua;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functioncall Arguments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.Functioncall_Arguments#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getFunctioncall_Arguments()
 * @model
 * @generated
 */
public interface Functioncall_Arguments extends EObject {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link activityecorelua.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getFunctioncall_Arguments_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

} // Functioncall_Arguments
