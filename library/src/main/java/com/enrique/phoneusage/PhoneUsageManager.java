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

import com.enrique.phoneusage.models.Call;
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

	public List<Call> retrieveCallsInformation() {
		List<Call> callList = new ArrayList<>();
		Cursor cursor = context.getContentResolver().query(Uri.parse("content://call_log/calls"), null, null, null, null);
		if (cursor.moveToFirst()) {
			do {
				Call call = new Call();
				call.setCachedFormattedNumber(cursor.getString(cursor.getColumnIndex("cached_formatted_number")));
				call.setCachedLookupUri(cursor.getString(cursor.getColumnIndex("cached_lookup_uri")));
				call.setCachedMatchedNumber(cursor.getString(cursor.getColumnIndex("cached_matched_number")));
				call.setCachedName(cursor.getString(cursor.getColumnIndex("cached_name")));
				call.setCachedNormalizedNumber(cursor.getString(cursor.getColumnIndex("cached_normalized_number")));
				call.setCachedNumberLabel(cursor.getString(cursor.getColumnIndex("cached_number_label")));
				call.setCachedNumberType(cursor.getString(cursor.getColumnIndex("cached_number_type")));
				call.setCachedPhotoId(cursor.getString(cursor.getColumnIndex("cached_photo_id")));
				call.setCachedPhotoUri(cursor.getString(cursor.getColumnIndex("cached_photo_uri")));
				call.setContentItemType(cursor.getString(cursor.getColumnIndex("content_item_type")));
				call.setContentType(cursor.getString(cursor.getColumnIndex("content_type")));
				call.setCountryIso(cursor.getString(cursor.getColumnIndex("country_iso")));
				call.setDataUsage(cursor.getString(cursor.getColumnIndex("data_usage")));
				call.setDate(cursor.getString(cursor.getColumnIndex("date")));
				call.setDefaultSortOrder(cursor.getString(cursor.getColumnIndex("default_sort_order")));
				call.setDuration(cursor.getString(cursor.getColumnIndex("duration")));
				call.setExtraCallTypeFilter(cursor.getString(cursor.getColumnIndex("extra_call_type_filter")));
				call.setFeatures(cursor.getString(cursor.getColumnIndex("features")));
				call.setFeaturesVideo(cursor.getString(cursor.getColumnIndex("features_video")));
				call.setGeocodedLocation(cursor.getString(cursor.getColumnIndex("geocoded_location")));
				call.setIncomingType(cursor.getInt(cursor.getColumnIndex("incoming_type")));
				call.setLimitParamKey(cursor.getString(cursor.getColumnIndex("limit_param_key")));
				call.setNew(Utils.convertToBoolean(cursor.getString(cursor.getColumnIndex("new"))));
				call.setNumber(cursor.getString(cursor.getColumnIndex("number")));
				call.setNumberPresentation(cursor.getString(cursor.getColumnIndex("number_presentation")));
				call.setOffsetParamKey(cursor.getString(cursor.getColumnIndex("offset_param_key")));
				call.setOutgoingType(cursor.getInt(cursor.getColumnIndex("outgoing_type")));
				call.setPhoneAccountComponentName(cursor.getString(cursor.getColumnIndex("phone_account_component_name")));
				call.setPhoneAccountId(cursor.getString(cursor.getColumnIndex("phone_account_id")));
				call.setPresentationAllowed(cursor.getInt(cursor.getColumnIndex("presentation_allowed")));
				call.setPresentationPayphone(cursor.getInt(cursor.getColumnIndex("presentation_payphone")));
				call.setPresentationRestricted(cursor.getInt(cursor.getColumnIndex("presentation_restricted")));
				call.setPresentationUnknown(cursor.getInt(cursor.getColumnIndex("presentation_unknown")));
				call.setRead(Utils.convertToBoolean(cursor.getString(cursor.getColumnIndex("read"))));
				call.setTranscription(cursor.getString(cursor.getColumnIndex("transcription")));
				call.setType(cursor.getString(cursor.getColumnIndex("type")));
				call.setVoicemailType(cursor.getInt(cursor.getColumnIndex("voicemail_type")));
				call.setVoicemailUri(cursor.getString(cursor.getColumnIndex("voicemail_uri")));

				callList.add(call);
			} while (cursor.moveToNext());
		}
		return callList;
	}
}