/**
 */
package activityecorelua;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.EClass#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link activityecorelua.EClass#isInterface <em>Interface</em>}</li>
 *   <li>{@link activityecorelua.EClass#getESuperTypes <em>ESuper Types</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEOperations <em>EOperations</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEAllAttributes <em>EAll Attributes</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEAllReferences <em>EAll References</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEReferences <em>EReferences</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEAttributes <em>EAttributes</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEAllContainments <em>EAll Containments</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEAllOperations <em>EAll Operations</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEAllStructuralFeatures <em>EAll Structural Features</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEAllSuperTypes <em>EAll Super Types</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEIDAttribute <em>EID Attribute</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEStructuralFeatures <em>EStructural Features</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEGenericSuperTypes <em>EGeneric Super Types</em>}</li>
 *   <li>{@link activityecorelua.EClass#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}</li>
 * </ul>
 *
 * @see activityecorelua.ActivityecoreluaPackage#getEClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InterfaceIsAbstract AtMostOneID UniqueFeatureNames UniqueOperationSignatures NoCircularSuperTypes WellFormedMapEntryClass ConsistentSuperTypes DisjointFeatureAndOperationSignatures'"
 * @generated
 */
public interface EClass extends EClassifier {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_Abstract()
	 * @model dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link activityecorelua.EClass#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_Interface()
	 * @model dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link activityecorelua.EClass#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>ESuper Types</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ESuper Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESuper Types</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_ESuperTypes()
	 * @model unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<EClass> getESuperTypes();

	/**
	 * Returns the value of the '<em><b>EOperations</b></em>' containment reference list.
	 * The list contents are of type {@link activityecorelua.EOperation}.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EOperation#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EOperations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EOperations</em>' containment reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EOperations()
	 * @see activityecorelua.EOperation#getEContainingClass
	 * @model opposite="eContainingClass" containment="true"
	 * @generated
	 */
	EList<EOperation> getEOperations();

	/**
	 * Returns the value of the '<em><b>EAll Attributes</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Attributes</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EAllAttributes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EAttribute> getEAllAttributes();

	/**
	 * Returns the value of the '<em><b>EAll References</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll References</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EAllReferences()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EReference> getEAllReferences();

	/**
	 * Returns the value of the '<em><b>EReferences</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReferences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReferences</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EReferences()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EReference> getEReferences();

	/**
	 * Returns the value of the '<em><b>EAttributes</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttributes</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EAttributes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EAttribute> getEAttributes();

	/**
	 * Returns the value of the '<em><b>EAll Containments</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Containments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Containments</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EAllContainments()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EReference> getEAllContainments();

	/**
	 * Returns the value of the '<em><b>EAll Operations</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Operations</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EAllOperations()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EOperation> getEAllOperations();

	/**
	 * Returns the value of the '<em><b>EAll Structural Features</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Structural Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Structural Features</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EAllStructuralFeatures()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EStructuralFeature> getEAllStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>EAll Super Types</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Super Types</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EAllSuperTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EClass> getEAllSuperTypes();

	/**
	 * Returns the value of the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EID Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EID Attribute</em>' reference.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EIDAttribute()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EAttribute getEIDAttribute();

	/**
	 * Returns the value of the '<em><b>EStructural Features</b></em>' containment reference list.
	 * The list contents are of type {@link activityecorelua.EStructuralFeature}.
	 * It is bidirectional and its opposite is '{@link activityecorelua.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EStructural Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EStructural Features</em>' containment reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EStructuralFeatures()
	 * @see activityecorelua.EStructuralFeature#getEContainingClass
	 * @model opposite="eContainingClass" containment="true"
	 * @generated
	 */
	EList<EStructuralFeature> getEStructuralFeatures();

	/**
	 * Returns the value of the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * The list contents are of type {@link activityecorelua.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EGeneric Super Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGeneric Super Types</em>' containment reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EGenericSuperTypes()
	 * @model containment="true" unsettable="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EList<EGenericType> getEGenericSuperTypes();

	/**
	 * Returns the value of the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * The list contents are of type {@link activityecorelua.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAll Generic Super Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAll Generic Super Types</em>' reference list.
	 * @see activityecorelua.ActivityecoreluaPackage#getEClass_EAllGenericSuperTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EGenericType> getEAllGenericSuperTypes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activityecorelua.EBoolean"
	 * @generated
	 */
	boolean isSuperTypeOf(EClass someClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="activityecorelua.EInt"
	 * @generated
	 */
	int getFeatureCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureIDDataType="activityecorelua.EInt"
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature(int featureID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activityecorelua.EInt"
	 * @generated
	 */
	int getFeatureID(EStructuralFeature feature);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model featureNameDataType="activityecorelua.EString"
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature(String featureName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="activityecorelua.EInt"
	 * @generated
	 */
	int getOperationCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model operationIDDataType="activityecorelua.EInt"
	 * @generated
	 */
	EOperation getEOperation(int operationID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="activityecorelua.EInt"
	 * @generated
	 */
	int getOperationID(EOperation operation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EOperation getOverride(EOperation operation);

} // EClass
