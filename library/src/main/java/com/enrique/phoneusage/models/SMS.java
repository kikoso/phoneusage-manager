package com.enrique.phoneusage.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class SMS {
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private int _id;
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private int thread_id;
	private int priority;
	private int pri;
	private String address;
	private String person;
	private int date;
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private int date_sent;
	private int protocol;
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private boolean read;
	private Status status;
	private MessageType messageType;
	private int type;
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private int reply_path_present;
	private String subject;
	private String body;
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private String service_center;
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private boolean locked;
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private int sub_id;
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private int phone_id;
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private int error_code;
	private String creator;
	@Getter(AccessLevel.NONE)
	@Setter(AccessLevel.NONE)
	private boolean seen;

	public void setId(int id) {
		this._id = id;
	}

	public int getId() {
		return this._id;
	}

	public int getThreadId() {
		return thread_id;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public boolean isSeen() {
		return seen;
	}

	public void setSeen(boolean seen) {
		this.seen = seen;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public void setThreadId(int thread_id) {
		this.thread_id = thread_id;
	}

	public int getDateSent() {
		return date_sent;
	}

	public void setDateSent(int date_sent) {
		this.date_sent = date_sent;
	}

	public int getReplyPathPresent() {
		return reply_path_present;
	}

	public void setReplyPathPresent(int reply_path_present) {
		this.reply_path_present = reply_path_present;
	}

	public String getServiceCenter() {
		return service_center;
	}

	public void setServiceCenter(String service_center) {
		this.service_center = service_center;
	}

	public int getSubId() {
		return sub_id;
	}

	public void setSubId(int sub_id) {
		this.sub_id = sub_id;
	}

	public int getPhoneId() {
		return phone_id;
	}

	public void setPhoneId(int phone_id) {
		this.phone_id = phone_id;
	}

	public int getErrorCode() {
		return error_code;
	}

	public void setErrorCode(int error_code) {
		this.error_code = error_code;
	}
}
