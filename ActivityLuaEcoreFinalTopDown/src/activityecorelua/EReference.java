/**
 */
package activityecorelua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EReference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.EReference#isContainment <em>Containment</em>}</li>
 *   <li>{@link activityecorelua.EReference#isContainer <em>Container</em>}</li>
 *   <li>{@link activityecorelua.EReference#isResolveProxies <em>Resolve Proxies</em>}</li>
 *   <li>{@link activityecorelua.EReference#getEOpposite <em>EOpposite</em>}</li>
 *   <li>{@link activityecorelua.EReference#getEReferenceType <em>EReference Type</em>}</li>
 *   <li>{@link activityecorelua.EReference#getEKeys <em>EKeys</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getEReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConsistentOpposite SingleContainer ConsistentKeys ConsistentUnique ConsistentContainer'"
 * @generated
 */
public interface EReference extends EStructuralFeature {
	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see activityecorelua.ActivityecoreluaPackage#getEReference_Containment()
	 * @model dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link activityecorelua.EReference#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see activityecorelua.ActivityecoreluaPackage#getEReference_Container()
	 * @model dataType="activityecorelua.EBoolean" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isContainer();

	/**
	 * Returns the value of the '<em><b>Resolve Proxies</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Proxies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Proxies</em>' attribute.
	 * @see #setResolveProxies(boolean)
	 * @see activityecorelua.ActivityecoreluaPackage#getEReference_ResolveProxies()
	 * @model default="true" dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isResolveProxies();

	/**
	 * Sets the value of the '{@link activityecorelua.EReference#isResolveProxies <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve Proxies</em>' attribute.
	 * @see #isResolveProxies()
	 * @generated
	 */
	void setResolveProxies(boolean value);

	/**
	 * Returns the value of the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOpposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOpposite</em>' reference.
	 * @see #setEOpposite(EReference)
	 * @see activityecorelua.ActivityecoreluaPackage#getEReference_EOpposite()
	 * @model
	 * @generated
	 */
	EReference getEOpposite();

	/**
	 * Sets the value of the '{@link activityecorelua.EReference#getEOpposite <em>EOpposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EOpposite</em>' reference.
	 * @see #getEOpposite()
	 * @generated
	 */
	void setEOpposite(EReference value);

	/**
	 * Returns the value of the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference Type</em>' reference.
	 * @see activityecorelua.ActivityecoreluaPackage#getEReference_EReferenceType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EClass getEReferenceType();

	/**
	 * Returns the value of the '<em><b>EKeys</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EKeys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EKeys</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEReference_EKeys()
	 * @model
	 * @generated
	 */
	EList<EAttribute> getEKeys();

} // EReference
