/**
 * PhoneUsage v0.1 for Android
 *
 * @Author: Enrique López Mañas <eenriquelopez@gmail.com>
 * http://www.lopez-manas.com
 * @copyright: Enrique López Mañas
 * @license: Apache License 2.0
 */

package com.enrique.phoneusage;

public class Utils {
	public static boolean convertToBoolean(String value) {
		boolean returnValue = false;
		if ("1".equalsIgnoreCase(value) || "yes".equalsIgnoreCase(value) ||
				"true".equalsIgnoreCase(value) || "on".equalsIgnoreCase(value))
			returnValue = true;
		return returnValue;
	}
}
