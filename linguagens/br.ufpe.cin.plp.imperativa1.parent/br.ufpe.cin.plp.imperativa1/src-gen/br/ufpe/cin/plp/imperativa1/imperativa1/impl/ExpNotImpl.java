/**
 * generated by Xtext 2.9.2
 */
package br.ufpe.cin.plp.imperativa1.imperativa1.impl;

import br.ufpe.cin.plp.imperativa1.imperativa1.ExpNot;
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
 * An implementation of the model object '<em><b>Exp Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.impl.ExpNotImpl#getNotExpressao <em>Not Expressao</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpNotImpl extends MinimalEObjectImpl.Container implements ExpNot
{
  /**
   * The cached value of the '{@link #getNotExpressao() <em>Not Expressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotExpressao()
   * @generated
   * @ordered
   */
  protected Expressao notExpressao;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpNotImpl()
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
    return Imperativa1Package.Literals.EXP_NOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expressao getNotExpressao()
  {
    return notExpressao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNotExpressao(Expressao newNotExpressao, NotificationChain msgs)
  {
    Expressao oldNotExpressao = notExpressao;
    notExpressao = newNotExpressao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Imperativa1Package.EXP_NOT__NOT_EXPRESSAO, oldNotExpressao, newNotExpressao);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotExpressao(Expressao newNotExpressao)
  {
    if (newNotExpressao != notExpressao)
    {
      NotificationChain msgs = null;
      if (notExpressao != null)
        msgs = ((InternalEObject)notExpressao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.EXP_NOT__NOT_EXPRESSAO, null, msgs);
      if (newNotExpressao != null)
        msgs = ((InternalEObject)newNotExpressao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.EXP_NOT__NOT_EXPRESSAO, null, msgs);
      msgs = basicSetNotExpressao(newNotExpressao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Imperativa1Package.EXP_NOT__NOT_EXPRESSAO, newNotExpressao, newNotExpressao));
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
      case Imperativa1Package.EXP_NOT__NOT_EXPRESSAO:
        return basicSetNotExpressao(null, msgs);
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
      case Imperativa1Package.EXP_NOT__NOT_EXPRESSAO:
        return getNotExpressao();
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
      case Imperativa1Package.EXP_NOT__NOT_EXPRESSAO:
        setNotExpressao((Expressao)newValue);
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
      case Imperativa1Package.EXP_NOT__NOT_EXPRESSAO:
        setNotExpressao((Expressao)null);
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
      case Imperativa1Package.EXP_NOT__NOT_EXPRESSAO:
        return notExpressao != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpNotImpl