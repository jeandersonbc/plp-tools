/**
 * generated by Xtext 2.9.2
 */
package br.ufpe.cin.plp.imperativa1.imperativa1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.ExpOr#getValor <em>Valor</em>}</li>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.ExpOr#getExpressao <em>Expressao</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package#getExpOr()
 * @model
 * @generated
 */
public interface ExpOr extends EObject
{
  /**
   * Returns the value of the '<em><b>Valor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valor</em>' containment reference.
   * @see #setValor(Valor)
   * @see br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package#getExpOr_Valor()
   * @model containment="true"
   * @generated
   */
  Valor getValor();

  /**
   * Sets the value of the '{@link br.ufpe.cin.plp.imperativa1.imperativa1.ExpOr#getValor <em>Valor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valor</em>' containment reference.
   * @see #getValor()
   * @generated
   */
  void setValor(Valor value);

  /**
   * Returns the value of the '<em><b>Expressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressao</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressao</em>' containment reference.
   * @see #setExpressao(Expressao)
   * @see br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package#getExpOr_Expressao()
   * @model containment="true"
   * @generated
   */
  Expressao getExpressao();

  /**
   * Sets the value of the '{@link br.ufpe.cin.plp.imperativa1.imperativa1.ExpOr#getExpressao <em>Expressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressao</em>' containment reference.
   * @see #getExpressao()
   * @generated
   */
  void setExpressao(Expressao value);

} // ExpOr
