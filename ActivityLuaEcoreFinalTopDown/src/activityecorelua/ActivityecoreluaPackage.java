/**
 */
package activityecorelua;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see activityecorelua.ActivityecoreluaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface ActivityecoreluaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activityecorelua";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://activityecorelua/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "activityecorelua";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityecoreluaPackage eINSTANCE = activityecorelua.impl.ActivityecoreluaPackageImpl.init();

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EModelElementImpl <em>EModel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EModelElementImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEModelElement()
	 * @generated
	 */
	int EMODEL_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT__EANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>EModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT___GET_EANNOTATION__STRING = 0;

	/**
	 * The number of operations of the '<em>EModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMODEL_ELEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ENamedElementImpl <em>ENamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ENamedElementImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getENamedElement()
	 * @generated
	 */
	int ENAMED_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT__NAME = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ENamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT___GET_EANNOTATION__STRING = EMODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>ENamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENAMED_ELEMENT_OPERATION_COUNT = EMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ETypedElementImpl <em>ETyped Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ETypedElementImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getETypedElement()
	 * @generated
	 */
	int ETYPED_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__ORDERED = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__UNIQUE = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__LOWER_BOUND = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__UPPER_BOUND = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__MANY = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__REQUIRED = ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__ETYPE = ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT__EGENERIC_TYPE = ENAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>ETyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT___GET_EANNOTATION__STRING = ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>ETyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPED_ELEMENT_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EStructuralFeatureImpl <em>EStructural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EStructuralFeatureImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEStructuralFeature()
	 * @generated
	 */
	int ESTRUCTURAL_FEATURE = 15;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ORDERED = ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UNIQUE = ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__MANY = ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__REQUIRED = ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__EGENERIC_TYPE = ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__CHANGEABLE = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__VOLATILE = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__TRANSIENT = ETYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = ETYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DEFAULT_VALUE = ETYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__UNSETTABLE = ETYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__DERIVED = ETYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE___GET_EANNOTATION__STRING = ETYPED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE___GET_FEATURE_ID = ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE___GET_CONTAINER_CLASS = ETYPED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>EStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRUCTURAL_FEATURE_OPERATION_COUNT = ETYPED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EAttributeImpl <em>EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EAttributeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEAttribute()
	 * @generated
	 */
	int EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__EANNOTATIONS = ESTRUCTURAL_FEATURE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__NAME = ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ORDERED = ESTRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UNIQUE = ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__LOWER_BOUND = ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UPPER_BOUND = ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__MANY = ESTRUCTURAL_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__REQUIRED = ESTRUCTURAL_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ETYPE = ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__EGENERIC_TYPE = ESTRUCTURAL_FEATURE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__CHANGEABLE = ESTRUCTURAL_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__VOLATILE = ESTRUCTURAL_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__TRANSIENT = ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DEFAULT_VALUE_LITERAL = ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DEFAULT_VALUE = ESTRUCTURAL_FEATURE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__UNSETTABLE = ESTRUCTURAL_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DERIVED = ESTRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ECONTAINING_CLASS = ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ID = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EAttribute Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__EATTRIBUTE_TYPE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_FEATURE_COUNT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE___GET_EANNOTATION__STRING = ESTRUCTURAL_FEATURE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE___GET_FEATURE_ID = ESTRUCTURAL_FEATURE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE___GET_CONTAINER_CLASS = ESTRUCTURAL_FEATURE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_OPERATION_COUNT = ESTRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EAnnotationImpl <em>EAnnotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EAnnotationImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEAnnotation()
	 * @generated
	 */
	int EANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__SOURCE = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__DETAILS = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__EMODEL_ELEMENT = EMODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__CONTENTS = EMODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION__REFERENCES = EMODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION___GET_EANNOTATION__STRING = EMODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>EAnnotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EANNOTATION_OPERATION_COUNT = EMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EClassifierImpl <em>EClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EClassifierImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEClassifier()
	 * @generated
	 */
	int ECLASSIFIER = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__INSTANCE_CLASS_NAME = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__INSTANCE_CLASS = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__DEFAULT_VALUE = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__INSTANCE_TYPE_NAME = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__EPACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER__ETYPE_PARAMETERS = ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER___GET_EANNOTATION__STRING = ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER___IS_INSTANCE__OBJECT = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER___GET_CLASSIFIER_ID = ENAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>EClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASSIFIER_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EClassImpl <em>EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EClassImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEClass()
	 * @generated
	 */
	int ECLASS = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EANNOTATIONS = ECLASSIFIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__NAME = ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INSTANCE_CLASS_NAME = ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INSTANCE_CLASS = ECLASSIFIER__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__DEFAULT_VALUE = ECLASSIFIER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INSTANCE_TYPE_NAME = ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EPACKAGE = ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ETYPE_PARAMETERS = ECLASSIFIER__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ABSTRACT = ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__INTERFACE = ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ESuper Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ESUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EOperations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EOPERATIONS = ECLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EAll Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_ATTRIBUTES = ECLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EAll References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_REFERENCES = ECLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EReferences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EREFERENCES = ECLASSIFIER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EAttributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EATTRIBUTES = ECLASSIFIER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>EAll Containments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_CONTAINMENTS = ECLASSIFIER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>EAll Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_OPERATIONS = ECLASSIFIER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>EAll Structural Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_STRUCTURAL_FEATURES = ECLASSIFIER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>EAll Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>EID Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EID_ATTRIBUTE = ECLASSIFIER_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>EStructural Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ESTRUCTURAL_FEATURES = ECLASSIFIER_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>EGeneric Super Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EGENERIC_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>EAll Generic Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__EALL_GENERIC_SUPER_TYPES = ECLASSIFIER_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_EANNOTATION__STRING = ECLASSIFIER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___IS_INSTANCE__OBJECT = ECLASSIFIER___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_CLASSIFIER_ID = ECLASSIFIER___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Is Super Type Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___IS_SUPER_TYPE_OF__ECLASS = ECLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Feature Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_FEATURE_COUNT = ECLASSIFIER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_ESTRUCTURAL_FEATURE__INT = ECLASSIFIER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE = ECLASSIFIER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EStructural Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_ESTRUCTURAL_FEATURE__STRING = ECLASSIFIER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Operation Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get EOperation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_EOPERATION__INT = ECLASSIFIER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_OPERATION_ID__EOPERATION = ECLASSIFIER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Override</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS___GET_OVERRIDE__EOPERATION = ECLASSIFIER_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EDataTypeImpl <em>EData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EDataTypeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEDataType()
	 * @generated
	 */
	int EDATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__EANNOTATIONS = ECLASSIFIER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__NAME = ECLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__INSTANCE_CLASS_NAME = ECLASSIFIER__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__INSTANCE_CLASS = ECLASSIFIER__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__DEFAULT_VALUE = ECLASSIFIER__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__INSTANCE_TYPE_NAME = ECLASSIFIER__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__EPACKAGE = ECLASSIFIER__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__ETYPE_PARAMETERS = ECLASSIFIER__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE__SERIALIZABLE = ECLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE___GET_EANNOTATION__STRING = ECLASSIFIER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE___IS_INSTANCE__OBJECT = ECLASSIFIER___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE___GET_CLASSIFIER_ID = ECLASSIFIER___GET_CLASSIFIER_ID;

	/**
	 * The number of operations of the '<em>EData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDATA_TYPE_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EEnumImpl <em>EEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EEnumImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEEnum()
	 * @generated
	 */
	int EENUM = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__EANNOTATIONS = EDATA_TYPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__NAME = EDATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__INSTANCE_CLASS_NAME = EDATA_TYPE__INSTANCE_CLASS_NAME;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__INSTANCE_CLASS = EDATA_TYPE__INSTANCE_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__DEFAULT_VALUE = EDATA_TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Instance Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__INSTANCE_TYPE_NAME = EDATA_TYPE__INSTANCE_TYPE_NAME;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__EPACKAGE = EDATA_TYPE__EPACKAGE;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__ETYPE_PARAMETERS = EDATA_TYPE__ETYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__SERIALIZABLE = EDATA_TYPE__SERIALIZABLE;

	/**
	 * The feature id for the '<em><b>ELiterals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM__ELITERALS = EDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_FEATURE_COUNT = EDATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM___GET_EANNOTATION__STRING = EDATA_TYPE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Is Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM___IS_INSTANCE__OBJECT = EDATA_TYPE___IS_INSTANCE__OBJECT;

	/**
	 * The operation id for the '<em>Get Classifier ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM___GET_CLASSIFIER_ID = EDATA_TYPE___GET_CLASSIFIER_ID;

	/**
	 * The operation id for the '<em>Get EEnum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM___GET_EENUM_LITERAL__STRING = EDATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EEnum Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM___GET_EENUM_LITERAL__INT = EDATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EEnum Literal By Literal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING = EDATA_TYPE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>EEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_OPERATION_COUNT = EDATA_TYPE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EEnumLiteralImpl <em>EEnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EEnumLiteralImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEEnumLiteral()
	 * @generated
	 */
	int EENUM_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__VALUE = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__INSTANCE = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__LITERAL = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EEnum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL__EENUM = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL___GET_EANNOTATION__STRING = ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>EEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EENUM_LITERAL_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EFactoryImpl <em>EFactory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EFactoryImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEFactory()
	 * @generated
	 */
	int EFACTORY = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__EANNOTATIONS = EMODEL_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY__EPACKAGE = EMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EFactory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY_FEATURE_COUNT = EMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY___GET_EANNOTATION__STRING = EMODEL_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY___CREATE__ECLASS = EMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create From String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY___CREATE_FROM_STRING__EDATATYPE_STRING = EMODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Convert To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY___CONVERT_TO_STRING__EDATATYPE_OBJECT = EMODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>EFactory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFACTORY_OPERATION_COUNT = EMODEL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EObjectImpl <em>EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EObjectImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEObject()
	 * @generated
	 */
	int EOBJECT = 10;

	/**
	 * The number of structural features of the '<em>EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Ee Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT___EE_CLASS = 0;

	/**
	 * The number of operations of the '<em>EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EOperationImpl <em>EOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EOperationImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEOperation()
	 * @generated
	 */
	int EOPERATION = 11;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ORDERED = ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__UNIQUE = ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__MANY = ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__REQUIRED = ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EGENERIC_TYPE = ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ECONTAINING_CLASS = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EType Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ETYPE_PARAMETERS = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EParameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EPARAMETERS = ETYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__ACTIVITY = ETYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EExceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EEXCEPTIONS = ETYPED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION__EGENERIC_EXCEPTIONS = ETYPED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION___GET_EANNOTATION__STRING = ETYPED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Operation ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION___GET_OPERATION_ID = ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Override Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION___IS_OVERRIDE_OF__EOPERATION = ETYPED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>EOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOPERATION_OPERATION_COUNT = ETYPED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EPackageImpl <em>EPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EPackageImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEPackage()
	 * @generated
	 */
	int EPACKAGE = 12;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NS_URI = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NS_PREFIX = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EFactory Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__EFACTORY_INSTANCE = ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EClassifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ECLASSIFIERS = ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ESubpackages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ESUBPACKAGES = ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ESuper Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__ESUPER_PACKAGE = ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE___GET_EANNOTATION__STRING = ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get EClassifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE___GET_ECLASSIFIER__STRING = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>EPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EParameterImpl <em>EParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EParameterImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEParameter()
	 * @generated
	 */
	int EPARAMETER = 13;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__EANNOTATIONS = ETYPED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__NAME = ETYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__ORDERED = ETYPED_ELEMENT__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__UNIQUE = ETYPED_ELEMENT__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__LOWER_BOUND = ETYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__UPPER_BOUND = ETYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__MANY = ETYPED_ELEMENT__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__REQUIRED = ETYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__ETYPE = ETYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__EGENERIC_TYPE = ETYPED_ELEMENT__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER__EOPERATION = ETYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER_FEATURE_COUNT = ETYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER___GET_EANNOTATION__STRING = ETYPED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>EParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPARAMETER_OPERATION_COUNT = ETYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EReferenceImpl <em>EReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EReferenceImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEReference()
	 * @generated
	 */
	int EREFERENCE = 14;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EANNOTATIONS = ESTRUCTURAL_FEATURE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__NAME = ESTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ORDERED = ESTRUCTURAL_FEATURE__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UNIQUE = ESTRUCTURAL_FEATURE__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__LOWER_BOUND = ESTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UPPER_BOUND = ESTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__MANY = ESTRUCTURAL_FEATURE__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__REQUIRED = ESTRUCTURAL_FEATURE__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ETYPE = ESTRUCTURAL_FEATURE__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EGENERIC_TYPE = ESTRUCTURAL_FEATURE__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__CHANGEABLE = ESTRUCTURAL_FEATURE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__VOLATILE = ESTRUCTURAL_FEATURE__VOLATILE;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__TRANSIENT = ESTRUCTURAL_FEATURE__TRANSIENT;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DEFAULT_VALUE_LITERAL = ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DEFAULT_VALUE = ESTRUCTURAL_FEATURE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Unsettable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__UNSETTABLE = ESTRUCTURAL_FEATURE__UNSETTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__DERIVED = ESTRUCTURAL_FEATURE__DERIVED;

	/**
	 * The feature id for the '<em><b>EContaining Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__ECONTAINING_CLASS = ESTRUCTURAL_FEATURE__ECONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__CONTAINMENT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__CONTAINER = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__RESOLVE_PROXIES = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EOpposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EOPPOSITE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EReference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EREFERENCE_TYPE = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EKeys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE__EKEYS = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_FEATURE_COUNT = ESTRUCTURAL_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE___GET_EANNOTATION__STRING = ESTRUCTURAL_FEATURE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get Feature ID</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE___GET_FEATURE_ID = ESTRUCTURAL_FEATURE___GET_FEATURE_ID;

	/**
	 * The operation id for the '<em>Get Container Class</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE___GET_CONTAINER_CLASS = ESTRUCTURAL_FEATURE___GET_CONTAINER_CLASS;

	/**
	 * The number of operations of the '<em>EReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREFERENCE_OPERATION_COUNT = ESTRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EStringToStringMapEntryImpl <em>EString To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EStringToStringMapEntryImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEStringToStringMapEntry()
	 * @generated
	 */
	int ESTRING_TO_STRING_MAP_ENTRY = 17;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.EGenericTypeImpl <em>EGeneric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.EGenericTypeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEGenericType()
	 * @generated
	 */
	int EGENERIC_TYPE = 18;

	/**
	 * The feature id for the '<em><b>EUpper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__EUPPER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>EType Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ETYPE_ARGUMENTS = 1;

	/**
	 * The feature id for the '<em><b>ERaw Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ERAW_TYPE = 2;

	/**
	 * The feature id for the '<em><b>ELower Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ELOWER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>EType Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ETYPE_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE__ECLASSIFIER = 5;

	/**
	 * The number of structural features of the '<em>EGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>EGeneric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EGENERIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ETypeParameterImpl <em>EType Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ETypeParameterImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getETypeParameter()
	 * @generated
	 */
	int ETYPE_PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__EANNOTATIONS = ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__NAME = ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>EBounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER__EBOUNDS = ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER_FEATURE_COUNT = ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER___GET_EANNOTATION__STRING = ENAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The number of operations of the '<em>EType Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETYPE_PARAMETER_OPERATION_COUNT = ENAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.NamedElementImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EDGES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Locals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__LOCALS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityNodeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__INCOMING = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__ACTIVITY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__RUNNING = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityEdgeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getActivityEdge()
	 * @generated
	 */
	int ACTIVITY_EDGE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Activity Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_EDGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ControlFlowImpl <em>Control Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ControlFlowImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__NAME = ACTIVITY_EDGE__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__SOURCE = ACTIVITY_EDGE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__TARGET = ACTIVITY_EDGE__TARGET;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW__GUARD = ACTIVITY_EDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_FEATURE_COUNT = ACTIVITY_EDGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_OPERATION_COUNT = ACTIVITY_EDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ControlNodeImpl <em>Control Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ControlNodeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getControlNode()
	 * @generated
	 */
	int CONTROL_NODE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__ACTIVITY = ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE__RUNNING = ACTIVITY_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ExecutableNodeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExecutableNode()
	 * @generated
	 */
	int EXECUTABLE_NODE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__NAME = ACTIVITY_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__OUTGOING = ACTIVITY_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__INCOMING = ACTIVITY_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__ACTIVITY = ACTIVITY_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE__RUNNING = ACTIVITY_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_FEATURE_COUNT = ACTIVITY_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Executable Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_NODE_OPERATION_COUNT = ACTIVITY_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActionImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = EXECUTABLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OUTGOING = EXECUTABLE_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__INCOMING = EXECUTABLE_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIVITY = EXECUTABLE_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RUNNING = EXECUTABLE_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = EXECUTABLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = EXECUTABLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.OpaqueActionImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getOpaqueAction()
	 * @generated
	 */
	int OPAQUE_ACTION = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__OUTGOING = ACTION__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__INCOMING = ACTION__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__ACTIVITY = ACTION__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__RUNNING = ACTION__RUNNING;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION__EXPRESSIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Opaque Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.InitialNodeImpl <em>Initial Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.InitialNodeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getInitialNode()
	 * @generated
	 */
	int INITIAL_NODE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.FinalNodeImpl <em>Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.FinalNodeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getFinalNode()
	 * @generated
	 */
	int FINAL_NODE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityFinalNodeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getActivityFinalNode()
	 * @generated
	 */
	int ACTIVITY_FINAL_NODE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__NAME = FINAL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__OUTGOING = FINAL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__INCOMING = FINAL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__ACTIVITY = FINAL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE__RUNNING = FINAL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_FEATURE_COUNT = FINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity Final Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FINAL_NODE_OPERATION_COUNT = FINAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ForkNodeImpl <em>Fork Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ForkNodeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getForkNode()
	 * @generated
	 */
	int FORK_NODE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fork Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.JoinNodeImpl <em>Join Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.JoinNodeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getJoinNode()
	 * @generated
	 */
	int JOIN_NODE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.MergeNodeImpl <em>Merge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.MergeNodeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getMergeNode()
	 * @generated
	 */
	int MERGE_NODE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Merge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.DecisionNodeImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getDecisionNode()
	 * @generated
	 */
	int DECISION_NODE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__NAME = CONTROL_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__OUTGOING = CONTROL_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__INCOMING = CONTROL_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__ACTIVITY = CONTROL_NODE__ACTIVITY;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE__RUNNING = CONTROL_NODE__RUNNING;

	/**
	 * The number of structural features of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_FEATURE_COUNT = CONTROL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decision Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_NODE_OPERATION_COUNT = CONTROL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.VariableImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 36;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INITIAL_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CURRENT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.IntegerVariableImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getIntegerVariable()
	 * @generated
	 */
	int INTEGER_VARIABLE = 37;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE__CURRENT_VALUE = VARIABLE__CURRENT_VALUE;

	/**
	 * The number of structural features of the '<em>Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.BooleanVariableImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getBooleanVariable()
	 * @generated
	 */
	int BOOLEAN_VARIABLE = 38;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__INITIAL_VALUE = VARIABLE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE__CURRENT_VALUE = VARIABLE__CURRENT_VALUE;

	/**
	 * The number of structural features of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ValueImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 39;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.BooleanValueImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.IntegerValueImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.InputValueImpl <em>Input Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.InputValueImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getInputValue()
	 * @generated
	 */
	int INPUT_VALUE = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.InputImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 43;

	/**
	 * The feature id for the '<em><b>Input Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INPUT_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ChunkImpl <em>Chunk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ChunkImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getChunk()
	 * @generated
	 */
	int CHUNK = 44;

	/**
	 * The number of structural features of the '<em>Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.BlockImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 45;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATEMENTS = CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__RETURN_VALUE = CHUNK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = CHUNK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = CHUNK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.LastStatementImpl <em>Last Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.LastStatementImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getLastStatement()
	 * @generated
	 */
	int LAST_STATEMENT = 46;

	/**
	 * The number of structural features of the '<em>Last Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Last Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.LastStatement_ReturnImpl <em>Last Statement Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.LastStatement_ReturnImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getLastStatement_Return()
	 * @generated
	 */
	int LAST_STATEMENT_RETURN = 47;

	/**
	 * The number of structural features of the '<em>Last Statement Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_RETURN_FEATURE_COUNT = LAST_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Last Statement Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_RETURN_OPERATION_COUNT = LAST_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.LastStatement_BreakImpl <em>Last Statement Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.LastStatement_BreakImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getLastStatement_Break()
	 * @generated
	 */
	int LAST_STATEMENT_BREAK = 48;

	/**
	 * The number of structural features of the '<em>Last Statement Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_BREAK_FEATURE_COUNT = LAST_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Last Statement Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_BREAK_OPERATION_COUNT = LAST_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.StatementImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 49;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_BlockImpl <em>Statement Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_BlockImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_Block()
	 * @generated
	 */
	int STATEMENT_BLOCK = 50;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK__BLOCK = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statement Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Statement Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_BLOCK_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_WhileImpl <em>Statement While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_WhileImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_While()
	 * @generated
	 */
	int STATEMENT_WHILE = 51;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WHILE__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WHILE__BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WHILE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statement While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_WHILE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_RepeatImpl <em>Statement Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_RepeatImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_Repeat()
	 * @generated
	 */
	int STATEMENT_REPEAT = 52;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_REPEAT__BLOCK = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_REPEAT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_REPEAT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statement Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_REPEAT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_If_Then_ElseImpl <em>Statement If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_If_Then_ElseImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_If_Then_Else()
	 * @generated
	 */
	int STATEMENT_IF_THEN_ELSE = 53;

	/**
	 * The feature id for the '<em><b>If Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE__IF_EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE__IF_BLOCK = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE__ELSE_IF = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE__ELSE_BLOCK = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Statement If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Statement If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_If_Then_Else_ElseIfPartImpl <em>Statement If Then Else Else If Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_If_Then_Else_ElseIfPartImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_If_Then_Else_ElseIfPart()
	 * @generated
	 */
	int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART = 54;

	/**
	 * The feature id for the '<em><b>Elseif Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Elseif Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Statement If Then Else Else If Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statement If Then Else Else If Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_IF_THEN_ELSE_ELSE_IF_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_For_NumericImpl <em>Statement For Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_For_NumericImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_For_Numeric()
	 * @generated
	 */
	int STATEMENT_FOR_NUMERIC = 55;

	/**
	 * The feature id for the '<em><b>Iterator Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC__ITERATOR_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC__START_EXPR = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Until Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC__UNTIL_EXPR = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Step Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC__STEP_EXPR = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC__BLOCK = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Statement For Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Statement For Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_NUMERIC_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_For_GenericImpl <em>Statement For Generic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_For_GenericImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_For_Generic()
	 * @generated
	 */
	int STATEMENT_FOR_GENERIC = 56;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_GENERIC__NAMES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_GENERIC__EXPRESSIONS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_GENERIC__BLOCK = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Statement For Generic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_GENERIC_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Statement For Generic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FOR_GENERIC_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_GlobalFunction_DeclarationImpl <em>Statement Global Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_GlobalFunction_DeclarationImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_GlobalFunction_Declaration()
	 * @generated
	 */
	int STATEMENT_GLOBAL_FUNCTION_DECLARATION = 57;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_GLOBAL_FUNCTION_DECLARATION__PREFIX = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Statement Global Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_GLOBAL_FUNCTION_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Statement Global Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_GLOBAL_FUNCTION_DECLARATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_LocalFunction_DeclarationImpl <em>Statement Local Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_LocalFunction_DeclarationImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_LocalFunction_Declaration()
	 * @generated
	 */
	int STATEMENT_LOCAL_FUNCTION_DECLARATION = 58;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement Local Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_FUNCTION_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statement Local Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_FUNCTION_DECLARATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_Local_Variable_DeclarationImpl <em>Statement Local Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_Local_Variable_DeclarationImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_Local_Variable_Declaration()
	 * @generated
	 */
	int STATEMENT_LOCAL_VARIABLE_DECLARATION = 59;

	/**
	 * The feature id for the '<em><b>Variable Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement Local Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statement Local Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_LOCAL_VARIABLE_DECLARATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_FunctioncallOrAssignmentImpl <em>Statement Functioncall Or Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_FunctioncallOrAssignmentImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_FunctioncallOrAssignment()
	 * @generated
	 */
	int STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT = 60;

	/**
	 * The number of structural features of the '<em>Statement Functioncall Or Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Statement Functioncall Or Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ExpressionImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 61;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_NilImpl <em>Expression Nil</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_NilImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Nil()
	 * @generated
	 */
	int EXPRESSION_NIL = 62;

	/**
	 * The number of structural features of the '<em>Expression Nil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NIL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression Nil</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NIL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_TrueImpl <em>Expression True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_TrueImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_True()
	 * @generated
	 */
	int EXPRESSION_TRUE = 63;

	/**
	 * The number of structural features of the '<em>Expression True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TRUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TRUE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_FalseImpl <em>Expression False</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_FalseImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_False()
	 * @generated
	 */
	int EXPRESSION_FALSE = 64;

	/**
	 * The number of structural features of the '<em>Expression False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FALSE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression False</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FALSE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_NumberImpl <em>Expression Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_NumberImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Number()
	 * @generated
	 */
	int EXPRESSION_NUMBER = 65;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NUMBER__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NUMBER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NUMBER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_VarArgsImpl <em>Expression Var Args</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_VarArgsImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_VarArgs()
	 * @generated
	 */
	int EXPRESSION_VAR_ARGS = 66;

	/**
	 * The number of structural features of the '<em>Expression Var Args</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VAR_ARGS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression Var Args</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VAR_ARGS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_StringImpl <em>Expression String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_StringImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_String()
	 * @generated
	 */
	int EXPRESSION_STRING = 67;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STRING__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STRING_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_STRING_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_FunctionImpl <em>Expression Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_FunctionImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Function()
	 * @generated
	 */
	int EXPRESSION_FUNCTION = 68;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FUNCTION__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FUNCTION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_TableConstructorImpl <em>Expression Table Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_TableConstructorImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_TableConstructor()
	 * @generated
	 */
	int EXPRESSION_TABLE_CONSTRUCTOR = 69;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TABLE_CONSTRUCTOR__FIELDS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Table Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TABLE_CONSTRUCTOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Table Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TABLE_CONSTRUCTOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.FunctionImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 70;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Var Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__VAR_ARGS = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__BODY = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Functioncall_ArgumentsImpl <em>Functioncall Arguments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Functioncall_ArgumentsImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getFunctioncall_Arguments()
	 * @generated
	 */
	int FUNCTIONCALL_ARGUMENTS = 71;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL_ARGUMENTS__ARGUMENTS = 0;

	/**
	 * The number of structural features of the '<em>Functioncall Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL_ARGUMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Functioncall Arguments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL_ARGUMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.FieldImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 72;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Field_AddEntryToTable_BracketsImpl <em>Field Add Entry To Table Brackets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Field_AddEntryToTable_BracketsImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getField_AddEntryToTable_Brackets()
	 * @generated
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS = 73;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__VALUE = FIELD__VALUE;

	/**
	 * The feature id for the '<em><b>Index Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Add Entry To Table Brackets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Add Entry To Table Brackets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_BRACKETS_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Field_AddEntryToTableImpl <em>Field Add Entry To Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Field_AddEntryToTableImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getField_AddEntryToTable()
	 * @generated
	 */
	int FIELD_ADD_ENTRY_TO_TABLE = 74;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE__VALUE = FIELD__VALUE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE__KEY = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Field Add Entry To Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Field Add Entry To Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ADD_ENTRY_TO_TABLE_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Field_AppendEntryToTableImpl <em>Field Append Entry To Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Field_AppendEntryToTableImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getField_AppendEntryToTable()
	 * @generated
	 */
	int FIELD_APPEND_ENTRY_TO_TABLE = 75;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_APPEND_ENTRY_TO_TABLE__VALUE = FIELD__VALUE;

	/**
	 * The number of structural features of the '<em>Field Append Entry To Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_APPEND_ENTRY_TO_TABLE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Field Append Entry To Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_APPEND_ENTRY_TO_TABLE_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.LastStatement_ReturnWithValueImpl <em>Last Statement Return With Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.LastStatement_ReturnWithValueImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getLastStatement_ReturnWithValue()
	 * @generated
	 */
	int LAST_STATEMENT_RETURN_WITH_VALUE = 76;

	/**
	 * The feature id for the '<em><b>Return Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES = LAST_STATEMENT_RETURN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Last Statement Return With Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_RETURN_WITH_VALUE_FEATURE_COUNT = LAST_STATEMENT_RETURN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Last Statement Return With Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAST_STATEMENT_RETURN_WITH_VALUE_OPERATION_COUNT = LAST_STATEMENT_RETURN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_AssignmentImpl <em>Statement Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_AssignmentImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_Assignment()
	 * @generated
	 */
	int STATEMENT_ASSIGNMENT = 77;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ASSIGNMENT__VARIABLE = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ASSIGNMENT__VALUES = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ASSIGNMENT_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statement Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_ASSIGNMENT_OPERATION_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_CallMemberFunctionImpl <em>Statement Call Member Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_CallMemberFunctionImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_CallMemberFunction()
	 * @generated
	 */
	int STATEMENT_CALL_MEMBER_FUNCTION = 78;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_MEMBER_FUNCTION__OBJECT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_MEMBER_FUNCTION__ARGUMENTS = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Statement Call Member Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_MEMBER_FUNCTION_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Statement Call Member Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_MEMBER_FUNCTION_OPERATION_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Statement_CallFunctionImpl <em>Statement Call Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Statement_CallFunctionImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_CallFunction()
	 * @generated
	 */
	int STATEMENT_CALL_FUNCTION = 79;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_FUNCTION__OBJECT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_FUNCTION__ARGUMENTS = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement Call Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_FUNCTION_FEATURE_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statement Call Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CALL_FUNCTION_OPERATION_COUNT = STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_OrImpl <em>Expression Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_OrImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Or()
	 * @generated
	 */
	int EXPRESSION_OR = 80;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_AndImpl <em>Expression And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_AndImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_And()
	 * @generated
	 */
	int EXPRESSION_AND = 81;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_AND_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_LargerImpl <em>Expression Larger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_LargerImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Larger()
	 * @generated
	 */
	int EXPRESSION_LARGER = 82;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Larger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Larger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_Larger_EqualImpl <em>Expression Larger Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_Larger_EqualImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Larger_Equal()
	 * @generated
	 */
	int EXPRESSION_LARGER_EQUAL = 83;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Larger Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Larger Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LARGER_EQUAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_SmallerImpl <em>Expression Smaller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_SmallerImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Smaller()
	 * @generated
	 */
	int EXPRESSION_SMALLER = 84;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_Smaller_EqualImpl <em>Expression Smaller Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_Smaller_EqualImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Smaller_Equal()
	 * @generated
	 */
	int EXPRESSION_SMALLER_EQUAL = 85;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Smaller Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Smaller Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SMALLER_EQUAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_EqualImpl <em>Expression Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_EqualImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Equal()
	 * @generated
	 */
	int EXPRESSION_EQUAL = 86;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EQUAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_Not_EqualImpl <em>Expression Not Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_Not_EqualImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Not_Equal()
	 * @generated
	 */
	int EXPRESSION_NOT_EQUAL = 87;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NOT_EQUAL__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NOT_EQUAL__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Not Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NOT_EQUAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Not Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NOT_EQUAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_ConcatenationImpl <em>Expression Concatenation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_ConcatenationImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Concatenation()
	 * @generated
	 */
	int EXPRESSION_CONCATENATION = 88;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONCATENATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONCATENATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Concatenation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONCATENATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Concatenation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CONCATENATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_PlusImpl <em>Expression Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_PlusImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Plus()
	 * @generated
	 */
	int EXPRESSION_PLUS = 89;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_PLUS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_MinusImpl <em>Expression Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_MinusImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Minus()
	 * @generated
	 */
	int EXPRESSION_MINUS = 90;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MINUS_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_MultiplicationImpl <em>Expression Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_MultiplicationImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Multiplication()
	 * @generated
	 */
	int EXPRESSION_MULTIPLICATION = 91;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MULTIPLICATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MULTIPLICATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MULTIPLICATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_DivisionImpl <em>Expression Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_DivisionImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Division()
	 * @generated
	 */
	int EXPRESSION_DIVISION = 92;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DIVISION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DIVISION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DIVISION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_DIVISION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_ModuloImpl <em>Expression Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_ModuloImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Modulo()
	 * @generated
	 */
	int EXPRESSION_MODULO = 93;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODULO__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODULO__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODULO_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_MODULO_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_NegateImpl <em>Expression Negate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_NegateImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Negate()
	 * @generated
	 */
	int EXPRESSION_NEGATE = 94;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NEGATE__EXP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Negate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NEGATE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Negate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_NEGATE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_LengthImpl <em>Expression Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_LengthImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Length()
	 * @generated
	 */
	int EXPRESSION_LENGTH = 95;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LENGTH__EXP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LENGTH_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LENGTH_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_InvertImpl <em>Expression Invert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_InvertImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Invert()
	 * @generated
	 */
	int EXPRESSION_INVERT = 96;

	/**
	 * The feature id for the '<em><b>Exp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_INVERT__EXP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_INVERT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Invert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_INVERT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_ExponentiationImpl <em>Expression Exponentiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_ExponentiationImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Exponentiation()
	 * @generated
	 */
	int EXPRESSION_EXPONENTIATION = 97;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EXPONENTIATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EXPONENTIATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Exponentiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EXPONENTIATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Exponentiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_EXPONENTIATION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_CallMemberFunctionImpl <em>Expression Call Member Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_CallMemberFunctionImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_CallMemberFunction()
	 * @generated
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION = 98;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Function Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expression Call Member Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Expression Call Member Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_MEMBER_FUNCTION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_CallFunctionImpl <em>Expression Call Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_CallFunctionImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_CallFunction()
	 * @generated
	 */
	int EXPRESSION_CALL_FUNCTION = 99;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_FUNCTION__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_FUNCTION__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Call Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Call Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_CALL_FUNCTION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_AccessArrayImpl <em>Expression Access Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_AccessArrayImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_AccessArray()
	 * @generated
	 */
	int EXPRESSION_ACCESS_ARRAY = 100;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_ARRAY__ARRAY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_ARRAY__INDEX = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Access Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_ARRAY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Access Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_ARRAY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_AccessMemberImpl <em>Expression Access Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_AccessMemberImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_AccessMember()
	 * @generated
	 */
	int EXPRESSION_ACCESS_MEMBER = 101;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_MEMBER__OBJECT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_MEMBER__MEMBER_NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression Access Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_MEMBER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression Access Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_ACCESS_MEMBER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link activityecorelua.impl.Expression_VariableNameImpl <em>Expression Variable Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.Expression_VariableNameImpl
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_VariableName()
	 * @generated
	 */
	int EXPRESSION_VARIABLE_NAME = 102;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VARIABLE_NAME__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Variable Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VARIABLE_NAME_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expression Variable Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_VARIABLE_NAME_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>EBig Decimal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEBigDecimal()
	 * @generated
	 */
	int EBIG_DECIMAL = 103;

	/**
	 * The meta object id for the '<em>EBig Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEBigInteger()
	 * @generated
	 */
	int EBIG_INTEGER = 104;

	/**
	 * The meta object id for the '<em>EBoolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEBoolean()
	 * @generated
	 */
	int EBOOLEAN = 105;

	/**
	 * The meta object id for the '<em>EBoolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEBooleanObject()
	 * @generated
	 */
	int EBOOLEAN_OBJECT = 106;

	/**
	 * The meta object id for the '<em>EByte</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEByte()
	 * @generated
	 */
	int EBYTE = 107;

	/**
	 * The meta object id for the '<em>EByte Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEByteArray()
	 * @generated
	 */
	int EBYTE_ARRAY = 108;

	/**
	 * The meta object id for the '<em>EByte Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Byte
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEByteObject()
	 * @generated
	 */
	int EBYTE_OBJECT = 109;

	/**
	 * The meta object id for the '<em>EChar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEChar()
	 * @generated
	 */
	int ECHAR = 110;

	/**
	 * The meta object id for the '<em>ECharacter Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Character
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getECharacterObject()
	 * @generated
	 */
	int ECHARACTER_OBJECT = 111;

	/**
	 * The meta object id for the '<em>EDate</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEDate()
	 * @generated
	 */
	int EDATE = 112;

	/**
	 * The meta object id for the '<em>EDiagnostic Chain</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.DiagnosticChain
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEDiagnosticChain()
	 * @generated
	 */
	int EDIAGNOSTIC_CHAIN = 113;

	/**
	 * The meta object id for the '<em>EDouble</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEDouble()
	 * @generated
	 */
	int EDOUBLE = 114;

	/**
	 * The meta object id for the '<em>EDouble Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEDoubleObject()
	 * @generated
	 */
	int EDOUBLE_OBJECT = 115;

	/**
	 * The meta object id for the '<em>EE List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEEList()
	 * @generated
	 */
	int EE_LIST = 116;

	/**
	 * The meta object id for the '<em>EEnumerator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEEnumerator()
	 * @generated
	 */
	int EENUMERATOR = 117;

	/**
	 * The meta object id for the '<em>EFeature Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.util.FeatureMap
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEFeatureMap()
	 * @generated
	 */
	int EFEATURE_MAP = 118;

	/**
	 * The meta object id for the '<em>EFeature Map Entry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEFeatureMapEntry()
	 * @generated
	 */
	int EFEATURE_MAP_ENTRY = 119;

	/**
	 * The meta object id for the '<em>EFloat</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEFloat()
	 * @generated
	 */
	int EFLOAT = 120;

	/**
	 * The meta object id for the '<em>EFloat Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEFloatObject()
	 * @generated
	 */
	int EFLOAT_OBJECT = 121;

	/**
	 * The meta object id for the '<em>EInt</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEInt()
	 * @generated
	 */
	int EINT = 122;

	/**
	 * The meta object id for the '<em>EInteger Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEIntegerObject()
	 * @generated
	 */
	int EINTEGER_OBJECT = 123;

	/**
	 * The meta object id for the '<em>EJava Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEJavaClass()
	 * @generated
	 */
	int EJAVA_CLASS = 124;

	/**
	 * The meta object id for the '<em>EJava Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEJavaObject()
	 * @generated
	 */
	int EJAVA_OBJECT = 125;

	/**
	 * The meta object id for the '<em>ELong</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getELong()
	 * @generated
	 */
	int ELONG = 126;

	/**
	 * The meta object id for the '<em>ELong Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getELongObject()
	 * @generated
	 */
	int ELONG_OBJECT = 127;

	/**
	 * The meta object id for the '<em>EMap</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEMap()
	 * @generated
	 */
	int EMAP = 128;

	/**
	 * The meta object id for the '<em>EResource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEResource()
	 * @generated
	 */
	int ERESOURCE = 129;

	/**
	 * The meta object id for the '<em>EResource Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEResourceSet()
	 * @generated
	 */
	int ERESOURCE_SET = 130;

	/**
	 * The meta object id for the '<em>EShort</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEShort()
	 * @generated
	 */
	int ESHORT = 131;

	/**
	 * The meta object id for the '<em>EShort Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEShortObject()
	 * @generated
	 */
	int ESHORT_OBJECT = 132;

	/**
	 * The meta object id for the '<em>EString</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEString()
	 * @generated
	 */
	int ESTRING = 133;

	/**
	 * The meta object id for the '<em>ETree Iterator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.TreeIterator
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getETreeIterator()
	 * @generated
	 */
	int ETREE_ITERATOR = 134;

	/**
	 * The meta object id for the '<em>EInvocation Target Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.reflect.InvocationTargetException
	 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEInvocationTargetException()
	 * @generated
	 */
	int EINVOCATION_TARGET_EXCEPTION = 135;


	/**
	 * Returns the meta object for class '{@link activityecorelua.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute</em>'.
	 * @see activityecorelua.EAttribute
	 * @generated
	 */
	EClass getEAttribute();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EAttribute#isID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see activityecorelua.EAttribute#isID()
	 * @see #getEAttribute()
	 * @generated
	 */
	EAttribute getEAttribute_ID();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.EAttribute#getEAttributeType <em>EAttribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EAttribute Type</em>'.
	 * @see activityecorelua.EAttribute#getEAttributeType()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_EAttributeType();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EAnnotation <em>EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAnnotation</em>'.
	 * @see activityecorelua.EAnnotation
	 * @generated
	 */
	EClass getEAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see activityecorelua.EAnnotation#getSource()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EAttribute getEAnnotation_Source();

	/**
	 * Returns the meta object for the map '{@link activityecorelua.EAnnotation#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Details</em>'.
	 * @see activityecorelua.EAnnotation#getDetails()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Details();

	/**
	 * Returns the meta object for the container reference '{@link activityecorelua.EAnnotation#getEModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EModel Element</em>'.
	 * @see activityecorelua.EAnnotation#getEModelElement()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_EModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EAnnotation#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see activityecorelua.EAnnotation#getContents()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_Contents();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EAnnotation#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see activityecorelua.EAnnotation#getReferences()
	 * @see #getEAnnotation()
	 * @generated
	 */
	EReference getEAnnotation_References();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass</em>'.
	 * @see activityecorelua.EClass
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EClass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see activityecorelua.EClass#isAbstract()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EClass#isInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see activityecorelua.EClass#isInterface()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Interface();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EClass#getESuperTypes <em>ESuper Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ESuper Types</em>'.
	 * @see activityecorelua.EClass#getESuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_ESuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EClass#getEOperations <em>EOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EOperations</em>'.
	 * @see activityecorelua.EClass#getEOperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EOperations();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EClass#getEAllAttributes <em>EAll Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Attributes</em>'.
	 * @see activityecorelua.EClass#getEAllAttributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllAttributes();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EClass#getEAllReferences <em>EAll References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll References</em>'.
	 * @see activityecorelua.EClass#getEAllReferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllReferences();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EClass#getEReferences <em>EReferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReferences</em>'.
	 * @see activityecorelua.EClass#getEReferences()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EReferences();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EClass#getEAttributes <em>EAttributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAttributes</em>'.
	 * @see activityecorelua.EClass#getEAttributes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAttributes();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EClass#getEAllContainments <em>EAll Containments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Containments</em>'.
	 * @see activityecorelua.EClass#getEAllContainments()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllContainments();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EClass#getEAllOperations <em>EAll Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Operations</em>'.
	 * @see activityecorelua.EClass#getEAllOperations()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllOperations();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EClass#getEAllStructuralFeatures <em>EAll Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Structural Features</em>'.
	 * @see activityecorelua.EClass#getEAllStructuralFeatures()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllStructuralFeatures();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EClass#getEAllSuperTypes <em>EAll Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Super Types</em>'.
	 * @see activityecorelua.EClass#getEAllSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllSuperTypes();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.EClass#getEIDAttribute <em>EID Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EID Attribute</em>'.
	 * @see activityecorelua.EClass#getEIDAttribute()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EIDAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EClass#getEStructuralFeatures <em>EStructural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EStructural Features</em>'.
	 * @see activityecorelua.EClass#getEStructuralFeatures()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EStructuralFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EClass#getEGenericSuperTypes <em>EGeneric Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EGeneric Super Types</em>'.
	 * @see activityecorelua.EClass#getEGenericSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EGenericSuperTypes();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EClass#getEAllGenericSuperTypes <em>EAll Generic Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EAll Generic Super Types</em>'.
	 * @see activityecorelua.EClass#getEAllGenericSuperTypes()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_EAllGenericSuperTypes();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EClass#isSuperTypeOf(activityecorelua.EClass) <em>Is Super Type Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Super Type Of</em>' operation.
	 * @see activityecorelua.EClass#isSuperTypeOf(activityecorelua.EClass)
	 * @generated
	 */
	EOperation getEClass__IsSuperTypeOf__EClass();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EClass#getFeatureCount() <em>Get Feature Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature Count</em>' operation.
	 * @see activityecorelua.EClass#getFeatureCount()
	 * @generated
	 */
	EOperation getEClass__GetFeatureCount();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EClass#getEStructuralFeature(int) <em>Get EStructural Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EStructural Feature</em>' operation.
	 * @see activityecorelua.EClass#getEStructuralFeature(int)
	 * @generated
	 */
	EOperation getEClass__GetEStructuralFeature__int();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EClass#getFeatureID(activityecorelua.EStructuralFeature) <em>Get Feature ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature ID</em>' operation.
	 * @see activityecorelua.EClass#getFeatureID(activityecorelua.EStructuralFeature)
	 * @generated
	 */
	EOperation getEClass__GetFeatureID__EStructuralFeature();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EClass#getEStructuralFeature(java.lang.String) <em>Get EStructural Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EStructural Feature</em>' operation.
	 * @see activityecorelua.EClass#getEStructuralFeature(java.lang.String)
	 * @generated
	 */
	EOperation getEClass__GetEStructuralFeature__String();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EClass#getOperationCount() <em>Get Operation Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation Count</em>' operation.
	 * @see activityecorelua.EClass#getOperationCount()
	 * @generated
	 */
	EOperation getEClass__GetOperationCount();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EClass#getEOperation(int) <em>Get EOperation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EOperation</em>' operation.
	 * @see activityecorelua.EClass#getEOperation(int)
	 * @generated
	 */
	EOperation getEClass__GetEOperation__int();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EClass#getOperationID(activityecorelua.EOperation) <em>Get Operation ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation ID</em>' operation.
	 * @see activityecorelua.EClass#getOperationID(activityecorelua.EOperation)
	 * @generated
	 */
	EOperation getEClass__GetOperationID__EOperation();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EClass#getOverride(activityecorelua.EOperation) <em>Get Override</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Override</em>' operation.
	 * @see activityecorelua.EClass#getOverride(activityecorelua.EOperation)
	 * @generated
	 */
	EOperation getEClass__GetOverride__EOperation();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClassifier</em>'.
	 * @see activityecorelua.EClassifier
	 * @generated
	 */
	EClass getEClassifier();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EClassifier#getInstanceClassName <em>Instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class Name</em>'.
	 * @see activityecorelua.EClassifier#getInstanceClassName()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_InstanceClassName();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EClassifier#getInstanceClass <em>Instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class</em>'.
	 * @see activityecorelua.EClassifier#getInstanceClass()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_InstanceClass();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EClassifier#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see activityecorelua.EClassifier#getDefaultValue()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EClassifier#getInstanceTypeName <em>Instance Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type Name</em>'.
	 * @see activityecorelua.EClassifier#getInstanceTypeName()
	 * @see #getEClassifier()
	 * @generated
	 */
	EAttribute getEClassifier_InstanceTypeName();

	/**
	 * Returns the meta object for the container reference '{@link activityecorelua.EClassifier#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EPackage</em>'.
	 * @see activityecorelua.EClassifier#getEPackage()
	 * @see #getEClassifier()
	 * @generated
	 */
	EReference getEClassifier_EPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EClassifier#getETypeParameters <em>EType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Parameters</em>'.
	 * @see activityecorelua.EClassifier#getETypeParameters()
	 * @see #getEClassifier()
	 * @generated
	 */
	EReference getEClassifier_ETypeParameters();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EClassifier#isInstance(java.lang.Object) <em>Is Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Instance</em>' operation.
	 * @see activityecorelua.EClassifier#isInstance(java.lang.Object)
	 * @generated
	 */
	EOperation getEClassifier__IsInstance__Object();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EClassifier#getClassifierID() <em>Get Classifier ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Classifier ID</em>' operation.
	 * @see activityecorelua.EClassifier#getClassifierID()
	 * @generated
	 */
	EOperation getEClassifier__GetClassifierID();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EDataType <em>EData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EData Type</em>'.
	 * @see activityecorelua.EDataType
	 * @generated
	 */
	EClass getEDataType();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EDataType#isSerializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serializable</em>'.
	 * @see activityecorelua.EDataType#isSerializable()
	 * @see #getEDataType()
	 * @generated
	 */
	EAttribute getEDataType_Serializable();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum</em>'.
	 * @see activityecorelua.EEnum
	 * @generated
	 */
	EClass getEEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EEnum#getELiterals <em>ELiterals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ELiterals</em>'.
	 * @see activityecorelua.EEnum#getELiterals()
	 * @see #getEEnum()
	 * @generated
	 */
	EReference getEEnum_ELiterals();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EEnum#getEEnumLiteral(java.lang.String) <em>Get EEnum Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EEnum Literal</em>' operation.
	 * @see activityecorelua.EEnum#getEEnumLiteral(java.lang.String)
	 * @generated
	 */
	EOperation getEEnum__GetEEnumLiteral__String();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EEnum#getEEnumLiteral(int) <em>Get EEnum Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EEnum Literal</em>' operation.
	 * @see activityecorelua.EEnum#getEEnumLiteral(int)
	 * @generated
	 */
	EOperation getEEnum__GetEEnumLiteral__int();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EEnum#getEEnumLiteralByLiteral(java.lang.String) <em>Get EEnum Literal By Literal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EEnum Literal By Literal</em>' operation.
	 * @see activityecorelua.EEnum#getEEnumLiteralByLiteral(java.lang.String)
	 * @generated
	 */
	EOperation getEEnum__GetEEnumLiteralByLiteral__String();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EEnumLiteral <em>EEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EEnum Literal</em>'.
	 * @see activityecorelua.EEnumLiteral
	 * @generated
	 */
	EClass getEEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EEnumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activityecorelua.EEnumLiteral#getValue()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EAttribute getEEnumLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EEnumLiteral#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see activityecorelua.EEnumLiteral#getInstance()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EAttribute getEEnumLiteral_Instance();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EEnumLiteral#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see activityecorelua.EEnumLiteral#getLiteral()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EAttribute getEEnumLiteral_Literal();

	/**
	 * Returns the meta object for the container reference '{@link activityecorelua.EEnumLiteral#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EEnum</em>'.
	 * @see activityecorelua.EEnumLiteral#getEEnum()
	 * @see #getEEnumLiteral()
	 * @generated
	 */
	EReference getEEnumLiteral_EEnum();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EFactory <em>EFactory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFactory</em>'.
	 * @see activityecorelua.EFactory
	 * @generated
	 */
	EClass getEFactory();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.EFactory#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPackage</em>'.
	 * @see activityecorelua.EFactory#getEPackage()
	 * @see #getEFactory()
	 * @generated
	 */
	EReference getEFactory_EPackage();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EFactory#create(activityecorelua.EClass) <em>Create</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create</em>' operation.
	 * @see activityecorelua.EFactory#create(activityecorelua.EClass)
	 * @generated
	 */
	EOperation getEFactory__Create__EClass();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EFactory#createFromString(activityecorelua.EDataType, java.lang.String) <em>Create From String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create From String</em>' operation.
	 * @see activityecorelua.EFactory#createFromString(activityecorelua.EDataType, java.lang.String)
	 * @generated
	 */
	EOperation getEFactory__CreateFromString__EDataType_String();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EFactory#convertToString(activityecorelua.EDataType, java.lang.Object) <em>Convert To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert To String</em>' operation.
	 * @see activityecorelua.EFactory#convertToString(activityecorelua.EDataType, java.lang.Object)
	 * @generated
	 */
	EOperation getEFactory__ConvertToString__EDataType_Object();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EModel Element</em>'.
	 * @see activityecorelua.EModelElement
	 * @generated
	 */
	EClass getEModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EModelElement#getEAnnotations <em>EAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EAnnotations</em>'.
	 * @see activityecorelua.EModelElement#getEAnnotations()
	 * @see #getEModelElement()
	 * @generated
	 */
	EReference getEModelElement_EAnnotations();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EModelElement#getEAnnotation(java.lang.String) <em>Get EAnnotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EAnnotation</em>' operation.
	 * @see activityecorelua.EModelElement#getEAnnotation(java.lang.String)
	 * @generated
	 */
	EOperation getEModelElement__GetEAnnotation__String();

	/**
	 * Returns the meta object for class '{@link activityecorelua.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENamed Element</em>'.
	 * @see activityecorelua.ENamedElement
	 * @generated
	 */
	EClass getENamedElement();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.ENamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see activityecorelua.ENamedElement#getName()
	 * @see #getENamedElement()
	 * @generated
	 */
	EAttribute getENamedElement_Name();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject</em>'.
	 * @see activityecorelua.EObject
	 * @generated
	 */
	EClass getEObject();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EObject#eeClass() <em>Ee Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ee Class</em>' operation.
	 * @see activityecorelua.EObject#eeClass()
	 * @generated
	 */
	EOperation getEObject__EeClass();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EOperation</em>'.
	 * @see activityecorelua.EOperation
	 * @generated
	 */
	EClass getEOperation();

	/**
	 * Returns the meta object for the container reference '{@link activityecorelua.EOperation#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContaining Class</em>'.
	 * @see activityecorelua.EOperation#getEContainingClass()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EContainingClass();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EOperation#getETypeParameters <em>EType Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Parameters</em>'.
	 * @see activityecorelua.EOperation#getETypeParameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_ETypeParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EOperation#getEParameters <em>EParameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EParameters</em>'.
	 * @see activityecorelua.EOperation#getEParameters()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EParameters();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.EOperation#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see activityecorelua.EOperation#getActivity()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_Activity();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EOperation#getEExceptions <em>EExceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EExceptions</em>'.
	 * @see activityecorelua.EOperation#getEExceptions()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EExceptions();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EOperation#getEGenericExceptions <em>EGeneric Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EGeneric Exceptions</em>'.
	 * @see activityecorelua.EOperation#getEGenericExceptions()
	 * @see #getEOperation()
	 * @generated
	 */
	EReference getEOperation_EGenericExceptions();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EOperation#getOperationID() <em>Get Operation ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation ID</em>' operation.
	 * @see activityecorelua.EOperation#getOperationID()
	 * @generated
	 */
	EOperation getEOperation__GetOperationID();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EOperation#isOverrideOf(activityecorelua.EOperation) <em>Is Override Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Override Of</em>' operation.
	 * @see activityecorelua.EOperation#isOverrideOf(activityecorelua.EOperation)
	 * @generated
	 */
	EOperation getEOperation__IsOverrideOf__EOperation();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EPackage</em>'.
	 * @see activityecorelua.EPackage
	 * @generated
	 */
	EClass getEPackage();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EPackage#getNsURI <em>Ns URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns URI</em>'.
	 * @see activityecorelua.EPackage#getNsURI()
	 * @see #getEPackage()
	 * @generated
	 */
	EAttribute getEPackage_NsURI();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EPackage#getNsPrefix <em>Ns Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ns Prefix</em>'.
	 * @see activityecorelua.EPackage#getNsPrefix()
	 * @see #getEPackage()
	 * @generated
	 */
	EAttribute getEPackage_NsPrefix();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.EPackage#getEFactoryInstance <em>EFactory Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EFactory Instance</em>'.
	 * @see activityecorelua.EPackage#getEFactoryInstance()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_EFactoryInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EPackage#getEClassifiers <em>EClassifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EClassifiers</em>'.
	 * @see activityecorelua.EPackage#getEClassifiers()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_EClassifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EPackage#getESubpackages <em>ESubpackages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ESubpackages</em>'.
	 * @see activityecorelua.EPackage#getESubpackages()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_ESubpackages();

	/**
	 * Returns the meta object for the container reference '{@link activityecorelua.EPackage#getESuperPackage <em>ESuper Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>ESuper Package</em>'.
	 * @see activityecorelua.EPackage#getESuperPackage()
	 * @see #getEPackage()
	 * @generated
	 */
	EReference getEPackage_ESuperPackage();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EPackage#getEClassifier(java.lang.String) <em>Get EClassifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get EClassifier</em>' operation.
	 * @see activityecorelua.EPackage#getEClassifier(java.lang.String)
	 * @generated
	 */
	EOperation getEPackage__GetEClassifier__String();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EParameter</em>'.
	 * @see activityecorelua.EParameter
	 * @generated
	 */
	EClass getEParameter();

	/**
	 * Returns the meta object for the container reference '{@link activityecorelua.EParameter#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EOperation</em>'.
	 * @see activityecorelua.EParameter#getEOperation()
	 * @see #getEParameter()
	 * @generated
	 */
	EReference getEParameter_EOperation();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EReference</em>'.
	 * @see activityecorelua.EReference
	 * @generated
	 */
	EClass getEReference();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EReference#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see activityecorelua.EReference#isContainment()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Containment();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EReference#isContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see activityecorelua.EReference#isContainer()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_Container();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EReference#isResolveProxies <em>Resolve Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Proxies</em>'.
	 * @see activityecorelua.EReference#isResolveProxies()
	 * @see #getEReference()
	 * @generated
	 */
	EAttribute getEReference_ResolveProxies();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.EReference#getEOpposite <em>EOpposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EOpposite</em>'.
	 * @see activityecorelua.EReference#getEOpposite()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_EOpposite();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.EReference#getEReferenceType <em>EReference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Type</em>'.
	 * @see activityecorelua.EReference#getEReferenceType()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_EReferenceType();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.EReference#getEKeys <em>EKeys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EKeys</em>'.
	 * @see activityecorelua.EReference#getEKeys()
	 * @see #getEReference()
	 * @generated
	 */
	EReference getEReference_EKeys();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStructural Feature</em>'.
	 * @see activityecorelua.EStructuralFeature
	 * @generated
	 */
	EClass getEStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EStructuralFeature#isChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see activityecorelua.EStructuralFeature#isChangeable()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Changeable();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EStructuralFeature#isVolatile <em>Volatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatile</em>'.
	 * @see activityecorelua.EStructuralFeature#isVolatile()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Volatile();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EStructuralFeature#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see activityecorelua.EStructuralFeature#isTransient()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Transient();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EStructuralFeature#getDefaultValueLiteral <em>Default Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Literal</em>'.
	 * @see activityecorelua.EStructuralFeature#getDefaultValueLiteral()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_DefaultValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EStructuralFeature#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see activityecorelua.EStructuralFeature#getDefaultValue()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EStructuralFeature#isUnsettable <em>Unsettable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsettable</em>'.
	 * @see activityecorelua.EStructuralFeature#isUnsettable()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Unsettable();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.EStructuralFeature#isDerived <em>Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see activityecorelua.EStructuralFeature#isDerived()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EAttribute getEStructuralFeature_Derived();

	/**
	 * Returns the meta object for the container reference '{@link activityecorelua.EStructuralFeature#getEContainingClass <em>EContaining Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>EContaining Class</em>'.
	 * @see activityecorelua.EStructuralFeature#getEContainingClass()
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	EReference getEStructuralFeature_EContainingClass();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EStructuralFeature#getFeatureID() <em>Get Feature ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Feature ID</em>' operation.
	 * @see activityecorelua.EStructuralFeature#getFeatureID()
	 * @generated
	 */
	EOperation getEStructuralFeature__GetFeatureID();

	/**
	 * Returns the meta object for the '{@link activityecorelua.EStructuralFeature#getContainerClass() <em>Get Container Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Container Class</em>' operation.
	 * @see activityecorelua.EStructuralFeature#getContainerClass()
	 * @generated
	 */
	EOperation getEStructuralFeature__GetContainerClass();

	/**
	 * Returns the meta object for class '{@link activityecorelua.ETypedElement <em>ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ETyped Element</em>'.
	 * @see activityecorelua.ETypedElement
	 * @generated
	 */
	EClass getETypedElement();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.ETypedElement#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see activityecorelua.ETypedElement#isOrdered()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.ETypedElement#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see activityecorelua.ETypedElement#isUnique()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Unique();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.ETypedElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see activityecorelua.ETypedElement#getLowerBound()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.ETypedElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see activityecorelua.ETypedElement#getUpperBound()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.ETypedElement#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see activityecorelua.ETypedElement#isMany()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Many();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.ETypedElement#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see activityecorelua.ETypedElement#isRequired()
	 * @see #getETypedElement()
	 * @generated
	 */
	EAttribute getETypedElement_Required();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.ETypedElement#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see activityecorelua.ETypedElement#getEType()
	 * @see #getETypedElement()
	 * @generated
	 */
	EReference getETypedElement_EType();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.ETypedElement#getEGenericType <em>EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EGeneric Type</em>'.
	 * @see activityecorelua.ETypedElement#getEGenericType()
	 * @see #getETypedElement()
	 * @generated
	 */
	EReference getETypedElement_EGenericType();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="activityecorelua.EString"
	 *        valueDataType="activityecorelua.EString"
	 * @generated
	 */
	EClass getEStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getEStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getEStringToStringMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link activityecorelua.EGenericType <em>EGeneric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EGeneric Type</em>'.
	 * @see activityecorelua.EGenericType
	 * @generated
	 */
	EClass getEGenericType();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.EGenericType#getEUpperBound <em>EUpper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EUpper Bound</em>'.
	 * @see activityecorelua.EGenericType#getEUpperBound()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_EUpperBound();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.EGenericType#getETypeArguments <em>EType Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EType Arguments</em>'.
	 * @see activityecorelua.EGenericType#getETypeArguments()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ETypeArguments();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.EGenericType#getERawType <em>ERaw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ERaw Type</em>'.
	 * @see activityecorelua.EGenericType#getERawType()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ERawType();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.EGenericType#getELowerBound <em>ELower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ELower Bound</em>'.
	 * @see activityecorelua.EGenericType#getELowerBound()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ELowerBound();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.EGenericType#getETypeParameter <em>EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType Parameter</em>'.
	 * @see activityecorelua.EGenericType#getETypeParameter()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_ETypeParameter();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.EGenericType#getEClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClassifier</em>'.
	 * @see activityecorelua.EGenericType#getEClassifier()
	 * @see #getEGenericType()
	 * @generated
	 */
	EReference getEGenericType_EClassifier();

	/**
	 * Returns the meta object for class '{@link activityecorelua.ETypeParameter <em>EType Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EType Parameter</em>'.
	 * @see activityecorelua.ETypeParameter
	 * @generated
	 */
	EClass getETypeParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.ETypeParameter#getEBounds <em>EBounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EBounds</em>'.
	 * @see activityecorelua.ETypeParameter#getEBounds()
	 * @see #getETypeParameter()
	 * @generated
	 */
	EReference getETypeParameter_EBounds();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see activityecorelua.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Activity#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see activityecorelua.Activity#getNodes()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Activity#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see activityecorelua.Activity#getEdges()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Activity#getLocals <em>Locals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locals</em>'.
	 * @see activityecorelua.Activity#getLocals()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Locals();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Activity#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see activityecorelua.Activity#getInputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Inputs();

	/**
	 * Returns the meta object for class '{@link activityecorelua.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see activityecorelua.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.ActivityNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see activityecorelua.ActivityNode#getOutgoing()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link activityecorelua.ActivityNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see activityecorelua.ActivityNode#getIncoming()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Incoming();

	/**
	 * Returns the meta object for the container reference '{@link activityecorelua.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Activity</em>'.
	 * @see activityecorelua.ActivityNode#getActivity()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Activity();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.ActivityNode#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see activityecorelua.ActivityNode#isRunning()
	 * @see #getActivityNode()
	 * @generated
	 */
	EAttribute getActivityNode_Running();

	/**
	 * Returns the meta object for class '{@link activityecorelua.ActivityEdge <em>Activity Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Edge</em>'.
	 * @see activityecorelua.ActivityEdge
	 * @generated
	 */
	EClass getActivityEdge();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see activityecorelua.ActivityEdge#getSource()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Source();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see activityecorelua.ActivityEdge#getTarget()
	 * @see #getActivityEdge()
	 * @generated
	 */
	EReference getActivityEdge_Target();

	/**
	 * Returns the meta object for class '{@link activityecorelua.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow</em>'.
	 * @see activityecorelua.ControlFlow
	 * @generated
	 */
	EClass getControlFlow();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.ControlFlow#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard</em>'.
	 * @see activityecorelua.ControlFlow#getGuard()
	 * @see #getControlFlow()
	 * @generated
	 */
	EReference getControlFlow_Guard();

	/**
	 * Returns the meta object for class '{@link activityecorelua.ControlNode <em>Control Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Node</em>'.
	 * @see activityecorelua.ControlNode
	 * @generated
	 */
	EClass getControlNode();

	/**
	 * Returns the meta object for class '{@link activityecorelua.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Node</em>'.
	 * @see activityecorelua.ExecutableNode
	 * @generated
	 */
	EClass getExecutableNode();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see activityecorelua.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link activityecorelua.OpaqueAction <em>Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Action</em>'.
	 * @see activityecorelua.OpaqueAction
	 * @generated
	 */
	EClass getOpaqueAction();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.OpaqueAction#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see activityecorelua.OpaqueAction#getExpressions()
	 * @see #getOpaqueAction()
	 * @generated
	 */
	EReference getOpaqueAction_Expressions();

	/**
	 * Returns the meta object for class '{@link activityecorelua.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see activityecorelua.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see activityecorelua.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link activityecorelua.InitialNode <em>Initial Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Node</em>'.
	 * @see activityecorelua.InitialNode
	 * @generated
	 */
	EClass getInitialNode();

	/**
	 * Returns the meta object for class '{@link activityecorelua.FinalNode <em>Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final Node</em>'.
	 * @see activityecorelua.FinalNode
	 * @generated
	 */
	EClass getFinalNode();

	/**
	 * Returns the meta object for class '{@link activityecorelua.ActivityFinalNode <em>Activity Final Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Final Node</em>'.
	 * @see activityecorelua.ActivityFinalNode
	 * @generated
	 */
	EClass getActivityFinalNode();

	/**
	 * Returns the meta object for class '{@link activityecorelua.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Node</em>'.
	 * @see activityecorelua.ForkNode
	 * @generated
	 */
	EClass getForkNode();

	/**
	 * Returns the meta object for class '{@link activityecorelua.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Node</em>'.
	 * @see activityecorelua.JoinNode
	 * @generated
	 */
	EClass getJoinNode();

	/**
	 * Returns the meta object for class '{@link activityecorelua.MergeNode <em>Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Node</em>'.
	 * @see activityecorelua.MergeNode
	 * @generated
	 */
	EClass getMergeNode();

	/**
	 * Returns the meta object for class '{@link activityecorelua.DecisionNode <em>Decision Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Node</em>'.
	 * @see activityecorelua.DecisionNode
	 * @generated
	 */
	EClass getDecisionNode();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see activityecorelua.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Variable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see activityecorelua.Variable#getInitialValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see activityecorelua.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Variable#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Value</em>'.
	 * @see activityecorelua.Variable#getCurrentValue()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_CurrentValue();

	/**
	 * Returns the meta object for class '{@link activityecorelua.IntegerVariable <em>Integer Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Variable</em>'.
	 * @see activityecorelua.IntegerVariable
	 * @generated
	 */
	EClass getIntegerVariable();

	/**
	 * Returns the meta object for class '{@link activityecorelua.BooleanVariable <em>Boolean Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Variable</em>'.
	 * @see activityecorelua.BooleanVariable
	 * @generated
	 */
	EClass getBooleanVariable();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see activityecorelua.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link activityecorelua.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see activityecorelua.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.BooleanValue#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activityecorelua.BooleanValue#isValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_Value();

	/**
	 * Returns the meta object for class '{@link activityecorelua.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see activityecorelua.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.IntegerValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activityecorelua.IntegerValue#getValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_Value();

	/**
	 * Returns the meta object for class '{@link activityecorelua.InputValue <em>Input Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Value</em>'.
	 * @see activityecorelua.InputValue
	 * @generated
	 */
	EClass getInputValue();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.InputValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see activityecorelua.InputValue#getValue()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Value();

	/**
	 * Returns the meta object for the reference '{@link activityecorelua.InputValue#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see activityecorelua.InputValue#getVariable()
	 * @see #getInputValue()
	 * @generated
	 */
	EReference getInputValue_Variable();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see activityecorelua.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Input#getInputValues <em>Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Values</em>'.
	 * @see activityecorelua.Input#getInputValues()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_InputValues();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Chunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk</em>'.
	 * @see activityecorelua.Chunk
	 * @generated
	 */
	EClass getChunk();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see activityecorelua.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Block#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see activityecorelua.Block#getStatements()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Statements();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Block#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Value</em>'.
	 * @see activityecorelua.Block#getReturnValue()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_ReturnValue();

	/**
	 * Returns the meta object for class '{@link activityecorelua.LastStatement <em>Last Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Statement</em>'.
	 * @see activityecorelua.LastStatement
	 * @generated
	 */
	EClass getLastStatement();

	/**
	 * Returns the meta object for class '{@link activityecorelua.LastStatement_Return <em>Last Statement Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Statement Return</em>'.
	 * @see activityecorelua.LastStatement_Return
	 * @generated
	 */
	EClass getLastStatement_Return();

	/**
	 * Returns the meta object for class '{@link activityecorelua.LastStatement_Break <em>Last Statement Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Statement Break</em>'.
	 * @see activityecorelua.LastStatement_Break
	 * @generated
	 */
	EClass getLastStatement_Break();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see activityecorelua.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_Block <em>Statement Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Block</em>'.
	 * @see activityecorelua.Statement_Block
	 * @generated
	 */
	EClass getStatement_Block();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_Block#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see activityecorelua.Statement_Block#getBlock()
	 * @see #getStatement_Block()
	 * @generated
	 */
	EReference getStatement_Block_Block();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_While <em>Statement While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement While</em>'.
	 * @see activityecorelua.Statement_While
	 * @generated
	 */
	EClass getStatement_While();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_While#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see activityecorelua.Statement_While#getExpression()
	 * @see #getStatement_While()
	 * @generated
	 */
	EReference getStatement_While_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_While#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see activityecorelua.Statement_While#getBlock()
	 * @see #getStatement_While()
	 * @generated
	 */
	EReference getStatement_While_Block();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_Repeat <em>Statement Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Repeat</em>'.
	 * @see activityecorelua.Statement_Repeat
	 * @generated
	 */
	EClass getStatement_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_Repeat#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see activityecorelua.Statement_Repeat#getBlock()
	 * @see #getStatement_Repeat()
	 * @generated
	 */
	EReference getStatement_Repeat_Block();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_Repeat#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see activityecorelua.Statement_Repeat#getExpression()
	 * @see #getStatement_Repeat()
	 * @generated
	 */
	EReference getStatement_Repeat_Expression();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_If_Then_Else <em>Statement If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement If Then Else</em>'.
	 * @see activityecorelua.Statement_If_Then_Else
	 * @generated
	 */
	EClass getStatement_If_Then_Else();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_If_Then_Else#getIfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Expression</em>'.
	 * @see activityecorelua.Statement_If_Then_Else#getIfExpression()
	 * @see #getStatement_If_Then_Else()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_IfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_If_Then_Else#getIfBlock <em>If Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Block</em>'.
	 * @see activityecorelua.Statement_If_Then_Else#getIfBlock()
	 * @see #getStatement_If_Then_Else()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_IfBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Statement_If_Then_Else#getElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else If</em>'.
	 * @see activityecorelua.Statement_If_Then_Else#getElseIf()
	 * @see #getStatement_If_Then_Else()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_ElseIf();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_If_Then_Else#getElseBlock <em>Else Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Block</em>'.
	 * @see activityecorelua.Statement_If_Then_Else#getElseBlock()
	 * @see #getStatement_If_Then_Else()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_ElseBlock();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_If_Then_Else_ElseIfPart <em>Statement If Then Else Else If Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement If Then Else Else If Part</em>'.
	 * @see activityecorelua.Statement_If_Then_Else_ElseIfPart
	 * @generated
	 */
	EClass getStatement_If_Then_Else_ElseIfPart();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_If_Then_Else_ElseIfPart#getElseifExpression <em>Elseif Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elseif Expression</em>'.
	 * @see activityecorelua.Statement_If_Then_Else_ElseIfPart#getElseifExpression()
	 * @see #getStatement_If_Then_Else_ElseIfPart()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_ElseIfPart_ElseifExpression();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_If_Then_Else_ElseIfPart#getElseifBlock <em>Elseif Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elseif Block</em>'.
	 * @see activityecorelua.Statement_If_Then_Else_ElseIfPart#getElseifBlock()
	 * @see #getStatement_If_Then_Else_ElseIfPart()
	 * @generated
	 */
	EReference getStatement_If_Then_Else_ElseIfPart_ElseifBlock();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_For_Numeric <em>Statement For Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement For Numeric</em>'.
	 * @see activityecorelua.Statement_For_Numeric
	 * @generated
	 */
	EClass getStatement_For_Numeric();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.Statement_For_Numeric#getIteratorName <em>Iterator Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterator Name</em>'.
	 * @see activityecorelua.Statement_For_Numeric#getIteratorName()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EAttribute getStatement_For_Numeric_IteratorName();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_For_Numeric#getStartExpr <em>Start Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Expr</em>'.
	 * @see activityecorelua.Statement_For_Numeric#getStartExpr()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EReference getStatement_For_Numeric_StartExpr();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_For_Numeric#getUntilExpr <em>Until Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until Expr</em>'.
	 * @see activityecorelua.Statement_For_Numeric#getUntilExpr()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EReference getStatement_For_Numeric_UntilExpr();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_For_Numeric#getStepExpr <em>Step Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step Expr</em>'.
	 * @see activityecorelua.Statement_For_Numeric#getStepExpr()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EReference getStatement_For_Numeric_StepExpr();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_For_Numeric#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see activityecorelua.Statement_For_Numeric#getBlock()
	 * @see #getStatement_For_Numeric()
	 * @generated
	 */
	EReference getStatement_For_Numeric_Block();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_For_Generic <em>Statement For Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement For Generic</em>'.
	 * @see activityecorelua.Statement_For_Generic
	 * @generated
	 */
	EClass getStatement_For_Generic();

	/**
	 * Returns the meta object for the attribute list '{@link activityecorelua.Statement_For_Generic#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Names</em>'.
	 * @see activityecorelua.Statement_For_Generic#getNames()
	 * @see #getStatement_For_Generic()
	 * @generated
	 */
	EAttribute getStatement_For_Generic_Names();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Statement_For_Generic#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see activityecorelua.Statement_For_Generic#getExpressions()
	 * @see #getStatement_For_Generic()
	 * @generated
	 */
	EReference getStatement_For_Generic_Expressions();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_For_Generic#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see activityecorelua.Statement_For_Generic#getBlock()
	 * @see #getStatement_For_Generic()
	 * @generated
	 */
	EReference getStatement_For_Generic_Block();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_GlobalFunction_Declaration <em>Statement Global Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Global Function Declaration</em>'.
	 * @see activityecorelua.Statement_GlobalFunction_Declaration
	 * @generated
	 */
	EClass getStatement_GlobalFunction_Declaration();

	/**
	 * Returns the meta object for the attribute list '{@link activityecorelua.Statement_GlobalFunction_Declaration#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prefix</em>'.
	 * @see activityecorelua.Statement_GlobalFunction_Declaration#getPrefix()
	 * @see #getStatement_GlobalFunction_Declaration()
	 * @generated
	 */
	EAttribute getStatement_GlobalFunction_Declaration_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.Statement_GlobalFunction_Declaration#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see activityecorelua.Statement_GlobalFunction_Declaration#getFunctionName()
	 * @see #getStatement_GlobalFunction_Declaration()
	 * @generated
	 */
	EAttribute getStatement_GlobalFunction_Declaration_FunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_GlobalFunction_Declaration#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see activityecorelua.Statement_GlobalFunction_Declaration#getFunction()
	 * @see #getStatement_GlobalFunction_Declaration()
	 * @generated
	 */
	EReference getStatement_GlobalFunction_Declaration_Function();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_LocalFunction_Declaration <em>Statement Local Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Local Function Declaration</em>'.
	 * @see activityecorelua.Statement_LocalFunction_Declaration
	 * @generated
	 */
	EClass getStatement_LocalFunction_Declaration();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.Statement_LocalFunction_Declaration#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function Name</em>'.
	 * @see activityecorelua.Statement_LocalFunction_Declaration#getFunctionName()
	 * @see #getStatement_LocalFunction_Declaration()
	 * @generated
	 */
	EAttribute getStatement_LocalFunction_Declaration_FunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_LocalFunction_Declaration#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see activityecorelua.Statement_LocalFunction_Declaration#getFunction()
	 * @see #getStatement_LocalFunction_Declaration()
	 * @generated
	 */
	EReference getStatement_LocalFunction_Declaration_Function();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_Local_Variable_Declaration <em>Statement Local Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Local Variable Declaration</em>'.
	 * @see activityecorelua.Statement_Local_Variable_Declaration
	 * @generated
	 */
	EClass getStatement_Local_Variable_Declaration();

	/**
	 * Returns the meta object for the attribute list '{@link activityecorelua.Statement_Local_Variable_Declaration#getVariableNames <em>Variable Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Variable Names</em>'.
	 * @see activityecorelua.Statement_Local_Variable_Declaration#getVariableNames()
	 * @see #getStatement_Local_Variable_Declaration()
	 * @generated
	 */
	EAttribute getStatement_Local_Variable_Declaration_VariableNames();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Statement_Local_Variable_Declaration#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initial Value</em>'.
	 * @see activityecorelua.Statement_Local_Variable_Declaration#getInitialValue()
	 * @see #getStatement_Local_Variable_Declaration()
	 * @generated
	 */
	EReference getStatement_Local_Variable_Declaration_InitialValue();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_FunctioncallOrAssignment <em>Statement Functioncall Or Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Functioncall Or Assignment</em>'.
	 * @see activityecorelua.Statement_FunctioncallOrAssignment
	 * @generated
	 */
	EClass getStatement_FunctioncallOrAssignment();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see activityecorelua.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Nil <em>Expression Nil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Nil</em>'.
	 * @see activityecorelua.Expression_Nil
	 * @generated
	 */
	EClass getExpression_Nil();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_True <em>Expression True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression True</em>'.
	 * @see activityecorelua.Expression_True
	 * @generated
	 */
	EClass getExpression_True();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_False <em>Expression False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression False</em>'.
	 * @see activityecorelua.Expression_False
	 * @generated
	 */
	EClass getExpression_False();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Number <em>Expression Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Number</em>'.
	 * @see activityecorelua.Expression_Number
	 * @generated
	 */
	EClass getExpression_Number();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.Expression_Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activityecorelua.Expression_Number#getValue()
	 * @see #getExpression_Number()
	 * @generated
	 */
	EAttribute getExpression_Number_Value();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_VarArgs <em>Expression Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Var Args</em>'.
	 * @see activityecorelua.Expression_VarArgs
	 * @generated
	 */
	EClass getExpression_VarArgs();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_String <em>Expression String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression String</em>'.
	 * @see activityecorelua.Expression_String
	 * @generated
	 */
	EClass getExpression_String();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.Expression_String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see activityecorelua.Expression_String#getValue()
	 * @see #getExpression_String()
	 * @generated
	 */
	EAttribute getExpression_String_Value();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Function <em>Expression Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Function</em>'.
	 * @see activityecorelua.Expression_Function
	 * @generated
	 */
	EClass getExpression_Function();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Function#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see activityecorelua.Expression_Function#getFunction()
	 * @see #getExpression_Function()
	 * @generated
	 */
	EReference getExpression_Function_Function();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_TableConstructor <em>Expression Table Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Table Constructor</em>'.
	 * @see activityecorelua.Expression_TableConstructor
	 * @generated
	 */
	EClass getExpression_TableConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Expression_TableConstructor#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see activityecorelua.Expression_TableConstructor#getFields()
	 * @see #getExpression_TableConstructor()
	 * @generated
	 */
	EReference getExpression_TableConstructor_Fields();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see activityecorelua.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute list '{@link activityecorelua.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see activityecorelua.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.Function#isVarArgs <em>Var Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Args</em>'.
	 * @see activityecorelua.Function#isVarArgs()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_VarArgs();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Function#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see activityecorelua.Function#getBody()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Body();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Functioncall_Arguments <em>Functioncall Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functioncall Arguments</em>'.
	 * @see activityecorelua.Functioncall_Arguments
	 * @generated
	 */
	EClass getFunctioncall_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Functioncall_Arguments#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see activityecorelua.Functioncall_Arguments#getArguments()
	 * @see #getFunctioncall_Arguments()
	 * @generated
	 */
	EReference getFunctioncall_Arguments_Arguments();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see activityecorelua.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Field#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see activityecorelua.Field#getValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Value();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Field_AddEntryToTable_Brackets <em>Field Add Entry To Table Brackets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Add Entry To Table Brackets</em>'.
	 * @see activityecorelua.Field_AddEntryToTable_Brackets
	 * @generated
	 */
	EClass getField_AddEntryToTable_Brackets();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Field_AddEntryToTable_Brackets#getIndexExpression <em>Index Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index Expression</em>'.
	 * @see activityecorelua.Field_AddEntryToTable_Brackets#getIndexExpression()
	 * @see #getField_AddEntryToTable_Brackets()
	 * @generated
	 */
	EReference getField_AddEntryToTable_Brackets_IndexExpression();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Field_AddEntryToTable <em>Field Add Entry To Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Add Entry To Table</em>'.
	 * @see activityecorelua.Field_AddEntryToTable
	 * @generated
	 */
	EClass getField_AddEntryToTable();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.Field_AddEntryToTable#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see activityecorelua.Field_AddEntryToTable#getKey()
	 * @see #getField_AddEntryToTable()
	 * @generated
	 */
	EAttribute getField_AddEntryToTable_Key();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Field_AppendEntryToTable <em>Field Append Entry To Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Append Entry To Table</em>'.
	 * @see activityecorelua.Field_AppendEntryToTable
	 * @generated
	 */
	EClass getField_AppendEntryToTable();

	/**
	 * Returns the meta object for class '{@link activityecorelua.LastStatement_ReturnWithValue <em>Last Statement Return With Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Last Statement Return With Value</em>'.
	 * @see activityecorelua.LastStatement_ReturnWithValue
	 * @generated
	 */
	EClass getLastStatement_ReturnWithValue();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.LastStatement_ReturnWithValue#getReturnValues <em>Return Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Values</em>'.
	 * @see activityecorelua.LastStatement_ReturnWithValue#getReturnValues()
	 * @see #getLastStatement_ReturnWithValue()
	 * @generated
	 */
	EReference getLastStatement_ReturnWithValue_ReturnValues();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_Assignment <em>Statement Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Assignment</em>'.
	 * @see activityecorelua.Statement_Assignment
	 * @generated
	 */
	EClass getStatement_Assignment();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Statement_Assignment#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see activityecorelua.Statement_Assignment#getVariable()
	 * @see #getStatement_Assignment()
	 * @generated
	 */
	EReference getStatement_Assignment_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link activityecorelua.Statement_Assignment#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see activityecorelua.Statement_Assignment#getValues()
	 * @see #getStatement_Assignment()
	 * @generated
	 */
	EReference getStatement_Assignment_Values();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_CallMemberFunction <em>Statement Call Member Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Call Member Function</em>'.
	 * @see activityecorelua.Statement_CallMemberFunction
	 * @generated
	 */
	EClass getStatement_CallMemberFunction();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_CallMemberFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see activityecorelua.Statement_CallMemberFunction#getObject()
	 * @see #getStatement_CallMemberFunction()
	 * @generated
	 */
	EReference getStatement_CallMemberFunction_Object();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.Statement_CallMemberFunction#getMemberFunctionName <em>Member Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Function Name</em>'.
	 * @see activityecorelua.Statement_CallMemberFunction#getMemberFunctionName()
	 * @see #getStatement_CallMemberFunction()
	 * @generated
	 */
	EAttribute getStatement_CallMemberFunction_MemberFunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_CallMemberFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see activityecorelua.Statement_CallMemberFunction#getArguments()
	 * @see #getStatement_CallMemberFunction()
	 * @generated
	 */
	EReference getStatement_CallMemberFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Statement_CallFunction <em>Statement Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Call Function</em>'.
	 * @see activityecorelua.Statement_CallFunction
	 * @generated
	 */
	EClass getStatement_CallFunction();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_CallFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see activityecorelua.Statement_CallFunction#getObject()
	 * @see #getStatement_CallFunction()
	 * @generated
	 */
	EReference getStatement_CallFunction_Object();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Statement_CallFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see activityecorelua.Statement_CallFunction#getArguments()
	 * @see #getStatement_CallFunction()
	 * @generated
	 */
	EReference getStatement_CallFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Or <em>Expression Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Or</em>'.
	 * @see activityecorelua.Expression_Or
	 * @generated
	 */
	EClass getExpression_Or();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Or#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Or#getLeft()
	 * @see #getExpression_Or()
	 * @generated
	 */
	EReference getExpression_Or_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Or#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Or#getRight()
	 * @see #getExpression_Or()
	 * @generated
	 */
	EReference getExpression_Or_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_And <em>Expression And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression And</em>'.
	 * @see activityecorelua.Expression_And
	 * @generated
	 */
	EClass getExpression_And();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_And#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_And#getLeft()
	 * @see #getExpression_And()
	 * @generated
	 */
	EReference getExpression_And_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_And#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_And#getRight()
	 * @see #getExpression_And()
	 * @generated
	 */
	EReference getExpression_And_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Larger <em>Expression Larger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Larger</em>'.
	 * @see activityecorelua.Expression_Larger
	 * @generated
	 */
	EClass getExpression_Larger();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Larger#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Larger#getLeft()
	 * @see #getExpression_Larger()
	 * @generated
	 */
	EReference getExpression_Larger_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Larger#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Larger#getRight()
	 * @see #getExpression_Larger()
	 * @generated
	 */
	EReference getExpression_Larger_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Larger_Equal <em>Expression Larger Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Larger Equal</em>'.
	 * @see activityecorelua.Expression_Larger_Equal
	 * @generated
	 */
	EClass getExpression_Larger_Equal();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Larger_Equal#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Larger_Equal#getLeft()
	 * @see #getExpression_Larger_Equal()
	 * @generated
	 */
	EReference getExpression_Larger_Equal_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Larger_Equal#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Larger_Equal#getRight()
	 * @see #getExpression_Larger_Equal()
	 * @generated
	 */
	EReference getExpression_Larger_Equal_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Smaller <em>Expression Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Smaller</em>'.
	 * @see activityecorelua.Expression_Smaller
	 * @generated
	 */
	EClass getExpression_Smaller();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Smaller#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Smaller#getLeft()
	 * @see #getExpression_Smaller()
	 * @generated
	 */
	EReference getExpression_Smaller_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Smaller#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Smaller#getRight()
	 * @see #getExpression_Smaller()
	 * @generated
	 */
	EReference getExpression_Smaller_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Smaller_Equal <em>Expression Smaller Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Smaller Equal</em>'.
	 * @see activityecorelua.Expression_Smaller_Equal
	 * @generated
	 */
	EClass getExpression_Smaller_Equal();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Smaller_Equal#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Smaller_Equal#getLeft()
	 * @see #getExpression_Smaller_Equal()
	 * @generated
	 */
	EReference getExpression_Smaller_Equal_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Smaller_Equal#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Smaller_Equal#getRight()
	 * @see #getExpression_Smaller_Equal()
	 * @generated
	 */
	EReference getExpression_Smaller_Equal_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Equal <em>Expression Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Equal</em>'.
	 * @see activityecorelua.Expression_Equal
	 * @generated
	 */
	EClass getExpression_Equal();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Equal#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Equal#getLeft()
	 * @see #getExpression_Equal()
	 * @generated
	 */
	EReference getExpression_Equal_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Equal#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Equal#getRight()
	 * @see #getExpression_Equal()
	 * @generated
	 */
	EReference getExpression_Equal_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Not_Equal <em>Expression Not Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Not Equal</em>'.
	 * @see activityecorelua.Expression_Not_Equal
	 * @generated
	 */
	EClass getExpression_Not_Equal();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Not_Equal#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Not_Equal#getLeft()
	 * @see #getExpression_Not_Equal()
	 * @generated
	 */
	EReference getExpression_Not_Equal_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Not_Equal#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Not_Equal#getRight()
	 * @see #getExpression_Not_Equal()
	 * @generated
	 */
	EReference getExpression_Not_Equal_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Concatenation <em>Expression Concatenation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Concatenation</em>'.
	 * @see activityecorelua.Expression_Concatenation
	 * @generated
	 */
	EClass getExpression_Concatenation();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Concatenation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Concatenation#getLeft()
	 * @see #getExpression_Concatenation()
	 * @generated
	 */
	EReference getExpression_Concatenation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Concatenation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Concatenation#getRight()
	 * @see #getExpression_Concatenation()
	 * @generated
	 */
	EReference getExpression_Concatenation_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Plus <em>Expression Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Plus</em>'.
	 * @see activityecorelua.Expression_Plus
	 * @generated
	 */
	EClass getExpression_Plus();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Plus#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Plus#getLeft()
	 * @see #getExpression_Plus()
	 * @generated
	 */
	EReference getExpression_Plus_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Plus#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Plus#getRight()
	 * @see #getExpression_Plus()
	 * @generated
	 */
	EReference getExpression_Plus_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Minus <em>Expression Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Minus</em>'.
	 * @see activityecorelua.Expression_Minus
	 * @generated
	 */
	EClass getExpression_Minus();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Minus#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Minus#getLeft()
	 * @see #getExpression_Minus()
	 * @generated
	 */
	EReference getExpression_Minus_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Minus#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Minus#getRight()
	 * @see #getExpression_Minus()
	 * @generated
	 */
	EReference getExpression_Minus_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Multiplication <em>Expression Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Multiplication</em>'.
	 * @see activityecorelua.Expression_Multiplication
	 * @generated
	 */
	EClass getExpression_Multiplication();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Multiplication#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Multiplication#getLeft()
	 * @see #getExpression_Multiplication()
	 * @generated
	 */
	EReference getExpression_Multiplication_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Multiplication#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Multiplication#getRight()
	 * @see #getExpression_Multiplication()
	 * @generated
	 */
	EReference getExpression_Multiplication_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Division <em>Expression Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Division</em>'.
	 * @see activityecorelua.Expression_Division
	 * @generated
	 */
	EClass getExpression_Division();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Division#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Division#getLeft()
	 * @see #getExpression_Division()
	 * @generated
	 */
	EReference getExpression_Division_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Division#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Division#getRight()
	 * @see #getExpression_Division()
	 * @generated
	 */
	EReference getExpression_Division_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Modulo <em>Expression Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Modulo</em>'.
	 * @see activityecorelua.Expression_Modulo
	 * @generated
	 */
	EClass getExpression_Modulo();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Modulo#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Modulo#getLeft()
	 * @see #getExpression_Modulo()
	 * @generated
	 */
	EReference getExpression_Modulo_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Modulo#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Modulo#getRight()
	 * @see #getExpression_Modulo()
	 * @generated
	 */
	EReference getExpression_Modulo_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Negate <em>Expression Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Negate</em>'.
	 * @see activityecorelua.Expression_Negate
	 * @generated
	 */
	EClass getExpression_Negate();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Negate#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see activityecorelua.Expression_Negate#getExp()
	 * @see #getExpression_Negate()
	 * @generated
	 */
	EReference getExpression_Negate_Exp();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Length <em>Expression Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Length</em>'.
	 * @see activityecorelua.Expression_Length
	 * @generated
	 */
	EClass getExpression_Length();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Length#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see activityecorelua.Expression_Length#getExp()
	 * @see #getExpression_Length()
	 * @generated
	 */
	EReference getExpression_Length_Exp();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Invert <em>Expression Invert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Invert</em>'.
	 * @see activityecorelua.Expression_Invert
	 * @generated
	 */
	EClass getExpression_Invert();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Invert#getExp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exp</em>'.
	 * @see activityecorelua.Expression_Invert#getExp()
	 * @see #getExpression_Invert()
	 * @generated
	 */
	EReference getExpression_Invert_Exp();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_Exponentiation <em>Expression Exponentiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Exponentiation</em>'.
	 * @see activityecorelua.Expression_Exponentiation
	 * @generated
	 */
	EClass getExpression_Exponentiation();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Exponentiation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see activityecorelua.Expression_Exponentiation#getLeft()
	 * @see #getExpression_Exponentiation()
	 * @generated
	 */
	EReference getExpression_Exponentiation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_Exponentiation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see activityecorelua.Expression_Exponentiation#getRight()
	 * @see #getExpression_Exponentiation()
	 * @generated
	 */
	EReference getExpression_Exponentiation_Right();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_CallMemberFunction <em>Expression Call Member Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Call Member Function</em>'.
	 * @see activityecorelua.Expression_CallMemberFunction
	 * @generated
	 */
	EClass getExpression_CallMemberFunction();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_CallMemberFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see activityecorelua.Expression_CallMemberFunction#getObject()
	 * @see #getExpression_CallMemberFunction()
	 * @generated
	 */
	EReference getExpression_CallMemberFunction_Object();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.Expression_CallMemberFunction#getMemberFunctionName <em>Member Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Function Name</em>'.
	 * @see activityecorelua.Expression_CallMemberFunction#getMemberFunctionName()
	 * @see #getExpression_CallMemberFunction()
	 * @generated
	 */
	EAttribute getExpression_CallMemberFunction_MemberFunctionName();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_CallMemberFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see activityecorelua.Expression_CallMemberFunction#getArguments()
	 * @see #getExpression_CallMemberFunction()
	 * @generated
	 */
	EReference getExpression_CallMemberFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_CallFunction <em>Expression Call Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Call Function</em>'.
	 * @see activityecorelua.Expression_CallFunction
	 * @generated
	 */
	EClass getExpression_CallFunction();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_CallFunction#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see activityecorelua.Expression_CallFunction#getObject()
	 * @see #getExpression_CallFunction()
	 * @generated
	 */
	EReference getExpression_CallFunction_Object();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_CallFunction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arguments</em>'.
	 * @see activityecorelua.Expression_CallFunction#getArguments()
	 * @see #getExpression_CallFunction()
	 * @generated
	 */
	EReference getExpression_CallFunction_Arguments();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_AccessArray <em>Expression Access Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Access Array</em>'.
	 * @see activityecorelua.Expression_AccessArray
	 * @generated
	 */
	EClass getExpression_AccessArray();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_AccessArray#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see activityecorelua.Expression_AccessArray#getArray()
	 * @see #getExpression_AccessArray()
	 * @generated
	 */
	EReference getExpression_AccessArray_Array();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_AccessArray#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see activityecorelua.Expression_AccessArray#getIndex()
	 * @see #getExpression_AccessArray()
	 * @generated
	 */
	EReference getExpression_AccessArray_Index();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_AccessMember <em>Expression Access Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Access Member</em>'.
	 * @see activityecorelua.Expression_AccessMember
	 * @generated
	 */
	EClass getExpression_AccessMember();

	/**
	 * Returns the meta object for the containment reference '{@link activityecorelua.Expression_AccessMember#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see activityecorelua.Expression_AccessMember#getObject()
	 * @see #getExpression_AccessMember()
	 * @generated
	 */
	EReference getExpression_AccessMember_Object();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.Expression_AccessMember#getMemberName <em>Member Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Name</em>'.
	 * @see activityecorelua.Expression_AccessMember#getMemberName()
	 * @see #getExpression_AccessMember()
	 * @generated
	 */
	EAttribute getExpression_AccessMember_MemberName();

	/**
	 * Returns the meta object for class '{@link activityecorelua.Expression_VariableName <em>Expression Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Variable Name</em>'.
	 * @see activityecorelua.Expression_VariableName
	 * @generated
	 */
	EClass getExpression_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link activityecorelua.Expression_VariableName#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see activityecorelua.Expression_VariableName#getVariable()
	 * @see #getExpression_VariableName()
	 * @generated
	 */
	EAttribute getExpression_VariableName_Variable();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>EBig Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBig Decimal</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#decimal'"
	 * @generated
	 */
	EDataType getEBigDecimal();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>EBig Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBig Integer</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#integer'"
	 * @generated
	 */
	EDataType getEBigInteger();

	/**
	 * Returns the meta object for data type '<em>EBoolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBoolean</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#boolean'"
	 * @generated
	 */
	EDataType getEBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>EBoolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBoolean Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="baseType='EBoolean' name='EBoolean:Object'"
	 * @generated
	 */
	EDataType getEBooleanObject();

	/**
	 * Returns the meta object for data type '<em>EByte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte</em>'.
	 * @model instanceClass="byte"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#byte'"
	 * @generated
	 */
	EDataType getEByte();

	/**
	 * Returns the meta object for data type '<em>EByte Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte Array</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#hexBinary'"
	 * @generated
	 */
	EDataType getEByteArray();

	/**
	 * Returns the meta object for data type '{@link java.lang.Byte <em>EByte Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EByte Object</em>'.
	 * @see java.lang.Byte
	 * @model instanceClass="java.lang.Byte"
	 *        extendedMetaData="baseType='EByte' name='EByte:Object'"
	 * @generated
	 */
	EDataType getEByteObject();

	/**
	 * Returns the meta object for data type '<em>EChar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EChar</em>'.
	 * @model instanceClass="char"
	 * @generated
	 */
	EDataType getEChar();

	/**
	 * Returns the meta object for data type '{@link java.lang.Character <em>ECharacter Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ECharacter Object</em>'.
	 * @see java.lang.Character
	 * @model instanceClass="java.lang.Character"
	 *        extendedMetaData="baseType='EChar' name='EChar:Object'"
	 * @generated
	 */
	EDataType getECharacterObject();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>EDate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDate</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getEDate();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.DiagnosticChain <em>EDiagnostic Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDiagnostic Chain</em>'.
	 * @see org.eclipse.emf.common.util.DiagnosticChain
	 * @model instanceClass="org.eclipse.emf.common.util.DiagnosticChain" serializeable="false"
	 * @generated
	 */
	EDataType getEDiagnosticChain();

	/**
	 * Returns the meta object for data type '<em>EDouble</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDouble</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#double'"
	 * @generated
	 */
	EDataType getEDouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>EDouble Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDouble Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="baseType='EDouble' name='EDouble:Object'"
	 * @generated
	 */
	EDataType getEDoubleObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>EE List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EE List</em>'.
	 * @see org.eclipse.emf.common.util.EList
	 * @model instanceClass="org.eclipse.emf.common.util.EList" serializeable="false" typeParameters="E"
	 * @generated
	 */
	EDataType getEEList();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.Enumerator <em>EEnumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EEnumerator</em>'.
	 * @see org.eclipse.emf.common.util.Enumerator
	 * @model instanceClass="org.eclipse.emf.common.util.Enumerator" serializeable="false"
	 * @generated
	 */
	EDataType getEEnumerator();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.util.FeatureMap <em>EFeature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFeature Map</em>'.
	 * @see org.eclipse.emf.ecore.util.FeatureMap
	 * @model instanceClass="org.eclipse.emf.ecore.util.FeatureMap" serializeable="false"
	 * @generated
	 */
	EDataType getEFeatureMap();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.util.FeatureMap.Entry <em>EFeature Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFeature Map Entry</em>'.
	 * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
	 * @model instanceClass="org.eclipse.emf.ecore.util.FeatureMap$Entry" serializeable="false"
	 * @generated
	 */
	EDataType getEFeatureMapEntry();

	/**
	 * Returns the meta object for data type '<em>EFloat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFloat</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#float'"
	 * @generated
	 */
	EDataType getEFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>EFloat Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EFloat Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="baseType='EFloat' name='EFloat:Object'"
	 * @generated
	 */
	EDataType getEFloatObject();

	/**
	 * Returns the meta object for data type '<em>EInt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInt</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#int'"
	 * @generated
	 */
	EDataType getEInt();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>EInteger Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInteger Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="baseType='EInt' name='EInt:Object'"
	 * @generated
	 */
	EDataType getEIntegerObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>EJava Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJava Class</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class" typeParameters="T"
	 * @generated
	 */
	EDataType getEJavaClass();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>EJava Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJava Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getEJavaObject();

	/**
	 * Returns the meta object for data type '<em>ELong</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ELong</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#long'"
	 * @generated
	 */
	EDataType getELong();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>ELong Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ELong Object</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="baseType='ELong' name='ELong:Object'"
	 * @generated
	 */
	EDataType getELongObject();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>EMap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EMap</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" serializeable="false" typeParameters="K V"
	 * @generated
	 */
	EDataType getEMap();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.Resource <em>EResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EResource</em>'.
	 * @see org.eclipse.emf.ecore.resource.Resource
	 * @model instanceClass="org.eclipse.emf.ecore.resource.Resource" serializeable="false"
	 * @generated
	 */
	EDataType getEResource();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.resource.ResourceSet <em>EResource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EResource Set</em>'.
	 * @see org.eclipse.emf.ecore.resource.ResourceSet
	 * @model instanceClass="org.eclipse.emf.ecore.resource.ResourceSet" serializeable="false"
	 * @generated
	 */
	EDataType getEResourceSet();

	/**
	 * Returns the meta object for data type '<em>EShort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EShort</em>'.
	 * @model instanceClass="short"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#short'"
	 * @generated
	 */
	EDataType getEShort();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>EShort Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EShort Object</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        extendedMetaData="baseType='EShort' name='EShort:Object'"
	 * @generated
	 */
	EDataType getEShortObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>EString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EString</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="baseType='http://www.w3.org/2001/XMLSchema#string'"
	 * @generated
	 */
	EDataType getEString();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.TreeIterator <em>ETree Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ETree Iterator</em>'.
	 * @see org.eclipse.emf.common.util.TreeIterator
	 * @model instanceClass="org.eclipse.emf.common.util.TreeIterator" serializeable="false" typeParameters="E"
	 * @generated
	 */
	EDataType getETreeIterator();

	/**
	 * Returns the meta object for data type '{@link java.lang.reflect.InvocationTargetException <em>EInvocation Target Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInvocation Target Exception</em>'.
	 * @see java.lang.reflect.InvocationTargetException
	 * @model instanceClass="java.lang.reflect.InvocationTargetException" serializeable="false"
	 * @generated
	 */
	EDataType getEInvocationTargetException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivityecoreluaFactory getActivityecoreluaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EAttributeImpl <em>EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EAttributeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEAttribute()
		 * @generated
		 */
		EClass EATTRIBUTE = eINSTANCE.getEAttribute();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EATTRIBUTE__ID = eINSTANCE.getEAttribute_ID();

		/**
		 * The meta object literal for the '<em><b>EAttribute Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE__EATTRIBUTE_TYPE = eINSTANCE.getEAttribute_EAttributeType();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EAnnotationImpl <em>EAnnotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EAnnotationImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEAnnotation()
		 * @generated
		 */
		EClass EANNOTATION = eINSTANCE.getEAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EANNOTATION__SOURCE = eINSTANCE.getEAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__DETAILS = eINSTANCE.getEAnnotation_Details();

		/**
		 * The meta object literal for the '<em><b>EModel Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__EMODEL_ELEMENT = eINSTANCE.getEAnnotation_EModelElement();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__CONTENTS = eINSTANCE.getEAnnotation_Contents();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EANNOTATION__REFERENCES = eINSTANCE.getEAnnotation_References();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EClassImpl <em>EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EClassImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEClass()
		 * @generated
		 */
		EClass ECLASS = eINSTANCE.getEClass();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__ABSTRACT = eINSTANCE.getEClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__INTERFACE = eINSTANCE.getEClass_Interface();

		/**
		 * The meta object literal for the '<em><b>ESuper Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__ESUPER_TYPES = eINSTANCE.getEClass_ESuperTypes();

		/**
		 * The meta object literal for the '<em><b>EOperations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EOPERATIONS = eINSTANCE.getEClass_EOperations();

		/**
		 * The meta object literal for the '<em><b>EAll Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_ATTRIBUTES = eINSTANCE.getEClass_EAllAttributes();

		/**
		 * The meta object literal for the '<em><b>EAll References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_REFERENCES = eINSTANCE.getEClass_EAllReferences();

		/**
		 * The meta object literal for the '<em><b>EReferences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EREFERENCES = eINSTANCE.getEClass_EReferences();

		/**
		 * The meta object literal for the '<em><b>EAttributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EATTRIBUTES = eINSTANCE.getEClass_EAttributes();

		/**
		 * The meta object literal for the '<em><b>EAll Containments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_CONTAINMENTS = eINSTANCE.getEClass_EAllContainments();

		/**
		 * The meta object literal for the '<em><b>EAll Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_OPERATIONS = eINSTANCE.getEClass_EAllOperations();

		/**
		 * The meta object literal for the '<em><b>EAll Structural Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_STRUCTURAL_FEATURES = eINSTANCE.getEClass_EAllStructuralFeatures();

		/**
		 * The meta object literal for the '<em><b>EAll Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_SUPER_TYPES = eINSTANCE.getEClass_EAllSuperTypes();

		/**
		 * The meta object literal for the '<em><b>EID Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EID_ATTRIBUTE = eINSTANCE.getEClass_EIDAttribute();

		/**
		 * The meta object literal for the '<em><b>EStructural Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__ESTRUCTURAL_FEATURES = eINSTANCE.getEClass_EStructuralFeatures();

		/**
		 * The meta object literal for the '<em><b>EGeneric Super Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EGENERIC_SUPER_TYPES = eINSTANCE.getEClass_EGenericSuperTypes();

		/**
		 * The meta object literal for the '<em><b>EAll Generic Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__EALL_GENERIC_SUPER_TYPES = eINSTANCE.getEClass_EAllGenericSuperTypes();

		/**
		 * The meta object literal for the '<em><b>Is Super Type Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECLASS___IS_SUPER_TYPE_OF__ECLASS = eINSTANCE.getEClass__IsSuperTypeOf__EClass();

		/**
		 * The meta object literal for the '<em><b>Get Feature Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECLASS___GET_FEATURE_COUNT = eINSTANCE.getEClass__GetFeatureCount();

		/**
		 * The meta object literal for the '<em><b>Get EStructural Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECLASS___GET_ESTRUCTURAL_FEATURE__INT = eINSTANCE.getEClass__GetEStructuralFeature__int();

		/**
		 * The meta object literal for the '<em><b>Get Feature ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECLASS___GET_FEATURE_ID__ESTRUCTURALFEATURE = eINSTANCE.getEClass__GetFeatureID__EStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Get EStructural Feature</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECLASS___GET_ESTRUCTURAL_FEATURE__STRING = eINSTANCE.getEClass__GetEStructuralFeature__String();

		/**
		 * The meta object literal for the '<em><b>Get Operation Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECLASS___GET_OPERATION_COUNT = eINSTANCE.getEClass__GetOperationCount();

		/**
		 * The meta object literal for the '<em><b>Get EOperation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECLASS___GET_EOPERATION__INT = eINSTANCE.getEClass__GetEOperation__int();

		/**
		 * The meta object literal for the '<em><b>Get Operation ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECLASS___GET_OPERATION_ID__EOPERATION = eINSTANCE.getEClass__GetOperationID__EOperation();

		/**
		 * The meta object literal for the '<em><b>Get Override</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECLASS___GET_OVERRIDE__EOPERATION = eINSTANCE.getEClass__GetOverride__EOperation();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EClassifierImpl <em>EClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EClassifierImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEClassifier()
		 * @generated
		 */
		EClass ECLASSIFIER = eINSTANCE.getEClassifier();

		/**
		 * The meta object literal for the '<em><b>Instance Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASSIFIER__INSTANCE_CLASS_NAME = eINSTANCE.getEClassifier_InstanceClassName();

		/**
		 * The meta object literal for the '<em><b>Instance Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASSIFIER__INSTANCE_CLASS = eINSTANCE.getEClassifier_InstanceClass();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASSIFIER__DEFAULT_VALUE = eINSTANCE.getEClassifier_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Instance Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASSIFIER__INSTANCE_TYPE_NAME = eINSTANCE.getEClassifier_InstanceTypeName();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASSIFIER__EPACKAGE = eINSTANCE.getEClassifier_EPackage();

		/**
		 * The meta object literal for the '<em><b>EType Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASSIFIER__ETYPE_PARAMETERS = eINSTANCE.getEClassifier_ETypeParameters();

		/**
		 * The meta object literal for the '<em><b>Is Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECLASSIFIER___IS_INSTANCE__OBJECT = eINSTANCE.getEClassifier__IsInstance__Object();

		/**
		 * The meta object literal for the '<em><b>Get Classifier ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ECLASSIFIER___GET_CLASSIFIER_ID = eINSTANCE.getEClassifier__GetClassifierID();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EDataTypeImpl <em>EData Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EDataTypeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEDataType()
		 * @generated
		 */
		EClass EDATA_TYPE = eINSTANCE.getEDataType();

		/**
		 * The meta object literal for the '<em><b>Serializable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDATA_TYPE__SERIALIZABLE = eINSTANCE.getEDataType_Serializable();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EEnumImpl <em>EEnum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EEnumImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEEnum()
		 * @generated
		 */
		EClass EENUM = eINSTANCE.getEEnum();

		/**
		 * The meta object literal for the '<em><b>ELiterals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM__ELITERALS = eINSTANCE.getEEnum_ELiterals();

		/**
		 * The meta object literal for the '<em><b>Get EEnum Literal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EENUM___GET_EENUM_LITERAL__STRING = eINSTANCE.getEEnum__GetEEnumLiteral__String();

		/**
		 * The meta object literal for the '<em><b>Get EEnum Literal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EENUM___GET_EENUM_LITERAL__INT = eINSTANCE.getEEnum__GetEEnumLiteral__int();

		/**
		 * The meta object literal for the '<em><b>Get EEnum Literal By Literal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING = eINSTANCE.getEEnum__GetEEnumLiteralByLiteral__String();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EEnumLiteralImpl <em>EEnum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EEnumLiteralImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEEnumLiteral()
		 * @generated
		 */
		EClass EENUM_LITERAL = eINSTANCE.getEEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EENUM_LITERAL__VALUE = eINSTANCE.getEEnumLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EENUM_LITERAL__INSTANCE = eINSTANCE.getEEnumLiteral_Instance();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EENUM_LITERAL__LITERAL = eINSTANCE.getEEnumLiteral_Literal();

		/**
		 * The meta object literal for the '<em><b>EEnum</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EENUM_LITERAL__EENUM = eINSTANCE.getEEnumLiteral_EEnum();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EFactoryImpl <em>EFactory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EFactoryImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEFactory()
		 * @generated
		 */
		EClass EFACTORY = eINSTANCE.getEFactory();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFACTORY__EPACKAGE = eINSTANCE.getEFactory_EPackage();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EFACTORY___CREATE__ECLASS = eINSTANCE.getEFactory__Create__EClass();

		/**
		 * The meta object literal for the '<em><b>Create From String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EFACTORY___CREATE_FROM_STRING__EDATATYPE_STRING = eINSTANCE.getEFactory__CreateFromString__EDataType_String();

		/**
		 * The meta object literal for the '<em><b>Convert To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EFACTORY___CONVERT_TO_STRING__EDATATYPE_OBJECT = eINSTANCE.getEFactory__ConvertToString__EDataType_Object();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EModelElementImpl <em>EModel Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EModelElementImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEModelElement()
		 * @generated
		 */
		EClass EMODEL_ELEMENT = eINSTANCE.getEModelElement();

		/**
		 * The meta object literal for the '<em><b>EAnnotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMODEL_ELEMENT__EANNOTATIONS = eINSTANCE.getEModelElement_EAnnotations();

		/**
		 * The meta object literal for the '<em><b>Get EAnnotation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EMODEL_ELEMENT___GET_EANNOTATION__STRING = eINSTANCE.getEModelElement__GetEAnnotation__String();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ENamedElementImpl <em>ENamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ENamedElementImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getENamedElement()
		 * @generated
		 */
		EClass ENAMED_ELEMENT = eINSTANCE.getENamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENAMED_ELEMENT__NAME = eINSTANCE.getENamedElement_Name();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EObjectImpl <em>EObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EObjectImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEObject()
		 * @generated
		 */
		EClass EOBJECT = eINSTANCE.getEObject();

		/**
		 * The meta object literal for the '<em><b>Ee Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EOBJECT___EE_CLASS = eINSTANCE.getEObject__EeClass();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EOperationImpl <em>EOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EOperationImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEOperation()
		 * @generated
		 */
		EClass EOPERATION = eINSTANCE.getEOperation();

		/**
		 * The meta object literal for the '<em><b>EContaining Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__ECONTAINING_CLASS = eINSTANCE.getEOperation_EContainingClass();

		/**
		 * The meta object literal for the '<em><b>EType Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__ETYPE_PARAMETERS = eINSTANCE.getEOperation_ETypeParameters();

		/**
		 * The meta object literal for the '<em><b>EParameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__EPARAMETERS = eINSTANCE.getEOperation_EParameters();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__ACTIVITY = eINSTANCE.getEOperation_Activity();

		/**
		 * The meta object literal for the '<em><b>EExceptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__EEXCEPTIONS = eINSTANCE.getEOperation_EExceptions();

		/**
		 * The meta object literal for the '<em><b>EGeneric Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOPERATION__EGENERIC_EXCEPTIONS = eINSTANCE.getEOperation_EGenericExceptions();

		/**
		 * The meta object literal for the '<em><b>Get Operation ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EOPERATION___GET_OPERATION_ID = eINSTANCE.getEOperation__GetOperationID();

		/**
		 * The meta object literal for the '<em><b>Is Override Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EOPERATION___IS_OVERRIDE_OF__EOPERATION = eINSTANCE.getEOperation__IsOverrideOf__EOperation();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EPackageImpl <em>EPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EPackageImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEPackage()
		 * @generated
		 */
		EClass EPACKAGE = eINSTANCE.getEPackage();

		/**
		 * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE__NS_URI = eINSTANCE.getEPackage_NsURI();

		/**
		 * The meta object literal for the '<em><b>Ns Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE__NS_PREFIX = eINSTANCE.getEPackage_NsPrefix();

		/**
		 * The meta object literal for the '<em><b>EFactory Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__EFACTORY_INSTANCE = eINSTANCE.getEPackage_EFactoryInstance();

		/**
		 * The meta object literal for the '<em><b>EClassifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__ECLASSIFIERS = eINSTANCE.getEPackage_EClassifiers();

		/**
		 * The meta object literal for the '<em><b>ESubpackages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__ESUBPACKAGES = eINSTANCE.getEPackage_ESubpackages();

		/**
		 * The meta object literal for the '<em><b>ESuper Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__ESUPER_PACKAGE = eINSTANCE.getEPackage_ESuperPackage();

		/**
		 * The meta object literal for the '<em><b>Get EClassifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EPACKAGE___GET_ECLASSIFIER__STRING = eINSTANCE.getEPackage__GetEClassifier__String();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EParameterImpl <em>EParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EParameterImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEParameter()
		 * @generated
		 */
		EClass EPARAMETER = eINSTANCE.getEParameter();

		/**
		 * The meta object literal for the '<em><b>EOperation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPARAMETER__EOPERATION = eINSTANCE.getEParameter_EOperation();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EReferenceImpl <em>EReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EReferenceImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEReference()
		 * @generated
		 */
		EClass EREFERENCE = eINSTANCE.getEReference();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__CONTAINMENT = eINSTANCE.getEReference_Containment();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__CONTAINER = eINSTANCE.getEReference_Container();

		/**
		 * The meta object literal for the '<em><b>Resolve Proxies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EREFERENCE__RESOLVE_PROXIES = eINSTANCE.getEReference_ResolveProxies();

		/**
		 * The meta object literal for the '<em><b>EOpposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCE__EOPPOSITE = eINSTANCE.getEReference_EOpposite();

		/**
		 * The meta object literal for the '<em><b>EReference Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCE__EREFERENCE_TYPE = eINSTANCE.getEReference_EReferenceType();

		/**
		 * The meta object literal for the '<em><b>EKeys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EREFERENCE__EKEYS = eINSTANCE.getEReference_EKeys();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EStructuralFeatureImpl <em>EStructural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EStructuralFeatureImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEStructuralFeature()
		 * @generated
		 */
		EClass ESTRUCTURAL_FEATURE = eINSTANCE.getEStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__CHANGEABLE = eINSTANCE.getEStructuralFeature_Changeable();

		/**
		 * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__VOLATILE = eINSTANCE.getEStructuralFeature_Volatile();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__TRANSIENT = eINSTANCE.getEStructuralFeature_Transient();

		/**
		 * The meta object literal for the '<em><b>Default Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL = eINSTANCE.getEStructuralFeature_DefaultValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__DEFAULT_VALUE = eINSTANCE.getEStructuralFeature_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Unsettable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__UNSETTABLE = eINSTANCE.getEStructuralFeature_Unsettable();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRUCTURAL_FEATURE__DERIVED = eINSTANCE.getEStructuralFeature_Derived();

		/**
		 * The meta object literal for the '<em><b>EContaining Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRUCTURAL_FEATURE__ECONTAINING_CLASS = eINSTANCE.getEStructuralFeature_EContainingClass();

		/**
		 * The meta object literal for the '<em><b>Get Feature ID</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ESTRUCTURAL_FEATURE___GET_FEATURE_ID = eINSTANCE.getEStructuralFeature__GetFeatureID();

		/**
		 * The meta object literal for the '<em><b>Get Container Class</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ESTRUCTURAL_FEATURE___GET_CONTAINER_CLASS = eINSTANCE.getEStructuralFeature__GetContainerClass();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ETypedElementImpl <em>ETyped Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ETypedElementImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getETypedElement()
		 * @generated
		 */
		EClass ETYPED_ELEMENT = eINSTANCE.getETypedElement();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__ORDERED = eINSTANCE.getETypedElement_Ordered();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__UNIQUE = eINSTANCE.getETypedElement_Unique();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__LOWER_BOUND = eINSTANCE.getETypedElement_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__UPPER_BOUND = eINSTANCE.getETypedElement_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__MANY = eINSTANCE.getETypedElement_Many();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETYPED_ELEMENT__REQUIRED = eINSTANCE.getETypedElement_Required();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPED_ELEMENT__ETYPE = eINSTANCE.getETypedElement_EType();

		/**
		 * The meta object literal for the '<em><b>EGeneric Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPED_ELEMENT__EGENERIC_TYPE = eINSTANCE.getETypedElement_EGenericType();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EStringToStringMapEntryImpl <em>EString To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EStringToStringMapEntryImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEStringToStringMapEntry()
		 * @generated
		 */
		EClass ESTRING_TO_STRING_MAP_ENTRY = eINSTANCE.getEStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getEStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getEStringToStringMapEntry_Value();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.EGenericTypeImpl <em>EGeneric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.EGenericTypeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEGenericType()
		 * @generated
		 */
		EClass EGENERIC_TYPE = eINSTANCE.getEGenericType();

		/**
		 * The meta object literal for the '<em><b>EUpper Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__EUPPER_BOUND = eINSTANCE.getEGenericType_EUpperBound();

		/**
		 * The meta object literal for the '<em><b>EType Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ETYPE_ARGUMENTS = eINSTANCE.getEGenericType_ETypeArguments();

		/**
		 * The meta object literal for the '<em><b>ERaw Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ERAW_TYPE = eINSTANCE.getEGenericType_ERawType();

		/**
		 * The meta object literal for the '<em><b>ELower Bound</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ELOWER_BOUND = eINSTANCE.getEGenericType_ELowerBound();

		/**
		 * The meta object literal for the '<em><b>EType Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ETYPE_PARAMETER = eINSTANCE.getEGenericType_ETypeParameter();

		/**
		 * The meta object literal for the '<em><b>EClassifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EGENERIC_TYPE__ECLASSIFIER = eINSTANCE.getEGenericType_EClassifier();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ETypeParameterImpl <em>EType Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ETypeParameterImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getETypeParameter()
		 * @generated
		 */
		EClass ETYPE_PARAMETER = eINSTANCE.getETypeParameter();

		/**
		 * The meta object literal for the '<em><b>EBounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETYPE_PARAMETER__EBOUNDS = eINSTANCE.getETypeParameter_EBounds();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NODES = eINSTANCE.getActivity_Nodes();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__EDGES = eINSTANCE.getActivity_Edges();

		/**
		 * The meta object literal for the '<em><b>Locals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__LOCALS = eINSTANCE.getActivity_Locals();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INPUTS = eINSTANCE.getActivity_Inputs();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityNodeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__OUTGOING = eINSTANCE.getActivityNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__INCOMING = eINSTANCE.getActivityNode_Incoming();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__ACTIVITY = eINSTANCE.getActivityNode_Activity();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_NODE__RUNNING = eINSTANCE.getActivityNode_Running();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ActivityEdgeImpl <em>Activity Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityEdgeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getActivityEdge()
		 * @generated
		 */
		EClass ACTIVITY_EDGE = eINSTANCE.getActivityEdge();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__SOURCE = eINSTANCE.getActivityEdge_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_EDGE__TARGET = eINSTANCE.getActivityEdge_Target();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ControlFlowImpl <em>Control Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ControlFlowImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getControlFlow()
		 * @generated
		 */
		EClass CONTROL_FLOW = eINSTANCE.getControlFlow();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW__GUARD = eINSTANCE.getControlFlow_Guard();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ControlNodeImpl <em>Control Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ControlNodeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getControlNode()
		 * @generated
		 */
		EClass CONTROL_NODE = eINSTANCE.getControlNode();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ExecutableNodeImpl <em>Executable Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ExecutableNodeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExecutableNode()
		 * @generated
		 */
		EClass EXECUTABLE_NODE = eINSTANCE.getExecutableNode();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActionImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.OpaqueActionImpl <em>Opaque Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.OpaqueActionImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getOpaqueAction()
		 * @generated
		 */
		EClass OPAQUE_ACTION = eINSTANCE.getOpaqueAction();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPAQUE_ACTION__EXPRESSIONS = eINSTANCE.getOpaqueAction_Expressions();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.NamedElementImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.InitialNodeImpl <em>Initial Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.InitialNodeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getInitialNode()
		 * @generated
		 */
		EClass INITIAL_NODE = eINSTANCE.getInitialNode();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.FinalNodeImpl <em>Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.FinalNodeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getFinalNode()
		 * @generated
		 */
		EClass FINAL_NODE = eINSTANCE.getFinalNode();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ActivityFinalNodeImpl <em>Activity Final Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityFinalNodeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getActivityFinalNode()
		 * @generated
		 */
		EClass ACTIVITY_FINAL_NODE = eINSTANCE.getActivityFinalNode();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ForkNodeImpl <em>Fork Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ForkNodeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getForkNode()
		 * @generated
		 */
		EClass FORK_NODE = eINSTANCE.getForkNode();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.JoinNodeImpl <em>Join Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.JoinNodeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getJoinNode()
		 * @generated
		 */
		EClass JOIN_NODE = eINSTANCE.getJoinNode();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.MergeNodeImpl <em>Merge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.MergeNodeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getMergeNode()
		 * @generated
		 */
		EClass MERGE_NODE = eINSTANCE.getMergeNode();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.DecisionNodeImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getDecisionNode()
		 * @generated
		 */
		EClass DECISION_NODE = eINSTANCE.getDecisionNode();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.VariableImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__INITIAL_VALUE = eINSTANCE.getVariable_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__CURRENT_VALUE = eINSTANCE.getVariable_CurrentValue();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.IntegerVariableImpl <em>Integer Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.IntegerVariableImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getIntegerVariable()
		 * @generated
		 */
		EClass INTEGER_VARIABLE = eINSTANCE.getIntegerVariable();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.BooleanVariableImpl <em>Boolean Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.BooleanVariableImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getBooleanVariable()
		 * @generated
		 */
		EClass BOOLEAN_VARIABLE = eINSTANCE.getBooleanVariable();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ValueImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.BooleanValueImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.IntegerValueImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.InputValueImpl <em>Input Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.InputValueImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getInputValue()
		 * @generated
		 */
		EClass INPUT_VALUE = eINSTANCE.getInputValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE__VALUE = eINSTANCE.getInputValue_Value();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALUE__VARIABLE = eINSTANCE.getInputValue_Variable();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.InputImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Input Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INPUT_VALUES = eINSTANCE.getInput_InputValues();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ChunkImpl <em>Chunk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ChunkImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getChunk()
		 * @generated
		 */
		EClass CHUNK = eINSTANCE.getChunk();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.BlockImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__RETURN_VALUE = eINSTANCE.getBlock_ReturnValue();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.LastStatementImpl <em>Last Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.LastStatementImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getLastStatement()
		 * @generated
		 */
		EClass LAST_STATEMENT = eINSTANCE.getLastStatement();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.LastStatement_ReturnImpl <em>Last Statement Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.LastStatement_ReturnImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getLastStatement_Return()
		 * @generated
		 */
		EClass LAST_STATEMENT_RETURN = eINSTANCE.getLastStatement_Return();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.LastStatement_BreakImpl <em>Last Statement Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.LastStatement_BreakImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getLastStatement_Break()
		 * @generated
		 */
		EClass LAST_STATEMENT_BREAK = eINSTANCE.getLastStatement_Break();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.StatementImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_BlockImpl <em>Statement Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_BlockImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_Block()
		 * @generated
		 */
		EClass STATEMENT_BLOCK = eINSTANCE.getStatement_Block();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_BLOCK__BLOCK = eINSTANCE.getStatement_Block_Block();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_WhileImpl <em>Statement While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_WhileImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_While()
		 * @generated
		 */
		EClass STATEMENT_WHILE = eINSTANCE.getStatement_While();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_WHILE__EXPRESSION = eINSTANCE.getStatement_While_Expression();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_WHILE__BLOCK = eINSTANCE.getStatement_While_Block();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_RepeatImpl <em>Statement Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_RepeatImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_Repeat()
		 * @generated
		 */
		EClass STATEMENT_REPEAT = eINSTANCE.getStatement_Repeat();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_REPEAT__BLOCK = eINSTANCE.getStatement_Repeat_Block();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_REPEAT__EXPRESSION = eINSTANCE.getStatement_Repeat_Expression();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_If_Then_ElseImpl <em>Statement If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_If_Then_ElseImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_If_Then_Else()
		 * @generated
		 */
		EClass STATEMENT_IF_THEN_ELSE = eINSTANCE.getStatement_If_Then_Else();

		/**
		 * The meta object literal for the '<em><b>If Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_IF_THEN_ELSE__IF_EXPRESSION = eINSTANCE.getStatement_If_Then_Else_IfExpression();

		/**
		 * The meta object literal for the '<em><b>If Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_IF_THEN_ELSE__IF_BLOCK = eINSTANCE.getStatement_If_Then_Else_IfBlock();

		/**
		 * The meta object literal for the '<em><b>Else If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_IF_THEN_ELSE__ELSE_IF = eINSTANCE.getStatement_If_Then_Else_ElseIf();

		/**
		 * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_IF_THEN_ELSE__ELSE_BLOCK = eINSTANCE.getStatement_If_Then_Else_ElseBlock();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_If_Then_Else_ElseIfPartImpl <em>Statement If Then Else Else If Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_If_Then_Else_ElseIfPartImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_If_Then_Else_ElseIfPart()
		 * @generated
		 */
		EClass STATEMENT_IF_THEN_ELSE_ELSE_IF_PART = eINSTANCE.getStatement_If_Then_Else_ElseIfPart();

		/**
		 * The meta object literal for the '<em><b>Elseif Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION = eINSTANCE.getStatement_If_Then_Else_ElseIfPart_ElseifExpression();

		/**
		 * The meta object literal for the '<em><b>Elseif Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK = eINSTANCE.getStatement_If_Then_Else_ElseIfPart_ElseifBlock();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_For_NumericImpl <em>Statement For Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_For_NumericImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_For_Numeric()
		 * @generated
		 */
		EClass STATEMENT_FOR_NUMERIC = eINSTANCE.getStatement_For_Numeric();

		/**
		 * The meta object literal for the '<em><b>Iterator Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_FOR_NUMERIC__ITERATOR_NAME = eINSTANCE.getStatement_For_Numeric_IteratorName();

		/**
		 * The meta object literal for the '<em><b>Start Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_FOR_NUMERIC__START_EXPR = eINSTANCE.getStatement_For_Numeric_StartExpr();

		/**
		 * The meta object literal for the '<em><b>Until Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_FOR_NUMERIC__UNTIL_EXPR = eINSTANCE.getStatement_For_Numeric_UntilExpr();

		/**
		 * The meta object literal for the '<em><b>Step Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_FOR_NUMERIC__STEP_EXPR = eINSTANCE.getStatement_For_Numeric_StepExpr();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_FOR_NUMERIC__BLOCK = eINSTANCE.getStatement_For_Numeric_Block();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_For_GenericImpl <em>Statement For Generic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_For_GenericImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_For_Generic()
		 * @generated
		 */
		EClass STATEMENT_FOR_GENERIC = eINSTANCE.getStatement_For_Generic();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_FOR_GENERIC__NAMES = eINSTANCE.getStatement_For_Generic_Names();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_FOR_GENERIC__EXPRESSIONS = eINSTANCE.getStatement_For_Generic_Expressions();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_FOR_GENERIC__BLOCK = eINSTANCE.getStatement_For_Generic_Block();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_GlobalFunction_DeclarationImpl <em>Statement Global Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_GlobalFunction_DeclarationImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_GlobalFunction_Declaration()
		 * @generated
		 */
		EClass STATEMENT_GLOBAL_FUNCTION_DECLARATION = eINSTANCE.getStatement_GlobalFunction_Declaration();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_GLOBAL_FUNCTION_DECLARATION__PREFIX = eINSTANCE.getStatement_GlobalFunction_Declaration_Prefix();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION_NAME = eINSTANCE.getStatement_GlobalFunction_Declaration_FunctionName();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_GLOBAL_FUNCTION_DECLARATION__FUNCTION = eINSTANCE.getStatement_GlobalFunction_Declaration_Function();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_LocalFunction_DeclarationImpl <em>Statement Local Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_LocalFunction_DeclarationImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_LocalFunction_Declaration()
		 * @generated
		 */
		EClass STATEMENT_LOCAL_FUNCTION_DECLARATION = eINSTANCE.getStatement_LocalFunction_Declaration();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME = eINSTANCE.getStatement_LocalFunction_Declaration_FunctionName();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION = eINSTANCE.getStatement_LocalFunction_Declaration_Function();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_Local_Variable_DeclarationImpl <em>Statement Local Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_Local_Variable_DeclarationImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_Local_Variable_Declaration()
		 * @generated
		 */
		EClass STATEMENT_LOCAL_VARIABLE_DECLARATION = eINSTANCE.getStatement_Local_Variable_Declaration();

		/**
		 * The meta object literal for the '<em><b>Variable Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_LOCAL_VARIABLE_DECLARATION__VARIABLE_NAMES = eINSTANCE.getStatement_Local_Variable_Declaration_VariableNames();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_LOCAL_VARIABLE_DECLARATION__INITIAL_VALUE = eINSTANCE.getStatement_Local_Variable_Declaration_InitialValue();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_FunctioncallOrAssignmentImpl <em>Statement Functioncall Or Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_FunctioncallOrAssignmentImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_FunctioncallOrAssignment()
		 * @generated
		 */
		EClass STATEMENT_FUNCTIONCALL_OR_ASSIGNMENT = eINSTANCE.getStatement_FunctioncallOrAssignment();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ExpressionImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_NilImpl <em>Expression Nil</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_NilImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Nil()
		 * @generated
		 */
		EClass EXPRESSION_NIL = eINSTANCE.getExpression_Nil();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_TrueImpl <em>Expression True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_TrueImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_True()
		 * @generated
		 */
		EClass EXPRESSION_TRUE = eINSTANCE.getExpression_True();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_FalseImpl <em>Expression False</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_FalseImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_False()
		 * @generated
		 */
		EClass EXPRESSION_FALSE = eINSTANCE.getExpression_False();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_NumberImpl <em>Expression Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_NumberImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Number()
		 * @generated
		 */
		EClass EXPRESSION_NUMBER = eINSTANCE.getExpression_Number();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_NUMBER__VALUE = eINSTANCE.getExpression_Number_Value();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_VarArgsImpl <em>Expression Var Args</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_VarArgsImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_VarArgs()
		 * @generated
		 */
		EClass EXPRESSION_VAR_ARGS = eINSTANCE.getExpression_VarArgs();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_StringImpl <em>Expression String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_StringImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_String()
		 * @generated
		 */
		EClass EXPRESSION_STRING = eINSTANCE.getExpression_String();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_STRING__VALUE = eINSTANCE.getExpression_String_Value();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_FunctionImpl <em>Expression Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_FunctionImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Function()
		 * @generated
		 */
		EClass EXPRESSION_FUNCTION = eINSTANCE.getExpression_Function();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_FUNCTION__FUNCTION = eINSTANCE.getExpression_Function_Function();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_TableConstructorImpl <em>Expression Table Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_TableConstructorImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_TableConstructor()
		 * @generated
		 */
		EClass EXPRESSION_TABLE_CONSTRUCTOR = eINSTANCE.getExpression_TableConstructor();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_TABLE_CONSTRUCTOR__FIELDS = eINSTANCE.getExpression_TableConstructor_Fields();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.FunctionImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Var Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__VAR_ARGS = eINSTANCE.getFunction_VarArgs();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__BODY = eINSTANCE.getFunction_Body();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Functioncall_ArgumentsImpl <em>Functioncall Arguments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Functioncall_ArgumentsImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getFunctioncall_Arguments()
		 * @generated
		 */
		EClass FUNCTIONCALL_ARGUMENTS = eINSTANCE.getFunctioncall_Arguments();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONCALL_ARGUMENTS__ARGUMENTS = eINSTANCE.getFunctioncall_Arguments_Arguments();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.FieldImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__VALUE = eINSTANCE.getField_Value();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Field_AddEntryToTable_BracketsImpl <em>Field Add Entry To Table Brackets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Field_AddEntryToTable_BracketsImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getField_AddEntryToTable_Brackets()
		 * @generated
		 */
		EClass FIELD_ADD_ENTRY_TO_TABLE_BRACKETS = eINSTANCE.getField_AddEntryToTable_Brackets();

		/**
		 * The meta object literal for the '<em><b>Index Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION = eINSTANCE.getField_AddEntryToTable_Brackets_IndexExpression();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Field_AddEntryToTableImpl <em>Field Add Entry To Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Field_AddEntryToTableImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getField_AddEntryToTable()
		 * @generated
		 */
		EClass FIELD_ADD_ENTRY_TO_TABLE = eINSTANCE.getField_AddEntryToTable();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_ADD_ENTRY_TO_TABLE__KEY = eINSTANCE.getField_AddEntryToTable_Key();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Field_AppendEntryToTableImpl <em>Field Append Entry To Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Field_AppendEntryToTableImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getField_AppendEntryToTable()
		 * @generated
		 */
		EClass FIELD_APPEND_ENTRY_TO_TABLE = eINSTANCE.getField_AppendEntryToTable();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.LastStatement_ReturnWithValueImpl <em>Last Statement Return With Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.LastStatement_ReturnWithValueImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getLastStatement_ReturnWithValue()
		 * @generated
		 */
		EClass LAST_STATEMENT_RETURN_WITH_VALUE = eINSTANCE.getLastStatement_ReturnWithValue();

		/**
		 * The meta object literal for the '<em><b>Return Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAST_STATEMENT_RETURN_WITH_VALUE__RETURN_VALUES = eINSTANCE.getLastStatement_ReturnWithValue_ReturnValues();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_AssignmentImpl <em>Statement Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_AssignmentImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_Assignment()
		 * @generated
		 */
		EClass STATEMENT_ASSIGNMENT = eINSTANCE.getStatement_Assignment();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_ASSIGNMENT__VARIABLE = eINSTANCE.getStatement_Assignment_Variable();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_ASSIGNMENT__VALUES = eINSTANCE.getStatement_Assignment_Values();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_CallMemberFunctionImpl <em>Statement Call Member Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_CallMemberFunctionImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_CallMemberFunction()
		 * @generated
		 */
		EClass STATEMENT_CALL_MEMBER_FUNCTION = eINSTANCE.getStatement_CallMemberFunction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_CALL_MEMBER_FUNCTION__OBJECT = eINSTANCE.getStatement_CallMemberFunction_Object();

		/**
		 * The meta object literal for the '<em><b>Member Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME = eINSTANCE.getStatement_CallMemberFunction_MemberFunctionName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_CALL_MEMBER_FUNCTION__ARGUMENTS = eINSTANCE.getStatement_CallMemberFunction_Arguments();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Statement_CallFunctionImpl <em>Statement Call Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Statement_CallFunctionImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getStatement_CallFunction()
		 * @generated
		 */
		EClass STATEMENT_CALL_FUNCTION = eINSTANCE.getStatement_CallFunction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_CALL_FUNCTION__OBJECT = eINSTANCE.getStatement_CallFunction_Object();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_CALL_FUNCTION__ARGUMENTS = eINSTANCE.getStatement_CallFunction_Arguments();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_OrImpl <em>Expression Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_OrImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Or()
		 * @generated
		 */
		EClass EXPRESSION_OR = eINSTANCE.getExpression_Or();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_OR__LEFT = eINSTANCE.getExpression_Or_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_OR__RIGHT = eINSTANCE.getExpression_Or_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_AndImpl <em>Expression And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_AndImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_And()
		 * @generated
		 */
		EClass EXPRESSION_AND = eINSTANCE.getExpression_And();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_AND__LEFT = eINSTANCE.getExpression_And_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_AND__RIGHT = eINSTANCE.getExpression_And_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_LargerImpl <em>Expression Larger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_LargerImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Larger()
		 * @generated
		 */
		EClass EXPRESSION_LARGER = eINSTANCE.getExpression_Larger();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LARGER__LEFT = eINSTANCE.getExpression_Larger_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LARGER__RIGHT = eINSTANCE.getExpression_Larger_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_Larger_EqualImpl <em>Expression Larger Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_Larger_EqualImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Larger_Equal()
		 * @generated
		 */
		EClass EXPRESSION_LARGER_EQUAL = eINSTANCE.getExpression_Larger_Equal();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LARGER_EQUAL__LEFT = eINSTANCE.getExpression_Larger_Equal_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LARGER_EQUAL__RIGHT = eINSTANCE.getExpression_Larger_Equal_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_SmallerImpl <em>Expression Smaller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_SmallerImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Smaller()
		 * @generated
		 */
		EClass EXPRESSION_SMALLER = eINSTANCE.getExpression_Smaller();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_SMALLER__LEFT = eINSTANCE.getExpression_Smaller_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_SMALLER__RIGHT = eINSTANCE.getExpression_Smaller_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_Smaller_EqualImpl <em>Expression Smaller Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_Smaller_EqualImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Smaller_Equal()
		 * @generated
		 */
		EClass EXPRESSION_SMALLER_EQUAL = eINSTANCE.getExpression_Smaller_Equal();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_SMALLER_EQUAL__LEFT = eINSTANCE.getExpression_Smaller_Equal_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_SMALLER_EQUAL__RIGHT = eINSTANCE.getExpression_Smaller_Equal_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_EqualImpl <em>Expression Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_EqualImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Equal()
		 * @generated
		 */
		EClass EXPRESSION_EQUAL = eINSTANCE.getExpression_Equal();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_EQUAL__LEFT = eINSTANCE.getExpression_Equal_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_EQUAL__RIGHT = eINSTANCE.getExpression_Equal_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_Not_EqualImpl <em>Expression Not Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_Not_EqualImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Not_Equal()
		 * @generated
		 */
		EClass EXPRESSION_NOT_EQUAL = eINSTANCE.getExpression_Not_Equal();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_NOT_EQUAL__LEFT = eINSTANCE.getExpression_Not_Equal_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_NOT_EQUAL__RIGHT = eINSTANCE.getExpression_Not_Equal_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_ConcatenationImpl <em>Expression Concatenation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_ConcatenationImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Concatenation()
		 * @generated
		 */
		EClass EXPRESSION_CONCATENATION = eINSTANCE.getExpression_Concatenation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CONCATENATION__LEFT = eINSTANCE.getExpression_Concatenation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CONCATENATION__RIGHT = eINSTANCE.getExpression_Concatenation_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_PlusImpl <em>Expression Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_PlusImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Plus()
		 * @generated
		 */
		EClass EXPRESSION_PLUS = eINSTANCE.getExpression_Plus();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_PLUS__LEFT = eINSTANCE.getExpression_Plus_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_PLUS__RIGHT = eINSTANCE.getExpression_Plus_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_MinusImpl <em>Expression Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_MinusImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Minus()
		 * @generated
		 */
		EClass EXPRESSION_MINUS = eINSTANCE.getExpression_Minus();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MINUS__LEFT = eINSTANCE.getExpression_Minus_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MINUS__RIGHT = eINSTANCE.getExpression_Minus_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_MultiplicationImpl <em>Expression Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_MultiplicationImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Multiplication()
		 * @generated
		 */
		EClass EXPRESSION_MULTIPLICATION = eINSTANCE.getExpression_Multiplication();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MULTIPLICATION__LEFT = eINSTANCE.getExpression_Multiplication_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MULTIPLICATION__RIGHT = eINSTANCE.getExpression_Multiplication_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_DivisionImpl <em>Expression Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_DivisionImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Division()
		 * @generated
		 */
		EClass EXPRESSION_DIVISION = eINSTANCE.getExpression_Division();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_DIVISION__LEFT = eINSTANCE.getExpression_Division_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_DIVISION__RIGHT = eINSTANCE.getExpression_Division_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_ModuloImpl <em>Expression Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_ModuloImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Modulo()
		 * @generated
		 */
		EClass EXPRESSION_MODULO = eINSTANCE.getExpression_Modulo();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MODULO__LEFT = eINSTANCE.getExpression_Modulo_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_MODULO__RIGHT = eINSTANCE.getExpression_Modulo_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_NegateImpl <em>Expression Negate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_NegateImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Negate()
		 * @generated
		 */
		EClass EXPRESSION_NEGATE = eINSTANCE.getExpression_Negate();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_NEGATE__EXP = eINSTANCE.getExpression_Negate_Exp();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_LengthImpl <em>Expression Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_LengthImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Length()
		 * @generated
		 */
		EClass EXPRESSION_LENGTH = eINSTANCE.getExpression_Length();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LENGTH__EXP = eINSTANCE.getExpression_Length_Exp();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_InvertImpl <em>Expression Invert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_InvertImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Invert()
		 * @generated
		 */
		EClass EXPRESSION_INVERT = eINSTANCE.getExpression_Invert();

		/**
		 * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_INVERT__EXP = eINSTANCE.getExpression_Invert_Exp();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_ExponentiationImpl <em>Expression Exponentiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_ExponentiationImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_Exponentiation()
		 * @generated
		 */
		EClass EXPRESSION_EXPONENTIATION = eINSTANCE.getExpression_Exponentiation();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_EXPONENTIATION__LEFT = eINSTANCE.getExpression_Exponentiation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_EXPONENTIATION__RIGHT = eINSTANCE.getExpression_Exponentiation_Right();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_CallMemberFunctionImpl <em>Expression Call Member Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_CallMemberFunctionImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_CallMemberFunction()
		 * @generated
		 */
		EClass EXPRESSION_CALL_MEMBER_FUNCTION = eINSTANCE.getExpression_CallMemberFunction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT = eINSTANCE.getExpression_CallMemberFunction_Object();

		/**
		 * The meta object literal for the '<em><b>Member Function Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME = eINSTANCE.getExpression_CallMemberFunction_MemberFunctionName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS = eINSTANCE.getExpression_CallMemberFunction_Arguments();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_CallFunctionImpl <em>Expression Call Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_CallFunctionImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_CallFunction()
		 * @generated
		 */
		EClass EXPRESSION_CALL_FUNCTION = eINSTANCE.getExpression_CallFunction();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CALL_FUNCTION__OBJECT = eINSTANCE.getExpression_CallFunction_Object();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_CALL_FUNCTION__ARGUMENTS = eINSTANCE.getExpression_CallFunction_Arguments();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_AccessArrayImpl <em>Expression Access Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_AccessArrayImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_AccessArray()
		 * @generated
		 */
		EClass EXPRESSION_ACCESS_ARRAY = eINSTANCE.getExpression_AccessArray();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ACCESS_ARRAY__ARRAY = eINSTANCE.getExpression_AccessArray_Array();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ACCESS_ARRAY__INDEX = eINSTANCE.getExpression_AccessArray_Index();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_AccessMemberImpl <em>Expression Access Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_AccessMemberImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_AccessMember()
		 * @generated
		 */
		EClass EXPRESSION_ACCESS_MEMBER = eINSTANCE.getExpression_AccessMember();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_ACCESS_MEMBER__OBJECT = eINSTANCE.getExpression_AccessMember_Object();

		/**
		 * The meta object literal for the '<em><b>Member Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_ACCESS_MEMBER__MEMBER_NAME = eINSTANCE.getExpression_AccessMember_MemberName();

		/**
		 * The meta object literal for the '{@link activityecorelua.impl.Expression_VariableNameImpl <em>Expression Variable Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.Expression_VariableNameImpl
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getExpression_VariableName()
		 * @generated
		 */
		EClass EXPRESSION_VARIABLE_NAME = eINSTANCE.getExpression_VariableName();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_VARIABLE_NAME__VARIABLE = eINSTANCE.getExpression_VariableName_Variable();

		/**
		 * The meta object literal for the '<em>EBig Decimal</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEBigDecimal()
		 * @generated
		 */
		EDataType EBIG_DECIMAL = eINSTANCE.getEBigDecimal();

		/**
		 * The meta object literal for the '<em>EBig Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEBigInteger()
		 * @generated
		 */
		EDataType EBIG_INTEGER = eINSTANCE.getEBigInteger();

		/**
		 * The meta object literal for the '<em>EBoolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEBoolean()
		 * @generated
		 */
		EDataType EBOOLEAN = eINSTANCE.getEBoolean();

		/**
		 * The meta object literal for the '<em>EBoolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEBooleanObject()
		 * @generated
		 */
		EDataType EBOOLEAN_OBJECT = eINSTANCE.getEBooleanObject();

		/**
		 * The meta object literal for the '<em>EByte</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEByte()
		 * @generated
		 */
		EDataType EBYTE = eINSTANCE.getEByte();

		/**
		 * The meta object literal for the '<em>EByte Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEByteArray()
		 * @generated
		 */
		EDataType EBYTE_ARRAY = eINSTANCE.getEByteArray();

		/**
		 * The meta object literal for the '<em>EByte Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Byte
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEByteObject()
		 * @generated
		 */
		EDataType EBYTE_OBJECT = eINSTANCE.getEByteObject();

		/**
		 * The meta object literal for the '<em>EChar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEChar()
		 * @generated
		 */
		EDataType ECHAR = eINSTANCE.getEChar();

		/**
		 * The meta object literal for the '<em>ECharacter Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Character
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getECharacterObject()
		 * @generated
		 */
		EDataType ECHARACTER_OBJECT = eINSTANCE.getECharacterObject();

		/**
		 * The meta object literal for the '<em>EDate</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEDate()
		 * @generated
		 */
		EDataType EDATE = eINSTANCE.getEDate();

		/**
		 * The meta object literal for the '<em>EDiagnostic Chain</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.DiagnosticChain
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEDiagnosticChain()
		 * @generated
		 */
		EDataType EDIAGNOSTIC_CHAIN = eINSTANCE.getEDiagnosticChain();

		/**
		 * The meta object literal for the '<em>EDouble</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEDouble()
		 * @generated
		 */
		EDataType EDOUBLE = eINSTANCE.getEDouble();

		/**
		 * The meta object literal for the '<em>EDouble Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEDoubleObject()
		 * @generated
		 */
		EDataType EDOUBLE_OBJECT = eINSTANCE.getEDoubleObject();

		/**
		 * The meta object literal for the '<em>EE List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EList
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEEList()
		 * @generated
		 */
		EDataType EE_LIST = eINSTANCE.getEEList();

		/**
		 * The meta object literal for the '<em>EEnumerator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.Enumerator
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEEnumerator()
		 * @generated
		 */
		EDataType EENUMERATOR = eINSTANCE.getEEnumerator();

		/**
		 * The meta object literal for the '<em>EFeature Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.util.FeatureMap
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEFeatureMap()
		 * @generated
		 */
		EDataType EFEATURE_MAP = eINSTANCE.getEFeatureMap();

		/**
		 * The meta object literal for the '<em>EFeature Map Entry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.util.FeatureMap.Entry
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEFeatureMapEntry()
		 * @generated
		 */
		EDataType EFEATURE_MAP_ENTRY = eINSTANCE.getEFeatureMapEntry();

		/**
		 * The meta object literal for the '<em>EFloat</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEFloat()
		 * @generated
		 */
		EDataType EFLOAT = eINSTANCE.getEFloat();

		/**
		 * The meta object literal for the '<em>EFloat Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEFloatObject()
		 * @generated
		 */
		EDataType EFLOAT_OBJECT = eINSTANCE.getEFloatObject();

		/**
		 * The meta object literal for the '<em>EInt</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEInt()
		 * @generated
		 */
		EDataType EINT = eINSTANCE.getEInt();

		/**
		 * The meta object literal for the '<em>EInteger Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEIntegerObject()
		 * @generated
		 */
		EDataType EINTEGER_OBJECT = eINSTANCE.getEIntegerObject();

		/**
		 * The meta object literal for the '<em>EJava Class</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEJavaClass()
		 * @generated
		 */
		EDataType EJAVA_CLASS = eINSTANCE.getEJavaClass();

		/**
		 * The meta object literal for the '<em>EJava Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEJavaObject()
		 * @generated
		 */
		EDataType EJAVA_OBJECT = eINSTANCE.getEJavaObject();

		/**
		 * The meta object literal for the '<em>ELong</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getELong()
		 * @generated
		 */
		EDataType ELONG = eINSTANCE.getELong();

		/**
		 * The meta object literal for the '<em>ELong Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getELongObject()
		 * @generated
		 */
		EDataType ELONG_OBJECT = eINSTANCE.getELongObject();

		/**
		 * The meta object literal for the '<em>EMap</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEMap()
		 * @generated
		 */
		EDataType EMAP = eINSTANCE.getEMap();

		/**
		 * The meta object literal for the '<em>EResource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.Resource
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEResource()
		 * @generated
		 */
		EDataType ERESOURCE = eINSTANCE.getEResource();

		/**
		 * The meta object literal for the '<em>EResource Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.resource.ResourceSet
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEResourceSet()
		 * @generated
		 */
		EDataType ERESOURCE_SET = eINSTANCE.getEResourceSet();

		/**
		 * The meta object literal for the '<em>EShort</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEShort()
		 * @generated
		 */
		EDataType ESHORT = eINSTANCE.getEShort();

		/**
		 * The meta object literal for the '<em>EShort Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEShortObject()
		 * @generated
		 */
		EDataType ESHORT_OBJECT = eINSTANCE.getEShortObject();

		/**
		 * The meta object literal for the '<em>EString</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEString()
		 * @generated
		 */
		EDataType ESTRING = eINSTANCE.getEString();

		/**
		 * The meta object literal for the '<em>ETree Iterator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.TreeIterator
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getETreeIterator()
		 * @generated
		 */
		EDataType ETREE_ITERATOR = eINSTANCE.getETreeIterator();

		/**
		 * The meta object literal for the '<em>EInvocation Target Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.reflect.InvocationTargetException
		 * @see activityecorelua.impl.ActivityecoreluaPackageImpl#getEInvocationTargetException()
		 * @generated
		 */
		EDataType EINVOCATION_TARGET_EXCEPTION = eINSTANCE.getEInvocationTargetException();

	}

} //ActivityecoreluaPackage
