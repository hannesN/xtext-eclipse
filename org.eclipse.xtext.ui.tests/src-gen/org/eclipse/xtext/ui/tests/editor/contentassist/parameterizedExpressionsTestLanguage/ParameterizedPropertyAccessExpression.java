/**
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameterized Property Access Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage.ParameterizedPropertyAccessExpression#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage.ParameterizedPropertyAccessExpression#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage.ParameterizedExpressionsTestLanguagePackage#getParameterizedPropertyAccessExpression()
 * @model
 * @generated
 */
public interface ParameterizedPropertyAccessExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(Expression)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage.ParameterizedExpressionsTestLanguagePackage#getParameterizedPropertyAccessExpression_Target()
   * @model containment="true"
   * @generated
   */
  Expression getTarget();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage.ParameterizedPropertyAccessExpression#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Expression value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' attribute.
   * @see #setProperty(String)
   * @see org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage.ParameterizedExpressionsTestLanguagePackage#getParameterizedPropertyAccessExpression_Property()
   * @model
   * @generated
   */
  String getProperty();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.ui.tests.editor.contentassist.parameterizedExpressionsTestLanguage.ParameterizedPropertyAccessExpression#getProperty <em>Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' attribute.
   * @see #getProperty()
   * @generated
   */
  void setProperty(String value);

} // ParameterizedPropertyAccessExpression
