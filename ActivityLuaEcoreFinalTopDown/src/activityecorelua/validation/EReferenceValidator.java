/**
 *
 * $Id$
 */
package activityecorelua.validation;

import activityecorelua.EAttribute;
import activityecorelua.EClass;
import activityecorelua.EReference;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link activityecorelua.EReference}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EReferenceValidator {
	boolean validate();

	boolean validateContainment(boolean value);
	boolean validateContainer(boolean value);
	boolean validateResolveProxies(boolean value);
	boolean validateEOpposite(EReference value);
	boolean validateEReferenceType(EClass value);
	boolean validateEKeys(EList<EAttribute> value);
}
