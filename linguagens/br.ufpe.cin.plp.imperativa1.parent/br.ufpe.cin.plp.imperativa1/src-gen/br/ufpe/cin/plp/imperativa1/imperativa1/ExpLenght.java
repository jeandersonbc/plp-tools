/**
 * generated by Xtext 2.9.2
 */
package br.ufpe.cin.plp.imperativa1.imperativa1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Lenght</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.plp.imperativa1.imperativa1.ExpLenght#getLengthExpressao <em>Length Expressao</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package#getExpLenght()
 * @model
 * @generated
 */
public interface ExpLenght extends EObject
{
  /**
   * Returns the value of the '<em><b>Length Expressao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length Expressao</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length Expressao</em>' containment reference.
   * @see #setLengthExpressao(Expressao)
   * @see br.ufpe.cin.plp.imperativa1.imperativa1.Imperativa1Package#getExpLenght_LengthExpressao()
   * @model containment="true"
   * @generated
   */
  Expressao getLengthExpressao();

  /**
   * Sets the value of the '{@link br.ufpe.cin.plp.imperativa1.imperativa1.ExpLenght#getLengthExpressao <em>Length Expressao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length Expressao</em>' containment reference.
   * @see #getLengthExpressao()
   * @generated
   */
  void setLengthExpressao(Expressao value);

} // ExpLenght
