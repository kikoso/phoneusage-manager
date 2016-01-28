/**
 * PhoneUsage v0.1 for Android
 *
 * @Author: Enrique López Mañas <eenriquelopez@gmail.com>
 * http://www.lopez-manas.com
 * @copyright: Enrique López Mañas
 * @license: Apache License 2.0
 */

package com.enrique.phoneusage.models;

import java.util.HashMap;
import java.util.Map;

public enum Status {
		STATUS_COMPLETE(0),
		STATUS_FAILED(64),
		STATUS_NONE(-1),
		STATUS_PENDING(32);

	public final int status;

	Status(int status) {
		this.status = status;
	}

	static Map<Integer, Status> map = new HashMap<>();

	static {
		for (Status status : Status.values()) {
			map.put(status.status, status);
		}
	}

	public static Status getByCode(int code) {
		return map.get(code);
	}
}
