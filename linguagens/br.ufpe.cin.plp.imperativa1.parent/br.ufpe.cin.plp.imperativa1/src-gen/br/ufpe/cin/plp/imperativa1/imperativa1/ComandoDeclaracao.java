/**
 * generated by Xtext 2.9.2
 */
package br.ufpe.cin.plp.imperativa1.imperativa1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comando Declaracao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.ComandoDeclaracao#getDeclaracao <em>Declaracao</em>}</li>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.ComandoDeclaracao#getComando <em>Comando</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package#getComandoDeclaracao()
 * @model
 * @generated
 */
public interface ComandoDeclaracao extends EObject
{
  /**
   * Returns the value of the '<em><b>Declaracao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaracao</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaracao</em>' containment reference.
   * @see #setDeclaracao(Declaracao)
   * @see br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package#getComandoDeclaracao_Declaracao()
   * @model containment="true"
   * @generated
   */
  Declaracao getDeclaracao();

  /**
   * Sets the value of the '{@link br.ufpe.cin.plp.imperativa1.imperativa1.ComandoDeclaracao#getDeclaracao <em>Declaracao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaracao</em>' containment reference.
   * @see #getDeclaracao()
   * @generated
   */
  void setDeclaracao(Declaracao value);

  /**
   * Returns the value of the '<em><b>Comando</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comando</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comando</em>' containment reference.
   * @see #setComando(Comando)
   * @see br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package#getComandoDeclaracao_Comando()
   * @model containment="true"
   * @generated
   */
  Comando getComando();

  /**
   * Sets the value of the '{@link br.ufpe.cin.plp.imperativa1.imperativa1.ComandoDeclaracao#getComando <em>Comando</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comando</em>' containment reference.
   * @see #getComando()
   * @generated
   */
  void setComando(Comando value);

} // ComandoDeclaracao
