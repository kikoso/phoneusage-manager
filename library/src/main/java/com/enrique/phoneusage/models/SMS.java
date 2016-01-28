/**
 * PhoneUsage v0.1 for Android
 *
 * @Author: Enrique López Mañas <eenriquelopez@gmail.com>
 * http://www.lopez-manas.com
 * @copyright: Enrique López Mañas
 * @license: Apache License 2.0
 */

package com.enrique.phoneusage.models;

import lombok.Data;

@Data
public class SMS {
	private int id;
	private int threadId;
	private int priority;
	private int pri;
	private String address;
	private String person;
	private int date;
	private int dateSent;
	private int protocol;
	private boolean read;
	private Status status;
	private MessageType messageType;
	private int type;
	private int replyPathPresent;
	private String subject;
	private String body;
	private String serviceCenter;
	private boolean locked;
	private int subId;
	private int phoneId;
	private int errorCode;
	private String creator;
	private boolean seen;
}
