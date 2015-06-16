/**
 *
 * $Id$
 */
package activityecorelua.validation;

import activityecorelua.Expression;

/**
 * A sample validator interface for {@link activityecorelua.Expression_Multiplication}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Expression_MultiplicationValidator {
	boolean validate();

	boolean validateLeft(Expression value);
	boolean validateRight(Expression value);
}
