/**
 */
package activityecorelua.impl;

import activityecorelua.Activity;
import activityecorelua.ActivityecoreluaPackage;
import activityecorelua.EClassifier;
import activityecorelua.EGenericType;
import activityecorelua.EOperation;
import activityecorelua.EParameter;
import activityecorelua.ETypeParameter;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.impl.EOperationImpl#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link activityecorelua.impl.EOperationImpl#getETypeParameters <em>EType Parameters</em>}</li>
 *   <li>{@link activityecorelua.impl.EOperationImpl#getEParameters <em>EParameters</em>}</li>
 *   <li>{@link activityecorelua.impl.EOperationImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link activityecorelua.impl.EOperationImpl#getEExceptions <em>EExceptions</em>}</li>
 *   <li>{@link activityecorelua.impl.EOperationImpl#getEGenericExceptions <em>EGeneric Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EOperationImpl extends ETypedElementImpl implements EOperation {
	/**
	 * The cached value of the '{@link #getETypeParameters() <em>EType Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ETypeParameter> eTypeParameters;

	/**
	 * The cached value of the '{@link #getEParameters() <em>EParameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> eParameters;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * The cached value of the '{@link #getEExceptions() <em>EExceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<EClassifier> eExceptions;

	/**
	 * The cached value of the '{@link #getEGenericExceptions() <em>EGeneric Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEGenericExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<EGenericType> eGenericExceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityecoreluaPackage.Literals.EOPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public activityecorelua.EClass getEContainingClass() {
		if (eContainerFeatureID() != ActivityecoreluaPackage.EOPERATION__ECONTAINING_CLASS) return null;
		return (activityecorelua.EClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ETypeParameter> getETypeParameters() {
		if (eTypeParameters == null) {
			eTypeParameters = new EObjectContainmentEList<ETypeParameter>(ETypeParameter.class, this, ActivityecoreluaPackage.EOPERATION__ETYPE_PARAMETERS);
		}
		return eTypeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EParameter> getEParameters() {
		if (eParameters == null) {
			eParameters = new EObjectContainmentWithInverseEList<EParameter>(EParameter.class, this, ActivityecoreluaPackage.EOPERATION__EPARAMETERS, ActivityecoreluaPackage.EPARAMETER__EOPERATION);
		}
		return eParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityecoreluaPackage.EOPERATION__ACTIVITY, oldActivity, newActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject)activity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityecoreluaPackage.EOPERATION__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject)newActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityecoreluaPackage.EOPERATION__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityecoreluaPackage.EOPERATION__ACTIVITY, newActivity, newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClassifier> getEExceptions() {
		if (eExceptions == null) {
			eExceptions = new EObjectResolvingEList.Unsettable<EClassifier>(EClassifier.class, this, ActivityecoreluaPackage.EOPERATION__EEXCEPTIONS);
		}
		return eExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEExceptions() {
		if (eExceptions != null) ((InternalEList.Unsettable<?>)eExceptions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEExceptions() {
		return eExceptions != null && ((InternalEList.Unsettable<?>)eExceptions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EGenericType> getEGenericExceptions() {
		if (eGenericExceptions == null) {
			eGenericExceptions = new EObjectContainmentEList.Unsettable<EGenericType>(EGenericType.class, this, ActivityecoreluaPackage.EOPERATION__EGENERIC_EXCEPTIONS);
		}
		return eGenericExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEGenericExceptions() {
		if (eGenericExceptions != null) ((InternalEList.Unsettable<?>)eGenericExceptions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEGenericExceptions() {
		return eGenericExceptions != null && ((InternalEList.Unsettable<?>)eGenericExceptions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOperationID() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverrideOf(EOperation someOperation) {
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
			case ActivityecoreluaPackage.EOPERATION__ECONTAINING_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ActivityecoreluaPackage.EOPERATION__ECONTAINING_CLASS, msgs);
			case ActivityecoreluaPackage.EOPERATION__EPARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEParameters()).basicAdd(otherEnd, msgs);
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
			case ActivityecoreluaPackage.EOPERATION__ECONTAINING_CLASS:
				return eBasicSetContainer(null, ActivityecoreluaPackage.EOPERATION__ECONTAINING_CLASS, msgs);
			case ActivityecoreluaPackage.EOPERATION__ETYPE_PARAMETERS:
				return ((InternalEList<?>)getETypeParameters()).basicRemove(otherEnd, msgs);
			case ActivityecoreluaPackage.EOPERATION__EPARAMETERS:
				return ((InternalEList<?>)getEParameters()).basicRemove(otherEnd, msgs);
			case ActivityecoreluaPackage.EOPERATION__ACTIVITY:
				return basicSetActivity(null, msgs);
			case ActivityecoreluaPackage.EOPERATION__EGENERIC_EXCEPTIONS:
				return ((InternalEList<?>)getEGenericExceptions()).basicRemove(otherEnd, msgs);
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
			case ActivityecoreluaPackage.EOPERATION__ECONTAINING_CLASS:
				return eInternalContainer().eInverseRemove(this, ActivityecoreluaPackage.ECLASS__EOPERATIONS, activityecorelua.EClass.class, msgs);
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
			case ActivityecoreluaPackage.EOPERATION__ECONTAINING_CLASS:
				return getEContainingClass();
			case ActivityecoreluaPackage.EOPERATION__ETYPE_PARAMETERS:
				return getETypeParameters();
			case ActivityecoreluaPackage.EOPERATION__EPARAMETERS:
				return getEParameters();
			case ActivityecoreluaPackage.EOPERATION__ACTIVITY:
				return getActivity();
			case ActivityecoreluaPackage.EOPERATION__EEXCEPTIONS:
				return getEExceptions();
			case ActivityecoreluaPackage.EOPERATION__EGENERIC_EXCEPTIONS:
				return getEGenericExceptions();
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
			case ActivityecoreluaPackage.EOPERATION__ETYPE_PARAMETERS:
				getETypeParameters().clear();
				getETypeParameters().addAll((Collection<? extends ETypeParameter>)newValue);
				return;
			case ActivityecoreluaPackage.EOPERATION__EPARAMETERS:
				getEParameters().clear();
				getEParameters().addAll((Collection<? extends EParameter>)newValue);
				return;
			case ActivityecoreluaPackage.EOPERATION__ACTIVITY:
				setActivity((Activity)newValue);
				return;
			case ActivityecoreluaPackage.EOPERATION__EEXCEPTIONS:
				getEExceptions().clear();
				getEExceptions().addAll((Collection<? extends EClassifier>)newValue);
				return;
			case ActivityecoreluaPackage.EOPERATION__EGENERIC_EXCEPTIONS:
				getEGenericExceptions().clear();
				getEGenericExceptions().addAll((Collection<? extends EGenericType>)newValue);
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
			case ActivityecoreluaPackage.EOPERATION__ETYPE_PARAMETERS:
				getETypeParameters().clear();
				return;
			case ActivityecoreluaPackage.EOPERATION__EPARAMETERS:
				getEParameters().clear();
				return;
			case ActivityecoreluaPackage.EOPERATION__ACTIVITY:
				setActivity((Activity)null);
				return;
			case ActivityecoreluaPackage.EOPERATION__EEXCEPTIONS:
				unsetEExceptions();
				return;
			case ActivityecoreluaPackage.EOPERATION__EGENERIC_EXCEPTIONS:
				unsetEGenericExceptions();
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
			case ActivityecoreluaPackage.EOPERATION__ECONTAINING_CLASS:
				return getEContainingClass() != null;
			case ActivityecoreluaPackage.EOPERATION__ETYPE_PARAMETERS:
				return eTypeParameters != null && !eTypeParameters.isEmpty();
			case ActivityecoreluaPackage.EOPERATION__EPARAMETERS:
				return eParameters != null && !eParameters.isEmpty();
			case ActivityecoreluaPackage.EOPERATION__ACTIVITY:
				return activity != null;
			case ActivityecoreluaPackage.EOPERATION__EEXCEPTIONS:
				return isSetEExceptions();
			case ActivityecoreluaPackage.EOPERATION__EGENERIC_EXCEPTIONS:
				return isSetEGenericExceptions();
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
			case ActivityecoreluaPackage.EOPERATION___GET_OPERATION_ID:
				return getOperationID();
			case ActivityecoreluaPackage.EOPERATION___IS_OVERRIDE_OF__EOPERATION:
				return isOverrideOf((EOperation)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EOperationImpl
