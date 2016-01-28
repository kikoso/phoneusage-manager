/**
 * PhoneUsage v0.1 for Android
 *
 * @Author: Enrique López Mañas <eenriquelopez@gmail.com>
 * http://www.lopez-manas.com
 * @copyright: Enrique López Mañas
 * @license: Apache License 2.0
 */

package com.enrique.phoneusage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

import com.enrique.phoneusage.models.MessageType;
import com.enrique.phoneusage.models.SMS;
import com.enrique.phoneusage.models.Status;

import java.util.ArrayList;
import java.util.List;

public class PhoneUsageManager {

	private Context context;

	public PhoneUsageManager(Context context) {
		this.context = context;
	}

	public List<SMS> retrieveSMSInformation() {
		List<SMS> smsList = new ArrayList<>();
		Cursor cursor = context.getContentResolver().query(Uri.parse("content://sms/inbox"), null, null, null, null);
		if (cursor.moveToFirst()) {
			do {
				SMS sms = new SMS();
				sms.setPerson(cursor.getString(cursor.getColumnIndex("person")));
				sms.setId(cursor.getInt(cursor.getColumnIndex("_id")));
				sms.setPriority(cursor.getInt(cursor.getColumnIndex("priority")));
				sms.setDate(cursor.getInt(cursor.getColumnIndex("date")));
				sms.setDateSent(cursor.getInt(cursor.getColumnIndex("date_sent")));
				sms.setProtocol(cursor.getInt(cursor.getColumnIndex("protocol")));
				sms.setStatus(Status.getByCode(cursor.getInt(cursor.getColumnIndex("status"))));
				sms.setType(cursor.getInt(cursor.getColumnIndex("type")));
				sms.setReplyPathPresent(cursor.getInt(cursor.getColumnIndex("reply_path_present")));
				sms.setSubId(cursor.getInt(cursor.getColumnIndex("sub_id")));
				sms.setErrorCode(cursor.getInt(cursor.getColumnIndex("error_code")));
				sms.setPri(cursor.getInt(cursor.getColumnIndex("pri")));
				sms.setPhoneId(cursor.getInt(cursor.getColumnIndex("phone_id")));
				sms.setPerson(cursor.getString(cursor.getColumnIndex("person")));
				sms.setSubject(cursor.getString(cursor.getColumnIndex("subject")));
				sms.setBody(cursor.getString(cursor.getColumnIndex("body")));
				sms.setAddress(cursor.getString(cursor.getColumnIndex("address")));
				sms.setServiceCenter(cursor.getString(cursor.getColumnIndex("service_center")));
				sms.setCreator(cursor.getString(cursor.getColumnIndex("creator")));
				sms.setRead(Utils.convertToBoolean(cursor.getString(cursor.getColumnIndex("read"))));
				sms.setLocked(Utils.convertToBoolean(cursor.getString(cursor.getColumnIndex("locked"))));
				sms.setSeen(Utils.convertToBoolean(cursor.getString(cursor.getColumnIndex("seen"))));
				sms.setMessageType(MessageType.getByCode(cursor.getInt(cursor.getColumnIndex("type"))));
				smsList.add(sms);
			} while (cursor.moveToNext());
		}
		return smsList;
	}

	public List<Calls> retrieveCallsInformation() {
		List<SMS> smsList = new ArrayList<>();
		Cursor cursor = context.getContentResolver().query(Uri.parse("content://call_log/calls"), null, null, null, null);
		if (cursor.moveToFirst()) {
			do {
				SMS sms = new SMS();
				sms.setPerson(cursor.getString(cursor.getColumnIndex("person")));
				sms.setId(cursor.getInt(cursor.getColumnIndex("_id")));
				sms.setPriority(cursor.getInt(cursor.getColumnIndex("priority")));
				sms.setDate(cursor.getInt(cursor.getColumnIndex("date")));
				sms.setDateSent(cursor.getInt(cursor.getColumnIndex("date_sent")));
				sms.setProtocol(cursor.getInt(cursor.getColumnIndex("protocol")));
				sms.setStatus(Status.getByCode(cursor.getInt(cursor.getColumnIndex("status"))));
				sms.setType(cursor.getInt(cursor.getColumnIndex("type")));
				sms.setReplyPathPresent(cursor.getInt(cursor.getColumnIndex("reply_path_present")));
				sms.setSubId(cursor.getInt(cursor.getColumnIndex("sub_id")));
				sms.setErrorCode(cursor.getInt(cursor.getColumnIndex("error_code")));
				sms.setPri(cursor.getInt(cursor.getColumnIndex("pri")));
				sms.setPhoneId(cursor.getInt(cursor.getColumnIndex("phone_id")));
				sms.setPerson(cursor.getString(cursor.getColumnIndex("person")));
				sms.setSubject(cursor.getString(cursor.getColumnIndex("subject")));
				sms.setBody(cursor.getString(cursor.getColumnIndex("body")));
				sms.setAddress(cursor.getString(cursor.getColumnIndex("address")));
				sms.setServiceCenter(cursor.getString(cursor.getColumnIndex("service_center")));
				sms.setCreator(cursor.getString(cursor.getColumnIndex("creator")));
				sms.setRead(Utils.convertToBoolean(cursor.getString(cursor.getColumnIndex("read"))));
				sms.setLocked(Utils.convertToBoolean(cursor.getString(cursor.getColumnIndex("locked"))));
				sms.setSeen(Utils.convertToBoolean(cursor.getString(cursor.getColumnIndex("seen"))));
				sms.setMessageType(MessageType.getByCode(cursor.getInt(cursor.getColumnIndex("type"))));
				smsList.add(sms);
			} while (cursor.moveToNext());
		}
		return smsList;
	}
}