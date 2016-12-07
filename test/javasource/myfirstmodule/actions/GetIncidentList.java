// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package myfirstmodule.actions;

import java.util.Date;
import java.util.List;
import myfirstmodule.proxies.Employee;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

/**
 * Get incident list using the specified parameters
 */
public class GetIncidentList extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject __parameters;
	private myfirstmodule.proxies.TransientIncidentPivotTableParameters parameters;

	public GetIncidentList(IContext context, IMendixObject parameters)
	{
		super(context);
		this.__parameters = parameters;
	}

	@Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.parameters = __parameters == null ? null : myfirstmodule.proxies.TransientIncidentPivotTableParameters.initialize(getContext(), __parameters);

		// BEGIN USER CODE
		StringBuffer xpath = new StringBuffer("//MyFirstModule.Incident");
		Date fromDate = parameters.getfromDate();
		Date toDate = parameters.gettoDate();
		Employee employee = parameters.getTransientIncidentPivotTableParameters_Employee();
		if (fromDate != null || toDate != null || employee != null) {
			xpath.append("[");
			boolean firstConstraint = true;
			if (fromDate != null) {
				xpath.append("incidentDate >= " + fromDate.getTime());
				firstConstraint = false;
			}
			if (toDate != null) {
				if (!firstConstraint) {
					xpath.append(" and ");					
				}
				xpath.append("incidentDate <= " + toDate.getTime());
				firstConstraint = false;
			}
			if (employee != null) {
				if (!firstConstraint) {
					xpath.append(" and ");					
				}
				xpath.append("MyFirstModule.Incident_Employee = " + employee.getMendixObject().getId().toLong());
				firstConstraint = false;
			}
			xpath.append("]");
		}
		String string = xpath.toString();
		List<IMendixObject> resultList = Core.retrieveXPathQuery(getContext(), string);
		
		return resultList;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "GetIncidentList";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
