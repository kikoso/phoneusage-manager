package com.enrique.phoneusage.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by enriquelopezmanas on 12/12/15.
 */
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
