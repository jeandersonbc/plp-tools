/**
 * generated by Xtext 2.9.2
 */
package br.ufpe.cin.plp.imperativa1.imperativa1.impl;

import br.ufpe.cin.plp.imperativa1.imperativa1.Comando;
import br.ufpe.cin.plp.imperativa1.imperativa1.ComandoSimples;
import br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package;
import br.ufpe.cin.plp.imperativa1.imperativa1.SequenciaComando;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comando</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.impl.ComandoImpl#getSequenciaComando <em>Sequencia Comando</em>}</li>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.impl.ComandoImpl#getComandoSimples <em>Comando Simples</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComandoImpl extends MinimalEObjectImpl.Container implements Comando
{
  /**
   * The cached value of the '{@link #getSequenciaComando() <em>Sequencia Comando</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequenciaComando()
   * @generated
   * @ordered
   */
  protected SequenciaComando sequenciaComando;

  /**
   * The cached value of the '{@link #getComandoSimples() <em>Comando Simples</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComandoSimples()
   * @generated
   * @ordered
   */
  protected ComandoSimples comandoSimples;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComandoImpl()
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
    return Imperativa1Package.Literals.COMANDO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequenciaComando getSequenciaComando()
  {
    return sequenciaComando;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSequenciaComando(SequenciaComando newSequenciaComando, NotificationChain msgs)
  {
    SequenciaComando oldSequenciaComando = sequenciaComando;
    sequenciaComando = newSequenciaComando;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Imperativa1Package.COMANDO__SEQUENCIA_COMANDO, oldSequenciaComando, newSequenciaComando);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSequenciaComando(SequenciaComando newSequenciaComando)
  {
    if (newSequenciaComando != sequenciaComando)
    {
      NotificationChain msgs = null;
      if (sequenciaComando != null)
        msgs = ((InternalEObject)sequenciaComando).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.COMANDO__SEQUENCIA_COMANDO, null, msgs);
      if (newSequenciaComando != null)
        msgs = ((InternalEObject)newSequenciaComando).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.COMANDO__SEQUENCIA_COMANDO, null, msgs);
      msgs = basicSetSequenciaComando(newSequenciaComando, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Imperativa1Package.COMANDO__SEQUENCIA_COMANDO, newSequenciaComando, newSequenciaComando));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComandoSimples getComandoSimples()
  {
    return comandoSimples;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComandoSimples(ComandoSimples newComandoSimples, NotificationChain msgs)
  {
    ComandoSimples oldComandoSimples = comandoSimples;
    comandoSimples = newComandoSimples;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Imperativa1Package.COMANDO__COMANDO_SIMPLES, oldComandoSimples, newComandoSimples);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComandoSimples(ComandoSimples newComandoSimples)
  {
    if (newComandoSimples != comandoSimples)
    {
      NotificationChain msgs = null;
      if (comandoSimples != null)
        msgs = ((InternalEObject)comandoSimples).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.COMANDO__COMANDO_SIMPLES, null, msgs);
      if (newComandoSimples != null)
        msgs = ((InternalEObject)newComandoSimples).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Imperativa1Package.COMANDO__COMANDO_SIMPLES, null, msgs);
      msgs = basicSetComandoSimples(newComandoSimples, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Imperativa1Package.COMANDO__COMANDO_SIMPLES, newComandoSimples, newComandoSimples));
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
      case Imperativa1Package.COMANDO__SEQUENCIA_COMANDO:
        return basicSetSequenciaComando(null, msgs);
      case Imperativa1Package.COMANDO__COMANDO_SIMPLES:
        return basicSetComandoSimples(null, msgs);
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
      case Imperativa1Package.COMANDO__SEQUENCIA_COMANDO:
        return getSequenciaComando();
      case Imperativa1Package.COMANDO__COMANDO_SIMPLES:
        return getComandoSimples();
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
      case Imperativa1Package.COMANDO__SEQUENCIA_COMANDO:
        setSequenciaComando((SequenciaComando)newValue);
        return;
      case Imperativa1Package.COMANDO__COMANDO_SIMPLES:
        setComandoSimples((ComandoSimples)newValue);
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
      case Imperativa1Package.COMANDO__SEQUENCIA_COMANDO:
        setSequenciaComando((SequenciaComando)null);
        return;
      case Imperativa1Package.COMANDO__COMANDO_SIMPLES:
        setComandoSimples((ComandoSimples)null);
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
      case Imperativa1Package.COMANDO__SEQUENCIA_COMANDO:
        return sequenciaComando != null;
      case Imperativa1Package.COMANDO__COMANDO_SIMPLES:
        return comandoSimples != null;
    }
    return super.eIsSet(featureID);
  }

} //ComandoImpl