/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;
import eaglemodel.Rectangle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.RectangleImpl#getX1 <em>X1</em>}</li>
 *   <li>{@link eaglemodel.impl.RectangleImpl#getY1 <em>Y1</em>}</li>
 *   <li>{@link eaglemodel.impl.RectangleImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link eaglemodel.impl.RectangleImpl#getY2 <em>Y2</em>}</li>
 *   <li>{@link eaglemodel.impl.RectangleImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.impl.RectangleImpl#getRot <em>Rot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangleImpl extends MinimalEObjectImpl.Container implements Rectangle {
	/**
	 * The default value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected static final double X1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX1() <em>X1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX1()
	 * @generated
	 * @ordered
	 */
	protected double x1 = X1_EDEFAULT;

	/**
	 * The default value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected static final double Y1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY1() <em>Y1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY1()
	 * @generated
	 * @ordered
	 */
	protected double y1 = Y1_EDEFAULT;

	/**
	 * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected static final double X2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX2()
	 * @generated
	 * @ordered
	 */
	protected double x2 = X2_EDEFAULT;

	/**
	 * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected static final double Y2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY2() <em>Y2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY2()
	 * @generated
	 * @ordered
	 */
	protected double y2 = Y2_EDEFAULT;

	/**
	 * The default value of the '{@link #getLayer() <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected static final int LAYER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected int layer = LAYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRot() <em>Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRot()
	 * @generated
	 * @ordered
	 */
	protected static final int ROT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRot() <em>Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRot()
	 * @generated
	 * @ordered
	 */
	protected int rot = ROT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.RECTANGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX1() {
		return x1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX1(double newX1) {
		double oldX1 = x1;
		x1 = newX1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.RECTANGLE__X1, oldX1, x1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY1() {
		return y1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY1(double newY1) {
		double oldY1 = y1;
		y1 = newY1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.RECTANGLE__Y1, oldY1, y1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX2() {
		return x2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX2(double newX2) {
		double oldX2 = x2;
		x2 = newX2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.RECTANGLE__X2, oldX2, x2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY2() {
		return y2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY2(double newY2) {
		double oldY2 = y2;
		y2 = newY2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.RECTANGLE__Y2, oldY2, y2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLayer() {
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayer(int newLayer) {
		int oldLayer = layer;
		layer = newLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.RECTANGLE__LAYER, oldLayer, layer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRot() {
		return rot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRot(int newRot) {
		int oldRot = rot;
		rot = newRot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.RECTANGLE__ROT, oldRot, rot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.RECTANGLE__X1:
				return getX1();
			case EaglemodelPackage.RECTANGLE__Y1:
				return getY1();
			case EaglemodelPackage.RECTANGLE__X2:
				return getX2();
			case EaglemodelPackage.RECTANGLE__Y2:
				return getY2();
			case EaglemodelPackage.RECTANGLE__LAYER:
				return getLayer();
			case EaglemodelPackage.RECTANGLE__ROT:
				return getRot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EaglemodelPackage.RECTANGLE__X1:
				setX1((Double)newValue);
				return;
			case EaglemodelPackage.RECTANGLE__Y1:
				setY1((Double)newValue);
				return;
			case EaglemodelPackage.RECTANGLE__X2:
				setX2((Double)newValue);
				return;
			case EaglemodelPackage.RECTANGLE__Y2:
				setY2((Double)newValue);
				return;
			case EaglemodelPackage.RECTANGLE__LAYER:
				setLayer((Integer)newValue);
				return;
			case EaglemodelPackage.RECTANGLE__ROT:
				setRot((Integer)newValue);
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
			case EaglemodelPackage.RECTANGLE__X1:
				setX1(X1_EDEFAULT);
				return;
			case EaglemodelPackage.RECTANGLE__Y1:
				setY1(Y1_EDEFAULT);
				return;
			case EaglemodelPackage.RECTANGLE__X2:
				setX2(X2_EDEFAULT);
				return;
			case EaglemodelPackage.RECTANGLE__Y2:
				setY2(Y2_EDEFAULT);
				return;
			case EaglemodelPackage.RECTANGLE__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case EaglemodelPackage.RECTANGLE__ROT:
				setRot(ROT_EDEFAULT);
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
			case EaglemodelPackage.RECTANGLE__X1:
				return x1 != X1_EDEFAULT;
			case EaglemodelPackage.RECTANGLE__Y1:
				return y1 != Y1_EDEFAULT;
			case EaglemodelPackage.RECTANGLE__X2:
				return x2 != X2_EDEFAULT;
			case EaglemodelPackage.RECTANGLE__Y2:
				return y2 != Y2_EDEFAULT;
			case EaglemodelPackage.RECTANGLE__LAYER:
				return layer != LAYER_EDEFAULT;
			case EaglemodelPackage.RECTANGLE__ROT:
				return rot != ROT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (x1: ");
		result.append(x1);
		result.append(", y1: ");
		result.append(y1);
		result.append(", x2: ");
		result.append(x2);
		result.append(", y2: ");
		result.append(y2);
		result.append(", layer: ");
		result.append(layer);
		result.append(", rot: ");
		result.append(rot);
		result.append(')');
		return result.toString();
	}

} //RectangleImpl
