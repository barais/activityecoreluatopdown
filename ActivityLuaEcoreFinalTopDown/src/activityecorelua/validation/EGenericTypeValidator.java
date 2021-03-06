/**
 *
 * $Id$
 */
package activityecorelua.validation;

import activityecorelua.EClassifier;
import activityecorelua.EGenericType;
import activityecorelua.ETypeParameter;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link activityecorelua.EGenericType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EGenericTypeValidator {
	boolean validate();

	boolean validateEUpperBound(EGenericType value);
	boolean validateETypeArguments(EList<EGenericType> value);
	boolean validateERawType(EClassifier value);
	boolean validateELowerBound(EGenericType value);
	boolean validateETypeParameter(ETypeParameter value);
	boolean validateEClassifier(EClassifier value);
}
