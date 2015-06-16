/**
 */
package activityecorelua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.EPackage#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link activityecorelua.EPackage#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link activityecorelua.EPackage#getEFactoryInstance <em>EFactory Instance</em>}</li>
 *   <li>{@link activityecorelua.EPackage#getEClassifiers <em>EClassifiers</em>}</li>
 *   <li>{@link activityecorelua.EPackage#getESubpackages <em>ESubpackages</em>}</li>
 *   <li>{@link activityecorelua.EPackage#getESuperPackage <em>ESuper Package</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getEPackage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WellFormedNsURI WellFormedNsPrefix UniqueSubpackageNames UniqueClassifierNames UniqueNsURIs'"
 * @generated
 */
public interface EPackage extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see activityecorelua.ActivityecoreluaPackage#getEPackage_NsURI()
	 * @model dataType="activityecorelua.EString"
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link activityecorelua.EPackage#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns Prefix</em>' attribute.
	 * @see #setNsPrefix(String)
	 * @see activityecorelua.ActivityecoreluaPackage#getEPackage_NsPrefix()
	 * @model dataType="activityecorelua.EString"
	 * @generated
	 */
	String getNsPrefix();

	/**
	 * Sets the value of the '{@link activityecorelua.EPackage#getNsPrefix <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns Prefix</em>' attribute.
	 * @see #getNsPrefix()
	 * @generated
	 */
	void setNsPrefix(String value);

	/**
	 * Returns the value of the '<em><b>EFactory Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EFactory#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EFactory Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EFactory Instance</em>' reference.
	 * @see #setEFactoryInstance(EFactory)
	 * @see activityecorelua.ActivityecoreluaPackage#getEPackage_EFactoryInstance()
	 * @see activityecorelua.EFactory#getEPackage
	 * @model opposite="ePackage" resolveProxies="false" required="true" transient="true"
	 * @generated
	 */
	EFactory getEFactoryInstance();

	/**
	 * Sets the value of the '{@link activityecorelua.EPackage#getEFactoryInstance <em>EFactory Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EFactory Instance</em>' reference.
	 * @see #getEFactoryInstance()
	 * @generated
	 */
	void setEFactoryInstance(EFactory value);

	/**
	 * Returns the value of the '<em><b>EClassifiers</b></em>' containment reference list.
	 * The list contents are of type {@link activityecorelua.EClassifier}.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EClassifier#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClassifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClassifiers</em>' containment reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEPackage_EClassifiers()
	 * @see activityecorelua.EClassifier#getEPackage
	 * @model opposite="ePackage" containment="true"
	 * @generated
	 */
	EList<EClassifier> getEClassifiers();

	/**
	 * Returns the value of the '<em><b>ESubpackages</b></em>' containment reference list.
	 * The list contents are of type {@link activityecorelua.EPackage}.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EPackage#getESuperPackage <em>ESuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESubpackages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESubpackages</em>' containment reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEPackage_ESubpackages()
	 * @see activityecorelua.EPackage#getESuperPackage
	 * @model opposite="eSuperPackage" containment="true"
	 * @generated
	 */
	EList<EPackage> getESubpackages();

	/**
	 * Returns the value of the '<em><b>ESuper Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EPackage#getESubpackages <em>ESubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESuper Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Package</em>' container reference.
	 * @see activityecorelua.ActivityecoreluaPackage#getEPackage_ESuperPackage()
	 * @see activityecorelua.EPackage#getESubpackages
	 * @model opposite="eSubpackages" changeable="false"
	 * @generated
	 */
	EPackage getESuperPackage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="activityecorelua.EString"
	 * @generated
	 */
	EClassifier getEClassifier(String name);

} // EPackage
