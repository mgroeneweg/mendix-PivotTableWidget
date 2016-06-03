// This file was generated by Mendix Modeler 6.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package appcloudservices.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the AppCloudServices module

	/**
	* This is the password which is used to communicate with the Mendix AppCloud Services. This password will be set automatically on deployment in the Mendix Cloud. 
	*/
	public static String getEnvironmentPassword()
	{
		return (String)Core.getConfiguration().getConstantValue("AppCloudServices.EnvironmentPassword");
	}

	/**
	* This is the environment UUID which is used to communicate with the Mendix AppCloud Services to identify this application. This UUID will be set automatically on deployment in the Mendix Cloud. 
	*/
	public static String getEnvironmentUUID()
	{
		return (String)Core.getConfiguration().getConstantValue("AppCloudServices.EnvironmentUUID");
	}

	public static String getInviteAPI_Location()
	{
		return (String)Core.getConfiguration().getConstantValue("AppCloudServices.InviteAPI_Location");
	}

	/**
	* This constant indicates whether Single Sign On through MxID will be performend whenever a user tries to access this app. This constant defaults to 'false' for local deployments and will be set to 'true' automatically upon deployment in the Mendix AppCloud. 
	* 
	* If enabled, the Single Sign On process can be initiated by navigating to "<App URL>/openid/login"
	*/
	public static boolean getOpenIdEnabled()
	{
		return (Boolean)Core.getConfiguration().getConstantValue("AppCloudServices.OpenIdEnabled");
	}

	/**
	* This constant defines the location of the MxID provider in the AppCloud. This constant will be set by the Mendix AppCloud upon deployment.
	*/
	public static String getOpenIdProvider()
	{
		return (String)Core.getConfiguration().getConstantValue("AppCloudServices.OpenIdProvider");
	}

	/**
	* This constant defines the location of the Permissions API provider in the AppCloud. This constant will be set by the Mendix AppCloud upon deployment.
	*/
	public static String getPermissionsAPI_Location()
	{
		return (String)Core.getConfiguration().getConstantValue("AppCloudServices.PermissionsAPI_Location");
	}

	public static String getProfileServiceLocation()
	{
		return (String)Core.getConfiguration().getConstantValue("AppCloudServices.ProfileServiceLocation");
	}
}