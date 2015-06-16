/**
 *
 * $Id$
 */
package activityecorelua.validation;

import activityecorelua.Activity;
import activityecorelua.ActivityEdge;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link activityecorelua.ActivityNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ActivityNodeValidator {
	boolean validate();

	boolean validateOutgoing(EList<ActivityEdge> value);
	boolean validateIncoming(EList<ActivityEdge> value);
	boolean validateActivity(Activity value);
	boolean validateRunning(boolean value);
}
