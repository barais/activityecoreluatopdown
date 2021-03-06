/**
 *
 * $Id$
 */
package activityecorelua.validation;

import activityecorelua.EClass;

/**
 * A sample validator interface for {@link activityecorelua.EStructuralFeature}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EStructuralFeatureValidator {
	boolean validate();

	boolean validateChangeable(boolean value);
	boolean validateVolatile(boolean value);
	boolean validateTransient(boolean value);
	boolean validateDefaultValueLiteral(String value);
	boolean validateDefaultValue(Object value);
	boolean validateUnsettable(boolean value);
	boolean validateDerived(boolean value);
	boolean validateEContainingClass(EClass value);
}
