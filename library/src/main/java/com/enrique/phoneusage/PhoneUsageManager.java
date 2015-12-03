/**
 * PhoneUsage v1.0 for Android
 *
 * @Author: Enrique López Mañas <eenriquelopez@gmail.com>
 * http://www.lopez-manas.com
 *
 * @copyright: Enrique López Mañas
 * @license: Apache License 2.0
 */

package com.enrique.phoneusage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

public class PhoneUsageManager {

	private Context context;

	public PhoneUsageManager(Context context) {
		this.context = context;
	}

	public void retrieveSMSInformation() {
		Cursor cursor = context.getContentResolver().query(Uri.parse("content://sms/inbox"), null, null, null, null);
		if (cursor.moveToFirst()) {
			do {

			} while (cursor.moveToNext());
//		List<SMSUsage> smsUsageList = new ArrayList<>();
		}
	}
}
