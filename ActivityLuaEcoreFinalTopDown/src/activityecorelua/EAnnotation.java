/**
 */
package activityecorelua;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAnnotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.EAnnotation#getSource <em>Source</em>}</li>
 *   <li>{@link activityecorelua.EAnnotation#getDetails <em>Details</em>}</li>
 *   <li>{@link activityecorelua.EAnnotation#getEModelElement <em>EModel Element</em>}</li>
 *   <li>{@link activityecorelua.EAnnotation#getContents <em>Contents</em>}</li>
 *   <li>{@link activityecorelua.EAnnotation#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getEAnnotation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedSourceURI'"
 * @generated
 */
public interface EAnnotation extends EModelElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see activityecorelua.ActivityecoreluaPackage#getEAnnotation_Source()
	 * @model dataType="activityecorelua.EString"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link activityecorelua.EAnnotation#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' map.
	 * @see activityecorelua.ActivityecoreluaPackage#getEAnnotation_Details()
	 * @model mapType="activityecorelua.EStringToStringMapEntry<activityecorelua.EString, activityecorelua.EString>"
	 * @generated
	 */
	EMap<String, String> getDetails();

	/**
	 * Returns the value of the '<em><b>EModel Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EModelElement#getEAnnotations <em>EAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EModel Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EModel Element</em>' container reference.
	 * @see #setEModelElement(EModelElement)
	 * @see activityecorelua.ActivityecoreluaPackage#getEAnnotation_EModelElement()
	 * @see activityecorelua.EModelElement#getEAnnotations
	 * @model opposite="eAnnotations" resolveProxies="false"
	 * @generated
	 */
	EModelElement getEModelElement();

	/**
	 * Sets the value of the '{@link activityecorelua.EAnnotation#getEModelElement <em>EModel Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EModel Element</em>' container reference.
	 * @see #getEModelElement()
	 * @generated
	 */
	void setEModelElement(EModelElement value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link activityecorelua.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEAnnotation_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContents();

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEAnnotation_References()
	 * @model
	 * @generated
	 */
	EList<EObject> getReferences();

} // EAnnotation
