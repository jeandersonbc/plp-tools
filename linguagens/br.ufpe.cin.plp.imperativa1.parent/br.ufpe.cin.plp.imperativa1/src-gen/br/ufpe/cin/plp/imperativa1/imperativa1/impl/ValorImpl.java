/**
 * generated by Xtext 2.9.2
 */
package br.ufpe.cin.plp.imperativa1.imperativa1.impl;

import br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package;
import br.ufpe.cin.plp.imperativa1.imperativa1.Valor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.impl.ValorImpl#getIntType <em>Int Type</em>}</li>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.impl.ValorImpl#getStringType <em>String Type</em>}</li>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.impl.ValorImpl#getBoolType <em>Bool Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValorImpl extends MinimalEObjectImpl.Container implements Valor
{
  /**
   * The default value of the '{@link #getIntType() <em>Int Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntType()
   * @generated
   * @ordered
   */
  protected static final String INT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIntType() <em>Int Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntType()
   * @generated
   * @ordered
   */
  protected String intType = INT_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getStringType() <em>String Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringType()
   * @generated
   * @ordered
   */
  protected static final String STRING_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringType() <em>String Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringType()
   * @generated
   * @ordered
   */
  protected String stringType = STRING_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getBoolType() <em>Bool Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolType()
   * @generated
   * @ordered
   */
  protected static final String BOOL_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolType() <em>Bool Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolType()
   * @generated
   * @ordered
   */
  protected String boolType = BOOL_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Imperativa1Package.Literals.VALOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIntType()
  {
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntType(String newIntType)
  {
    String oldIntType = intType;
    intType = newIntType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Imperativa1Package.VALOR__INT_TYPE, oldIntType, intType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringType()
  {
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringType(String newStringType)
  {
    String oldStringType = stringType;
    stringType = newStringType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Imperativa1Package.VALOR__STRING_TYPE, oldStringType, stringType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBoolType()
  {
    return boolType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoolType(String newBoolType)
  {
    String oldBoolType = boolType;
    boolType = newBoolType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Imperativa1Package.VALOR__BOOL_TYPE, oldBoolType, boolType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Imperativa1Package.VALOR__INT_TYPE:
        return getIntType();
      case Imperativa1Package.VALOR__STRING_TYPE:
        return getStringType();
      case Imperativa1Package.VALOR__BOOL_TYPE:
        return getBoolType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Imperativa1Package.VALOR__INT_TYPE:
        setIntType((String)newValue);
        return;
      case Imperativa1Package.VALOR__STRING_TYPE:
        setStringType((String)newValue);
        return;
      case Imperativa1Package.VALOR__BOOL_TYPE:
        setBoolType((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Imperativa1Package.VALOR__INT_TYPE:
        setIntType(INT_TYPE_EDEFAULT);
        return;
      case Imperativa1Package.VALOR__STRING_TYPE:
        setStringType(STRING_TYPE_EDEFAULT);
        return;
      case Imperativa1Package.VALOR__BOOL_TYPE:
        setBoolType(BOOL_TYPE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Imperativa1Package.VALOR__INT_TYPE:
        return INT_TYPE_EDEFAULT == null ? intType != null : !INT_TYPE_EDEFAULT.equals(intType);
      case Imperativa1Package.VALOR__STRING_TYPE:
        return STRING_TYPE_EDEFAULT == null ? stringType != null : !STRING_TYPE_EDEFAULT.equals(stringType);
      case Imperativa1Package.VALOR__BOOL_TYPE:
        return BOOL_TYPE_EDEFAULT == null ? boolType != null : !BOOL_TYPE_EDEFAULT.equals(boolType);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (intType: ");
    result.append(intType);
    result.append(", stringType: ");
    result.append(stringType);
    result.append(", boolType: ");
    result.append(boolType);
    result.append(')');
    return result.toString();
  }

} //ValorImpl