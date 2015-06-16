/**
 */
package activityecorelua.impl;

import activityecorelua.ActivityecoreluaPackage;
import activityecorelua.EEnum;
import activityecorelua.EEnumLiteral;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEnum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activityecorelua.impl.EEnumImpl#getELiterals <em>ELiterals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEnumImpl extends EDataTypeImpl implements EEnum {
	/**
	 * The cached value of the '{@link #getELiterals() <em>ELiterals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<EEnumLiteral> eLiterals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityecoreluaPackage.Literals.EENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EEnumLiteral> getELiterals() {
		if (eLiterals == null) {
			eLiterals = new EObjectContainmentWithInverseEList<EEnumLiteral>(EEnumLiteral.class, this, ActivityecoreluaPackage.EENUM__ELITERALS, ActivityecoreluaPackage.EENUM_LITERAL__EENUM);
		}
		return eLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral getEEnumLiteral(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral getEEnumLiteral(int value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral getEEnumLiteralByLiteral(String literal) {
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
			case ActivityecoreluaPackage.EENUM__ELITERALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getELiterals()).basicAdd(otherEnd, msgs);
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
			case ActivityecoreluaPackage.EENUM__ELITERALS:
				return ((InternalEList<?>)getELiterals()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityecoreluaPackage.EENUM__ELITERALS:
				return getELiterals();
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
			case ActivityecoreluaPackage.EENUM__ELITERALS:
				getELiterals().clear();
				getELiterals().addAll((Collection<? extends EEnumLiteral>)newValue);
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
			case ActivityecoreluaPackage.EENUM__ELITERALS:
				getELiterals().clear();
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
			case ActivityecoreluaPackage.EENUM__ELITERALS:
				return eLiterals != null && !eLiterals.isEmpty();
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
			case ActivityecoreluaPackage.EENUM___GET_EENUM_LITERAL__STRING:
				return getEEnumLiteral((String)arguments.get(0));
			case ActivityecoreluaPackage.EENUM___GET_EENUM_LITERAL__INT:
				return getEEnumLiteral((Integer)arguments.get(0));
			case ActivityecoreluaPackage.EENUM___GET_EENUM_LITERAL_BY_LITERAL__STRING:
				return getEEnumLiteralByLiteral((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EEnumImpl
