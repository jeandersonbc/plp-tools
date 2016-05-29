/**
 * generated by Xtext 2.9.2
 */
package br.ufpe.cin.plp.imperativa1.imperativa1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comando</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.Comando#getSequenciaComando <em>Sequencia Comando</em>}</li>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.Comando#getComandoSimples <em>Comando Simples</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package#getComando()
 * @model
 * @generated
 */
public interface Comando extends EObject
{
  /**
   * Returns the value of the '<em><b>Sequencia Comando</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequencia Comando</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequencia Comando</em>' containment reference.
   * @see #setSequenciaComando(SequenciaComando)
   * @see br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package#getComando_SequenciaComando()
   * @model containment="true"
   * @generated
   */
  SequenciaComando getSequenciaComando();

  /**
   * Sets the value of the '{@link br.ufpe.cin.plp.imperativa1.imperativa1.Comando#getSequenciaComando <em>Sequencia Comando</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sequencia Comando</em>' containment reference.
   * @see #getSequenciaComando()
   * @generated
   */
  void setSequenciaComando(SequenciaComando value);

  /**
   * Returns the value of the '<em><b>Comando Simples</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comando Simples</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comando Simples</em>' containment reference.
   * @see #setComandoSimples(ComandoSimples)
   * @see br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package#getComando_ComandoSimples()
   * @model containment="true"
   * @generated
   */
  ComandoSimples getComandoSimples();

  /**
   * Sets the value of the '{@link br.ufpe.cin.plp.imperativa1.imperativa1.Comando#getComandoSimples <em>Comando Simples</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comando Simples</em>' containment reference.
   * @see #getComandoSimples()
   * @generated
   */
  void setComandoSimples(ComandoSimples value);

} // Comando