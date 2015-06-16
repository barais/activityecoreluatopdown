/**
 */
package activityecorelua.impl;

import activityecorelua.ActivityecoreluaPackage;
import activityecorelua.EClassifier;
import activityecorelua.EFactory;
import activityecorelua.EPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.impl.EPackageImpl#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link activityecorelua.impl.EPackageImpl#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link activityecorelua.impl.EPackageImpl#getEFactoryInstance <em>EFactory Instance</em>}</li>
 *   <li>{@link activityecorelua.impl.EPackageImpl#getEClassifiers <em>EClassifiers</em>}</li>
 *   <li>{@link activityecorelua.impl.EPackageImpl#getESubpackages <em>ESubpackages</em>}</li>
 *   <li>{@link activityecorelua.impl.EPackageImpl#getESuperPackage <em>ESuper Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPackageImpl extends ENamedElementImpl implements EPackage {
	/**
	 * The default value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected String nsURI = NS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected String nsPrefix = NS_PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEFactoryInstance() <em>EFactory Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEFactoryInstance()
	 * @generated
	 * @ordered
	 */
	protected EFactory eFactoryInstance;

	/**
	 * The cached value of the '{@link #getEClassifiers() <em>EClassifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<EClassifier> eClassifiers;

	/**
	 * The cached value of the '{@link #getESubpackages() <em>ESubpackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESubpackages()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> eSubpackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityecoreluaPackage.Literals.EPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNsURI() {
		return nsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsURI(String newNsURI) {
		String oldNsURI = nsURI;
		nsURI = newNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityecoreluaPackage.EPACKAGE__NS_URI, oldNsURI, nsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNsPrefix() {
		return nsPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNsPrefix(String newNsPrefix) {
		String oldNsPrefix = nsPrefix;
		nsPrefix = newNsPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityecoreluaPackage.EPACKAGE__NS_PREFIX, oldNsPrefix, nsPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFactory getEFactoryInstance() {
		return eFactoryInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEFactoryInstance(EFactory newEFactoryInstance, NotificationChain msgs) {
		EFactory oldEFactoryInstance = eFactoryInstance;
		eFactoryInstance = newEFactoryInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityecoreluaPackage.EPACKAGE__EFACTORY_INSTANCE, oldEFactoryInstance, newEFactoryInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEFactoryInstance(EFactory newEFactoryInstance) {
		if (newEFactoryInstance != eFactoryInstance) {
			NotificationChain msgs = null;
			if (eFactoryInstance != null)
				msgs = ((InternalEObject)eFactoryInstance).eInverseRemove(this, ActivityecoreluaPackage.EFACTORY__EPACKAGE, EFactory.class, msgs);
			if (newEFactoryInstance != null)
				msgs = ((InternalEObject)newEFactoryInstance).eInverseAdd(this, ActivityecoreluaPackage.EFACTORY__EPACKAGE, EFactory.class, msgs);
			msgs = basicSetEFactoryInstance(newEFactoryInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityecoreluaPackage.EPACKAGE__EFACTORY_INSTANCE, newEFactoryInstance, newEFactoryInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClassifier> getEClassifiers() {
		if (eClassifiers == null) {
			eClassifiers = new EObjectContainmentWithInverseEList<EClassifier>(EClassifier.class, this, ActivityecoreluaPackage.EPACKAGE__ECLASSIFIERS, ActivityecoreluaPackage.ECLASSIFIER__EPACKAGE);
		}
		return eClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getESubpackages() {
		if (eSubpackages == null) {
			eSubpackages = new EObjectContainmentWithInverseEList<EPackage>(EPackage.class, this, ActivityecoreluaPackage.EPACKAGE__ESUBPACKAGES, ActivityecoreluaPackage.EPACKAGE__ESUPER_PACKAGE);
		}
		return eSubpackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getESuperPackage() {
		if (eContainerFeatureID() != ActivityecoreluaPackage.EPACKAGE__ESUPER_PACKAGE) return null;
		return (EPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getEClassifier(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityecoreluaPackage.EPACKAGE__EFACTORY_INSTANCE:
				if (eFactoryInstance != null)
					msgs = ((InternalEObject)eFactoryInstance).eInverseRemove(this, ActivityecoreluaPackage.EFACTORY__EPACKAGE, EFactory.class, msgs);
				return basicSetEFactoryInstance((EFactory)otherEnd, msgs);
			case ActivityecoreluaPackage.EPACKAGE__ECLASSIFIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEClassifiers()).basicAdd(otherEnd, msgs);
			case ActivityecoreluaPackage.EPACKAGE__ESUBPACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getESubpackages()).basicAdd(otherEnd, msgs);
			case ActivityecoreluaPackage.EPACKAGE__ESUPER_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ActivityecoreluaPackage.EPACKAGE__ESUPER_PACKAGE, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityecoreluaPackage.EPACKAGE__EFACTORY_INSTANCE:
				return basicSetEFactoryInstance(null, msgs);
			case ActivityecoreluaPackage.EPACKAGE__ECLASSIFIERS:
				return ((InternalEList<?>)getEClassifiers()).basicRemove(otherEnd, msgs);
			case ActivityecoreluaPackage.EPACKAGE__ESUBPACKAGES:
				return ((InternalEList<?>)getESubpackages()).basicRemove(otherEnd, msgs);
			case ActivityecoreluaPackage.EPACKAGE__ESUPER_PACKAGE:
				return eBasicSetContainer(null, ActivityecoreluaPackage.EPACKAGE__ESUPER_PACKAGE, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ActivityecoreluaPackage.EPACKAGE__ESUPER_PACKAGE:
				return eInternalContainer().eInverseRemove(this, ActivityecoreluaPackage.EPACKAGE__ESUBPACKAGES, EPackage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityecoreluaPackage.EPACKAGE__NS_URI:
				return getNsURI();
			case ActivityecoreluaPackage.EPACKAGE__NS_PREFIX:
				return getNsPrefix();
			case ActivityecoreluaPackage.EPACKAGE__EFACTORY_INSTANCE:
				return getEFactoryInstance();
			case ActivityecoreluaPackage.EPACKAGE__ECLASSIFIERS:
				return getEClassifiers();
			case ActivityecoreluaPackage.EPACKAGE__ESUBPACKAGES:
				return getESubpackages();
			case ActivityecoreluaPackage.EPACKAGE__ESUPER_PACKAGE:
				return getESuperPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivityecoreluaPackage.EPACKAGE__NS_URI:
				setNsURI((String)newValue);
				return;
			case ActivityecoreluaPackage.EPACKAGE__NS_PREFIX:
				setNsPrefix((String)newValue);
				return;
			case ActivityecoreluaPackage.EPACKAGE__EFACTORY_INSTANCE:
				setEFactoryInstance((EFactory)newValue);
				return;
			case ActivityecoreluaPackage.EPACKAGE__ECLASSIFIERS:
				getEClassifiers().clear();
				getEClassifiers().addAll((Collection<? extends EClassifier>)newValue);
				return;
			case ActivityecoreluaPackage.EPACKAGE__ESUBPACKAGES:
				getESubpackages().clear();
				getESubpackages().addAll((Collection<? extends EPackage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivityecoreluaPackage.EPACKAGE__NS_URI:
				setNsURI(NS_URI_EDEFAULT);
				return;
			case ActivityecoreluaPackage.EPACKAGE__NS_PREFIX:
				setNsPrefix(NS_PREFIX_EDEFAULT);
				return;
			case ActivityecoreluaPackage.EPACKAGE__EFACTORY_INSTANCE:
				setEFactoryInstance((EFactory)null);
				return;
			case ActivityecoreluaPackage.EPACKAGE__ECLASSIFIERS:
				getEClassifiers().clear();
				return;
			case ActivityecoreluaPackage.EPACKAGE__ESUBPACKAGES:
				getESubpackages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivityecoreluaPackage.EPACKAGE__NS_URI:
				return NS_URI_EDEFAULT == null ? nsURI != null : !NS_URI_EDEFAULT.equals(nsURI);
			case ActivityecoreluaPackage.EPACKAGE__NS_PREFIX:
				return NS_PREFIX_EDEFAULT == null ? nsPrefix != null : !NS_PREFIX_EDEFAULT.equals(nsPrefix);
			case ActivityecoreluaPackage.EPACKAGE__EFACTORY_INSTANCE:
				return eFactoryInstance != null;
			case ActivityecoreluaPackage.EPACKAGE__ECLASSIFIERS:
				return eClassifiers != null && !eClassifiers.isEmpty();
			case ActivityecoreluaPackage.EPACKAGE__ESUBPACKAGES:
				return eSubpackages != null && !eSubpackages.isEmpty();
			case ActivityecoreluaPackage.EPACKAGE__ESUPER_PACKAGE:
				return getESuperPackage() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ActivityecoreluaPackage.EPACKAGE___GET_ECLASSIFIER__STRING:
				return getEClassifier((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nsURI: ");
		result.append(nsURI);
		result.append(", nsPrefix: ");
		result.append(nsPrefix);
		result.append(')');
		return result.toString();
	}

} //EPackageImpl
