// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class TransientIncidentPivotTable
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject transientIncidentPivotTableMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.TransientIncidentPivotTable";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		incidentDate("incidentDate"),
		categoryNumber("categoryNumber"),
		categoryName("categoryName"),
		carrierNumber("carrierNumber"),
		carrierName("carrierName"),
		employeeNumber("employeeNumber"),
		employeeName("employeeName"),
		TransientIncidentPivotTable_TransientIncidentPivotTableParameters("MyFirstModule.TransientIncidentPivotTable_TransientIncidentPivotTableParameters");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public TransientIncidentPivotTable(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.TransientIncidentPivotTable"));
	}

	protected TransientIncidentPivotTable(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject transientIncidentPivotTableMendixObject)
	{
		if (transientIncidentPivotTableMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.TransientIncidentPivotTable", transientIncidentPivotTableMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.TransientIncidentPivotTable");

		this.transientIncidentPivotTableMendixObject = transientIncidentPivotTableMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TransientIncidentPivotTable.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.TransientIncidentPivotTable initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.TransientIncidentPivotTable.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.TransientIncidentPivotTable initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.TransientIncidentPivotTable(context, mendixObject);
	}

	public static myfirstmodule.proxies.TransientIncidentPivotTable load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.TransientIncidentPivotTable.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of incidentDate
	 */
	public final java.util.Date getincidentDate()
	{
		return getincidentDate(getContext());
	}

	/**
	 * @param context
	 * @return value of incidentDate
	 */
	public final java.util.Date getincidentDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.incidentDate.toString());
	}

	/**
	 * Set value of incidentDate
	 * @param incidentdate
	 */
	public final void setincidentDate(java.util.Date incidentdate)
	{
		setincidentDate(getContext(), incidentdate);
	}

	/**
	 * Set value of incidentDate
	 * @param context
	 * @param incidentdate
	 */
	public final void setincidentDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date incidentdate)
	{
		getMendixObject().setValue(context, MemberNames.incidentDate.toString(), incidentdate);
	}

	/**
	 * @return value of categoryNumber
	 */
	public final Long getcategoryNumber()
	{
		return getcategoryNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of categoryNumber
	 */
	public final Long getcategoryNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.categoryNumber.toString());
	}

	/**
	 * Set value of categoryNumber
	 * @param categorynumber
	 */
	public final void setcategoryNumber(Long categorynumber)
	{
		setcategoryNumber(getContext(), categorynumber);
	}

	/**
	 * Set value of categoryNumber
	 * @param context
	 * @param categorynumber
	 */
	public final void setcategoryNumber(com.mendix.systemwideinterfaces.core.IContext context, Long categorynumber)
	{
		getMendixObject().setValue(context, MemberNames.categoryNumber.toString(), categorynumber);
	}

	/**
	 * @return value of categoryName
	 */
	public final String getcategoryName()
	{
		return getcategoryName(getContext());
	}

	/**
	 * @param context
	 * @return value of categoryName
	 */
	public final String getcategoryName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.categoryName.toString());
	}

	/**
	 * Set value of categoryName
	 * @param categoryname
	 */
	public final void setcategoryName(String categoryname)
	{
		setcategoryName(getContext(), categoryname);
	}

	/**
	 * Set value of categoryName
	 * @param context
	 * @param categoryname
	 */
	public final void setcategoryName(com.mendix.systemwideinterfaces.core.IContext context, String categoryname)
	{
		getMendixObject().setValue(context, MemberNames.categoryName.toString(), categoryname);
	}

	/**
	 * @return value of carrierNumber
	 */
	public final Long getcarrierNumber()
	{
		return getcarrierNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of carrierNumber
	 */
	public final Long getcarrierNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.carrierNumber.toString());
	}

	/**
	 * Set value of carrierNumber
	 * @param carriernumber
	 */
	public final void setcarrierNumber(Long carriernumber)
	{
		setcarrierNumber(getContext(), carriernumber);
	}

	/**
	 * Set value of carrierNumber
	 * @param context
	 * @param carriernumber
	 */
	public final void setcarrierNumber(com.mendix.systemwideinterfaces.core.IContext context, Long carriernumber)
	{
		getMendixObject().setValue(context, MemberNames.carrierNumber.toString(), carriernumber);
	}

	/**
	 * @return value of carrierName
	 */
	public final String getcarrierName()
	{
		return getcarrierName(getContext());
	}

	/**
	 * @param context
	 * @return value of carrierName
	 */
	public final String getcarrierName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.carrierName.toString());
	}

	/**
	 * Set value of carrierName
	 * @param carriername
	 */
	public final void setcarrierName(String carriername)
	{
		setcarrierName(getContext(), carriername);
	}

	/**
	 * Set value of carrierName
	 * @param context
	 * @param carriername
	 */
	public final void setcarrierName(com.mendix.systemwideinterfaces.core.IContext context, String carriername)
	{
		getMendixObject().setValue(context, MemberNames.carrierName.toString(), carriername);
	}

	/**
	 * @return value of employeeNumber
	 */
	public final Long getemployeeNumber()
	{
		return getemployeeNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of employeeNumber
	 */
	public final Long getemployeeNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.employeeNumber.toString());
	}

	/**
	 * Set value of employeeNumber
	 * @param employeenumber
	 */
	public final void setemployeeNumber(Long employeenumber)
	{
		setemployeeNumber(getContext(), employeenumber);
	}

	/**
	 * Set value of employeeNumber
	 * @param context
	 * @param employeenumber
	 */
	public final void setemployeeNumber(com.mendix.systemwideinterfaces.core.IContext context, Long employeenumber)
	{
		getMendixObject().setValue(context, MemberNames.employeeNumber.toString(), employeenumber);
	}

	/**
	 * @return value of employeeName
	 */
	public final String getemployeeName()
	{
		return getemployeeName(getContext());
	}

	/**
	 * @param context
	 * @return value of employeeName
	 */
	public final String getemployeeName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.employeeName.toString());
	}

	/**
	 * Set value of employeeName
	 * @param employeename
	 */
	public final void setemployeeName(String employeename)
	{
		setemployeeName(getContext(), employeename);
	}

	/**
	 * Set value of employeeName
	 * @param context
	 * @param employeename
	 */
	public final void setemployeeName(com.mendix.systemwideinterfaces.core.IContext context, String employeename)
	{
		getMendixObject().setValue(context, MemberNames.employeeName.toString(), employeename);
	}

	/**
	 * @return value of TransientIncidentPivotTable_TransientIncidentPivotTableParameters
	 */
	public final myfirstmodule.proxies.TransientIncidentPivotTableParameters getTransientIncidentPivotTable_TransientIncidentPivotTableParameters() throws com.mendix.core.CoreException
	{
		return getTransientIncidentPivotTable_TransientIncidentPivotTableParameters(getContext());
	}

	/**
	 * @param context
	 * @return value of TransientIncidentPivotTable_TransientIncidentPivotTableParameters
	 */
	public final myfirstmodule.proxies.TransientIncidentPivotTableParameters getTransientIncidentPivotTable_TransientIncidentPivotTableParameters(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.TransientIncidentPivotTableParameters result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.TransientIncidentPivotTable_TransientIncidentPivotTableParameters.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.TransientIncidentPivotTableParameters.load(context, identifier);
		return result;
	}

	/**
	 * Set value of TransientIncidentPivotTable_TransientIncidentPivotTableParameters
	 * @param transientincidentpivottable_transientincidentpivottableparameters
	 */
	public final void setTransientIncidentPivotTable_TransientIncidentPivotTableParameters(myfirstmodule.proxies.TransientIncidentPivotTableParameters transientincidentpivottable_transientincidentpivottableparameters)
	{
		setTransientIncidentPivotTable_TransientIncidentPivotTableParameters(getContext(), transientincidentpivottable_transientincidentpivottableparameters);
	}

	/**
	 * Set value of TransientIncidentPivotTable_TransientIncidentPivotTableParameters
	 * @param context
	 * @param transientincidentpivottable_transientincidentpivottableparameters
	 */
	public final void setTransientIncidentPivotTable_TransientIncidentPivotTableParameters(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.TransientIncidentPivotTableParameters transientincidentpivottable_transientincidentpivottableparameters)
	{
		if (transientincidentpivottable_transientincidentpivottableparameters == null)
			getMendixObject().setValue(context, MemberNames.TransientIncidentPivotTable_TransientIncidentPivotTableParameters.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.TransientIncidentPivotTable_TransientIncidentPivotTableParameters.toString(), transientincidentpivottable_transientincidentpivottableparameters.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return transientIncidentPivotTableMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.TransientIncidentPivotTable that = (myfirstmodule.proxies.TransientIncidentPivotTable) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.TransientIncidentPivotTable";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
