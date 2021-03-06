/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;
import eaglemodel.SMD;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.SMDImpl#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.impl.SMDImpl#getX <em>X</em>}</li>
 *   <li>{@link eaglemodel.impl.SMDImpl#getY <em>Y</em>}</li>
 *   <li>{@link eaglemodel.impl.SMDImpl#getDx <em>Dx</em>}</li>
 *   <li>{@link eaglemodel.impl.SMDImpl#getDy <em>Dy</em>}</li>
 *   <li>{@link eaglemodel.impl.SMDImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link eaglemodel.impl.SMDImpl#getRoundness <em>Roundness</em>}</li>
 *   <li>{@link eaglemodel.impl.SMDImpl#getRot <em>Rot</em>}</li>
 *   <li>{@link eaglemodel.impl.SMDImpl#isStop <em>Stop</em>}</li>
 *   <li>{@link eaglemodel.impl.SMDImpl#isThermals <em>Thermals</em>}</li>
 *   <li>{@link eaglemodel.impl.SMDImpl#isCream <em>Cream</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMDImpl extends MinimalEObjectImpl.Container implements SMD {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected double x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected double y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getDx() <em>Dx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDx()
	 * @generated
	 * @ordered
	 */
	protected static final double DX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDx() <em>Dx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDx()
	 * @generated
	 * @ordered
	 */
	protected double dx = DX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDy() <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDy()
	 * @generated
	 * @ordered
	 */
	protected static final double DY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDy() <em>Dy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDy()
	 * @generated
	 * @ordered
	 */
	protected double dy = DY_EDEFAULT;

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
	 * The default value of the '{@link #getRoundness() <em>Roundness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundness()
	 * @generated
	 * @ordered
	 */
	protected static final int ROUNDNESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoundness() <em>Roundness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundness()
	 * @generated
	 * @ordered
	 */
	protected int roundness = ROUNDNESS_EDEFAULT;

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
	 * The default value of the '{@link #isStop() <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STOP_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStop() <em>Stop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStop()
	 * @generated
	 * @ordered
	 */
	protected boolean stop = STOP_EDEFAULT;

	/**
	 * The default value of the '{@link #isThermals() <em>Thermals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThermals()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THERMALS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isThermals() <em>Thermals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThermals()
	 * @generated
	 * @ordered
	 */
	protected boolean thermals = THERMALS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCream() <em>Cream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCream()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREAM_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCream() <em>Cream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCream()
	 * @generated
	 * @ordered
	 */
	protected boolean cream = CREAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SMDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.SMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SMD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		double oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SMD__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		double oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SMD__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDx() {
		return dx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDx(double newDx) {
		double oldDx = dx;
		dx = newDx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SMD__DX, oldDx, dx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDy() {
		return dy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDy(double newDy) {
		double oldDy = dy;
		dy = newDy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SMD__DY, oldDy, dy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SMD__LAYER, oldLayer, layer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoundness() {
		return roundness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundness(int newRoundness) {
		int oldRoundness = roundness;
		roundness = newRoundness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SMD__ROUNDNESS, oldRoundness, roundness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SMD__ROT, oldRot, rot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStop() {
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(boolean newStop) {
		boolean oldStop = stop;
		stop = newStop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SMD__STOP, oldStop, stop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThermals() {
		return thermals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermals(boolean newThermals) {
		boolean oldThermals = thermals;
		thermals = newThermals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SMD__THERMALS, oldThermals, thermals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCream() {
		return cream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCream(boolean newCream) {
		boolean oldCream = cream;
		cream = newCream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SMD__CREAM, oldCream, cream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.SMD__NAME:
				return getName();
			case EaglemodelPackage.SMD__X:
				return getX();
			case EaglemodelPackage.SMD__Y:
				return getY();
			case EaglemodelPackage.SMD__DX:
				return getDx();
			case EaglemodelPackage.SMD__DY:
				return getDy();
			case EaglemodelPackage.SMD__LAYER:
				return getLayer();
			case EaglemodelPackage.SMD__ROUNDNESS:
				return getRoundness();
			case EaglemodelPackage.SMD__ROT:
				return getRot();
			case EaglemodelPackage.SMD__STOP:
				return isStop();
			case EaglemodelPackage.SMD__THERMALS:
				return isThermals();
			case EaglemodelPackage.SMD__CREAM:
				return isCream();
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
			case EaglemodelPackage.SMD__NAME:
				setName((String)newValue);
				return;
			case EaglemodelPackage.SMD__X:
				setX((Double)newValue);
				return;
			case EaglemodelPackage.SMD__Y:
				setY((Double)newValue);
				return;
			case EaglemodelPackage.SMD__DX:
				setDx((Double)newValue);
				return;
			case EaglemodelPackage.SMD__DY:
				setDy((Double)newValue);
				return;
			case EaglemodelPackage.SMD__LAYER:
				setLayer((Integer)newValue);
				return;
			case EaglemodelPackage.SMD__ROUNDNESS:
				setRoundness((Integer)newValue);
				return;
			case EaglemodelPackage.SMD__ROT:
				setRot((Integer)newValue);
				return;
			case EaglemodelPackage.SMD__STOP:
				setStop((Boolean)newValue);
				return;
			case EaglemodelPackage.SMD__THERMALS:
				setThermals((Boolean)newValue);
				return;
			case EaglemodelPackage.SMD__CREAM:
				setCream((Boolean)newValue);
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
			case EaglemodelPackage.SMD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EaglemodelPackage.SMD__X:
				setX(X_EDEFAULT);
				return;
			case EaglemodelPackage.SMD__Y:
				setY(Y_EDEFAULT);
				return;
			case EaglemodelPackage.SMD__DX:
				setDx(DX_EDEFAULT);
				return;
			case EaglemodelPackage.SMD__DY:
				setDy(DY_EDEFAULT);
				return;
			case EaglemodelPackage.SMD__LAYER:
				setLayer(LAYER_EDEFAULT);
				return;
			case EaglemodelPackage.SMD__ROUNDNESS:
				setRoundness(ROUNDNESS_EDEFAULT);
				return;
			case EaglemodelPackage.SMD__ROT:
				setRot(ROT_EDEFAULT);
				return;
			case EaglemodelPackage.SMD__STOP:
				setStop(STOP_EDEFAULT);
				return;
			case EaglemodelPackage.SMD__THERMALS:
				setThermals(THERMALS_EDEFAULT);
				return;
			case EaglemodelPackage.SMD__CREAM:
				setCream(CREAM_EDEFAULT);
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
			case EaglemodelPackage.SMD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EaglemodelPackage.SMD__X:
				return x != X_EDEFAULT;
			case EaglemodelPackage.SMD__Y:
				return y != Y_EDEFAULT;
			case EaglemodelPackage.SMD__DX:
				return dx != DX_EDEFAULT;
			case EaglemodelPackage.SMD__DY:
				return dy != DY_EDEFAULT;
			case EaglemodelPackage.SMD__LAYER:
				return layer != LAYER_EDEFAULT;
			case EaglemodelPackage.SMD__ROUNDNESS:
				return roundness != ROUNDNESS_EDEFAULT;
			case EaglemodelPackage.SMD__ROT:
				return rot != ROT_EDEFAULT;
			case EaglemodelPackage.SMD__STOP:
				return stop != STOP_EDEFAULT;
			case EaglemodelPackage.SMD__THERMALS:
				return thermals != THERMALS_EDEFAULT;
			case EaglemodelPackage.SMD__CREAM:
				return cream != CREAM_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", dx: ");
		result.append(dx);
		result.append(", dy: ");
		result.append(dy);
		result.append(", layer: ");
		result.append(layer);
		result.append(", roundness: ");
		result.append(roundness);
		result.append(", rot: ");
		result.append(rot);
		result.append(", stop: ");
		result.append(stop);
		result.append(", thermals: ");
		result.append(thermals);
		result.append(", cream: ");
		result.append(cream);
		result.append(')');
		return result.toString();
	}

} //SMDImpl
