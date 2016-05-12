/**
 * generated by Xtext 2.9.2
 */
package br.ufpe.cin.plp.imperativa1.imperativa1.impl;

import br.ufpe.cin.plp.imperativa1.imperativa1.ExpLenght;
import br.ufpe.cin.plp.imperativa1.imperativa1.Expressao;
import br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp Lenght</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.impl.ExpLenghtImpl#getLengthExpressao <em>Length Expressao</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpLenghtImpl extends MinimalEObjectImpl.Container implements ExpLenght
{
  /**
   * The cached value of the '{@link #getLengthExpressao() <em>Length Expressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLengthExpressao()
   * @generated
   * @ordered
   */
  protected Expressao lengthExpressao;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpLenghtImpl()
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
    return Imperativa1Package.Literals.EXP_LENGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expressao getLengthExpressao()
  {
    return lengthExpressao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLengthExpressao(Expressao newLengthExpressao, NotificationChain msgs)
  {
    Expressao oldLengthExpressao = lengthExpressao;
    lengthExpressao = newLengthExpressao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Imperativa1Package.EXP_LENGHT__LENGTH_EXPRESSAO, oldLengthExpressao, newLengthExpressao);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLengthExpressao(Expressao newLengthExpressao)
  {
    if (newLengthExpressao != lengthExpressao)
    {
      NotificationChain msgs = null;
      if (lengthExpressao != null)
        msgs = ((InternalEObject)lengthExpressao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.EXP_LENGHT__LENGTH_EXPRESSAO, null, msgs);
      if (newLengthExpressao != null)
        msgs = ((InternalEObject)newLengthExpressao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.EXP_LENGHT__LENGTH_EXPRESSAO, null, msgs);
      msgs = basicSetLengthExpressao(newLengthExpressao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Imperativa1Package.EXP_LENGHT__LENGTH_EXPRESSAO, newLengthExpressao, newLengthExpressao));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Imperativa1Package.EXP_LENGHT__LENGTH_EXPRESSAO:
        return basicSetLengthExpressao(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case Imperativa1Package.EXP_LENGHT__LENGTH_EXPRESSAO:
        return getLengthExpressao();
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
      case Imperativa1Package.EXP_LENGHT__LENGTH_EXPRESSAO:
        setLengthExpressao((Expressao)newValue);
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
      case Imperativa1Package.EXP_LENGHT__LENGTH_EXPRESSAO:
        setLengthExpressao((Expressao)null);
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
      case Imperativa1Package.EXP_LENGHT__LENGTH_EXPRESSAO:
        return lengthExpressao != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpLenghtImpl
