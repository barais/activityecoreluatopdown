/**
 *
 * $Id$
 */
package activityecorelua.validation;

import activityecorelua.Expression;
import activityecorelua.Functioncall_Arguments;

/**
 * A sample validator interface for {@link activityecorelua.Statement_CallFunction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Statement_CallFunctionValidator {
	boolean validate();

	boolean validateObject(Expression value);
	boolean validateArguments(Functioncall_Arguments value);
}
