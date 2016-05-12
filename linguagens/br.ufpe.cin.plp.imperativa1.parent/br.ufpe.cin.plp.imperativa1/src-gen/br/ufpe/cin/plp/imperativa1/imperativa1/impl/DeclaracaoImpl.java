/**
 * generated by Xtext 2.9.2
 */
package br.ufpe.cin.plp.imperativa1.imperativa1.impl;

import br.ufpe.cin.plp.imperativa1.imperativa1.Declaracao;
import br.ufpe.cin.plp.imperativa1.imperativa1.DeclaracaoComposta;
import br.ufpe.cin.plp.imperativa1.imperativa1.DeclaracaoVariavel;
import br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaracao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.impl.DeclaracaoImpl#getDecComposta <em>Dec Composta</em>}</li>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.impl.DeclaracaoImpl#getDecVariavel <em>Dec Variavel</em>}</li>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.impl.DeclaracaoImpl#getDeclaracao <em>Declaracao</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclaracaoImpl extends MinimalEObjectImpl.Container implements Declaracao
{
  /**
   * The cached value of the '{@link #getDecComposta() <em>Dec Composta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecComposta()
   * @generated
   * @ordered
   */
  protected DeclaracaoComposta decComposta;

  /**
   * The cached value of the '{@link #getDecVariavel() <em>Dec Variavel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecVariavel()
   * @generated
   * @ordered
   */
  protected DeclaracaoVariavel decVariavel;

  /**
   * The cached value of the '{@link #getDeclaracao() <em>Declaracao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaracao()
   * @generated
   * @ordered
   */
  protected Declaracao declaracao;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclaracaoImpl()
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
    return Imperativa1Package.Literals.DECLARACAO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclaracaoComposta getDecComposta()
  {
    return decComposta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecComposta(DeclaracaoComposta newDecComposta, NotificationChain msgs)
  {
    DeclaracaoComposta oldDecComposta = decComposta;
    decComposta = newDecComposta;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Imperativa1Package.DECLARACAO__DEC_COMPOSTA, oldDecComposta, newDecComposta);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecComposta(DeclaracaoComposta newDecComposta)
  {
    if (newDecComposta != decComposta)
    {
      NotificationChain msgs = null;
      if (decComposta != null)
        msgs = ((InternalEObject)decComposta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.DECLARACAO__DEC_COMPOSTA, null, msgs);
      if (newDecComposta != null)
        msgs = ((InternalEObject)newDecComposta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.DECLARACAO__DEC_COMPOSTA, null, msgs);
      msgs = basicSetDecComposta(newDecComposta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Imperativa1Package.DECLARACAO__DEC_COMPOSTA, newDecComposta, newDecComposta));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclaracaoVariavel getDecVariavel()
  {
    return decVariavel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecVariavel(DeclaracaoVariavel newDecVariavel, NotificationChain msgs)
  {
    DeclaracaoVariavel oldDecVariavel = decVariavel;
    decVariavel = newDecVariavel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Imperativa1Package.DECLARACAO__DEC_VARIAVEL, oldDecVariavel, newDecVariavel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecVariavel(DeclaracaoVariavel newDecVariavel)
  {
    if (newDecVariavel != decVariavel)
    {
      NotificationChain msgs = null;
      if (decVariavel != null)
        msgs = ((InternalEObject)decVariavel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.DECLARACAO__DEC_VARIAVEL, null, msgs);
      if (newDecVariavel != null)
        msgs = ((InternalEObject)newDecVariavel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.DECLARACAO__DEC_VARIAVEL, null, msgs);
      msgs = basicSetDecVariavel(newDecVariavel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Imperativa1Package.DECLARACAO__DEC_VARIAVEL, newDecVariavel, newDecVariavel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaracao getDeclaracao()
  {
    return declaracao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaracao(Declaracao newDeclaracao, NotificationChain msgs)
  {
    Declaracao oldDeclaracao = declaracao;
    declaracao = newDeclaracao;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Imperativa1Package.DECLARACAO__DECLARACAO, oldDeclaracao, newDeclaracao);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaracao(Declaracao newDeclaracao)
  {
    if (newDeclaracao != declaracao)
    {
      NotificationChain msgs = null;
      if (declaracao != null)
        msgs = ((InternalEObject)declaracao).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.DECLARACAO__DECLARACAO, null, msgs);
      if (newDeclaracao != null)
        msgs = ((InternalEObject)newDeclaracao).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.DECLARACAO__DECLARACAO, null, msgs);
      msgs = basicSetDeclaracao(newDeclaracao, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Imperativa1Package.DECLARACAO__DECLARACAO, newDeclaracao, newDeclaracao));
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
      case Imperativa1Package.DECLARACAO__DEC_COMPOSTA:
        return basicSetDecComposta(null, msgs);
      case Imperativa1Package.DECLARACAO__DEC_VARIAVEL:
        return basicSetDecVariavel(null, msgs);
      case Imperativa1Package.DECLARACAO__DECLARACAO:
        return basicSetDeclaracao(null, msgs);
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
      case Imperativa1Package.DECLARACAO__DEC_COMPOSTA:
        return getDecComposta();
      case Imperativa1Package.DECLARACAO__DEC_VARIAVEL:
        return getDecVariavel();
      case Imperativa1Package.DECLARACAO__DECLARACAO:
        return getDeclaracao();
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
      case Imperativa1Package.DECLARACAO__DEC_COMPOSTA:
        setDecComposta((DeclaracaoComposta)newValue);
        return;
      case Imperativa1Package.DECLARACAO__DEC_VARIAVEL:
        setDecVariavel((DeclaracaoVariavel)newValue);
        return;
      case Imperativa1Package.DECLARACAO__DECLARACAO:
        setDeclaracao((Declaracao)newValue);
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
      case Imperativa1Package.DECLARACAO__DEC_COMPOSTA:
        setDecComposta((DeclaracaoComposta)null);
        return;
      case Imperativa1Package.DECLARACAO__DEC_VARIAVEL:
        setDecVariavel((DeclaracaoVariavel)null);
        return;
      case Imperativa1Package.DECLARACAO__DECLARACAO:
        setDeclaracao((Declaracao)null);
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
      case Imperativa1Package.DECLARACAO__DEC_COMPOSTA:
        return decComposta != null;
      case Imperativa1Package.DECLARACAO__DEC_VARIAVEL:
        return decVariavel != null;
      case Imperativa1Package.DECLARACAO__DECLARACAO:
        return declaracao != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclaracaoImpl
