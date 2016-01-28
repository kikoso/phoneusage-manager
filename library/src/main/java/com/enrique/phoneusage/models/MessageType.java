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

public enum MessageType {
	MESSAGE_TYPE_ALL(0),
	MESSAGE_TYPE_DRAFT(3),
	MESSAGE_TYPE_FAILED(5),
	MESSAGE_TYPE_INBOX(1),
	MESSAGE_TYPE_OUTBOX(4),
	MESSAGE_TYPE_QUEUED(6),
	MESSAGE_TYPE_SENT(2);

	public final int messageType;

	MessageType(int messageType) {
		this.messageType = messageType;
	}

	static Map<Integer, MessageType> map = new HashMap<>();

	static {
		for (MessageType messageType : MessageType.values()) {
			map.put(messageType.messageType, messageType);
		}
	}

	public static MessageType getByCode(int code) {
		return map.get(code);
	}
}
