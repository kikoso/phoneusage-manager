package com.enrique.phoneusage;

/**
 * Created by enriquelopezmanas on 1/28/16.
 */
public class Utils {
	public static boolean convertToBoolean(String value) {
		boolean returnValue = false;
		if ("1".equalsIgnoreCase(value) || "yes".equalsIgnoreCase(value) ||
				"true".equalsIgnoreCase(value) || "on".equalsIgnoreCase(value))
			returnValue = true;
		return returnValue;
	}
}
