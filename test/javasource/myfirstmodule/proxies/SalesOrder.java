// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class SalesOrder
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject salesOrderMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.SalesOrder";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		orderNumber("orderNumber"),
		orderDate("orderDate"),
		totalSalesValue("totalSalesValue"),
		itemCount("itemCount"),
		region("region"),
		totalSalesValueCcy("totalSalesValueCcy"),
		SalesOrder_Employee("MyFirstModule.SalesOrder_Employee");

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

	public SalesOrder(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.SalesOrder"));
	}

	protected SalesOrder(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject salesOrderMendixObject)
	{
		if (salesOrderMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.SalesOrder", salesOrderMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.SalesOrder");

		this.salesOrderMendixObject = salesOrderMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'SalesOrder.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.SalesOrder initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.SalesOrder.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.SalesOrder initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.SalesOrder(context, mendixObject);
	}

	public static myfirstmodule.proxies.SalesOrder load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.SalesOrder.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.SalesOrder> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.SalesOrder> result = new java.util.ArrayList<myfirstmodule.proxies.SalesOrder>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.SalesOrder" + xpathConstraint))
			result.add(myfirstmodule.proxies.SalesOrder.initialize(context, obj));
		return result;
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
	 * @return value of orderNumber
	 */
	public final java.lang.Long getorderNumber()
	{
		return getorderNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of orderNumber
	 */
	public final java.lang.Long getorderNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.orderNumber.toString());
	}

	/**
	 * Set value of orderNumber
	 * @param ordernumber
	 */
	public final void setorderNumber(java.lang.Long ordernumber)
	{
		setorderNumber(getContext(), ordernumber);
	}

	/**
	 * Set value of orderNumber
	 * @param context
	 * @param ordernumber
	 */
	public final void setorderNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long ordernumber)
	{
		getMendixObject().setValue(context, MemberNames.orderNumber.toString(), ordernumber);
	}

	/**
	 * @return value of orderDate
	 */
	public final java.util.Date getorderDate()
	{
		return getorderDate(getContext());
	}

	/**
	 * @param context
	 * @return value of orderDate
	 */
	public final java.util.Date getorderDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.orderDate.toString());
	}

	/**
	 * Set value of orderDate
	 * @param orderdate
	 */
	public final void setorderDate(java.util.Date orderdate)
	{
		setorderDate(getContext(), orderdate);
	}

	/**
	 * Set value of orderDate
	 * @param context
	 * @param orderdate
	 */
	public final void setorderDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date orderdate)
	{
		getMendixObject().setValue(context, MemberNames.orderDate.toString(), orderdate);
	}

	/**
	 * @return value of totalSalesValue
	 */
	public final java.math.BigDecimal gettotalSalesValue()
	{
		return gettotalSalesValue(getContext());
	}

	/**
	 * @param context
	 * @return value of totalSalesValue
	 */
	public final java.math.BigDecimal gettotalSalesValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.totalSalesValue.toString());
	}

	/**
	 * Set value of totalSalesValue
	 * @param totalsalesvalue
	 */
	public final void settotalSalesValue(java.math.BigDecimal totalsalesvalue)
	{
		settotalSalesValue(getContext(), totalsalesvalue);
	}

	/**
	 * Set value of totalSalesValue
	 * @param context
	 * @param totalsalesvalue
	 */
	public final void settotalSalesValue(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal totalsalesvalue)
	{
		getMendixObject().setValue(context, MemberNames.totalSalesValue.toString(), totalsalesvalue);
	}

	/**
	 * @return value of itemCount
	 */
	public final java.lang.Integer getitemCount()
	{
		return getitemCount(getContext());
	}

	/**
	 * @param context
	 * @return value of itemCount
	 */
	public final java.lang.Integer getitemCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.itemCount.toString());
	}

	/**
	 * Set value of itemCount
	 * @param itemcount
	 */
	public final void setitemCount(java.lang.Integer itemcount)
	{
		setitemCount(getContext(), itemcount);
	}

	/**
	 * Set value of itemCount
	 * @param context
	 * @param itemcount
	 */
	public final void setitemCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer itemcount)
	{
		getMendixObject().setValue(context, MemberNames.itemCount.toString(), itemcount);
	}

	/**
	 * Set value of region
	 * @param region
	 */
	public final myfirstmodule.proxies.Region getregion()
	{
		return getregion(getContext());
	}

	/**
	 * @param context
	 * @return value of region
	 */
	public final myfirstmodule.proxies.Region getregion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.region.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Region.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of region
	 * @param region
	 */
	public final void setregion(myfirstmodule.proxies.Region region)
	{
		setregion(getContext(), region);
	}

	/**
	 * Set value of region
	 * @param context
	 * @param region
	 */
	public final void setregion(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Region region)
	{
		if (region != null)
			getMendixObject().setValue(context, MemberNames.region.toString(), region.toString());
		else
			getMendixObject().setValue(context, MemberNames.region.toString(), null);
	}

	/**
	 * @return value of totalSalesValueCcy
	 */
	public final java.lang.Double gettotalSalesValueCcy()
	{
		return gettotalSalesValueCcy(getContext());
	}

	/**
	 * @param context
	 * @return value of totalSalesValueCcy
	 */
	public final java.lang.Double gettotalSalesValueCcy(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.totalSalesValueCcy.toString());
	}

	/**
	 * Set value of totalSalesValueCcy
	 * @param totalsalesvalueccy
	 */
	public final void settotalSalesValueCcy(java.lang.Double totalsalesvalueccy)
	{
		settotalSalesValueCcy(getContext(), totalsalesvalueccy);
	}

	/**
	 * Set value of totalSalesValueCcy
	 * @param context
	 * @param totalsalesvalueccy
	 */
	public final void settotalSalesValueCcy(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double totalsalesvalueccy)
	{
		getMendixObject().setValue(context, MemberNames.totalSalesValueCcy.toString(), totalsalesvalueccy);
	}

	/**
	 * @return value of SalesOrder_Employee
	 */
	public final myfirstmodule.proxies.Employee getSalesOrder_Employee() throws com.mendix.core.CoreException
	{
		return getSalesOrder_Employee(getContext());
	}

	/**
	 * @param context
	 * @return value of SalesOrder_Employee
	 */
	public final myfirstmodule.proxies.Employee getSalesOrder_Employee(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Employee result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SalesOrder_Employee.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Employee.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SalesOrder_Employee
	 * @param salesorder_employee
	 */
	public final void setSalesOrder_Employee(myfirstmodule.proxies.Employee salesorder_employee)
	{
		setSalesOrder_Employee(getContext(), salesorder_employee);
	}

	/**
	 * Set value of SalesOrder_Employee
	 * @param context
	 * @param salesorder_employee
	 */
	public final void setSalesOrder_Employee(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Employee salesorder_employee)
	{
		if (salesorder_employee == null)
			getMendixObject().setValue(context, MemberNames.SalesOrder_Employee.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SalesOrder_Employee.toString(), salesorder_employee.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return salesOrderMendixObject;
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
			final myfirstmodule.proxies.SalesOrder that = (myfirstmodule.proxies.SalesOrder) obj;
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
		return "MyFirstModule.SalesOrder";
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
